/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.unit.army;

import model.gui.main.Cell;

/**
 *
 * @author 1
 */
public interface WorkerInterface {
  
   int build(Cell cell);
   int takefood();
   int takewater();
   int findwork();
   int takemoney();
   int takeiron();
   int takegold();
   int takewood();
   int takerock();
   int quit();
   int becomeacriminal();
   int escapefromcountrie();

    
}
