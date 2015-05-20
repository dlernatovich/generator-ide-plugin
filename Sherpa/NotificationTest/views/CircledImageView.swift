//
//  DetailsCellView.swift
//  Sherpa
//
//  Created by Dmitry on 5/20/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class CircledImageView:UIImageView {
    
    override func awakeFromNib() {
        self.layer.cornerRadius = self.frame.size.width / 2;
        self.layer.masksToBounds = true;
    }
    
}
