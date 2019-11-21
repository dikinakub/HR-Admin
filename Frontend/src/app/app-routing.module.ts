import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { HomeComponent } from './home/home.component';



    const routes: Routes = [
       { path: '', redirectTo: '/home', pathMatch: 'full' },
       { path: 'header', component: HeaderComponent },
       { path: 'employee-add', component: EmployeeAddComponent },
       { path: 'home', component: HomeComponent },
    ];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }



