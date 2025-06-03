package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import j6.d;
import j6.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.a.f;
import k6.e.a;
import k6.e.b;
import m6.s0;

public abstract class c<T extends IInterface>
  extends a<T>
  implements a.f
{
  private static volatile Executor zaa;
  private final m6.a zab;
  private final Set zac;
  private final Account zad;
  
  public c(Context paramContext, Handler paramHandler, int paramInt, m6.a parama)
  {
    super(paramContext, paramHandler, m6.c.a(paramContext), e.d, paramInt, null, null);
    m6.j.i(parama);
    zab = parama;
    zad = a;
    zac = zaa(c);
  }
  
  public c(Context paramContext, Looper paramLooper, int paramInt, m6.a parama)
  {
    this(paramContext, paramLooper, m6.c.a(paramContext), e.d, paramInt, parama, null, null);
  }
  
  @Deprecated
  public c(Context paramContext, Looper paramLooper, int paramInt, m6.a parama, e.a parama1, e.b paramb)
  {
    this(paramContext, paramLooper, paramInt, parama, parama1, paramb);
  }
  
  public c(Context paramContext, Looper paramLooper, int paramInt, m6.a parama, l6.c paramc, l6.j paramj)
  {
    this(paramContext, paramLooper, locals0, locale, paramInt, parama, paramc, paramj);
  }
  
  public c(Context paramContext, Looper paramLooper, m6.c paramc, e parame, int paramInt, m6.a parama, l6.c paramc1, l6.j paramj)
  {
    super(paramContext, paramLooper, paramc, parame, paramInt, paramc1, paramj, f);
    zab = parama;
    zad = a;
    zac = zaa(c);
  }
  
  private final Set zaa(Set paramSet)
  {
    Set localSet = validateScopes(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  public final Account getAccount()
  {
    return zad;
  }
  
  public Executor getBindServiceExecutor()
  {
    return null;
  }
  
  public final m6.a getClientSettings()
  {
    return zab;
  }
  
  public d[] getRequiredFeatures()
  {
    return new d[0];
  }
  
  public final Set<Scope> getScopes()
  {
    return zac;
  }
  
  public Set<Scope> getScopesForConnectionlessNonSignIn()
  {
    Set localSet;
    if (requiresSignIn()) {
      localSet = zac;
    } else {
      localSet = Collections.emptySet();
    }
    return localSet;
  }
  
  public Set<Scope> validateScopes(Set<Scope> paramSet)
  {
    return paramSet;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */