package u;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class f$a
  implements Application.ActivityLifecycleCallbacks
{
  public Object a;
  public Activity b;
  public final int c;
  public boolean d = false;
  public boolean e = false;
  public boolean f = false;
  
  public f$a(Activity paramActivity)
  {
    b = paramActivity;
    c = paramActivity.hashCode();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (b == paramActivity)
    {
      b = null;
      e = true;
    }
  }
  
  /* Error */
  public final void onActivityPaused(Activity paramActivity)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	u/f$a:e	Z
    //   4: ifeq +130 -> 134
    //   7: aload_0
    //   8: getfield 29	u/f$a:f	Z
    //   11: ifne +123 -> 134
    //   14: aload_0
    //   15: getfield 25	u/f$a:d	Z
    //   18: ifne +116 -> 134
    //   21: aload_0
    //   22: getfield 44	u/f$a:a	Ljava/lang/Object;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 37	u/f$a:c	I
    //   30: istore_3
    //   31: iconst_0
    //   32: istore 4
    //   34: getstatic 47	u/f:c	Ljava/lang/reflect/Field;
    //   37: aload_1
    //   38: invokevirtual 53	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: astore 5
    //   43: iload 4
    //   45: istore 6
    //   47: aload 5
    //   49: aload_2
    //   50: if_acmpne +69 -> 119
    //   53: aload_1
    //   54: invokevirtual 35	java/lang/Object:hashCode	()I
    //   57: iload_3
    //   58: if_icmpeq +10 -> 68
    //   61: iload 4
    //   63: istore 6
    //   65: goto +54 -> 119
    //   68: getstatic 55	u/f:b	Ljava/lang/reflect/Field;
    //   71: aload_1
    //   72: invokevirtual 53	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   75: astore 7
    //   77: getstatic 59	u/f:g	Landroid/os/Handler;
    //   80: astore_1
    //   81: new 61	u/e
    //   84: astore_2
    //   85: aload_2
    //   86: aload 7
    //   88: aload 5
    //   90: invokespecial 64	u/e:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   93: aload_1
    //   94: aload_2
    //   95: invokevirtual 70	android/os/Handler:postAtFrontOfQueue	(Ljava/lang/Runnable;)Z
    //   98: pop
    //   99: iconst_1
    //   100: istore 6
    //   102: goto +17 -> 119
    //   105: astore_1
    //   106: ldc 72
    //   108: ldc 74
    //   110: aload_1
    //   111: invokestatic 79	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   114: pop
    //   115: iload 4
    //   117: istore 6
    //   119: iload 6
    //   121: ifeq +13 -> 134
    //   124: aload_0
    //   125: iconst_1
    //   126: putfield 29	u/f$a:f	Z
    //   129: aload_0
    //   130: aconst_null
    //   131: putfield 44	u/f$a:a	Ljava/lang/Object;
    //   134: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	a
    //   0	135	1	paramActivity	Activity
    //   25	70	2	localObject1	Object
    //   30	29	3	i	int
    //   32	84	4	j	int
    //   41	48	5	localObject2	Object
    //   45	75	6	k	int
    //   75	12	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   34	43	105	finally
    //   53	61	105	finally
    //   68	99	105	finally
  }
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    if (b == paramActivity) {
      d = true;
    }
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     u.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */