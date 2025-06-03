/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package B1;

import B1.b;
import android.os.Bundle;

public final class a
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ Bundle p;

    public /* synthetic */ a(String string2, Bundle bundle) {
        this.o = string2;
        this.p = bundle;
    }

    public final void run() {
        b.a(this.o, this.p);
    }
}

