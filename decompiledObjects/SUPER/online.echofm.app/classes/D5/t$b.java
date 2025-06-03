package D5;

import E5.a;
import E5.a.e;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import t5.b;

public class t$b
{
  public final a a;
  public Map b = new HashMap();
  public DisplayMetrics c;
  
  public t$b(a parama)
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

/* Location:
 * Qualified Name:     D5.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */