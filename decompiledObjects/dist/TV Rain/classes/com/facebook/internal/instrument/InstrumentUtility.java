package com.facebook.internal.instrument;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentUtility
{
  public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";
  public static final String CRASH_REPORT_PREFIX = "crash_log_";
  public static final String CRASH_SHIELD_PREFIX = "shield_log_";
  public static final String ERROR_REPORT_PREFIX = "error_log_";
  private static final String FBSDK_PREFIX = "com.facebook";
  private static final String INSTRUMENT_DIR = "instrument";
  public static final String THREAD_CHECK_PREFIX = "thread_check_log_";
  
  public static boolean deleteFile(@Nullable String paramString)
  {
    File localFile = getInstrumentReportDir();
    if ((localFile != null) && (paramString != null)) {
      return new File(localFile, paramString).delete();
    }
    return false;
  }
  
  @Nullable
  public static String getCause(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return null;
    }
    if (paramThrowable.getCause() == null) {
      return paramThrowable.toString();
    }
    return paramThrowable.getCause().toString();
  }
  
  @Nullable
  public static File getInstrumentReportDir()
  {
    File localFile = new File(FacebookSdk.getApplicationContext().getCacheDir(), "instrument");
    if ((!localFile.exists()) && (!localFile.mkdirs())) {
      return null;
    }
    return localFile;
  }
  
  @Nullable
  public static String getStackTrace(Throwable paramThrowable)
  {
    Object localObject = null;
    if (paramThrowable == null) {
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    while ((paramThrowable != null) && (paramThrowable != localObject))
    {
      localObject = paramThrowable.getStackTrace();
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        localJSONArray.put(localObject[j].toString());
      }
      Throwable localThrowable = paramThrowable.getCause();
      localObject = paramThrowable;
      paramThrowable = localThrowable;
    }
    return localJSONArray.toString();
  }
  
  public static boolean isSDKRelatedException(@Nullable Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return false;
    }
    Throwable localThrowable = null;
    while ((paramThrowable != null) && (paramThrowable != localThrowable))
    {
      Object localObject = paramThrowable.getStackTrace();
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        if (localObject[j].getClassName().startsWith("com.facebook")) {
          return true;
        }
      }
      localObject = paramThrowable.getCause();
      localThrowable = paramThrowable;
      paramThrowable = (Throwable)localObject;
    }
    return false;
  }
  
  public static File[] listExceptionAnalysisReportFiles()
  {
    Object localObject = getInstrumentReportDir();
    if (localObject == null) {
      return new File[0];
    }
    localObject = ((File)localObject).listFiles(new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.matches(String.format("^%s[0-9]+.json$", new Object[] { "analysis_log_" }));
      }
    });
    if (localObject == null) {
      localObject = new File[0];
    }
    return (File[])localObject;
  }
  
  public static File[] listExceptionReportFiles()
  {
    Object localObject = getInstrumentReportDir();
    if (localObject == null) {
      return new File[0];
    }
    localObject = ((File)localObject).listFiles(new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.matches(String.format("^(%s|%s|%s)[0-9]+.json$", new Object[] { "crash_log_", "shield_log_", "thread_check_log_" }));
      }
    });
    if (localObject == null) {
      localObject = new File[0];
    }
    return (File[])localObject;
  }
  
  @Nullable
  public static JSONObject readFile(@Nullable String paramString, boolean paramBoolean)
  {
    Object localObject = getInstrumentReportDir();
    if ((localObject != null) && (paramString != null))
    {
      File localFile = new File((File)localObject, paramString);
      try
      {
        localObject = new java/io/FileInputStream;
        ((FileInputStream)localObject).<init>(localFile);
        localObject = new JSONObject(Utility.readStreamToString((InputStream)localObject));
        return (JSONObject)localObject;
      }
      catch (Exception localException)
      {
        if (paramBoolean) {
          deleteFile(paramString);
        }
      }
    }
    return null;
  }
  
  public static void sendReports(String paramString, JSONArray paramJSONArray, GraphRequest.Callback paramCallback)
  {
    if (paramJSONArray.length() == 0) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString, paramJSONArray.toString());
      GraphRequest.newPostRequest(null, String.format("%s/instruments", new Object[] { FacebookSdk.getApplicationId() }), localJSONObject, paramCallback).executeAsync();
      return;
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
  }
  
  public static void writeFile(@Nullable String paramString1, @Nullable String paramString2)
  {
    File localFile = getInstrumentReportDir();
    if ((localFile != null) && (paramString1 != null) && (paramString2 != null)) {
      localFile = new File(localFile, paramString1);
    }
    try
    {
      paramString1 = new java/io/FileOutputStream;
      paramString1.<init>(localFile);
      paramString1.write(paramString2.getBytes());
      paramString1.close();
      return;
    }
    catch (Exception paramString1)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */