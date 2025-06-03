package q1;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import p6.I;
import r1.n;

public final class a$a$b
  extends k
  implements p
{
  public int o;
  
  public a$a$b(a.a parama, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new b(p, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((b)create(paramI, paramd)).invokeSuspend(t.a);
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
      paramObject = a.a.d(p);
      o = 1;
      Object localObject2 = ((n)paramObject).b(this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     q1.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */