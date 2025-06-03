package sc;

import d2.h0;
import dc.p;
import ec.i;
import ec.j;
import nc.b2;
import ub.h;
import ub.h.b;

public final class w
{
  public static final h0 a = new h0("NO_THREAD_ELEMENTS", 9);
  public static final a b = a.a;
  public static final b c = b.a;
  public static final c d = c.a;
  
  public static final void a(h paramh, Object paramObject)
  {
    if (paramObject == a) {
      return;
    }
    if ((paramObject instanceof z))
    {
      paramObject = (z)paramObject;
      int i = c.length - 1;
      if (i >= 0) {
        for (;;)
        {
          int j = i - 1;
          paramh = c[i];
          i.b(paramh);
          paramh.k0(b[i]);
          if (j < 0) {
            break;
          }
          i = j;
        }
      }
    }
    else
    {
      paramh = paramh.fold(null, c);
      i.c(paramh, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
      ((b2)paramh).k0(paramObject);
    }
  }
  
  public static final Object b(h paramh)
  {
    paramh = paramh.fold(Integer.valueOf(0), b);
    i.b(paramh);
    return paramh;
  }
  
  public static final Object c(h paramh, Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = b(paramh);
    }
    if (localObject == Integer.valueOf(0)) {
      paramh = a;
    } else if ((localObject instanceof Integer)) {
      paramh = paramh.fold(new z(paramh, ((Number)localObject).intValue()), d);
    } else {
      paramh = ((b2)localObject).M(paramh);
    }
    return paramh;
  }
  
  public static final class a
    extends j
    implements p<Object, h.b, Object>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      h.b localb = (h.b)paramObject2;
      paramObject2 = paramObject1;
      if ((localb instanceof b2))
      {
        if ((paramObject1 instanceof Integer)) {
          paramObject1 = (Integer)paramObject1;
        } else {
          paramObject1 = null;
        }
        int i;
        if (paramObject1 != null) {
          i = ((Integer)paramObject1).intValue();
        } else {
          i = 1;
        }
        if (i == 0) {
          paramObject2 = localb;
        } else {
          paramObject2 = Integer.valueOf(i + 1);
        }
      }
      return paramObject2;
    }
  }
  
  public static final class b
    extends j
    implements p<b2<?>, h.b, b2<?>>
  {
    public static final b a = new b();
    
    public b()
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (b2)paramObject1;
      paramObject2 = (h.b)paramObject2;
      if (paramObject1 == null) {
        if ((paramObject2 instanceof b2)) {
          paramObject1 = (b2)paramObject2;
        } else {
          paramObject1 = null;
        }
      }
      return paramObject1;
    }
  }
  
  public static final class c
    extends j
    implements p<z, h.b, z>
  {
    public static final c a = new c();
    
    public c()
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (z)paramObject1;
      paramObject2 = (h.b)paramObject2;
      if ((paramObject2 instanceof b2))
      {
        paramObject2 = (b2)paramObject2;
        Object localObject = ((b2)paramObject2).M(a);
        Object[] arrayOfObject = b;
        int i = d;
        arrayOfObject[i] = localObject;
        localObject = c;
        d = (i + 1);
        localObject[i] = paramObject2;
      }
      return paramObject1;
    }
  }
}

/* Location:
 * Qualified Name:     sc.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */