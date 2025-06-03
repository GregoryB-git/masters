package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class O4 implements Z4 {

    /* renamed from: a, reason: collision with root package name */
    public final I4 f10532a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1067x5 f10533b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10534c;

    /* renamed from: d, reason: collision with root package name */
    public final O3 f10535d;

    public O4(AbstractC1067x5 abstractC1067x5, O3 o32, I4 i42) {
        this.f10533b = abstractC1067x5;
        this.f10534c = o32.d(i42);
        this.f10535d = o32;
        this.f10532a = i42;
    }

    public static O4 j(AbstractC1067x5 abstractC1067x5, O3 o32, I4 i42) {
        return new O4(abstractC1067x5, o32, i42);
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final Object a() {
        I4 i42 = this.f10532a;
        return i42 instanceof Y3 ? ((Y3) i42).y() : i42.d().i();
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final int b(Object obj) {
        AbstractC1067x5 abstractC1067x5 = this.f10533b;
        int e7 = abstractC1067x5.e(abstractC1067x5.k(obj));
        return this.f10534c ? e7 + this.f10535d.b(obj).a() : e7;
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean c(Object obj) {
        return this.f10535d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void d(Object obj, Object obj2) {
        AbstractC0861a5.n(this.f10533b, obj, obj2);
        if (this.f10534c) {
            AbstractC0861a5.l(this.f10535d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void e(Object obj) {
        this.f10533b.l(obj);
        this.f10535d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final int f(Object obj) {
        int hashCode = this.f10533b.k(obj).hashCode();
        return this.f10534c ? (hashCode * 53) + this.f10535d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0994p3 c0994p3) {
        Y3 y32 = (Y3) obj;
        if (y32.zzb == C1049v5.k()) {
            y32.zzb = C1049v5.l();
        }
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean h(Object obj, Object obj2) {
        if (!this.f10533b.k(obj).equals(this.f10533b.k(obj2))) {
            return false;
        }
        if (this.f10534c) {
            return this.f10535d.b(obj).equals(this.f10535d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void i(Object obj, T5 t52) {
        Iterator l7 = this.f10535d.b(obj).l();
        if (l7.hasNext()) {
            android.support.v4.media.a.a(((Map.Entry) l7.next()).getKey());
            throw null;
        }
        AbstractC1067x5 abstractC1067x5 = this.f10533b;
        abstractC1067x5.d(abstractC1067x5.k(obj), t52);
    }
}
