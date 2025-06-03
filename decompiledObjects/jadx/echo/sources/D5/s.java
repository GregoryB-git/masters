package D5;

import E5.k;
import java.util.HashMap;
import java.util.Map;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1410a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1411b;

    /* renamed from: c, reason: collision with root package name */
    public E5.k f1412c;

    /* renamed from: d, reason: collision with root package name */
    public k.d f1413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1414e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1415f;

    /* renamed from: g, reason: collision with root package name */
    public final k.c f1416g;

    public class b implements k.c {
        public b() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            Map i7;
            String str = jVar.f1670a;
            Object obj = jVar.f1671b;
            str.hashCode();
            if (str.equals("get")) {
                s.this.f1415f = true;
                if (!s.this.f1414e) {
                    s sVar = s.this;
                    if (sVar.f1410a) {
                        sVar.f1413d = dVar;
                        return;
                    }
                }
                s sVar2 = s.this;
                i7 = sVar2.i(sVar2.f1411b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                s.this.f1411b = (byte[]) obj;
                i7 = null;
            }
            dVar.a(i7);
        }
    }

    public s(E5.k kVar, boolean z7) {
        this.f1414e = false;
        this.f1415f = false;
        b bVar = new b();
        this.f1416g = bVar;
        this.f1412c = kVar;
        this.f1410a = z7;
        kVar.e(bVar);
    }

    public void g() {
        this.f1411b = null;
    }

    public byte[] h() {
        return this.f1411b;
    }

    public final Map i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void j(byte[] bArr) {
        this.f1414e = true;
        k.d dVar = this.f1413d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f1413d = null;
        } else if (this.f1415f) {
            this.f1412c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f1411b = bArr;
    }

    public s(C2105a c2105a, boolean z7) {
        this(new E5.k(c2105a, "flutter/restoration", E5.q.f1685b), z7);
    }

    public class a implements k.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1417a;

        public a(byte[] bArr) {
            this.f1417a = bArr;
        }

        @Override // E5.k.d
        public void a(Object obj) {
            s.this.f1411b = this.f1417a;
        }

        @Override // E5.k.d
        public void b(String str, String str2, Object obj) {
            AbstractC1995b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // E5.k.d
        public void c() {
        }
    }
}
