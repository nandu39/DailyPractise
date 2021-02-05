package sravanjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FinalClas{
    final int speedlimit=90;//final variable
    void run(){
//        speedlimit=400; // final variable cant be changed
        System.out.println(speedlimit);
    }
    public static void main(String args[]){
        FinalClas obj=new  FinalClas();
        obj.run();
    }
}