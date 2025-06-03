// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class c implements DynamiteModule.b
{
    @Override
    public final DynamiteModule.b.b a(final Context context, final String s, final a a) {
        final DynamiteModule.b.b b = new DynamiteModule.b.b();
        final int a2 = a.a(context, s);
        b.a = a2;
        if (a2 != 0) {
            b.c = -1;
            return b;
        }
        if ((b.b = a.b(context, s, true)) != 0) {
            b.c = 1;
        }
        return b;
    }
}
