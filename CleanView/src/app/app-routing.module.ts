import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DoctorPageComponent } from './components/doctor-page/doctor-page.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { ResultsListComponent } from './components/results-list/results-list.component';

const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: '/results-list', component: ResultsListComponent},
  {path: '/doctor-page', component: DoctorPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
