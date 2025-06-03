package r8;

import com.google.android.gms.tasks.SuccessContinuation;
import k8.i;

public final class e
  implements SuccessContinuation<Void, Void>
{
  /* Error */
  public final com.google.android.gms.tasks.Task then(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: checkcast 28	java/lang/Void
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 17	r8/e:a	Lk8/i;
    //   9: getfield 34	k8/i:c	Lk8/b;
    //   12: getfield 39	k8/b:a	Ljava/util/concurrent/ExecutorService;
    //   15: new 41	r8/d
    //   18: dup
    //   19: aload_0
    //   20: invokespecial 44	r8/d:<init>	(Lr8/e;)V
    //   23: invokeinterface 50 2 0
    //   28: invokeinterface 56 1 0
    //   33: checkcast 58	org/json/JSONObject
    //   36: astore_2
    //   37: aconst_null
    //   38: astore_3
    //   39: aload_2
    //   40: ifnull +233 -> 273
    //   43: aload_0
    //   44: getfield 15	r8/e:b	Lr8/f;
    //   47: getfield 63	r8/f:c	Lg/s;
    //   50: aload_2
    //   51: invokevirtual 69	g/s:d	(Lorg/json/JSONObject;)Lr8/c;
    //   54: astore 4
    //   56: aload_0
    //   57: getfield 15	r8/e:b	Lr8/f;
    //   60: getfield 73	r8/f:e	Ld2/h0;
    //   63: astore 5
    //   65: aload 4
    //   67: getfield 78	r8/c:c	J
    //   70: lstore 6
    //   72: aload 5
    //   74: invokevirtual 82	java/lang/Object:getClass	()Ljava/lang/Class;
    //   77: pop
    //   78: ldc 84
    //   80: iconst_2
    //   81: invokestatic 90	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   84: ifeq +12 -> 96
    //   87: ldc 84
    //   89: ldc 92
    //   91: aconst_null
    //   92: invokestatic 96	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   95: pop
    //   96: aload_2
    //   97: ldc 98
    //   99: lload 6
    //   101: invokevirtual 102	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   104: pop
    //   105: new 104	java/io/FileWriter
    //   108: astore_1
    //   109: aload_1
    //   110: aload 5
    //   112: getfield 109	d2/h0:b	Ljava/lang/Object;
    //   115: checkcast 111	java/io/File
    //   118: invokespecial 114	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   121: aload_1
    //   122: astore_3
    //   123: aload_1
    //   124: aload_2
    //   125: invokevirtual 118	org/json/JSONObject:toString	()Ljava/lang/String;
    //   128: invokevirtual 124	java/io/Writer:write	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: astore_3
    //   133: aload_1
    //   134: invokevirtual 127	java/io/Writer:flush	()V
    //   137: goto +28 -> 165
    //   140: astore 5
    //   142: goto +11 -> 153
    //   145: astore_1
    //   146: goto +119 -> 265
    //   149: astore 5
    //   151: aconst_null
    //   152: astore_1
    //   153: aload_1
    //   154: astore_3
    //   155: ldc 84
    //   157: ldc -127
    //   159: aload 5
    //   161: invokestatic 131	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   164: pop
    //   165: aload_1
    //   166: ldc -123
    //   168: invokestatic 138	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   171: aload_0
    //   172: getfield 15	r8/e:b	Lr8/f;
    //   175: invokevirtual 82	java/lang/Object:getClass	()Ljava/lang/Class;
    //   178: pop
    //   179: aload_2
    //   180: ldc -116
    //   182: invokestatic 143	r8/f:c	(Lorg/json/JSONObject;Ljava/lang/String;)V
    //   185: aload_0
    //   186: getfield 15	r8/e:b	Lr8/f;
    //   189: astore_3
    //   190: aload_3
    //   191: getfield 146	r8/f:b	Lr8/i;
    //   194: getfield 152	r8/i:f	Ljava/lang/String;
    //   197: astore_1
    //   198: aload_3
    //   199: getfield 155	r8/f:a	Landroid/content/Context;
    //   202: ldc -99
    //   204: iconst_0
    //   205: invokevirtual 163	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   208: invokeinterface 169 1 0
    //   213: astore_3
    //   214: aload_3
    //   215: ldc -85
    //   217: aload_1
    //   218: invokeinterface 177 3 0
    //   223: pop
    //   224: aload_3
    //   225: invokeinterface 180 1 0
    //   230: aload_0
    //   231: getfield 15	r8/e:b	Lr8/f;
    //   234: getfield 184	r8/f:h	Ljava/util/concurrent/atomic/AtomicReference;
    //   237: aload 4
    //   239: invokevirtual 190	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   242: aload_0
    //   243: getfield 15	r8/e:b	Lr8/f;
    //   246: getfield 193	r8/f:i	Ljava/util/concurrent/atomic/AtomicReference;
    //   249: invokevirtual 194	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   252: checkcast 196	com/google/android/gms/tasks/TaskCompletionSource
    //   255: aload 4
    //   257: invokevirtual 200	com/google/android/gms/tasks/TaskCompletionSource:trySetResult	(Ljava/lang/Object;)Z
    //   260: pop
    //   261: goto +12 -> 273
    //   264: astore_1
    //   265: aload_3
    //   266: ldc -123
    //   268: invokestatic 138	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   271: aload_1
    //   272: athrow
    //   273: aconst_null
    //   274: invokestatic 205	com/google/android/gms/tasks/Tasks:forResult	(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    //   277: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	e
    //   0	278	1	paramObject	Object
    //   36	144	2	localJSONObject	org.json.JSONObject
    //   38	228	3	localObject	Object
    //   54	202	4	localc	c
    //   63	48	5	localh0	d2.h0
    //   140	1	5	localException1	Exception
    //   149	11	5	localException2	Exception
    //   70	30	6	l	long
    // Exception table:
    //   from	to	target	type
    //   123	131	140	java/lang/Exception
    //   133	137	140	java/lang/Exception
    //   96	121	145	finally
    //   96	121	149	java/lang/Exception
    //   123	131	264	finally
    //   133	137	264	finally
    //   155	165	264	finally
  }
}

/* Location:
 * Qualified Name:     r8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */