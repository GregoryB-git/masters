package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class W2 extends S2 {
    public W2(C0859a3 c0859a3, String str, Long l7, boolean z7) {
        super(c0859a3, str, l7);
    }

    @Override // com.google.android.gms.internal.measurement.S2
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
