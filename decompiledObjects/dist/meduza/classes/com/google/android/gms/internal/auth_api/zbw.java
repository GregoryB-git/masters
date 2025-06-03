package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth-api.zbm;
import com.google.android.gms.internal.auth-api.zbp;
import com.google.android.gms.internal.auth-api.zbr;
import d6.b;
import d6.e;
import d6.f;

public final class zbw
  extends zba
{
  public zbw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
  }
  
  public final void zbc(zbm paramzbm, b paramb)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbm);
    zbc.zbc(localParcel, paramb);
    zbb(1, localParcel);
  }
  
  public final void zbd(zbp paramzbp, e parame, String paramString)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbp);
    zbc.zbc(localParcel, parame);
    localParcel.writeString(paramString);
    zbb(4, localParcel);
  }
  
  public final void zbe(zbr paramzbr, f paramf)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramzbr);
    zbc.zbc(localParcel, paramf);
    zbb(3, localParcel);
  }
  
  public final void zbf(IStatusCallback paramIStatusCallback, String paramString)
  {
    Parcel localParcel = zba();
    zbc.zbd(localParcel, paramIStatusCallback);
    localParcel.writeString(paramString);
    zbb(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */