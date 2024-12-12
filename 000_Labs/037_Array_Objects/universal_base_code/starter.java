/*
 *	Author:  
 *  Date: 
*/
import pkg.*;
import java.util.*;

class Wizard {
    String name;
    public int hp;
    int attack;

    public Wizard() {
        name = "Bob";
        hp = 10;
        attack = (int)(Math.random() * 3) + 1;
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int a) {
        hp = a;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void attack(Warrior target) {
        target.setHealth(target.getHealth() - (int)(Math.random() * 3) + 1);
    }
}

class Warrior {
    String name;
    public int hp;
    int attack;

    public Warrior() {
        name = "Joe";
        hp = 14;
        attack = (int)(Math.random() * 3) + 1;
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int a) {
        hp = a;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void attack(Wizard target) {
        target.setHealth(target.getHealth() - (int)(Math.random() * 3) + 1);
    }
}

class Starter {
    public static void main(String args[]) {
        Wizard[] wizardArmy = new Wizard[100];
        Warrior[] warriorArmy = new Warrior[100];
        for (int c = 0; c < wizardArmy.length; c++) {
            wizardArmy[c] = new Wizard();
            warriorArmy[c] = new Warrior();
        }

        int numWizard = 0;
        int numWarrior = 0;
        int wizardLeft = wizardArmy.length;
        int warriorLeft = warriorArmy.length;
        int numBattle = 1;
        while (numWizard < wizardArmy.length && numWarrior < warriorArmy.length) {
            Wizard curWizard = wizardArmy[numWizard];
            Warrior curWarrior = warriorArmy[numWarrior];
            while (!curWizard.isDead() && !curWarrior.isDead()) {
                curWizard.attack(curWarrior);
                if (curWarrior.isDead()) {
                    System.out.println("Wizard wins battle " + numBattle);
                    warriorLeft--; 
                    numWarrior++;
                    break;
                }
                curWarrior.attack(curWizard);
                if (curWizard.isDead()) {
                    System.out.println("Warrior wins battle " + numBattle);
                    wizardLeft--;
                    numWizard++;
                    break;
                }
            }
            if (numBattle > 100) {
				break;
			}
            numBattle++;
            if (numWizard >= wizardArmy.length || numWarrior >= warriorArmy.length) {
                break;
            }
        }
        if (numWizard >= wizardArmy.length) {
            System.out.println("Warriors win with " + warriorLeft + " warriors remaining!");
        } else {
            System.out.println("Wizards win with " + wizardLeft + " wizards remaining!");
        }
    }
}
