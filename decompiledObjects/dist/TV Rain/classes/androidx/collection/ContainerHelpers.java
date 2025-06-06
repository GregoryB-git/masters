package androidx.collection;

class ContainerHelpers
{
  public static final int[] EMPTY_INTS = new int[0];
  public static final long[] EMPTY_LONGS = new long[0];
  public static final Object[] EMPTY_OBJECTS = new Object[0];
  
  public static int binarySearch(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1)
    {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2) {
        i = j + 1;
      } else if (k > paramInt2) {
        paramInt1 = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
  
  public static int binarySearch(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    paramInt--;
    int i = 0;
    while (i <= paramInt)
    {
      int j = i + paramInt >>> 1;
      boolean bool = paramArrayOfLong[j] < paramLong;
      if (bool) {
        i = j + 1;
      } else if (bool) {
        paramInt = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int idealByteArraySize(int paramInt)
  {
    for (int i = 4; i < 32; i++)
    {
      int j = (1 << i) - 12;
      if (paramInt <= j) {
        return j;
      }
    }
    return paramInt;
  }
  
  public static int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  public static int idealLongArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 8) / 8;
  }
}

/* Location:
 * Qualified Name:     androidx.collection.ContainerHelpers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */