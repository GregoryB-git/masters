package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.base.zaa;
import g7.f;
import h7.h;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k6.e.a;
import k6.e.b;
import l6.d;
import l6.d0;
import l6.g0;
import l6.q0;
import l6.r0;
import m6.x;

public final class zact
  extends com.google.android.gms.signin.internal.zac
  implements e.a, e.b
{
  public static final g7.b v = g7.e.a;
  public final Context a;
  public final Handler b;
  public final g7.b c;
  public final Set d;
  public final m6.a e;
  public f f;
  public r0 u;
  
  public zact(Context paramContext, Handler paramHandler, m6.a parama)
  {
    a = paramContext;
    b = paramHandler;
    e = parama;
    d = b;
    c = localb;
  }
  
  public final void L1(h7.j paramj)
  {
    paramj = new q0(0, this, paramj);
    b.post(paramj);
  }
  
  public final void g(j6.b paramb)
  {
    ((g0)u).b(paramb);
  }
  
  public final void r(int paramInt)
  {
    Object localObject = (g0)u;
    localObject = (d0)f.r.get(b);
    if (localObject != null) {
      if (w) {
        ((d0)localObject).p(new j6.b(17));
      } else {
        ((d0)localObject).r(paramInt);
      }
    }
  }
  
  public final void s()
  {
    Object localObject1 = (h7.a)f;
    localObject1.getClass();
    try
    {
      Object localObject2 = b.a;
      if (localObject2 == null) {
        localObject2 = new Account("<<default account>>", "com.google");
      }
      if ("<<default account>>".equals(name)) {
        localObject3 = h6.b.a(((com.google.android.gms.common.internal.a)localObject1).getContext()).b();
      } else {
        localObject3 = null;
      }
      x localx = new m6/x;
      Integer localInteger = d;
      m6.j.i(localInteger);
      localx.<init>(2, (Account)localObject2, localInteger.intValue(), (GoogleSignInAccount)localObject3);
      localObject3 = (h7.e)((com.google.android.gms.common.internal.a)localObject1).getService();
      localObject2 = new h7/h;
      ((h)localObject2).<init>(1, localx);
      localObject1 = ((zaa)localObject3).zaa();
      com.google.android.gms.internal.base.zac.zac((Parcel)localObject1, (Parcelable)localObject2);
      com.google.android.gms.internal.base.zac.zad((Parcel)localObject1, this);
      ((zaa)localObject3).zac(12, (Parcel)localObject1);
    }
    catch (RemoteException localRemoteException1)
    {
      Object localObject3;
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try
      {
        localObject1 = new h7/j;
        localObject3 = new j6/b;
        ((j6.b)localObject3).<init>(8, null);
        ((h7.j)localObject1).<init>(1, (j6.b)localObject3, null);
        L1((h7.j)localObject1);
      }
      catch (RemoteException localRemoteException2)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zact
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */