package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class zzid extends zzhx<Double> {
    public zzid(zzif zzifVar, String str, Double d10, boolean z10) {
        super(zzifVar, str, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhx
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final Double zza(Object obj) {
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
        Log.e("PhenotypeFlag", "Invalid double value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
