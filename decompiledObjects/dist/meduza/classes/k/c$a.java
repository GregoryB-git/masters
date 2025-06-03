package k;

import android.view.ActionProvider;
import android.view.View;
import androidx.appcompat.view.menu.m;

public class c$a
  extends e0.b
{
  public final ActionProvider b;
  
  public c$a(c paramc, ActionProvider paramActionProvider)
  {
    b = paramActionProvider;
  }
  
  public final boolean a()
  {
    return b.hasSubMenu();
  }
  
  public final View c()
  {
    return b.onCreateActionView();
  }
  
  public final boolean e()
  {
    return b.onPerformDefaultAction();
  }
  
  public final void f(m paramm)
  {
    b.onPrepareSubMenu(c.d(paramm));
  }
}

/* Location:
 * Qualified Name:     k.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */