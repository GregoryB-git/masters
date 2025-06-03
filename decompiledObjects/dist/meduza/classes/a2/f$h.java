package a2;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

public final class f$h
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState a;
  
  public f$h(Drawable.ConstantState paramConstantState)
  {
    a = paramConstantState;
  }
  
  public final boolean canApplyTheme()
  {
    return a.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return a.getChangingConfigurations();
  }
  
  public final Drawable newDrawable()
  {
    f localf = new f();
    a = ((VectorDrawable)a.newDrawable());
    return localf;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    f localf = new f();
    a = ((VectorDrawable)a.newDrawable(paramResources));
    return localf;
  }
  
  public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    f localf = new f();
    a = ((VectorDrawable)a.newDrawable(paramResources, paramTheme));
    return localf;
  }
}

/* Location:
 * Qualified Name:     a2.f.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */