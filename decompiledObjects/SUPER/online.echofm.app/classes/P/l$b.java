package P;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import java.util.concurrent.atomic.AtomicInteger;
import p6.I;
import p6.J;
import r6.m;

public final class l$b
  extends k
  implements p
{
  public Object o;
  public int p;
  
  public l$b(l paraml, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new b(q, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
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

/* Location:
 * Qualified Name:     P.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */