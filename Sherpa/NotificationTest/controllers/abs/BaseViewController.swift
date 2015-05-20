//
//  BaseViewController.swift
//  NotificationTest
//
//  Created by Dmitry on 5/18/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class BaseViewController:UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad();
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning();
    }
    
    func showDialog(title: String, message:String, buttonTitle:String){
        let alert = UIAlertView();
        alert.title = title;
        alert.message = message;
        alert.addButtonWithTitle(buttonTitle);
        alert.show();
    }
    
    func showAlertDialog (message:String){
        showDialog("Alert", message: message, buttonTitle: "Ok");
    }
    
    func navigateBySegue (name:String){
        self.performSegueWithIdentifier(name, sender: self);
    }
    
    func navigateByControllerIdentifier(identifier:String){
        var aYourViewController:UIViewController! = self.storyboard?.instantiateViewControllerWithIdentifier(identifier) as! UIViewController;
        self.navigationController?.pushViewController(aYourViewController, animated: false);
    }
    
    func startActionAfterDelay(delay:Double, selectorID:String){
        NSTimer.scheduledTimerWithTimeInterval(delay, target: self, selector: Selector(selectorID), userInfo: nil, repeats: false);
    }
    
}
