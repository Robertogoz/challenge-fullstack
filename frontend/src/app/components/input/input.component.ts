import { Component, OnInit } from '@angular/core';
import { InputService } from 'src/app/services/input.service';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css'],
})
export class InputComponent implements OnInit {
  input: string = '';
  coordinates: string = '';
  error: string = '';

  constructor(private inputService: InputService) {}

  ngOnInit(): void {}

  getCoordinates(): void {
    this.inputService.getAll(this.input).subscribe(
      (coordinates) => {
        this.coordinates = coordinates;
        this.error = '';
      },
      (err) => (this.error = err.error)
    );
  }
}
