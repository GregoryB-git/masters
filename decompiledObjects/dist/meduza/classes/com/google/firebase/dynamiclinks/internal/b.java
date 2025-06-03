package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import k6.a.d.c;
import k6.a.f;
import l6.q;
import u7.f;

public final class b
  extends v8.b
{
  public final k6.d<a.d.c> a;
  public final t9.b<w7.a> b;
  public final f c;
  
  public b(f paramf, t9.b<w7.a> paramb)
  {
    a = localc;
    c = paramf;
    b = paramb;
    if (paramb.get() == null) {
      Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
    }
  }
  
  public static void d(Bundle paramBundle)
  {
    Uri localUri = (Uri)paramBundle.getParcelable("dynamicLink");
    if ((TextUtils.isEmpty(paramBundle.getString("domainUriPrefix"))) && (localUri == null)) {
      throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
    }
  }
  
  public final v8.a a()
  {
    return new v8.a(this);
  }
  
  public final Task<v8.c> b(Intent paramIntent)
  {
    Object localObject1 = null;
    if (paramIntent != null) {
      localObject2 = paramIntent.getDataString();
    } else {
      localObject2 = null;
    }
    Task localTask = a.doWrite(new e(b, (String)localObject2));
    Object localObject2 = localTask;
    if (paramIntent != null)
    {
      localObject2 = (w8.a)n6.d.a(paramIntent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", w8.a.CREATOR);
      paramIntent = (Intent)localObject1;
      if (localObject2 != null) {
        paramIntent = new v8.c((w8.a)localObject2);
      }
      localObject2 = localTask;
      if (paramIntent != null) {
        localObject2 = Tasks.forResult(paramIntent);
      }
    }
    return (Task<v8.c>)localObject2;
  }
  
  public final Task<v8.c> c(Uri paramUri)
  {
    return a.doWrite(new e(b, paramUri.toString()));
  }
  
  public static class a
    extends IDynamicLinksCallbacks.Stub
  {
    public void K0(Status paramStatus, w8.d paramd)
    {
      throw new UnsupportedOperationException();
    }
    
    public void m2(Status paramStatus, w8.a parama)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public static final class b
    extends b.a
  {
    public final TaskCompletionSource<v8.d> a;
    
    public b(TaskCompletionSource<v8.d> paramTaskCompletionSource)
    {
      a = paramTaskCompletionSource;
    }
    
    public final void K0(Status paramStatus, w8.d paramd)
    {
      a0.K(paramStatus, paramd, a);
    }
  }
  
  public static final class c
    extends q<a, v8.d>
  {
    public final Bundle d;
    
    public c(Bundle paramBundle)
    {
      super(false, 13202);
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
  
  public static final class d
    extends b.a
  {
    public final TaskCompletionSource<v8.c> a;
    public final t9.b<w7.a> b;
    
    public d(t9.b<w7.a> paramb, TaskCompletionSource<v8.c> paramTaskCompletionSource)
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
        localObject = new v8.c(parama);
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
  
  public static final class e
    extends q<a, v8.c>
  {
    public final String d;
    public final t9.b<w7.a> e;
    
    public e(t9.b<w7.a> paramb, String paramString)
    {
      super(false, 13201);
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
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */