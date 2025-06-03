package A2;

import android.util.Log;
import java.util.ArrayList;

public abstract class V
{
  public Object a;
  public boolean b;
  
  public V(c paramc, Object paramObject)
  {
    a = paramObject;
    b = false;
  }
  
  public abstract void a(Object paramObject);
  
  public abstract void b();
  
  public final void c()
  {
    try
    {
      Object localObject1 = a;
      if (b)
      {
        String str = toString();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Callback proxy ");
        localStringBuilder.append(str);
        localStringBuilder.append(" being reused. This is not safe.");
        Log.w("GmsClient", localStringBuilder.toString());
      }
    }
    finally
    {
      break label94;
    }
    if (localObject2 != null) {
      a(localObject2);
    }
    try
    {
      b = true;
      e();
      return;
    }
    finally {}
    label94:
    throw ((Throwable)localObject3);
  }
  
  public final void d()
  {
    try
    {
      a = null;
      return;
    }
    finally {}
  }
  
  public final void e()
  {
    d();
    synchronized (c.Y(c))
    {
      c.Y(c).remove(this);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     A2.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */