/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.CountDownLatch
 */
package O1;

import O1.V;
import java.util.concurrent.CountDownLatch;
import x1.F;
import x1.K;

public final class W
implements F.b {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ V.e c;
    public final /* synthetic */ CountDownLatch d;

    public /* synthetic */ W(String[] arrstring, int n8, V.e e8, CountDownLatch countDownLatch) {
        this.a = arrstring;
        this.b = n8;
        this.c = e8;
        this.d = countDownLatch;
    }

    @Override
    public final void a(K k8) {
        V.e.a(this.a, this.b, this.c, this.d, k8);
    }
}

