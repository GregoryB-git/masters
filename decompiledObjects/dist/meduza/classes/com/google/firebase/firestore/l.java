package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d9.y0;
import eb.t0.a;
import eb.t0.b;
import eb.t0.c;
import io.flutter.plugins.firebase.auth.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import ka.d.a;
import ka.e;
import ka.r;
import lb.b.a;
import m9.e0;
import m9.j;
import m9.o;
import m9.v;
import m9.y;
import ma.w;
import ma.w.a;
import n9.a;
import r3.a0;

public final class l
{
  public final g9.m0 a;
  public final FirebaseFirestore b;
  
  public l(g9.m0 paramm0, FirebaseFirestore paramFirebaseFirestore)
  {
    paramm0.getClass();
    a = paramm0;
    b = paramFirebaseFirestore;
  }
  
  public final d a(c paramc)
  {
    b.j(paramc);
    try
    {
      paramc = (d)Tasks.await(b(paramc));
      return paramc;
    }
    catch (InterruptedException paramc)
    {
      throw new RuntimeException(paramc);
    }
    catch (ExecutionException paramc)
    {
      if ((paramc.getCause() instanceof f)) {
        throw ((f)paramc.getCause());
      }
      throw new RuntimeException(paramc.getCause());
    }
  }
  
  public final Task<d> b(c paramc)
  {
    g9.m0 localm0 = a;
    List localList = Collections.singletonList(a);
    x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", d ^ true, new Object[0]);
    if (c.size() != 0)
    {
      paramc = Tasks.forException(new f("Firestore transactions require all reads to be executed before all writes.", f.a.e));
    }
    else
    {
      Object localObject1 = a;
      localObject1.getClass();
      d.a locala = ka.d.J();
      paramc = a.b;
      locala.m();
      ka.d.G((ka.d)b, paramc);
      paramc = localList.iterator();
      while (paramc.hasNext())
      {
        localObject2 = (j9.i)paramc.next();
        localObject2 = a.j((j9.i)localObject2);
        locala.m();
        ka.d.H((ka.d)b, (String)localObject2);
      }
      ArrayList localArrayList = new ArrayList();
      TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
      v localv = c;
      Object localObject2 = r.a;
      paramc = (c)localObject2;
      if (localObject2 == null) {
        try
        {
          localObject2 = r.a;
          paramc = (c)localObject2;
          if (localObject2 == null)
          {
            paramc = eb.t0.b();
            c = t0.c.b;
            d = eb.t0.a("google.firestore.v1.Firestore", "BatchGetDocuments");
            e = true;
            localObject2 = ka.d.I();
            Object localObject3 = lb.b.a;
            localObject3 = new lb/b$a;
            ((b.a)localObject3).<init>((w)localObject2);
            a = ((t0.b)localObject3);
            localObject2 = e.G();
            localObject3 = new lb/b$a;
            ((b.a)localObject3).<init>((w)localObject2);
            b = ((t0.b)localObject3);
            paramc = paramc.a();
            r.a = paramc;
          }
        }
        finally {}
      }
      localObject2 = (ka.d)locala.k();
      localObject1 = new m9.i((j)localObject1, localArrayList, localList, localTaskCompletionSource);
      d.a(paramc).addOnCompleteListener(a.a, new o(localv, (m9.i)localObject1, (ka.d)localObject2));
      paramc = localTaskCompletionSource.getTask().continueWithTask(n9.f.b, new g(localm0, 20));
    }
    return paramc.continueWith(n9.f.b, new aa.m0(this, 8));
  }
  
  public final void c(c paramc, Map paramMap, d9.t0 paramt0)
  {
    b.j(paramc);
    if (paramt0 != null)
    {
      if (a) {
        paramMap = b.h.d(paramMap, b);
      } else {
        paramMap = b.h.f(paramMap);
      }
      paramt0 = a;
      paramc = a;
      paramMap = Collections.singletonList(paramMap.r(paramc, paramt0.a(paramc)));
      x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", d ^ true, new Object[0]);
      c.addAll(paramMap);
      f.add(paramc);
      return;
    }
    throw new NullPointerException("Provided options must not be null.");
  }
  
  public static abstract interface a<TResult> {}
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */