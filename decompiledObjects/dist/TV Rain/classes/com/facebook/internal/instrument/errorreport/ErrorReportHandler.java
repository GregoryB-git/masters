package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ErrorReportHandler
{
  private static final int MAX_ERROR_REPORT_NUM = 1000;
  
  public static void enable()
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      sendErrorReports();
    }
  }
  
  public static File[] listErrorReportFiles()
  {
    File localFile = InstrumentUtility.getInstrumentReportDir();
    if (localFile == null) {
      return new File[0];
    }
    localFile.listFiles(new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.matches(String.format("^%s[0-9]+.json$", new Object[] { "error_log_" }));
      }
    });
  }
  
  public static void save(String paramString)
  {
    try
    {
      ErrorReportData localErrorReportData = new com/facebook/internal/instrument/errorreport/ErrorReportData;
      localErrorReportData.<init>(paramString);
      localErrorReportData.save();
      return;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
  
  public static void sendErrorReports()
  {
    if (Utility.isDataProcessingRestricted()) {
      return;
    }
    File[] arrayOfFile = listErrorReportFiles();
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfFile.length;
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      localObject = new ErrorReportData(arrayOfFile[k]);
      if (((ErrorReportData)localObject).isValid()) {
        localArrayList.add(localObject);
      }
    }
    Collections.sort(localArrayList, new Comparator()
    {
      public int compare(ErrorReportData paramAnonymousErrorReportData1, ErrorReportData paramAnonymousErrorReportData2)
      {
        return paramAnonymousErrorReportData1.compareTo(paramAnonymousErrorReportData2);
      }
    });
    Object localObject = new JSONArray();
    for (k = j; (k < localArrayList.size()) && (k < 1000); k++) {
      ((JSONArray)localObject).put(localArrayList.get(k));
    }
    InstrumentUtility.sendReports("error_reports", (JSONArray)localObject, new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        try
        {
          if ((paramAnonymousGraphResponse.getError() == null) && (paramAnonymousGraphResponse.getJSONObject().getBoolean("success"))) {
            for (int i = 0; val$validReports.size() > i; i++) {
              ((ErrorReportData)val$validReports.get(i)).clear();
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
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.errorreport.ErrorReportHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */