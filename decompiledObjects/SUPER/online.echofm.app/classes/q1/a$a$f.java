package q1;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import p6.I;
import r1.n;

public final class a$a$f
  extends k
  implements g6.p
{
  public int o;
  
  public a$a$f(a.a parama, r1.p paramp, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new f(p, null, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((f)create(paramI, paramd)).invokeSuspend(t.a);
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
      paramObject = a.a.d(p);
      o = 1;
      if (((n)paramObject).f(null, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     q1.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */