import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddbookComponent } from './addbook/addbook.component';
import { ViewbookComponent } from './viewbook/viewbook.component';
import { LoginComponent } from './login/login.component';
import { AuthguardService } from './authguard.service';
import { AuthorComponent } from './author/author.component';


const routes: Routes = [
    {
     path : 'add',
     component : AddbookComponent,
     canActivate : [AuthguardService]
    }
    ,
    {
      path : 'view',
      component : ViewbookComponent,
      canActivate : [AuthguardService]
     },
     {
      path : 'login',
      component : LoginComponent
     },
     {
      path : 'author/:aname',
      component : AuthorComponent
     },
     {
       path : '',
       redirectTo : '/view',
       pathMatch : 'full'
     }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
