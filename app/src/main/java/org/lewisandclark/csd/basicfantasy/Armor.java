package org.lewisandclark.csd.basicfantasy;

import java.util.ArrayList;

/**
 * Created by Thorin Schmidt on 3/28/2018.
 */
public class Armor extends Item {

    private int mACMeleeBonus;
    private int mACMissileBonus;
    private int mMagicBonus;
    private int mMagic2ndBonus;
    private ArrayList<CharacterClass> mClassesNotAllowed;

    public Armor(){
        super(R.string.none, "", 0, 0, 1);
        mACMeleeBonus = 0;
        mACMissileBonus = 0;
        mMagicBonus = 0;
        mMagic2ndBonus = 0;
        mClassesNotAllowed.add(null);

    }

    public Armor(int nameID, String formalName, double weight, double costInGP, int quantity,
                 int ACBonus, int ACMissileBonus, int magicBonus, int magic2ndBonus,
                 ArrayList<CharacterClass> classesNotAllowed) {
        super(nameID, formalName, weight, costInGP, quantity);
        mACMeleeBonus = ACBonus;
        mACMissileBonus = ACMissileBonus;
        mMagicBonus = magicBonus;
        mMagic2ndBonus = magic2ndBonus;
        mClassesNotAllowed = classesNotAllowed;
    }

    public int getACMeleeBonus() {
        return mACMeleeBonus;
    }

    public void setACMeleeBonus(int ACMeleeBonus) {
        mACMeleeBonus = ACMeleeBonus;
    }

    public int getACMissileBonus() {
        return mACMissileBonus;
    }

    public void setACMissileBonus(int ACMissileBonus) {
        mACMissileBonus = ACMissileBonus;
    }

    public int getMagicBonus() {
        return mMagicBonus;
    }

    public void setMagicBonus(int magicBonus) {
        mMagicBonus = magicBonus;
    }

    public int getMagic2ndBonus() {
        return mMagic2ndBonus;
    }

    public void setMagic2ndBonus(int magic2ndBonus) {
        mMagic2ndBonus = magic2ndBonus;
    }

    public ArrayList<CharacterClass> getClassesNotAllowed() {
        return mClassesNotAllowed;
    }

    public void setClassesNotAllowed(ArrayList<CharacterClass> classesNotAllowed) {
        mClassesNotAllowed = classesNotAllowed;
    }
}
