package u1;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

public class g$i
  extends Drawable.ConstantState
{
  public final Drawable.ConstantState a;
  
  public g$i(Drawable.ConstantState paramConstantState)
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
    g localg = new g();
    o = ((VectorDrawable)a.newDrawable());
    return localg;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    g localg = new g();
    o = ((VectorDrawable)a.newDrawable(paramResources));
    return localg;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    g localg = new g();
    o = ((VectorDrawable)a.newDrawable(paramResources, paramTheme));
    return localg;
  }
}

/* Location:
 * Qualified Name:     u1.g.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */