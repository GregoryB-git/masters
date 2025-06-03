package D5;

import E5.k;
import java.util.HashMap;
import java.util.Map;
import t5.C1994a;
import w5.C2105a;
import x5.InterfaceC2220a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1281a;

    /* renamed from: b, reason: collision with root package name */
    public Map f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1283c;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            g.a(g.this);
        }
    }

    public g(C2105a c2105a) {
        a aVar = new a();
        this.f1283c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/deferredcomponent", E5.q.f1685b);
        this.f1281a = kVar;
        kVar.e(aVar);
        C1994a.e().a();
        this.f1282b = new HashMap();
    }

    public static /* synthetic */ InterfaceC2220a a(g gVar) {
        gVar.getClass();
        return null;
    }
}
