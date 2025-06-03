package p3;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ec.i;
import g9.q;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.Executor;
import o9.c;
import o9.l;
import o9.m;

public final class f
  implements m3.b, p9.b
{
  public final Object b;
  public final Object c;
  public final Object d;
  public final Object e;
  
  public f(o9.e parame, String paramString, m paramm)
  {
    b = parame;
    c = paramString;
    d = null;
    e = paramm;
  }
  
  public f(o9.e parame, URL paramURL, m paramm)
  {
    b = parame;
    c = null;
    d = paramURL;
    e = paramm;
  }
  
  public final Task a(Object paramObject)
  {
    Object localObject1 = c;
    Object localObject2;
    Object localObject3;
    if ((String)localObject1 != null)
    {
      localObject2 = (o9.e)b;
      localObject3 = (String)localObject1;
      localObject1 = (m)e;
      localObject2.getClass();
      i.e(localObject3, "name");
      i.e(localObject1, "options");
      paramObject = o9.e.j.getTask().continueWithTask(a, new k1.a(11, localObject2, localObject1)).continueWithTask(a, new c((o9.e)localObject2, (String)localObject3, paramObject, (m)localObject1));
      i.d(paramObject, "providerInstalled.task\n …context, options)\n      }");
    }
    else
    {
      localObject1 = (o9.e)b;
      localObject3 = (URL)d;
      i.b(localObject3);
      localObject2 = (m)e;
      localObject1.getClass();
      i.e(localObject2, "options");
      paramObject = o9.e.j.getTask().continueWithTask(a, new l(7, localObject1, localObject2)).continueWithTask(a, new q(localObject1, (Serializable)localObject3, paramObject, localObject2));
      i.d(paramObject, "providerInstalled.task\n …context, options)\n      }");
    }
    return (Task)paramObject;
  }
  
  public final Object get()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      Context localContext = (Context)((qb.a)b).get();
      r3.d locald = (r3.d)((qb.a)c).get();
      q3.e locale = (q3.e)((qb.a)d).get();
      t3.a locala = (t3.a)((qb.a)e).get();
      return new q3.d(localContext, locald, locale);
    }
    return new o9.b((t9.b)((qb.a)b).get(), (t9.b)((qb.a)c).get(), (t9.a)((qb.a)d).get(), (Executor)((qb.a)e).get());
  }
}

/* Location:
 * Qualified Name:     p3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */