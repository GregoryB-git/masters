package com.appsflyer;

import android.content.BroadcastReceiver;

public class MultipleInstallBroadcastReceiver
  extends BroadcastReceiver
{
  /* Error */
  public void onReceive(android.content.Context paramContext, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_2
    //   6: ldc 13
    //   8: invokevirtual 19	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_3
    //   12: goto +12 -> 24
    //   15: astore_3
    //   16: ldc 21
    //   18: aload_3
    //   19: invokestatic 27	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   22: aconst_null
    //   23: astore_3
    //   24: aload_3
    //   25: ifnull +27 -> 52
    //   28: aload_1
    //   29: invokestatic 33	com/appsflyer/internal/AFa1eSDK:valueOf	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   32: ldc 13
    //   34: aconst_null
    //   35: invokeinterface 39 3 0
    //   40: ifnull +12 -> 52
    //   43: invokestatic 42	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   46: aload_1
    //   47: aload_3
    //   48: invokevirtual 46	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Landroid/content/Context;Ljava/lang/String;)V
    //   51: return
    //   52: ldc 48
    //   54: invokestatic 52	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   57: invokestatic 42	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual 54	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Landroid/content/Context;Landroid/content/Intent;)V
    //   65: aload_1
    //   66: invokevirtual 60	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   69: new 15	android/content/Intent
    //   72: dup
    //   73: ldc 62
    //   75: invokespecial 64	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   78: iconst_0
    //   79: invokevirtual 70	android/content/pm/PackageManager:queryBroadcastReceivers	(Landroid/content/Intent;I)Ljava/util/List;
    //   82: invokeinterface 76 1 0
    //   87: astore 4
    //   89: aload 4
    //   91: invokeinterface 82 1 0
    //   96: ifeq +162 -> 258
    //   99: aload 4
    //   101: invokeinterface 86 1 0
    //   106: checkcast 88	android/content/pm/ResolveInfo
    //   109: astore_3
    //   110: aload_2
    //   111: invokevirtual 92	android/content/Intent:getAction	()Ljava/lang/String;
    //   114: astore 5
    //   116: aload_3
    //   117: getfield 96	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   120: getfield 102	android/content/pm/PackageItemInfo:packageName	Ljava/lang/String;
    //   123: aload_1
    //   124: invokevirtual 105	android/content/Context:getPackageName	()Ljava/lang/String;
    //   127: invokevirtual 111	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   130: ifeq -41 -> 89
    //   133: ldc 62
    //   135: aload 5
    //   137: invokevirtual 111	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   140: ifeq -51 -> 89
    //   143: aload_0
    //   144: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
    //   147: invokevirtual 120	java/lang/Class:getName	()Ljava/lang/String;
    //   150: aload_3
    //   151: getfield 96	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   154: getfield 123	android/content/pm/PackageItemInfo:name	Ljava/lang/String;
    //   157: invokevirtual 111	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   160: ifne -71 -> 89
    //   163: new 125	java/lang/StringBuilder
    //   166: dup
    //   167: ldc 127
    //   169: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: astore 5
    //   174: aload 5
    //   176: aload_3
    //   177: getfield 96	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   180: getfield 123	android/content/pm/PackageItemInfo:name	Ljava/lang/String;
    //   183: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload 5
    //   189: invokevirtual 135	java/lang/Object:toString	()Ljava/lang/String;
    //   192: invokestatic 52	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   195: aload_3
    //   196: getfield 96	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   199: getfield 123	android/content/pm/PackageItemInfo:name	Ljava/lang/String;
    //   202: invokestatic 139	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   205: invokevirtual 142	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   208: checkcast 4	android/content/BroadcastReceiver
    //   211: aload_1
    //   212: aload_2
    //   213: invokevirtual 144	android/content/BroadcastReceiver:onReceive	(Landroid/content/Context;Landroid/content/Intent;)V
    //   216: goto -127 -> 89
    //   219: astore 6
    //   221: new 125	java/lang/StringBuilder
    //   224: dup
    //   225: ldc 21
    //   227: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   230: astore 5
    //   232: aload 5
    //   234: aload_3
    //   235: getfield 96	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   238: getfield 123	android/content/pm/PackageItemInfo:name	Ljava/lang/String;
    //   241: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload 5
    //   247: invokevirtual 135	java/lang/Object:toString	()Ljava/lang/String;
    //   250: aload 6
    //   252: invokestatic 27	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   255: goto -166 -> 89
    //   258: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	MultipleInstallBroadcastReceiver
    //   0	259	1	paramContext	android.content.Context
    //   0	259	2	paramIntent	android.content.Intent
    //   11	1	3	str	String
    //   15	4	3	localThrowable1	Throwable
    //   23	212	3	localObject1	Object
    //   87	13	4	localIterator	java.util.Iterator
    //   114	132	5	localObject2	Object
    //   219	32	6	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   5	12	15	finally
    //   195	216	219	finally
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.MultipleInstallBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */