package com.facebook.appevents.suggestedevents;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.ml.ModelManager.Task;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class ViewOnClickListener
  implements View.OnClickListener
{
  private static final String API_ENDPOINT = "%s/suggested_events";
  public static final String OTHER_EVENT = "other";
  private static final String TAG = ViewOnClickListener.class.getCanonicalName();
  private static final Set<Integer> viewsAttachedListener = new HashSet();
  private String activityName;
  @Nullable
  private View.OnClickListener baseListener;
  private WeakReference<View> hostViewWeakReference;
  private WeakReference<View> rootViewWeakReference;
  
  private ViewOnClickListener(View paramView1, View paramView2, String paramString)
  {
    baseListener = ViewHierarchy.getExistingOnClickListener(paramView1);
    hostViewWeakReference = new WeakReference(paramView1);
    rootViewWeakReference = new WeakReference(paramView2);
    activityName = paramString.toLowerCase().replace("activity", "");
  }
  
  public static void attachListener(View paramView1, View paramView2, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
      return;
    }
    try
    {
      int i = paramView1.hashCode();
      Set localSet = viewsAttachedListener;
      if (!localSet.contains(Integer.valueOf(i)))
      {
        ViewOnClickListener localViewOnClickListener = new com/facebook/appevents/suggestedevents/ViewOnClickListener;
        localViewOnClickListener.<init>(paramView1, paramView2, paramString);
        ViewHierarchy.setOnClickListener(paramView1, localViewOnClickListener);
        localSet.add(Integer.valueOf(i));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView1, ViewOnClickListener.class);
    }
  }
  
  private void predictAndProcess(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Runnable local2 = new com/facebook/appevents/suggestedevents/ViewOnClickListener$2;
      local2.<init>(this, paramJSONObject, paramString2, paramString1);
      Utility.runOnNonUiThread(local2);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  /* Error */
  private void process()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 93	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 70	com/facebook/appevents/suggestedevents/ViewOnClickListener:rootViewWeakReference	Ljava/lang/ref/WeakReference;
    //   12: invokevirtual 147	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   15: checkcast 149	android/view/View
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 68	com/facebook/appevents/suggestedevents/ViewOnClickListener:hostViewWeakReference	Ljava/lang/ref/WeakReference;
    //   23: invokevirtual 147	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   26: checkcast 149	android/view/View
    //   29: astore_2
    //   30: aload_1
    //   31: ifnull +82 -> 113
    //   34: aload_2
    //   35: ifnonnull +6 -> 41
    //   38: goto +75 -> 113
    //   41: aload_2
    //   42: invokestatic 155	com/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy:getTextOfViewRecursively	(Landroid/view/View;)Ljava/lang/String;
    //   45: astore_3
    //   46: aload_2
    //   47: aload_3
    //   48: invokestatic 161	com/facebook/appevents/suggestedevents/PredictionHistoryManager:getPathID	(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;
    //   51: astore 4
    //   53: aload 4
    //   55: ifnonnull +4 -> 59
    //   58: return
    //   59: aload 4
    //   61: aload_3
    //   62: invokestatic 165	com/facebook/appevents/suggestedevents/ViewOnClickListener:queryHistoryAndProcess	(Ljava/lang/String;Ljava/lang/String;)Z
    //   65: ifeq +4 -> 69
    //   68: return
    //   69: new 167	org/json/JSONObject
    //   72: astore 5
    //   74: aload 5
    //   76: invokespecial 168	org/json/JSONObject:<init>	()V
    //   79: aload 5
    //   81: ldc -86
    //   83: aload_1
    //   84: aload_2
    //   85: invokestatic 174	com/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy:getDictionaryOfView	(Landroid/view/View;Landroid/view/View;)Lorg/json/JSONObject;
    //   88: invokevirtual 178	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   91: pop
    //   92: aload 5
    //   94: ldc -76
    //   96: aload_0
    //   97: getfield 85	com/facebook/appevents/suggestedevents/ViewOnClickListener:activityName	Ljava/lang/String;
    //   100: invokevirtual 178	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   103: pop
    //   104: aload_0
    //   105: aload 4
    //   107: aload_3
    //   108: aload 5
    //   110: invokespecial 182	com/facebook/appevents/suggestedevents/ViewOnClickListener:predictAndProcess	(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    //   113: return
    //   114: astore_3
    //   115: aload_3
    //   116: aload_0
    //   117: invokestatic 100	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   120: return
    //   121: astore_3
    //   122: goto -9 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	ViewOnClickListener
    //   18	66	1	localView1	View
    //   29	56	2	localView2	View
    //   45	63	3	str1	String
    //   114	2	3	localThrowable	Throwable
    //   121	1	3	localException	Exception
    //   51	55	4	str2	String
    //   72	37	5	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   8	30	114	finally
    //   41	53	114	finally
    //   59	68	114	finally
    //   69	113	114	finally
    //   41	53	121	java/lang/Exception
    //   59	68	121	java/lang/Exception
    //   69	113	121	java/lang/Exception
  }
  
  private static void processPredictedResult(String paramString1, String paramString2, float[] paramArrayOfFloat)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
      return;
    }
    try
    {
      if (SuggestedEventsManager.isProductionEvents(paramString1))
      {
        paramArrayOfFloat = new com/facebook/appevents/InternalAppEventsLogger;
        paramArrayOfFloat.<init>(FacebookSdk.getApplicationContext());
        paramArrayOfFloat.logEventFromSE(paramString1, paramString2);
      }
      else if (SuggestedEventsManager.isEligibleEvents(paramString1))
      {
        sendPredictedResult(paramString1, paramString2, paramArrayOfFloat);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, ViewOnClickListener.class);
    }
  }
  
  private static boolean queryHistoryAndProcess(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
      return false;
    }
    try
    {
      String str = PredictionHistoryManager.queryEvent(paramString1);
      if (str == null) {
        return false;
      }
      if (!str.equals("other"))
      {
        paramString1 = new com/facebook/appevents/suggestedevents/ViewOnClickListener$1;
        paramString1.<init>(str, paramString2);
        Utility.runOnNonUiThread(paramString1);
      }
      return true;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, ViewOnClickListener.class);
    }
    return false;
  }
  
  /* Error */
  private static void sendPredictedResult(String paramString1, String paramString2, float[] paramArrayOfFloat)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 93	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: new 222	android/os/Bundle
    //   12: astore_3
    //   13: aload_3
    //   14: invokespecial 223	android/os/Bundle:<init>	()V
    //   17: aload_3
    //   18: ldc -31
    //   20: aload_0
    //   21: invokevirtual 230	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: new 167	org/json/JSONObject
    //   27: astore 4
    //   29: aload 4
    //   31: invokespecial 168	org/json/JSONObject:<init>	()V
    //   34: new 232	java/lang/StringBuilder
    //   37: astore_0
    //   38: aload_0
    //   39: invokespecial 233	java/lang/StringBuilder:<init>	()V
    //   42: aload_2
    //   43: arraylength
    //   44: istore 5
    //   46: iconst_0
    //   47: istore 6
    //   49: iload 6
    //   51: iload 5
    //   53: if_icmpge +25 -> 78
    //   56: aload_0
    //   57: aload_2
    //   58: iload 6
    //   60: faload
    //   61: invokevirtual 237	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_0
    //   66: ldc -17
    //   68: invokevirtual 242	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iinc 6 1
    //   75: goto -26 -> 49
    //   78: aload 4
    //   80: ldc -12
    //   82: aload_0
    //   83: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokevirtual 178	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   89: pop
    //   90: aload 4
    //   92: ldc -7
    //   94: aload_1
    //   95: invokevirtual 178	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: aload_3
    //   100: ldc -5
    //   102: aload 4
    //   104: invokevirtual 252	org/json/JSONObject:toString	()Ljava/lang/String;
    //   107: invokevirtual 230	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: aconst_null
    //   111: getstatic 258	java/util/Locale:US	Ljava/util/Locale;
    //   114: ldc 18
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: invokestatic 261	com/facebook/FacebookSdk:getApplicationId	()Ljava/lang/String;
    //   125: aastore
    //   126: invokestatic 265	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   129: aconst_null
    //   130: aconst_null
    //   131: invokestatic 271	com/facebook/GraphRequest:newPostRequest	(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;
    //   134: astore_0
    //   135: aload_0
    //   136: aload_3
    //   137: invokevirtual 275	com/facebook/GraphRequest:setParameters	(Landroid/os/Bundle;)V
    //   140: aload_0
    //   141: invokevirtual 279	com/facebook/GraphRequest:executeAndWait	()Lcom/facebook/GraphResponse;
    //   144: pop
    //   145: return
    //   146: astore_0
    //   147: aload_0
    //   148: ldc 2
    //   150: invokestatic 100	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   153: return
    //   154: astore_0
    //   155: goto -10 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	paramString1	String
    //   0	158	1	paramString2	String
    //   0	158	2	paramArrayOfFloat	float[]
    //   12	125	3	localBundle	android.os.Bundle
    //   27	76	4	localJSONObject	JSONObject
    //   44	10	5	i	int
    //   47	26	6	j	int
    // Exception table:
    //   from	to	target	type
    //   9	17	146	finally
    //   17	46	146	finally
    //   56	72	146	finally
    //   78	145	146	finally
    //   17	46	154	org/json/JSONException
    //   56	72	154	org/json/JSONException
    //   78	145	154	org/json/JSONException
  }
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      View.OnClickListener localOnClickListener = baseListener;
      if (localOnClickListener != null) {
        localOnClickListener.onClick(paramView);
      }
      process();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.ViewOnClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */