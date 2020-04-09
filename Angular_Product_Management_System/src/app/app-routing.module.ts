import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewproductComponent } from './viewproduct/viewproduct.component';


const routes: Routes = [
  {
    path : 'view',
    component : ViewproductComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
