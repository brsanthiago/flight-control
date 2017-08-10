import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MODULE_COMPONENTS, MODULE_ROUTES } from './home-routes';
import { SearchFilterPipe } from './../shared/search-filter.pipe';
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(MODULE_ROUTES)
  ],
  declarations: [MODULE_COMPONENTS, SearchFilterPipe]
})
export class HomeModule { }
