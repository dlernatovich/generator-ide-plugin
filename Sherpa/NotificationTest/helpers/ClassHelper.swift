//
//  ClassHelper.swift
//  Sherpa
//
//  Created by Dmitry on 5/21/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class ClassHelper: NSObject {
    
    static func registerCollectionCellForClass(collectionView:UICollectionView, aClass:AnyClass){
        var className = NSStringFromClass(aClass).componentsSeparatedByString(".").last!;
        collectionView.registerClass(aClass, forCellWithReuseIdentifier: className);
        collectionView.registerNib(UINib(nibName: className, bundle: nil), forCellWithReuseIdentifier: className);
    }
    
    static func getClassNameFromObject(classObject:AnyObject) -> String {
        var className:String = NSStringFromClass(classObject.classForCoder).componentsSeparatedByString(".").last!
        return className;
    }
    
    static func getClassNameFromClass(classObject:AnyClass) -> String {
        var className:String = NSStringFromClass(classObject).componentsSeparatedByString(".").last!
        return className;
    }
   
}
