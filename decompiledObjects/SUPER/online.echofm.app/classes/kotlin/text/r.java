package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import l6.d;

public class r
  extends q
{
  public static final boolean j(String paramString1, String paramString2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "suffix");
    if (!paramBoolean) {
      return paramString1.endsWith(paramString2);
    }
    return m(paramString1, paramString1.length() - paramString2.length(), paramString2, 0, paramString2.length(), true);
  }
  
  public static boolean l(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString1 == null)
    {
      if (paramString2 == null) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      return paramBoolean;
    }
    if (!paramBoolean) {
      paramBoolean = paramString1.equals(paramString2);
    } else {
      paramBoolean = paramString1.equalsIgnoreCase(paramString2);
    }
    return paramBoolean;
  }
  
  public static final boolean m(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "other");
    if (!paramBoolean) {
      paramBoolean = paramString1.regionMatches(paramInt1, paramString2, paramInt2, paramInt3);
    } else {
      paramBoolean = paramString1.regionMatches(paramBoolean, paramInt1, paramString2, paramInt2, paramInt3);
    }
    return paramBoolean;
  }
  
  public static final String n(String paramString, char paramChar1, char paramChar2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    if (!paramBoolean) {
      paramString = paramString.replace(paramChar1, paramChar2);
    }
    for (Object localObject = "replace(...)";; localObject = "toString(...)")
    {
      Intrinsics.checkNotNullExpressionValue(paramString, (String)localObject);
      return paramString;
      localObject = new StringBuilder(paramString.length());
      for (int i = 0; i < paramString.length(); i++)
      {
        char c1 = paramString.charAt(i);
        char c2 = c1;
        if (a.d(c1, paramChar1, paramBoolean))
        {
          char c3 = paramChar2;
          c2 = c3;
        }
        ((StringBuilder)localObject).append(c2);
      }
      paramString = ((StringBuilder)localObject).toString();
    }
  }
  
  public static final String o(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "oldValue");
    Intrinsics.checkNotNullParameter(paramString3, "newValue");
    int i = 0;
    int j = s.z(paramString1, paramString2, 0, paramBoolean);
    if (j < 0) {
      return paramString1;
    }
    int k = paramString2.length();
    int m = d.a(k, 1);
    int n = paramString1.length() - k + paramString3.length();
    if (n >= 0)
    {
      StringBuilder localStringBuilder = new StringBuilder(n);
      int i1;
      do
      {
        localStringBuilder.append(paramString1, i, j);
        localStringBuilder.append(paramString3);
        n = j + k;
        if (j >= paramString1.length()) {
          break;
        }
        i1 = s.z(paramString1, paramString2, j + m, paramBoolean);
        i = n;
        j = i1;
      } while (i1 > 0);
      localStringBuilder.append(paramString1, n, paramString1.length());
      paramString1 = localStringBuilder.toString();
      Intrinsics.checkNotNullExpressionValue(paramString1, "toString(...)");
      return paramString1;
    }
    throw new OutOfMemoryError();
  }
  
  public static final boolean r(String paramString1, String paramString2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "prefix");
    if (!paramBoolean) {
      return paramString1.startsWith(paramString2);
    }
    return m(paramString1, 0, paramString2, 0, paramString2.length(), paramBoolean);
  }
}

/* Location:
 * Qualified Name:     kotlin.text.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */