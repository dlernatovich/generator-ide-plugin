//
//  BaseCollectionViewCell.swift
//  Sherpa
//
//  Created by Dmitry on 5/21/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import Foundation

class BaseCollectionViewCell: UICollectionViewCell {
    
    required init(coder aDecoder: NSCoder) {
        super.init(coder: aDecoder);
    }
    
    override init(frame: CGRect) {
        super.init(frame: frame);
    }
    
    override func awakeFromNib() {
        super.awakeFromNib();
        self.onCreate();
    }
    
    func onCreate(){
        NSException(name:"Method override exception", reason:"BaseCollectionViewCell()->func onCreate() should be overriden", userInfo:nil).raise()
    }
    
    func getHeigh() -> Int {
        NSException(name:"Method override exception", reason:"BaseCollectionViewCell()->func getHeigh() -> Int should be overriden", userInfo:nil).raise()
        return 0;
    }
    
}