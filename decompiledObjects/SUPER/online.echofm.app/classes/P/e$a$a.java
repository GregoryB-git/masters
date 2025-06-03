package P;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;
import java.util.List;

public final class e$a$a
  extends k
  implements p
{
  public int o;
  
  public e$a$a(List paramList, d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(i parami, d paramd)
  {
    return ((a)create(parami, paramd)).invokeSuspend(t.a);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    paramd = new a(q, paramd);
    p = paramObject;
    return paramd;
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
      i locali = (i)p;
      e.a locala = e.a;
      paramObject = q;
      o = 1;
      if (e.a.a(locala, (List)paramObject, locali, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     P.e.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */