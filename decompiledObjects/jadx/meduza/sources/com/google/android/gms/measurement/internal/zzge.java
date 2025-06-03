package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.c5;
import e7.f6;
import e7.s0;

/* loaded from: classes.dex */
public abstract class zzge extends zzbx implements s0 {
    public zzge() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        f6 f6Var = (f6) zzbw.zza(parcel, f6.CREATOR);
        zzbw.zzb(parcel);
        ((c5) this).E(f6Var);
        return true;
    }
}
