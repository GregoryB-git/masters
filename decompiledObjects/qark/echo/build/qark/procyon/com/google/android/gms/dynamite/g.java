// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class g implements DynamiteModule.b
{
    @Override
    public final DynamiteModule.b.b a(final Context context, final String s, final a a) {
        final DynamiteModule.b.b b = new DynamiteModule.b.b();
        b.a = a.a(context, s);
        final int b2 = a.b(context, s, true);
        b.b = b2;
        int a2;
        if ((a2 = b.a) == 0) {
            a2 = 0;
            if (b2 == 0) {
                b.c = 0;
                return b;
            }
        }
        if (b2 >= a2) {
            b.c = 1;
            return b;
        }
        b.c = -1;
        return b;
    }
}
