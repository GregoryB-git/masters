// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t6;

import u6.B;
import kotlin.jvm.internal.Intrinsics;
import p6.q0;
import kotlin.jvm.internal.l;
import g6.p;
import X5.g;

public abstract class k
{
    public static final void a(final i i, final g obj) {
        if (((Number)obj.u(0, new p() {
            public final Integer a(int n, final g.b b) {
                final g.c key = b.getKey();
                final g.b b2 = i.p.b(key);
                if (key != q0.n) {
                    if (b != b2) {
                        n = Integer.MIN_VALUE;
                    }
                    else {
                        ++n;
                    }
                    return n;
                }
                final q0 obj = (q0)b2;
                Intrinsics.c(b, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                final q0 b3 = k.b((q0)b, obj);
                if (b3 == obj) {
                    if (obj != null) {
                        ++n;
                    }
                    return n;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                sb.append(b3);
                sb.append(", expected child of ");
                sb.append(obj);
                sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                throw new IllegalStateException(sb.toString().toString());
            }
        })).intValue() == i.q) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Flow invariant is violated:\n\t\tFlow was collected in ");
        sb.append(i.p);
        sb.append(",\n\t\tbut emission happened in ");
        sb.append(obj);
        sb.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final q0 b(q0 parent, final q0 q0) {
        while (parent != null) {
            if (parent == q0) {
                return parent;
            }
            if (!(parent instanceof B)) {
                return parent;
            }
            parent = parent.getParent();
        }
        return null;
    }
}
