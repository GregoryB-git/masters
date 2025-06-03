package q1;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import p6.I;
import r1.a;
import r1.n;

public final class a$a$a
  extends k
  implements p
{
  public int o;
  
  public a$a$a(a.a parama, a parama1, d paramd)
  {
    super(2, paramd);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    return new a(p, null, paramd);
  }
  
  public final Object invoke(I paramI, d paramd)
  {
    return ((a)create(paramI, paramd)).invokeSuspend(t.a);
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
      if (((n)paramObject).a(null, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     q1.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */