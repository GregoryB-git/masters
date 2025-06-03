package P;

import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.l;

public final class e$a$c$a
  extends k
  implements l
{
  public int o;
  
  public e$a$c$a(d paramd, X5.d paramd1)
  {
    super(1, paramd1);
  }
  
  public final Object a(X5.d paramd)
  {
    return ((a)create(paramd)).invokeSuspend(t.a);
  }
  
  public final X5.d create(X5.d paramd)
  {
    return new a(null, paramd);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b.c();
    int i = o;
    if (i != 0)
    {
      if (i == 1)
      {
        o.b(paramObject);
        return t.a;
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
    o.b(paramObject);
    o = 1;
    throw null;
  }
}

/* Location:
 * Qualified Name:     P.e.a.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */