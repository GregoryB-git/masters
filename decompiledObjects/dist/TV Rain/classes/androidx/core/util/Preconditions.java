package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Preconditions
{
  public static void checkArgument(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void checkArgument(boolean paramBoolean, @NonNull Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void checkArgument(boolean paramBoolean, @NonNull String paramString, @NonNull Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  public static float checkArgumentFinite(float paramFloat, @NonNull String paramString)
  {
    if (!Float.isNaN(paramFloat))
    {
      if (!Float.isInfinite(paramFloat)) {
        return paramFloat;
      }
      throw new IllegalArgumentException(z2.o(paramString, " must not be infinite"));
    }
    throw new IllegalArgumentException(z2.o(paramString, " must not be NaN"));
  }
  
  public static double checkArgumentInRange(double paramDouble1, double paramDouble2, double paramDouble3, @NonNull String paramString)
  {
    if (paramDouble1 >= paramDouble2)
    {
      if (paramDouble1 <= paramDouble3) {
        return paramDouble1;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[] { paramString, Double.valueOf(paramDouble2), Double.valueOf(paramDouble3) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[] { paramString, Double.valueOf(paramDouble2), Double.valueOf(paramDouble3) }));
  }
  
  public static float checkArgumentInRange(float paramFloat1, float paramFloat2, float paramFloat3, @NonNull String paramString)
  {
    if (paramFloat1 >= paramFloat2)
    {
      if (paramFloat1 <= paramFloat3) {
        return paramFloat1;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[] { paramString, Float.valueOf(paramFloat2), Float.valueOf(paramFloat3) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[] { paramString, Float.valueOf(paramFloat2), Float.valueOf(paramFloat3) }));
  }
  
  public static int checkArgumentInRange(int paramInt1, int paramInt2, int paramInt3, @NonNull String paramString)
  {
    if (paramInt1 >= paramInt2)
    {
      if (paramInt1 <= paramInt3) {
        return paramInt1;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  public static long checkArgumentInRange(long paramLong1, long paramLong2, long paramLong3, @NonNull String paramString)
  {
    if (paramLong1 >= paramLong2)
    {
      if (paramLong1 <= paramLong3) {
        return paramLong1;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { paramString, Long.valueOf(paramLong2), Long.valueOf(paramLong3) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { paramString, Long.valueOf(paramLong2), Long.valueOf(paramLong3) }));
  }
  
  @IntRange(from=0L)
  public static int checkArgumentNonnegative(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException();
  }
  
  @IntRange(from=0L)
  public static int checkArgumentNonnegative(int paramInt, @Nullable String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static int checkFlagsArgument(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) == paramInt1) {
      return paramInt1;
    }
    StringBuilder localStringBuilder = z2.t("Requested flags 0x");
    localStringBuilder.append(Integer.toHexString(paramInt1));
    localStringBuilder.append(", but only 0x");
    localStringBuilder.append(Integer.toHexString(paramInt2));
    localStringBuilder.append(" are allowed");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @NonNull
  public static <T> T checkNotNull(@Nullable T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  @NonNull
  public static <T> T checkNotNull(@Nullable T paramT, @NonNull Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static void checkState(boolean paramBoolean)
  {
    checkState(paramBoolean, null);
  }
  
  public static void checkState(boolean paramBoolean, @Nullable String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  @NonNull
  public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T paramT)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException();
  }
  
  @NonNull
  public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T paramT, @NonNull Object paramObject)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  @NonNull
  public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T paramT, @NonNull String paramString, @NonNull Object... paramVarArgs)
  {
    if (!TextUtils.isEmpty(paramT)) {
      return paramT;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.Preconditions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */