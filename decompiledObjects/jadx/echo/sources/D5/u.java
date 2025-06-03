package D5;

import E5.k;
import java.util.ArrayList;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1437a;

    /* renamed from: b, reason: collision with root package name */
    public b f1438b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1439c;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (u.this.f1438b == null) {
                AbstractC1995b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f1670a;
            Object obj = jVar.f1671b;
            AbstractC1995b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                u.this.f1438b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e7) {
                dVar.b("error", e7.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public u(C2105a c2105a) {
        a aVar = new a();
        this.f1439c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/spellcheck", E5.q.f1685b);
        this.f1437a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f1438b = bVar;
    }
}
