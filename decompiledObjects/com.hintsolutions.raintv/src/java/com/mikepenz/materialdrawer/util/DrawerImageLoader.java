/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.widget.ImageView
 *  com.mikepenz.materialdrawer.util.DrawerImageLoader$1
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;

public class DrawerImageLoader {
    private static DrawerImageLoader SINGLETON;
    private IDrawerImageLoader imageLoader;
    private boolean mHandleAllUris = false;

    private DrawerImageLoader(IDrawerImageLoader iDrawerImageLoader) {
        this.imageLoader = iDrawerImageLoader;
    }

    public static DrawerImageLoader getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new DrawerImageLoader((IDrawerImageLoader)new 1());
        }
        return SINGLETON;
    }

    public static DrawerImageLoader init(IDrawerImageLoader object) {
        SINGLETON = object = new DrawerImageLoader((IDrawerImageLoader)object);
        return object;
    }

    public void cancelImage(ImageView imageView) {
        IDrawerImageLoader iDrawerImageLoader = this.imageLoader;
        if (iDrawerImageLoader != null) {
            iDrawerImageLoader.cancel(imageView);
        }
    }

    public IDrawerImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public boolean setImage(ImageView imageView, Uri uri, String string2) {
        if (!(this.mHandleAllUris || "http".equals((Object)uri.getScheme()) || "https".equals((Object)uri.getScheme()))) {
            return false;
        }
        IDrawerImageLoader iDrawerImageLoader = this.imageLoader;
        if (iDrawerImageLoader != null) {
            iDrawerImageLoader = iDrawerImageLoader.placeholder(imageView.getContext(), string2);
            this.imageLoader.set(imageView, uri, (Drawable)iDrawerImageLoader, string2);
        }
        return true;
    }

    public void setImageLoader(IDrawerImageLoader iDrawerImageLoader) {
        this.imageLoader = iDrawerImageLoader;
    }

    public DrawerImageLoader withHandleAllUris(boolean bl) {
        this.mHandleAllUris = bl;
        return this;
    }

    public static interface IDrawerImageLoader {
        public void cancel(ImageView var1);

        public Drawable placeholder(Context var1);

        public Drawable placeholder(Context var1, String var2);

        @Deprecated
        public void set(ImageView var1, Uri var2, Drawable var3);

        public void set(ImageView var1, Uri var2, Drawable var3, String var4);
    }

    public static final class Tags
    extends Enum<Tags> {
        private static final Tags[] $VALUES;
        public static final /* enum */ Tags ACCOUNT_HEADER;
        public static final /* enum */ Tags PROFILE;
        public static final /* enum */ Tags PROFILE_DRAWER_ITEM;

        static {
            Tags tags;
            Tags tags2;
            Tags tags3;
            PROFILE = tags3 = new Tags();
            PROFILE_DRAWER_ITEM = tags2 = new Tags();
            ACCOUNT_HEADER = tags = new Tags();
            $VALUES = new Tags[]{tags3, tags2, tags};
        }

        public static Tags valueOf(String string2) {
            return (Tags)Enum.valueOf(Tags.class, (String)string2);
        }

        public static Tags[] values() {
            return (Tags[])$VALUES.clone();
        }
    }
}

