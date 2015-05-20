//
//  HomeViewController.swift
//  NotificationTest
//
//  Created by Dmitry on 5/18/15.
//  Copyright (c) 2015 magnet. All rights reserved.
//

import UIKit

class HomeViewController:BaseViewController, MMXClientDelegate {
    
    
    @IBOutlet var menuButton: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad();
        enableNavigationMenuRecognizer();
    }
    
    @IBAction func onMenuOpenPressed(sender: UIButton) {
        onOpenNavigationMenu();
    }
    
//    override func viewWillAppear(animated: Bool) {
//        super.viewWillAppear(animated);
//        MMXClient.sharedClient().delegate = self;
//        connectToMMX();
//    }
//    
//    
//    func client(client: MMXClient!, didReceiveConnectionStatusChange connectionStatus: MMXConnectionStatus, error: NSError!) {
//        if(connectionStatus == MMXConnectionStatus.Disconnected){
//            showAlertDialog("MMX Disconected");
//        }else if(connectionStatus == MMXConnectionStatus.Connected){
//            showAlertDialog("MMXConnected");
//        }else{
//            showAlertDialog("Connection status: \(connectionStatus)");
//        }
//    }
//    
//    func client(client: MMXClient!, didReceivePubSubMessage message: MMXPubSubMessage!) {
//        showAlertDialog("Receiving message: \(message)");
//    }
//    
//    func createMMXConfiguration(){
//        var mmxConfiguration:MMXConfiguration! = MMXConfiguration(name: "default");
//        MMXClient.sharedClient().configuration = mmxConfiguration;
//        MMXLogger.sharedLogger().startLogging();
//        MMXLogger.sharedLogger().level = MMXLoggerLevel.Verbose;
//        MMXClient.sharedClient().shouldAutoCreateUser = true;
//    }
//    
//    func connectToMMX(){
//        //Create connection
//        MMXClient.sharedClient().configuration.credential = NSURLCredential(user: "tests", password: "tests", persistence: NSURLCredentialPersistence.None);
//        MMXClient.sharedClient().connectWithCredentials();
//    }
//    
//    func client(client: MMXClient!, didReceiveUserAutoRegistrationResult success: Bool, error: NSError!) {
//        println("Registration result: \(success) with error: \(error)");
//    }
    
}
