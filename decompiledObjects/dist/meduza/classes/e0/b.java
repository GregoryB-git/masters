package e0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h.a;
import androidx.appcompat.view.menu.m;
import f;

public abstract class b
{
  public a a;
  
  public boolean a()
  {
    return false;
  }
  
  public boolean b()
  {
    return true;
  }
  
  public abstract View c();
  
  public View d(MenuItem paramMenuItem)
  {
    return c();
  }
  
  public boolean e()
  {
    return false;
  }
  
  public void f(m paramm) {}
  
  public boolean g()
  {
    return false;
  }
  
  public void h(h.a parama)
  {
    if (a != null)
    {
      StringBuilder localStringBuilder = f.l("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", localStringBuilder.toString());
    }
    a = parama;
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     e0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */