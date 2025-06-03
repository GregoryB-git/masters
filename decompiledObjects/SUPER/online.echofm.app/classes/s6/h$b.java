package s6;

import V5.o;
import V5.t;
import Y5.b;
import g6.p;
import kotlin.jvm.internal.s;

public final class h$b
  implements c
{
  public h$b(s params, c paramc, p paramp) {}
  
  public final Object emit(Object paramObject, X5.d paramd)
  {
    if ((paramd instanceof a))
    {
      localObject1 = (a)paramd;
      i = s;
      if ((i & 0x80000000) != 0)
      {
        s = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label50;
      }
    }
    paramd = new a(this, paramd);
    label50:
    Object localObject2 = q;
    Object localObject3 = b.c();
    int i = s;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            o.b(localObject2);
            break label279;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramObject = p;
        localObject1 = (b)o;
        o.b(localObject2);
        break label224;
      }
      o.b(localObject2);
    }
    else
    {
      o.b(localObject2);
      if (!o.o) {
        break label182;
      }
      localObject1 = p;
      s = 1;
      if (((c)localObject1).emit(paramObject, paramd) == localObject3) {
        return localObject3;
      }
    }
    return t.a;
    label182:
    Object localObject1 = q;
    o = this;
    p = paramObject;
    s = 2;
    localObject2 = ((p)localObject1).invoke(paramObject, paramd);
    if (localObject2 == localObject3) {
      return localObject3;
    }
    localObject1 = this;
    label224:
    if (!((Boolean)localObject2).booleanValue())
    {
      o.o = true;
      localObject1 = p;
      o = null;
      p = null;
      s = 3;
      if (((c)localObject1).emit(paramObject, paramd) == localObject3) {
        return localObject3;
      }
      label279:
      return t.a;
    }
    return t.a;
  }
  
  public static final class a
    extends Z5.d
  {
    public Object o;
    public Object p;
    public int s;
    
    public a(h.b paramb, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      q = paramObject;
      s |= 0x80000000;
      return r.emit(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     s6.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */