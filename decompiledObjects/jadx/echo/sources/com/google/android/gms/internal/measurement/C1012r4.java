package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012r4 extends AbstractC1004q4 {
    public C1012r4() {
        super();
    }

    public static InterfaceC0923h4 e(Object obj, long j7) {
        return (InterfaceC0923h4) D5.B(obj, j7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1004q4
    public final void b(Object obj, Object obj2, long j7) {
        InterfaceC0923h4 e7 = e(obj, j7);
        InterfaceC0923h4 e8 = e(obj2, j7);
        int size = e7.size();
        int size2 = e8.size();
        if (size > 0 && size2 > 0) {
            if (!e7.c()) {
                e7 = e7.e(size2 + size);
            }
            e7.addAll(e8);
        }
        if (size > 0) {
            e8 = e7;
        }
        D5.j(obj, j7, e8);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1004q4
    public final void d(Object obj, long j7) {
        e(obj, j7).G();
    }
}
