package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import z.c;

public final class g
  extends e
  implements SubMenu
{
  public final c e;
  
  public g(Context paramContext, c paramc)
  {
    super(paramContext, paramc);
    e = paramc;
  }
  
  public final void clearHeader()
  {
    e.clearHeader();
  }
  
  public final MenuItem getItem()
  {
    return c(e.getItem());
  }
  
  public final SubMenu setHeaderIcon(int paramInt)
  {
    e.setHeaderIcon(paramInt);
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    e.setHeaderIcon(paramDrawable);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt)
  {
    e.setHeaderTitle(paramInt);
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    e.setHeaderTitle(paramCharSequence);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView)
  {
    e.setHeaderView(paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt)
  {
    e.setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable)
  {
    e.setIcon(paramDrawable);
    return this;
  }
}

/* Location:
 * Qualified Name:     k.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */