package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

class SearchView$PreQAutoCompleteTextViewReflector
{
  private Method mDoAfterTextChanged = null;
  private Method mDoBeforeTextChanged = null;
  private Method mEnsureImeVisible = null;
  
  @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
  public SearchView$PreQAutoCompleteTextViewReflector()
  {
    preApi29Check();
    try
    {
      localMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      mDoBeforeTextChanged = localMethod;
      localMethod.setAccessible(true);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      try
      {
        localMethod = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        mDoAfterTextChanged = localMethod;
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          for (;;)
          {
            Method localMethod = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
            mEnsureImeVisible = localMethod;
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
  
  private static void preApi29Check()
  {
    if (Build.VERSION.SDK_INT < 29) {
      return;
    }
    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
  }
  
  public void doAfterTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
  {
    preApi29Check();
    Method localMethod = mDoAfterTextChanged;
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
  
  public void doBeforeTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
  {
    preApi29Check();
    Method localMethod = mDoBeforeTextChanged;
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
  
  public void ensureImeVisible(AutoCompleteTextView paramAutoCompleteTextView)
  {
    preApi29Check();
    Method localMethod = mEnsureImeVisible;
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
 * Qualified Name:     androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */