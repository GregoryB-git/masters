package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.aje;
import com.google.ads.interactivemedia.v3.internal.ajg;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import z2;

public class ag
{
  public double adBreakDuration;
  public String adBreakTime;
  public List<Float> adCuePoints;
  public b adData;
  public e adPodInfo;
  public int adPosition;
  public long adTimeUpdateMs;
  public double bufferedTime;
  public String clickThroughUrl;
  public Map<String, CompanionData> companions;
  public List<z> cuepoints;
  public double currentTime;
  public double duration;
  public int errorCode;
  public String errorMessage;
  public String eventId;
  public String innerError;
  public SortedSet<Float> internalCuePoints;
  public String ln;
  public a logData;
  public String m;
  public boolean monitorAppLifecycle;
  public String n;
  public String queryId;
  public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
  public double seekTime;
  public String streamId;
  public String streamUrl;
  public List<HashMap<String, String>> subtitles;
  public int totalAds;
  public String vastEvent;
  public String videoUrl;
  
  public boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("JavaScriptMsgData[");
    for (Field localField : ag.class.getFields()) {
      try
      {
        Object localObject = localField.get(this);
        localStringBuilder.append(localField.getName());
        localStringBuilder.append(":");
        localStringBuilder.append(localObject);
        localStringBuilder.append(",");
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.e("IMASDK", "IllegalAccessException occurred", localIllegalAccessException);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        Log.e("IMASDK", "IllegalArgumentException occurred", localIllegalArgumentException);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;
    
    public final Map<String, String> constructMap()
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", type);
      localHashMap.put("errorCode", String.valueOf(errorCode));
      localHashMap.put("errorMessage", errorMessage);
      String str = innerError;
      if (str != null) {
        localHashMap.put("innerError", str);
      }
      return localHashMap;
    }
    
    public final String toString()
    {
      return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", new Object[] { type, Integer.valueOf(errorCode), errorMessage, innerError });
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */