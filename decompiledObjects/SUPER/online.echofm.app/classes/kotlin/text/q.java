package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

public class q
  extends p
{
  public static Integer f(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return g(paramString, 10);
  }
  
  public static final Integer g(String paramString, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    CharsKt__CharJVMKt.checkRadix(paramInt);
    int i = paramString.length();
    if (i == 0) {
      return null;
    }
    int j = 0;
    int k = paramString.charAt(0);
    int m = Intrinsics.d(k, 48);
    int n = -2147483647;
    if (m < 0)
    {
      m = 1;
      if (i == 1) {
        return null;
      }
      if (k != 43)
      {
        if (k != 45) {
          return null;
        }
        n = Integer.MIN_VALUE;
        k = 1;
      }
      else
      {
        k = 0;
      }
    }
    else
    {
      k = 0;
      m = k;
    }
    int i3;
    for (int i1 = -59652323; m < i; i1 = i3)
    {
      int i2 = CharsKt__CharJVMKt.a(paramString.charAt(m), paramInt);
      if (i2 < 0) {
        return null;
      }
      i3 = i1;
      if (j < i1) {
        if (i1 == -59652323)
        {
          i1 = n / paramInt;
          i3 = i1;
          if (j >= i1) {}
        }
        else
        {
          return null;
        }
      }
      i1 = j * paramInt;
      if (i1 < n + i2) {
        return null;
      }
      j = i1 - i2;
      m++;
    }
    if (k != 0) {
      paramString = Integer.valueOf(j);
    } else {
      paramString = Integer.valueOf(-j);
    }
    return paramString;
  }
  
  public static Long h(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return i(paramString, 10);
  }
  
  public static final Long i(String paramString, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    CharsKt__CharJVMKt.checkRadix(paramInt);
    int i = paramString.length();
    if (i == 0) {
      return null;
    }
    int j = 0;
    int k = paramString.charAt(0);
    int m = Intrinsics.d(k, 48);
    long l1 = -9223372036854775807L;
    if (m < 0)
    {
      m = 1;
      if (i == 1) {
        return null;
      }
      if (k != 43)
      {
        if (k != 45) {
          return null;
        }
        l1 = Long.MIN_VALUE;
        j = 1;
      }
      else
      {
        m = 0;
        j = 1;
      }
    }
    else
    {
      m = 0;
    }
    long l2 = 0L;
    long l4;
    for (long l3 = -256204778801521550L; j < i; l3 = l4)
    {
      k = CharsKt__CharJVMKt.a(paramString.charAt(j), paramInt);
      if (k < 0) {
        return null;
      }
      l4 = l3;
      if (l2 < l3) {
        if (l3 == -256204778801521550L)
        {
          l3 = l1 / paramInt;
          l4 = l3;
          if (l2 >= l3) {}
        }
        else
        {
          return null;
        }
      }
      l2 *= paramInt;
      l3 = k;
      if (l2 < l1 + l3) {
        return null;
      }
      l2 -= l3;
      j++;
    }
    if (m != 0) {
      paramString = Long.valueOf(l2);
    } else {
      paramString = Long.valueOf(-l2);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     kotlin.text.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */