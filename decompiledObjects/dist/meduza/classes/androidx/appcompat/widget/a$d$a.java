package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.i;
import k.f;
import l.l0;

public final class a$d$a
  extends l0
{
  public a$d$a(a.d paramd, View paramView)
  {
    super(paramView);
  }
  
  public final f b()
  {
    a.e locale = r.d.A;
    if (locale == null) {
      return null;
    }
    return locale.a();
  }
  
  public final boolean c()
  {
    r.d.l();
    return true;
  }
  
  public final boolean d()
  {
    a locala = r.d;
    if (C != null) {
      return false;
    }
    locala.h();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */