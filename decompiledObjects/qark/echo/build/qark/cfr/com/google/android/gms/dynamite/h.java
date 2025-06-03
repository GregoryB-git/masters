/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class h
implements DynamiteModule.b {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final DynamiteModule.b.b a(Context context, String string2, DynamiteModule.b.a a8) {
        int n8;
        DynamiteModule.b.b b8 = new DynamiteModule.b.b();
        b8.a = n8 = a8.a(context, string2);
        int n9 = 0;
        n8 = n8 != 0 ? a8.b(context, string2, false) : a8.b(context, string2, true);
        b8.b = n8;
        int n10 = b8.a;
        if (n10 == 0) {
            if (n8 == 0) {
                b8.c = 0;
                return b8;
            }
        } else {
            n9 = n10;
        }
        if (n8 >= n9) {
            b8.c = 1;
            return b8;
        }
        b8.c = -1;
        return b8;
    }
}

