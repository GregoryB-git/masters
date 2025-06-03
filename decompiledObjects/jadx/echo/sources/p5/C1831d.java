package p5;

import E5.j;
import E5.k;

/* renamed from: p5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1831d extends AbstractC1828a {

    /* renamed from: a, reason: collision with root package name */
    public final a f18476a;

    /* renamed from: b, reason: collision with root package name */
    public final j f18477b;

    /* renamed from: p5.d$a */
    public class a implements InterfaceC1833f {

        /* renamed from: a, reason: collision with root package name */
        public final k.d f18478a;

        public a(k.d dVar) {
            this.f18478a = dVar;
        }

        @Override // p5.InterfaceC1833f
        public void a(Object obj) {
            this.f18478a.a(obj);
        }

        @Override // p5.InterfaceC1833f
        public void b(String str, String str2, Object obj) {
            this.f18478a.b(str, str2, obj);
        }
    }

    public C1831d(j jVar, k.d dVar) {
        this.f18477b = jVar;
        this.f18476a = new a(dVar);
    }

    @Override // p5.InterfaceC1832e
    public Object c(String str) {
        return this.f18477b.a(str);
    }

    @Override // p5.InterfaceC1832e
    public String i() {
        return this.f18477b.f1670a;
    }

    @Override // p5.InterfaceC1832e
    public boolean j(String str) {
        return this.f18477b.c(str);
    }

    @Override // p5.AbstractC1828a
    public InterfaceC1833f o() {
        return this.f18476a;
    }
}
