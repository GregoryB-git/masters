package ub;

import dc.p;
import java.io.Serializable;

public final class d
  implements h, Serializable
{
  public final h a;
  public final h.b b;
  
  public d(h.b paramb, h paramh)
  {
    a = paramh;
    b = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if ((paramObject instanceof d))
      {
        d locald = (d)paramObject;
        locald.getClass();
        int i = 2;
        paramObject = locald;
        for (int j = 2;; j++)
        {
          paramObject = a;
          if ((paramObject instanceof d)) {
            paramObject = (d)paramObject;
          } else {
            paramObject = null;
          }
          if (paramObject == null)
          {
            paramObject = this;
            for (;;)
            {
              paramObject = a;
              if ((paramObject instanceof d)) {
                paramObject = (d)paramObject;
              } else {
                paramObject = null;
              }
              if (paramObject == null)
              {
                bool2 = bool1;
                if (j != i) {
                  return bool2;
                }
                for (paramObject = this;; paramObject = (d)paramObject)
                {
                  h.b localb = b;
                  if (!ec.i.a(locald.get(localb.getKey()), localb))
                  {
                    bool3 = false;
                    break label182;
                  }
                  paramObject = a;
                  if (!(paramObject instanceof d)) {
                    break;
                  }
                }
                ec.i.c(paramObject, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                paramObject = (h.b)paramObject;
                boolean bool3 = ec.i.a(locald.get(((h.b)paramObject).getKey()), paramObject);
                label182:
                bool2 = bool1;
                if (!bool3) {
                  return bool2;
                }
                break;
              }
              i++;
            }
          }
        }
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public final <R> R fold(R paramR, p<? super R, ? super h.b, ? extends R> paramp)
  {
    ec.i.e(paramp, "operation");
    return (R)paramp.invoke(a.fold(paramR, paramp), b);
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    ec.i.e(paramc, "key");
    for (Object localObject = this;; localObject = (d)localObject)
    {
      h.b localb = b.get(paramc);
      if (localb != null) {
        return localb;
      }
      localObject = a;
      if (!(localObject instanceof d)) {
        break;
      }
    }
    return ((h)localObject).get(paramc);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i;
  }
  
  public final h minusKey(h.c<?> paramc)
  {
    ec.i.e(paramc, "key");
    if (b.get(paramc) != null) {
      return a;
    }
    paramc = a.minusKey(paramc);
    if (paramc == a) {
      paramc = this;
    } else if (paramc == i.a) {
      paramc = b;
    } else {
      paramc = new d(b, paramc);
    }
    return paramc;
  }
  
  public final h plus(h paramh)
  {
    return h.a.a(this, paramh);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append((String)fold("", new c()));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ub.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */