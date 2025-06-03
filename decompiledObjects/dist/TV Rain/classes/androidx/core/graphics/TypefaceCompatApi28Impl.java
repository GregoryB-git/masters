package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi28Impl
  extends TypefaceCompatApi26Impl
{
  private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
  private static final String DEFAULT_FAMILY = "sans-serif";
  private static final int RESOLVE_BY_FONT_TABLE = -1;
  
  public Typeface createFromFamiliesWithDefault(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(mFontFamily, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)mCreateFromFamiliesWithDefault.invoke(null, new Object[] { localObject, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  @NonNull
  public Typeface createWeightStyle(@NonNull Context paramContext, @NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    return c.d(paramTypeface, paramInt, paramBoolean);
  }
  
  public Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> paramClass)
    throws NoSuchMethodException
  {
    Class localClass = Array.newInstance(paramClass, 1).getClass();
    paramClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { localClass, String.class, paramClass, paramClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */