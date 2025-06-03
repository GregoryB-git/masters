package lc;

import a0.j;
import ec.i;
import ic.d;
import java.util.ArrayList;
import java.util.List;
import p2.m0;
import va.a;

public class k
  extends h
{
  public static final String A0(String paramString1, String paramString2)
  {
    i.e(paramString2, "missingDelimiterValue");
    int i = paramString1.lastIndexOf('.', p0(paramString1));
    if (i != -1)
    {
      paramString2 = paramString1.substring(i + 1, paramString1.length());
      i.d(paramString2, "substring(...)");
    }
    return paramString2;
  }
  
  public static String B0(String paramString1, String paramString2)
  {
    int i = s0(paramString1, paramString2, 0, false, 6);
    if (i != -1)
    {
      paramString1 = paramString1.substring(0, i);
      i.d(paramString1, "substring(...)");
    }
    return paramString1;
  }
  
  public static final CharSequence C0(String paramString)
  {
    int i = paramString.length() - 1;
    int j = 0;
    int k = 0;
    while (j <= i)
    {
      int m;
      if (k == 0) {
        m = j;
      } else {
        m = i;
      }
      boolean bool = m0.W(paramString.charAt(m));
      if (k == 0)
      {
        if (!bool) {
          k = 1;
        } else {
          j++;
        }
      }
      else
      {
        if (!bool) {
          break;
        }
        i--;
      }
    }
    return paramString.subSequence(j, i + 1);
  }
  
  public static boolean o0(CharSequence paramCharSequence, String paramString)
  {
    i.e(paramCharSequence, "<this>");
    boolean bool = true;
    if (s0(paramCharSequence, paramString, 0, false, 2) < 0) {
      bool = false;
    }
    return bool;
  }
  
  public static final int p0(CharSequence paramCharSequence)
  {
    i.e(paramCharSequence, "<this>");
    return paramCharSequence.length() - 1;
  }
  
  public static final int q0(int paramInt, CharSequence paramCharSequence, String paramString, boolean paramBoolean)
  {
    i.e(paramCharSequence, "<this>");
    i.e(paramString, "string");
    if ((!paramBoolean) && ((paramCharSequence instanceof String))) {
      paramInt = ((String)paramCharSequence).indexOf(paramString, paramInt);
    } else {
      paramInt = r0(paramCharSequence, paramString, paramInt, paramCharSequence.length(), paramBoolean, false);
    }
    return paramInt;
  }
  
  public static final int r0(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    int j;
    Object localObject;
    if (!paramBoolean2)
    {
      i = paramInt1;
      if (paramInt1 < 0) {
        i = 0;
      }
      j = paramCharSequence1.length();
      paramInt1 = paramInt2;
      if (paramInt2 > j) {
        paramInt1 = j;
      }
      localObject = new ic.f(i, paramInt1);
    }
    else
    {
      j = p0(paramCharSequence1);
      i = paramInt1;
      if (paramInt1 > j) {
        i = j;
      }
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        paramInt1 = 0;
      }
      localObject = new d(i, paramInt1, -1);
    }
    if (((paramCharSequence1 instanceof String)) && ((paramCharSequence2 instanceof String)))
    {
      paramInt2 = a;
      j = b;
      i = c;
      if (i > 0)
      {
        paramInt1 = paramInt2;
        if (paramInt2 <= j) {}
      }
      else
      {
        if ((i >= 0) || (j > paramInt2)) {
          break label275;
        }
        paramInt1 = paramInt2;
      }
      for (;;)
      {
        String str = (String)paramCharSequence2;
        localObject = (String)paramCharSequence1;
        if (h.l0(0, paramInt1, str.length(), str, (String)localObject, paramBoolean1)) {
          return paramInt1;
        }
        if (paramInt1 == j) {
          break;
        }
        paramInt1 += i;
      }
    }
    else
    {
      paramInt2 = a;
      i = b;
      j = c;
      if (j > 0)
      {
        paramInt1 = paramInt2;
        if (paramInt2 <= i) {}
      }
      else
      {
        if ((j >= 0) || (i > paramInt2)) {
          break label275;
        }
        paramInt1 = paramInt2;
      }
      for (;;)
      {
        if (w0(paramCharSequence2, paramCharSequence1, paramInt1, paramCharSequence2.length(), paramBoolean1)) {
          return paramInt1;
        }
        if (paramInt1 == i) {
          break;
        }
        paramInt1 += j;
      }
    }
    label275:
    return -1;
  }
  
  public static final boolean t0(CharSequence paramCharSequence)
  {
    i.e(paramCharSequence, "<this>");
    boolean bool = false;
    for (int i = 0; i < paramCharSequence.length(); i++) {
      if (!m0.W(paramCharSequence.charAt(i))) {
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public static int u0(String paramString1, String paramString2, int paramInt)
  {
    if ((paramInt & 0x2) != 0) {
      paramInt = p0(paramString1);
    } else {
      paramInt = 0;
    }
    i.e(paramString1, "<this>");
    i.e(paramString2, "string");
    return paramString1.lastIndexOf(paramString2, paramInt);
  }
  
  public static String v0(String paramString, int paramInt)
  {
    i.e(paramString, "<this>");
    if (paramInt >= 0)
    {
      if (paramInt <= paramString.length())
      {
        paramString = paramString.subSequence(0, paramString.length());
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder(paramInt);
        localStringBuilder.append(paramString);
        int i = paramInt - paramString.length();
        paramInt = 1;
        if (1 <= i) {
          for (;;)
          {
            localStringBuilder.append(' ');
            if (paramInt == i) {
              break;
            }
            paramInt++;
          }
        }
        paramString = localStringBuilder;
      }
      return paramString.toString();
    }
    throw new IllegalArgumentException(j.h("Desired length ", paramInt, " is less than zero."));
  }
  
  public static final boolean w0(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    i.e(paramCharSequence1, "<this>");
    i.e(paramCharSequence2, "other");
    if ((paramInt1 >= 0) && (paramCharSequence1.length() - paramInt2 >= 0) && (paramInt1 <= paramCharSequence2.length() - paramInt2))
    {
      for (int i = 0; i < paramInt2; i++) {
        if (!m0.E(paramCharSequence1.charAt(0 + i), paramCharSequence2.charAt(paramInt1 + i), paramBoolean)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static final void x0(int paramInt)
  {
    int i;
    if (paramInt >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalArgumentException(f.h("Limit must be non-negative, but was ", paramInt).toString());
  }
  
  public static final List y0(int paramInt, CharSequence paramCharSequence, String paramString, boolean paramBoolean)
  {
    x0(paramInt);
    int i = 0;
    int j = q0(0, paramCharSequence, paramString, paramBoolean);
    if ((j != -1) && (paramInt != 1))
    {
      int k;
      if (paramInt > 0) {
        k = 1;
      } else {
        k = 0;
      }
      int m = 10;
      int n = m;
      if (k != 0) {
        if (paramInt > 10) {
          n = m;
        } else {
          n = paramInt;
        }
      }
      ArrayList localArrayList = new ArrayList(n);
      n = j;
      do
      {
        localArrayList.add(paramCharSequence.subSequence(i, n).toString());
        m = paramString.length() + n;
        if ((k != 0) && (localArrayList.size() == paramInt - 1)) {
          break;
        }
        j = q0(m, paramCharSequence, paramString, paramBoolean);
        i = m;
        n = j;
      } while (j != -1);
      localArrayList.add(paramCharSequence.subSequence(m, paramCharSequence.length()).toString());
      return localArrayList;
    }
    return a.f(paramCharSequence.toString());
  }
  
  public static final String z0(String paramString1, String paramString2, String paramString3)
  {
    i.e(paramString2, "delimiter");
    i.e(paramString3, "missingDelimiterValue");
    int i = s0(paramString1, paramString2, 0, false, 6);
    if (i != -1)
    {
      paramString3 = paramString1.substring(paramString2.length() + i, paramString1.length());
      i.d(paramString3, "substring(...)");
    }
    return paramString3;
  }
}

/* Location:
 * Qualified Name:     lc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */