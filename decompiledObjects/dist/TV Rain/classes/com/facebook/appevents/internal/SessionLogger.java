package com.facebook.appevents.internal;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.security.CertificateUtil;
import java.util.Locale;

class SessionLogger
{
  private static final long[] INACTIVE_SECONDS_QUANTA = { 300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L };
  private static final String PACKAGE_CHECKSUM = "PCKGCHKSUM";
  private static final String TAG = "com.facebook.appevents.internal.SessionLogger";
  
  /* Error */
  @androidx.annotation.Nullable
  private static String computePackageChecksum(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 70	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: invokevirtual 76	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: invokevirtual 80	android/content/Context:getPackageName	()Ljava/lang/String;
    //   20: iconst_0
    //   21: invokevirtual 86	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   24: getfield 91	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   27: astore_2
    //   28: new 93	java/lang/StringBuilder
    //   31: astore_3
    //   32: aload_3
    //   33: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   36: aload_3
    //   37: ldc 96
    //   39: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload_3
    //   44: aload_2
    //   45: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_3
    //   50: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: astore_2
    //   54: aload_0
    //   55: ldc 105
    //   57: iconst_0
    //   58: invokevirtual 109	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   61: astore_3
    //   62: aload_3
    //   63: aload_2
    //   64: aconst_null
    //   65: invokeinterface 115 3 0
    //   70: astore 4
    //   72: aload 4
    //   74: ifnull +16 -> 90
    //   77: aload 4
    //   79: invokevirtual 121	java/lang/String:length	()I
    //   82: bipush 32
    //   84: if_icmpne +6 -> 90
    //   87: aload 4
    //   89: areturn
    //   90: aload_1
    //   91: aload_0
    //   92: invokevirtual 80	android/content/Context:getPackageName	()Ljava/lang/String;
    //   95: iconst_0
    //   96: invokevirtual 125	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   99: getfield 130	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   102: invokestatic 136	com/facebook/appevents/internal/HashUtils:computeChecksum	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore_0
    //   106: aload_3
    //   107: invokeinterface 140 1 0
    //   112: aload_2
    //   113: aload_0
    //   114: invokeinterface 146 3 0
    //   119: invokeinterface 149 1 0
    //   124: aload_0
    //   125: areturn
    //   126: astore_0
    //   127: aload_0
    //   128: ldc 2
    //   130: invokestatic 153	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   133: aconst_null
    //   134: areturn
    //   135: astore_0
    //   136: goto -3 -> 133
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	paramContext	Context
    //   14	77	1	localPackageManager	android.content.pm.PackageManager
    //   27	86	2	str1	String
    //   31	76	3	localObject	Object
    //   70	18	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   10	72	126	finally
    //   77	87	126	finally
    //   90	124	126	finally
    //   10	72	135	java/lang/Exception
    //   77	87	135	java/lang/Exception
    //   90	124	135	java/lang/Exception
  }
  
  @VisibleForTesting
  public static int getQuantaIndex(long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
      return 0;
    }
    int i = 0;
    try
    {
      for (;;)
      {
        long[] arrayOfLong = INACTIVE_SECONDS_QUANTA;
        if (i >= arrayOfLong.length) {
          break;
        }
        long l = arrayOfLong[i];
        if (l >= paramLong) {
          break;
        }
        i++;
      }
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, SessionLogger.class);
    }
    return 0;
  }
  
  public static void logActivateApp(String paramString1, SourceApplicationInfo paramSourceApplicationInfo, String paramString2, Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
      return;
    }
    if (paramSourceApplicationInfo != null) {}
    try
    {
      paramSourceApplicationInfo = paramSourceApplicationInfo.toString();
      break label24;
      paramSourceApplicationInfo = "Unclassified";
      label24:
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("fb_mobile_launch_source", paramSourceApplicationInfo);
      localBundle.putString("fb_mobile_pckg_fp", computePackageChecksum(paramContext));
      localBundle.putString("fb_mobile_app_cert_hash", CertificateUtil.getCertificateHash(paramContext));
      paramSourceApplicationInfo = new com/facebook/appevents/InternalAppEventsLogger;
      paramSourceApplicationInfo.<init>(paramString1, paramString2, null);
      paramSourceApplicationInfo.logEvent("fb_mobile_activate_app", localBundle);
      if (InternalAppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
        paramSourceApplicationInfo.flush();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, SessionLogger.class);
    }
  }
  
  private static void logClockSkewEvent()
  {
    if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
      return;
    }
    try
    {
      Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, SessionLogger.class);
    }
  }
  
  public static void logDeactivateApp(String paramString1, SessionInfo paramSessionInfo, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
      return;
    }
    if (paramSessionInfo == null) {
      return;
    }
    try
    {
      Object localObject1 = Long.valueOf(paramSessionInfo.getDiskRestoreTime() - paramSessionInfo.getSessionLastEventTime().longValue());
      Object localObject2 = localObject1;
      if (((Long)localObject1).longValue() < 0L)
      {
        localObject2 = Long.valueOf(0L);
        logClockSkewEvent();
      }
      Object localObject3 = Long.valueOf(paramSessionInfo.getSessionLength());
      localObject1 = localObject3;
      if (((Long)localObject3).longValue() < 0L)
      {
        logClockSkewEvent();
        localObject1 = Long.valueOf(0L);
      }
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
      ((BaseBundle)localObject3).putInt("fb_mobile_app_interruptions", paramSessionInfo.getInterruptionCount());
      ((BaseBundle)localObject3).putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] { Integer.valueOf(getQuantaIndex(((Long)localObject2).longValue())) }));
      localObject2 = paramSessionInfo.getSourceApplicationInfo();
      if (localObject2 != null) {
        localObject2 = ((SourceApplicationInfo)localObject2).toString();
      } else {
        localObject2 = "Unclassified";
      }
      ((BaseBundle)localObject3).putString("fb_mobile_launch_source", (String)localObject2);
      ((BaseBundle)localObject3).putLong("_logTime", paramSessionInfo.getSessionLastEventTime().longValue() / 1000L);
      paramSessionInfo = new com/facebook/appevents/InternalAppEventsLogger;
      paramSessionInfo.<init>(paramString1, paramString2, null);
      paramSessionInfo.logEvent("fb_mobile_deactivate_app", ((Long)localObject1).longValue() / 1000.0D, (Bundle)localObject3);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, SessionLogger.class);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.SessionLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */