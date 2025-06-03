package a0;

import android.os.Bundle;

public abstract class d$l
{
  public final Object a;
  public boolean b;
  public boolean c;
  public boolean d;
  public int e;
  
  public d$l(Object paramObject)
  {
    a = paramObject;
  }
  
  public void a()
  {
    if (!b)
    {
      if (!c)
      {
        if (!d)
        {
          b = true;
          return;
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("detach() called when sendError() had already been called for: ");
        localStringBuilder.append(a);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("detach() called when sendResult() had already been called for: ");
      localStringBuilder.append(a);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("detach() called when detach() had already been called for: ");
    localStringBuilder.append(a);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int b()
  {
    return e;
  }
  
  public boolean c()
  {
    boolean bool;
    if ((!b) && (!c) && (!d)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void d(Bundle paramBundle)
  {
    paramBundle = new StringBuilder();
    paramBundle.append("It is not supported to send an error for ");
    paramBundle.append(a);
    throw new UnsupportedOperationException(paramBundle.toString());
  }
  
  public abstract void e(Object paramObject);
  
  public void f(Bundle paramBundle)
  {
    if ((!c) && (!d))
    {
      d = true;
      d(paramBundle);
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("sendError() called when either sendResult() or sendError() had already been called for: ");
    paramBundle.append(a);
    throw new IllegalStateException(paramBundle.toString());
  }
  
  public void g(Object paramObject)
  {
    if ((!c) && (!d))
    {
      c = true;
      e(paramObject);
      return;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
    ((StringBuilder)paramObject).append(a);
    throw new IllegalStateException(((StringBuilder)paramObject).toString());
  }
}

/* Location:
 * Qualified Name:     a0.d.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */