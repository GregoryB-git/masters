package u;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class f
{
  public static final Class<?> a;
  public static final Field b;
  public static final Field c;
  public static final Method d;
  public static final Method e;
  public static final Method f;
  public static final Handler g = new Handler(Looper.getMainLooper());
  
  /* Error */
  static
  {
    // Byte code:
    //   0: new 22	android/os/Handler
    //   3: dup
    //   4: invokestatic 28	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   7: invokespecial 32	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   10: putstatic 34	u/f:g	Landroid/os/Handler;
    //   13: aconst_null
    //   14: astore_0
    //   15: ldc 36
    //   17: invokestatic 42	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   20: astore_1
    //   21: goto +6 -> 27
    //   24: astore_1
    //   25: aconst_null
    //   26: astore_1
    //   27: aload_1
    //   28: putstatic 44	u/f:a	Ljava/lang/Class;
    //   31: ldc 46
    //   33: ldc 48
    //   35: invokevirtual 52	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore_1
    //   39: aload_1
    //   40: iconst_1
    //   41: invokevirtual 58	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   44: goto +6 -> 50
    //   47: astore_1
    //   48: aconst_null
    //   49: astore_1
    //   50: aload_1
    //   51: putstatic 60	u/f:b	Ljava/lang/reflect/Field;
    //   54: ldc 46
    //   56: ldc 62
    //   58: invokevirtual 52	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   61: astore_1
    //   62: aload_1
    //   63: iconst_1
    //   64: invokevirtual 58	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   67: goto +6 -> 73
    //   70: astore_1
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_1
    //   74: putstatic 64	u/f:c	Ljava/lang/reflect/Field;
    //   77: getstatic 44	u/f:a	Ljava/lang/Class;
    //   80: astore_1
    //   81: aload_1
    //   82: ifnonnull +6 -> 88
    //   85: goto +38 -> 123
    //   88: aload_1
    //   89: ldc 66
    //   91: iconst_3
    //   92: anewarray 38	java/lang/Class
    //   95: dup
    //   96: iconst_0
    //   97: ldc 68
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: getstatic 73	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   105: aastore
    //   106: dup
    //   107: iconst_2
    //   108: ldc 75
    //   110: aastore
    //   111: invokevirtual 79	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   114: astore_1
    //   115: aload_1
    //   116: iconst_1
    //   117: invokevirtual 58	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   120: goto +5 -> 125
    //   123: aconst_null
    //   124: astore_1
    //   125: aload_1
    //   126: putstatic 81	u/f:d	Ljava/lang/reflect/Method;
    //   129: getstatic 44	u/f:a	Ljava/lang/Class;
    //   132: astore_1
    //   133: aload_1
    //   134: ifnonnull +6 -> 140
    //   137: goto +33 -> 170
    //   140: aload_1
    //   141: ldc 66
    //   143: iconst_2
    //   144: anewarray 38	java/lang/Class
    //   147: dup
    //   148: iconst_0
    //   149: ldc 68
    //   151: aastore
    //   152: dup
    //   153: iconst_1
    //   154: getstatic 73	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   157: aastore
    //   158: invokevirtual 79	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   161: astore_1
    //   162: aload_1
    //   163: iconst_1
    //   164: invokevirtual 58	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   167: goto +5 -> 172
    //   170: aconst_null
    //   171: astore_1
    //   172: aload_1
    //   173: putstatic 83	u/f:e	Ljava/lang/reflect/Method;
    //   176: getstatic 44	u/f:a	Ljava/lang/Class;
    //   179: astore_2
    //   180: getstatic 89	android/os/Build$VERSION:SDK_INT	I
    //   183: istore_3
    //   184: iload_3
    //   185: bipush 26
    //   187: if_icmpeq +17 -> 204
    //   190: iload_3
    //   191: bipush 27
    //   193: if_icmpne +6 -> 199
    //   196: goto +8 -> 204
    //   199: iconst_0
    //   200: istore_3
    //   201: goto +5 -> 206
    //   204: iconst_1
    //   205: istore_3
    //   206: aload_0
    //   207: astore_1
    //   208: iload_3
    //   209: ifeq +85 -> 294
    //   212: aload_2
    //   213: ifnonnull +8 -> 221
    //   216: aload_0
    //   217: astore_1
    //   218: goto +76 -> 294
    //   221: getstatic 92	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   224: astore_1
    //   225: getstatic 73	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   228: astore 4
    //   230: aload_2
    //   231: ldc 94
    //   233: bipush 9
    //   235: anewarray 38	java/lang/Class
    //   238: dup
    //   239: iconst_0
    //   240: ldc 68
    //   242: aastore
    //   243: dup
    //   244: iconst_1
    //   245: ldc 96
    //   247: aastore
    //   248: dup
    //   249: iconst_2
    //   250: ldc 96
    //   252: aastore
    //   253: dup
    //   254: iconst_3
    //   255: aload_1
    //   256: aastore
    //   257: dup
    //   258: iconst_4
    //   259: aload 4
    //   261: aastore
    //   262: dup
    //   263: iconst_5
    //   264: ldc 98
    //   266: aastore
    //   267: dup
    //   268: bipush 6
    //   270: ldc 98
    //   272: aastore
    //   273: dup
    //   274: bipush 7
    //   276: aload 4
    //   278: aastore
    //   279: dup
    //   280: bipush 8
    //   282: aload 4
    //   284: aastore
    //   285: invokevirtual 79	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   288: astore_1
    //   289: aload_1
    //   290: iconst_1
    //   291: invokevirtual 58	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   294: aload_1
    //   295: putstatic 100	u/f:f	Ljava/lang/reflect/Method;
    //   298: return
    //   299: astore_1
    //   300: goto -177 -> 123
    //   303: astore_1
    //   304: goto -134 -> 170
    //   307: astore_1
    //   308: aload_0
    //   309: astore_1
    //   310: goto -16 -> 294
    // Local variable table:
    //   start	length	slot	name	signature
    //   14	295	0	localObject1	Object
    //   20	1	1	localClass1	Class
    //   24	1	1	localObject2	Object
    //   26	14	1	localField1	Field
    //   47	1	1	localObject3	Object
    //   49	14	1	localField2	Field
    //   70	1	1	localObject4	Object
    //   72	223	1	localObject5	Object
    //   299	1	1	localObject6	Object
    //   303	1	1	localObject7	Object
    //   307	1	1	localObject8	Object
    //   309	1	1	localObject9	Object
    //   179	52	2	localClass2	Class
    //   183	26	3	i	int
    //   228	55	4	localClass3	Class
    // Exception table:
    //   from	to	target	type
    //   15	21	24	finally
    //   31	44	47	finally
    //   54	67	70	finally
    //   88	120	299	finally
    //   140	167	303	finally
    //   221	294	307	finally
  }
  
  public static final class a
    implements Application.ActivityLifecycleCallbacks
  {
    public Object a;
    public Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    
    public a(Activity paramActivity)
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
}

/* Location:
 * Qualified Name:     u.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */