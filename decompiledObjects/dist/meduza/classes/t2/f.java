package t2;

import dc.q;
import rb.h;
import rc.l;

public final class f
  implements qc.e<b>
{
  public f(qc.e[] paramArrayOfe) {}
  
  public final Object collect(qc.f paramf, ub.e parame)
  {
    qc.e[] arrayOfe = a;
    paramf = new rc.j(null, new a(arrayOfe), new b(null), paramf, arrayOfe);
    parame = new l(parame, parame.getContext());
    paramf = x6.b.t0(parame, parame, paramf);
    parame = vb.a.a;
    if (paramf != parame) {
      paramf = h.a;
    }
    if (paramf == parame) {
      return paramf;
    }
    return h.a;
  }
  
  public static final class a
    extends ec.j
    implements dc.a<b[]>
  {
    public a(qc.e[] paramArrayOfe)
    {
      super();
    }
    
    public final Object invoke()
    {
      return new b[a.length];
    }
  }
  
  @wb.e(c="androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f="WorkConstraintsTracker.kt", l={292}, m="invokeSuspend")
  public static final class b
    extends wb.i
    implements q<qc.f<? super b>, b[], ub.e<? super h>, Object>
  {
    public int a;
    
    public b(ub.e parame)
    {
      super(parame);
    }
    
    public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
    {
      paramObject1 = (Object[])paramObject1;
      paramObject2 = new b((ub.e)paramObject2);
      b = paramf;
      c = ((Object[])paramObject1);
      return ((b)paramObject2).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = a;
      if (i != 0)
      {
        if (i == 1) {
          rb.f.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        rb.f.b(paramObject);
        qc.f localf = b;
        Object localObject = (b[])c;
        i = 0;
        int j = localObject.length;
        while (i < j)
        {
          paramObject = localObject[i];
          if ((ec.i.a(paramObject, b.a.a) ^ true)) {
            break label95;
          }
          i++;
        }
        paramObject = null;
        label95:
        localObject = paramObject;
        if (paramObject == null) {
          localObject = b.a.a;
        }
        a = 1;
        if (localf.emit(localObject, this) == locala) {
          return locala;
        }
      }
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     t2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */