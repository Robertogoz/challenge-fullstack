import { Component, Input, OnInit } from '@angular/core';
import { Coords } from 'src/app/services/input.service';

@Component({
  selector: 'app-robot',
  templateUrl: './robot.component.html',
  styleUrls: ['./robot.component.css'],
})
export class RobotComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  @Input() robotCoords: Coords | undefined;
}
