/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.WallpaperManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;
import com.yandex.metrica.impl.ob.bm;

final class B2<T, R>
implements bm<WallpaperManager, Integer> {
    public final int a;

    public B2(int n) {
        this.a = n;
    }

    @Override
    public Object a(Object object) {
        return ((WallpaperManager)object).getWallpaperId(this.a);
    }
}

