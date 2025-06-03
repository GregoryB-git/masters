package E5;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t5.b;

public final class d$c
  implements c.a
{
  public final d.d a;
  public final AtomicReference b = new AtomicReference(null);
  
  public d$c(d paramd, d.d paramd1)
  {
    a = paramd1;
  }
  
  public void a(ByteBuffer paramByteBuffer, c.b paramb)
  {
    paramByteBuffer = d.a(c).e(paramByteBuffer);
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
        paramb.a(d.a(c).a(null));
      }
      catch (RuntimeException localRuntimeException)
      {
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("EventChannel#");
        ((StringBuilder)paramObject).append(d.b(c));
        b.c(((StringBuilder)paramObject).toString(), "Failed to close event stream", localRuntimeException);
        paramObject = d.a(c).d("error", localRuntimeException.getMessage(), null);
      }
    } else {
      for (;;)
      {
        paramb.a((ByteBuffer)paramObject);
        break;
        paramObject = d.a(c).d("error", "No active stream to cancel", null);
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
        localStringBuilder.append(d.b(c));
        b.c(localStringBuilder.toString(), "Failed to close existing event stream", localRuntimeException1);
      }
    }
    try
    {
      a.b(paramObject, locala);
      paramb.a(d.a(c).a(null));
    }
    catch (RuntimeException localRuntimeException2)
    {
      b.set(null);
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("EventChannel#");
      ((StringBuilder)paramObject).append(d.b(c));
      b.c(((StringBuilder)paramObject).toString(), "Failed to open event stream", localRuntimeException2);
      paramb.a(d.a(c).d("error", localRuntimeException2.getMessage(), null));
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
        d.c(c).d(d.b(c), d.a(c).a(paramObject));
      }
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      if ((!a.get()) && (d.c.b(d.c.this).get() == this)) {
        d.c(c).d(d.b(c), d.a(c).d(paramString1, paramString2, paramObject));
      }
    }
    
    public void c()
    {
      if ((!a.getAndSet(true)) && (d.c.b(d.c.this).get() == this)) {
        d.c(c).d(d.b(c), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     E5.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */