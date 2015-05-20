//
//  ViewController.swift
//  NotificationTest
//
//  Created by Dmitry on 5/15/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class ViewController: BaseViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad();
    }
    
    override func viewDidAppear(animated: Bool) {
        super.viewDidAppear(animated);
        startActionAfterDelay(0.5, selectorID: "onNavigateToLogin");
    }
    
    /**
    * Method which provide the navigation to the login screen after some actions
    */
    func onNavigateToLogin() {
        navigateByControllerIdentifier(ControllerConstants.kAnimationScreen);
    }
    
    
}

