package com.facebook.common.internal;

import a;
import javax.annotation.Nullable;

public final class Preconditions
{
  private static String badElementIndex(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if (paramInt1 < 0) {
      return format("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return format("%s (%s) must be less than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(a.f("negative size: ", paramInt2));
  }
  
  private static String badPositionIndex(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if (paramInt1 < 0) {
      return format("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return format("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(a.f("negative size: ", paramInt2));
  }
  
  private static String badPositionIndexes(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        return format("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      }
      return badPositionIndex(paramInt2, paramInt3, "end index");
    }
    return badPositionIndex(paramInt1, paramInt3, "start index");
  }
  
  public static void checkArgument(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void checkArgument(boolean paramBoolean, @Nullable Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void checkArgument(boolean paramBoolean, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(format(paramString, paramVarArgs));
  }
  
  public static int checkElementIndex(int paramInt1, int paramInt2)
  {
    return checkElementIndex(paramInt1, paramInt2, "index");
  }
  
  public static int checkElementIndex(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(badElementIndex(paramInt1, paramInt2, paramString));
  }
  
  public static <T> T checkNotNull(T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T checkNotNull(T paramT, @Nullable Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static <T> T checkNotNull(T paramT, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(format(paramString, paramVarArgs));
  }
  
  public static int checkPositionIndex(int paramInt1, int paramInt2)
  {
    return checkPositionIndex(paramInt1, paramInt2, "index");
  }
  
  public static int checkPositionIndex(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(badPositionIndex(paramInt1, paramInt2, paramString));
  }
  
  public static void checkPositionIndexes(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    throw new IndexOutOfBoundsException(badPositionIndexes(paramInt1, paramInt2, paramInt3));
  }
  
  public static void checkState(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void checkState(boolean paramBoolean, @Nullable Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void checkState(boolean paramBoolean, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(format(paramString, paramVarArgs));
  }
  
  public static String format(@Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    paramString = String.valueOf(paramString);
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(paramVarArgs.length * 16 + i);
    i = 0;
    int j = 0;
    while (i < paramVarArgs.length)
    {
      int k = paramString.indexOf("%s", j);
      if (k == -1) {
        break;
      }
      localStringBuilder.append(paramString.substring(j, k));
      localStringBuilder.append(paramVarArgs[i]);
      j = k + 2;
      i++;
    }
    localStringBuilder.append(paramString.substring(j));
    if (i < paramVarArgs.length)
    {
      localStringBuilder.append(" [");
      j = i + 1;
      localStringBuilder.append(paramVarArgs[i]);
      for (i = j; i < paramVarArgs.length; i++)
      {
        localStringBuilder.append(", ");
        localStringBuilder.append(paramVarArgs[i]);
      }
      localStringBuilder.append(']');
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Preconditions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */