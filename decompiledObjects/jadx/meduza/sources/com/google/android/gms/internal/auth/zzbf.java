package com.google.android.gms.internal.auth;

import android.os.Parcel;
import f6.b;

/* loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b bVar = (b) zzc.zza(parcel, b.CREATOR);
            zzc.zzb(parcel);
            zzb(bVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
