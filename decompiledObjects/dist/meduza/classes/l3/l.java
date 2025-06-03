package l3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i9.c;
import j7.f;
import java.util.Collections;
import k7.d;
import k7.n;
import m3.b;
import t8.e;
import t8.e.a;

public final class l
  implements b, OnSuccessListener
{
  public Object a = new e(Collections.emptyList(), c.c);
  public Object b = new e(Collections.emptyList(), c.d);
  
  public l(int paramInt) {}
  
  public final boolean a(j9.i parami)
  {
    Object localObject = new c(0, parami);
    localObject = ((e)a).h((c)localObject);
    if (!((e.a)localObject).hasNext()) {
      return false;
    }
    return nexta.equals(parami);
  }
  
  public final String b(String paramString)
  {
    String str = (String)b;
    int i = ((Resources)a).getIdentifier(paramString, "string", str);
    if (i == 0) {
      return null;
    }
    return ((Resources)a).getString(i);
  }
  
  public final e c(int paramInt)
  {
    Object localObject = new c(paramInt, j9.i.g());
    e.a locala = ((e)b).h((c)localObject);
    c localc;
    for (localObject = j9.i.c; locala.hasNext(); localObject = ((e)localObject).a(a))
    {
      localc = (c)locala.next();
      if (b != paramInt) {
        break;
      }
    }
    return (e)localObject;
  }
  
  public final e d(int paramInt)
  {
    Object localObject = new c(paramInt, j9.i.g());
    e.a locala = ((e)b).h((c)localObject);
    localObject = j9.i.c;
    while (locala.hasNext())
    {
      c localc = (c)locala.next();
      if (b != paramInt) {
        break;
      }
      localObject = ((e)localObject).a(a);
      a = ((e)a).i(localc);
      b = ((e)b).i(localc);
    }
    return (e)localObject;
  }
  
  public final Task e()
  {
    Object localObject1 = (j7.h)a;
    Object localObject2 = b;
    Object localObject3 = j7.h.c;
    ((d)localObject3).a("requestInAppReview (%s)", new Object[] { localObject2 });
    if (a == null)
    {
      if (Log.isLoggable("PlayCore", 6)) {
        Log.e("PlayCore", d.c(a, "Play Store app is either not installed or not the official version", new Object[0]));
      }
      localObject3 = Tasks.forException(new j7.a());
    }
    else
    {
      localObject2 = new TaskCompletionSource();
      localObject3 = a;
      localObject1 = new f((j7.h)localObject1, (TaskCompletionSource)localObject2, (TaskCompletionSource)localObject2);
      localObject3.getClass();
      localObject1 = new k7.h((n)localObject3, (TaskCompletionSource)localObject2, (TaskCompletionSource)localObject2, (f)localObject1);
      ((n)localObject3).a().post((Runnable)localObject1);
      localObject3 = ((TaskCompletionSource)localObject2).getTask();
    }
    return (Task)localObject3;
  }
  
  public final Object get()
  {
    return new k((Context)((qb.a)a).get(), (i)((qb.a)b).get());
  }
}

/* Location:
 * Qualified Name:     l3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */