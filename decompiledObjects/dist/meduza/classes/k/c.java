package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h.a;
import androidx.appcompat.view.menu.m;
import e0.b.a;
import java.lang.reflect.Method;

public final class c
  extends b
  implements MenuItem
{
  public final z.b d;
  public Method e;
  
  public c(Context paramContext, z.b paramb)
  {
    super(paramContext);
    if (paramb != null)
    {
      d = paramb;
      return;
    }
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public final boolean collapseActionView()
  {
    return d.collapseActionView();
  }
  
  public final boolean expandActionView()
  {
    return d.expandActionView();
  }
  
  public final ActionProvider getActionProvider()
  {
    e0.b localb = d.b();
    if ((localb instanceof a)) {
      return b;
    }
    return null;
  }
  
  public final View getActionView()
  {
    View localView1 = d.getActionView();
    View localView2 = localView1;
    if ((localView1 instanceof c)) {
      localView2 = (View)a;
    }
    return localView2;
  }
  
  public final int getAlphabeticModifiers()
  {
    return d.getAlphabeticModifiers();
  }
  
  public final char getAlphabeticShortcut()
  {
    return d.getAlphabeticShortcut();
  }
  
  public final CharSequence getContentDescription()
  {
    return d.getContentDescription();
  }
  
  public final int getGroupId()
  {
    return d.getGroupId();
  }
  
  public final Drawable getIcon()
  {
    return d.getIcon();
  }
  
  public final ColorStateList getIconTintList()
  {
    return d.getIconTintList();
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return d.getIconTintMode();
  }
  
  public final Intent getIntent()
  {
    return d.getIntent();
  }
  
  public final int getItemId()
  {
    return d.getItemId();
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return d.getMenuInfo();
  }
  
  public final int getNumericModifiers()
  {
    return d.getNumericModifiers();
  }
  
  public final char getNumericShortcut()
  {
    return d.getNumericShortcut();
  }
  
  public final int getOrder()
  {
    return d.getOrder();
  }
  
  public final SubMenu getSubMenu()
  {
    return d(d.getSubMenu());
  }
  
  public final CharSequence getTitle()
  {
    return d.getTitle();
  }
  
  public final CharSequence getTitleCondensed()
  {
    return d.getTitleCondensed();
  }
  
  public final CharSequence getTooltipText()
  {
    return d.getTooltipText();
  }
  
  public final boolean hasSubMenu()
  {
    return d.hasSubMenu();
  }
  
  public final boolean isActionViewExpanded()
  {
    return d.isActionViewExpanded();
  }
  
  public final boolean isCheckable()
  {
    return d.isCheckable();
  }
  
  public final boolean isChecked()
  {
    return d.isChecked();
  }
  
  public final boolean isEnabled()
  {
    return d.isEnabled();
  }
  
  public final boolean isVisible()
  {
    return d.isVisible();
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = new b(paramActionProvider);
    z.b localb1 = d;
    if (paramActionProvider != null) {
      paramActionProvider = localb;
    } else {
      paramActionProvider = null;
    }
    localb1.a(paramActionProvider);
    return this;
  }
  
  public final MenuItem setActionView(int paramInt)
  {
    d.setActionView(paramInt);
    View localView = d.getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      d.setActionView(new c(localView));
    }
    return this;
  }
  
  public final MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new c(paramView);
    }
    d.setActionView((View)localObject);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    d.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    d.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    d.setCheckable(paramBoolean);
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    d.setChecked(paramBoolean);
    return this;
  }
  
  public final MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    d.setContentDescription(paramCharSequence);
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    d.setEnabled(paramBoolean);
    return this;
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    d.setIcon(paramInt);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    d.setIcon(paramDrawable);
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    d.setIconTintList(paramColorStateList);
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    d.setIconTintMode(paramMode);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    d.setIntent(paramIntent);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    d.setNumericShortcut(paramChar);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    d.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    z.b localb = d;
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new d(paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    }
    localb.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    z.b localb = d;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new e(paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    }
    localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    d.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    d.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    d.setShowAsAction(paramInt);
  }
  
  public final MenuItem setShowAsActionFlags(int paramInt)
  {
    d.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    d.setTitle(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    d.setTitle(paramCharSequence);
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    d.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public final MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    d.setTooltipText(paramCharSequence);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    return d.setVisible(paramBoolean);
  }
  
  public class a
    extends e0.b
  {
    public final ActionProvider b;
    
    public a(ActionProvider paramActionProvider)
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
      b.onPrepareSubMenu(d(paramm));
    }
  }
  
  public final class b
    extends c.a
    implements ActionProvider.VisibilityListener
  {
    public b.a d;
    
    public b(ActionProvider paramActionProvider)
    {
      super(paramActionProvider);
    }
    
    public final boolean b()
    {
      return b.isVisible();
    }
    
    public final View d(MenuItem paramMenuItem)
    {
      return b.onCreateActionView(paramMenuItem);
    }
    
    public final boolean g()
    {
      return b.overridesItemVisibility();
    }
    
    public final void h(h.a parama)
    {
      d = parama;
      b.setVisibilityListener(this);
    }
    
    public final void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      Object localObject = d;
      if (localObject != null)
      {
        localObject = a.n;
        h = true;
        ((f)localObject).p(true);
      }
    }
  }
  
  public static final class c
    extends FrameLayout
    implements j.b
  {
    public final CollapsibleActionView a;
    
    public c(View paramView)
    {
      super();
      a = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    public final void onActionViewCollapsed()
    {
      a.onActionViewCollapsed();
    }
    
    public final void onActionViewExpanded()
    {
      a.onActionViewExpanded();
    }
  }
  
  public final class d
    implements MenuItem.OnActionExpandListener
  {
    public final MenuItem.OnActionExpandListener a;
    
    public d(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      a = paramOnActionExpandListener;
    }
    
    public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return a.onMenuItemActionCollapse(c(paramMenuItem));
    }
    
    public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return a.onMenuItemActionExpand(c(paramMenuItem));
    }
  }
  
  public final class e
    implements MenuItem.OnMenuItemClickListener
  {
    public final MenuItem.OnMenuItemClickListener a;
    
    public e(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      a = paramOnMenuItemClickListener;
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return a.onMenuItemClick(c(paramMenuItem));
    }
  }
}

/* Location:
 * Qualified Name:     k.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */