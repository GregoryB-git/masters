package eb;

import eb.e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5107a = 0;

    public class a extends e<Object, Object> {
        @Override // eb.e
        public final void a(String str, Throwable th) {
        }

        @Override // eb.e
        public final void b() {
        }

        @Override // eb.e
        public final void c(int i10) {
        }

        @Override // eb.e
        public final void d(Object obj) {
        }

        @Override // eb.e
        public final void e(e.a<Object> aVar, s0 s0Var) {
        }
    }

    public static class b extends e9.a {

        /* renamed from: b, reason: collision with root package name */
        public final e9.a f5108b;

        /* renamed from: c, reason: collision with root package name */
        public final f f5109c;

        public b(e9.a aVar, f fVar) {
            this.f5108b = aVar;
            x6.b.y(fVar, "interceptor");
            this.f5109c = fVar;
        }

        @Override // e9.a
        public final String b() {
            return this.f5108b.b();
        }

        @Override // e9.a
        public final <ReqT, RespT> e<ReqT, RespT> v(t0<ReqT, RespT> t0Var, c cVar) {
            return this.f5109c.a();
        }
    }

    static {
        new a();
    }
}
