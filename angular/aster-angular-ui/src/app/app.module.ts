import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './components/products/products.component';
import { UsersComponent } from './components/users/users.component';
import { UserListComponent } from './components/user-list/user-list.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {UserService} from "./service/user.service";

const components = [
  AppComponent,
  ProductsComponent,
  UsersComponent,
  UserListComponent,
  UserFormComponent
];

const modules = [
  BrowserModule,
  AppRoutingModule,
  FormsModule,
  HttpClientModule
]

@NgModule({
  declarations: [
    ...components
  ],
  imports: [
    ...modules
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
