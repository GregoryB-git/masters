/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  androidx.collection.SimpleArrayMap
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

public class TypefaceHelper {
    private static final SimpleArrayMap<String, Typeface> cache = new SimpleArrayMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface get(Context context, String string2) {
        SimpleArrayMap<String, Typeface> simpleArrayMap;
        SimpleArrayMap<String, Typeface> simpleArrayMap2 = simpleArrayMap = cache;
        synchronized (simpleArrayMap2) {
            boolean bl = simpleArrayMap.containsKey((Object)string2);
            if (bl) {
                return (Typeface)simpleArrayMap.get((Object)string2);
            }
            try {
                context = Typeface.createFromAsset((AssetManager)context.getAssets(), (String)String.format((String)"fonts/%s", (Object[])new Object[]{string2}));
                simpleArrayMap.put((Object)string2, (Object)context);
                return context;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
        }
    }
}

