/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package R2;

import R2.C3;
import java.util.List;

public final class G3
implements Runnable {
    public /* synthetic */ C3 o;
    public /* synthetic */ List p;

    public /* synthetic */ G3(C3 c32, List list) {
        this.o = c32;
        this.p = list;
    }

    public final void run() {
        this.o.d0(this.p);
    }
}

