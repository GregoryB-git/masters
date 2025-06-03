/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package B3;

import r4.b;

public class x
implements b {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile b b;

    public x(b b8) {
        this.b = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object get() {
        Object object = this.a;
        Object object2 = c;
        if (object != object2) {
            return object;
        }
        synchronized (this) {
            try {
                Object object3;
                object = object3 = this.a;
                if (object3 == object2) {
                    this.a = object = this.b.get();
                    this.b = null;
                }
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

