package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(30)
class DropDownListView$Api30Impl
{
  private static boolean sHasMethods;
  private static Method sPositionSelector;
  private static Method sSetNextSelectedPositionInt;
  private static Method sSetSelectedPositionInt;
  
  static
  {
    try
    {
      Object localObject1 = Integer.TYPE;
      Class localClass = Boolean.TYPE;
      Object localObject2 = Float.TYPE;
      localObject2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { localObject1, View.class, localClass, localObject2, localObject2 });
      sPositionSelector = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { localObject1 });
      sSetSelectedPositionInt = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { localObject1 });
      sSetNextSelectedPositionInt = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(true);
      sHasMethods = true;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
    }
  }
  
  public static boolean canPositionSelectorForHoveredItem()
  {
    return sHasMethods;
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  public static void positionSelectorForHoveredItem(DropDownListView paramDropDownListView, int paramInt, View paramView)
  {
    try
    {
      sPositionSelector.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt), paramView, Boolean.FALSE, Integer.valueOf(-1), Integer.valueOf(-1) });
      sSetSelectedPositionInt.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt) });
      sSetNextSelectedPositionInt.invoke(paramDropDownListView, new Object[] { Integer.valueOf(paramInt) });
    }
    catch (InvocationTargetException paramDropDownListView)
    {
      paramDropDownListView.printStackTrace();
    }
    catch (IllegalAccessException paramDropDownListView)
    {
      paramDropDownListView.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */