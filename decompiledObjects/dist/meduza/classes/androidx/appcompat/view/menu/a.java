package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class a
  implements j
{
  public Context a;
  public Context b;
  public f c;
  public LayoutInflater d;
  public j.a e;
  public int f;
  public int o;
  public k p;
  
  public a(Context paramContext)
  {
    a = paramContext;
    d = LayoutInflater.from(paramContext);
    f = 2131558403;
    o = 2131558402;
  }
  
  public final void d(j.a parama)
  {
    e = parama;
  }
  
  public final boolean e(h paramh)
  {
    return false;
  }
  
  public final boolean j(h paramh)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */