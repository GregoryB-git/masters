package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_api.zbb;
import com.google.android.gms.internal.auth_api.zbc;
import h6.p;

public abstract class zbq
  extends zbb
  implements p
{
  public zbq()
  {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  public final boolean zba(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Status localStatus;
    switch (paramInt1)
    {
    default: 
      return false;
    case 103: 
      localStatus = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      zbc.zbb(paramParcel1);
      o1(localStatus);
      break;
    case 102: 
      localStatus = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      zbc.zbb(paramParcel1);
      I1(localStatus);
      break;
    case 101: 
      GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)zbc.zba(paramParcel1, GoogleSignInAccount.CREATOR);
      localStatus = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      zbc.zbb(paramParcel1);
      s1(localGoogleSignInAccount, localStatus);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */