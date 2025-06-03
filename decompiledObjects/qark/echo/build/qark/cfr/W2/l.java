/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 */
package W2;

import W2.a;
import W2.m;
import W2.p;
import java.io.Serializable;

public abstract class l
implements Serializable {
    private static final long serialVersionUID = 0L;

    public static l a() {
        return a.e();
    }

    public static l d(Object object) {
        return new p(m.j(object));
    }

    public abstract Object b();

    public abstract boolean c();
}

