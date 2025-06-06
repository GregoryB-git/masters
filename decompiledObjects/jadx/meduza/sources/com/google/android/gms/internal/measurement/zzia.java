package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class zzia extends zzhx<Boolean> {
    public zzia(zzif zzifVar, String str, Boolean bool, boolean z10) {
        super(zzifVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzhx
    public final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgw.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzgw.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
