/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  java.lang.Object
 */
package z2;

import android.os.Message;
import z2.c;
import z2.e;

public final class s
implements c.a {
    public final /* synthetic */ e a;

    public s(e e8) {
        this.a = e8;
    }

    @Override
    public final void a(boolean bl) {
        e e8 = this.a;
        e.r(e8).sendMessage(e.r(e8).obtainMessage(1, (Object)bl));
    }
}

