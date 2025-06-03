/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 */
package p4;

import V2.j;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CountDownLatch;

public final class e
implements V2.e {
    public final CountDownLatch a;

    public e(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override
    public void a(j j8) {
        FirebaseInstanceId.v(this.a, j8);
    }
}

