package q1;

import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import p6.I;
import r1.n;

public final class a$a$e
  extends k
  implements p
{
  public int o;
  
  public a$a$e(a.a parama, r1.o paramo, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new e(p, null, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((e)create(paramI, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = b.c();
    int i = o;
    if (i != 0)
    {
      if (i == 1) {
        V5.o.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      V5.o.b(paramObject);
      paramObject = a.a.d(p);
      o = 1;
      if (((n)paramObject).e(null, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     q1.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */