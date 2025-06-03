// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class f implements DynamiteModule.b
{
    @Override
    public final DynamiteModule.b.b a(final Context context, final String s, final a a) {
        final DynamiteModule.b.b b = new DynamiteModule.b.b();
        final int a2 = a.a(context, s);
        b.a = a2;
        int n = 0;
        int b2;
        if (a2 != 0) {
            b2 = a.b(context, s, false);
        }
        else {
            b2 = a.b(context, s, true);
        }
        b.b = b2;
        final int a3 = b.a;
        if (a3 == 0) {
            if (b2 == 0) {
                b.c = 0;
                return b;
            }
        }
        else {
            n = a3;
        }
        if (n >= b2) {
            b.c = -1;
            return b;
        }
        b.c = 1;
        return b;
    }
}
