package a6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes.dex */
public final class c extends zza implements d {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // a6.d
    public final void R2(b bVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, bVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // a6.d
    public final void u2(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // a6.d
    public final void z2(b bVar, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, bVar);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }
}
