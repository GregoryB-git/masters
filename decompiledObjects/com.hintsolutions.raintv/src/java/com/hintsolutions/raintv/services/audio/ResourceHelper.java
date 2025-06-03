/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.services.audio;

import android.content.Context;
import android.content.res.Resources;

public class ResourceHelper {
    public static int getThemeColor(Context context, int n, int n2) {
        int n3;
        int n4 = n3 = 0;
        String string2 = context.getPackageName();
        n4 = n3;
        Context context2 = context.createPackageContext(string2, 0);
        n4 = n3;
        context2.setTheme(context.getPackageManager().getApplicationInfo((String)string2, (int)0).theme);
        n4 = n3;
        string2 = context2.getTheme().obtainStyledAttributes(new int[]{n});
        n4 = n3;
        n4 = n = string2.getColor(0, n2);
        try {
            string2.recycle();
            n4 = n;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            try {
                n4 = n = context.getResources().getColor(2131100669);
            }
            catch (Resources.NotFoundException notFoundException) {
                notFoundException.printStackTrace();
            }
        }
        return n4;
    }
}

