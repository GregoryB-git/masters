package S;

import P.f;
import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.p;

public abstract class g
{
  public static final Object a(f paramf, p paramp, X5.d paramd)
  {
    return paramf.a(new a(paramp, null), paramd);
  }
  
  public static final class a
    extends k
    implements p
  {
    public int o;
    
    public a(p paramp, X5.d paramd)
    {
      super(paramd);
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
      Object localObject = b.c();
      int i = o;
      if (i != 0)
      {
        if (i == 1)
        {
          localObject = (a)p;
          o.b(paramObject);
          paramObject = localObject;
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        o.b(paramObject);
        paramObject = ((d)p).c();
        p localp = q;
        p = paramObject;
        o = 1;
        if (localp.invoke(paramObject, this) == localObject) {
          return localObject;
        }
      }
      return paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     S.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */