package p5;

import E5.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1830c extends AbstractC1828a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f18468a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18469b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18470c;

    /* renamed from: p5.c$a */
    public class a implements InterfaceC1833f {

        /* renamed from: a, reason: collision with root package name */
        public Object f18471a;

        /* renamed from: b, reason: collision with root package name */
        public String f18472b;

        /* renamed from: c, reason: collision with root package name */
        public String f18473c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18474d;

        public a() {
        }

        @Override // p5.InterfaceC1833f
        public void a(Object obj) {
            this.f18471a = obj;
        }

        @Override // p5.InterfaceC1833f
        public void b(String str, String str2, Object obj) {
            this.f18472b = str;
            this.f18473c = str2;
            this.f18474d = obj;
        }
    }

    public C1830c(Map map, boolean z7) {
        this.f18468a = map;
        this.f18470c = z7;
    }

    @Override // p5.InterfaceC1832e
    public Object c(String str) {
        return this.f18468a.get(str);
    }

    @Override // p5.AbstractC1829b, p5.InterfaceC1832e
    public boolean e() {
        return this.f18470c;
    }

    @Override // p5.InterfaceC1832e
    public String i() {
        return (String) this.f18468a.get("method");
    }

    @Override // p5.InterfaceC1832e
    public boolean j(String str) {
        return this.f18468a.containsKey(str);
    }

    @Override // p5.AbstractC1828a
    public InterfaceC1833f o() {
        return this.f18469b;
    }

    public Map p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f18469b.f18472b);
        hashMap2.put("message", this.f18469b.f18473c);
        hashMap2.put("data", this.f18469b.f18474d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map q() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f18469b.f18471a);
        return hashMap;
    }

    public void r(k.d dVar) {
        a aVar = this.f18469b;
        dVar.b(aVar.f18472b, aVar.f18473c, aVar.f18474d);
    }

    public void s(List list) {
        if (e()) {
            return;
        }
        list.add(p());
    }

    public void t(List list) {
        if (e()) {
            return;
        }
        list.add(q());
    }
}
