//
//  HomeViewController.swift
//  NotificationTest
//
//  Created by Dmitry on 5/18/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class HomeViewController:BaseViewController, UICollectionViewDelegate, UICollectionViewDataSource {
    
    
    @IBOutlet var currentCollectionView: UICollectionView!
    
    let dataCells:[AnyClass]! = [
        BadgeCollectionCell.classForCoder(),
        SetUpTravelCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
        BadgeCollectionCell.classForCoder(),
    ];
    
    override func viewDidLoad() {
        super.viewDidLoad();
        enableNavigationMenuRecognizer();
        
        ClassHelper.registerCollectionCellForClass(currentCollectionView, aClass: BadgeCollectionCell.classForCoder());
        ClassHelper.registerCollectionCellForClass(currentCollectionView, aClass: SetUpTravelCollectionCell.classForCoder());
    }
    
    @IBAction func onMenuOpenPressed(sender: UIButton) {
        onOpenNavigationMenu();
    }
    
    //==================COLLECTION VIEW DELEGATE=================
    func numberOfSectionsInCollectionView(collectionView: UICollectionView) -> Int {
        return 1;
    }
    
    func collectionView(collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return dataCells.count;
    }
    
    func collectionView(collectionView: UICollectionView, cellForItemAtIndexPath indexPath: NSIndexPath) -> UICollectionViewCell {
        var cell:UICollectionViewCell! = collectionView.dequeueReusableCellWithReuseIdentifier(ClassHelper.getClassNameFromClass(dataCells[indexPath.row]), forIndexPath: indexPath) as! UICollectionViewCell;

        return cell;
    }
    
    func collectionView(collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, sizeForItemAtIndexPath indexPath: NSIndexPath) -> CGSize{
        return CGRectMake(0, 0, self.view.frame.width, 90).size;
    }
    
}
