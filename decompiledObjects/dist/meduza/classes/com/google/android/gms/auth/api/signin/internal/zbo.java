package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth_api.zbb;
import g6.a;
import h6.b;
import h6.o;
import m6.j;

public abstract class zbo
  extends zbb
{
  public zbo()
  {
    super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
  }
  
  public final boolean zba(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramParcel1 = (zbt)this;
      paramParcel1.g();
      o.a(a).b();
    }
    else
    {
      Object localObject = (zbt)this;
      ((zbt)localObject).g();
      b localb = b.a(a);
      paramParcel2 = localb.b();
      paramParcel1 = GoogleSignInOptions.t;
      if (paramParcel2 != null) {
        paramParcel1 = localb.c();
      }
      localObject = a;
      j.i(paramParcel1);
      paramParcel1 = new a((Context)localObject, paramParcel1);
      if (paramParcel2 != null) {
        paramParcel1.b();
      } else {
        paramParcel1.signOut();
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zbo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */