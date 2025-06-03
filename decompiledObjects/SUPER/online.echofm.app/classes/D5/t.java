package D5;

import E5.a.e;
import E5.f;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import t5.b;

public class t
{
  public static final a b = new a();
  public final E5.a a;
  
  public t(w5.a parama)
  {
    a = new E5.a(parama, "flutter/settings", f.a);
  }
  
  public static DisplayMetrics b(int paramInt)
  {
    Object localObject = b.c(paramInt);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = t.a.b.a((t.a.b)localObject);
    }
    return (DisplayMetrics)localObject;
  }
  
  public static boolean c()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 34) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public b d()
  {
    return new b(a);
  }
  
  public static class a
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
  
  public static class b
  {
    public final E5.a a;
    public Map b = new HashMap();
    public DisplayMetrics c;
    
    public b(E5.a parama)
    {
      a = parama;
    }
    
    public void a()
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Sending message: \ntextScaleFactor: ");
      ((StringBuilder)localObject).append(b.get("textScaleFactor"));
      ((StringBuilder)localObject).append("\nalwaysUse24HourFormat: ");
      ((StringBuilder)localObject).append(b.get("alwaysUse24HourFormat"));
      ((StringBuilder)localObject).append("\nplatformBrightness: ");
      ((StringBuilder)localObject).append(b.get("platformBrightness"));
      b.f("SettingsChannel", ((StringBuilder)localObject).toString());
      localObject = c;
      if ((t.c()) && (localObject != null))
      {
        t.a.b localb = new t.a.b((DisplayMetrics)localObject);
        localObject = t.a().b(localb);
        b.put("configurationId", Integer.valueOf(a));
        a.d(b, (a.e)localObject);
        return;
      }
      a.c(b);
    }
    
    public b b(boolean paramBoolean)
    {
      b.put("brieflyShowPassword", Boolean.valueOf(paramBoolean));
      return this;
    }
    
    public b c(DisplayMetrics paramDisplayMetrics)
    {
      c = paramDisplayMetrics;
      return this;
    }
    
    public b d(boolean paramBoolean)
    {
      b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(paramBoolean));
      return this;
    }
    
    public b e(t.c paramc)
    {
      b.put("platformBrightness", o);
      return this;
    }
    
    public b f(float paramFloat)
    {
      b.put("textScaleFactor", Float.valueOf(paramFloat));
      return this;
    }
    
    public b g(boolean paramBoolean)
    {
      b.put("alwaysUse24HourFormat", Boolean.valueOf(paramBoolean));
      return this;
    }
  }
  
  public static enum c
  {
    public String o;
    
    public c(String paramString1)
    {
      o = paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     D5.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */