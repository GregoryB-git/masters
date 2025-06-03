package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class ImmLeaksCleaner
  implements f
{
  public static int p;
  public static Field q;
  public static Field r;
  public static Field s;
  public Activity o;
  
  public ImmLeaksCleaner(Activity paramActivity)
  {
    o = paramActivity;
  }
  
  public static void b()
  {
    try
    {
      p = 2;
      Field localField = InputMethodManager.class.getDeclaredField("mServedView");
      r = localField;
      localField.setAccessible(true);
      localField = InputMethodManager.class.getDeclaredField("mNextServedView");
      s = localField;
      localField.setAccessible(true);
      localField = InputMethodManager.class.getDeclaredField("mH");
      q = localField;
      localField.setAccessible(true);
      p = 1;
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public void a(androidx.lifecycle.h paramh, androidx.lifecycle.d.b paramb)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 66	androidx/lifecycle/d$b:ON_DESTROY	Landroidx/lifecycle/d$b;
    //   4: if_acmpeq +4 -> 8
    //   7: return
    //   8: getstatic 28	androidx/activity/ImmLeaksCleaner:p	I
    //   11: ifne +6 -> 17
    //   14: invokestatic 68	androidx/activity/ImmLeaksCleaner:b	()V
    //   17: getstatic 28	androidx/activity/ImmLeaksCleaner:p	I
    //   20: iconst_1
    //   21: if_icmpne +97 -> 118
    //   24: aload_0
    //   25: getfield 23	androidx/activity/ImmLeaksCleaner:o	Landroid/app/Activity;
    //   28: ldc 70
    //   30: invokevirtual 76	android/app/Activity:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   33: checkcast 30	android/view/inputmethod/InputMethodManager
    //   36: astore_3
    //   37: getstatic 54	androidx/activity/ImmLeaksCleaner:q	Ljava/lang/reflect/Field;
    //   40: aload_3
    //   41: invokevirtual 82	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   44: astore_1
    //   45: aload_1
    //   46: ifnonnull +4 -> 50
    //   49: return
    //   50: aload_1
    //   51: monitorenter
    //   52: getstatic 40	androidx/activity/ImmLeaksCleaner:r	Ljava/lang/reflect/Field;
    //   55: aload_3
    //   56: invokevirtual 82	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   59: checkcast 84	android/view/View
    //   62: astore_2
    //   63: aload_2
    //   64: ifnonnull +10 -> 74
    //   67: aload_1
    //   68: monitorexit
    //   69: return
    //   70: astore_2
    //   71: goto +43 -> 114
    //   74: aload_2
    //   75: invokevirtual 88	android/view/View:isAttachedToWindow	()Z
    //   78: ifeq +6 -> 84
    //   81: aload_1
    //   82: monitorexit
    //   83: return
    //   84: getstatic 50	androidx/activity/ImmLeaksCleaner:s	Ljava/lang/reflect/Field;
    //   87: aload_3
    //   88: aconst_null
    //   89: invokevirtual 92	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: aload_1
    //   93: monitorexit
    //   94: aload_3
    //   95: invokevirtual 95	android/view/inputmethod/InputMethodManager:isActive	()Z
    //   98: pop
    //   99: goto +19 -> 118
    //   102: astore_2
    //   103: aload_1
    //   104: monitorexit
    //   105: return
    //   106: astore_2
    //   107: aload_1
    //   108: monitorexit
    //   109: return
    //   110: astore_2
    //   111: aload_1
    //   112: monitorexit
    //   113: return
    //   114: aload_1
    //   115: monitorexit
    //   116: aload_2
    //   117: athrow
    //   118: return
    //   119: astore_1
    //   120: goto -2 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	ImmLeaksCleaner
    //   0	123	1	paramh	androidx.lifecycle.h
    //   0	123	2	paramb	androidx.lifecycle.d.b
    //   36	59	3	localInputMethodManager	InputMethodManager
    // Exception table:
    //   from	to	target	type
    //   52	63	70	finally
    //   67	69	70	finally
    //   74	83	70	finally
    //   84	92	70	finally
    //   92	94	70	finally
    //   103	105	70	finally
    //   107	109	70	finally
    //   111	113	70	finally
    //   114	116	70	finally
    //   84	92	102	java/lang/IllegalAccessException
    //   52	63	106	java/lang/ClassCastException
    //   52	63	110	java/lang/IllegalAccessException
    //   37	45	119	java/lang/IllegalAccessException
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ImmLeaksCleaner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */