package Y3;

import d4.C1227b;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public C1227b f7558a;

    /* renamed from: b, reason: collision with root package name */
    public k f7559b;

    /* renamed from: c, reason: collision with root package name */
    public l f7560c;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f7561a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7562b;

        public a(c cVar, boolean z7) {
            this.f7561a = cVar;
            this.f7562b = z7;
        }

        @Override // Y3.k.c
        public void a(k kVar) {
            kVar.e(this.f7561a, true, this.f7562b);
        }
    }

    public interface b {
        boolean a(k kVar);
    }

    public interface c {
        void a(k kVar);
    }

    public k() {
        this(null, null, new l());
    }

    public boolean a(b bVar) {
        return b(bVar, false);
    }

    public boolean b(b bVar, boolean z7) {
        for (k kVar = z7 ? this : this.f7559b; kVar != null; kVar = kVar.f7559b) {
            if (bVar.a(kVar)) {
                return true;
            }
        }
        return false;
    }

    public void c(c cVar) {
        for (Object obj : this.f7560c.f7564a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            cVar.a(new k((C1227b) entry.getKey(), this, (l) entry.getValue()));
        }
    }

    public void d(c cVar) {
        e(cVar, false, false);
    }

    public void e(c cVar, boolean z7, boolean z8) {
        if (z7 && !z8) {
            cVar.a(this);
        }
        c(new a(cVar, z8));
        if (z7 && z8) {
            cVar.a(this);
        }
    }

    public V3.k f() {
        if (this.f7559b == null) {
            return this.f7558a != null ? new V3.k(this.f7558a) : V3.k.Y();
        }
        m.f(this.f7558a != null);
        return this.f7559b.f().U(this.f7558a);
    }

    public Object g() {
        return this.f7560c.f7565b;
    }

    public boolean h() {
        return !this.f7560c.f7564a.isEmpty();
    }

    public boolean i() {
        l lVar = this.f7560c;
        return lVar.f7565b == null && lVar.f7564a.isEmpty();
    }

    public void j(Object obj) {
        this.f7560c.f7565b = obj;
        n();
    }

    public k k(V3.k kVar) {
        C1227b Z6 = kVar.Z();
        k kVar2 = this;
        while (Z6 != null) {
            k kVar3 = new k(Z6, kVar2, kVar2.f7560c.f7564a.containsKey(Z6) ? (l) kVar2.f7560c.f7564a.get(Z6) : new l());
            kVar = kVar.c0();
            Z6 = kVar.Z();
            kVar2 = kVar3;
        }
        return kVar2;
    }

    public String l(String str) {
        C1227b c1227b = this.f7558a;
        String e7 = c1227b == null ? "<anon>" : c1227b.e();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(e7);
        sb.append("\n");
        sb.append(this.f7560c.a(str + "\t"));
        return sb.toString();
    }

    public final void m(C1227b c1227b, k kVar) {
        boolean i7 = kVar.i();
        boolean containsKey = this.f7560c.f7564a.containsKey(c1227b);
        if (i7 && containsKey) {
            this.f7560c.f7564a.remove(c1227b);
        } else if (i7 || containsKey) {
            return;
        } else {
            this.f7560c.f7564a.put(c1227b, kVar.f7560c);
        }
        n();
    }

    public final void n() {
        k kVar = this.f7559b;
        if (kVar != null) {
            kVar.m(this.f7558a, this);
        }
    }

    public String toString() {
        return l("");
    }

    public k(C1227b c1227b, k kVar, l lVar) {
        this.f7558a = c1227b;
        this.f7559b = kVar;
        this.f7560c = lVar;
    }
}
