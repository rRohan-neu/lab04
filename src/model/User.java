/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Rohan
 */
public class User {
    // data memebers
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String age;
        private String hobbies;
        private ImageIcon photo;
       private String dateOfBirth;
        
        
    //methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
        
     public ImageIcon getPhoto() {
        return photo;
    }
    
    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
      

// Add getter and setter
public String getDateOfBirth() {
    return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

// Update toString() to include date
@Override
public String toString() {
    return "User Profile:\n" +
           "Name: " + firstName + " " + lastName + "\n" +
           "Gender: " + gender + "\n" +
           "Age: " + age + "\n" +
           "Date of Birth: " + dateOfBirth + "\n" +
           "Email: " + email + "\n" +
           "Hobbies: " + hobbies;
}
  
}
