package a2;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public final class b$c
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState a;
  
  public b$c(Drawable.ConstantState paramConstantState)
  {
    a = paramConstantState;
  }
  
  public final boolean canApplyTheme()
  {
    return a.canApplyTheme();
  }
  
  public final int getChangingConfigurations()
  {
    return a.getChangingConfigurations();
  }
  
  public final Drawable newDrawable()
  {
    b localb = new b();
    Drawable localDrawable = a.newDrawable();
    a = localDrawable;
    localDrawable.setCallback(d);
    return localb;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    b localb = new b();
    paramResources = a.newDrawable(paramResources);
    a = paramResources;
    paramResources.setCallback(d);
    return localb;
  }
  
  public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    b localb = new b();
    paramResources = a.newDrawable(paramResources, paramTheme);
    a = paramResources;
    paramResources.setCallback(d);
    return localb;
  }
}

/* Location:
 * Qualified Name:     a2.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */