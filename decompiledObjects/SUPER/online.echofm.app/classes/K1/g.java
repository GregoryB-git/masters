package K1;

import T1.a;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class g
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public static final a r = new a(null);
  public static final Map s = new HashMap();
  public final WeakReference o;
  public final Handler p;
  public final AtomicBoolean q;
  
  public g(Activity paramActivity)
  {
    o = new WeakReference(paramActivity);
    p = new Handler(Looper.getMainLooper());
    q = new AtomicBoolean(false);
  }
  
  /* Error */
  public static final void f(g paramg)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 78	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 92
    //   12: invokestatic 98	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: getstatic 103	G1/g:a	LG1/g;
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 43	K1/g:o	Ljava/lang/ref/WeakReference;
    //   23: invokevirtual 109	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   26: checkcast 111	android/app/Activity
    //   29: invokestatic 115	G1/g:e	(Landroid/app/Activity;)Landroid/view/View;
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 43	K1/g:o	Ljava/lang/ref/WeakReference;
    //   37: invokevirtual 109	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   40: checkcast 111	android/app/Activity
    //   43: astore_0
    //   44: aload_1
    //   45: ifnull +110 -> 155
    //   48: aload_0
    //   49: ifnonnull +6 -> 55
    //   52: goto +103 -> 155
    //   55: aload_1
    //   56: invokestatic 120	K1/c:a	(Landroid/view/View;)Ljava/util/List;
    //   59: invokeinterface 126 1 0
    //   64: astore_2
    //   65: aload_2
    //   66: invokeinterface 132 1 0
    //   71: ifeq +84 -> 155
    //   74: aload_2
    //   75: invokeinterface 135 1 0
    //   80: checkcast 137	android/view/View
    //   83: astore_3
    //   84: aload_3
    //   85: invokestatic 142	C1/d:g	(Landroid/view/View;)Z
    //   88: ifeq +6 -> 94
    //   91: goto -26 -> 65
    //   94: aload_3
    //   95: invokestatic 145	K1/c:d	(Landroid/view/View;)Ljava/lang/String;
    //   98: astore 4
    //   100: aload 4
    //   102: invokeinterface 151 1 0
    //   107: ifle -42 -> 65
    //   110: aload 4
    //   112: invokevirtual 154	java/lang/String:length	()I
    //   115: sipush 300
    //   118: if_icmpgt -53 -> 65
    //   121: getstatic 159	K1/j:s	LK1/j$a;
    //   124: astore 4
    //   126: aload_0
    //   127: invokevirtual 163	android/app/Activity:getLocalClassName	()Ljava/lang/String;
    //   130: astore 5
    //   132: aload 5
    //   134: ldc -91
    //   136: invokestatic 168	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   139: aload 4
    //   141: aload_3
    //   142: aload_1
    //   143: aload 5
    //   145: invokevirtual 173	K1/j$a:d	(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V
    //   148: goto -83 -> 65
    //   151: astore_0
    //   152: goto +4 -> 156
    //   155: return
    //   156: aload_0
    //   157: ldc 2
    //   159: invokestatic 81	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   162: return
    //   163: astore_0
    //   164: goto -9 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	paramg	g
    //   18	125	1	localObject1	Object
    //   64	11	2	localIterator	java.util.Iterator
    //   83	59	3	localView	View
    //   98	42	4	localObject2	Object
    //   130	14	5	str	String
    // Exception table:
    //   from	to	target	type
    //   9	15	151	finally
    //   15	44	151	finally
    //   55	65	151	finally
    //   65	91	151	finally
    //   94	148	151	finally
    //   15	44	163	java/lang/Exception
    //   55	65	163	java/lang/Exception
    //   65	91	163	java/lang/Exception
    //   94	148	163	java/lang/Exception
  }
  
  public final void e()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      f localf = new K1/f;
      localf.<init>(this);
      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        localf.run();
      }
    }
    finally
    {
      break label52;
    }
    p.post(localRunnable);
    return;
    label52:
    a.b(localRunnable, this);
  }
  
  public final void g()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      if (q.getAndSet(true)) {
        return;
      }
      Object localObject = G1.g.a;
      localObject = G1.g.e((Activity)o.get());
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (((ViewTreeObserver)localObject).isAlive())
      {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
        e();
      }
    }
    finally
    {
      break label72;
    }
    return;
    label72:
    a.b(localThrowable, this);
  }
  
  public final void h()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      if (!q.getAndSet(false)) {
        return;
      }
      Object localObject = G1.g.a;
      localObject = G1.g.e((Activity)o.get());
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (!((ViewTreeObserver)localObject).isAlive()) {
        return;
      }
      ((ViewTreeObserver)localObject).removeOnGlobalLayoutListener(this);
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
  
  public void onGlobalLayout()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      e();
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
  
  public static final class a
  {
    public final void a(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      int i = paramActivity.hashCode();
      Map localMap = g.b();
      Integer localInteger = Integer.valueOf(i);
      Object localObject1 = localMap.get(localInteger);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new g(paramActivity, null);
        localMap.put(localInteger, localObject2);
      }
      g.c((g)localObject2);
    }
    
    public final void b(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      int i = paramActivity.hashCode();
      paramActivity = (g)g.b().remove(Integer.valueOf(i));
      if (paramActivity != null) {
        g.d(paramActivity);
      }
    }
  }
}

/* Location:
 * Qualified Name:     K1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */