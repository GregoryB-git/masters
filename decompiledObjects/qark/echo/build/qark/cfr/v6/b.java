/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package v6;

import V5.n;
import V5.o;
import X5.d;
import Z5.h;
import g6.p;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.y;
import p6.y0;
import p6.z;
import u6.B;
import u6.F;
import u6.J;

public abstract class b {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void a(p object, Object object2, d object3) {
        d d8;
        block6 : {
            Throwable throwable222;
            d8 = h.a((d)object3);
            object3 = object3.getContext();
            Object object4 = J.c((X5.g)object3, null);
            {
                catch (Throwable throwable222) {}
            }
            object = ((p)y.b(object, 2)).invoke(object2, d8);
            J.a((X5.g)object3, object4);
            if (object == Y5.b.c()) return;
            break block6;
            catch (Throwable throwable3) {
                J.a((X5.g)object3, object4);
                throw throwable3;
            }
            object2 = n.o;
            object = o.a(throwable222);
        }
        d8.resumeWith(n.a(object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(B object, Object object2, p p8) {
        try {
            object2 = ((p)y.b(p8, 2)).invoke(object2, object);
        }
        catch (Throwable throwable) {
            object2 = new z(throwable, false, 2, null);
        }
        if (object2 == Y5.b.c()) {
            return Y5.b.c();
        }
        if ((object = object.j0(object2)) == y0.b) {
            return Y5.b.c();
        }
        if (object instanceof z) throw ((z)object).a;
        return y0.h(object);
    }
}

