package D5;

import E5.a.e;
import android.util.DisplayMetrics;
import java.util.concurrent.ConcurrentLinkedQueue;
import t5.b;

public class t$a
{
  public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
  public b b;
  public b c;
  
  public a.e b(b paramb)
  {
    a.add(paramb);
    final b localb = c;
    c = paramb;
    if (localb == null) {
      paramb = null;
    } else {
      paramb = new a(localb);
    }
    return paramb;
  }
  
  public b c(int paramInt)
  {
    if (b == null) {}
    do
    {
      b = ((b)a.poll());
      localObject = b;
    } while ((localObject != null) && (a < paramInt));
    StringBuilder localStringBuilder;
    if (localObject == null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cannot find config with generation: ");
      localStringBuilder.append(String.valueOf(paramInt));
    }
    for (Object localObject = ", after exhausting the queue.";; localObject = String.valueOf(b.a))
    {
      localStringBuilder.append((String)localObject);
      b.b("SettingsChannel", localStringBuilder.toString());
      return null;
      if (a == paramInt) {
        break;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cannot find config with generation: ");
      localStringBuilder.append(String.valueOf(paramInt));
      localStringBuilder.append(", the oldest config is now: ");
    }
    return (b)localObject;
  }
  
  public class a
    implements a.e
  {
    public a(t.a.b paramb) {}
    
    public void a(Object paramObject)
    {
      t.a.a(t.a.this).remove(localb);
      if (!t.a.a(t.a.this).isEmpty())
      {
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("The queue becomes empty after removing config generation ");
        ((StringBuilder)paramObject).append(String.valueOf(localba));
        b.b("SettingsChannel", ((StringBuilder)paramObject).toString());
      }
    }
  }
  
  public static class b
  {
    public static int c = Integer.MIN_VALUE;
    public final int a;
    public final DisplayMetrics b;
    
    public b(DisplayMetrics paramDisplayMetrics)
    {
      int i = c;
      c = i + 1;
      a = i;
      b = paramDisplayMetrics;
    }
  }
}

/* Location:
 * Qualified Name:     D5.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */