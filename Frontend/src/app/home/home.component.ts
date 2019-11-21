import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ActivatedRoute} from "@angular/router";
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {Inject} from '@angular/core';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

data:any={}


constructor(private router:Router,private route:ActivatedRoute , public dialog: MatDialog) { }
       ngOnInit() {

        this.route.params.subscribe(prams=>{
                   this.data = prams
                   console.log(prams)
                 })
       }

      openemployee_add(){
       this.router.navigate(['employee-add',{first:this.data.first}]);
       console.log(this.data);
    }

}
