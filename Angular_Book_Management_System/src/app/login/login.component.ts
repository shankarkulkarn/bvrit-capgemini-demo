import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user : string ;
  pass : string ;
  constructor() { }

  ngOnInit(): void {
  }

  validate()
  {

    if(this.user=="capgemini")
    {
        alert(' Login success ');
        sessionStorage.setItem("user",this.user);
    }
    else
   {
    alert('Login failed ');
   }
  }

}
