package T4;

import S.a;
import S.d.a;
import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.p;

public final class g$d
  extends k
  implements p
{
  public int o;
  
  public g$d(Object paramObject, d.a parama, g paramg, X5.d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(a parama, X5.d paramd)
  {
    return ((d)create(parama, paramd)).invokeSuspend(t.a);
  }
  
  public final X5.d create(Object paramObject, X5.d paramd)
  {
    paramd = new d(q, r, s, paramd);
    p = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b.c();
    if (o == 0)
    {
      o.b(paramObject);
      paramObject = (a)p;
      Object localObject = q;
      if (localObject != null) {
        ((a)paramObject).i(r, localObject);
      } else {
        ((a)paramObject).h(r);
      }
      g.c(s, (S.d)paramObject);
      return t.a;
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     T4.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */