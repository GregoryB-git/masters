package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class W
  extends N
{
  public final WeakReference b;
  
  public W(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    b = new WeakReference(paramContext);
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    Context localContext = (Context)b.get();
    if ((localDrawable != null) && (localContext != null)) {
      M.h().w(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}

/* Location:
 * Qualified Name:     l.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */