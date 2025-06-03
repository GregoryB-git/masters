package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a.f;
import l6.q;
import v8.d;

public final class b$c
  extends q<a, d>
{
  public final Bundle d;
  
  public b$c(Bundle paramBundle)
  {
    super(null, false, 13202);
    d = paramBundle;
  }
  
  public final void a(a.f paramf, TaskCompletionSource paramTaskCompletionSource)
  {
    paramf = (a)paramf;
    paramTaskCompletionSource = new b.b(paramTaskCompletionSource);
    Bundle localBundle = d;
    paramf.getClass();
    try
    {
      ((IDynamicLinksService)paramf.getService()).L(paramTaskCompletionSource, localBundle);
      return;
    }
    catch (RemoteException paramf)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */