package com.sarthak.misal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Long phone;
    private String email;
    private byte age;
    // public void setName(String name){
    //     this.name=name;
    // }
    // public void setEmail(String email){
    //     this.email=email;
    // }
    // public String getName(){
    //     return this.name;
    // }
    // public String getEmail(){
    //     return this.email;
    // }
}