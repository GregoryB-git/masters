package L5;

import E5.d;
import java.util.Map;
import java.util.Objects;

/* renamed from: L5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0434b implements d.InterfaceC0024d {

    /* renamed from: a, reason: collision with root package name */
    public final Q3.p f3398a;

    /* renamed from: b, reason: collision with root package name */
    public final z f3399b;

    /* renamed from: c, reason: collision with root package name */
    public Q3.s f3400c;

    /* renamed from: d, reason: collision with root package name */
    public Q3.a f3401d;

    public C0434b(Q3.p pVar, z zVar) {
        this.f3398a = pVar;
        this.f3399b = zVar;
    }

    @Override // E5.d.InterfaceC0024d
    public void a(Object obj) {
        this.f3399b.run();
        Q3.s sVar = this.f3400c;
        if (sVar != null) {
            this.f3398a.D(sVar);
            this.f3400c = null;
        }
        Q3.a aVar = this.f3401d;
        if (aVar != null) {
            this.f3398a.C(aVar);
            this.f3401d = null;
        }
    }

    @Override // E5.d.InterfaceC0024d
    public void b(Object obj, d.b bVar) {
        Object obj2 = ((Map) obj).get("eventType");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        if ("value".equals(str)) {
            E e7 = new E(bVar);
            this.f3400c = e7;
            this.f3398a.c(e7);
        } else {
            C0433a c0433a = new C0433a(bVar, str);
            this.f3401d = c0433a;
            this.f3398a.a(c0433a);
        }
    }
}
