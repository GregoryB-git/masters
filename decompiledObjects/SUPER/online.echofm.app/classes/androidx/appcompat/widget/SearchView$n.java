package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public class SearchView$n
{
  public Method a = null;
  public Method b = null;
  public Method c = null;
  
  public SearchView$n()
  {
    d();
    try
    {
      localMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      a = localMethod;
      localMethod.setAccessible(true);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      try
      {
        localMethod = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        b = localMethod;
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          for (;;)
          {
            Method localMethod = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
            c = localMethod;
            localMethod.setAccessible(true);
            return;
            localNoSuchMethodException1 = localNoSuchMethodException1;
            continue;
            localNoSuchMethodException2 = localNoSuchMethodException2;
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public static void d()
  {
    if (Build.VERSION.SDK_INT < 29) {
      return;
    }
    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
  }
  
  public void a(AutoCompleteTextView paramAutoCompleteTextView)
  {
    d();
    Method localMethod = b;
    if (localMethod != null) {}
    try
    {
      localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      for (;;) {}
    }
  }
  
  public void b(AutoCompleteTextView paramAutoCompleteTextView)
  {
    d();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      for (;;) {}
    }
  }
  
  public void c(AutoCompleteTextView paramAutoCompleteTextView)
  {
    d();
    Method localMethod = c;
    if (localMethod != null) {}
    try
    {
      localMethod.invoke(paramAutoCompleteTextView, new Object[] { Boolean.TRUE });
      return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */