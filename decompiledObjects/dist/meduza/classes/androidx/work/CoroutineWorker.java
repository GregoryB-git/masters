package androidx.work;

import android.content.Context;
import b.m;
import dc.p;
import nc.d0;
import nc.e0;
import nc.m1;
import nc.r0;
import rb.f;
import ub.h.a;

public abstract class CoroutineWorker
  extends d
{
  public final m1 e = new m1(null);
  public final z2.c<d.a> f;
  public final tc.c o;
  
  public CoroutineWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    paramContext = new z2.c();
    f = paramContext;
    paramContext.f(new m(this, 7), b.d.c());
    o = r0.a;
  }
  
  public final s7.e<o2.d> b()
  {
    Object localObject1 = new m1(null);
    Object localObject2 = o;
    localObject2.getClass();
    localObject2 = e0.a(h.a.a((ub.h)localObject2, (ub.h)localObject1));
    localObject1 = new o2.i((m1)localObject1);
    x6.b.g0((d0)localObject2, null, new a((o2.i)localObject1, this, null), 3);
    return (s7.e<o2.d>)localObject1;
  }
  
  public final void g()
  {
    f.cancel(false);
  }
  
  public final z2.c h()
  {
    x6.b.g0(e0.a(o.plus(e)), null, new b(this, null), 3);
    return f;
  }
  
  public abstract Object j();
  
  @wb.e(c="androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f="CoroutineWorker.kt", l={134}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super rb.h>, Object>
  {
    public o2.i a;
    public int b;
    
    public a(o2.i<o2.d> parami, CoroutineWorker paramCoroutineWorker, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(c, jdField_this, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = vb.a.a;
      int i = b;
      if (i != 0)
      {
        if (i == 1)
        {
          localObject = a;
          f.b(paramObject);
          b.i(paramObject);
          return rb.h.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      f.b(paramObject);
      paramObject = c;
      localObject = jdField_this;
      a = ((o2.i)paramObject);
      b = 1;
      localObject.getClass();
      throw new IllegalStateException("Not implemented");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.CoroutineWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */