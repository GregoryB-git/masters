package V3;

import d4.C1227b;
import d4.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public d4.n f6673a = null;

    /* renamed from: b, reason: collision with root package name */
    public Map f6674b = null;

    public class a extends c.AbstractC0192c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f6675a;

        public a(k kVar) {
            this.f6675a = kVar;
        }

        @Override // d4.c.AbstractC0192c
        public void b(C1227b c1227b, d4.n nVar) {
            u.this.d(this.f6675a.U(c1227b), nVar);
        }
    }

    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f6677a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f6678b;

        public b(k kVar, d dVar) {
            this.f6677a = kVar;
            this.f6678b = dVar;
        }

        @Override // V3.u.c
        public void a(C1227b c1227b, u uVar) {
            uVar.b(this.f6677a.U(c1227b), this.f6678b);
        }
    }

    public interface c {
        void a(C1227b c1227b, u uVar);
    }

    public interface d {
        void a(k kVar, d4.n nVar);
    }

    public void a(c cVar) {
        Map map = this.f6674b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                cVar.a((C1227b) entry.getKey(), (u) entry.getValue());
            }
        }
    }

    public void b(k kVar, d dVar) {
        d4.n nVar = this.f6673a;
        if (nVar != null) {
            dVar.a(kVar, nVar);
        } else {
            a(new b(kVar, dVar));
        }
    }

    public boolean c(k kVar) {
        if (kVar.isEmpty()) {
            this.f6673a = null;
            this.f6674b = null;
            return true;
        }
        d4.n nVar = this.f6673a;
        if (nVar != null) {
            if (nVar.B()) {
                return false;
            }
            d4.c cVar = (d4.c) this.f6673a;
            this.f6673a = null;
            cVar.M(new a(kVar));
            return c(kVar);
        }
        if (this.f6674b == null) {
            return true;
        }
        C1227b Z6 = kVar.Z();
        k c02 = kVar.c0();
        if (this.f6674b.containsKey(Z6) && ((u) this.f6674b.get(Z6)).c(c02)) {
            this.f6674b.remove(Z6);
        }
        if (!this.f6674b.isEmpty()) {
            return false;
        }
        this.f6674b = null;
        return true;
    }

    public void d(k kVar, d4.n nVar) {
        if (kVar.isEmpty()) {
            this.f6673a = nVar;
            this.f6674b = null;
            return;
        }
        d4.n nVar2 = this.f6673a;
        if (nVar2 != null) {
            this.f6673a = nVar2.y(kVar, nVar);
            return;
        }
        if (this.f6674b == null) {
            this.f6674b = new HashMap();
        }
        C1227b Z6 = kVar.Z();
        if (!this.f6674b.containsKey(Z6)) {
            this.f6674b.put(Z6, new u());
        }
        ((u) this.f6674b.get(Z6)).d(kVar.c0(), nVar);
    }
}
