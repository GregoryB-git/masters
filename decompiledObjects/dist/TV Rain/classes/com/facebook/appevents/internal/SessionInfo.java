package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;

class SessionInfo
{
  private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
  private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
  private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
  private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
  private Long diskRestoreTime;
  private int interruptionCount;
  private UUID sessionId;
  private Long sessionLastEventTime;
  private Long sessionStartTime;
  private SourceApplicationInfo sourceApplicationInfo;
  
  public SessionInfo(Long paramLong1, Long paramLong2)
  {
    this(paramLong1, paramLong2, UUID.randomUUID());
  }
  
  public SessionInfo(Long paramLong1, Long paramLong2, UUID paramUUID)
  {
    sessionStartTime = paramLong1;
    sessionLastEventTime = paramLong2;
    sessionId = paramUUID;
  }
  
  public static void clearSavedSessionFromDisk()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionId");
    localEditor.apply();
    SourceApplicationInfo.clearSavedSourceApplicationInfoFromDisk();
  }
  
  public static SessionInfo getStoredSessionInfo()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
    long l1 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
    long l2 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
    String str = localSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
    if ((l1 != 0L) && (l2 != 0L) && (str != null))
    {
      SessionInfo localSessionInfo = new SessionInfo(Long.valueOf(l1), Long.valueOf(l2));
      interruptionCount = localSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
      sourceApplicationInfo = SourceApplicationInfo.getStoredSourceApplicatioInfo();
      diskRestoreTime = Long.valueOf(System.currentTimeMillis());
      sessionId = UUID.fromString(str);
      return localSessionInfo;
    }
    return null;
  }
  
  public long getDiskRestoreTime()
  {
    Long localLong = diskRestoreTime;
    long l;
    if (localLong == null) {
      l = 0L;
    } else {
      l = localLong.longValue();
    }
    return l;
  }
  
  public int getInterruptionCount()
  {
    return interruptionCount;
  }
  
  public UUID getSessionId()
  {
    return sessionId;
  }
  
  public Long getSessionLastEventTime()
  {
    return sessionLastEventTime;
  }
  
  public long getSessionLength()
  {
    if (sessionStartTime != null)
    {
      Long localLong = sessionLastEventTime;
      if (localLong != null) {
        return localLong.longValue() - sessionStartTime.longValue();
      }
    }
    return 0L;
  }
  
  public Long getSessionStartTime()
  {
    return sessionStartTime;
  }
  
  public SourceApplicationInfo getSourceApplicationInfo()
  {
    return sourceApplicationInfo;
  }
  
  public void incrementInterruptionCount()
  {
    interruptionCount += 1;
  }
  
  public void setSessionLastEventTime(Long paramLong)
  {
    sessionLastEventTime = paramLong;
  }
  
  public void setSourceApplicationInfo(SourceApplicationInfo paramSourceApplicationInfo)
  {
    sourceApplicationInfo = paramSourceApplicationInfo;
  }
  
  public void writeSessionToDisk()
  {
    Object localObject = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionStartTime", sessionStartTime.longValue());
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionEndTime", sessionLastEventTime.longValue());
    ((SharedPreferences.Editor)localObject).putInt("com.facebook.appevents.SessionInfo.interruptionCount", interruptionCount);
    ((SharedPreferences.Editor)localObject).putString("com.facebook.appevents.SessionInfo.sessionId", sessionId.toString());
    ((SharedPreferences.Editor)localObject).apply();
    localObject = sourceApplicationInfo;
    if (localObject != null) {
      ((SourceApplicationInfo)localObject).writeSourceApplicationInfoToDisk();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.SessionInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */