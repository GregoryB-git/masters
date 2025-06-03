package e7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends zzbu implements p0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // e7.p0
    public final void zza(List<w5> list) {
        Parcel b_ = b_();
        b_.writeTypedList(list);
        zzc(2, b_);
    }
}
