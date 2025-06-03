package e7;

import android.os.Bundle;
import e7.e3;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {
    public static final x f = new x((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4747d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap<e3.a, g3> f4748e;

    public x() {
        throw null;
    }

    public x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<e3.a, g3> enumMap = new EnumMap<>((Class<e3.a>) e3.a.class);
        this.f4748e = enumMap;
        enumMap.put((EnumMap<e3.a, g3>) e3.a.AD_USER_DATA, (e3.a) e3.f(bool));
        this.f4744a = i10;
        this.f4745b = f();
        this.f4746c = bool2;
        this.f4747d = str;
    }

    public x(EnumMap<e3.a, g3> enumMap, int i10, Boolean bool, String str) {
        EnumMap<e3.a, g3> enumMap2 = new EnumMap<>((Class<e3.a>) e3.a.class);
        this.f4748e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4744a = i10;
        this.f4745b = f();
        this.f4746c = bool;
        this.f4747d = str;
    }

    public static x a(int i10, Bundle bundle) {
        if (bundle == null) {
            return new x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(e3.a.class);
        for (e3.a aVar : f3.DMA.f4199a) {
            enumMap.put((EnumMap) aVar, (e3.a) e3.g(bundle.getString(aVar.f4172a)));
        }
        return new x((EnumMap<e3.a, g3>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static x b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(e3.a.class);
        e3.a[] aVarArr = f3.DMA.f4199a;
        int length = aVarArr.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) aVarArr[i11], (e3.a) e3.e(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new x((EnumMap<e3.a, g3>) enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i10 = w.f4717a[e3.g(bundle.getString("ad_personalization")).ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final g3 d() {
        g3 g3Var = this.f4748e.get(e3.a.AD_USER_DATA);
        return g3Var == null ? g3.UNINITIALIZED : g3Var;
    }

    public final boolean e() {
        Iterator<g3> it = this.f4748e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != g3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f4745b.equalsIgnoreCase(xVar.f4745b) && Objects.equals(this.f4746c, xVar.f4746c)) {
            return Objects.equals(this.f4747d, xVar.f4747d);
        }
        return false;
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4744a);
        for (e3.a aVar : f3.DMA.f4199a) {
            sb2.append(":");
            sb2.append(e3.a(this.f4748e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Boolean bool = this.f4746c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f4747d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i10 * 29) + this.f4745b.hashCode();
    }

    public final String toString() {
        int i10;
        String str;
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(e3.h(this.f4744a));
        for (e3.a aVar : f3.DMA.f4199a) {
            sb2.append(",");
            sb2.append(aVar.f4172a);
            sb2.append("=");
            g3 g3Var = this.f4748e.get(aVar);
            if (g3Var == null || (i10 = w.f4717a[g3Var.ordinal()]) == 1) {
                sb2.append("uninitialized");
            } else {
                if (i10 == 2) {
                    str = "eu_consent_policy";
                } else if (i10 == 3) {
                    str = "denied";
                } else if (i10 == 4) {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        if (this.f4746c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f4746c);
        }
        if (this.f4747d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f4747d);
        }
        return sb2.toString();
    }
}
