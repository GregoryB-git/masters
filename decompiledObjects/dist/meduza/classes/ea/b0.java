package ea;

import android.util.Log;
import dc.p;
import fa.b.a;
import java.util.Map;
import nc.d0;
import nc.e0;
import u9.d;

public final class b0
  implements a0
{
  public static final double f = ;
  public final u7.f a;
  public final d b;
  public final ga.h c;
  public final l d;
  public final ub.h e;
  
  public b0(u7.f paramf, d paramd, ga.h paramh, k paramk, ub.h paramh1)
  {
    a = paramf;
    b = paramd;
    c = paramh;
    d = paramk;
    e = paramh1;
  }
  
  public static final Object b(b0 paramb0, ub.e parame)
  {
    paramb0.getClass();
    if ((parame instanceof c0))
    {
      localObject1 = (c0)parame;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label52;
      }
    }
    parame = new c0(paramb0, parame);
    label52:
    Object localObject2 = b;
    Object localObject1 = vb.a.a;
    int j = d;
    int i = 1;
    if (j != 0)
    {
      if (j == 1)
      {
        paramb0 = a;
        rb.f.b(localObject2);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
      localObject2 = c;
      a = paramb0;
      d = 1;
      if (((ga.h)localObject2).b(parame) == localObject1) {
        return (b0)localObject1;
      }
    }
    localObject1 = c;
    parame = a.a();
    boolean bool;
    if (parame != null)
    {
      bool = parame.booleanValue();
    }
    else
    {
      parame = b.a();
      if (parame != null) {
        bool = parame.booleanValue();
      } else {
        bool = true;
      }
    }
    if (!bool)
    {
      paramb0 = "Sessions SDK disabled. Events will not be sent.";
    }
    else
    {
      if (f > c.a()) {
        i = 0;
      }
      if (i != 0) {
        break label253;
      }
      paramb0 = "Sessions SDK has dropped this session due to sampling.";
    }
    Log.d("SessionFirelogPublisher", paramb0);
    return Boolean.FALSE;
    label253:
    paramb0 = Boolean.TRUE;
    return paramb0;
  }
  
  public final void a(final x paramx)
  {
    x6.b.g0(e0.a(e), null, new a(this, paramx, null), 3);
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f="SessionFirelogPublisher.kt", l={63, 64, 70}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super rb.h>, Object>
  {
    public q a;
    public b0 b;
    public z c;
    public u7.f d;
    public x e;
    public ga.h f;
    public int o;
    
    public a(b0 paramb0, x paramx, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(p, paramx, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = i.c;
      i locali1 = i.d;
      i locali2 = i.b;
      Object localObject2 = vb.a.a;
      int i = o;
      ga.h localh;
      u7.f localf;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              localh = f;
              localObject2 = e;
              localf = d;
              localObject3 = c;
              localObject4 = b;
              localObject5 = a;
              rb.f.b(paramObject);
              localObject6 = paramObject;
              paramObject = localObject2;
              break label303;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
          rb.f.b(paramObject);
          break label204;
        }
        rb.f.b(paramObject);
      }
      else
      {
        rb.f.b(paramObject);
        paramObject = p;
        o = 1;
        localObject4 = b0.b((b0)paramObject, this);
        paramObject = localObject4;
        if (localObject4 == localObject2) {
          return localObject2;
        }
      }
      if (((Boolean)paramObject).booleanValue())
      {
        paramObject = q.c;
        localObject4 = p.b;
        o = 2;
        localObject4 = ((q.a)paramObject).a((d)localObject4, this);
        paramObject = localObject4;
        if (localObject4 == localObject2) {
          return localObject2;
        }
        label204:
        localObject5 = (q)paramObject;
        localObject4 = p;
        localObject3 = z.a;
        localf = a;
        paramObject = paramx;
        localh = c;
        localObject6 = fa.a.a;
        a = ((q)localObject5);
        b = ((b0)localObject4);
        c = ((z)localObject3);
        d = localf;
        e = ((x)paramObject);
        f = localh;
        o = 3;
        localObject6 = ((fa.a)localObject6).b(this);
        if (localObject6 == localObject2) {
          return localObject2;
        }
        label303:
        Object localObject7 = (Map)localObject6;
        localObject6 = a;
        localObject5 = b;
        localObject3.getClass();
        ec.i.e(localf, "firebaseApp");
        ec.i.e(paramObject, "sessionDetails");
        ec.i.e(localh, "sessionsSettings");
        ec.i.e(localObject7, "subscribers");
        ec.i.e(localObject6, "firebaseInstallationId");
        ec.i.e(localObject5, "firebaseAuthenticationToken");
        localObject3 = a;
        localObject2 = b;
        i = c;
        long l = d;
        paramObject = (fa.b)((Map)localObject7).get(b.a.b);
        if (paramObject == null) {
          paramObject = locali2;
        } else if (((fa.b)paramObject).b()) {
          paramObject = localObject1;
        } else {
          paramObject = locali1;
        }
        localObject7 = (fa.b)((Map)localObject7).get(b.a.a);
        if (localObject7 == null) {
          localObject1 = locali2;
        } else if (!((fa.b)localObject7).b()) {
          localObject1 = locali1;
        }
        paramObject = new y(new f0((String)localObject3, (String)localObject2, i, l, new j((i)paramObject, (i)localObject1, localh.a()), (String)localObject6, (String)localObject5), z.a(localf));
        i = b0.g;
        localObject4.getClass();
        try
        {
          d.a((y)paramObject);
          Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        }
        catch (RuntimeException paramObject)
        {
          Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", (Throwable)paramObject);
        }
      }
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     ea.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */