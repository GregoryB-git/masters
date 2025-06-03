package E5;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t5.b;

public final class d
{
  public final c a;
  public final String b;
  public final l c;
  public final c.c d;
  
  public d(c paramc, String paramString)
  {
    this(paramc, paramString, q.b);
  }
  
  public d(c paramc, String paramString, l paraml)
  {
    this(paramc, paramString, paraml, null);
  }
  
  public d(c paramc, String paramString, l paraml, c.c paramc1)
  {
    a = paramc;
    b = paramString;
    c = paraml;
    d = paramc1;
  }
  
  public void d(d paramd)
  {
    Object localObject = d;
    c localc1 = null;
    c localc2 = null;
    if (localObject != null)
    {
      localc1 = a;
      localObject = b;
      if (paramd == null) {
        paramd = localc2;
      } else {
        paramd = new c(paramd);
      }
      localc1.h((String)localObject, paramd, d);
    }
    else
    {
      localc2 = a;
      localObject = b;
      if (paramd == null) {
        paramd = localc1;
      } else {
        paramd = new c(paramd);
      }
      localc2.c((String)localObject, paramd);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Object paramObject);
    
    public abstract void b(String paramString1, String paramString2, Object paramObject);
    
    public abstract void c();
  }
  
  public final class c
    implements c.a
  {
    public final d.d a;
    public final AtomicReference b = new AtomicReference(null);
    
    public c(d.d paramd)
    {
      a = paramd;
    }
    
    public void a(ByteBuffer paramByteBuffer, c.b paramb)
    {
      paramByteBuffer = d.a(d.this).e(paramByteBuffer);
      if (a.equals("listen")) {
        d(b, paramb);
      } else if (a.equals("cancel")) {
        c(b, paramb);
      } else {
        paramb.a(null);
      }
    }
    
    public final void c(Object paramObject, c.b paramb)
    {
      if ((d.b)b.getAndSet(null) != null) {
        try
        {
          a.a(paramObject);
          paramb.a(d.a(d.this).a(null));
        }
        catch (RuntimeException localRuntimeException)
        {
          paramObject = new StringBuilder();
          ((StringBuilder)paramObject).append("EventChannel#");
          ((StringBuilder)paramObject).append(d.b(d.this));
          b.c(((StringBuilder)paramObject).toString(), "Failed to close event stream", localRuntimeException);
          paramObject = d.a(d.this).d("error", localRuntimeException.getMessage(), null);
        }
      } else {
        for (;;)
        {
          paramb.a((ByteBuffer)paramObject);
          break;
          paramObject = d.a(d.this).d("error", "No active stream to cancel", null);
        }
      }
    }
    
    public final void d(Object paramObject, c.b paramb)
    {
      a locala = new a(null);
      if ((d.b)b.getAndSet(locala) != null) {
        try
        {
          a.a(null);
        }
        catch (RuntimeException localRuntimeException1)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("EventChannel#");
          localStringBuilder.append(d.b(d.this));
          b.c(localStringBuilder.toString(), "Failed to close existing event stream", localRuntimeException1);
        }
      }
      try
      {
        a.b(paramObject, locala);
        paramb.a(d.a(d.this).a(null));
      }
      catch (RuntimeException localRuntimeException2)
      {
        b.set(null);
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("EventChannel#");
        ((StringBuilder)paramObject).append(d.b(d.this));
        b.c(((StringBuilder)paramObject).toString(), "Failed to open event stream", localRuntimeException2);
        paramb.a(d.a(d.this).d("error", localRuntimeException2.getMessage(), null));
      }
    }
    
    public final class a
      implements d.b
    {
      public final AtomicBoolean a = new AtomicBoolean(false);
      
      public a() {}
      
      public void a(Object paramObject)
      {
        if ((!a.get()) && (d.c.b(d.c.this).get() == this)) {
          d.c(d.this).d(d.b(d.this), d.a(d.this).a(paramObject));
        }
      }
      
      public void b(String paramString1, String paramString2, Object paramObject)
      {
        if ((!a.get()) && (d.c.b(d.c.this).get() == this)) {
          d.c(d.this).d(d.b(d.this), d.a(d.this).d(paramString1, paramString2, paramObject));
        }
      }
      
      public void c()
      {
        if ((!a.getAndSet(true)) && (d.c.b(d.c.this).get() == this)) {
          d.c(d.this).d(d.b(d.this), null);
        }
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(Object paramObject);
    
    public abstract void b(Object paramObject, d.b paramb);
  }
}

/* Location:
 * Qualified Name:     E5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */