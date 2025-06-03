package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class m
  extends f
  implements SubMenu
{
  public f A;
  public h B;
  
  public m(Context paramContext, f paramf, h paramh)
  {
    super(paramContext);
    A = paramf;
    B = paramh;
  }
  
  public final boolean d(h paramh)
  {
    return A.d(paramh);
  }
  
  public final boolean e(f paramf, MenuItem paramMenuItem)
  {
    boolean bool;
    if ((!super.e(paramf, paramMenuItem)) && (!A.e(paramf, paramMenuItem))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean f(h paramh)
  {
    return A.f(paramh);
  }
  
  public final MenuItem getItem()
  {
    return B;
  }
  
  public final String j()
  {
    Object localObject = B;
    int i;
    if (localObject != null) {
      i = a;
    } else {
      i = 0;
    }
    if (i == 0) {
      return null;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("android:menu:actionviewstates");
    ((StringBuilder)localObject).append(":");
    ((StringBuilder)localObject).append(i);
    return ((StringBuilder)localObject).toString();
  }
  
  public final f k()
  {
    return A.k();
  }
  
  public final boolean m()
  {
    return A.m();
  }
  
  public final boolean n()
  {
    return A.n();
  }
  
  public final boolean o()
  {
    return A.o();
  }
  
  public final void setGroupDividerEnabled(boolean paramBoolean)
  {
    A.setGroupDividerEnabled(paramBoolean);
  }
  
  public final SubMenu setHeaderIcon(int paramInt)
  {
    u(0, null, paramInt, null, null);
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    u(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt)
  {
    u(paramInt, null, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    u(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView)
  {
    u(0, null, 0, null, paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt)
  {
    B.setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable)
  {
    B.setIcon(paramDrawable);
    return this;
  }
  
  public final void setQwertyMode(boolean paramBoolean)
  {
    A.setQwertyMode(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */