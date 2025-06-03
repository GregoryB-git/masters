package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;

public final class agt
{
  private String a = "ad.doubleclick.net";
  private String[] b = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private agp c;
  
  public agt(agp paramagp)
  {
    c = paramagp;
  }
  
  private final Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
    throws ags
  {
    try
    {
      paramBoolean = b(paramUri);
      if (paramBoolean)
      {
        if (paramUri.toString().contains("dc_ms="))
        {
          paramUri = new com/google/ads/interactivemedia/v3/internal/ags;
          paramUri.<init>("Parameter already exists: dc_ms");
          throw paramUri;
        }
      }
      else {
        if (paramUri.getQueryParameter("ms") != null) {
          break label354;
        }
      }
      paramContext = c.d(paramContext);
      if (paramBoolean)
      {
        paramString = paramUri.toString();
        i = paramString.indexOf(";adurl");
        if (i != -1)
        {
          paramUri = new java/lang/StringBuilder;
          i++;
          paramUri.<init>(paramString.substring(0, i));
          paramUri.append("dc_ms");
          paramUri.append("=");
          paramUri.append(paramContext);
          paramUri.append(";");
          paramUri.append(paramString.substring(i));
          return Uri.parse(paramUri.toString());
        }
        String str = paramUri.getEncodedPath();
        i = paramString.indexOf(str);
        paramUri = new java/lang/StringBuilder;
        paramUri.<init>(paramString.substring(0, str.length() + i));
        paramUri.append(";");
        paramUri.append("dc_ms");
        paramUri.append("=");
        paramUri.append(paramContext);
        paramUri.append(";");
        paramUri.append(paramString.substring(i + str.length()));
        return Uri.parse(paramUri.toString());
      }
      paramString = paramUri.toString();
      int j = paramString.indexOf("&adurl");
      int i = j;
      if (j == -1) {
        i = paramString.indexOf("?adurl");
      }
      if (i != -1)
      {
        paramUri = new java/lang/StringBuilder;
        i++;
        paramUri.<init>(paramString.substring(0, i));
        paramUri.append("ms");
        paramUri.append("=");
        paramUri.append(paramContext);
        paramUri.append("&");
        paramUri.append(paramString.substring(i));
        return Uri.parse(paramUri.toString());
      }
      return paramUri.buildUpon().appendQueryParameter("ms", paramContext).build();
      label354:
      paramUri = new com/google/ads/interactivemedia/v3/internal/ags;
      paramUri.<init>("Query parameter already exists: ms");
      throw paramUri;
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new ags("Provided Uri is not in a valid state");
    }
  }
  
  private final boolean b(Uri paramUri)
  {
    paramUri.getClass();
    try
    {
      boolean bool = paramUri.getHost().equals(a);
      return bool;
    }
    catch (NullPointerException paramUri) {}
    return false;
  }
  
  public final Uri a(Uri paramUri, Context paramContext)
    throws ags
  {
    return a(paramUri, paramContext, null, false);
  }
  
  public final agp a()
  {
    return c;
  }
  
  public final boolean a(Uri paramUri)
  {
    paramUri.getClass();
    try
    {
      paramUri = paramUri.getHost();
      String[] arrayOfString = b;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        boolean bool = paramUri.endsWith(arrayOfString[j]);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException paramUri)
    {
      for (;;) {}
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */