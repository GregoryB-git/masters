package P;

import V5.o;
import V5.t;
import Y5.b;
import g6.p;
import java.util.concurrent.atomic.AtomicInteger;
import p6.I;
import p6.J;
import p6.q0;
import r6.f;
import r6.g.a;
import r6.m;
import r6.n;

public final class l
{
  public final I a;
  public final p b;
  public final r6.d c;
  public final AtomicInteger d;
  
  public l(I paramI, g6.l paraml, final p paramp1, p paramp2)
  {
    a = paramI;
    b = paramp2;
    c = f.b(Integer.MAX_VALUE, null, null, 6, null);
    d = new AtomicInteger(0);
    paramI = (q0)paramI.f().b(q0.n);
    if (paramI != null) {
      paramI.e(new a(paraml, this, paramp1));
    }
  }
  
  public final void e(Object paramObject)
  {
    paramObject = c.d(paramObject);
    if ((paramObject instanceof g.a))
    {
      Throwable localThrowable = r6.g.c(paramObject);
      paramObject = localThrowable;
      if (localThrowable == null) {
        paramObject = new r6.k("Channel was closed normally");
      }
      throw ((Throwable)paramObject);
    }
    if (r6.g.f(paramObject))
    {
      if (d.getAndIncrement() == 0) {
        p6.g.d(a, null, null, new b(this, null), 3, null);
      }
      return;
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(g6.l paraml, l paraml1, p paramp)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      o.invoke(paramThrowable);
      l.b(jdField_this).b(paramThrowable);
      Object localObject;
      do
      {
        localObject = r6.g.d(l.b(jdField_this).c());
        if (localObject == null)
        {
          localObject = null;
        }
        else
        {
          paramp1.invoke(localObject, paramThrowable);
          localObject = t.a;
        }
      } while (localObject != null);
    }
  }
  
  public static final class b
    extends Z5.k
    implements p
  {
    public Object o;
    public int p;
    
    public b(l paraml, X5.d paramd)
    {
      super(paramd);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      return new b(q, paramd);
    }
    
    public final Object invoke(I paramI, X5.d paramd)
    {
      return ((b)create(paramI, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = b.c();
      int i = p;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            o.b(paramObject);
            break label167;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localp = (p)o;
        o.b(paramObject);
      }
      else
      {
        o.b(paramObject);
        if (l.c(q).get() > 0) {
          i = 1;
        } else {
          i = 0;
        }
      }
      label167:
      while (l.c(q).decrementAndGet() != 0)
      {
        J.b(l.d(q));
        p localp = l.a(q);
        paramObject = l.b(q);
        o = localp;
        p = 1;
        Object localObject2 = ((m)paramObject).a(this);
        paramObject = localObject2;
        if (localObject2 == localObject1) {
          return localObject1;
        }
        o = null;
        p = 2;
        if (localp.invoke(paramObject, this) == localObject1) {
          return localObject1;
        }
      }
      return t.a;
      throw new IllegalStateException("Check failed.".toString());
    }
  }
}

/* Location:
 * Qualified Name:     P.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */