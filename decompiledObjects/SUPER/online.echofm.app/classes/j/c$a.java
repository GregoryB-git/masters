package j;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

public class c$a
  implements MenuItem.OnMenuItemClickListener
{
  public static final Class[] c = { MenuItem.class };
  public Object a;
  public Method b;
  
  public c$a(Object paramObject, String paramString)
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
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Couldn't resolve menu item onClick handler ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" in class ");
      localStringBuilder.append(localClass.getName());
      paramString = new InflateException(localStringBuilder.toString());
      paramString.initCause((Throwable)paramObject);
      throw paramString;
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (b.getReturnType() == Boolean.TYPE) {
        return ((Boolean)b.invoke(a, new Object[] { paramMenuItem })).booleanValue();
      }
    }
    catch (Exception paramMenuItem)
    {
      break label65;
      b.invoke(a, new Object[] { paramMenuItem });
      return true;
      label65:
      throw new RuntimeException(paramMenuItem);
    }
  }
}

/* Location:
 * Qualified Name:     j.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */