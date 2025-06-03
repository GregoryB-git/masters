package P;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import g6.p;

public final class m$f
  extends k
  implements p
{
  public int o;
  
  public m$f(m paramm, d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(m.b paramb, d paramd)
  {
    return ((f)create(paramb, paramd)).invokeSuspend(t.a);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    paramd = new f(q, paramd);
    p = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = b.c();
    int i = o;
    if (i != 0)
    {
      if ((i != 1) && (i != 2)) {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      o.b(paramObject);
    }
    else
    {
      o.b(paramObject);
      Object localObject2 = (m.b)p;
      if ((localObject2 instanceof m.b.a))
      {
        paramObject = q;
        localObject2 = (m.b.a)localObject2;
        o = 1;
        if (m.i((m)paramObject, (m.b.a)localObject2, this) == localObject1) {
          return localObject1;
        }
      }
      else if ((localObject2 instanceof m.b.b))
      {
        paramObject = q;
        localObject2 = (m.b.b)localObject2;
        o = 2;
        if (m.j((m)paramObject, (m.b.b)localObject2, this) == localObject1) {
          return localObject1;
        }
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     P.m.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */