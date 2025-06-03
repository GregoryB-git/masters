package l1;

import android.net.Uri;
import android.view.InputEvent;
import b.a0;
import dc.p;
import m1.d;
import m1.d.a;
import nc.d0;
import nc.e0;
import nc.r0;
import rb.h;
import x6.b;

public final class a$a
  extends a
{
  public final d a;
  
  public a$a(d.a parama)
  {
    a = parama;
  }
  
  public s7.e<Integer> a()
  {
    return a0.h(b.h(e0.a(r0.a), new a(this, null)));
  }
  
  public s7.e<h> b(final Uri paramUri)
  {
    ec.i.e(paramUri, "trigger");
    return a0.h(b.h(e0.a(r0.a), new c(this, paramUri, null)));
  }
  
  public s7.e<h> c(m1.a parama)
  {
    ec.i.e(parama, "deletionRequest");
    throw null;
  }
  
  public s7.e<h> d(final Uri paramUri, final InputEvent paramInputEvent)
  {
    ec.i.e(paramUri, "attributionSource");
    return a0.h(b.h(e0.a(r0.a), new b(this, paramUri, paramInputEvent, null)));
  }
  
  public s7.e<h> e(m1.e parame)
  {
    ec.i.e(parame, "request");
    throw null;
  }
  
  public s7.e<h> f(m1.f paramf)
  {
    ec.i.e(paramf, "request");
    throw null;
  }
  
  @wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f="MeasurementManagerFutures.kt", l={169}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super Integer>, Object>
  {
    public int a;
    
    public a(a.a parama, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(b, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
        paramObject = b.a;
        a = 1;
        Object localObject = ((d)paramObject).a(this);
        paramObject = localObject;
        if (localObject == locala) {
          return locala;
        }
      }
      return paramObject;
    }
  }
  
  @wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f="MeasurementManagerFutures.kt", l={133}, m="invokeSuspend")
  public static final class b
    extends wb.i
    implements p<d0, ub.e<? super h>, Object>
  {
    public int a;
    
    public b(a.a parama, Uri paramUri, InputEvent paramInputEvent, ub.e<? super b> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      return new b(b, paramUri, paramInputEvent, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((b)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
        d locald = b.a;
        Uri localUri = paramUri;
        paramObject = paramInputEvent;
        a = 1;
        if (locald.b(localUri, (InputEvent)paramObject, this) == locala) {
          return locala;
        }
      }
      return h.a;
    }
  }
  
  @wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f="MeasurementManagerFutures.kt", l={141}, m="invokeSuspend")
  public static final class c
    extends wb.i
    implements p<d0, ub.e<? super h>, Object>
  {
    public int a;
    
    public c(a.a parama, Uri paramUri, ub.e<? super c> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      return new c(b, paramUri, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((c)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
        paramObject = b.a;
        Uri localUri = paramUri;
        a = 1;
        if (((d)paramObject).c(localUri, this) == locala) {
          return locala;
        }
      }
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     l1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */