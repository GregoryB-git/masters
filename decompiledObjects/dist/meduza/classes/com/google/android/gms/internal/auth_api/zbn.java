package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.internal.auth-api.zbt;
import com.google.android.gms.internal.auth-api.zbv;
import d6.h;

public final class zbn
  extends zba
{
  public zbn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
  }
  
  public final void zbc(zbt paramzbt, SaveAccountLinkingTokenRequest paramSaveAccountLinkingTokenRequest)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbt);
    zbc.zbc(localParcel, paramSaveAccountLinkingTokenRequest);
    zbb(1, localParcel);
  }
  
  public final void zbd(zbv paramzbv, h paramh)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbv);
    zbc.zbc(localParcel, paramh);
    zbb(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */