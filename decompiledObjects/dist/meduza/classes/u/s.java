package u;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract class s
{
  public q a;
  
  public void a(Bundle paramBundle)
  {
    String str = c();
    if (str != null) {
      paramBundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
    }
  }
  
  public abstract void b(t paramt);
  
  public String c()
  {
    return null;
  }
  
  public void d() {}
  
  public void e() {}
  
  public final void f(q paramq)
  {
    if (a != paramq)
    {
      a = paramq;
      if (paramq != null) {
        paramq.g(this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     u.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */