package R2;

import E2.e;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class k4
  implements Application.ActivityLifecycleCallbacks
{
  public k4(C3 paramC3) {}
  
  /* Error */
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	R2/k4:o	LR2/C3;
    //   4: invokevirtual 89	R2/m3:j	()LR2/Y1;
    //   7: invokevirtual 205	R2/Y1:K	()LR2/a2;
    //   10: ldc -50
    //   12: invokevirtual 102	R2/a2:a	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 212	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnonnull +16 -> 37
    //   24: aload_0
    //   25: getfield 12	R2/k4:o	LR2/C3;
    //   28: invokevirtual 217	R2/G1:s	()LR2/v4;
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 222	R2/v4:M	(Landroid/app/Activity;Landroid/os/Bundle;)V
    //   36: return
    //   37: aload_3
    //   38: invokevirtual 228	android/content/Intent:getData	()Landroid/net/Uri;
    //   41: astore 4
    //   43: aload 4
    //   45: ifnull +24 -> 69
    //   48: aload 4
    //   50: invokevirtual 231	android/net/Uri:isHierarchical	()Z
    //   53: ifeq +16 -> 69
    //   56: goto +57 -> 113
    //   59: astore 4
    //   61: goto +178 -> 239
    //   64: astore 4
    //   66: goto +152 -> 218
    //   69: aload_3
    //   70: invokevirtual 235	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   73: astore 4
    //   75: aload 4
    //   77: ifnull +30 -> 107
    //   80: aload 4
    //   82: ldc -19
    //   84: invokevirtual 152	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   87: astore 4
    //   89: aload 4
    //   91: invokestatic 62	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   94: ifne +13 -> 107
    //   97: aload 4
    //   99: invokestatic 122	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   102: astore 4
    //   104: goto -48 -> 56
    //   107: aconst_null
    //   108: astore 4
    //   110: goto -54 -> 56
    //   113: aload 4
    //   115: ifnull -91 -> 24
    //   118: aload 4
    //   120: invokevirtual 231	android/net/Uri:isHierarchical	()Z
    //   123: ifne +6 -> 129
    //   126: goto -102 -> 24
    //   129: aload_0
    //   130: getfield 12	R2/k4:o	LR2/C3;
    //   133: invokevirtual 29	R2/m3:k	()LR2/S5;
    //   136: pop
    //   137: aload_3
    //   138: invokestatic 241	R2/S5:e0	(Landroid/content/Intent;)Z
    //   141: ifeq +9 -> 150
    //   144: ldc -13
    //   146: astore_3
    //   147: goto +9 -> 156
    //   150: ldc -71
    //   152: astore_3
    //   153: goto -6 -> 147
    //   156: aload 4
    //   158: ldc -124
    //   160: invokevirtual 246	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 5
    //   165: aload_2
    //   166: ifnonnull +9 -> 175
    //   169: iconst_1
    //   170: istore 6
    //   172: goto +9 -> 181
    //   175: iconst_0
    //   176: istore 6
    //   178: goto -6 -> 172
    //   181: aload_0
    //   182: getfield 12	R2/k4:o	LR2/C3;
    //   185: invokevirtual 250	R2/m3:e	()LR2/G2;
    //   188: astore 7
    //   190: new 252	R2/o4
    //   193: astore 8
    //   195: aload 8
    //   197: aload_0
    //   198: iload 6
    //   200: aload 4
    //   202: aload_3
    //   203: aload 5
    //   205: invokespecial 254	R2/o4:<init>	(LR2/k4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    //   208: aload 7
    //   210: aload 8
    //   212: invokevirtual 259	R2/G2:D	(Ljava/lang/Runnable;)V
    //   215: goto -191 -> 24
    //   218: aload_0
    //   219: getfield 12	R2/k4:o	LR2/C3;
    //   222: invokevirtual 89	R2/m3:j	()LR2/Y1;
    //   225: invokevirtual 198	R2/Y1:G	()LR2/a2;
    //   228: ldc_w 261
    //   231: aload 4
    //   233: invokevirtual 178	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   236: goto -212 -> 24
    //   239: aload_0
    //   240: getfield 12	R2/k4:o	LR2/C3;
    //   243: invokevirtual 217	R2/G1:s	()LR2/v4;
    //   246: aload_1
    //   247: aload_2
    //   248: invokevirtual 222	R2/v4:M	(Landroid/app/Activity;Landroid/os/Bundle;)V
    //   251: aload 4
    //   253: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	k4
    //   0	254	1	paramActivity	Activity
    //   0	254	2	paramBundle	Bundle
    //   19	184	3	localObject1	Object
    //   41	8	4	localUri	android.net.Uri
    //   59	1	4	localObject2	Object
    //   64	1	4	localRuntimeException	RuntimeException
    //   73	179	4	localObject3	Object
    //   163	41	5	str	String
    //   170	29	6	bool	boolean
    //   188	21	7	localG2	G2
    //   193	18	8	localo4	o4
    // Exception table:
    //   from	to	target	type
    //   0	20	59	finally
    //   37	43	59	finally
    //   48	56	59	finally
    //   69	75	59	finally
    //   80	104	59	finally
    //   118	126	59	finally
    //   129	144	59	finally
    //   156	165	59	finally
    //   181	215	59	finally
    //   218	236	59	finally
    //   0	20	64	java/lang/RuntimeException
    //   37	43	64	java/lang/RuntimeException
    //   48	56	64	java/lang/RuntimeException
    //   69	75	64	java/lang/RuntimeException
    //   80	104	64	java/lang/RuntimeException
    //   118	126	64	java/lang/RuntimeException
    //   129	144	64	java/lang/RuntimeException
    //   156	165	64	java/lang/RuntimeException
    //   181	215	64	java/lang/RuntimeException
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    o.s().K(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    o.s().Q(paramActivity);
    paramActivity = o.u();
    long l = paramActivity.b().b();
    paramActivity.e().D(new n5(paramActivity, l));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    l5 locall5 = o.u();
    long l = locall5.b().b();
    locall5.e().D(new o5(locall5, l));
    o.s().S(paramActivity);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    o.s().R(paramActivity, paramBundle);
  }
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     R2.k4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */