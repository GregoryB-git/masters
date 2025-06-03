/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package a0;

import android.os.Bundle;

public abstract class c {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        }
        return false;
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int n8 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int n9 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int n10 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int n11 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int n12 = Integer.MAX_VALUE;
        boolean bl = false;
        if (n8 != -1 && n10 != -1) {
            n10 = n10 + (n8 *= n10) - 1;
        } else {
            n10 = Integer.MAX_VALUE;
            n8 = 0;
        }
        if (n9 != -1 && n11 != -1) {
            n11 = n11 + (n9 *= n11) - 1;
        } else {
            n9 = 0;
            n11 = n12;
        }
        boolean bl2 = bl;
        if (n10 >= n9) {
            bl2 = bl;
            if (n11 >= n8) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

