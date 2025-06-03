package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class j
  extends d
  implements SubMenu
{
  public d B;
  public e C;
  
  public j(Context paramContext, d paramd, e parame)
  {
    super(paramContext);
    B = paramd;
    C = parame;
  }
  
  public boolean B()
  {
    return B.B();
  }
  
  public boolean C()
  {
    return B.C();
  }
  
  public boolean D()
  {
    return B.D();
  }
  
  public void L(d.a parama)
  {
    B.L(parama);
  }
  
  public Menu W()
  {
    return B;
  }
  
  public boolean e(e parame)
  {
    return B.e(parame);
  }
  
  public boolean g(d paramd, MenuItem paramMenuItem)
  {
    boolean bool;
    if ((!super.g(paramd, paramMenuItem)) && (!B.g(paramd, paramMenuItem))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public MenuItem getItem()
  {
    return C;
  }
  
  public boolean j(e parame)
  {
    return B.j(parame);
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    B.setGroupDividerEnabled(paramBoolean);
  }
  
  public SubMenu setHeaderIcon(int paramInt)
  {
    return (SubMenu)super.N(paramInt);
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    return (SubMenu)super.O(paramDrawable);
  }
  
  public SubMenu setHeaderTitle(int paramInt)
  {
    return (SubMenu)super.Q(paramInt);
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    return (SubMenu)super.R(paramCharSequence);
  }
  
  public SubMenu setHeaderView(View paramView)
  {
    return (SubMenu)super.S(paramView);
  }
  
  public SubMenu setIcon(int paramInt)
  {
    C.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable)
  {
    C.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    B.setQwertyMode(paramBoolean);
  }
  
  public d z()
  {
    return B.z();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */