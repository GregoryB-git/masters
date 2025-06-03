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

public final class g
implements DynamiteModule.b {
    @Override
    public final DynamiteModule.b.b a(Context context, String string2, DynamiteModule.b.a a8) {
        int n8;
        int n9;
        DynamiteModule.b.b b8 = new DynamiteModule.b.b();
        b8.a = a8.a(context, string2);
        b8.b = n8 = a8.b(context, string2, true);
        int n10 = n9 = b8.a;
        if (n9 == 0) {
            n10 = 0;
            if (n8 == 0) {
                b8.c = 0;
                return b8;
            }
        }
        if (n8 >= n10) {
            b8.c = 1;
            return b8;
        }
        b8.c = -1;
        return b8;
    }
}

