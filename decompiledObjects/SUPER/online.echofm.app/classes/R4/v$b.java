package R4;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import p6.I;

public final class v$b
  extends k
  implements g6.p
{
  public int o;
  
  public v$b(v paramv, p paramp, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new b(p, q, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((b)create(paramI, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = b.c();
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
      u localu = v.a(p);
      paramObject = q;
      o = 1;
      if (localu.a((p)paramObject, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     R4.v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */