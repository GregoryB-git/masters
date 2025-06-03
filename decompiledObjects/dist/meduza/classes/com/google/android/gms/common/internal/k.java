package com.google.android.gms.common.internal;

import android.os.Bundle;
import j6.b;
import m6.a0;

public final class k
  extends a0
{
  public k(a parama, int paramInt, Bundle paramBundle)
  {
    super(parama, paramInt, paramBundle);
  }
  
  public final void c(b paramb)
  {
    if ((g.enableLocalFallback()) && (a.zzo(g)))
    {
      a.zzk(g, 16);
      return;
    }
    g.zzc.a(paramb);
    g.onConnectionFailed(paramb);
  }
  
  public final boolean d()
  {
    g.zzc.a(b.e);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */