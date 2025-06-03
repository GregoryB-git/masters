package ea;

import android.app.Application;
import android.content.Context;
import android.os.Messenger;
import android.util.Log;
import dc.p;
import ga.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import nc.d0;
import nc.e0;

public final class o
{
  public final u7.f a;
  public final ga.h b;
  
  public o(u7.f paramf, ga.h paramh, final ub.h paramh1, final j0 paramj0)
  {
    a = paramf;
    b = paramh;
    Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
    paramf.a();
    paramf = a.getApplicationContext();
    if ((paramf instanceof Application))
    {
      ((Application)paramf).registerActivityLifecycleCallbacks(l0.a);
      x6.b.g0(e0.a(paramh1), null, new a(this, paramh1, paramj0, null), 3);
    }
    else
    {
      paramh = f.l("Failed to register lifecycle callbacks, unexpected context ");
      paramh.append(paramf.getClass());
      paramh.append('.');
      Log.e("FirebaseSessions", paramh.toString());
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.FirebaseSessions$1", f="FirebaseSessions.kt", l={45, 49}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public a(o paramo, ub.h paramh, j0 paramj0, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(b, paramh1, paramj0, parame);
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
          if (((fa.b)((Iterator)paramObject).next()).b())
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
      paramObject = new h0(paramh1);
      Object localObject = paramj0;
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
}

/* Location:
 * Qualified Name:     ea.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */