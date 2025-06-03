package m6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class d0 extends zza implements e0 {
    public d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // m6.e0
    public final boolean H2(j6.d0 d0Var, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzc(zza, d0Var);
        zzc.zze(zza, iObjectWrapper);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // m6.e0
    public final j6.b0 N0(j6.z zVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zVar);
        Parcel zzB = zzB(6, zza);
        j6.b0 b0Var = (j6.b0) zzc.zza(zzB, j6.b0.CREATOR);
        zzB.recycle();
        return b0Var;
    }

    @Override // m6.e0
    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
