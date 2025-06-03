package A2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import y2.a.f;
import y2.e.a;
import y2.e.b;

public abstract class g
  extends c
  implements a.f
{
  public final d F;
  public final Set G;
  public final Account H;
  
  public g(Context paramContext, Looper paramLooper, int paramInt, d paramd, e.a parama, e.b paramb)
  {
    this(paramContext, paramLooper, paramInt, paramd, parama, paramb);
  }
  
  public g(Context paramContext, Looper paramLooper, int paramInt, d paramd, z2.d paramd1, z2.j paramj)
  {
    this(paramContext, paramLooper, h.b(paramContext), x2.j.m(), paramInt, paramd, (z2.d)n.i(paramd1), (z2.j)n.i(paramj));
  }
  
  public g(Context paramContext, Looper paramLooper, h paramh, x2.j paramj, int paramInt, d paramd, z2.d paramd1, z2.j paramj1)
  {
    super(paramContext, paramLooper, paramh, paramj, paramInt, paramd1, paramj1, paramd.h());
    F = paramd;
    H = paramd.a();
    G = k0(paramd.c());
  }
  
  public final Set C()
  {
    return G;
  }
  
  public Set e()
  {
    Set localSet;
    if (m()) {
      localSet = G;
    } else {
      localSet = Collections.emptySet();
    }
    return localSet;
  }
  
  public Set j0(Set paramSet)
  {
    return paramSet;
  }
  
  public final Set k0(Set paramSet)
  {
    Set localSet = j0(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  public final Account u()
  {
    return H;
  }
  
  public final Executor w()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     A2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */