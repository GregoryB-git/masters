package K4;

import M4.l;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c
{
  public static final F4.a g = ;
  public static final long h = TimeUnit.SECONDS.toMicros(1L);
  public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
  public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
  public final String c;
  public final long d;
  public ScheduledFuture e = null;
  public long f = -1L;
  
  public c()
  {
    int i = Process.myPid();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("/proc/");
    localStringBuilder.append(Integer.toString(i));
    localStringBuilder.append("/stat");
    c = localStringBuilder.toString();
    d = e();
  }
  
  public static boolean f(long paramLong)
  {
    boolean bool;
    if (paramLong <= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(l paraml)
  {
    i(paraml);
  }
  
  public final long d(long paramLong)
  {
    return Math.round(paramLong / d * h);
  }
  
  public final long e()
  {
    return Os.sysconf(OsConstants._SC_CLK_TCK);
  }
  
  /* Error */
  public final void i(l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 62	K4/c:b	Ljava/util/concurrent/ScheduledExecutorService;
    //   6: astore_2
    //   7: new 135	K4/b
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 137	K4/b:<init>	(LK4/c;LM4/l;)V
    //   17: aload_2
    //   18: aload_3
    //   19: lconst_0
    //   20: getstatic 140	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   23: invokeinterface 146 5 0
    //   28: pop
    //   29: goto +44 -> 73
    //   32: astore_1
    //   33: goto +43 -> 76
    //   36: astore_2
    //   37: getstatic 27	K4/c:g	LF4/a;
    //   40: astore_3
    //   41: new 70	java/lang/StringBuilder
    //   44: astore_1
    //   45: aload_1
    //   46: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   49: aload_1
    //   50: ldc -108
    //   52: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_1
    //   57: aload_2
    //   58: invokevirtual 153	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   61: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_3
    //   66: aload_1
    //   67: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokevirtual 157	F4/a:j	(Ljava/lang/String;)V
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	c
    //   0	80	1	paraml	l
    //   6	12	2	localScheduledExecutorService	ScheduledExecutorService
    //   36	22	2	localRejectedExecutionException	RejectedExecutionException
    //   10	56	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally
    //   37	73	32	finally
    //   2	29	36	java/util/concurrent/RejectedExecutionException
  }
  
  public final void j(long paramLong, l paraml)
  {
    try
    {
      f = paramLong;
    }
    finally
    {
      try
      {
        ScheduledExecutorService localScheduledExecutorService = b;
        localObject = new K4/a;
        ((a)localObject).<init>(this, paraml);
        e = localScheduledExecutorService.scheduleAtFixedRate((Runnable)localObject, 0L, paramLong, TimeUnit.MILLISECONDS);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        paraml = g;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Unable to start collecting Cpu Metrics: ");
        ((StringBuilder)localObject).append(localRejectedExecutionException.getMessage());
        paraml.j(((StringBuilder)localObject).toString());
        return;
      }
      paraml = finally;
    }
    throw paraml;
  }
  
  public void k(long paramLong, l paraml)
  {
    long l = d;
    if ((l != -1L) && (l != 0L))
    {
      if (f(paramLong)) {
        return;
      }
      if (e != null)
      {
        if (f != paramLong)
        {
          l();
          j(paramLong, paraml);
        }
        return;
      }
      j(paramLong, paraml);
    }
  }
  
  public void l()
  {
    ScheduledFuture localScheduledFuture = e;
    if (localScheduledFuture == null) {
      return;
    }
    localScheduledFuture.cancel(false);
    e = null;
    f = -1L;
  }
  
  /* Error */
  public final N4.e m(l paraml)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 191	java/io/BufferedReader
    //   9: astore_2
    //   10: new 193	java/io/FileReader
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: getfield 90	K4/c:c	Ljava/lang/String;
    //   19: invokespecial 195	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: aload_3
    //   24: invokespecial 198	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: aload_1
    //   28: invokevirtual 202	M4/l:b	()J
    //   31: lstore 4
    //   33: aload_2
    //   34: invokevirtual 205	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   37: ldc -49
    //   39: invokevirtual 213	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   42: astore_1
    //   43: aload_1
    //   44: bipush 13
    //   46: aaload
    //   47: invokestatic 219	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   50: lstore 6
    //   52: aload_1
    //   53: bipush 15
    //   55: aaload
    //   56: invokestatic 219	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   59: lstore 8
    //   61: aload_1
    //   62: bipush 14
    //   64: aaload
    //   65: invokestatic 219	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   68: lstore 10
    //   70: aload_1
    //   71: bipush 16
    //   73: aaload
    //   74: invokestatic 219	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   77: lstore 12
    //   79: invokestatic 225	N4/e:X	()LN4/e$b;
    //   82: lload 4
    //   84: invokevirtual 231	N4/e$b:D	(J)LN4/e$b;
    //   87: aload_0
    //   88: lload 10
    //   90: lload 12
    //   92: ladd
    //   93: invokevirtual 233	K4/c:d	(J)J
    //   96: invokevirtual 236	N4/e$b:E	(J)LN4/e$b;
    //   99: aload_0
    //   100: lload 6
    //   102: lload 8
    //   104: ladd
    //   105: invokevirtual 233	K4/c:d	(J)J
    //   108: invokevirtual 239	N4/e$b:F	(J)LN4/e$b;
    //   111: invokevirtual 245	com/google/protobuf/r$a:v	()Lcom/google/protobuf/r;
    //   114: checkcast 221	N4/e
    //   117: astore_1
    //   118: aload_2
    //   119: invokevirtual 248	java/io/BufferedReader:close	()V
    //   122: aload_1
    //   123: areturn
    //   124: astore_1
    //   125: goto +31 -> 156
    //   128: astore_1
    //   129: goto +27 -> 156
    //   132: astore_1
    //   133: goto +23 -> 156
    //   136: astore_3
    //   137: goto +68 -> 205
    //   140: astore_1
    //   141: aload_2
    //   142: invokevirtual 248	java/io/BufferedReader:close	()V
    //   145: goto +9 -> 154
    //   148: astore_2
    //   149: aload_1
    //   150: aload_2
    //   151: invokevirtual 252	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   154: aload_1
    //   155: athrow
    //   156: getstatic 27	K4/c:g	LF4/a;
    //   159: astore_2
    //   160: new 70	java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   167: astore 14
    //   169: ldc -2
    //   171: astore 15
    //   173: aload_1
    //   174: astore_3
    //   175: aload 14
    //   177: astore_1
    //   178: aload_1
    //   179: aload 15
    //   181: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload_1
    //   186: aload_3
    //   187: invokevirtual 153	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   190: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload_2
    //   195: aload_1
    //   196: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokevirtual 157	F4/a:j	(Ljava/lang/String;)V
    //   202: goto +23 -> 225
    //   205: getstatic 27	K4/c:g	LF4/a;
    //   208: astore_2
    //   209: new 70	java/lang/StringBuilder
    //   212: dup
    //   213: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   216: astore_1
    //   217: ldc_w 256
    //   220: astore 15
    //   222: goto -44 -> 178
    //   225: aconst_null
    //   226: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	c
    //   0	227	1	paraml	l
    //   9	133	2	localBufferedReader	java.io.BufferedReader
    //   148	3	2	localThrowable	Throwable
    //   159	50	2	locala	F4.a
    //   13	11	3	localFileReader	java.io.FileReader
    //   136	1	3	localIOException	java.io.IOException
    //   174	13	3	locall	l
    //   31	52	4	l1	long
    //   50	51	6	l2	long
    //   59	44	8	l3	long
    //   68	21	10	l4	long
    //   77	14	12	l5	long
    //   167	9	14	localStringBuilder	StringBuilder
    //   171	50	15	str	String
    // Exception table:
    //   from	to	target	type
    //   6	27	124	java/lang/NullPointerException
    //   118	122	124	java/lang/NullPointerException
    //   149	154	124	java/lang/NullPointerException
    //   154	156	124	java/lang/NullPointerException
    //   6	27	128	java/lang/NumberFormatException
    //   118	122	128	java/lang/NumberFormatException
    //   149	154	128	java/lang/NumberFormatException
    //   154	156	128	java/lang/NumberFormatException
    //   6	27	132	java/lang/ArrayIndexOutOfBoundsException
    //   118	122	132	java/lang/ArrayIndexOutOfBoundsException
    //   149	154	132	java/lang/ArrayIndexOutOfBoundsException
    //   154	156	132	java/lang/ArrayIndexOutOfBoundsException
    //   6	27	136	java/io/IOException
    //   118	122	136	java/io/IOException
    //   149	154	136	java/io/IOException
    //   154	156	136	java/io/IOException
    //   27	118	140	finally
    //   141	145	148	finally
  }
}

/* Location:
 * Qualified Name:     K4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */