package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import r.e;
import r.i;

public final class a$b
  extends d.a
{
  public e<Long> I;
  public i<Integer> J;
  
  public a$b(b paramb, a parama, Resources paramResources)
  {
    super(paramb, parama, paramResources);
    if (paramb != null)
    {
      I = I;
      paramb = J;
    }
    else
    {
      I = new e();
      paramb = new i();
    }
    J = paramb;
  }
  
  public final void e()
  {
    I = I.b();
    J = J.b();
  }
  
  public final Drawable newDrawable()
  {
    return new a(this, null);
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    return new a(this, paramResources);
  }
}

/* Location:
 * Qualified Name:     h.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */