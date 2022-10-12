import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatIconModule } from '@angular/material/icon'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
import { ResultsListComponent } from './components/results-list/results-list.component';
import { DoctorPageComponent } from './components/doctor-page/doctor-page.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    ToolbarComponent,
    ResultsListComponent,
    DoctorPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
