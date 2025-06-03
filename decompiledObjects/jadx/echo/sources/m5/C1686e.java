package m5;

import E5.d;

/* renamed from: m5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1686e implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public d.b f17819a;

    /* renamed from: m5.e$a */
    public class a implements d.InterfaceC0024d {
        public a() {
        }

        @Override // E5.d.InterfaceC0024d
        public void a(Object obj) {
            C1686e.this.f17819a = null;
        }

        @Override // E5.d.InterfaceC0024d
        public void b(Object obj, d.b bVar) {
            C1686e.this.f17819a = bVar;
        }
    }

    public C1686e(E5.c cVar, String str) {
        new E5.d(cVar, str).d(new a());
    }

    @Override // E5.d.b
    public void a(Object obj) {
        d.b bVar = this.f17819a;
        if (bVar != null) {
            bVar.a(obj);
        }
    }

    @Override // E5.d.b
    public void b(String str, String str2, Object obj) {
        d.b bVar = this.f17819a;
        if (bVar != null) {
            bVar.b(str, str2, obj);
        }
    }

    @Override // E5.d.b
    public void c() {
        d.b bVar = this.f17819a;
        if (bVar != null) {
            bVar.c();
        }
    }
}
