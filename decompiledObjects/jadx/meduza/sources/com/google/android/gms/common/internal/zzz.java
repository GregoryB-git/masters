package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import j6.u;
import m6.b0;
import m6.w0;

/* loaded from: classes.dex */
public abstract class zzz extends zzb implements b0 {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static b0 zzg(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof b0 ? (b0) queryLocalInterface : new w0(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper zzd = ((u) this).zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int i12 = ((u) this).f8515a;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
