package P;

import V5.o;
import Y5.b;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import y6.a;

public final class m$k
  implements i
{
  public m$k(a parama, s params, u paramu, m paramm) {}
  
  public Object a(p paramp, X5.d paramd)
  {
    if ((paramd instanceof a))
    {
      localObject1 = (a)paramd;
      i = v;
      if ((i & 0x80000000) != 0)
      {
        v = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    Object localObject1 = new a(this, paramd);
    label48:
    Object localObject2 = t;
    Object localObject3 = b.c();
    int i = v;
    Object localObject4;
    Object localObject5;
    Object localObject7;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            localObject4 = q;
            localObject5 = (u)p;
            paramd = (a)o;
            paramp = paramd;
            try
            {
              o.b(localObject2);
              localObject2 = localObject4;
            }
            finally
            {
              break label528;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject4 = (m)q;
        paramd = (u)p;
        paramp = (a)o;
        localObject5 = paramp;
        try
        {
          o.b(localObject2);
        }
        finally
        {
          paramp = (p)localObject5;
          break label528;
        }
      }
      paramp = (m)s;
      localObject5 = (u)r;
      localObject4 = (s)q;
      paramd = (a)p;
      localObject7 = (p)o;
      o.b(localObject2);
      localObject2 = localObject7;
    }
    else
    {
      o.b(localObject2);
      paramd = a;
      localObject4 = b;
      localObject5 = c;
      localObject7 = d;
      o = paramp;
      p = paramd;
      q = localObject4;
      r = localObject5;
      s = localObject7;
      v = 1;
      if (paramd.a(null, (X5.d)localObject1) == localObject3) {
        return localObject3;
      }
      localObject2 = paramp;
      paramp = (p)localObject7;
    }
    try
    {
      if (!o)
      {
        localObject4 = o;
        o = paramd;
        p = localObject5;
        q = paramp;
        r = null;
        s = null;
        v = 2;
        localObject2 = ((p)localObject2).invoke(localObject4, localObject1);
        if (localObject2 == localObject3) {
          return localObject3;
        }
        localObject4 = paramp;
        paramp = paramd;
        paramd = (X5.d)localObject5;
        localObject5 = paramp;
        if (!Intrinsics.a(localObject2, o))
        {
          localObject5 = paramp;
          o = paramp;
          localObject5 = paramp;
          p = paramd;
          localObject5 = paramp;
          q = localObject2;
          localObject5 = paramp;
          v = 3;
          localObject5 = paramp;
          localObject1 = ((m)localObject4).A(localObject2, (X5.d)localObject1);
          if (localObject1 == localObject3) {
            return localObject3;
          }
          localObject5 = paramd;
          paramd = paramp;
          paramp = paramd;
          o = localObject2;
        }
        else
        {
          localObject5 = paramd;
          paramd = paramp;
        }
        paramp = paramd;
        localObject5 = o;
        paramd.b(null);
        return localObject5;
      }
    }
    finally
    {
      paramp = paramd;
      paramd = (X5.d)localObject6;
      break label528;
    }
    paramp = new java/lang/IllegalStateException;
    paramp.<init>("InitializerApi.updateData should not be called after initialization is complete.");
    throw paramp;
    label528:
    paramp.b(null);
    throw paramd;
  }
  
  public static final class a
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public int v;
    
    public a(m.k paramk, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      t = paramObject;
      v |= 0x80000000;
      return u.a(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     P.m.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */