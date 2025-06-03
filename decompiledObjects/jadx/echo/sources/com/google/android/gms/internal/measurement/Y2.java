package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class Y2 extends S2 {
    public Y2(C0859a3 c0859a3, String str, Double d7, boolean z7) {
        super(c0859a3, str, d7);
    }

    @Override // com.google.android.gms.internal.measurement.S2
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
