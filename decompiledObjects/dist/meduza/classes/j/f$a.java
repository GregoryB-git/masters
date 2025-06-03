package j;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import f;
import java.lang.reflect.Method;

public final class f$a
  implements MenuItem.OnMenuItemClickListener
{
  public static final Class<?>[] c = { MenuItem.class };
  public Object a;
  public Method b;
  
  public f$a(Object paramObject, String paramString)
  {
    a = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      b = localClass.getMethod(paramString, c);
      return;
    }
    catch (Exception paramObject)
    {
      paramString = f.m("Couldn't resolve menu item onClick handler ", paramString, " in class ");
      paramString.append(localClass.getName());
      paramString = new InflateException(paramString.toString());
      paramString.initCause((Throwable)paramObject);
      throw paramString;
    }
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (b.getReturnType() == Boolean.TYPE) {
        return ((Boolean)b.invoke(a, new Object[] { paramMenuItem })).booleanValue();
      }
      b.invoke(a, new Object[] { paramMenuItem });
      return true;
    }
    catch (Exception paramMenuItem)
    {
      throw new RuntimeException(paramMenuItem);
    }
  }
}

/* Location:
 * Qualified Name:     j.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */