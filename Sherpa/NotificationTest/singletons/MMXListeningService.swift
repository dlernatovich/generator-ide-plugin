//
//  MMXBridge.swift
//  Sherpa
//
//  Created by Dmitry on 5/21/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class MMXListeningService: NSObject {
    
    static var instance:MMXListeningService! = MMXListeningService();
    
    override init() {
        super.init();
        onCreate();
    }
    
    private func onCreate(){
        println("On create singleton");
    }
    
}
