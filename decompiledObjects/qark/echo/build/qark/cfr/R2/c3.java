/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package R2;

import R2.R2;
import R2.W5;
import R2.n;
import android.os.Bundle;
import java.util.concurrent.Callable;

public final class c3
implements Callable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ R2 p;

    public c3(R2 r22, W5 w52) {
        this.p = r22;
        this.o = w52;
    }

    public final /* synthetic */ Object call() {
        R2.o(this.p).o0();
        return new n(R2.o(this.p).l(this.o.o));
    }
}

