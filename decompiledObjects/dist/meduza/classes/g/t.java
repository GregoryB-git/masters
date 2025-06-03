package g;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class t
{
  public static Field a;
  public static boolean b;
  public static Class<?> c;
  public static boolean d;
  public static Field e;
  public static boolean f;
  public static Field g;
  public static boolean h;
  
  public static void a(Object paramObject)
  {
    if (!d)
    {
      try
      {
        c = Class.forName("android.content.res.ThemedResourceCache");
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", localClassNotFoundException);
      }
      d = true;
    }
    Object localObject1 = c;
    if (localObject1 == null) {
      return;
    }
    if (!f)
    {
      try
      {
        localObject1 = ((Class)localObject1).getDeclaredField("mUnthemedEntries");
        e = (Field)localObject1;
        ((AccessibleObject)localObject1).setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", localNoSuchFieldException);
      }
      f = true;
    }
    Field localField = e;
    if (localField == null) {
      return;
    }
    Object localObject2 = null;
    try
    {
      paramObject = (LongSparseArray)localField.get(paramObject);
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)paramObject);
      paramObject = localObject2;
    }
    if (paramObject != null) {
      a.a((LongSparseArray)paramObject);
    }
  }
  
  public static final class a
  {
    public static void a(LongSparseArray paramLongSparseArray)
    {
      paramLongSparseArray.clear();
    }
  }
}

/* Location:
 * Qualified Name:     g.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */