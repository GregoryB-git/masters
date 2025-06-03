package l;

import android.widget.AbsListView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class j0$e
{
  public static final Field a;
  
  static
  {
    Object localObject = null;
    try
    {
      Field localField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      localObject = localField;
      localField.setAccessible(true);
      localObject = localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
    }
    a = (Field)localObject;
  }
}

/* Location:
 * Qualified Name:     l.j0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */