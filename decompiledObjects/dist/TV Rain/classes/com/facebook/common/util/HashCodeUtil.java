package com.facebook.common.util;

import javax.annotation.Nullable;

public class HashCodeUtil
{
  private static final int X = 31;
  
  public static int hashCode(int paramInt)
  {
    return paramInt + 31;
  }
  
  public static int hashCode(int paramInt1, int paramInt2)
  {
    return (paramInt1 + 31) * 31 + paramInt2;
  }
  
  public static int hashCode(int paramInt1, int paramInt2, int paramInt3)
  {
    return ((paramInt1 + 31) * 31 + paramInt2) * 31 + paramInt3;
  }
  
  public static int hashCode(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (((paramInt1 + 31) * 31 + paramInt2) * 31 + paramInt3) * 31 + paramInt4;
  }
  
  public static int hashCode(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return ((((paramInt1 + 31) * 31 + paramInt2) * 31 + paramInt3) * 31 + paramInt4) * 31 + paramInt5;
  }
  
  public static int hashCode(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return (((((paramInt1 + 31) * 31 + paramInt2) * 31 + paramInt3) * 31 + paramInt4) * 31 + paramInt5) * 31 + paramInt6;
  }
  
  public static int hashCode(@Nullable Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return hashCode(i);
  }
  
  public static int hashCode(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    int i = 0;
    int j;
    if (paramObject1 == null) {
      j = 0;
    } else {
      j = paramObject1.hashCode();
    }
    if (paramObject2 != null) {
      i = paramObject2.hashCode();
    }
    return hashCode(j, i);
  }
  
  public static int hashCode(@Nullable Object paramObject1, @Nullable Object paramObject2, @Nullable Object paramObject3)
  {
    int i = 0;
    int j;
    if (paramObject1 == null) {
      j = 0;
    } else {
      j = paramObject1.hashCode();
    }
    int k;
    if (paramObject2 == null) {
      k = 0;
    } else {
      k = paramObject2.hashCode();
    }
    if (paramObject3 != null) {
      i = paramObject3.hashCode();
    }
    return hashCode(j, k, i);
  }
  
  public static int hashCode(@Nullable Object paramObject1, @Nullable Object paramObject2, @Nullable Object paramObject3, @Nullable Object paramObject4)
  {
    int i = 0;
    int j;
    if (paramObject1 == null) {
      j = 0;
    } else {
      j = paramObject1.hashCode();
    }
    int k;
    if (paramObject2 == null) {
      k = 0;
    } else {
      k = paramObject2.hashCode();
    }
    int m;
    if (paramObject3 == null) {
      m = 0;
    } else {
      m = paramObject3.hashCode();
    }
    if (paramObject4 != null) {
      i = paramObject4.hashCode();
    }
    return hashCode(j, k, m, i);
  }
  
  public static int hashCode(@Nullable Object paramObject1, @Nullable Object paramObject2, @Nullable Object paramObject3, @Nullable Object paramObject4, @Nullable Object paramObject5)
  {
    int i = 0;
    int j;
    if (paramObject1 == null) {
      j = 0;
    } else {
      j = paramObject1.hashCode();
    }
    int k;
    if (paramObject2 == null) {
      k = 0;
    } else {
      k = paramObject2.hashCode();
    }
    int m;
    if (paramObject3 == null) {
      m = 0;
    } else {
      m = paramObject3.hashCode();
    }
    int n;
    if (paramObject4 == null) {
      n = 0;
    } else {
      n = paramObject4.hashCode();
    }
    if (paramObject5 != null) {
      i = paramObject5.hashCode();
    }
    return hashCode(j, k, m, n, i);
  }
  
  public static int hashCode(@Nullable Object paramObject1, @Nullable Object paramObject2, @Nullable Object paramObject3, @Nullable Object paramObject4, @Nullable Object paramObject5, @Nullable Object paramObject6)
  {
    int i = 0;
    int j;
    if (paramObject1 == null) {
      j = 0;
    } else {
      j = paramObject1.hashCode();
    }
    int k;
    if (paramObject2 == null) {
      k = 0;
    } else {
      k = paramObject2.hashCode();
    }
    int m;
    if (paramObject3 == null) {
      m = 0;
    } else {
      m = paramObject3.hashCode();
    }
    int n;
    if (paramObject4 == null) {
      n = 0;
    } else {
      n = paramObject4.hashCode();
    }
    int i1;
    if (paramObject5 == null) {
      i1 = 0;
    } else {
      i1 = paramObject5.hashCode();
    }
    if (paramObject6 != null) {
      i = paramObject6.hashCode();
    }
    return hashCode(j, k, m, n, i1, i);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.HashCodeUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */