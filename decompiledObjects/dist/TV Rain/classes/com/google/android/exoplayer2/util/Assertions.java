package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class Assertions
{
  public static void checkArgument(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void checkArgument(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static int checkIndex(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= paramInt2) && (paramInt1 < paramInt3)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException();
  }
  
  public static void checkMainThread()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      return;
    }
    throw new IllegalStateException("Not in applications main thread");
  }
  
  @EnsuresNonNull({"#1"})
  public static String checkNotEmpty(@Nullable String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException();
  }
  
  @EnsuresNonNull({"#1"})
  public static String checkNotEmpty(@Nullable String paramString, Object paramObject)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T checkNotNull(@Nullable T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T checkNotNull(@Nullable T paramT, Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static void checkState(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void checkState(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.Assertions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */