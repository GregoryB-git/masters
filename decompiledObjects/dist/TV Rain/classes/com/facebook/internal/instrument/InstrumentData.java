package com.facebook.internal.instrument;

import android.os.Build;
import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.Utility;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentData
{
  private static final String PARAM_APP_VERSION = "app_version";
  private static final String PARAM_CALLSTACK = "callstack";
  private static final String PARAM_DEVICE_MODEL = "device_model";
  private static final String PARAM_DEVICE_OS = "device_os_version";
  private static final String PARAM_FEATURE_NAMES = "feature_names";
  private static final String PARAM_REASON = "reason";
  private static final String PARAM_TIMESTAMP = "timestamp";
  private static final String PARAM_TYPE = "type";
  private static final String UNKNOWN = "Unknown";
  @Nullable
  private String appVersion;
  @Nullable
  private String cause;
  @Nullable
  private JSONArray featureNames;
  private String filename;
  @Nullable
  private String stackTrace;
  @Nullable
  private Long timestamp;
  private Type type;
  
  private InstrumentData(File paramFile)
  {
    paramFile = paramFile.getName();
    filename = paramFile;
    type = getType(paramFile);
    paramFile = InstrumentUtility.readFile(filename, true);
    if (paramFile != null)
    {
      timestamp = Long.valueOf(paramFile.optLong("timestamp", 0L));
      appVersion = paramFile.optString("app_version", null);
      cause = paramFile.optString("reason", null);
      stackTrace = paramFile.optString("callstack", null);
      featureNames = paramFile.optJSONArray("feature_names");
    }
  }
  
  private InstrumentData(Throwable paramThrowable, Type paramType)
  {
    type = paramType;
    appVersion = Utility.getAppVersion();
    cause = InstrumentUtility.getCause(paramThrowable);
    stackTrace = InstrumentUtility.getStackTrace(paramThrowable);
    timestamp = Long.valueOf(System.currentTimeMillis() / 1000L);
    paramThrowable = new StringBuffer();
    paramThrowable.append(paramType.getLogPrefix());
    paramThrowable.append(timestamp.toString());
    paramThrowable.append(".json");
    filename = paramThrowable.toString();
  }
  
  private InstrumentData(JSONArray paramJSONArray)
  {
    type = Type.Analysis;
    timestamp = Long.valueOf(System.currentTimeMillis() / 1000L);
    featureNames = paramJSONArray;
    paramJSONArray = new StringBuffer();
    paramJSONArray.append("analysis_log_");
    paramJSONArray.append(timestamp.toString());
    paramJSONArray.append(".json");
    filename = paramJSONArray.toString();
  }
  
  @Nullable
  private JSONObject getAnalysisReportParameters()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Object localObject = featureNames;
      if (localObject != null) {
        localJSONObject.put("feature_names", localObject);
      }
      localObject = timestamp;
      if (localObject != null) {
        localJSONObject.put("timestamp", localObject);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  @Nullable
  private JSONObject getExceptionReportParameters()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("device_os_version", Build.VERSION.RELEASE);
      localJSONObject.put("device_model", Build.MODEL);
      Object localObject = appVersion;
      if (localObject != null) {
        localJSONObject.put("app_version", localObject);
      }
      localObject = timestamp;
      if (localObject != null) {
        localJSONObject.put("timestamp", localObject);
      }
      localObject = cause;
      if (localObject != null) {
        localJSONObject.put("reason", localObject);
      }
      localObject = stackTrace;
      if (localObject != null) {
        localJSONObject.put("callstack", localObject);
      }
      localObject = type;
      if (localObject != null) {
        localJSONObject.put("type", localObject);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  @Nullable
  private JSONObject getParameters()
  {
    int i = 1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[type.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3) && (i != 4)) {
        return null;
      }
      return getExceptionReportParameters();
    }
    return getAnalysisReportParameters();
  }
  
  private static Type getType(String paramString)
  {
    if (paramString.startsWith("crash_log_")) {
      return Type.CrashReport;
    }
    if (paramString.startsWith("shield_log_")) {
      return Type.CrashShield;
    }
    if (paramString.startsWith("thread_check_log_")) {
      return Type.ThreadCheck;
    }
    if (paramString.startsWith("analysis_log_")) {
      return Type.Analysis;
    }
    return Type.Unknown;
  }
  
  public void clear()
  {
    InstrumentUtility.deleteFile(filename);
  }
  
  public int compareTo(InstrumentData paramInstrumentData)
  {
    Long localLong = timestamp;
    if (localLong == null) {
      return -1;
    }
    paramInstrumentData = timestamp;
    if (paramInstrumentData == null) {
      return 1;
    }
    return paramInstrumentData.compareTo(localLong);
  }
  
  public boolean isValid()
  {
    int i = 1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[type.ordinal()];
    boolean bool1 = false;
    boolean bool2 = false;
    if (i != 1)
    {
      if ((i != 2) && (i != 3) && (i != 4)) {
        return false;
      }
      bool3 = bool2;
      if (stackTrace != null)
      {
        bool3 = bool2;
        if (timestamp != null) {
          bool3 = true;
        }
      }
      return bool3;
    }
    boolean bool3 = bool1;
    if (featureNames != null)
    {
      bool3 = bool1;
      if (timestamp != null) {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  public void save()
  {
    if (!isValid()) {
      return;
    }
    InstrumentUtility.writeFile(filename, toString());
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
  
  public static class Builder
  {
    public static InstrumentData build(Throwable paramThrowable, InstrumentData.Type paramType)
    {
      return new InstrumentData(paramThrowable, paramType, null);
    }
    
    public static InstrumentData build(JSONArray paramJSONArray)
    {
      return new InstrumentData(paramJSONArray, null);
    }
    
    public static InstrumentData load(File paramFile)
    {
      return new InstrumentData(paramFile, null);
    }
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("Unknown", 0);
      Unknown = localType1;
      Type localType2 = new Type("Analysis", 1);
      Analysis = localType2;
      Type localType3 = new Type("CrashReport", 2);
      CrashReport = localType3;
      Type localType4 = new Type("CrashShield", 3);
      CrashShield = localType4;
      Type localType5 = new Type("ThreadCheck", 4);
      ThreadCheck = localType5;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5 };
    }
    
    private Type() {}
    
    public String getLogPrefix()
    {
      int i = InstrumentData.1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              return "Unknown";
            }
            return "thread_check_log_";
          }
          return "shield_log_";
        }
        return "crash_log_";
      }
      return "analysis_log_";
    }
    
    public String toString()
    {
      int i = InstrumentData.1.$SwitchMap$com$facebook$internal$instrument$InstrumentData$Type[ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              return "Unknown";
            }
            return "ThreadCheck";
          }
          return "CrashShield";
        }
        return "CrashReport";
      }
      return "Analysis";
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */