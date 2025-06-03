/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p6;

import X5.d;
import X5.e;
import X5.g;
import Z5.h;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import p6.A0;
import p6.E;
import p6.H0;
import p6.I;
import p6.K;
import p6.N0;
import p6.P;
import p6.Q;
import p6.T;
import p6.g;
import p6.q0;
import p6.u0;
import p6.z0;
import u6.B;
import u6.J;
import v6.a;
import v6.b;

public abstract class i {
    public static final P a(I object, X5.g g8, K k8, p p8) {
        object = E.e((I)object, g8);
        object = k8.h() ? new z0((X5.g)object, p8) : new Q((X5.g)object, true);
        object.J0(k8, object, p8);
        return object;
    }

    public static /* synthetic */ P b(I i8, X5.g g8, K k8, p p8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            g8 = X5.h.o;
        }
        if ((n8 & 2) != 0) {
            k8 = K.o;
        }
        return g.a(i8, g8, k8, p8);
    }

    public static final q0 c(I object, X5.g g8, K k8, p p8) {
        object = E.e((I)object, g8);
        object = k8.h() ? new A0((X5.g)object, p8) : new H0((X5.g)object, true);
        object.J0(k8, object, p8);
        return object;
    }

    public static /* synthetic */ q0 d(I i8, X5.g g8, K k8, p p8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            g8 = X5.h.o;
        }
        if ((n8 & 2) != 0) {
            k8 = K.o;
        }
        return g.c(i8, g8, k8, p8);
    }

    public static final Object e(X5.g object, p p8, d d8) {
        X5.g g8 = d8.getContext();
        object = E.d(g8, (X5.g)object);
        u0.d((X5.g)object);
        if (object == g8) {
            object = new B((X5.g)object, d8);
            object = b.b((B)object, object, p8);
        } else {
            Object object2 = e.c;
            if (Intrinsics.a(object.b((g.c)object2), g8.b((g.c)object2))) {
                object = new N0((X5.g)object, d8);
                g8 = object.getContext();
                object2 = J.c(g8, null);
                try {
                    object = b.b((B)object, object, p8);
                }
                finally {
                    J.a(g8, object2);
                }
            } else {
                object = new T((X5.g)object, d8);
                a.d(p8, object, (d)object, null, 4, null);
                object = object.K0();
            }
        }
        if (object == Y5.b.c()) {
            h.c(d8);
        }
        return object;
    }
}

