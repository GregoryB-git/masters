/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.Log
 *  android.widget.ImageView
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;

public abstract class AbstractDrawerImageLoader
implements DrawerImageLoader.IDrawerImageLoader {
    @Override
    public void cancel(ImageView imageView) {
    }

    @Override
    public Drawable placeholder(Context context) {
        return DrawerUIUtils.getPlaceHolder(context);
    }

    @Override
    public Drawable placeholder(Context context, String string) {
        return this.placeholder(context);
    }

    @Override
    public void set(ImageView imageView, Uri uri, Drawable drawable) {
    }

    @Override
    public void set(ImageView imageView, Uri uri, Drawable drawable, String string) {
        this.set(imageView, uri, drawable);
        Log.i((String)"MaterialDrawer", (String)"You have not specified a ImageLoader implementation through the DrawerImageLoader.init() method, or you are still overriding the deprecated method set(ImageView iv, Uri u, Drawable d) instead of set(ImageView iv, Uri u, Drawable d, String tag)");
    }
}

