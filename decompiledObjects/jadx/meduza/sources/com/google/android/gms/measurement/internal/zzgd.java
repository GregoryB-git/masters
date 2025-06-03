package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.a5;
import e7.p0;
import e7.w5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzgd extends zzbx implements p0 {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(w5.CREATOR);
        zzbw.zzb(parcel);
        ((a5) this).zza(createTypedArrayList);
        return true;
    }
}
