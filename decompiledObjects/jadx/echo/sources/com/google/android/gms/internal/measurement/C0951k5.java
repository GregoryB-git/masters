package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951k5 implements Comparable, Map.Entry {

    /* renamed from: o, reason: collision with root package name */
    public final Comparable f11012o;

    /* renamed from: p, reason: collision with root package name */
    public Object f11013p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0888d5 f11014q;

    public C0951k5(AbstractC0888d5 abstractC0888d5, Comparable comparable, Object obj) {
        this.f11014q = abstractC0888d5;
        this.f11012o = comparable;
        this.f11013p = obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C0951k5) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c(this.f11012o, entry.getKey()) && c(this.f11013p, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f11012o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11013p;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11012o;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11013p;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11014q.q();
        Object obj2 = this.f11013p;
        this.f11013p = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f11012o) + "=" + String.valueOf(this.f11013p);
    }

    public C0951k5(AbstractC0888d5 abstractC0888d5, Map.Entry entry) {
        this(abstractC0888d5, (Comparable) entry.getKey(), entry.getValue());
    }
}
