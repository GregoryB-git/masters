package com.google.firebase.dynamiclinks.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a.f;
import l6.q;
import t9.b;
import v8.c;

public final class b$e
  extends q<a, c>
{
  public final String d;
  public final b<w7.a> e;
  
  public b$e(b<w7.a> paramb, String paramString)
  {
    super(null, false, 13201);
    d = paramString;
    e = paramb;
  }
  
  public final void a(a.f paramf, TaskCompletionSource paramTaskCompletionSource)
  {
    paramf = (a)paramf;
    b.d locald = new b.d(e, paramTaskCompletionSource);
    paramTaskCompletionSource = d;
    paramf.getClass();
    try
    {
      ((IDynamicLinksService)paramf.getService()).R1(locald, paramTaskCompletionSource);
      return;
    }
    catch (RemoteException paramf)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */