package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public final class MimeTypeFilter
{
  @Nullable
  public static String matches(@Nullable String paramString, @NonNull String[] paramArrayOfString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.split("/");
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      if (mimeTypeAgainstFilter(paramString, str.split("/"))) {
        return str;
      }
    }
    return null;
  }
  
  @Nullable
  public static String matches(@Nullable String[] paramArrayOfString, @NonNull String paramString)
  {
    if (paramArrayOfString == null) {
      return null;
    }
    String[] arrayOfString = paramString.split("/");
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      paramString = paramArrayOfString[j];
      if (mimeTypeAgainstFilter(paramString.split("/"), arrayOfString)) {
        return paramString;
      }
    }
    return null;
  }
  
  public static boolean matches(@Nullable String paramString1, @NonNull String paramString2)
  {
    if (paramString1 == null) {
      return false;
    }
    return mimeTypeAgainstFilter(paramString1.split("/"), paramString2.split("/"));
  }
  
  @NonNull
  public static String[] matchesMany(@Nullable String[] paramArrayOfString, @NonNull String paramString)
  {
    int i = 0;
    if (paramArrayOfString == null) {
      return new String[0];
    }
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = paramString.split("/");
    int j = paramArrayOfString.length;
    while (i < j)
    {
      paramString = paramArrayOfString[i];
      if (mimeTypeAgainstFilter(paramString.split("/"), arrayOfString)) {
        localArrayList.add(paramString);
      }
      i++;
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  private static boolean mimeTypeAgainstFilter(@NonNull String[] paramArrayOfString1, @NonNull String[] paramArrayOfString2)
  {
    if (paramArrayOfString2.length == 2)
    {
      if ((!paramArrayOfString2[0].isEmpty()) && (!paramArrayOfString2[1].isEmpty()))
      {
        if (paramArrayOfString1.length != 2) {
          return false;
        }
        if ((!"*".equals(paramArrayOfString2[0])) && (!paramArrayOfString2[0].equals(paramArrayOfString1[0]))) {
          return false;
        }
        return ("*".equals(paramArrayOfString2[1])) || (paramArrayOfString2[1].equals(paramArrayOfString1[1]));
      }
      throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
    }
    throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.MimeTypeFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */