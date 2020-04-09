import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[bvrit]'
})
export class BvritDirective {

  constructor(private ref : ElementRef) {
     ref.nativeElement.style.backgroundColor='red';
  }

  @HostListener('mouseenter')
  onmouseenter()
  {
    this.ref.nativeElement.style.backgroundColor='blue';
  }
  @HostListener('mouseout')
  onmouseout()
  {
    this.ref.nativeElement.style.backgroundColor='yellow';
  }

}
