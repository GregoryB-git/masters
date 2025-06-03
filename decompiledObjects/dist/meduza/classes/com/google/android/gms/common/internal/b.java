package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import j6.d;
import m6.o0;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new o0();
  public static final Scope[] w = new Scope[0];
  public static final d[] x = new d[0];
  public final int a;
  public final int b;
  public final int c;
  public String d;
  public IBinder e;
  public Scope[] f;
  public Bundle o;
  public Account p;
  public d[] q;
  public d[] r;
  public final boolean s;
  public final int t;
  public boolean u;
  public final String v;
  
  public b(int paramInt1, int paramInt2, int paramInt3, String paramString1, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, d[] paramArrayOfd1, d[] paramArrayOfd2, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, String paramString2)
  {
    Scope[] arrayOfScope = paramArrayOfScope;
    if (paramArrayOfScope == null) {
      arrayOfScope = w;
    }
    paramArrayOfScope = paramBundle;
    if (paramBundle == null) {
      paramArrayOfScope = new Bundle();
    }
    paramBundle = paramArrayOfd1;
    if (paramArrayOfd1 == null) {
      paramBundle = x;
    }
    paramArrayOfd1 = paramArrayOfd2;
    if (paramArrayOfd2 == null) {
      paramArrayOfd1 = x;
    }
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    if ("com.google.android.gms".equals(paramString1)) {
      d = "com.google.android.gms";
    } else {
      d = paramString1;
    }
    if (paramInt1 < 2)
    {
      if (paramIBinder != null) {
        paramString1 = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(paramIBinder));
      } else {
        paramString1 = null;
      }
      p = paramString1;
    }
    else
    {
      e = paramIBinder;
      p = paramAccount;
    }
    f = arrayOfScope;
    o = paramArrayOfScope;
    q = paramBundle;
    r = paramArrayOfd1;
    s = paramBoolean1;
    t = paramInt4;
    u = paramBoolean2;
    v = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o0.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */