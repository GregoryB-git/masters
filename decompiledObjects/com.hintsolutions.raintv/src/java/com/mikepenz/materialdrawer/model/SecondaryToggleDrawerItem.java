/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.LayoutRes
 *  java.lang.Object
 *  java.lang.Override
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import androidx.annotation.LayoutRes;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.model.AbstractToggleableDrawerItem;
import com.mikepenz.materialize.holder.ColorHolder;

public class SecondaryToggleDrawerItem
extends AbstractToggleableDrawerItem<SecondaryToggleDrawerItem> {
    @Override
    public int getColor(Context context) {
        int n4 = this.isEnabled() ? ColorHolder.color(this.getTextColor(), context, R.attr.material_drawer_secondary_text, R.color.material_drawer_secondary_text) : ColorHolder.color(this.getDisabledTextColor(), context, R.attr.material_drawer_hint_text, R.color.material_drawer_hint_text);
        return n4;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_secondary_toggle;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_secondary_toggle;
    }
}

