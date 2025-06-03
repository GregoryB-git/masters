package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class UriUtil
{
  private static final int FRAGMENT = 3;
  private static final int INDEX_COUNT = 4;
  private static final int PATH = 1;
  private static final int QUERY = 2;
  private static final int SCHEME_COLON = 0;
  
  private static int[] getUriIndices(String paramString)
  {
    int[] arrayOfInt = new int[4];
    if (TextUtils.isEmpty(paramString))
    {
      arrayOfInt[0] = -1;
      return arrayOfInt;
    }
    int i = paramString.length();
    int j = paramString.indexOf('#');
    if (j == -1) {
      j = i;
    }
    int k = paramString.indexOf('?');
    if (k != -1)
    {
      i = k;
      if (k <= j) {}
    }
    else
    {
      i = j;
    }
    int m = paramString.indexOf('/');
    if (m != -1)
    {
      k = m;
      if (m <= i) {}
    }
    else
    {
      k = i;
    }
    int n = paramString.indexOf(':');
    m = n;
    if (n > k) {
      m = -1;
    }
    k = m + 2;
    if ((k < i) && (paramString.charAt(m + 1) == '/') && (paramString.charAt(k) == '/')) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      n = paramString.indexOf('/', m + 3);
      if (n != -1)
      {
        k = n;
        if (n <= i) {}
      }
      else
      {
        k = i;
      }
    }
    else
    {
      k = m + 1;
    }
    arrayOfInt[0] = m;
    arrayOfInt[1] = k;
    arrayOfInt[2] = i;
    arrayOfInt[3] = j;
    return arrayOfInt;
  }
  
  private static String removeDotSegments(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
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
          break label194;
        }
        k = paramInt1 + 1;
      }
      int m = j + 1;
      if ((paramInt1 == m) && (paramStringBuilder.charAt(j) == '.'))
      {
        paramStringBuilder.delete(j, k);
        paramInt2 -= k - j;
      }
      else
      {
        if ((paramInt1 == j + 2) && (paramStringBuilder.charAt(j) == '.') && (paramStringBuilder.charAt(m) == '.'))
        {
          paramInt1 = paramStringBuilder.lastIndexOf("/", j - 2) + 1;
          if (paramInt1 > i) {
            j = paramInt1;
          } else {
            j = i;
          }
          paramStringBuilder.delete(j, k);
          paramInt2 -= k - j;
        }
        else
        {
          paramInt1++;
        }
        j = paramInt1;
      }
      paramInt1 = j;
      continue;
      label194:
      paramInt1++;
    }
    return paramStringBuilder.toString();
  }
  
  public static Uri removeQueryParameter(Uri paramUri, String paramString)
  {
    Uri.Builder localBuilder = paramUri.buildUpon();
    localBuilder.clearQuery();
    Iterator localIterator1 = paramUri.getQueryParameterNames().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      if (!str.equals(paramString))
      {
        Iterator localIterator2 = paramUri.getQueryParameters(str).iterator();
        while (localIterator2.hasNext()) {
          localBuilder.appendQueryParameter(str, (String)localIterator2.next());
        }
      }
    }
    return localBuilder.build();
  }
  
  public static String resolve(String paramString1, String paramString2)
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
    int[] arrayOfInt = getUriIndices(paramString1);
    if (arrayOfInt[0] != -1)
    {
      localStringBuilder.append(paramString1);
      removeDotSegments(localStringBuilder, arrayOfInt[1], arrayOfInt[2]);
      return localStringBuilder.toString();
    }
    paramString2 = getUriIndices(str);
    if (arrayOfInt[3] == 0)
    {
      localStringBuilder.append(str, 0, paramString2[3]);
      localStringBuilder.append(paramString1);
      return localStringBuilder.toString();
    }
    if (arrayOfInt[2] == 0)
    {
      localStringBuilder.append(str, 0, paramString2[2]);
      localStringBuilder.append(paramString1);
      return localStringBuilder.toString();
    }
    int i = arrayOfInt[1];
    if (i != 0)
    {
      i = paramString2[0] + 1;
      localStringBuilder.append(str, 0, i);
      localStringBuilder.append(paramString1);
      return removeDotSegments(localStringBuilder, arrayOfInt[1] + i, i + arrayOfInt[2]);
    }
    if (paramString1.charAt(i) == '/')
    {
      localStringBuilder.append(str, 0, paramString2[1]);
      localStringBuilder.append(paramString1);
      i = paramString2[1];
      return removeDotSegments(localStringBuilder, i, arrayOfInt[2] + i);
    }
    int j = paramString2[0];
    i = paramString2[1];
    if ((j + 2 < i) && (i == paramString2[2]))
    {
      localStringBuilder.append(str, 0, i);
      localStringBuilder.append('/');
      localStringBuilder.append(paramString1);
      i = paramString2[1];
      return removeDotSegments(localStringBuilder, i, arrayOfInt[2] + i + 1);
    }
    i = str.lastIndexOf('/', paramString2[2] - 1);
    if (i == -1) {
      i = paramString2[1];
    } else {
      i++;
    }
    localStringBuilder.append(str, 0, i);
    localStringBuilder.append(paramString1);
    return removeDotSegments(localStringBuilder, paramString2[1], i + arrayOfInt[2]);
  }
  
  public static Uri resolveToUri(String paramString1, String paramString2)
  {
    return Uri.parse(resolve(paramString1, paramString2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.UriUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */