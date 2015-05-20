//
//  AnimationViewController.swift
//  Sherpa
//
//  Created by Dmitry on 5/20/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class AnimationViewController: BaseViewController {
    
    let kAnimationDuration:Double! = 2;
    
    //Constraints
    @IBOutlet var logoBottomConstraint: NSLayoutConstraint!
    @IBOutlet var topGlobeConstraint: NSLayoutConstraint!
    @IBOutlet var bottomGlobeConstraint: NSLayoutConstraint!
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad();
    }
    
    override func viewDidAppear(animated: Bool) {
        super.viewDidAppear(animated);
        onStartAnimation();
        
    }
    
    func onStartAnimation(){
        self.view.layoutIfNeeded();
        UIView.animateWithDuration(kAnimationDuration, animations: { () -> Void in
            self.logoBottomConstraint.constant = 200;
            self.topGlobeConstraint.constant = 400;
            self.bottomGlobeConstraint.constant = -400;
            self.view.layoutIfNeeded();
            }) { (_) -> Void in
                self.onNavigateToLogin();
        };
        
    }
    
    /**
    * Method which provide the navigation to the login screen after some actions
    */
    func onNavigateToLogin() {
        navigateByControllerIdentifier(ControllerConstants.kLoginScreen);
    }
    
    
}
