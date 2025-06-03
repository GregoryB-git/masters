package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public abstract class WorkerFactory
{
  private static final String TAG = Logger.tagWithPrefix("WorkerFactory");
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static WorkerFactory getDefaultWorkerFactory()
  {
    new WorkerFactory()
    {
      @Nullable
      public ListenableWorker createWorker(@NonNull Context paramAnonymousContext, @NonNull String paramAnonymousString, @NonNull WorkerParameters paramAnonymousWorkerParameters)
      {
        return null;
      }
    };
  }
  
  @Nullable
  public abstract ListenableWorker createWorker(@NonNull Context paramContext, @NonNull String paramString, @NonNull WorkerParameters paramWorkerParameters);
  
  /* Error */
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final ListenableWorker createWorkerWithDefaultFallback(@NonNull Context paramContext, @NonNull String paramString, @NonNull WorkerParameters paramWorkerParameters)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokevirtual 39	androidx/work/WorkerFactory:createWorker	(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    //   7: astore 4
    //   9: aload 4
    //   11: astore 5
    //   13: aload 4
    //   15: ifnonnull +129 -> 144
    //   18: aconst_null
    //   19: astore 6
    //   21: aload_2
    //   22: invokestatic 45	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   25: ldc 47
    //   27: invokevirtual 51	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   30: astore 5
    //   32: aload 5
    //   34: astore 6
    //   36: goto +29 -> 65
    //   39: astore 5
    //   41: invokestatic 55	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   44: getstatic 20	androidx/work/WorkerFactory:TAG	Ljava/lang/String;
    //   47: ldc 57
    //   49: aload_2
    //   50: invokestatic 63	z2:o	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: iconst_1
    //   54: anewarray 65	java/lang/Throwable
    //   57: dup
    //   58: iconst_0
    //   59: aload 5
    //   61: aastore
    //   62: invokevirtual 69	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   65: aload 4
    //   67: astore 5
    //   69: aload 6
    //   71: ifnull +73 -> 144
    //   74: aload 6
    //   76: iconst_2
    //   77: anewarray 41	java/lang/Class
    //   80: dup
    //   81: iconst_0
    //   82: ldc 71
    //   84: aastore
    //   85: dup
    //   86: iconst_1
    //   87: ldc 73
    //   89: aastore
    //   90: invokevirtual 77	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   93: iconst_2
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_1
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: aload_3
    //   104: aastore
    //   105: invokevirtual 83	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   108: checkcast 47	androidx/work/ListenableWorker
    //   111: astore 5
    //   113: goto +31 -> 144
    //   116: astore_1
    //   117: invokestatic 55	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   120: getstatic 20	androidx/work/WorkerFactory:TAG	Ljava/lang/String;
    //   123: ldc 85
    //   125: aload_2
    //   126: invokestatic 63	z2:o	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: iconst_1
    //   130: anewarray 65	java/lang/Throwable
    //   133: dup
    //   134: iconst_0
    //   135: aload_1
    //   136: aastore
    //   137: invokevirtual 69	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   140: aload 4
    //   142: astore 5
    //   144: aload 5
    //   146: ifnull +45 -> 191
    //   149: aload 5
    //   151: invokevirtual 89	androidx/work/ListenableWorker:isUsed	()Z
    //   154: ifne +6 -> 160
    //   157: goto +34 -> 191
    //   160: new 91	java/lang/IllegalStateException
    //   163: dup
    //   164: ldc 93
    //   166: iconst_2
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload_0
    //   173: invokevirtual 97	java/lang/Object:getClass	()Ljava/lang/Class;
    //   176: invokevirtual 101	java/lang/Class:getName	()Ljava/lang/String;
    //   179: aastore
    //   180: dup
    //   181: iconst_1
    //   182: aload_2
    //   183: aastore
    //   184: invokestatic 107	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   187: invokespecial 110	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   190: athrow
    //   191: aload 5
    //   193: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	WorkerFactory
    //   0	194	1	paramContext	Context
    //   0	194	2	paramString	String
    //   0	194	3	paramWorkerParameters	WorkerParameters
    //   7	134	4	localListenableWorker1	ListenableWorker
    //   11	22	5	localObject1	Object
    //   39	21	5	localObject2	Object
    //   67	125	5	localListenableWorker2	ListenableWorker
    //   19	56	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   21	32	39	finally
    //   74	113	116	finally
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */