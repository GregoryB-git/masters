package P;

import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import android.support.v4.media.a;
import g6.l;
import g6.p;
import java.util.Iterator;
import java.util.List;

public final class e$a$c
  extends k
  implements p
{
  public Object o;
  public Object p;
  public Object q;
  public int r;
  
  public e$a$c(List paramList1, List paramList2, X5.d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(Object paramObject, X5.d paramd)
  {
    return ((c)create(paramObject, paramd)).invokeSuspend(t.a);
  }
  
  public final X5.d create(Object paramObject, X5.d paramd)
  {
    paramd = new c(t, u, paramd);
    s = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b.c();
    int i = r;
    Object localObject1;
    List localList;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          localObject1 = (Iterator)o;
          localList = (List)s;
          o.b(paramObject);
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        Object localObject2 = q;
        a.a(p);
        localObject1 = (Iterator)o;
        localList = (List)s;
        o.b(paramObject);
        if (!((Boolean)paramObject).booleanValue())
        {
          paramObject = localObject2;
        }
        else
        {
          localList.add(new a(null, null));
          s = localList;
          o = localObject1;
          p = null;
          q = null;
          r = 2;
          throw null;
        }
      }
    }
    else
    {
      o.b(paramObject);
      paramObject = s;
      localObject1 = (Iterable)t;
      localList = u;
      localObject1 = ((Iterable)localObject1).iterator();
    }
    if (!((Iterator)localObject1).hasNext()) {
      return paramObject;
    }
    a.a(((Iterator)localObject1).next());
    s = localList;
    o = localObject1;
    p = null;
    q = paramObject;
    r = 1;
    throw null;
  }
  
  public static final class a
    extends k
    implements l
  {
    public int o;
    
    public a(d paramd, X5.d paramd1)
    {
      super(paramd1);
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
}

/* Location:
 * Qualified Name:     P.e.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */