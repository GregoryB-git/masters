package a4;

import Y3.m;
import b4.C0800b;
import b4.C0801c;
import b4.InterfaceC0802d;
import d4.C1226a;
import d4.C1227b;
import d4.n;
import d4.o;
import d4.q;
import d4.r;
import d4.t;
import f4.AbstractC1292b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final h f8107i = new h();

    /* renamed from: a, reason: collision with root package name */
    public Integer f8108a;

    /* renamed from: b, reason: collision with root package name */
    public b f8109b;

    /* renamed from: c, reason: collision with root package name */
    public n f8110c = null;

    /* renamed from: d, reason: collision with root package name */
    public C1227b f8111d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f8112e = null;

    /* renamed from: f, reason: collision with root package name */
    public C1227b f8113f = null;

    /* renamed from: g, reason: collision with root package name */
    public d4.h f8114g = q.j();

    /* renamed from: h, reason: collision with root package name */
    public String f8115h = null;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8116a;

        static {
            int[] iArr = new int[b.values().length];
            f8116a = iArr;
            try {
                iArr[b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8116a[b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        LEFT,
        RIGHT
    }

    public static h c(Map map) {
        h hVar = new h();
        hVar.f8108a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            hVar.f8110c = v(o.a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                hVar.f8111d = C1227b.j(str);
            }
        }
        if (map.containsKey("ep")) {
            hVar.f8112e = v(o.a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                hVar.f8113f = C1227b.j(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            hVar.f8109b = str3.equals("l") ? b.LEFT : b.RIGHT;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            hVar.f8114g = d4.h.b(str4);
        }
        return hVar;
    }

    public static n v(n nVar) {
        if ((nVar instanceof t) || (nVar instanceof C1226a) || (nVar instanceof d4.f) || (nVar instanceof d4.g)) {
            return nVar;
        }
        if (nVar instanceof d4.l) {
            return new d4.f(Double.valueOf(((Long) nVar.getValue()).doubleValue()), r.a());
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + nVar.getValue());
    }

    public final h a() {
        h hVar = new h();
        hVar.f8108a = this.f8108a;
        hVar.f8110c = this.f8110c;
        hVar.f8111d = this.f8111d;
        hVar.f8112e = this.f8112e;
        hVar.f8113f = this.f8113f;
        hVar.f8109b = this.f8109b;
        hVar.f8114g = this.f8114g;
        return hVar;
    }

    public h b(n nVar, C1227b c1227b) {
        m.f(nVar.B() || nVar.isEmpty());
        m.f(!(nVar instanceof d4.l));
        h a7 = a();
        a7.f8112e = nVar;
        a7.f8113f = c1227b;
        return a7;
    }

    public d4.h d() {
        return this.f8114g;
    }

    public C1227b e() {
        if (!m()) {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        C1227b c1227b = this.f8113f;
        return c1227b != null ? c1227b : C1227b.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        Integer num = this.f8108a;
        if (num == null ? hVar.f8108a != null : !num.equals(hVar.f8108a)) {
            return false;
        }
        d4.h hVar2 = this.f8114g;
        if (hVar2 == null ? hVar.f8114g != null : !hVar2.equals(hVar.f8114g)) {
            return false;
        }
        C1227b c1227b = this.f8113f;
        if (c1227b == null ? hVar.f8113f != null : !c1227b.equals(hVar.f8113f)) {
            return false;
        }
        n nVar = this.f8112e;
        if (nVar == null ? hVar.f8112e != null : !nVar.equals(hVar.f8112e)) {
            return false;
        }
        C1227b c1227b2 = this.f8111d;
        if (c1227b2 == null ? hVar.f8111d != null : !c1227b2.equals(hVar.f8111d)) {
            return false;
        }
        n nVar2 = this.f8110c;
        if (nVar2 == null ? hVar.f8110c == null : nVar2.equals(hVar.f8110c)) {
            return r() == hVar.r();
        }
        return false;
    }

    public n f() {
        if (m()) {
            return this.f8112e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public C1227b g() {
        if (!o()) {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        C1227b c1227b = this.f8111d;
        return c1227b != null ? c1227b : C1227b.n();
    }

    public n h() {
        if (o()) {
            return this.f8110c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public int hashCode() {
        Integer num = this.f8108a;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (r() ? 1231 : 1237)) * 31;
        n nVar = this.f8110c;
        int hashCode = (intValue + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C1227b c1227b = this.f8111d;
        int hashCode2 = (hashCode + (c1227b != null ? c1227b.hashCode() : 0)) * 31;
        n nVar2 = this.f8112e;
        int hashCode3 = (hashCode2 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C1227b c1227b2 = this.f8113f;
        int hashCode4 = (hashCode3 + (c1227b2 != null ? c1227b2.hashCode() : 0)) * 31;
        d4.h hVar = this.f8114g;
        return hashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }

    public int i() {
        if (n()) {
            return this.f8108a.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public InterfaceC0802d j() {
        return u() ? new C0800b(d()) : n() ? new C0801c(this) : new b4.e(this);
    }

    public Map k() {
        HashMap hashMap = new HashMap();
        if (o()) {
            hashMap.put("sp", this.f8110c.getValue());
            C1227b c1227b = this.f8111d;
            if (c1227b != null) {
                hashMap.put("sn", c1227b.e());
            }
        }
        if (m()) {
            hashMap.put("ep", this.f8112e.getValue());
            C1227b c1227b2 = this.f8113f;
            if (c1227b2 != null) {
                hashMap.put("en", c1227b2.e());
            }
        }
        Integer num = this.f8108a;
        if (num != null) {
            hashMap.put("l", num);
            b bVar = this.f8109b;
            if (bVar == null) {
                bVar = o() ? b.LEFT : b.RIGHT;
            }
            int i7 = a.f8116a[bVar.ordinal()];
            if (i7 == 1) {
                hashMap.put("vf", "l");
            } else if (i7 == 2) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.f8114g.equals(q.j())) {
            hashMap.put("i", this.f8114g.c());
        }
        return hashMap;
    }

    public boolean l() {
        return n() && this.f8109b != null;
    }

    public boolean m() {
        return this.f8112e != null;
    }

    public boolean n() {
        return this.f8108a != null;
    }

    public boolean o() {
        return this.f8110c != null;
    }

    public boolean p() {
        return u() && this.f8114g.equals(q.j());
    }

    public boolean q() {
        return (o() && m() && n() && !l()) ? false : true;
    }

    public boolean r() {
        b bVar = this.f8109b;
        return bVar != null ? bVar == b.LEFT : o();
    }

    public h s(int i7) {
        h a7 = a();
        a7.f8108a = Integer.valueOf(i7);
        a7.f8109b = b.LEFT;
        return a7;
    }

    public h t(int i7) {
        h a7 = a();
        a7.f8108a = Integer.valueOf(i7);
        a7.f8109b = b.RIGHT;
        return a7;
    }

    public String toString() {
        return k().toString();
    }

    public boolean u() {
        return (o() || m() || n()) ? false : true;
    }

    public h w(d4.h hVar) {
        h a7 = a();
        a7.f8114g = hVar;
        return a7;
    }

    public h x(n nVar, C1227b c1227b) {
        m.f(nVar.B() || nVar.isEmpty());
        m.f(!(nVar instanceof d4.l));
        h a7 = a();
        a7.f8110c = nVar;
        a7.f8111d = c1227b;
        return a7;
    }

    public String y() {
        if (this.f8115h == null) {
            try {
                this.f8115h = AbstractC1292b.c(k());
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        return this.f8115h;
    }
}
