package P;

import V5.o;
import V5.t;
import X5.d;
import Z5.k;
import g6.p;

public final class m$g$a
  extends k
  implements p
{
  public int o;
  
  public m$g$a(n paramn, d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(n paramn, d paramd)
  {
    return ((a)create(paramn, paramd)).invokeSuspend(t.a);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    paramd = new a(q, paramd);
    p = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Y5.b.c();
    if (o == 0)
    {
      o.b(paramObject);
      n localn = (n)p;
      paramObject = q;
      boolean bool1 = paramObject instanceof c;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (!bool1) {
        if ((paramObject instanceof h))
        {
          bool3 = bool2;
        }
        else
        {
          bool3 = bool2;
          if (localn == paramObject) {
            bool3 = true;
          }
        }
      }
      return Z5.b.a(bool3);
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     P.m.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */