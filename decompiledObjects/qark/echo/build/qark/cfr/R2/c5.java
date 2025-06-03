/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.D4;
import R2.a5;
import android.content.ComponentName;

public final class c5
implements Runnable {
    public final /* synthetic */ ComponentName o;
    public final /* synthetic */ a5 p;

    public c5(a5 a52, ComponentName componentName) {
        this.p = a52;
        this.o = componentName;
    }

    public final void run() {
        D4.I(this.p.c, this.o);
    }
}

