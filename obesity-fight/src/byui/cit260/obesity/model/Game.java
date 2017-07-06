/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;
import byui.cit260.obesity.control.GameControl;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author wdc
 */
public class Game implements Serializable{
    
   private int noPeople;
   private double totalTime;
   private Player player;
   private Map map;
   private Body body;
   public InventoryItem[] inventory;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
   
 
    public Game() {
    }
   
   

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.noPeople;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", totalTime=" + totalTime + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.noPeople != other.noPeople) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   

    private static class Body {

        public Body() {
        }
    }

    private static class InventoryItem {

        public InventoryItem() {
        }
    }

    
    }
   
   
    

