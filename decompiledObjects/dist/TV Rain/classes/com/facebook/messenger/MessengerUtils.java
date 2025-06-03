package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import bolts.AppLinks;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookSignatureValidator;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MessengerUtils
{
  public static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";
  public static final String EXTRA_EXTERNAL_URI = "com.facebook.orca.extra.EXTERNAL_URI";
  public static final String EXTRA_IS_COMPOSE = "com.facebook.orca.extra.IS_COMPOSE";
  public static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";
  public static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";
  public static final String EXTRA_PARTICIPANTS = "com.facebook.orca.extra.PARTICIPANTS";
  public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";
  public static final String EXTRA_REPLY_TOKEN_KEY = "com.facebook.orca.extra.REPLY_TOKEN";
  public static final String EXTRA_THREAD_TOKEN_KEY = "com.facebook.orca.extra.THREAD_TOKEN";
  public static final String ORCA_THREAD_CATEGORY_20150314 = "com.facebook.orca.category.PLATFORM_THREAD_20150314";
  public static final String PACKAGE_NAME = "com.facebook.orca";
  public static final int PROTOCOL_VERSION_20150314 = 20150314;
  private static final String TAG = "MessengerUtils";
  
  public static void finishShareToMessenger(Activity paramActivity, ShareToMessengerParams paramShareToMessengerParams)
  {
    Intent localIntent = paramActivity.getIntent();
    Set localSet = localIntent.getCategories();
    if (localSet == null)
    {
      paramActivity.setResult(0, null);
      paramActivity.finish();
      return;
    }
    if (localSet.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
    {
      Bundle localBundle = AppLinks.getAppLinkExtras(localIntent);
      localIntent = new Intent();
      if (localSet.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
      {
        localIntent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
        localIntent.putExtra("com.facebook.orca.extra.THREAD_TOKEN", localBundle.getString("com.facebook.orca.extra.THREAD_TOKEN"));
        localIntent.setDataAndType(uri, mimeType);
        localIntent.setFlags(1);
        localIntent.putExtra("com.facebook.orca.extra.APPLICATION_ID", FacebookSdk.getApplicationId());
        localIntent.putExtra("com.facebook.orca.extra.METADATA", metaData);
        localIntent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", externalUri);
        paramActivity.setResult(-1, localIntent);
        paramActivity.finish();
      }
      else
      {
        throw new RuntimeException();
      }
    }
    else
    {
      paramActivity.setResult(0, null);
      paramActivity.finish();
    }
  }
  
  private static Set<Integer> getAllAvailableProtocolVersions(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    HashSet localHashSet = new HashSet();
    paramContext = paramContext.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[] { "version" }, null, null, null);
    if (paramContext != null) {
      try
      {
        int i = paramContext.getColumnIndex("version");
        while (paramContext.moveToNext()) {
          localHashSet.add(Integer.valueOf(paramContext.getInt(i)));
        }
      }
      finally
      {
        paramContext.close();
      }
    }
    return localSet;
  }
  
  public static MessengerThreadParams getMessengerThreadParamsForIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerUtils.class)) {
      return null;
    }
    try
    {
      Object localObject = paramIntent.getCategories();
      if (localObject == null) {
        return null;
      }
      if (((Set)localObject).contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
      {
        paramIntent = AppLinks.getAppLinkExtras(paramIntent);
        String str1 = paramIntent.getString("com.facebook.orca.extra.THREAD_TOKEN");
        String str2 = paramIntent.getString("com.facebook.orca.extra.METADATA");
        localObject = paramIntent.getString("com.facebook.orca.extra.PARTICIPANTS");
        boolean bool1 = paramIntent.getBoolean("com.facebook.orca.extra.IS_REPLY");
        boolean bool2 = paramIntent.getBoolean("com.facebook.orca.extra.IS_COMPOSE");
        paramIntent = MessengerThreadParams.Origin.UNKNOWN;
        if (bool1) {
          paramIntent = MessengerThreadParams.Origin.REPLY_FLOW;
        } else if (bool2) {
          paramIntent = MessengerThreadParams.Origin.COMPOSE_FLOW;
        }
        paramIntent = new MessengerThreadParams(paramIntent, str1, str2, parseParticipants((String)localObject));
        return paramIntent;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, MessengerUtils.class);
    }
    return null;
  }
  
  public static boolean hasMessengerInstalled(Context paramContext)
  {
    return FacebookSignatureValidator.validateSignature(paramContext, "com.facebook.orca");
  }
  
  /* Error */
  public static void openMessengerInPlayStore(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 195	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc -18
    //   12: invokestatic 242	com/facebook/messenger/MessengerUtils:startViewUri	(Landroid/content/Context;Ljava/lang/String;)V
    //   15: goto +14 -> 29
    //   18: astore_0
    //   19: goto +11 -> 30
    //   22: astore_1
    //   23: aload_0
    //   24: ldc -12
    //   26: invokestatic 242	com/facebook/messenger/MessengerUtils:startViewUri	(Landroid/content/Context;Ljava/lang/String;)V
    //   29: return
    //   30: aload_0
    //   31: ldc 2
    //   33: invokestatic 224	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   36: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramContext	Context
    //   22	1	1	localActivityNotFoundException	ActivityNotFoundException
    // Exception table:
    //   from	to	target	type
    //   9	15	18	finally
    //   23	29	18	finally
    //   9	15	22	android/content/ActivityNotFoundException
  }
  
  private static List<String> parseParticipants(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      String[] arrayOfString = paramString.split(",");
      paramString = new ArrayList();
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++) {
        paramString.add(arrayOfString[j].trim());
      }
      return paramString;
    }
    return Collections.emptyList();
  }
  
  public static void shareToMessenger(Activity paramActivity, int paramInt, ShareToMessengerParams paramShareToMessengerParams)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerUtils.class)) {
      return;
    }
    try
    {
      if (!hasMessengerInstalled(paramActivity))
      {
        openMessengerInPlayStore(paramActivity);
        return;
      }
      if (getAllAvailableProtocolVersions(paramActivity).contains(Integer.valueOf(20150314))) {
        shareToMessenger20150314(paramActivity, paramInt, paramShareToMessengerParams);
      } else {
        openMessengerInPlayStore(paramActivity);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, MessengerUtils.class);
    }
  }
  
  private static void shareToMessenger20150314(Activity paramActivity, int paramInt, ShareToMessengerParams paramShareToMessengerParams)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.SEND");
      localIntent.setFlags(1);
      localIntent.setPackage("com.facebook.orca");
      localIntent.putExtra("android.intent.extra.STREAM", uri);
      localIntent.setType(mimeType);
      String str = FacebookSdk.getApplicationId();
      if (str != null)
      {
        localIntent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
        localIntent.putExtra("com.facebook.orca.extra.APPLICATION_ID", str);
        localIntent.putExtra("com.facebook.orca.extra.METADATA", metaData);
        localIntent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", externalUri);
      }
      paramActivity.startActivityForResult(localIntent, paramInt);
    }
    catch (ActivityNotFoundException paramShareToMessengerParams)
    {
      paramActivity.startActivity(paramActivity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
    }
  }
  
  private static void startViewUri(Context paramContext, String paramString)
  {
    paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
  }
}

/* Location:
 * Qualified Name:     com.facebook.messenger.MessengerUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */