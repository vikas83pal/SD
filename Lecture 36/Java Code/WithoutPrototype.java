// Simple NPC class — no Prototype
class NPC {
   public String name;
   public int health;
   public int attack;
   public int defense;
   
   // "Heavy" constructor: every field must be provided
   public NPC(String name, int health, int attack, int defense) {
       // call database
       // complex calc
       this.name = name;
       this.health = health;
       this.attack = attack;
       this.defense = defense;
       System.out.println("Creating NPC '" + name + "' [HP:" + health + ", ATK:" 
            + attack + ", DEF:" + defense + "]");
   }
   
   public void describe() {
       System.out.println("  NPC: " + name + " | HP=" + health + " ATK=" + attack
            + " DEF=" + defense);
   }
}

public class WithoutPrototype {
   public static void main(String[] args) {
       // Base Alien
       NPC alien = new NPC("Alien", 30, 5, 2);
       alien.describe();
       
       // Powerful Alien — must re-pass all stats, easy to make mistakes
       NPC alien2 = new NPC("Powerful Alien", 30, 5, 5);
       alien2.describe();
       
       // If you want 100 aliens, you'd repeat this 100 times…
   }
}