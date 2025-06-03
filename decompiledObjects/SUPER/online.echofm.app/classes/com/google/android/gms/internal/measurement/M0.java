package com.google.android.gms.internal.measurement;

import A2.n;
import H2.b;
import R2.H2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

public final class M0
  extends J0.a
{
  public M0(J0 paramJ0, String paramString1, String paramString2, Context paramContext, Bundle paramBundle)
  {
    super(paramJ0);
  }
  
  public final void a()
  {
    try
    {
      if (J0.y(w, s, t))
      {
        String str1 = t;
        localObject2 = s;
        str2 = J0.A(w);
        localObject3 = str1;
      }
    }
    catch (Exception localException)
    {
      break label214;
    }
    String str2 = null;
    Object localObject1 = str2;
    Object localObject3 = localObject1;
    Object localObject2 = localObject1;
    n.i(u);
    localObject1 = w;
    J0.o((J0)localObject1, ((J0)localObject1).c(u, true));
    if (J0.d(w) == null)
    {
      Log.w(J0.A(w), "Failed to connect to measurement client.");
      return;
    }
    int i = DynamiteModule.a(u, "com.google.android.gms.measurement.dynamite");
    int j = DynamiteModule.b(u, "com.google.android.gms.measurement.dynamite");
    int k = Math.max(i, j);
    boolean bool;
    if (j < i) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = new com/google/android/gms/internal/measurement/H0;
    ((H0)localObject1).<init>(82001L, k, bool, str2, (String)localObject2, (String)localObject3, v, H2.a(u));
    ((x0)n.i(J0.d(w))).initialize(b.Z0(u), (H0)localObject1, o);
    return;
    label214:
    J0.q(w, (Exception)localObject1, true, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.M0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */