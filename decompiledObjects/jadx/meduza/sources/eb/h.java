package eb;

import eb.c;
import n7.g;

/* loaded from: classes.dex */
public abstract class h extends m.e {

    /* renamed from: b, reason: collision with root package name */
    public static final c.b<Long> f5112b = new c.b<>("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public static abstract class a {
        public h a(b bVar, s0 s0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f5113a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5114b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f5115c;

        public b(c cVar, int i10, boolean z10) {
            x6.b.y(cVar, "callOptions");
            this.f5113a = cVar;
            this.f5114b = i10;
            this.f5115c = z10;
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f5113a, "callOptions");
            b10.d(String.valueOf(this.f5114b), "previousAttempts");
            b10.c("isTransparentRetry", this.f5115c);
            return b10.toString();
        }
    }

    public h() {
        super(9);
    }

    public void v() {
    }

    public void w() {
    }

    public void x(s0 s0Var) {
    }

    public void y() {
    }

    public void z(eb.a aVar, s0 s0Var) {
    }
}
