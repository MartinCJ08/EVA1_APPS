//
//  ViewController.swift
//  EVA1_8_IOSe
//
//  Created by invitado on 2/8/19.
//  Copyright © 2019 invitado. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var lblMensaje: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        lblMensaje.text = "Hello from code"
    }

    @IBAction func onClick(_ sender: Any) {
        lblMensaje.text = "Evento desde el botón"
    }
    
}

