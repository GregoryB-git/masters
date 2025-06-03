package T4;

import P.f;
import V5.o;
import V5.t;
import Z5.k;
import g6.p;
import p6.I;

public final class g$a
  extends k
  implements p
{
  public Object o;
  public int p;
  
  public g$a(g paramg, X5.d paramd)
  {
    super(2, paramd);
  }
  
  public final X5.d create(Object paramObject, X5.d paramd)
  {
    return new a(q, paramd);
  }
  
  public final Object invoke(I paramI, X5.d paramd)
  {
    return ((a)create(paramI, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = Y5.b.c();
    int i = p;
    Object localObject2;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject1 = (g)o;
        o.b(paramObject);
        localObject2 = paramObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      o.b(paramObject);
      paramObject = q;
      localObject2 = g.a((g)paramObject).b();
      o = paramObject;
      p = 1;
      localObject2 = s6.d.d((s6.b)localObject2, this);
      if (localObject2 == localObject1) {
        return localObject1;
      }
      localObject1 = paramObject;
    }
    g.c((g)localObject1, ((S.d)localObject2).d());
    return t.a;
  }
}

/* Location:
 * Qualified Name:     T4.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */