package z6;

import V2.AbstractC0650a;
import V2.AbstractC0659j;
import V2.InterfaceC0654e;
import V5.n;
import V5.o;
import X5.d;
import Y5.c;
import Z5.h;
import java.util.concurrent.CancellationException;
import p6.C1860m;
import p6.InterfaceC1858l;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a implements InterfaceC0654e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1858l f21778a;

        public a(InterfaceC1858l interfaceC1858l) {
            this.f21778a = interfaceC1858l;
        }

        @Override // V2.InterfaceC0654e
        public final void a(AbstractC0659j abstractC0659j) {
            Exception i7 = abstractC0659j.i();
            if (i7 != null) {
                InterfaceC1858l interfaceC1858l = this.f21778a;
                n.a aVar = n.f6797o;
                interfaceC1858l.resumeWith(n.a(o.a(i7)));
            } else {
                if (abstractC0659j.l()) {
                    InterfaceC1858l.a.a(this.f21778a, null, 1, null);
                    return;
                }
                InterfaceC1858l interfaceC1858l2 = this.f21778a;
                n.a aVar2 = n.f6797o;
                interfaceC1858l2.resumeWith(n.a(abstractC0659j.j()));
            }
        }
    }

    public static final Object a(AbstractC0659j abstractC0659j, d dVar) {
        return b(abstractC0659j, null, dVar);
    }

    public static final Object b(AbstractC0659j abstractC0659j, AbstractC0650a abstractC0650a, d dVar) {
        d b7;
        Object c7;
        if (!abstractC0659j.m()) {
            b7 = c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            abstractC0659j.c(z6.a.f21777o, new a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                h.c(dVar);
            }
            return w7;
        }
        Exception i7 = abstractC0659j.i();
        if (i7 != null) {
            throw i7;
        }
        if (!abstractC0659j.l()) {
            return abstractC0659j.j();
        }
        throw new CancellationException("Task " + abstractC0659j + " was cancelled normally.");
    }
}
