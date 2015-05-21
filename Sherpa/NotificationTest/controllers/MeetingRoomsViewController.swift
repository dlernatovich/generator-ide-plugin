//
//  MeetingRoomsViewController.swift
//  Sherpa
//
//  Created by Dmitry on 5/21/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class MeetingRoomsViewController:BaseViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad();
        enableNavigationMenuRecognizer();
    }
    
    @IBAction func onMenuOpenPressed(sender: UIButton) {
        onOpenNavigationMenu();
    }

    
}
