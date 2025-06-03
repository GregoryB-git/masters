package j9;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ka.d0;
import ka.u;

/* loaded from: classes.dex */
public final class n implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public d0 f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8699b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n() {
        /*
            r2 = this;
            ka.d0$a r0 = ka.d0.d0()
            ka.u r1 = ka.u.H()
            r0.u(r1)
            ma.w r0 = r0.k()
            ka.d0 r0 = (ka.d0) r0
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.n.<init>():void");
    }

    public n(d0 d0Var) {
        this.f8699b = new HashMap();
        x6.b.Z("ObjectValues should be backed by a MapValue", d0Var.c0() == 11, new Object[0]);
        x6.b.Z("ServerTimestamps should not be used as an ObjectValue", !p.c(d0Var), new Object[0]);
        this.f8698a = d0Var;
    }

    public static k9.d c(u uVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, d0> entry : uVar.J().entrySet()) {
            l lVar = new l(Collections.singletonList(entry.getKey()));
            d0 value = entry.getValue();
            d0 d0Var = s.f8707a;
            if (value != null && value.c0() == 11) {
                Set<l> set = c(entry.getValue().Y()).f9147a;
                if (!set.isEmpty()) {
                    Iterator<l> it = set.iterator();
                    while (it.hasNext()) {
                        hashSet.add(lVar.f(it.next()));
                    }
                }
            }
            hashSet.add(lVar);
        }
        return new k9.d(hashSet);
    }

    public static d0 d(l lVar, d0 d0Var) {
        if (lVar.o()) {
            return d0Var;
        }
        int i10 = 0;
        while (true) {
            int q10 = lVar.q() - 1;
            u Y = d0Var.Y();
            if (i10 >= q10) {
                return Y.K(lVar.m());
            }
            d0Var = Y.K(lVar.n(i10));
            d0 d0Var2 = s.f8707a;
            if (!(d0Var != null && d0Var.c0() == 11)) {
                return null;
            }
            i10++;
        }
    }

    public static n e(Map<String, d0> map) {
        d0.a d02 = d0.d0();
        u.a M = u.M();
        M.m();
        u.G((u) M.f11120b).putAll(map);
        d02.t(M);
        return new n(d02.k());
    }

    public final u a(l lVar, Map<String, Object> map) {
        d0 d10 = d(lVar, this.f8698a);
        d0 d0Var = s.f8707a;
        u.a a10 = d10 != null && d10.c0() == 11 ? d10.Y().a() : u.M();
        boolean z10 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                u a11 = a(lVar.g(key), (Map) value);
                if (a11 != null) {
                    d0.a d02 = d0.d0();
                    d02.u(a11);
                    a10.p(d02.k(), key);
                    z10 = true;
                }
            } else {
                if (value instanceof d0) {
                    a10.p((d0) value, key);
                } else {
                    a10.getClass();
                    key.getClass();
                    if (((u) a10.f11120b).J().containsKey(key)) {
                        x6.b.Z("Expected entry to be a Map, a Value or null", value == null, new Object[0]);
                        a10.m();
                        u.G((u) a10.f11120b).remove(key);
                    }
                }
                z10 = true;
            }
        }
        if (z10) {
            return a10.k();
        }
        return null;
    }

    public final d0 b() {
        synchronized (this.f8699b) {
            u a10 = a(l.f8692c, this.f8699b);
            if (a10 != null) {
                d0.a d02 = d0.d0();
                d02.u(a10);
                this.f8698a = d02.k();
                this.f8699b.clear();
            }
        }
        return this.f8698a;
    }

    public final Object clone() {
        return new n(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return s.g(b(), ((n) obj).b());
        }
        return false;
    }

    public final void f(l lVar, d0 d0Var) {
        x6.b.Z("Cannot set field for empty path on ObjectValue", !lVar.o(), new Object[0]);
        h(lVar, d0Var);
    }

    public final void g(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getKey();
            if (entry.getValue() == null) {
                x6.b.Z("Cannot delete field for empty path on ObjectValue", !lVar.o(), new Object[0]);
                h(lVar, null);
            } else {
                f(lVar, (d0) entry.getValue());
            }
        }
    }

    public final void h(l lVar, d0 d0Var) {
        Map hashMap;
        Map map = this.f8699b;
        for (int i10 = 0; i10 < lVar.q() - 1; i10++) {
            String n2 = lVar.n(i10);
            Object obj = map.get(n2);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof d0) {
                    d0 d0Var2 = (d0) obj;
                    if (d0Var2.c0() == 11) {
                        HashMap hashMap2 = new HashMap(d0Var2.Y().J());
                        map.put(n2, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap();
                map.put(n2, hashMap);
            }
            map = hashMap;
        }
        map.put(lVar.m(), d0Var);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ObjectValue{internalValue=");
        l10.append(s.a(b()));
        l10.append('}');
        return l10.toString();
    }
}
