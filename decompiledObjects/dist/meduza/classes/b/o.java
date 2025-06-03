package b;

import android.app.Activity;
import b1.m;
import java.lang.reflect.Field;

public final class o
  implements m
{
  public static int b;
  public static Field c;
  public static Field d;
  public static Field e;
  public Activity a;
  
  public o(Activity paramActivity)
  {
    a = paramActivity;
  }
  
  /* Error */
  public final void a(b1.o paramo, b1.k.a parama)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 35	b1/k$a:ON_DESTROY	Lb1/k$a;
    //   4: if_acmpeq +4 -> 8
    //   7: return
    //   8: getstatic 37	b/o:b	I
    //   11: ifne +62 -> 73
    //   14: iconst_2
    //   15: putstatic 37	b/o:b	I
    //   18: ldc 39
    //   20: ldc 41
    //   22: invokevirtual 47	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   25: astore_1
    //   26: aload_1
    //   27: putstatic 49	b/o:d	Ljava/lang/reflect/Field;
    //   30: aload_1
    //   31: iconst_1
    //   32: invokevirtual 55	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   35: ldc 39
    //   37: ldc 57
    //   39: invokevirtual 47	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   42: astore_1
    //   43: aload_1
    //   44: putstatic 59	b/o:e	Ljava/lang/reflect/Field;
    //   47: aload_1
    //   48: iconst_1
    //   49: invokevirtual 55	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   52: ldc 39
    //   54: ldc 61
    //   56: invokevirtual 47	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   59: astore_1
    //   60: aload_1
    //   61: putstatic 63	b/o:c	Ljava/lang/reflect/Field;
    //   64: aload_1
    //   65: iconst_1
    //   66: invokevirtual 55	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   69: iconst_1
    //   70: putstatic 37	b/o:b	I
    //   73: getstatic 37	b/o:b	I
    //   76: iconst_1
    //   77: if_icmpne +97 -> 174
    //   80: aload_0
    //   81: getfield 21	b/o:a	Landroid/app/Activity;
    //   84: ldc 65
    //   86: invokevirtual 71	android/app/Activity:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   89: checkcast 39	android/view/inputmethod/InputMethodManager
    //   92: astore_3
    //   93: getstatic 63	b/o:c	Ljava/lang/reflect/Field;
    //   96: aload_3
    //   97: invokevirtual 77	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   100: astore_1
    //   101: aload_1
    //   102: ifnonnull +4 -> 106
    //   105: return
    //   106: aload_1
    //   107: monitorenter
    //   108: getstatic 49	b/o:d	Ljava/lang/reflect/Field;
    //   111: aload_3
    //   112: invokevirtual 77	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   115: checkcast 79	android/view/View
    //   118: astore_2
    //   119: aload_2
    //   120: ifnonnull +6 -> 126
    //   123: aload_1
    //   124: monitorexit
    //   125: return
    //   126: aload_2
    //   127: invokevirtual 83	android/view/View:isAttachedToWindow	()Z
    //   130: ifeq +6 -> 136
    //   133: aload_1
    //   134: monitorexit
    //   135: return
    //   136: getstatic 59	b/o:e	Ljava/lang/reflect/Field;
    //   139: aload_3
    //   140: aconst_null
    //   141: invokevirtual 87	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   144: aload_1
    //   145: monitorexit
    //   146: aload_3
    //   147: invokevirtual 90	android/view/inputmethod/InputMethodManager:isActive	()Z
    //   150: pop
    //   151: goto +23 -> 174
    //   154: astore_2
    //   155: aload_1
    //   156: monitorexit
    //   157: return
    //   158: astore_2
    //   159: goto +11 -> 170
    //   162: astore_2
    //   163: aload_1
    //   164: monitorexit
    //   165: return
    //   166: astore_2
    //   167: aload_1
    //   168: monitorexit
    //   169: return
    //   170: aload_1
    //   171: monitorexit
    //   172: aload_2
    //   173: athrow
    //   174: return
    //   175: astore_1
    //   176: goto -103 -> 73
    //   179: astore_1
    //   180: goto -6 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	o
    //   0	183	1	paramo	b1.o
    //   0	183	2	parama	b1.k.a
    //   92	55	3	localInputMethodManager	android.view.inputmethod.InputMethodManager
    // Exception table:
    //   from	to	target	type
    //   136	144	154	java/lang/IllegalAccessException
    //   108	119	158	finally
    //   123	125	158	finally
    //   126	135	158	finally
    //   136	144	158	finally
    //   144	146	158	finally
    //   155	157	158	finally
    //   163	165	158	finally
    //   167	169	158	finally
    //   170	172	158	finally
    //   108	119	162	java/lang/ClassCastException
    //   108	119	166	java/lang/IllegalAccessException
    //   14	73	175	java/lang/NoSuchFieldException
    //   93	101	179	java/lang/IllegalAccessException
  }
}

/* Location:
 * Qualified Name:     b.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */