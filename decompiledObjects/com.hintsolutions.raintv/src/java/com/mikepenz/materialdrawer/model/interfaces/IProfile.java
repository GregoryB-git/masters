/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  androidx.annotation.DrawableRes
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.model.interfaces;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import com.mikepenz.fastadapter.IIdentifyable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;

public interface IProfile<T>
extends IIdentifyable<T> {
    public StringHolder getEmail();

    public ImageHolder getIcon();

    public StringHolder getName();

    public boolean isSelectable();

    public T withEmail(String var1);

    public T withIcon(@DrawableRes int var1);

    public T withIcon(Bitmap var1);

    public T withIcon(Drawable var1);

    public T withIcon(Uri var1);

    public T withIcon(IIcon var1);

    public T withIcon(String var1);

    public T withName(String var1);

    public T withSelectable(boolean var1);
}

