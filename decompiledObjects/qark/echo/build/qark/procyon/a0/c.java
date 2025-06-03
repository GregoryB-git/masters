// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract class c
{
    public static boolean a(final Bundle bundle, final Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE", -1) == -1 && ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE", -1) == -1 && ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE", -1) == ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE", -1) && ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE_SIZE", -1) == ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }
    
    public static boolean b(final Bundle bundle, final Bundle bundle2) {
        int int1;
        if (bundle == null) {
            int1 = -1;
        }
        else {
            int1 = ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE", -1);
        }
        int int2;
        if (bundle2 == null) {
            int2 = -1;
        }
        else {
            int2 = ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE", -1);
        }
        int int3;
        if (bundle == null) {
            int3 = -1;
        }
        else {
            int3 = ((BaseBundle)bundle).getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        int int4;
        if (bundle2 == null) {
            int4 = -1;
        }
        else {
            int4 = ((BaseBundle)bundle2).getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        final int n = Integer.MAX_VALUE;
        final boolean b = false;
        int n2;
        int n3;
        if (int1 != -1 && int3 != -1) {
            n2 = int1 * int3;
            n3 = int3 + n2 - 1;
        }
        else {
            n3 = Integer.MAX_VALUE;
            n2 = 0;
        }
        int n4;
        int n5;
        if (int2 != -1 && int4 != -1) {
            n4 = int2 * int4;
            n5 = int4 + n4 - 1;
        }
        else {
            n4 = 0;
            n5 = n;
        }
        boolean b2 = b;
        if (n3 >= n4) {
            b2 = b;
            if (n5 >= n2) {
                b2 = true;
            }
        }
        return b2;
    }
}
