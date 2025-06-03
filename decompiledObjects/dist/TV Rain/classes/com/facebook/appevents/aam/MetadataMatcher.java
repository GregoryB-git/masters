package com.facebook.appevents.aam;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MetadataMatcher
{
  private static final int MAX_INDICATOR_LENGTH = 100;
  private static final String TAG = "com.facebook.appevents.aam.MetadataMatcher";
  
  public static List<String> getAroundViewIndicators(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = ViewHierarchy.getParentOfView(paramView);
      if (localObject != null)
      {
        Iterator localIterator = ViewHierarchy.getChildrenOfView((View)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (View)localIterator.next();
          if (paramView != localObject) {
            localArrayList.addAll(getTextIndicators((View)localObject));
          }
        }
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, MetadataMatcher.class);
    }
    return null;
  }
  
  /* Error */
  public static List<String> getCurrentViewIndicators(View paramView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 24	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 26	java/util/ArrayList
    //   13: astore_1
    //   14: aload_1
    //   15: invokespecial 27	java/util/ArrayList:<init>	()V
    //   18: aload_1
    //   19: aload_0
    //   20: invokestatic 74	com/facebook/appevents/codeless/internal/ViewHierarchy:getHintOfView	(Landroid/view/View;)Ljava/lang/String;
    //   23: invokevirtual 77	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   26: pop
    //   27: aload_0
    //   28: invokevirtual 80	android/view/View:getTag	()Ljava/lang/Object;
    //   31: astore_2
    //   32: aload_2
    //   33: ifnull +12 -> 45
    //   36: aload_1
    //   37: aload_2
    //   38: invokevirtual 84	java/lang/Object:toString	()Ljava/lang/String;
    //   41: invokevirtual 77	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload_0
    //   46: invokevirtual 88	android/view/View:getContentDescription	()Ljava/lang/CharSequence;
    //   49: astore_2
    //   50: aload_2
    //   51: ifnull +14 -> 65
    //   54: aload_1
    //   55: aload_2
    //   56: invokeinterface 91 1 0
    //   61: invokevirtual 77	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   64: pop
    //   65: aload_0
    //   66: invokevirtual 95	android/view/View:getId	()I
    //   69: iconst_m1
    //   70: if_icmpeq +34 -> 104
    //   73: aload_0
    //   74: invokevirtual 99	android/view/View:getResources	()Landroid/content/res/Resources;
    //   77: aload_0
    //   78: invokevirtual 95	android/view/View:getId	()I
    //   81: invokevirtual 105	android/content/res/Resources:getResourceName	(I)Ljava/lang/String;
    //   84: ldc 107
    //   86: invokevirtual 113	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   89: astore_0
    //   90: aload_0
    //   91: arraylength
    //   92: iconst_2
    //   93: if_icmpne +11 -> 104
    //   96: aload_1
    //   97: aload_0
    //   98: iconst_1
    //   99: aaload
    //   100: invokevirtual 77	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: new 26	java/util/ArrayList
    //   107: astore_0
    //   108: aload_0
    //   109: invokespecial 27	java/util/ArrayList:<init>	()V
    //   112: aload_1
    //   113: invokevirtual 114	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   116: astore_1
    //   117: aload_1
    //   118: invokeinterface 48 1 0
    //   123: ifeq +41 -> 164
    //   126: aload_1
    //   127: invokeinterface 52 1 0
    //   132: checkcast 109	java/lang/String
    //   135: astore_2
    //   136: aload_2
    //   137: invokevirtual 117	java/lang/String:isEmpty	()Z
    //   140: ifne -23 -> 117
    //   143: aload_2
    //   144: invokevirtual 120	java/lang/String:length	()I
    //   147: bipush 100
    //   149: if_icmpgt -32 -> 117
    //   152: aload_0
    //   153: aload_2
    //   154: invokevirtual 123	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   157: invokevirtual 77	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   160: pop
    //   161: goto -44 -> 117
    //   164: aload_0
    //   165: areturn
    //   166: astore_0
    //   167: aload_0
    //   168: ldc 2
    //   170: invokestatic 65	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   173: aconst_null
    //   174: areturn
    //   175: astore_0
    //   176: goto -72 -> 104
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	paramView	View
    //   13	114	1	localObject1	Object
    //   31	123	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   10	32	166	finally
    //   36	45	166	finally
    //   45	50	166	finally
    //   54	65	166	finally
    //   65	104	166	finally
    //   104	117	166	finally
    //   117	161	166	finally
    //   65	104	175	android/content/res/Resources$NotFoundException
  }
  
  public static List<String> getTextIndicators(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if ((paramView instanceof EditText)) {
        return localArrayList;
      }
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getText().toString();
        if ((!paramView.isEmpty()) && (paramView.length() < 100)) {
          localArrayList.add(paramView.toLowerCase());
        }
        return localArrayList;
      }
      paramView = ViewHierarchy.getChildrenOfView(paramView).iterator();
      while (paramView.hasNext()) {
        localArrayList.addAll(getTextIndicators((View)paramView.next()));
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, MetadataMatcher.class);
    }
    return null;
  }
  
  public static boolean matchIndicator(String paramString, List<String> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
      return false;
    }
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        boolean bool = paramString.contains((String)paramList.next());
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, MetadataMatcher.class);
    }
    return false;
  }
  
  public static boolean matchIndicator(List<String> paramList1, List<String> paramList2)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
      return false;
    }
    try
    {
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        boolean bool = matchIndicator((String)paramList1.next(), paramList2);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList1, MetadataMatcher.class);
    }
    return false;
  }
  
  public static boolean matchValue(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
      return false;
    }
    try
    {
      boolean bool = paramString1.matches(paramString2);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, MetadataMatcher.class);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataMatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */