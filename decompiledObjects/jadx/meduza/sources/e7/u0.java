package e7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;

/* loaded from: classes.dex */
public final class u0 extends zzbu implements s0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // e7.s0
    public final void E(f6 f6Var) {
        Parcel b_ = b_();
        zzbw.zza(b_, f6Var);
        zzc(2, b_);
    }
}
