package r0;

import dc.p;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.q;
import rb.f;
import rb.h;

public final class b
  implements o0.i<d>
{
  public final o0.i<d> a;
  
  public b(q paramq)
  {
    a = paramq;
  }
  
  public final Object a(p<? super d, ? super ub.e<? super d>, ? extends Object> paramp, ub.e<? super d> parame)
  {
    return a.a(new a(paramp, null), parame);
  }
  
  public final qc.e<d> getData()
  {
    return a.getData();
  }
  
  @wb.e(c="androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f="PreferenceDataStoreFactory.kt", l={85}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d, ub.e<? super d>, Object>
  {
    public int a;
    
    public a(p<? super d, ? super ub.e<? super d>, ? extends Object> paramp, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new a(c, parame);
      b = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = a;
      if (i != 0)
      {
        if (i == 1) {
          f.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        f.b(paramObject);
        paramObject = (d)b;
        Object localObject = c;
        a = 1;
        localObject = ((p)localObject).invoke(paramObject, this);
        paramObject = localObject;
        if (localObject == locala) {
          return locala;
        }
      }
      paramObject = (d)paramObject;
      b.set(true);
      return paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     r0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */