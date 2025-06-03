package E5;

import E5.c;
import java.nio.ByteBuffer;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final E5.c f1672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1673b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1674c;

    /* renamed from: d, reason: collision with root package name */
    public final c.InterfaceC0023c f1675d;

    public final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f1676a;

        /* renamed from: E5.k$a$a, reason: collision with other inner class name */
        public class C0025a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.b f1678a;

            public C0025a(c.b bVar) {
                this.f1678a = bVar;
            }

            @Override // E5.k.d
            public void a(Object obj) {
                this.f1678a.a(k.this.f1674c.a(obj));
            }

            @Override // E5.k.d
            public void b(String str, String str2, Object obj) {
                this.f1678a.a(k.this.f1674c.d(str, str2, obj));
            }

            @Override // E5.k.d
            public void c() {
                this.f1678a.a(null);
            }
        }

        public a(c cVar) {
            this.f1676a = cVar;
        }

        @Override // E5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f1676a.onMethodCall(k.this.f1674c.e(byteBuffer), new C0025a(bVar));
            } catch (RuntimeException e7) {
                AbstractC1995b.c("MethodChannel#" + k.this.f1673b, "Failed to handle method call", e7);
                bVar.a(k.this.f1674c.b("error", e7.getMessage(), null, AbstractC1995b.d(e7)));
            }
        }
    }

    public final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final d f1680a;

        public b(d dVar) {
            this.f1680a = dVar;
        }

        @Override // E5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f1680a.c();
                } else {
                    try {
                        this.f1680a.a(k.this.f1674c.f(byteBuffer));
                    } catch (e e7) {
                        this.f1680a.b(e7.f1666o, e7.getMessage(), e7.f1667p);
                    }
                }
            } catch (RuntimeException e8) {
                AbstractC1995b.c("MethodChannel#" + k.this.f1673b, "Failed to handle method call result", e8);
            }
        }
    }

    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(E5.c cVar, String str) {
        this(cVar, str, q.f1685b);
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f1672a.f(this.f1673b, this.f1674c.c(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f1675d != null) {
            this.f1672a.h(this.f1673b, cVar != null ? new a(cVar) : null, this.f1675d);
        } else {
            this.f1672a.c(this.f1673b, cVar != null ? new a(cVar) : null);
        }
    }

    public k(E5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(E5.c cVar, String str, l lVar, c.InterfaceC0023c interfaceC0023c) {
        this.f1672a = cVar;
        this.f1673b = str;
        this.f1674c = lVar;
        this.f1675d = interfaceC0023c;
    }
}
