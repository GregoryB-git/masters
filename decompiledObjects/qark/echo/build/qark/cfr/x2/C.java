/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package x2;

import java.lang.ref.WeakReference;
import x2.A;

public abstract class C
extends A {
    public static final WeakReference d = new WeakReference((Object)null);
    public WeakReference c = d;

    public C(byte[] arrby) {
        super(arrby);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final byte[] Z0() {
        synchronized (this) {
            try {
                byte[] arrby;
                byte[] arrby2 = arrby = (byte[])this.c.get();
                if (arrby == null) {
                    arrby2 = this.a1();
                    this.c = new WeakReference((Object)arrby2);
                }
                return arrby2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract byte[] a1();
}

