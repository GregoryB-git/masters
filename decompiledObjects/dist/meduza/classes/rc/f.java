package rc;

import java.util.ArrayList;
import nc.e0;

public abstract class f<T>
  implements m<T>
{
  public final ub.h a;
  public final int b;
  public final pc.a c;
  
  public f(ub.h paramh, int paramInt, pc.a parama)
  {
    a = paramh;
    b = paramInt;
    c = parama;
  }
  
  public final qc.e<T> a(ub.h paramh, int paramInt, pc.a parama)
  {
    paramh = paramh.plus(a);
    if (parama == pc.a.a)
    {
      int i = b;
      if (i != -3)
      {
        if (paramInt == -3) {
          paramInt = i;
        }
        for (;;)
        {
          break;
          if (i != -2) {
            if (paramInt == -2)
            {
              paramInt = i;
            }
            else
            {
              paramInt = i + paramInt;
              if (paramInt < 0) {
                paramInt = Integer.MAX_VALUE;
              }
            }
          }
        }
      }
      parama = c;
    }
    if ((ec.i.a(paramh, a)) && (paramInt == b) && (parama == c)) {
      return this;
    }
    return c(paramh, paramInt, parama);
  }
  
  public abstract Object b(pc.q<? super T> paramq, ub.e<? super rb.h> parame);
  
  public abstract f<T> c(ub.h paramh, int paramInt, pc.a parama);
  
  public Object collect(qc.f<? super T> paramf, ub.e<? super rb.h> parame)
  {
    paramf = e0.b(new d(null, paramf, this), parame);
    if (paramf != vb.a.a) {
      paramf = rb.h.a;
    }
    return paramf;
  }
  
  public String toString()
  {
    ArrayList localArrayList = new ArrayList(4);
    if (a != ub.i.a)
    {
      localStringBuilder = f.l("context=");
      localStringBuilder.append(a);
      localArrayList.add(localStringBuilder.toString());
    }
    if (b != -3)
    {
      localStringBuilder = f.l("capacity=");
      localStringBuilder.append(b);
      localArrayList.add(localStringBuilder.toString());
    }
    if (c != pc.a.a)
    {
      localStringBuilder = f.l("onBufferOverflow=");
      localStringBuilder.append(c);
      localArrayList.add(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('[');
    localStringBuilder.append(sb.q.p(localArrayList, ", ", null, null, null, 62));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     rc.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */