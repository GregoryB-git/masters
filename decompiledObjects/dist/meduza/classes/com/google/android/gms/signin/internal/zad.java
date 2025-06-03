package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import h7.d;
import h7.f;
import h7.j;

public abstract class zad
  extends zab
  implements d
{
  public zad()
  {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    switch (paramInt1)
    {
    case 5: 
    default: 
      return false;
    case 9: 
      localObject = (f)zac.zaa(paramParcel1, f.CREATOR);
      break;
    case 8: 
      localObject = (j)zac.zaa(paramParcel1, j.CREATOR);
      zac.zab(paramParcel1);
      L1((j)localObject);
      break;
    case 7: 
      localObject = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      localObject = (GoogleSignInAccount)zac.zaa(paramParcel1, GoogleSignInAccount.CREATOR);
      break;
    case 4: 
    case 6: 
      localObject = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      break;
    case 3: 
      localObject = (j6.b)zac.zaa(paramParcel1, j6.b.CREATOR);
      localObject = (h7.b)zac.zaa(paramParcel1, h7.b.CREATOR);
    }
    zac.zab(paramParcel1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */