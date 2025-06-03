package com.facebook.internal.instrument.crashreport;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentData.Builder;
import com.facebook.internal.instrument.InstrumentData.Type;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class CrashHandler
  implements Thread.UncaughtExceptionHandler
{
  private static final int MAX_CRASH_REPORT_NUM = 5;
  private static final String TAG = CrashHandler.class.getCanonicalName();
  @Nullable
  private static CrashHandler instance;
  @Nullable
  private final Thread.UncaughtExceptionHandler mPreviousHandler;
  
  private CrashHandler(@Nullable Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    mPreviousHandler = paramUncaughtExceptionHandler;
  }
  
  public static void enable()
  {
    try
    {
      if (FacebookSdk.getAutoLogAppEventsEnabled()) {
        sendExceptionReports();
      }
      if (instance != null)
      {
        Log.w(TAG, "Already enabled!");
        return;
      }
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
      CrashHandler localCrashHandler = new com/facebook/internal/instrument/crashreport/CrashHandler;
      localCrashHandler.<init>(localUncaughtExceptionHandler);
      instance = localCrashHandler;
      Thread.setDefaultUncaughtExceptionHandler(localCrashHandler);
      return;
    }
    finally {}
  }
  
  private static void sendExceptionReports()
  {
    if (Utility.isDataProcessingRestricted()) {
      return;
    }
    File[] arrayOfFile = InstrumentUtility.listExceptionReportFiles();
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfFile.length;
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      localObject = InstrumentData.Builder.load(arrayOfFile[k]);
      if (((InstrumentData)localObject).isValid()) {
        localArrayList.add(localObject);
      }
    }
    Collections.sort(localArrayList, new Comparator()
    {
      public int compare(InstrumentData paramAnonymousInstrumentData1, InstrumentData paramAnonymousInstrumentData2)
      {
        return paramAnonymousInstrumentData1.compareTo(paramAnonymousInstrumentData2);
      }
    });
    Object localObject = new JSONArray();
    for (k = j; (k < localArrayList.size()) && (k < 5); k++) {
      ((JSONArray)localObject).put(localArrayList.get(k));
    }
    InstrumentUtility.sendReports("crash_reports", (JSONArray)localObject, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        try
        {
          if ((paramAnonymousGraphResponse.getError() == null) && (paramAnonymousGraphResponse.getJSONObject().getBoolean("success"))) {
            for (int i = 0; val$validReports.size() > i; i++) {
              ((InstrumentData)val$validReports.get(i)).clear();
            }
          }
          return;
        }
        catch (JSONException paramAnonymousGraphResponse)
        {
          for (;;) {}
        }
      }
    });
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (InstrumentUtility.isSDKRelatedException(paramThrowable))
    {
      ExceptionAnalyzer.execute(paramThrowable);
      InstrumentData.Builder.build(paramThrowable, InstrumentData.Type.CrashReport).save();
    }
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = mPreviousHandler;
    if (localUncaughtExceptionHandler != null) {
      localUncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.crashreport.CrashHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */