/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.V;
import A2.c;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import x2.b;

public abstract class K
extends V {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ c f;

    public K(c c8, int n8, Bundle bundle) {
        this.f = c8;
        super(c8, (Object)Boolean.TRUE);
        this.d = n8;
        this.e = bundle;
    }

    @Override
    public final void b() {
    }

    public abstract void f(b var1);

    public abstract boolean g();
}

