/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package R2;

import R2.x2;
import R2.z2;
import com.google.android.gms.internal.measurement.V7;
import java.util.concurrent.Callable;

public final class B2
implements Callable {
    public /* synthetic */ x2 o;
    public /* synthetic */ String p;

    public /* synthetic */ B2(x2 x22, String string2) {
        this.o = x22;
        this.p = string2;
    }

    public final Object call() {
        return new V7("internal.appMetadata", new z2(this.o, this.p));
    }
}

