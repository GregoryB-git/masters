package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084z5 extends AbstractC1067x5 {
    public static void m(Object obj, C1049v5 c1049v5) {
        ((Y3) obj).zzb = c1049v5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ int a(Object obj) {
        return ((C1049v5) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        C1049v5 c1049v5 = (C1049v5) obj;
        C1049v5 c1049v52 = (C1049v5) obj2;
        return C1049v5.k().equals(c1049v52) ? c1049v5 : C1049v5.k().equals(c1049v5) ? C1049v5.c(c1049v5, c1049v52) : c1049v5.b(c1049v52);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void c(Object obj, int i7, AbstractC1003q3 abstractC1003q3) {
        ((C1049v5) obj).e((i7 << 3) | 2, abstractC1003q3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void d(Object obj, T5 t52) {
        ((C1049v5) obj).g(t52);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ int e(Object obj) {
        return ((C1049v5) obj).i();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void f(Object obj, int i7, long j7) {
        ((C1049v5) obj).e(i7 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void g(Object obj, T5 t52) {
        ((C1049v5) obj).j(t52);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C1049v5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ Object i(Object obj) {
        C1049v5 c1049v5 = ((Y3) obj).zzb;
        if (c1049v5 != C1049v5.k()) {
            return c1049v5;
        }
        C1049v5 l7 = C1049v5.l();
        m(obj, l7);
        return l7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (C1049v5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final /* synthetic */ Object k(Object obj) {
        return ((Y3) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067x5
    public final void l(Object obj) {
        ((Y3) obj).zzb.m();
    }
}
