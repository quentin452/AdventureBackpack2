package com.darkona.adventurebackpack.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

/**
 * Created on 17/01/2015
 *
 * @author Darkona
 */
abstract class SlotAdventure extends Slot {
    SlotAdventure(IInventory inventory, int slotIndex, int posX, int posY) {
        super(inventory, slotIndex, posX, posY);
    }
}
