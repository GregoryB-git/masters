package com.google.firebase.firestore;

import aa.m0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.b0;
import d9.g;
import d9.h;
import d9.j;
import d9.o.c;
import d9.t0;
import d9.v0;
import d9.y0;
import e7.p3;
import g9.f0;
import g9.k.a;
import g9.o0;
import g9.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k9.m;
import ka.d0;
import n9.e.b;
import r3.a0;
import x6.b;

public final class c
{
  public final j9.i a;
  public final FirebaseFirestore b;
  
  public c(j9.i parami, FirebaseFirestore paramFirebaseFirestore)
  {
    parami.getClass();
    a = parami;
    b = paramFirebaseFirestore;
  }
  
  public final b0 a(Executor paramExecutor, k.a parama, d9.l paraml)
  {
    paraml = new g9.d(paramExecutor, new d9.i(this, paraml));
    paramExecutor = new f0(a.a, null);
    return (b0)b.a(new j(paramExecutor, parama, paraml));
  }
  
  public final Task<d> b(v0 paramv0)
  {
    if (paramv0 == v0.c) {
      return ((Task)b.a(new m0(this, 0))).continueWith(n9.f.b, new d(this, 8));
    }
    TaskCompletionSource localTaskCompletionSource1 = new TaskCompletionSource();
    TaskCompletionSource localTaskCompletionSource2 = new TaskCompletionSource();
    k.a locala = new k.a();
    a = true;
    b = true;
    c = true;
    localTaskCompletionSource2.setResult(a(n9.f.b, locala, new h(localTaskCompletionSource1, localTaskCompletionSource2, paramv0)));
    return localTaskCompletionSource1.getTask();
  }
  
  public final String c()
  {
    return a.a.h();
  }
  
  public final Task d(Map paramMap, t0 paramt0)
  {
    if (paramt0 != null)
    {
      if (a) {
        paramMap = b.h.d(paramMap, b);
      } else {
        paramMap = b.h.f(paramMap);
      }
      paramMap = Collections.singletonList(paramMap.r(a, m.c));
      return ((Task)b.a(new g(paramMap, 0))).continueWith(n9.f.b, n9.o.a);
    }
    throw new NullPointerException("Provided options must not be null.");
  }
  
  public final Task<Void> e(d9.n paramn, Object paramObject, Object... paramVarArgs)
  {
    y0 localy0 = b.h;
    Object localObject1 = n9.o.a;
    if (paramVarArgs.length % 2 != 1)
    {
      Object localObject2 = new ArrayList();
      ((ArrayList)localObject2).add(paramn);
      ((ArrayList)localObject2).add(paramObject);
      Collections.addAll((Collection)localObject2, paramVarArgs);
      for (int i = 0; i < ((ArrayList)localObject2).size(); i += 2)
      {
        paramn = ((ArrayList)localObject2).get(i);
        if ((!(paramn instanceof String)) && (!(paramn instanceof d9.n)))
        {
          paramObject = f.l("Excepted field name at argument position ");
          ((StringBuilder)paramObject).append(i + 1 + 1);
          ((StringBuilder)paramObject).append(" but got ");
          ((StringBuilder)paramObject).append(paramn);
          ((StringBuilder)paramObject).append(" in call to update.  The arguments to update should alternate between field names and values");
          throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
        }
      }
      localy0.getClass();
      boolean bool1;
      if (((ArrayList)localObject2).size() % 2 == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      b.Z("Expected fieldAndValues to contain an even number of elements", bool1, new Object[0]);
      paramVarArgs = new p3(p0.c);
      localObject1 = paramVarArgs.a();
      paramObject = new j9.n();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramn = ((Iterator)localObject2).next();
        Object localObject3 = ((Iterator)localObject2).next();
        boolean bool2 = paramn instanceof String;
        if ((!bool2) && (!(paramn instanceof d9.n))) {
          bool1 = false;
        } else {
          bool1 = true;
        }
        b.Z("Expected argument to be String or FieldPath.", bool1, new Object[0]);
        if (bool2) {
          paramn = aa;
        } else {
          paramn = a;
        }
        if ((localObject3 instanceof o.c))
        {
          ((o0)localObject1).a(paramn);
        }
        else
        {
          o0 localo0 = ((o0)localObject1).b(paramn);
          localObject3 = localy0.c(n9.e.b(localObject3, e.b.d), localo0);
          if (localObject3 != null)
          {
            ((o0)localObject1).a(paramn);
            ((j9.n)paramObject).f(paramn, (d0)localObject3);
          }
        }
      }
      paramn = new k9.d((Set)c);
      paramVarArgs = Collections.unmodifiableList((ArrayList)d);
      paramn = Collections.singletonList(new k9.l(a, (j9.n)paramObject, paramn, m.a(true), paramVarArgs));
      return ((Task)b.a(new e(paramn, 1))).continueWith(n9.f.b, n9.o.a);
    }
    throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */