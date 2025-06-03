package K0;

import F0.AbstractC0360e;
import F0.AbstractC0361f;
import F0.B;
import F0.InterfaceC0373s;
import F0.y;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends AbstractC0360e {

    /* renamed from: K0.b$b, reason: collision with other inner class name */
    public static final class C0061b implements AbstractC0360e.f {

        /* renamed from: a, reason: collision with root package name */
        public final B f3131a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3132b;

        /* renamed from: c, reason: collision with root package name */
        public final y.a f3133c;

        public C0061b(B b7, int i7) {
            this.f3131a = b7;
            this.f3132b = i7;
            this.f3133c = new y.a();
        }

        @Override // F0.AbstractC0360e.f
        public AbstractC0360e.C0030e a(InterfaceC0373s interfaceC0373s, long j7) {
            long p7 = interfaceC0373s.p();
            long c7 = c(interfaceC0373s);
            long m7 = interfaceC0373s.m();
            interfaceC0373s.o(Math.max(6, this.f3131a.f1740c));
            long c8 = c(interfaceC0373s);
            return (c7 > j7 || c8 <= j7) ? c8 <= j7 ? AbstractC0360e.C0030e.f(c8, interfaceC0373s.m()) : AbstractC0360e.C0030e.d(c7, p7) : AbstractC0360e.C0030e.e(m7);
        }

        @Override // F0.AbstractC0360e.f
        public /* synthetic */ void b() {
            AbstractC0361f.a(this);
        }

        public final long c(InterfaceC0373s interfaceC0373s) {
            while (interfaceC0373s.m() < interfaceC0373s.a() - 6 && !y.h(interfaceC0373s, this.f3131a, this.f3132b, this.f3133c)) {
                interfaceC0373s.o(1);
            }
            if (interfaceC0373s.m() < interfaceC0373s.a() - 6) {
                return this.f3133c.f1959a;
            }
            interfaceC0373s.o((int) (interfaceC0373s.a() - interfaceC0373s.m()));
            return this.f3131a.f1747j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final B b7, int i7, long j7, long j8) {
        super(new AbstractC0360e.d() { // from class: K0.a
            @Override // F0.AbstractC0360e.d
            public final long a(long j9) {
                return B.this.i(j9);
            }
        }, new C0061b(b7, i7), b7.f(), 0L, b7.f1747j, j7, j8, b7.d(), Math.max(6, b7.f1740c));
        Objects.requireNonNull(b7);
    }
}
