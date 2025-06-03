// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class b implements DynamiteModule.b
{
    @Override
    public final DynamiteModule.b.b a(final Context context, final String s, final a a) {
        final DynamiteModule.b.b b = new DynamiteModule.b.b();
        final int b2 = a.b(context, s, true);
        b.b = b2;
        if (b2 != 0) {
            b.c = 1;
            return b;
        }
        if ((b.a = a.a(context, s)) != 0) {
            b.c = -1;
        }
        return b;
    }
}
