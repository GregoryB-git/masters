/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package R2;

import R2.x2;
import com.google.android.gms.internal.measurement.P7;
import com.google.android.gms.internal.measurement.T7;
import java.util.concurrent.Callable;

public final class A2
implements Callable {
    public /* synthetic */ x2 o;

    public /* synthetic */ A2(x2 x22) {
        this.o = x22;
    }

    public final Object call() {
        return new P7(this.o.k);
    }
}

