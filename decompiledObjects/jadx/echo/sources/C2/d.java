package C2;

import A2.C0334u;
import A2.InterfaceC0333t;
import A2.r;
import V2.AbstractC0659j;
import V2.C0660k;
import android.content.Context;
import y2.C2270a;
import y2.d;
import z2.AbstractC2310m;
import z2.InterfaceC2308k;

/* loaded from: classes.dex */
public final class d extends y2.d implements InterfaceC0333t {

    /* renamed from: k, reason: collision with root package name */
    public static final C2270a.g f918k;

    /* renamed from: l, reason: collision with root package name */
    public static final C2270a.AbstractC0301a f919l;

    /* renamed from: m, reason: collision with root package name */
    public static final C2270a f920m;

    static {
        C2270a.g gVar = new C2270a.g();
        f918k = gVar;
        c cVar = new c();
        f919l = cVar;
        f920m = new C2270a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C0334u c0334u) {
        super(context, f920m, c0334u, d.a.f21425c);
    }

    @Override // A2.InterfaceC0333t
    public final AbstractC0659j a(final r rVar) {
        AbstractC2310m.a a7 = AbstractC2310m.a();
        a7.d(K2.d.f3186a);
        a7.c(false);
        a7.b(new InterfaceC2308k() { // from class: C2.b
            @Override // z2.InterfaceC2308k
            public final void a(Object obj, Object obj2) {
                r rVar2 = r.this;
                C2270a.g gVar = d.f918k;
                ((a) ((e) obj).D()).Z0(rVar2);
                ((C0660k) obj2).c(null);
            }
        });
        return c(a7.a());
    }
}
