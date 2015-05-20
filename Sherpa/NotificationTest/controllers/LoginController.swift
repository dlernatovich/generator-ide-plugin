//
//  LoginController.swift
//  NotificationTest
//
//  Created by Dmitry on 5/18/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class LoginController:BaseViewController{
    
    
    @IBOutlet var userEditText: UITextField!
    @IBOutlet var passwordEditText: UITextField!
    
    
    let userName:String! = "testuser";
    let userPassword:String! = "testuser";
    
    override func viewDidLoad() {
        super.viewDidLoad();
        userEditText.text = userName;
        passwordEditText.text = userPassword;
    }
    
   
    @IBAction func onLoginButtonPressed(sender: UIButton) {
        self.view.endEditing(true);
        if(userEditText.text != userName){
            showAlertDialog("User name is incorrect");
            return;
        }
        
        if(passwordEditText.text != userPassword){
            showAlertDialog("User password is incorrect");
            return;
        }
        
        navigateBySegue(NavigationConstants.kNavigationHome);
    }
    
    func navigateToMain(){
        navigateByControllerIdentifier(ControllerConstants.kHomeScreen);
    }
}
