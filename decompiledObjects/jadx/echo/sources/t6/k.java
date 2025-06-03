package t6;

import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.InterfaceC1869q0;
import u6.B;

/* loaded from: classes.dex */
public abstract class k {

    public static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f19619o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(2);
            this.f19619o = iVar;
        }

        public final Integer a(int i7, g.b bVar) {
            g.c key = bVar.getKey();
            g.b b7 = this.f19619o.f19612p.b(key);
            if (key != InterfaceC1869q0.f18550n) {
                return Integer.valueOf(bVar != b7 ? Integer.MIN_VALUE : i7 + 1);
            }
            InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) b7;
            Intrinsics.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC1869q0 b8 = k.b((InterfaceC1869q0) bVar, interfaceC1869q0);
            if (b8 == interfaceC1869q0) {
                if (interfaceC1869q0 != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b8 + ", expected child of " + interfaceC1869q0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(i iVar, X5.g gVar) {
        if (((Number) gVar.u(0, new a(iVar))).intValue() == iVar.f19613q) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f19612p + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC1869q0 b(InterfaceC1869q0 interfaceC1869q0, InterfaceC1869q0 interfaceC1869q02) {
        while (interfaceC1869q0 != null) {
            if (interfaceC1869q0 == interfaceC1869q02) {
                return interfaceC1869q0;
            }
            if (!(interfaceC1869q0 instanceof B)) {
                return interfaceC1869q0;
            }
            interfaceC1869q0 = interfaceC1869q0.getParent();
        }
        return null;
    }
}
