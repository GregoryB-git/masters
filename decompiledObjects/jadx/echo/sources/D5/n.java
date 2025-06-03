package D5;

import E5.k;
import java.util.HashMap;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1313a;

    /* renamed from: b, reason: collision with root package name */
    public final k.c f1314b;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public n(C2105a c2105a) {
        a aVar = new a();
        this.f1314b = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/navigation", E5.g.f1669a);
        this.f1313a = kVar;
        kVar.e(aVar);
    }

    public void a() {
        AbstractC1995b.f("NavigationChannel", "Sending message to pop route.");
        this.f1313a.c("popRoute", null);
    }

    public void b(String str) {
        AbstractC1995b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f1313a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        AbstractC1995b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f1313a.c("setInitialRoute", str);
    }
}
