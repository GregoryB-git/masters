/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package o4;

import android.content.Context;
import o4.f;
import r4.b;

public final class c
implements b {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(Context context, String string2) {
        this.a = context;
        this.b = string2;
    }

    @Override
    public final Object get() {
        return f.d(this.a, this.b);
    }
}

