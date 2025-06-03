package l3;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import e7.a1;
import e7.b1;
import e7.f1;
import e7.g1;
import e7.h;
import e7.h0;
import e7.i6;
import e7.n6;
import e7.o;
import j9.n;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import k9.d;
import k9.f;
import k9.l;
import k9.m;
import m3.b;

public final class j
  implements b, f1, Continuation
{
  public Object a;
  public Object b;
  public Object c;
  
  public final f a(j9.i parami, m paramm)
  {
    return new l(parami, (n)a, (d)b, paramm, (List)c);
  }
  
  public final void c(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    paramMap = (i6)c;
    String str = (String)a;
    n6 localn6 = (n6)b;
    a0.j.q(paramMap);
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      try
      {
        paramString = new byte[0];
      }
      finally
      {
        break label285;
      }
    }
    if (((paramInt == 200) || (paramInt == 204)) && (paramThrowable == null))
    {
      if (localn6 != null)
      {
        paramString = c;
        i6.q(paramString);
        paramString.K(Long.valueOf(a));
      }
      zzjw.d("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(paramInt));
      if (paramMap.R().x(null, h0.I0))
      {
        paramString = b;
        i6.q(paramString);
        if (paramString.u())
        {
          paramString = c;
          i6.q(paramString);
          if (paramString.z0(str))
          {
            paramMap.S(str);
            break label273;
          }
        }
      }
    }
    else
    {
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>(paramString, StandardCharsets.UTF_8);
      paramArrayOfByte = paramArrayOfByte.substring(0, Math.min(32, paramArrayOfByte.length()));
      b1 localb1 = zzjt;
      paramString = paramThrowable;
      if (paramThrowable == null) {
        paramString = paramArrayOfByte;
      }
      localb1.a(str, Integer.valueOf(paramInt), paramString, "Network upload failed. Will retry later. appId, status, error");
      if (localn6 != null)
      {
        paramString = c;
        i6.q(paramString);
        paramString.e0(Long.valueOf(a));
      }
    }
    paramMap.F();
    label273:
    C = false;
    paramMap.C();
    return;
    label285:
    C = false;
    paramMap.C();
    throw paramString;
  }
  
  public final Object get()
  {
    return new i((Context)((qb.a)a).get(), (t3.a)((qb.a)b).get(), (t3.a)((qb.a)c).get());
  }
  
  /* Error */
  public final Object then(com.google.android.gms.tasks.Task paramTask)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	l3/j:a	Ljava/lang/Object;
    //   4: checkcast 191	com/google/firebase/iid/FirebaseInstanceId
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 20	l3/j:b	Ljava/lang/Object;
    //   12: checkcast 44	java/lang/String
    //   15: astore_3
    //   16: aload_0
    //   17: getfield 22	l3/j:c	Ljava/lang/Object;
    //   20: checkcast 44	java/lang/String
    //   23: astore 4
    //   25: aload_2
    //   26: invokevirtual 195	com/google/firebase/iid/FirebaseInstanceId:f	()Ljava/lang/String;
    //   29: astore 5
    //   31: getstatic 199	com/google/firebase/iid/FirebaseInstanceId:j	Lcom/google/firebase/iid/a;
    //   34: astore_1
    //   35: aload_2
    //   36: invokevirtual 202	com/google/firebase/iid/FirebaseInstanceId:g	()Ljava/lang/String;
    //   39: astore 6
    //   41: aload_1
    //   42: monitorenter
    //   43: aload_1
    //   44: getfield 207	com/google/firebase/iid/a:a	Landroid/content/SharedPreferences;
    //   47: aload 6
    //   49: aload_3
    //   50: aload 4
    //   52: invokestatic 210	com/google/firebase/iid/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   55: aconst_null
    //   56: invokeinterface 216 3 0
    //   61: invokestatic 221	com/google/firebase/iid/a$a:b	(Ljava/lang/String;)Lcom/google/firebase/iid/a$a;
    //   64: astore 7
    //   66: aload_1
    //   67: monitorexit
    //   68: aload_2
    //   69: aload 7
    //   71: invokevirtual 225	com/google/firebase/iid/FirebaseInstanceId:k	(Lcom/google/firebase/iid/a$a;)Z
    //   74: ifne +22 -> 96
    //   77: new 227	r9/g
    //   80: dup
    //   81: aload 7
    //   83: getfield 230	com/google/firebase/iid/a$a:a	Ljava/lang/String;
    //   86: invokespecial 232	r9/g:<init>	(Ljava/lang/String;)V
    //   89: invokestatic 238	com/google/android/gms/tasks/Tasks:forResult	(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    //   92: astore_1
    //   93: goto +332 -> 425
    //   96: aload_2
    //   97: getfield 242	com/google/firebase/iid/FirebaseInstanceId:e	Lr9/i;
    //   100: astore 6
    //   102: aload 6
    //   104: monitorenter
    //   105: new 244	android/util/Pair
    //   108: astore 8
    //   110: aload 8
    //   112: aload_3
    //   113: aload 4
    //   115: invokespecial 247	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   118: aload 6
    //   120: getfield 252	r9/i:b	Lr/b;
    //   123: aload 8
    //   125: aconst_null
    //   126: invokevirtual 258	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast 260	com/google/android/gms/tasks/Task
    //   132: astore_1
    //   133: aload_1
    //   134: ifnull +69 -> 203
    //   137: ldc_w 262
    //   140: iconst_3
    //   141: invokestatic 268	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   144: ifeq +56 -> 200
    //   147: aload 8
    //   149: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   152: astore 8
    //   154: aload 8
    //   156: invokevirtual 142	java/lang/String:length	()I
    //   159: istore 9
    //   161: new 273	java/lang/StringBuilder
    //   164: astore_2
    //   165: aload_2
    //   166: iload 9
    //   168: bipush 29
    //   170: iadd
    //   171: invokespecial 276	java/lang/StringBuilder:<init>	(I)V
    //   174: aload_2
    //   175: ldc_w 278
    //   178: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload_2
    //   183: aload 8
    //   185: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: ldc_w 262
    //   192: aload_2
    //   193: invokevirtual 285	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   196: invokestatic 288	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   199: pop
    //   200: goto +222 -> 422
    //   203: ldc_w 262
    //   206: iconst_3
    //   207: invokestatic 268	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   210: ifeq +56 -> 266
    //   213: aload 8
    //   215: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   218: astore 10
    //   220: aload 10
    //   222: invokevirtual 142	java/lang/String:length	()I
    //   225: istore 9
    //   227: new 273	java/lang/StringBuilder
    //   230: astore_1
    //   231: aload_1
    //   232: iload 9
    //   234: bipush 24
    //   236: iadd
    //   237: invokespecial 276	java/lang/StringBuilder:<init>	(I)V
    //   240: aload_1
    //   241: ldc_w 290
    //   244: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_1
    //   249: aload 10
    //   251: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: ldc_w 262
    //   258: aload_1
    //   259: invokevirtual 285	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: invokestatic 288	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   265: pop
    //   266: aload_2
    //   267: getfield 293	com/google/firebase/iid/FirebaseInstanceId:d	Lr9/e;
    //   270: astore_1
    //   271: aload_1
    //   272: invokevirtual 297	java/lang/Object:getClass	()Ljava/lang/Class;
    //   275: pop
    //   276: new 299	android/os/Bundle
    //   279: astore 10
    //   281: aload 10
    //   283: invokespecial 300	android/os/Bundle:<init>	()V
    //   286: aload_1
    //   287: aload 10
    //   289: aload 5
    //   291: aload_3
    //   292: aload 4
    //   294: invokevirtual 305	r9/e:a	(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    //   297: astore 11
    //   299: getstatic 310	r9/a:a	Lr9/a;
    //   302: astore 10
    //   304: new 312	b1/v
    //   307: astore 12
    //   309: aload 12
    //   311: aload_1
    //   312: invokespecial 315	b1/v:<init>	(Ljava/lang/Object;)V
    //   315: aload 11
    //   317: aload 10
    //   319: aload 12
    //   321: invokevirtual 319	com/google/android/gms/tasks/Task:continueWith	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;
    //   324: astore 10
    //   326: aload_2
    //   327: getfield 322	com/google/firebase/iid/FirebaseInstanceId:a	Ljava/util/concurrent/Executor;
    //   330: astore 11
    //   332: new 324	z5/j
    //   335: astore_1
    //   336: aload_1
    //   337: aload_2
    //   338: aload 4
    //   340: aload 5
    //   342: aload_3
    //   343: invokespecial 326	z5/j:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   346: aload 10
    //   348: aload 11
    //   350: aload_1
    //   351: invokevirtual 330	com/google/android/gms/tasks/Task:onSuccessTask	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;
    //   354: astore_3
    //   355: getstatic 335	r9/d:a	Lr9/d;
    //   358: astore 4
    //   360: new 337	r4/c
    //   363: astore_1
    //   364: aload_1
    //   365: bipush 7
    //   367: aload_2
    //   368: aload 7
    //   370: invokespecial 340	r4/c:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   373: aload_3
    //   374: aload 4
    //   376: aload_1
    //   377: invokevirtual 344	com/google/android/gms/tasks/Task:addOnSuccessListener	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;
    //   380: astore_2
    //   381: aload 6
    //   383: getfield 345	r9/i:a	Ljava/util/concurrent/Executor;
    //   386: astore 7
    //   388: new 347	l/l
    //   391: astore_1
    //   392: aload_1
    //   393: bipush 7
    //   395: aload 6
    //   397: aload 8
    //   399: invokespecial 348	l/l:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   402: aload_2
    //   403: aload 7
    //   405: aload_1
    //   406: invokevirtual 351	com/google/android/gms/tasks/Task:continueWithTask	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;
    //   409: astore_1
    //   410: aload 6
    //   412: getfield 252	r9/i:b	Lr/b;
    //   415: aload 8
    //   417: aload_1
    //   418: invokevirtual 354	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   421: pop
    //   422: aload 6
    //   424: monitorexit
    //   425: aload_1
    //   426: areturn
    //   427: astore_1
    //   428: aload 6
    //   430: monitorexit
    //   431: aload_1
    //   432: athrow
    //   433: astore 6
    //   435: aload_1
    //   436: monitorexit
    //   437: aload 6
    //   439: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	this	j
    //   0	440	1	paramTask	com.google.android.gms.tasks.Task
    //   7	396	2	localObject1	Object
    //   15	359	3	localObject2	Object
    //   23	352	4	localObject3	Object
    //   29	312	5	str	String
    //   433	5	6	localObject5	Object
    //   64	340	7	localObject6	Object
    //   108	308	8	localObject7	Object
    //   159	78	9	i	int
    //   218	129	10	localObject8	Object
    //   297	52	11	localObject9	Object
    //   307	13	12	localv	b1.v
    // Exception table:
    //   from	to	target	type
    //   105	133	427	finally
    //   137	200	427	finally
    //   203	266	427	finally
    //   266	422	427	finally
    //   43	66	433	finally
  }
}

/* Location:
 * Qualified Name:     l3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */