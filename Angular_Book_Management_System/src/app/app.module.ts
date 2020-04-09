import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {  FormsModule }  from '@angular/forms';
import { HttpClientModule }  from '@angular/common/http';
import { BvritDirective } from './bvrit.directive';
import { AddbookComponent } from './addbook/addbook.component';
import { ViewbookComponent } from './viewbook/viewbook.component';
import { LoginComponent } from './login/login.component';
import { AuthorComponent } from './author/author.component';
@NgModule({
  declarations: [
    AppComponent,
    BvritDirective,
    AddbookComponent,
    ViewbookComponent,
    LoginComponent,
    AuthorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
