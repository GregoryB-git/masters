/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.C3;
import R2.S1;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.text.TextUtils;

public final class I3
implements Runnable {
    public /* synthetic */ C3 o;
    public /* synthetic */ Bundle p;
    public /* synthetic */ long q;

    public /* synthetic */ I3(C3 c32, Bundle bundle, long l8) {
        this.o = c32;
        this.p = bundle;
        this.q = l8;
    }

    public final void run() {
        C3 c32 = this.o;
        Bundle bundle = this.p;
        long l8 = this.q;
        if (TextUtils.isEmpty((CharSequence)c32.p().G())) {
            c32.P(bundle, 0, l8);
            return;
        }
        c32.j().M().a("Using developer consent only; google app id found");
    }
}

