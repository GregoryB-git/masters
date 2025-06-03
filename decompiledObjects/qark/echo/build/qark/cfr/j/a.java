/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.Object
 */
package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class a {
    public Context a;

    public a(Context context) {
        this.a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    public int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int n8 = configuration.screenWidthDp;
        int n9 = configuration.screenHeightDp;
        if (!(configuration.smallestScreenWidthDp > 600 || n8 > 600 || n8 > 960 && n9 > 720 || n8 > 720 && n9 > 960)) {
            if (!(n8 >= 500 || n8 > 640 && n9 > 480 || n8 > 480 && n9 > 640)) {
                if (n8 >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }

    public boolean d() {
        return true;
    }
}

