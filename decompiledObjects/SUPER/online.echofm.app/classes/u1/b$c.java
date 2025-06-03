package u1;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public class b$c
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState a;
  
  public b$c(Drawable.ConstantState paramConstantState)
  {
    a = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return a.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return a.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    b localb = new b();
    Drawable localDrawable = a.newDrawable();
    o = localDrawable;
    localDrawable.setCallback(u);
    return localb;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    b localb = new b();
    paramResources = a.newDrawable(paramResources);
    o = paramResources;
    paramResources.setCallback(u);
    return localb;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    b localb = new b();
    paramResources = a.newDrawable(paramResources, paramTheme);
    o = paramResources;
    paramResources.setCallback(u);
    return localb;
  }
}

/* Location:
 * Qualified Name:     u1.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */