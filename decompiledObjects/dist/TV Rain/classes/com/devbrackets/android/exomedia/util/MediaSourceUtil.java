package com.devbrackets.android.exomedia.util;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import z2;

public class MediaSourceUtil
{
  @Nullable
  public static String getExtension(@NonNull Uri paramUri)
  {
    String str = paramUri.getLastPathSegment();
    if (str == null) {
      return null;
    }
    int i = str.lastIndexOf('.');
    Object localObject = str;
    int j = i;
    if (i == -1)
    {
      localObject = str;
      j = i;
      if (paramUri.getPathSegments().size() > 1)
      {
        localObject = (String)paramUri.getPathSegments().get(paramUri.getPathSegments().size() - 2);
        j = ((String)localObject).lastIndexOf('.');
      }
    }
    i = j;
    if (j == -1)
    {
      i = 0;
      localObject = z2.t(".");
      ((StringBuilder)localObject).append(paramUri.getLastPathSegment());
      localObject = ((StringBuilder)localObject).toString();
    }
    return ((String)localObject).substring(i).toLowerCase();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.MediaSourceUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */