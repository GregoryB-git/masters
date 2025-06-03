package com.facebook.appevents.ml;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.nio.charset.Charset;

public class Utils
{
  private static final String DIR_NAME = "facebook_ml/";
  
  @Nullable
  public static File getMlDir()
  {
    if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
      return null;
    }
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(FacebookSdk.getApplicationContext().getFilesDir(), "facebook_ml/");
      if (!localFile.exists())
      {
        boolean bool = localFile.mkdirs();
        if (!bool) {
          return null;
        }
      }
      return localFile;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Utils.class);
    }
    return null;
  }
  
  public static String normalizeString(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
      return null;
    }
    try
    {
      paramString = TextUtils.join(" ", paramString.trim().split("\\s+"));
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, Utils.class);
    }
    return null;
  }
  
  public static int[] vectorize(String paramString, int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
      return null;
    }
    try
    {
      int[] arrayOfInt = new int[paramInt];
      paramString = normalizeString(paramString).getBytes(Charset.forName("UTF-8"));
      for (int i = 0; i < paramInt; i++) {
        if (i < paramString.length) {
          paramString[i] &= 0xFF;
        } else {
          arrayOfInt[i] = 0;
        }
      }
      return arrayOfInt;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, Utils.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */