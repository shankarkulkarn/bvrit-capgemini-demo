import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService implements CanActivate {
  canActivate(route: ActivatedRouteSnapshot) : boolean  {
          let flag = false ;

          let user = sessionStorage.getItem("user");
          if( user )
          {
              flag=true;
          }
          return flag ;
  }

  constructor() { }


}
