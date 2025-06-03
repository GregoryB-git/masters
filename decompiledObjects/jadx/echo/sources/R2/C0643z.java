package R2;

import R2.C0585q3;
import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: R2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643z {

    /* renamed from: f, reason: collision with root package name */
    public static final C0643z f5622f = new C0643z((Boolean) null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final int f5623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5624b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f5625c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5626d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f5627e;

    public C0643z(Boolean bool, int i7) {
        this(bool, i7, (Boolean) null, (String) null);
    }

    public static C0643z b(Bundle bundle, int i7) {
        if (bundle == null) {
            return new C0643z((Boolean) null, i7);
        }
        EnumMap enumMap = new EnumMap(C0585q3.a.class);
        for (C0585q3.a aVar : EnumC0578p3.DMA.c()) {
            enumMap.put((EnumMap) aVar, (C0585q3.a) C0585q3.q(bundle.getString(aVar.f5499o)));
        }
        return new C0643z(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C0643z c(String str) {
        if (str == null || str.length() <= 0) {
            return f5622f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C0585q3.a.class);
        C0585q3.a[] c7 = EnumC0578p3.DMA.c();
        int length = c7.length;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            enumMap.put((EnumMap) c7[i8], (C0585q3.a) C0585q3.g(split[i7].charAt(0)));
            i8++;
            i7++;
        }
        return new C0643z(enumMap, parseInt);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return C0585q3.q(bundle.getString("ad_personalization"));
    }

    public final int a() {
        return this.f5623a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f5627e.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((C0585q3.a) entry.getKey()).f5499o, C0585q3.j(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.f5625c;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.f5626d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0643z)) {
            return false;
        }
        C0643z c0643z = (C0643z) obj;
        if (this.f5624b.equalsIgnoreCase(c0643z.f5624b) && AbstractC0636y.a(this.f5625c, c0643z.f5625c)) {
            return AbstractC0636y.a(this.f5626d, c0643z.f5626d);
        }
        return false;
    }

    public final Boolean f() {
        return (Boolean) this.f5627e.get(C0585q3.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f5625c;
    }

    public final String h() {
        return this.f5626d;
    }

    public final int hashCode() {
        Boolean bool = this.f5625c;
        int i7 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f5626d;
        return this.f5624b.hashCode() + (i7 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f5624b;
    }

    public final boolean j() {
        Iterator it = this.f5627e.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final String k() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5623a);
        for (C0585q3.a aVar : EnumC0578p3.DMA.c()) {
            sb.append(":");
            sb.append(C0585q3.a((Boolean) this.f5627e.get(aVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C0585q3.h(this.f5623a));
        for (C0585q3.a aVar : EnumC0578p3.DMA.c()) {
            sb.append(",");
            sb.append(aVar.f5499o);
            sb.append("=");
            Boolean bool = (Boolean) this.f5627e.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f5625c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f5625c);
        }
        if (this.f5626d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f5626d);
        }
        return sb.toString();
    }

    public C0643z(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(C0585q3.a.class);
        this.f5627e = enumMap;
        enumMap.put((EnumMap) C0585q3.a.AD_USER_DATA, (C0585q3.a) bool);
        this.f5623a = i7;
        this.f5624b = k();
        this.f5625c = bool2;
        this.f5626d = str;
    }

    public C0643z(EnumMap enumMap, int i7) {
        this(enumMap, i7, (Boolean) null, (String) null);
    }

    public C0643z(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(C0585q3.a.class);
        this.f5627e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f5623a = i7;
        this.f5624b = k();
        this.f5625c = bool;
        this.f5626d = str;
    }
}
