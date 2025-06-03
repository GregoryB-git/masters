/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Void
 *  java.util.concurrent.CountDownLatch
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.V;
import com.yandex.metrica.impl.ob.Yl;
import java.util.concurrent.CountDownLatch;

class G2
implements Yl<Context, Intent, Void> {
    public final V a;
    public final CountDownLatch b;
    public final H2 c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public G2(H2 h2, V v2, CountDownLatch countDownLatch) {
        this.c = h2;
        this.a = v2;
        this.b = countDownLatch;
    }

    @Override
    public Object a(Object object, Object object2) {
        object = (Context)object;
        object = (Intent)object2;
        this.a.a(H2.a(this.c));
        this.b.countDown();
        H2.b(this.c).b(this);
        return null;
    }
}

