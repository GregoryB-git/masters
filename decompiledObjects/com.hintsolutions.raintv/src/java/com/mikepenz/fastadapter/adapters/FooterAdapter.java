/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.mikepenz.fastadapter.adapters;

import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

public class FooterAdapter<Item extends IItem>
extends ItemAdapter<Item> {
    @Override
    public int getOrder() {
        return 1000;
    }
}

