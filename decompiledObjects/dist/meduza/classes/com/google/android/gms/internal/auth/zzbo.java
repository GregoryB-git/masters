package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import b6.c;
import com.google.android.gms.tasks.Task;
import f6.b;
import k6.d;
import k6.d.a;
import l6.q.a;

public final class zzbo
  extends d
{
  public zzbo(Activity paramActivity, c paramc)
  {
    super(paramActivity, locala, localc, d.a.c);
  }
  
  public zzbo(Context paramContext, c paramc)
  {
    super(paramContext, locala, localc, d.a.c);
  }
  
  public final Task<String> getSpatulaHeader()
  {
    q.a locala = new q.a();
    a = new zzbk(this);
    d = 1520;
    return doRead(locala.a());
  }
  
  public final Task<b> performProxyRequest(f6.a parama)
  {
    q.a locala = new q.a();
    a = new zzbl(this, parama);
    d = 1518;
    return doWrite(locala.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */