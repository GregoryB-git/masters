package com.facebook.appevents.codeless;

import java.util.TimerTask;

class ViewIndexer$2
  implements Runnable
{
  public ViewIndexer$2(ViewIndexer paramViewIndexer, TimerTask paramTimerTask) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 33	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 19	com/facebook/appevents/codeless/ViewIndexer$2:this$0	Lcom/facebook/appevents/codeless/ViewIndexer;
    //   12: invokestatic 37	com/facebook/appevents/codeless/ViewIndexer:access$400	(Lcom/facebook/appevents/codeless/ViewIndexer;)Ljava/util/Timer;
    //   15: ifnull +13 -> 28
    //   18: aload_0
    //   19: getfield 19	com/facebook/appevents/codeless/ViewIndexer$2:this$0	Lcom/facebook/appevents/codeless/ViewIndexer;
    //   22: invokestatic 37	com/facebook/appevents/codeless/ViewIndexer:access$400	(Lcom/facebook/appevents/codeless/ViewIndexer;)Ljava/util/Timer;
    //   25: invokevirtual 42	java/util/Timer:cancel	()V
    //   28: aload_0
    //   29: getfield 19	com/facebook/appevents/codeless/ViewIndexer$2:this$0	Lcom/facebook/appevents/codeless/ViewIndexer;
    //   32: aconst_null
    //   33: invokestatic 46	com/facebook/appevents/codeless/ViewIndexer:access$502	(Lcom/facebook/appevents/codeless/ViewIndexer;Ljava/lang/String;)Ljava/lang/String;
    //   36: pop
    //   37: aload_0
    //   38: getfield 19	com/facebook/appevents/codeless/ViewIndexer$2:this$0	Lcom/facebook/appevents/codeless/ViewIndexer;
    //   41: astore_1
    //   42: new 39	java/util/Timer
    //   45: astore_2
    //   46: aload_2
    //   47: invokespecial 47	java/util/Timer:<init>	()V
    //   50: aload_1
    //   51: aload_2
    //   52: invokestatic 51	com/facebook/appevents/codeless/ViewIndexer:access$402	(Lcom/facebook/appevents/codeless/ViewIndexer;Ljava/util/Timer;)Ljava/util/Timer;
    //   55: pop
    //   56: aload_0
    //   57: getfield 19	com/facebook/appevents/codeless/ViewIndexer$2:this$0	Lcom/facebook/appevents/codeless/ViewIndexer;
    //   60: invokestatic 37	com/facebook/appevents/codeless/ViewIndexer:access$400	(Lcom/facebook/appevents/codeless/ViewIndexer;)Ljava/util/Timer;
    //   63: aload_0
    //   64: getfield 21	com/facebook/appevents/codeless/ViewIndexer$2:val$indexingTask	Ljava/util/TimerTask;
    //   67: lconst_0
    //   68: ldc2_w 52
    //   71: invokevirtual 57	java/util/Timer:scheduleAtFixedRate	(Ljava/util/TimerTask;JJ)V
    //   74: goto +18 -> 92
    //   77: astore_2
    //   78: goto +15 -> 93
    //   81: astore_2
    //   82: invokestatic 61	com/facebook/appevents/codeless/ViewIndexer:access$200	()Ljava/lang/String;
    //   85: ldc 63
    //   87: aload_2
    //   88: invokestatic 69	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   91: pop
    //   92: return
    //   93: aload_2
    //   94: aload_0
    //   95: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   98: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	2
    //   41	10	1	localViewIndexer	ViewIndexer
    //   45	7	2	localTimer	java.util.Timer
    //   77	1	2	localObject	Object
    //   81	13	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   8	28	77	finally
    //   28	74	77	finally
    //   82	92	77	finally
    //   8	28	81	java/lang/Exception
    //   28	74	81	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */