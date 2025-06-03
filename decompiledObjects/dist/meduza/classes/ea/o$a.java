package ea;

import android.os.Messenger;
import android.util.Log;
import dc.p;
import fa.b;
import ga.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import nc.d0;

@wb.e(c="com.google.firebase.sessions.FirebaseSessions$1", f="FirebaseSessions.kt", l={45, 49}, m="invokeSuspend")
public final class o$a
  extends wb.i
  implements p<d0, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public o$a(o paramo, ub.h paramh, j0 paramj0, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(b, c, d, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    int i = a;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          rb.f.b(paramObject);
          break label181;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      rb.f.b(paramObject);
    }
    else
    {
      rb.f.b(paramObject);
      paramObject = fa.a.a;
      a = 1;
      localObject = ((fa.a)paramObject).b(this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    paramObject = ((Map)paramObject).values();
    if ((!(paramObject instanceof Collection)) || (!((Collection)paramObject).isEmpty()))
    {
      paramObject = ((Iterable)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        if (((b)((Iterator)paramObject).next()).b())
        {
          i = 0;
          break label147;
        }
      }
    }
    i = 1;
    label147:
    if (i != 0)
    {
      paramObject = "No Sessions subscribers. Not listening to lifecycle events.";
    }
    else
    {
      paramObject = b.b;
      a = 2;
      if (((ga.h)paramObject).b(this) == locala) {
        return locala;
      }
      label181:
      localObject = b.b;
      paramObject = a.a();
      boolean bool;
      if (paramObject != null)
      {
        bool = ((Boolean)paramObject).booleanValue();
      }
      else
      {
        paramObject = b.a();
        if (paramObject != null) {
          bool = ((Boolean)paramObject).booleanValue();
        } else {
          bool = true;
        }
      }
      if (bool) {
        break label259;
      }
      paramObject = "Sessions SDK disabled. Not listening to lifecycle events.";
    }
    Log.d("FirebaseSessions", (String)paramObject);
    break label370;
    label259:
    paramObject = new h0(c);
    Object localObject = d;
    ec.i.e(localObject, "sessionLifecycleServiceBinder");
    ((j0)localObject).a(new Messenger(new h0.a(a)), d);
    l0.a.getClass();
    l0.c = (h0)paramObject;
    if (l0.b)
    {
      l0.b = false;
      ((h0)paramObject).b(1);
    }
    paramObject = b.a;
    localObject = new n();
    ((u7.f)paramObject).a();
    j.add(localObject);
    label370:
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     ea.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */