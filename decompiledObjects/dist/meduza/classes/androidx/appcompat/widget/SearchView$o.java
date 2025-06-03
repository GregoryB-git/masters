package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class SearchView$o
{
  public Method a = null;
  public Method b = null;
  public Method c = null;
  
  public SearchView$o()
  {
    a();
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
  
  public static void a()
  {
    if (Build.VERSION.SDK_INT < 29) {
      return;
    }
    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */