/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import R2.C3;
import R2.D4;
import R2.l2;
import R2.n2;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class D3
implements Runnable {
    public /* synthetic */ C3 o;
    public /* synthetic */ AtomicReference p;

    public /* synthetic */ D3(C3 c32, AtomicReference atomicReference) {
        this.o = c32;
        this.p = atomicReference;
    }

    public final void run() {
        C3 c32 = this.o;
        AtomicReference atomicReference = this.p;
        Bundle bundle = c32.i().n.a();
        D4 d42 = c32.t();
        c32 = bundle;
        if (bundle == null) {
            c32 = new Bundle();
        }
        d42.R(atomicReference, (Bundle)c32);
    }
}

