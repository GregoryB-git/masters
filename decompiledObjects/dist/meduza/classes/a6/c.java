package a6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

public final class c
  extends zza
  implements d
{
  public c(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.account.IWorkAccountService");
  }
  
  public final void R2(b paramb, String paramString)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramb);
    localParcel.writeString(paramString);
    zzc(2, localParcel);
  }
  
  public final void u2(boolean paramBoolean)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeInt(paramBoolean);
    zzc(1, localParcel);
  }
  
  public final void z2(b paramb, Account paramAccount)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramb);
    zzc.zzc(localParcel, paramAccount);
    zzc(3, localParcel);
  }
}

/* Location:
 * Qualified Name:     a6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */