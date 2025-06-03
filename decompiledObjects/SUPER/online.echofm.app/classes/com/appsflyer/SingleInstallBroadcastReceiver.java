package com.appsflyer;

import android.content.BroadcastReceiver;

public class SingleInstallBroadcastReceiver
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
    //   52: invokestatic 52	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   55: ldc 54
    //   57: invokevirtual 56	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   60: astore_3
    //   61: invokestatic 62	java/lang/System:currentTimeMillis	()J
    //   64: lstore 4
    //   66: aload_3
    //   67: ifnull +18 -> 85
    //   70: lload 4
    //   72: aload_3
    //   73: invokestatic 68	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   76: lsub
    //   77: ldc2_w 69
    //   80: lcmp
    //   81: ifge +4 -> 85
    //   84: return
    //   85: ldc 72
    //   87: invokestatic 76	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   90: invokestatic 42	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   93: aload_1
    //   94: aload_2
    //   95: invokevirtual 78	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Landroid/content/Context;Landroid/content/Intent;)V
    //   98: invokestatic 52	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   101: ldc 54
    //   103: invokestatic 62	java/lang/System:currentTimeMillis	()J
    //   106: invokestatic 83	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   109: invokevirtual 87	com/appsflyer/AppsFlyerProperties:set	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	SingleInstallBroadcastReceiver
    //   0	113	1	paramContext	android.content.Context
    //   0	113	2	paramIntent	android.content.Intent
    //   11	1	3	str1	String
    //   15	4	3	localThrowable	Throwable
    //   23	50	3	str2	String
    //   64	7	4	l	long
    // Exception table:
    //   from	to	target	type
    //   5	12	15	finally
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.SingleInstallBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */