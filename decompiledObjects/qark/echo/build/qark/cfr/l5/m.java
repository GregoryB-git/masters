/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package l5;

import E5.k;
import com.ryanheise.audioservice.a;

public final class m
implements Runnable {
    public final /* synthetic */ k.d o;
    public final /* synthetic */ Exception p;

    public /* synthetic */ m(k.d d8, Exception exception) {
        this.o = d8;
        this.p = exception;
    }

    public final void run() {
        a.c.K(this.o, this.p);
    }
}

