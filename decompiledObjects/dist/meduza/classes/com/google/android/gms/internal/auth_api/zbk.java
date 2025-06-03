package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.internal.auth-api.zbj;

public final class zbk
  extends zba
{
  public zbk(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
  }
  
  public final void zbc(zbj paramzbj, AuthorizationRequest paramAuthorizationRequest)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbj);
    zbc.zbc(localParcel, paramAuthorizationRequest);
    zbb(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */