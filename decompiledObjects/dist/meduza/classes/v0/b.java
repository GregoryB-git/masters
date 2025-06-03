package v0;

import android.text.Editable;
import android.text.Editable.Factory;
import t0.h;

public final class b
  extends Editable.Factory
{
  public static final Object a = new Object();
  public static volatile b b;
  public static Class<?> c;
  
  public b()
  {
    try
    {
      c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  public final Editable newEditable(CharSequence paramCharSequence)
  {
    Class localClass = c;
    if (localClass != null) {
      return new h(localClass, paramCharSequence);
    }
    return super.newEditable(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     v0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */