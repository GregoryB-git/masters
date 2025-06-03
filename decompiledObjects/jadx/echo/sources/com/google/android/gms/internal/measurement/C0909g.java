package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909g implements InterfaceC0963m, InterfaceC1016s, Iterable {

    /* renamed from: o, reason: collision with root package name */
    public final SortedMap f10956o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f10957p;

    public C0909g() {
        this.f10956o = new TreeMap();
        this.f10957p = new TreeMap();
    }

    public final int D() {
        return this.f10956o.size();
    }

    public final InterfaceC1016s M(int i7) {
        InterfaceC1016s interfaceC1016s;
        if (i7 < U()) {
            return (!Y(i7) || (interfaceC1016s = (InterfaceC1016s) this.f10956o.get(Integer.valueOf(i7))) == null) ? InterfaceC1016s.f11133d : interfaceC1016s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void S(int i7, InterfaceC1016s interfaceC1016s) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i7);
        }
        if (i7 >= U()) {
            X(i7, interfaceC1016s);
            return;
        }
        for (int intValue = ((Integer) this.f10956o.lastKey()).intValue(); intValue >= i7; intValue--) {
            InterfaceC1016s interfaceC1016s2 = (InterfaceC1016s) this.f10956o.get(Integer.valueOf(intValue));
            if (interfaceC1016s2 != null) {
                X(intValue + 1, interfaceC1016s2);
                this.f10956o.remove(Integer.valueOf(intValue));
            }
        }
        X(i7, interfaceC1016s);
    }

    public final void T(InterfaceC1016s interfaceC1016s) {
        X(U(), interfaceC1016s);
    }

    public final int U() {
        if (this.f10956o.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f10956o.lastKey()).intValue() + 1;
    }

    public final String V(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f10956o.isEmpty()) {
            for (int i7 = 0; i7 < U(); i7++) {
                InterfaceC1016s M6 = M(i7);
                sb.append(str);
                if (!(M6 instanceof C1078z) && !(M6 instanceof C0999q)) {
                    sb.append(M6.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void W(int i7) {
        int intValue = ((Integer) this.f10956o.lastKey()).intValue();
        if (i7 > intValue || i7 < 0) {
            return;
        }
        this.f10956o.remove(Integer.valueOf(i7));
        if (i7 == intValue) {
            int i8 = i7 - 1;
            if (this.f10956o.containsKey(Integer.valueOf(i8)) || i8 < 0) {
                return;
            }
            this.f10956o.put(Integer.valueOf(i8), InterfaceC1016s.f11133d);
            return;
        }
        while (true) {
            i7++;
            if (i7 > ((Integer) this.f10956o.lastKey()).intValue()) {
                return;
            }
            InterfaceC1016s interfaceC1016s = (InterfaceC1016s) this.f10956o.get(Integer.valueOf(i7));
            if (interfaceC1016s != null) {
                this.f10956o.put(Integer.valueOf(i7 - 1), interfaceC1016s);
                this.f10956o.remove(Integer.valueOf(i7));
            }
        }
    }

    public final void X(int i7, InterfaceC1016s interfaceC1016s) {
        if (i7 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
        }
        if (interfaceC1016s == null) {
            this.f10956o.remove(Integer.valueOf(i7));
        } else {
            this.f10956o.put(Integer.valueOf(i7), interfaceC1016s);
        }
    }

    public final boolean Y(int i7) {
        if (i7 >= 0 && i7 <= ((Integer) this.f10956o.lastKey()).intValue()) {
            return this.f10956o.containsKey(Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
    }

    public final Iterator Z() {
        return this.f10956o.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final void a(String str, InterfaceC1016s interfaceC1016s) {
        if (interfaceC1016s == null) {
            this.f10957p.remove(str);
        } else {
            this.f10957p.put(str, interfaceC1016s);
        }
    }

    public final List a0() {
        ArrayList arrayList = new ArrayList(U());
        for (int i7 = 0; i7 < U(); i7++) {
            arrayList.add(M(i7));
        }
        return arrayList;
    }

    public final void b0() {
        this.f10956o.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        SortedMap sortedMap;
        Integer num;
        InterfaceC1016s c7;
        C0909g c0909g = new C0909g();
        for (Map.Entry entry : this.f10956o.entrySet()) {
            if (entry.getValue() instanceof InterfaceC0963m) {
                sortedMap = c0909g.f10956o;
                num = (Integer) entry.getKey();
                c7 = (InterfaceC1016s) entry.getValue();
            } else {
                sortedMap = c0909g.f10956o;
                num = (Integer) entry.getKey();
                c7 = ((InterfaceC1016s) entry.getValue()).c();
            }
            sortedMap.put(num, c7);
        }
        return c0909g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0909g)) {
            return false;
        }
        C0909g c0909g = (C0909g) obj;
        if (U() != c0909g.U()) {
            return false;
        }
        if (this.f10956o.isEmpty()) {
            return c0909g.f10956o.isEmpty();
        }
        for (int intValue = ((Integer) this.f10956o.firstKey()).intValue(); intValue <= ((Integer) this.f10956o.lastKey()).intValue(); intValue++) {
            if (!M(intValue).equals(c0909g.M(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return this.f10956o.size() == 1 ? M(0).f() : this.f10956o.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return toString();
    }

    public final int hashCode() {
        return this.f10956o.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final InterfaceC1016s i(String str) {
        InterfaceC1016s interfaceC1016s;
        return "length".equals(str) ? new C0945k(Double.valueOf(U())) : (!q(str) || (interfaceC1016s = (InterfaceC1016s) this.f10957p.get(str)) == null) ? InterfaceC1016s.f11133d : interfaceC1016s;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0927i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return new C0900f(this, this.f10956o.keySet().iterator(), this.f10957p.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final boolean q(String str) {
        return "length".equals(str) || this.f10957p.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, c0904f3, list) : AbstractC0990p.a(this, new C1034u(str), c0904f3, list);
    }

    public final String toString() {
        return V(",");
    }

    public C0909g(List list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                X(i7, (InterfaceC1016s) list.get(i7));
            }
        }
    }

    public C0909g(InterfaceC1016s... interfaceC1016sArr) {
        this(Arrays.asList(interfaceC1016sArr));
    }
}
