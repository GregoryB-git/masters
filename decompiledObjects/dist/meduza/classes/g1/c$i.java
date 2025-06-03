package g1;

import android.os.Bundle;
import f;

public class c$i<T>
{
  public final Object a;
  public boolean b;
  public boolean c;
  public boolean d;
  public int e;
  
  public c$i(Object paramObject)
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
        localStringBuilder = f.l("detach() called when sendError() had already been called for: ");
        localStringBuilder.append(a);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      localStringBuilder = f.l("detach() called when sendResult() had already been called for: ");
      localStringBuilder.append(a);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = f.l("detach() called when detach() had already been called for: ");
    localStringBuilder.append(a);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((!b) && (!c) && (!d)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void c(Bundle paramBundle)
  {
    paramBundle = f.l("It is not supported to send an error for ");
    paramBundle.append(a);
    throw new UnsupportedOperationException(paramBundle.toString());
  }
  
  public void d(T paramT)
  {
    throw null;
  }
  
  public final void e(Bundle paramBundle)
  {
    if ((!c) && (!d))
    {
      d = true;
      c(paramBundle);
      throw null;
    }
    paramBundle = f.l("sendError() called when either sendResult() or sendError() had already been called for: ");
    paramBundle.append(a);
    throw new IllegalStateException(paramBundle.toString());
  }
  
  public final void f(T paramT)
  {
    if ((!c) && (!d))
    {
      c = true;
      d(paramT);
      return;
    }
    paramT = f.l("sendResult() called when either sendResult() or sendError() had already been called for: ");
    paramT.append(a);
    throw new IllegalStateException(paramT.toString());
  }
}

/* Location:
 * Qualified Name:     g1.c.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */