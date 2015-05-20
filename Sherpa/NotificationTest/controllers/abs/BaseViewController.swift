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
    
    func setNavigationBarImage(imageName:String){
        self.navigationController?.navigationBar.setBackgroundImage(UIImage(named: imageName), forBarMetrics: UIBarMetrics.Default);
    }
    
    func setNavigationBarHeigh(heigh:CGFloat){
        var oldFrame:CGRect! = self.navigationController?.navigationBar.frame as CGRect!;
        self.navigationController?.navigationBar.frame = CGRectMake(0, 0, oldFrame.width, heigh);
        
    }
    
    
    func enableNavigationMenuRecognizer(){
        if((self.revealViewController()) != nil){
            self.view.addGestureRecognizer(self.revealViewController().panGestureRecognizer());
        }
    }
    
    func onOpenNavigationMenu(){
        if((self.revealViewController()) != nil){
            self.revealViewController().revealToggleAnimated(true);
        }
    }
    
    override func prefersStatusBarHidden() -> Bool {
        return true;
    }
    
}
