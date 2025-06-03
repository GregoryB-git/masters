package nc;

import dc.p;
import ec.j;
import ec.s;
import tc.c;
import ub.e;
import ub.e<*>;
import ub.f.a;
import ub.h;
import ub.h.b;
import ub.i;
import wb.d;

public final class y
{
  public static final h a(h paramh1, h paramh2, final boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.FALSE;
    Object localObject = z.a;
    boolean bool1 = ((Boolean)paramh1.fold(localBoolean, (p)localObject)).booleanValue();
    boolean bool2 = ((Boolean)paramh2.fold(localBoolean, (p)localObject)).booleanValue();
    if ((!bool1) && (!bool2)) {
      return paramh1.plus(paramh2);
    }
    localObject = new s();
    a = paramh2;
    paramh2 = i.a;
    paramh1 = (h)paramh1.fold(paramh2, new b((s)localObject, paramBoolean));
    if (bool2) {
      a = ((h)a).fold(paramh2, a.a);
    }
    return paramh1.plus((h)a);
  }
  
  public static final h b(d0 paramd0, h paramh)
  {
    paramh = a(paramd0.f(), paramh, true);
    c localc = r0.a;
    paramd0 = paramh;
    if (paramh != localc)
    {
      paramd0 = paramh;
      if (paramh.get(f.a.a) == null) {
        paramd0 = paramh.plus(localc);
      }
    }
    return paramd0;
  }
  
  public static final g2<?> c(e<?> parame, h paramh, Object paramObject)
  {
    boolean bool = parame instanceof d;
    Object localObject = null;
    if (!bool) {
      return null;
    }
    int i;
    if (paramh.get(h2.a) != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return null;
    }
    parame = (d)parame;
    d locald;
    do
    {
      if ((parame instanceof o0))
      {
        parame = (e<?>)localObject;
        break;
      }
      locald = parame.getCallerFrame();
      if (locald == null)
      {
        parame = (e<?>)localObject;
        break;
      }
      parame = locald;
    } while (!(locald instanceof g2));
    parame = (g2)locald;
    if (parame != null) {
      parame.f0(paramh, paramObject);
    }
    return parame;
  }
  
  public static final class a
    extends j
    implements p<h, h.b, h>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      h localh = (h)paramObject1;
      paramObject2 = (h.b)paramObject2;
      paramObject1 = paramObject2;
      if ((paramObject2 instanceof x)) {
        paramObject1 = ((x)paramObject2).b0();
      }
      return localh.plus((h)paramObject1);
    }
  }
  
  public static final class b
    extends j
    implements p<h, h.b, h>
  {
    public b(s<h> params, boolean paramBoolean)
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      h localh = (h)paramObject1;
      paramObject1 = (h.b)paramObject2;
      if ((paramObject1 instanceof x)) {
        if (((h)a.a).get(((h.b)paramObject1).getKey()) == null)
        {
          boolean bool = paramBoolean;
          paramObject2 = (x)paramObject1;
          paramObject1 = paramObject2;
          if (bool) {
            paramObject1 = ((x)paramObject2).b0();
          }
        }
        else
        {
          paramObject2 = a;
          a = ((h)a).minusKey(((h.b)paramObject1).getKey());
          paramObject1 = ((x)paramObject1).r0();
        }
      }
      return localh.plus((h)paramObject1);
    }
  }
}

/* Location:
 * Qualified Name:     nc.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */