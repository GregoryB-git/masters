package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import l.M;

public abstract class a
{
  public static final ThreadLocal a = new ThreadLocal();
  public static final WeakHashMap b = new WeakHashMap(0);
  public static final Object c = new Object();
  
  public static ColorStateList a(Context paramContext, int paramInt)
  {
    return paramContext.getColorStateList(paramInt);
  }
  
  public static Drawable b(Context paramContext, int paramInt)
  {
    return M.h().j(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */