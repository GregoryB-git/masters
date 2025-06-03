package com.facebook.common.media;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public class MediaUtils
{
  public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = ImmutableMap.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");
  
  @Nullable
  private static String extractExtension(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    if ((i >= 0) && (i != paramString.length() - 1)) {
      return paramString.substring(i + 1);
    }
    return null;
  }
  
  @Nullable
  public static String extractMime(String paramString)
  {
    paramString = extractExtension(paramString);
    if (paramString == null) {
      return null;
    }
    String str1 = paramString.toLowerCase(Locale.US);
    String str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str1);
    paramString = str2;
    if (str2 == null) {
      paramString = (String)ADDITIONAL_ALLOWED_MIME_TYPES.get(str1);
    }
    return paramString;
  }
  
  public static boolean isNonNativeSupportedMimeType(String paramString)
  {
    return ADDITIONAL_ALLOWED_MIME_TYPES.containsValue(paramString);
  }
  
  public static boolean isPhoto(@Nullable String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("image/"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isThreeD(@Nullable String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.equals("model/gltf-binary"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isVideo(@Nullable String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("video/"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.media.MediaUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */