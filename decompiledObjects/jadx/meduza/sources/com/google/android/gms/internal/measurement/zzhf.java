package com.google.android.gms.internal.measurement;

import android.content.Context;
import n7.h;
import n7.q;

/* loaded from: classes.dex */
final class zzhf extends zzie {
    private final Context zza;
    private final q<h<zzhr>> zzb;

    public zzhf(Context context, q<h<zzhr>> qVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzie) {
            zzie zzieVar = (zzie) obj;
            if (this.zza.equals(zzieVar.zza())) {
                q<h<zzhr>> qVar = this.zzb;
                q<h<zzhr>> zzb = zzieVar.zzb();
                if (qVar != null ? qVar.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        q<h<zzhr>> qVar = this.zzb;
        return hashCode ^ (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzie
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzie
    public final q<h<zzhr>> zzb() {
        return this.zzb;
    }
}
