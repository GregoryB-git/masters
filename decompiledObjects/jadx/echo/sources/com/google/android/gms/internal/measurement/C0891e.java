package com.google.android.gms.internal.measurement;

import X2.AbstractC0706y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891e {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0706y f10877d = AbstractC0706y.a0("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f10878a;

    /* renamed from: b, reason: collision with root package name */
    public long f10879b;

    /* renamed from: c, reason: collision with root package name */
    public Map f10880c;

    public C0891e(String str, long j7, Map map) {
        this.f10878a = str;
        this.f10879b = j7;
        HashMap hashMap = new HashMap();
        this.f10880c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (!f10877d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                return ((obj instanceof String) || obj == null) ? obj2 : obj;
            }
            if (obj instanceof Double) {
                return obj2;
            }
            if (!(obj instanceof Long)) {
                return obj instanceof String ? obj2.toString() : obj2;
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f10879b;
    }

    public final Object b(String str) {
        if (this.f10880c.containsKey(str)) {
            return this.f10880c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C0891e(this.f10878a, this.f10879b, new HashMap(this.f10880c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f10880c.remove(str);
        } else {
            this.f10880c.put(str, c(str, this.f10880c.get(str), obj));
        }
    }

    public final String e() {
        return this.f10878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0891e)) {
            return false;
        }
        C0891e c0891e = (C0891e) obj;
        if (this.f10879b == c0891e.f10879b && this.f10878a.equals(c0891e.f10878a)) {
            return this.f10880c.equals(c0891e.f10880c);
        }
        return false;
    }

    public final void f(String str) {
        this.f10878a = str;
    }

    public final Map g() {
        return this.f10880c;
    }

    public final int hashCode() {
        int hashCode = this.f10878a.hashCode() * 31;
        long j7 = this.f10879b;
        return ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f10880c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f10878a + "', timestamp=" + this.f10879b + ", params=" + String.valueOf(this.f10880c) + "}";
    }
}
