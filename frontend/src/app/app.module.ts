import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { InputComponent } from './components/input/input.component';
import { TerrainComponent } from './components/terrain/terrain.component';
import { RobotComponent } from './components/robot/robot.component';

@NgModule({
  declarations: [AppComponent, InputComponent, TerrainComponent, RobotComponent],
  imports: [BrowserModule, FormsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
