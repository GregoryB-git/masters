/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package t6;

import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.q0;
import t6.i;
import u6.B;

public abstract class k {
    public static final void a(final i i8, g g8) {
        if (((Number)g8.u(0, new p(){

            public final Integer a(int n8, g.b b8) {
                Object object = b8.getKey();
                g.b b9 = i8.p.b((g.c)object);
                if (object != q0.n) {
                    n8 = b8 != b9 ? Integer.MIN_VALUE : ++n8;
                    return n8;
                }
                object = (q0)b9;
                Intrinsics.c(b8, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                b8 = k.b((q0)b8, (q0)object);
                if (b8 == object) {
                    if (object != null) {
                        ++n8;
                    }
                    return n8;
                }
                b9 = new StringBuilder();
                b9.append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                b9.append((Object)b8);
                b9.append(", expected child of ");
                b9.append(object);
                b9.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                throw new IllegalStateException(b9.toString().toString());
            }
        })).intValue() == i8.q) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Flow invariant is violated:\n\t\tFlow was collected in ");
        stringBuilder.append((Object)i8.p);
        stringBuilder.append(",\n\t\tbut emission happened in ");
        stringBuilder.append((Object)g8);
        stringBuilder.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final q0 b(q0 q02, q0 q03) {
        while (q02 != null) {
            if (q02 == q03) {
                return q02;
            }
            if (!(q02 instanceof B)) {
                return q02;
            }
            q02 = q02.getParent();
        }
        return null;
    }

}

