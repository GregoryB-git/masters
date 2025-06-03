package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class WeightTypefaceApi14
{
  private static final String NATIVE_INSTANCE_FIELD = "native_instance";
  private static final String TAG = "WeightTypeface";
  private static final Field sNativeInstance;
  private static final Object sWeightCacheLock = new Object();
  @GuardedBy("sWeightCacheLock")
  private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;
  
  static
  {
    Field localField2;
    try
    {
      Field localField1 = Typeface.class.getDeclaredField("native_instance");
      localField1.setAccessible(true);
    }
    catch (Exception localException)
    {
      Log.e("WeightTypeface", localException.getClass().getName(), localException);
      localField2 = null;
    }
    sNativeInstance = localField2;
    sWeightTypefaceCache = new LongSparseArray(3);
  }
  
  @Nullable
  public static Typeface createWeightStyle(@NonNull TypefaceCompatBaseImpl paramTypefaceCompatBaseImpl, @NonNull Context paramContext, @NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
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
      paramContext = getBestFontFromFamily(paramTypefaceCompatBaseImpl, paramContext, paramTypeface, paramInt, paramBoolean);
      paramTypefaceCompatBaseImpl = paramContext;
      if (paramContext == null) {
        paramTypefaceCompatBaseImpl = platformTypefaceCreate(paramTypeface, paramInt, paramBoolean);
      }
      localSparseArray.put(i, paramTypefaceCompatBaseImpl);
      return paramTypefaceCompatBaseImpl;
    }
  }
  
  @Nullable
  private static Typeface getBestFontFromFamily(@NonNull TypefaceCompatBaseImpl paramTypefaceCompatBaseImpl, @NonNull Context paramContext, @NonNull Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    paramTypeface = paramTypefaceCompatBaseImpl.getFontFamily(paramTypeface);
    if (paramTypeface == null) {
      return null;
    }
    return paramTypefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(paramContext, paramTypeface, paramContext.getResources(), paramInt, paramBoolean);
  }
  
  private static long getNativeInstance(@NonNull Typeface paramTypeface)
  {
    try
    {
      long l = ((Number)sNativeInstance.get(paramTypeface)).longValue();
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
  
  private static Typeface platformTypefaceCreate(Typeface paramTypeface, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    if (paramInt >= 600) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((paramInt == 0) && (!paramBoolean)) {
      paramInt = 0;
    } else if (paramInt == 0) {
      paramInt = 2;
    } else if (!paramBoolean) {
      paramInt = i;
    } else {
      paramInt = 3;
    }
    return Typeface.create(paramTypeface, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.WeightTypefaceApi14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */