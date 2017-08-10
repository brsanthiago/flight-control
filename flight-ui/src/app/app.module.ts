import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';

import { AppComponent } from './app.component';

import { MaterializeModule } from 'angular2-materialize';

import { HomeModule } from './pages/home/home.module';
import { HomeComponent } from './pages/home/home.component';
import { NavbarModule } from './pages/navbar/navbar.module';
import { FlightService } from './pages/shared/flight.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([]),
    MaterializeModule,
    HomeModule,
    NavbarModule
  ],
  providers: [FlightService],
  bootstrap: [AppComponent]
})
export class AppModule { }
