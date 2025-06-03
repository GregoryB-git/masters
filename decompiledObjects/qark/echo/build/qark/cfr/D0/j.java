/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Throwable
 */
package D0;

import android.view.Surface;
import t0.o;
import t0.p;

public class j
extends o {
    public final int r;
    public final boolean s;

    public j(Throwable throwable, p p8, Surface surface) {
        super(throwable, p8);
        this.r = System.identityHashCode((Object)surface);
        boolean bl = surface == null || surface.isValid();
        this.s = bl;
    }
}

