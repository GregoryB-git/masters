package com.devbrackets.android.exomedia.util;

import android.net.Uri;
import z2;

public class MediaUtil
{
  public static String getUriWithProtocol(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    String str = paramString;
    if (Uri.parse(paramString).getScheme() == null) {
      str = z2.o("file://", paramString);
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.MediaUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */