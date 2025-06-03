package g0;

import W2.c;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public abstract class G
{
  public static String a(Uri paramUri1, Uri paramUri2)
  {
    if ((!paramUri1.isOpaque()) && (!paramUri2.isOpaque()))
    {
      Object localObject = paramUri1.getScheme();
      String str = paramUri2.getScheme();
      if ((localObject == null ? str == null : (str != null) && (c.a((CharSequence)localObject, str))) && (M.c(paramUri1.getAuthority(), paramUri2.getAuthority())))
      {
        paramUri1 = paramUri1.getPathSegments();
        paramUri2 = paramUri2.getPathSegments();
        int i = Math.min(paramUri1.size(), paramUri2.size());
        int j = 0;
        int k = 0;
        while ((j < i) && (((String)paramUri1.get(j)).equals(paramUri2.get(j))))
        {
          k++;
          j++;
        }
        localObject = new StringBuilder();
        for (i = k;; i++)
        {
          j = k;
          if (i >= paramUri1.size()) {
            break;
          }
          ((StringBuilder)localObject).append("../");
        }
        while (j < paramUri2.size())
        {
          ((StringBuilder)localObject).append((String)paramUri2.get(j));
          if (j < paramUri2.size() - 1) {
            ((StringBuilder)localObject).append("/");
          }
          j++;
        }
        return ((StringBuilder)localObject).toString();
      }
      return paramUri2.toString();
    }
    return paramUri2.toString();
  }
  
  public static int[] b(String paramString)
  {
    int[] arrayOfInt = new int[4];
    if (TextUtils.isEmpty(paramString))
    {
      arrayOfInt[0] = -1;
      return arrayOfInt;
    }
    int i = paramString.length();
    int j = paramString.indexOf('#');
    if (j != -1) {
      i = j;
    }
    int k = paramString.indexOf('?');
    if (k != -1)
    {
      j = k;
      if (k <= i) {}
    }
    else
    {
      j = i;
    }
    int m = paramString.indexOf('/');
    if (m != -1)
    {
      k = m;
      if (m <= j) {}
    }
    else
    {
      k = j;
    }
    int n = paramString.indexOf(':');
    m = n;
    if (n > k) {
      m = -1;
    }
    k = m + 2;
    if ((k < j) && (paramString.charAt(m + 1) == '/') && (paramString.charAt(k) == '/'))
    {
      n = paramString.indexOf('/', m + 3);
      if (n != -1)
      {
        k = n;
        if (n <= j) {}
      }
      else
      {
        k = j;
      }
    }
    else
    {
      k = m + 1;
    }
    arrayOfInt[0] = m;
    arrayOfInt[1] = k;
    arrayOfInt[2] = j;
    arrayOfInt[3] = i;
    return arrayOfInt;
  }
  
  public static boolean c(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramString != null)
    {
      bool2 = bool1;
      if (b(paramString)[0] != -1) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static String d(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramInt2) {
      return paramStringBuilder.toString();
    }
    int i = paramInt1;
    if (paramStringBuilder.charAt(paramInt1) == '/') {
      i = paramInt1 + 1;
    }
    paramInt1 = i;
    int j = paramInt1;
    while (paramInt1 <= paramInt2)
    {
      int k;
      if (paramInt1 == paramInt2)
      {
        k = paramInt1;
      }
      else
      {
        if (paramStringBuilder.charAt(paramInt1) != '/') {
          break label216;
        }
        k = paramInt1 + 1;
      }
      int m = j + 1;
      if ((paramInt1 == m) && (paramStringBuilder.charAt(j) == '.'))
      {
        paramStringBuilder.delete(j, k);
        k = paramInt2 - (k - j);
        paramInt2 = j;
      }
      else
      {
        if ((paramInt1 == j + 2) && (paramStringBuilder.charAt(j) == '.') && (paramStringBuilder.charAt(m) == '.'))
        {
          j = paramStringBuilder.lastIndexOf("/", j - 2) + 1;
          if (j > i) {
            paramInt1 = j;
          } else {
            paramInt1 = i;
          }
          paramStringBuilder.delete(paramInt1, k);
          paramInt1 = paramInt2 - (k - paramInt1);
          k = j;
        }
        for (;;)
        {
          paramInt2 = k;
          k = paramInt1;
          break;
          k = paramInt1 + 1;
          paramInt1 = paramInt2;
        }
      }
      paramInt1 = paramInt2;
      j = paramInt2;
      paramInt2 = k;
      continue;
      label216:
      paramInt1++;
    }
    return paramStringBuilder.toString();
  }
  
  public static String e(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    paramString2 = b(paramString1);
    if (paramString2[0] != -1)
    {
      localStringBuilder.append(paramString1);
      d(localStringBuilder, paramString2[1], paramString2[2]);
      return localStringBuilder.toString();
    }
    int[] arrayOfInt = b(str);
    if (paramString2[3] == 0)
    {
      localStringBuilder.append(str, 0, arrayOfInt[3]);
      localStringBuilder.append(paramString1);
      return localStringBuilder.toString();
    }
    if (paramString2[2] == 0)
    {
      localStringBuilder.append(str, 0, arrayOfInt[2]);
      localStringBuilder.append(paramString1);
      return localStringBuilder.toString();
    }
    int i = paramString2[1];
    if (i != 0)
    {
      i = arrayOfInt[0] + 1;
      localStringBuilder.append(str, 0, i);
      localStringBuilder.append(paramString1);
      return d(localStringBuilder, paramString2[1] + i, i + paramString2[2]);
    }
    if (paramString1.charAt(i) == '/')
    {
      localStringBuilder.append(str, 0, arrayOfInt[1]);
      localStringBuilder.append(paramString1);
      i = arrayOfInt[1];
      return d(localStringBuilder, i, paramString2[2] + i);
    }
    int j = arrayOfInt[0];
    i = arrayOfInt[1];
    if ((j + 2 < i) && (i == arrayOfInt[2]))
    {
      localStringBuilder.append(str, 0, i);
      localStringBuilder.append('/');
      localStringBuilder.append(paramString1);
      i = arrayOfInt[1];
      return d(localStringBuilder, i, paramString2[2] + i + 1);
    }
    i = str.lastIndexOf('/', arrayOfInt[2] - 1);
    if (i == -1) {
      i = arrayOfInt[1];
    } else {
      i++;
    }
    localStringBuilder.append(str, 0, i);
    localStringBuilder.append(paramString1);
    return d(localStringBuilder, arrayOfInt[1], i + paramString2[2]);
  }
  
  public static Uri f(String paramString1, String paramString2)
  {
    return Uri.parse(e(paramString1, paramString2));
  }
}

/* Location:
 * Qualified Name:     g0.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */