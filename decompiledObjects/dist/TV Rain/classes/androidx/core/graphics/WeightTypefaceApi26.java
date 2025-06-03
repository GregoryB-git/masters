package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"SoonBlockedPrivateApi"})
@RequiresApi(26)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class WeightTypefaceApi26
{
  private static final String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
  private static final String NATIVE_INSTANCE_FIELD = "native_instance";
  private static final String TAG = "WeightTypeface";
  private static final Constructor<Typeface> sConstructor;
  private static final Method sNativeCreateFromTypefaceWithExactStyle;
  private static final Field sNativeInstance;
  private static final Object sWeightCacheLock = new Object();
  @GuardedBy("sWeightCacheLock")
  private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;
  
  static
  {
    Object localObject1 = null;
    try
    {
      Field localField = Typeface.class.getDeclaredField("native_instance");
      localObject2 = Long.TYPE;
      Method localMethod1 = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", new Class[] { localObject2, Integer.TYPE, Boolean.TYPE });
      localMethod1.setAccessible(true);
      localObject2 = Typeface.class.getDeclaredConstructor(new Class[] { localObject2 });
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = localField;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (NoSuchFieldException localNoSuchFieldException) {}
    Log.e("WeightTypeface", localNoSuchFieldException.getClass().getName(), localNoSuchFieldException);
    Method localMethod2 = null;
    Object localObject2 = localMethod2;
    sNativeInstance = (Field)localObject1;
    sNativeCreateFromTypefaceWithExactStyle = localMethod2;
    sConstructor = (Constructor)localObject2;
    sWeightTypefaceCache = new LongSparseArray(3);
  }
  
  @Nullable
  private static Typeface create(long paramLong)
  {
    try
    {
      Typeface localTypeface = (Typeface)sConstructor.newInstance(new Object[] { Long.valueOf(paramLong) });
      return localTypeface;
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  @Nullable
  public static Typeface createWeightStyle(@NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    if (!isPrivateApiAvailable()) {
      return null;
    }
    int i = paramInt << 1 | paramBoolean;
    synchronized (sWeightCacheLock)
    {
      long l = getNativeInstance(paramTypeface);
      Object localObject2 = sWeightTypefaceCache;
      paramTypeface = (SparseArray)((LongSparseArray)localObject2).get(l);
      if (paramTypeface == null)
      {
        paramTypeface = new android/util/SparseArray;
        paramTypeface.<init>(4);
        ((LongSparseArray)localObject2).put(l, paramTypeface);
      }
      else
      {
        localObject2 = (Typeface)paramTypeface.get(i);
        if (localObject2 != null) {
          return (Typeface)localObject2;
        }
      }
      localObject2 = create(nativeCreateFromTypefaceWithExactStyle(l, paramInt, paramBoolean));
      paramTypeface.put(i, localObject2);
      return (Typeface)localObject2;
    }
  }
  
  private static long getNativeInstance(@NonNull Typeface paramTypeface)
  {
    try
    {
      long l = sNativeInstance.getLong(paramTypeface);
      return l;
    }
    catch (IllegalAccessException paramTypeface)
    {
      throw new RuntimeException(paramTypeface);
    }
  }
  
  private static boolean isPrivateApiAvailable()
  {
    boolean bool;
    if (sNativeInstance != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  private static long nativeCreateFromTypefaceWithExactStyle(long paramLong, int paramInt, boolean paramBoolean)
  {
    try
    {
      paramLong = ((Long)sNativeCreateFromTypefaceWithExactStyle.invoke(null, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).longValue();
      return paramLong;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */