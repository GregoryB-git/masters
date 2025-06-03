package com.google.firebase.dynamiclinks.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import t9.b;
import v8.c;

public final class b$d
  extends b.a
{
  public final TaskCompletionSource<c> a;
  public final b<w7.a> b;
  
  public b$d(b<w7.a> paramb, TaskCompletionSource<c> paramTaskCompletionSource)
  {
    b = paramb;
    a = paramTaskCompletionSource;
  }
  
  public final void m2(Status paramStatus, w8.a parama)
  {
    Object localObject;
    if (parama == null) {
      localObject = null;
    } else {
      localObject = new c(parama);
    }
    a0.K(paramStatus, localObject, a);
    if (parama == null) {
      return;
    }
    paramStatus = parama.D().getBundle("scionData");
    if ((paramStatus != null) && (paramStatus.keySet() != null))
    {
      w7.a locala = (w7.a)b.get();
      if (locala == null) {
        return;
      }
      localObject = paramStatus.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        parama = (String)((Iterator)localObject).next();
        locala.b("fdl", parama, paramStatus.getBundle(parama));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */