package L4;

import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final F4.a f3332d = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1922b f3334b;

    /* renamed from: c, reason: collision with root package name */
    public c2.f f3335c;

    public b(InterfaceC1922b interfaceC1922b, String str) {
        this.f3333a = str;
        this.f3334b = interfaceC1922b;
    }

    public final boolean a() {
        if (this.f3335c == null) {
            c2.g gVar = (c2.g) this.f3334b.get();
            if (gVar != null) {
                this.f3335c = gVar.a(this.f3333a, N4.i.class, C0819b.b("proto"), new InterfaceC0822e() { // from class: L4.a
                    @Override // c2.InterfaceC0822e
                    public final Object apply(Object obj) {
                        return ((N4.i) obj).k();
                    }
                });
            } else {
                f3332d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f3335c != null;
    }

    public void b(N4.i iVar) {
        if (a()) {
            this.f3335c.b(AbstractC0820c.d(iVar));
        } else {
            f3332d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
