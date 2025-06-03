package w;

import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.RemoteViews;

public abstract class h$f
{
  public h.e a;
  public CharSequence b;
  public CharSequence c;
  public boolean d = false;
  
  public void a(Bundle paramBundle)
  {
    if (d) {
      paramBundle.putCharSequence("android.summaryText", c);
    }
    Object localObject = b;
    if (localObject != null) {
      paramBundle.putCharSequence("android.title.big", (CharSequence)localObject);
    }
    localObject = c();
    if (localObject != null) {
      paramBundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)localObject);
    }
  }
  
  public abstract void b(g paramg);
  
  public String c()
  {
    return null;
  }
  
  public RemoteViews d(g paramg)
  {
    return null;
  }
  
  public RemoteViews e(g paramg)
  {
    return null;
  }
  
  public RemoteViews f(g paramg)
  {
    return null;
  }
  
  public void g(h.e parame)
  {
    if (a != parame)
    {
      a = parame;
      if (parame != null) {
        parame.y(this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     w.h.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */