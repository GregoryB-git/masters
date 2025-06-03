package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r implements InterfaceC0963m, InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final Map f11119o = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final void a(String str, InterfaceC1016s interfaceC1016s) {
        if (interfaceC1016s == null) {
            this.f11119o.remove(str);
        } else {
            this.f11119o.put(str, interfaceC1016s);
        }
    }

    public final List b() {
        return new ArrayList(this.f11119o.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        Map map;
        String str;
        InterfaceC1016s c7;
        r rVar = new r();
        for (Map.Entry entry : this.f11119o.entrySet()) {
            if (entry.getValue() instanceof InterfaceC0963m) {
                map = rVar.f11119o;
                str = (String) entry.getKey();
                c7 = (InterfaceC1016s) entry.getValue();
            } else {
                map = rVar.f11119o;
                str = (String) entry.getKey();
                c7 = ((InterfaceC1016s) entry.getValue()).c();
            }
            map.put(str, c7);
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f11119o.equals(((r) obj).f11119o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return "[object Object]";
    }

    public int hashCode() {
        return this.f11119o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final InterfaceC1016s i(String str) {
        return this.f11119o.containsKey(str) ? (InterfaceC1016s) this.f11119o.get(str) : InterfaceC1016s.f11133d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return AbstractC0990p.b(this.f11119o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final boolean q(String str) {
        return this.f11119o.containsKey(str);
    }

    public InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        return "toString".equals(str) ? new C1034u(toString()) : AbstractC0990p.a(this, new C1034u(str), c0904f3, list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f11119o.isEmpty()) {
            for (String str : this.f11119o.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f11119o.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
