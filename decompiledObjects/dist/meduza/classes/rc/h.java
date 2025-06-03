package rc;

import dc.p;
import nc.y;
import nc.z;
import pc.q;
import sc.w;
import ub.f.a;
import x6.b;

public abstract class h<S, T>
  extends f<T>
{
  public final qc.e<S> d;
  
  public h(qc.e<? extends S> parame, ub.h paramh, int paramInt, pc.a parama)
  {
    super(paramh, paramInt, parama);
    d = parame;
  }
  
  public final Object b(q<? super T> paramq, ub.e<? super rb.h> parame)
  {
    paramq = new r(paramq);
    paramq = d.collect(paramq, parame);
    parame = vb.a.a;
    if (paramq != parame) {
      paramq = rb.h.a;
    }
    if (paramq != parame) {
      paramq = rb.h.a;
    }
    return paramq;
  }
  
  public final Object collect(qc.f<? super T> paramf, ub.e<? super rb.h> parame)
  {
    if (b == -3)
    {
      Object localObject = parame.getContext();
      ub.h localh = a;
      if (!((Boolean)localh.fold(Boolean.FALSE, z.a)).booleanValue()) {
        localh = ((ub.h)localObject).plus(localh);
      } else {
        localh = y.a((ub.h)localObject, localh, false);
      }
      if (ec.i.a(localh, localObject))
      {
        paramf = d.collect(paramf, parame);
        parame = vb.a.a;
        if (paramf != parame) {
          paramf = rb.h.a;
        }
        if (paramf != parame) {
          break label234;
        }
        return paramf;
      }
      f.a locala = f.a.a;
      if (ec.i.a(localh.get(locala), ((ub.h)localObject).get(locala)))
      {
        localObject = parame.getContext();
        if (!(paramf instanceof r)) {
          paramf = new t(paramf, (ub.h)localObject);
        }
        localObject = new g(this, null);
        paramf = b.A0(localh, paramf, w.b(localh), (p)localObject, parame);
        parame = vb.a.a;
        if (paramf != parame) {
          paramf = rb.h.a;
        }
        if (paramf != parame) {
          break label234;
        }
        return paramf;
      }
    }
    paramf = super.collect(paramf, parame);
    if (paramf != vb.a.a) {
      label234:
      paramf = rb.h.a;
    }
    return paramf;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(d);
    localStringBuilder.append(" -> ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     rc.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */