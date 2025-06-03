/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  com.mikepenz.materialdrawer.holder.ImageHolder
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.model.interfaces;

import android.graphics.drawable.Drawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.holder.ImageHolder;

public interface Iconable<T> {
    public ImageHolder getIcon();

    public T withIcon(Drawable var1);

    public T withIcon(IIcon var1);

    public T withIcon(ImageHolder var1);
}

