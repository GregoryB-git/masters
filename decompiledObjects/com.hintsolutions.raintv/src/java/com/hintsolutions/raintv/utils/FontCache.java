/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.hintsolutions.raintv.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.HashMap;

public class FontCache {
    private static HashMap<String, Typeface> fontCache = new HashMap();

    public static Typeface getTypeface(String string2, Context context) {
        Typeface typeface;
        Typeface typeface2 = typeface = (Typeface)fontCache.get((Object)string2);
        if (typeface == null) {
            try {
                typeface2 = Typeface.createFromAsset((AssetManager)context.getAssets(), (String)string2);
            }
            catch (Exception exception) {
                return null;
            }
            fontCache.put((Object)string2, (Object)typeface2);
        }
        return typeface2;
    }
}

