package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee

public class Intern extends StaffEmployee
{
    private String eName;
    private String eAddress;
    private String ePhone;
    //-----------------------------------------------------------------
    Intern(){
        this.eName = "";
        this.eAddress = "";
        this.ePhone ="";
    }  
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone){
    
        this.eName=eName;
        this.eAddress=eAddress;
        this.ePhone=ePhone;
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    public double pay()
    {
      return 0.0;
    }
}
