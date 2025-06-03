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
@RequiresApi(21)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class WeightTypefaceApi21
{
  private static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
  private static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
  private static final String NATIVE_INSTANCE_FIELD = "native_instance";
  private static final String TAG = "WeightTypeface";
  private static final Constructor<Typeface> sConstructor;
  private static final Method sNativeCreateFromTypeface;
  private static final Method sNativeCreateWeightAlias;
  private static final Field sNativeInstance;
  private static final Object sWeightCacheLock = new Object();
  @GuardedBy("sWeightCacheLock")
  private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;
  
  static
  {
    Object localObject1 = null;
    try
    {
      localObject2 = Typeface.class.getDeclaredField("native_instance");
      localObject3 = Long.TYPE;
      localObject4 = Integer.TYPE;
      Method localMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", new Class[] { localObject3, localObject4 });
      localMethod.setAccessible(true);
      localObject4 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", new Class[] { localObject3, localObject4 });
      ((AccessibleObject)localObject4).setAccessible(true);
      localObject3 = Typeface.class.getDeclaredConstructor(new Class[] { localObject3 });
      ((AccessibleObject)localObject3).setAccessible(true);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (NoSuchFieldException localNoSuchFieldException) {}
    Log.e("WeightTypeface", localNoSuchFieldException.getClass().getName(), localNoSuchFieldException);
    Object localObject2 = null;
    Object localObject5 = localObject2;
    Object localObject3 = localObject5;
    Object localObject4 = localObject5;
    localObject5 = localObject2;
    localObject2 = localObject1;
    sNativeInstance = (Field)localObject2;
    sNativeCreateFromTypeface = (Method)localObject5;
    sNativeCreateWeightAlias = (Method)localObject4;
    sConstructor = (Constructor)localObject3;
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
      SparseArray localSparseArray = (SparseArray)((LongSparseArray)localObject2).get(l);
      if (localSparseArray == null)
      {
        localSparseArray = new android/util/SparseArray;
        localSparseArray.<init>(4);
        ((LongSparseArray)localObject2).put(l, localSparseArray);
      }
      else
      {
        localObject2 = (Typeface)localSparseArray.get(i);
        if (localObject2 != null) {
          return (Typeface)localObject2;
        }
      }
      if (paramBoolean == paramTypeface.isItalic()) {
        paramTypeface = create(nativeCreateWeightAlias(l, paramInt));
      } else {
        paramTypeface = create(nativeCreateFromTypefaceWithExactStyle(l, paramInt, paramBoolean));
      }
      localSparseArray.put(i, paramTypeface);
      return paramTypeface;
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
    int i;
    if (paramBoolean) {
      i = 2;
    } else {
      i = 0;
    }
    try
    {
      paramLong = ((Long)sNativeCreateFromTypeface.invoke(null, new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) })).longValue();
      paramLong = ((Long)sNativeCreateWeightAlias.invoke(null, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) })).longValue();
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
  
  @SuppressLint({"BanUncheckedReflection"})
  private static long nativeCreateWeightAlias(long paramLong, int paramInt)
  {
    try
    {
      paramLong = ((Long)sNativeCreateWeightAlias.invoke(null, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) })).longValue();
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
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */