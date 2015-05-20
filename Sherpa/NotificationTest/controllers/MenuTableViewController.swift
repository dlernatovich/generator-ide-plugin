//
//  MenuTableViewController.swift
//  Sherpa
//
//  Created by Dmitry on 5/20/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class MenuTableViewController:BaseTableViewController, UITableViewDelegate {
    
    let kTableIdentifier = ["Details","Home","MyPage","MettingRooms","LocalInformation","Help","SignOut"];
    
    override func viewDidLoad() {
        super.viewDidLoad();
        tableView.delegate = self;
        tableView.tableFooterView = UITableView(frame: CGRectZero);
    }
    
    override func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return kTableIdentifier.count;
    }
    
    override func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        var cell = tableView.dequeueReusableCellWithIdentifier(kTableIdentifier[indexPath.row], forIndexPath: indexPath) as! UITableViewCell;
        cell.selectionStyle = UITableViewCellSelectionStyle.None;
        cell.layoutMargins = UIEdgeInsets(top: 0, left: 0, bottom: 0, right: 0);
        return cell;
    }
    
    override func tableView(tableView: UITableView, heightForRowAtIndexPath indexPath: NSIndexPath) -> CGFloat {
        if(indexPath.row == 0){
            return 100;
        }
        return 50;
    }
    
}
