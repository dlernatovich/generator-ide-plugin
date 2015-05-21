//
//  BadgeCollectionCell.swift
//  Sherpa
//
//  Created by Dmitry on 5/21/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class BadgeCollectionCell:BaseCollectionViewCell {
    
    @IBOutlet var accesBadgeText: UILabel!
    var text:String!;
    
    override func onCreate() {
        
    }
    
    override func getHeigh() -> Int {
        return 90;
    }
    
    func setupData(text:String) -> BadgeCollectionCell {
        self.text = text;
        return self;
    }
    
}
