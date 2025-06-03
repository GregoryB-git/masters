package S;

import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.p;

public final class b$a
  extends k
  implements p
{
  public int o;
  
  public b$a(p paramp, X5.d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(d paramd, X5.d paramd1)
  {
    return ((a)create(paramd, paramd1)).invokeSuspend(t.a);
  }
  
  public final X5.d create(Object paramObject, X5.d paramd)
  {
    paramd = new a(q, paramd);
    p = paramObject;
    return paramd;
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
      paramObject = (d)p;
      Object localObject2 = q;
      o = 1;
      localObject2 = ((p)localObject2).invoke(paramObject, this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    paramObject = (d)paramObject;
    ((a)paramObject).f();
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     S.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */