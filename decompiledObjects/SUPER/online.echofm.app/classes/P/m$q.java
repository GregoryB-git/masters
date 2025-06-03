package P;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import p6.I;

public final class m$q
  extends k
  implements p
{
  public int o;
  
  public m$q(p paramp, Object paramObject, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new q(p, q, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((q)create(paramI, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = b.c();
    int i = o;
    if (i != 0)
    {
      if (i == 1) {
        o.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      o.b(paramObject);
      paramObject = p;
      Object localObject2 = q;
      o = 1;
      localObject2 = ((p)paramObject).invoke(localObject2, this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     P.m.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */