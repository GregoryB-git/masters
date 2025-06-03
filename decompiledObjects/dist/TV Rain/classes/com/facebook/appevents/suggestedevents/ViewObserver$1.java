package com.facebook.appevents.suggestedevents;

class ViewObserver$1
  implements Runnable
{
  public ViewObserver$1(ViewObserver paramViewObserver) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 29	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 17	com/facebook/appevents/suggestedevents/ViewObserver$1:this$0	Lcom/facebook/appevents/suggestedevents/ViewObserver;
    //   12: invokestatic 33	com/facebook/appevents/suggestedevents/ViewObserver:access$000	(Lcom/facebook/appevents/suggestedevents/ViewObserver;)Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 39	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   18: checkcast 41	android/app/Activity
    //   21: invokestatic 47	com/facebook/appevents/internal/AppEventUtility:getRootView	(Landroid/app/Activity;)Landroid/view/View;
    //   24: astore_1
    //   25: aload_0
    //   26: getfield 17	com/facebook/appevents/suggestedevents/ViewObserver$1:this$0	Lcom/facebook/appevents/suggestedevents/ViewObserver;
    //   29: invokestatic 33	com/facebook/appevents/suggestedevents/ViewObserver:access$000	(Lcom/facebook/appevents/suggestedevents/ViewObserver;)Ljava/lang/ref/WeakReference;
    //   32: invokevirtual 39	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   35: checkcast 41	android/app/Activity
    //   38: astore_2
    //   39: aload_1
    //   40: ifnull +90 -> 130
    //   43: aload_2
    //   44: ifnonnull +6 -> 50
    //   47: goto +83 -> 130
    //   50: aload_1
    //   51: invokestatic 53	com/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy:getAllClickableViews	(Landroid/view/View;)Ljava/util/List;
    //   54: invokeinterface 59 1 0
    //   59: astore_3
    //   60: aload_3
    //   61: invokeinterface 65 1 0
    //   66: ifeq +73 -> 139
    //   69: aload_3
    //   70: invokeinterface 68 1 0
    //   75: checkcast 70	android/view/View
    //   78: astore 4
    //   80: aload 4
    //   82: invokestatic 76	com/facebook/appevents/codeless/internal/SensitiveUserDataUtils:isSensitiveUserData	(Landroid/view/View;)Z
    //   85: ifeq +6 -> 91
    //   88: goto -28 -> 60
    //   91: aload 4
    //   93: invokestatic 80	com/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy:getTextOfViewRecursively	(Landroid/view/View;)Ljava/lang/String;
    //   96: astore 5
    //   98: aload 5
    //   100: invokevirtual 85	java/lang/String:isEmpty	()Z
    //   103: ifne -43 -> 60
    //   106: aload 5
    //   108: invokevirtual 89	java/lang/String:length	()I
    //   111: sipush 300
    //   114: if_icmpgt -54 -> 60
    //   117: aload 4
    //   119: aload_1
    //   120: aload_2
    //   121: invokevirtual 93	android/app/Activity:getLocalClassName	()Ljava/lang/String;
    //   124: invokestatic 99	com/facebook/appevents/suggestedevents/ViewOnClickListener:attachListener	(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V
    //   127: goto -67 -> 60
    //   130: return
    //   131: astore 4
    //   133: aload 4
    //   135: aload_0
    //   136: invokestatic 103	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   139: return
    //   140: astore 4
    //   142: goto -3 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	1
    //   24	96	1	localView1	android.view.View
    //   38	83	2	localActivity	android.app.Activity
    //   59	11	3	localIterator	java.util.Iterator
    //   78	40	4	localView2	android.view.View
    //   131	3	4	localThrowable	Throwable
    //   140	1	4	localException	Exception
    //   96	11	5	str	String
    // Exception table:
    //   from	to	target	type
    //   8	39	131	finally
    //   50	60	131	finally
    //   60	88	131	finally
    //   91	127	131	finally
    //   8	39	140	java/lang/Exception
    //   50	60	140	java/lang/Exception
    //   60	88	140	java/lang/Exception
    //   91	127	140	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.ViewObserver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */