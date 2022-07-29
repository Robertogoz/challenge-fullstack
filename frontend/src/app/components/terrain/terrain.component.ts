import { Component, OnInit } from '@angular/core';

import { InputService } from 'src/app/services/input.service';
import { Coords } from 'src/app/services/input.service';

@Component({
  selector: 'app-terrain',
  templateUrl: './terrain.component.html',
  styleUrls: ['./terrain.component.css'],
})
export class TerrainComponent implements OnInit {
  constructor(private inputService: InputService) {}

  ngOnInit(): void {}

  coords: Coords = this.inputService.coords;
}
