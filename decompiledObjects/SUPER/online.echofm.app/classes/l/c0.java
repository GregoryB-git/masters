package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class c0
  extends Resources
{
  public static boolean b = false;
  public final WeakReference a;
  
  public c0(Context paramContext, Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    a = new WeakReference(paramContext);
  }
  
  public static boolean a()
  {
    return b;
  }
  
  public static boolean b()
  {
    a();
    return false;
  }
  
  public final Drawable c(int paramInt)
  {
    return super.getDrawable(paramInt);
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)a.get();
    if (localContext != null) {
      return M.h().s(localContext, this, paramInt);
    }
    return super.getDrawable(paramInt);
  }
}

/* Location:
 * Qualified Name:     l.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */