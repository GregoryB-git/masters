package com.facebook.internal.instrument.errorreport;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ErrorReportData
{
  private static final String PARAM_TIMESTAMP = "timestamp";
  private static final String PRARAM_ERROR_MESSAGE = "error_message";
  @Nullable
  private String errorMessage;
  private String filename;
  @Nullable
  private Long timestamp;
  
  public ErrorReportData(File paramFile)
  {
    paramFile = paramFile.getName();
    filename = paramFile;
    paramFile = InstrumentUtility.readFile(paramFile, true);
    if (paramFile != null)
    {
      timestamp = Long.valueOf(paramFile.optLong("timestamp", 0L));
      errorMessage = paramFile.optString("error_message", null);
    }
  }
  
  public ErrorReportData(String paramString)
  {
    timestamp = Long.valueOf(System.currentTimeMillis() / 1000L);
    errorMessage = paramString;
    paramString = new StringBuffer();
    paramString.append("error_log_");
    paramString.append(timestamp);
    paramString.append(".json");
    filename = paramString.toString();
  }
  
  public void clear()
  {
    InstrumentUtility.deleteFile(filename);
  }
  
  public int compareTo(ErrorReportData paramErrorReportData)
  {
    Long localLong = timestamp;
    if (localLong == null) {
      return -1;
    }
    paramErrorReportData = timestamp;
    if (paramErrorReportData == null) {
      return 1;
    }
    return paramErrorReportData.compareTo(localLong);
  }
  
  @Nullable
  public JSONObject getParameters()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Long localLong = timestamp;
      if (localLong != null) {
        localJSONObject.put("timestamp", localLong);
      }
      localJSONObject.put("error_message", errorMessage);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public boolean isValid()
  {
    boolean bool;
    if ((errorMessage != null) && (timestamp != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void save()
  {
    if (isValid()) {
      InstrumentUtility.writeFile(filename, toString());
    }
  }
  
  @Nullable
  public String toString()
  {
    JSONObject localJSONObject = getParameters();
    if (localJSONObject == null) {
      return null;
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.errorreport.ErrorReportData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */