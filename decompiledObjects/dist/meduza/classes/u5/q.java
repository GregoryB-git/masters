package u5;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import o7.x;
import y3.c;

public final class q
  implements a
{
  public static final HashSet<File> l = new HashSet();
  public final File a;
  public final d b;
  public final j c;
  public final f d;
  public final HashMap<String, ArrayList<a.b>> e;
  public final Random f;
  public final boolean g;
  public long h;
  public long i;
  public boolean j;
  public a.a k;
  
  public q(File paramFile, n paramn, c paramc)
  {
    try
    {
      boolean bool = l.add(paramFile.getAbsoluteFile());
      if (bool)
      {
        a = paramFile;
        b = paramn;
        c = localj;
        d = paramc;
        e = new HashMap();
        f = new Random();
        g = true;
        h = -1L;
        paramFile = new ConditionVariable();
        new p(this, paramFile).start();
        paramFile.block();
        return;
      }
      paramn = new StringBuilder();
      paramn.append("Another SimpleCache instance uses the folder: ");
      paramn.append(paramFile);
      throw new IllegalStateException(paramn.toString());
    }
    finally {}
  }
  
  public static void l(q paramq)
  {
    if (!a.exists()) {
      try
      {
        n(a);
      }
      catch (a.a locala1)
      {
        k = locala1;
        return;
      }
    }
    Object localObject1 = a.listFiles();
    if (localObject1 == null)
    {
      localObject1 = f.l("Failed to list cache directory files: ");
      ((StringBuilder)localObject1).append(a);
      localObject1 = ((StringBuilder)localObject1).toString();
      v5.m.c("SimpleCache", (String)localObject1);
      localObject1 = new a.a((String)localObject1);
    }
    else
    {
      int m = localObject1.length;
      Object localObject3;
      for (int n = 0; n < m; n++)
      {
        localObject3 = localObject1[n];
        String str = ((File)localObject3).getName();
        if (str.endsWith(".uid")) {
          try
          {
            l1 = Long.parseLong(str.substring(0, str.indexOf('.')), 16);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Malformed UID file: ");
            localStringBuilder.append(localObject3);
            v5.m.c("SimpleCache", localStringBuilder.toString());
            ((File)localObject3).delete();
          }
        }
      }
      long l1 = -1L;
      h = l1;
      Object localObject2;
      if (l1 == -1L) {
        try
        {
          h = o(a);
        }
        catch (IOException localIOException1)
        {
          localObject3 = f.l("Failed to create cache UID: ");
          ((StringBuilder)localObject3).append(a);
          localObject3 = ((StringBuilder)localObject3).toString();
          v5.m.d("SimpleCache", (String)localObject3, localIOException1);
          localObject2 = new a.a((String)localObject3, localIOException1);
          break label455;
        }
      }
      try
      {
        c.e(h);
        localObject3 = d;
        if (localObject3 != null)
        {
          ((f)localObject3).b(h);
          localObject3 = d.a();
          paramq.p(a, true, (File[])localObject2, (HashMap)localObject3);
          d.c(((HashMap)localObject3).keySet());
        }
        else
        {
          paramq.p(a, true, (File[])localObject2, null);
        }
        localObject3 = c;
        localObject2 = x.q(a.keySet()).n();
        while (((Iterator)localObject2).hasNext()) {
          ((j)localObject3).f((String)((Iterator)localObject2).next());
        }
        try
        {
          c.g();
        }
        catch (IOException paramq)
        {
          v5.m.d("SimpleCache", "Storing index file failed", paramq);
        }
        a.a locala2;
        k = locala2;
      }
      catch (IOException localIOException2)
      {
        localObject3 = f.l("Failed to initialize cache indices: ");
        ((StringBuilder)localObject3).append(a);
        localObject3 = ((StringBuilder)localObject3).toString();
        v5.m.d("SimpleCache", (String)localObject3, localIOException2);
        locala2 = new a.a((String)localObject3, localIOException2);
      }
    }
    label455:
  }
  
  public static void n(File paramFile)
  {
    if ((!paramFile.mkdirs()) && (!paramFile.isDirectory()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to create cache directory: ");
      localStringBuilder.append(paramFile);
      paramFile = localStringBuilder.toString();
      v5.m.c("SimpleCache", paramFile);
      throw new a.a(paramFile);
    }
  }
  
  public static long o(File paramFile)
  {
    long l1 = new SecureRandom().nextLong();
    if (l1 == Long.MIN_VALUE) {
      l1 = 0L;
    } else {
      l1 = Math.abs(l1);
    }
    paramFile = new File(paramFile, g.d(Long.toString(l1, 16), ".uid"));
    if (paramFile.createNewFile()) {
      return l1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failed to create UID file: ");
    localStringBuilder.append(paramFile);
    throw new IOException(localStringBuilder.toString());
  }
  
  public static void u(File paramFile)
  {
    try
    {
      l.remove(paramFile.getAbsoluteFile());
      return;
    }
    finally
    {
      paramFile = finally;
      throw paramFile;
    }
  }
  
  /* Error */
  public final r a(long paramLong1, long paramLong2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: ifne +9 -> 15
    //   9: iconst_1
    //   10: istore 6
    //   12: goto +6 -> 18
    //   15: iconst_0
    //   16: istore 6
    //   18: iload 6
    //   20: invokestatic 300	x6/b:H	(Z)V
    //   23: aload_0
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 140	u5/q:k	Lu5/a$a;
    //   29: astore 7
    //   31: aload 7
    //   33: ifnonnull +295 -> 328
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_0
    //   39: getfield 68	u5/q:c	Lu5/j;
    //   42: aload 5
    //   44: invokevirtual 303	u5/j:c	(Ljava/lang/String;)Lu5/i;
    //   47: astore 8
    //   49: aload 8
    //   51: ifnonnull +24 -> 75
    //   54: new 305	u5/r
    //   57: astore 7
    //   59: aload 7
    //   61: aload 5
    //   63: lload_1
    //   64: lload_3
    //   65: ldc2_w 306
    //   68: aconst_null
    //   69: invokespecial 310	u5/r:<init>	(Ljava/lang/String;JJJLjava/io/File;)V
    //   72: goto +52 -> 124
    //   75: aload 8
    //   77: lload_1
    //   78: lload_3
    //   79: invokevirtual 315	u5/i:b	(JJ)Lu5/r;
    //   82: astore 9
    //   84: aload 9
    //   86: astore 7
    //   88: aload 9
    //   90: getfield 319	u5/g:d	Z
    //   93: ifeq +31 -> 124
    //   96: aload 9
    //   98: astore 7
    //   100: aload 9
    //   102: getfield 321	u5/g:e	Ljava/io/File;
    //   105: invokevirtual 324	java/io/File:length	()J
    //   108: aload 9
    //   110: getfield 326	u5/g:c	J
    //   113: lcmp
    //   114: ifeq +10 -> 124
    //   117: aload_0
    //   118: invokevirtual 329	u5/q:s	()V
    //   121: goto -46 -> 75
    //   124: aload 7
    //   126: getfield 319	u5/g:d	Z
    //   129: ifeq +18 -> 147
    //   132: aload_0
    //   133: aload 5
    //   135: aload 7
    //   137: invokevirtual 333	u5/q:t	(Ljava/lang/String;Lu5/r;)Lu5/r;
    //   140: astore 5
    //   142: aload_0
    //   143: monitorexit
    //   144: aload 5
    //   146: areturn
    //   147: aload_0
    //   148: getfield 68	u5/q:c	Lu5/j;
    //   151: aload 5
    //   153: invokevirtual 335	u5/j:d	(Ljava/lang/String;)Lu5/i;
    //   156: astore 5
    //   158: aload 7
    //   160: getfield 326	u5/g:c	J
    //   163: lstore_3
    //   164: iconst_0
    //   165: istore 10
    //   167: iload 10
    //   169: aload 5
    //   171: getfield 338	u5/i:d	Ljava/util/ArrayList;
    //   174: invokevirtual 344	java/util/ArrayList:size	()I
    //   177: if_icmpge +107 -> 284
    //   180: aload 5
    //   182: getfield 338	u5/i:d	Ljava/util/ArrayList;
    //   185: iload 10
    //   187: invokevirtual 348	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   190: checkcast 350	u5/i$a
    //   193: astore 9
    //   195: aload 9
    //   197: getfield 352	u5/i$a:a	J
    //   200: lstore 11
    //   202: lload 11
    //   204: lload_1
    //   205: lcmp
    //   206: ifgt +32 -> 238
    //   209: aload 9
    //   211: getfield 354	u5/i$a:b	J
    //   214: lstore 13
    //   216: lload 13
    //   218: ldc2_w 83
    //   221: lcmp
    //   222: ifeq +42 -> 264
    //   225: lload 11
    //   227: lload 13
    //   229: ladd
    //   230: lload_1
    //   231: lcmp
    //   232: ifle +26 -> 258
    //   235: goto +29 -> 264
    //   238: lload_3
    //   239: ldc2_w 83
    //   242: lcmp
    //   243: ifeq +21 -> 264
    //   246: lload_1
    //   247: lload_3
    //   248: ladd
    //   249: lload 11
    //   251: lcmp
    //   252: ifle +6 -> 258
    //   255: goto +9 -> 264
    //   258: iconst_0
    //   259: istore 15
    //   261: goto +6 -> 267
    //   264: iconst_1
    //   265: istore 15
    //   267: iload 15
    //   269: ifeq +9 -> 278
    //   272: iconst_0
    //   273: istore 10
    //   275: goto +39 -> 314
    //   278: iinc 10 1
    //   281: goto -114 -> 167
    //   284: aload 5
    //   286: getfield 338	u5/i:d	Ljava/util/ArrayList;
    //   289: astore 5
    //   291: new 350	u5/i$a
    //   294: astore 9
    //   296: aload 9
    //   298: lload_1
    //   299: lload_3
    //   300: invokespecial 357	u5/i$a:<init>	(JJ)V
    //   303: aload 5
    //   305: aload 9
    //   307: invokevirtual 358	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   310: pop
    //   311: iconst_1
    //   312: istore 10
    //   314: iload 10
    //   316: ifeq +8 -> 324
    //   319: aload_0
    //   320: monitorexit
    //   321: aload 7
    //   323: areturn
    //   324: aload_0
    //   325: monitorexit
    //   326: aconst_null
    //   327: areturn
    //   328: aload 7
    //   330: athrow
    //   331: astore 5
    //   333: aload_0
    //   334: monitorexit
    //   335: aload 5
    //   337: athrow
    //   338: astore 5
    //   340: aload_0
    //   341: monitorexit
    //   342: aload 5
    //   344: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	q
    //   0	345	1	paramLong1	long
    //   0	345	3	paramLong2	long
    //   0	345	5	paramString	String
    //   10	9	6	bool	boolean
    //   29	300	7	localObject1	Object
    //   47	29	8	locali	i
    //   82	224	9	localObject2	Object
    //   165	150	10	m	int
    //   200	50	11	l1	long
    //   214	14	13	l2	long
    //   259	9	15	n	int
    // Exception table:
    //   from	to	target	type
    //   25	31	331	finally
    //   328	331	331	finally
    //   2	9	338	finally
    //   18	25	338	finally
    //   36	49	338	finally
    //   54	72	338	finally
    //   75	84	338	finally
    //   88	96	338	finally
    //   100	121	338	finally
    //   124	142	338	finally
    //   147	164	338	finally
    //   167	202	338	finally
    //   209	216	338	finally
    //   284	311	338	finally
    //   333	338	338	finally
  }
  
  public final void b(g paramg)
  {
    try
    {
      boolean bool = j;
      int m = 0;
      if (!bool) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      i locali = c.c(a);
      locali.getClass();
      long l1 = b;
      while (m < d.size())
      {
        if (d.get(m)).a == l1)
        {
          d.remove(m);
          c.f(b);
          notifyAll();
          return;
        }
        m++;
      }
      paramg = new java/lang/IllegalStateException;
      paramg.<init>();
      throw paramg;
    }
    finally {}
  }
  
  public final m c(String paramString)
  {
    try
    {
      boolean bool;
      if (!j) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      paramString = c.c(paramString);
      if (paramString != null) {
        paramString = e;
      } else {
        paramString = m.c;
      }
      return paramString;
    }
    finally {}
  }
  
  public final long d(long paramLong1, long paramLong2, String paramString)
  {
    if (paramLong2 == -1L) {
      paramLong2 = Long.MAX_VALUE;
    } else {
      paramLong2 = paramLong1 + paramLong2;
    }
    if (paramLong2 < 0L) {
      paramLong2 = Long.MAX_VALUE;
    }
    long l1 = 0L;
    for (;;)
    {
      if (paramLong1 < paramLong2) {}
      try
      {
        long l2 = j(paramLong1, paramLong2 - paramLong1, paramString);
        if (l2 > 0L) {
          l1 += l2;
        } else {
          l2 = -l2;
        }
        paramLong1 += l2;
      }
      finally {}
    }
    return l1;
  }
  
  /* Error */
  public final File e(long paramLong1, long paramLong2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: ifne +9 -> 15
    //   9: iconst_1
    //   10: istore 6
    //   12: goto +6 -> 18
    //   15: iconst_0
    //   16: istore 6
    //   18: iload 6
    //   20: invokestatic 300	x6/b:H	(Z)V
    //   23: aload_0
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 140	u5/q:k	Lu5/a$a;
    //   29: astore 7
    //   31: aload 7
    //   33: ifnonnull +126 -> 159
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_0
    //   39: getfield 68	u5/q:c	Lu5/j;
    //   42: aload 5
    //   44: invokevirtual 303	u5/j:c	(Ljava/lang/String;)Lu5/i;
    //   47: astore 5
    //   49: aload 5
    //   51: invokevirtual 366	java/lang/Object:getClass	()Ljava/lang/Class;
    //   54: pop
    //   55: aload 5
    //   57: lload_1
    //   58: lload_3
    //   59: invokevirtual 392	u5/i:c	(JJ)Z
    //   62: invokestatic 300	x6/b:H	(Z)V
    //   65: aload_0
    //   66: getfield 64	u5/q:a	Ljava/io/File;
    //   69: invokevirtual 134	java/io/File:exists	()Z
    //   72: ifne +14 -> 86
    //   75: aload_0
    //   76: getfield 64	u5/q:a	Ljava/io/File;
    //   79: invokestatic 138	u5/q:n	(Ljava/io/File;)V
    //   82: aload_0
    //   83: invokevirtual 329	u5/q:s	()V
    //   86: aload_0
    //   87: getfield 66	u5/q:b	Lu5/d;
    //   90: aload_0
    //   91: lload_3
    //   92: invokeinterface 397 4 0
    //   97: new 54	java/io/File
    //   100: astore 7
    //   102: aload 7
    //   104: aload_0
    //   105: getfield 64	u5/q:a	Ljava/io/File;
    //   108: aload_0
    //   109: getfield 80	u5/q:f	Ljava/util/Random;
    //   112: bipush 10
    //   114: invokevirtual 400	java/util/Random:nextInt	(I)I
    //   117: invokestatic 405	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   120: invokespecial 281	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   123: aload 7
    //   125: invokevirtual 134	java/io/File:exists	()Z
    //   128: ifne +8 -> 136
    //   131: aload 7
    //   133: invokestatic 138	u5/q:n	(Ljava/io/File;)V
    //   136: invokestatic 410	java/lang/System:currentTimeMillis	()J
    //   139: lstore_3
    //   140: aload 7
    //   142: aload 5
    //   144: getfield 413	u5/i:a	I
    //   147: lload_1
    //   148: lload_3
    //   149: invokestatic 416	u5/r:h	(Ljava/io/File;IJJ)Ljava/io/File;
    //   152: astore 5
    //   154: aload_0
    //   155: monitorexit
    //   156: aload 5
    //   158: areturn
    //   159: aload 7
    //   161: athrow
    //   162: astore 5
    //   164: aload_0
    //   165: monitorexit
    //   166: aload 5
    //   168: athrow
    //   169: astore 5
    //   171: aload_0
    //   172: monitorexit
    //   173: aload 5
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	q
    //   0	176	1	paramLong1	long
    //   0	176	3	paramLong2	long
    //   0	176	5	paramString	String
    //   10	9	6	bool	boolean
    //   29	131	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   25	31	162	finally
    //   159	162	162	finally
    //   2	9	169	finally
    //   18	25	169	finally
    //   36	86	169	finally
    //   86	136	169	finally
    //   136	154	169	finally
    //   164	169	169	finally
  }
  
  /* Error */
  public final void f(String paramString, l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: ifne +8 -> 14
    //   9: iconst_1
    //   10: istore_3
    //   11: goto +5 -> 16
    //   14: iconst_0
    //   15: istore_3
    //   16: iload_3
    //   17: invokestatic 300	x6/b:H	(Z)V
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield 140	u5/q:k	Lu5/a$a;
    //   26: astore 4
    //   28: aload 4
    //   30: ifnonnull +81 -> 111
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_0
    //   36: getfield 68	u5/q:c	Lu5/j;
    //   39: astore 4
    //   41: aload 4
    //   43: aload_1
    //   44: invokevirtual 335	u5/j:d	(Ljava/lang/String;)Lu5/i;
    //   47: astore 5
    //   49: aload 5
    //   51: getfield 379	u5/i:e	Lu5/m;
    //   54: astore_1
    //   55: aload_1
    //   56: aload_2
    //   57: invokevirtual 420	u5/m:a	(Lu5/l;)Lu5/m;
    //   60: astore_2
    //   61: aload 5
    //   63: aload_2
    //   64: putfield 379	u5/i:e	Lu5/m;
    //   67: aload_2
    //   68: aload_1
    //   69: invokevirtual 423	u5/m:equals	(Ljava/lang/Object;)Z
    //   72: iconst_1
    //   73: ixor
    //   74: ifeq +15 -> 89
    //   77: aload 4
    //   79: getfield 426	u5/j:e	Lu5/j$c;
    //   82: aload 5
    //   84: invokeinterface 431 2 0
    //   89: aload_0
    //   90: getfield 68	u5/q:c	Lu5/j;
    //   93: invokevirtual 244	u5/j:g	()V
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: astore_1
    //   100: new 126	u5/a$a
    //   103: astore_2
    //   104: aload_2
    //   105: aload_1
    //   106: invokespecial 434	u5/a$a:<init>	(Ljava/lang/Throwable;)V
    //   109: aload_2
    //   110: athrow
    //   111: aload 4
    //   113: athrow
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    //   119: astore_1
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	q
    //   0	124	1	paramString	String
    //   0	124	2	paraml	l
    //   10	7	3	bool	boolean
    //   26	86	4	localObject	Object
    //   47	36	5	locali	i
    // Exception table:
    //   from	to	target	type
    //   89	96	99	java/io/IOException
    //   22	28	114	finally
    //   111	114	114	finally
    //   2	9	119	finally
    //   16	22	119	finally
    //   33	89	119	finally
    //   89	96	119	finally
    //   100	111	119	finally
    //   115	119	119	finally
  }
  
  public final void g(g paramg)
  {
    try
    {
      boolean bool;
      if (!j) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      r(paramg);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void h(File paramFile, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: istore 4
    //   8: iconst_1
    //   9: istore 5
    //   11: iload 4
    //   13: ifne +9 -> 22
    //   16: iconst_1
    //   17: istore 4
    //   19: goto +6 -> 25
    //   22: iconst_0
    //   23: istore 4
    //   25: iload 4
    //   27: invokestatic 300	x6/b:H	(Z)V
    //   30: aload_1
    //   31: invokevirtual 134	java/io/File:exists	()Z
    //   34: istore 4
    //   36: iload 4
    //   38: ifne +6 -> 44
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: lload_2
    //   45: lconst_0
    //   46: lcmp
    //   47: ifne +11 -> 58
    //   50: aload_1
    //   51: invokevirtual 187	java/io/File:delete	()Z
    //   54: pop
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: aload_1
    //   59: lload_2
    //   60: ldc2_w 306
    //   63: aload_0
    //   64: getfield 68	u5/q:c	Lu5/j;
    //   67: invokestatic 441	u5/r:g	(Ljava/io/File;JJLu5/j;)Lu5/r;
    //   70: astore 6
    //   72: aload 6
    //   74: invokevirtual 366	java/lang/Object:getClass	()Ljava/lang/Class;
    //   77: pop
    //   78: aload_0
    //   79: getfield 68	u5/q:c	Lu5/j;
    //   82: aload 6
    //   84: getfield 362	u5/g:a	Ljava/lang/String;
    //   87: invokevirtual 303	u5/j:c	(Ljava/lang/String;)Lu5/i;
    //   90: astore 7
    //   92: aload 7
    //   94: invokevirtual 366	java/lang/Object:getClass	()Ljava/lang/Class;
    //   97: pop
    //   98: aload 7
    //   100: aload 6
    //   102: getfield 367	u5/g:b	J
    //   105: aload 6
    //   107: getfield 326	u5/g:c	J
    //   110: invokevirtual 392	u5/i:c	(JJ)Z
    //   113: invokestatic 300	x6/b:H	(Z)V
    //   116: aload 7
    //   118: getfield 379	u5/i:e	Lu5/m;
    //   121: invokestatic 444	f:d	(Lu5/k;)J
    //   124: lstore_2
    //   125: lload_2
    //   126: ldc2_w 83
    //   129: lcmp
    //   130: ifeq +34 -> 164
    //   133: aload 6
    //   135: getfield 367	u5/g:b	J
    //   138: aload 6
    //   140: getfield 326	u5/g:c	J
    //   143: ladd
    //   144: lload_2
    //   145: lcmp
    //   146: ifgt +10 -> 156
    //   149: iload 5
    //   151: istore 4
    //   153: goto +6 -> 159
    //   156: iconst_0
    //   157: istore 4
    //   159: iload 4
    //   161: invokestatic 300	x6/b:H	(Z)V
    //   164: aload_0
    //   165: getfield 70	u5/q:d	Lu5/f;
    //   168: ifnull +43 -> 211
    //   171: aload_1
    //   172: invokevirtual 160	java/io/File:getName	()Ljava/lang/String;
    //   175: astore_1
    //   176: aload_0
    //   177: getfield 70	u5/q:d	Lu5/f;
    //   180: aload 6
    //   182: getfield 326	u5/g:c	J
    //   185: aload 6
    //   187: getfield 446	u5/g:f	J
    //   190: aload_1
    //   191: invokevirtual 449	u5/f:d	(JJLjava/lang/String;)V
    //   194: goto +17 -> 211
    //   197: astore 6
    //   199: new 126	u5/a$a
    //   202: astore_1
    //   203: aload_1
    //   204: aload 6
    //   206: invokespecial 434	u5/a$a:<init>	(Ljava/lang/Throwable;)V
    //   209: aload_1
    //   210: athrow
    //   211: aload_0
    //   212: aload 6
    //   214: invokevirtual 453	u5/q:m	(Lu5/r;)V
    //   217: aload_0
    //   218: getfield 68	u5/q:c	Lu5/j;
    //   221: invokevirtual 244	u5/j:g	()V
    //   224: aload_0
    //   225: invokevirtual 374	java/lang/Object:notifyAll	()V
    //   228: aload_0
    //   229: monitorexit
    //   230: return
    //   231: astore_1
    //   232: new 126	u5/a$a
    //   235: astore 6
    //   237: aload 6
    //   239: aload_1
    //   240: invokespecial 434	u5/a$a:<init>	(Ljava/lang/Throwable;)V
    //   243: aload 6
    //   245: athrow
    //   246: astore_1
    //   247: aload_0
    //   248: monitorexit
    //   249: aload_1
    //   250: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	q
    //   0	251	1	paramFile	File
    //   0	251	2	paramLong	long
    //   6	154	4	bool1	boolean
    //   9	141	5	bool2	boolean
    //   70	116	6	localr	r
    //   197	16	6	localIOException	IOException
    //   235	9	6	locala	a.a
    //   90	27	7	locali	i
    // Exception table:
    //   from	to	target	type
    //   176	194	197	java/io/IOException
    //   217	224	231	java/io/IOException
    //   2	8	246	finally
    //   25	36	246	finally
    //   50	55	246	finally
    //   58	125	246	finally
    //   133	149	246	finally
    //   159	164	246	finally
    //   164	176	246	finally
    //   176	194	246	finally
    //   199	211	246	finally
    //   211	217	246	finally
    //   217	224	246	finally
    //   224	228	246	finally
    //   232	246	246	finally
  }
  
  public final long i()
  {
    try
    {
      boolean bool;
      if (!j) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      long l1 = i;
      return l1;
    }
    finally {}
  }
  
  public final long j(long paramLong1, long paramLong2, String paramString)
  {
    try
    {
      boolean bool;
      if (!j) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      long l1 = paramLong2;
      if (paramLong2 == -1L) {
        l1 = Long.MAX_VALUE;
      }
      paramString = c.c(paramString);
      if (paramString != null) {
        paramLong1 = paramString.a(paramLong1, l1);
      } else {
        paramLong1 = -l1;
      }
      return paramLong1;
    }
    finally {}
  }
  
  /* Error */
  public final r k(long paramLong1, long paramLong2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: ifne +9 -> 15
    //   9: iconst_1
    //   10: istore 6
    //   12: goto +6 -> 18
    //   15: iconst_0
    //   16: istore 6
    //   18: iload 6
    //   20: invokestatic 300	x6/b:H	(Z)V
    //   23: aload_0
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 140	u5/q:k	Lu5/a$a;
    //   29: astore 7
    //   31: aload 7
    //   33: ifnonnull +32 -> 65
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_0
    //   39: lload_1
    //   40: lload_3
    //   41: aload 5
    //   43: invokevirtual 460	u5/q:a	(JJLjava/lang/String;)Lu5/r;
    //   46: astore 7
    //   48: aload 7
    //   50: ifnull +8 -> 58
    //   53: aload_0
    //   54: monitorexit
    //   55: aload 7
    //   57: areturn
    //   58: aload_0
    //   59: invokevirtual 463	java/lang/Object:wait	()V
    //   62: goto -24 -> 38
    //   65: aload 7
    //   67: athrow
    //   68: astore 5
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 5
    //   74: athrow
    //   75: astore 5
    //   77: aload_0
    //   78: monitorexit
    //   79: aload 5
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	q
    //   0	82	1	paramLong1	long
    //   0	82	3	paramLong2	long
    //   0	82	5	paramString	String
    //   10	9	6	bool	boolean
    //   29	37	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   25	31	68	finally
    //   65	68	68	finally
    //   2	9	75	finally
    //   18	25	75	finally
    //   36	38	75	finally
    //   38	48	75	finally
    //   58	62	75	finally
    //   70	75	75	finally
  }
  
  public final void m(r paramr)
  {
    c.d(a).c.add(paramr);
    i += c;
    ArrayList localArrayList = (ArrayList)e.get(a);
    if (localArrayList != null)
    {
      int m = localArrayList.size();
      for (;;)
      {
        m--;
        if (m < 0) {
          break;
        }
        ((a.b)localArrayList.get(m)).d(this, paramr);
      }
    }
    b.d(this, paramr);
  }
  
  public final void p(File paramFile, boolean paramBoolean, File[] paramArrayOfFile, HashMap paramHashMap)
  {
    if ((paramArrayOfFile != null) && (paramArrayOfFile.length != 0))
    {
      int m = paramArrayOfFile.length;
      for (int n = 0; n < m; n++)
      {
        File localFile = paramArrayOfFile[n];
        paramFile = localFile.getName();
        if ((paramBoolean) && (paramFile.indexOf('.') == -1))
        {
          p(localFile, false, localFile.listFiles(), paramHashMap);
        }
        else if ((!paramBoolean) || ((!paramFile.startsWith("cached_content_index.exi")) && (!paramFile.endsWith(".uid"))))
        {
          long l1 = -1L;
          long l2 = -9223372036854775807L;
          if (paramHashMap != null) {
            paramFile = (e)paramHashMap.remove(paramFile);
          } else {
            paramFile = null;
          }
          if (paramFile != null)
          {
            l1 = a;
            l2 = b;
          }
          paramFile = r.g(localFile, l1, l2, c);
          if (paramFile != null) {
            m(paramFile);
          } else {
            localFile.delete();
          }
        }
      }
      return;
    }
    if (!paramBoolean) {
      paramFile.delete();
    }
  }
  
  /* Error */
  public final void q()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 294	u5/q:j	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 75	u5/q:e	Ljava/util/HashMap;
    //   18: invokevirtual 491	java/util/HashMap:clear	()V
    //   21: aload_0
    //   22: invokevirtual 329	u5/q:s	()V
    //   25: aload_0
    //   26: getfield 68	u5/q:c	Lu5/j;
    //   29: invokevirtual 244	u5/j:g	()V
    //   32: aload_0
    //   33: getfield 64	u5/q:a	Ljava/io/File;
    //   36: invokestatic 493	u5/q:u	(Ljava/io/File;)V
    //   39: aload_0
    //   40: iconst_1
    //   41: putfield 294	u5/q:j	Z
    //   44: goto +26 -> 70
    //   47: astore_2
    //   48: goto +25 -> 73
    //   51: astore_2
    //   52: ldc -105
    //   54: ldc -10
    //   56: aload_2
    //   57: invokestatic 196	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   60: aload_0
    //   61: getfield 64	u5/q:a	Ljava/io/File;
    //   64: invokestatic 493	u5/q:u	(Ljava/io/File;)V
    //   67: goto -28 -> 39
    //   70: aload_0
    //   71: monitorexit
    //   72: return
    //   73: aload_0
    //   74: getfield 64	u5/q:a	Ljava/io/File;
    //   77: invokestatic 493	u5/q:u	(Ljava/io/File;)V
    //   80: aload_0
    //   81: iconst_1
    //   82: putfield 294	u5/q:j	Z
    //   85: aload_2
    //   86: athrow
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	q
    //   6	2	1	bool	boolean
    //   47	1	2	localObject1	Object
    //   51	35	2	localIOException	IOException
    //   87	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   25	32	47	finally
    //   52	60	47	finally
    //   25	32	51	java/io/IOException
    //   2	7	87	finally
    //   14	25	87	finally
    //   32	39	87	finally
    //   39	44	87	finally
    //   60	67	87	finally
    //   73	87	87	finally
  }
  
  public final void r(g paramg)
  {
    Object localObject1 = c.c(a);
    if (localObject1 != null)
    {
      Object localObject2;
      int m;
      if (c.remove(paramg))
      {
        localObject2 = e;
        if (localObject2 != null) {
          ((File)localObject2).delete();
        }
        m = 1;
      }
      else
      {
        m = 0;
      }
      if (m != 0)
      {
        i -= c;
        if (d != null)
        {
          localObject2 = e.getName();
          try
          {
            Object localObject3 = d;
            b.getClass();
            try
            {
              a.getWritableDatabase().delete(b, "name = ?", new String[] { localObject2 });
            }
            catch (SQLException localSQLException)
            {
              localObject3 = new y3/a;
              ((y3.a)localObject3).<init>(localSQLException);
              throw ((Throwable)localObject3);
            }
            StringBuilder localStringBuilder;
            c.f(b);
          }
          catch (IOException localIOException)
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("Failed to remove file index entry for: ");
            localStringBuilder.append((String)localObject2);
            v5.m.f("SimpleCache", localStringBuilder.toString());
          }
        }
        localObject1 = (ArrayList)e.get(a);
        if (localObject1 != null)
        {
          m = ((ArrayList)localObject1).size();
          for (;;)
          {
            m--;
            if (m < 0) {
              break;
            }
            ((a.b)((ArrayList)localObject1).get(m)).a(paramg);
          }
        }
        b.a(paramg);
      }
    }
  }
  
  public final void s()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = Collections.unmodifiableCollection(c.a.values()).iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = nextc.iterator();
      while (localIterator2.hasNext())
      {
        g localg = (g)localIterator2.next();
        if (e.length() != c) {
          localArrayList.add(localg);
        }
      }
    }
    for (int m = 0; m < localArrayList.size(); m++) {
      r((g)localArrayList.get(m));
    }
  }
  
  public final r t(String paramString, r paramr)
  {
    if (!g) {
      return paramr;
    }
    Object localObject1 = e;
    localObject1.getClass();
    Object localObject3 = ((File)localObject1).getName();
    long l1 = c;
    long l2 = System.currentTimeMillis();
    int m = 0;
    localObject1 = d;
    if (localObject1 != null) {
      try
      {
        ((f)localObject1).d(l1, l2, (String)localObject3);
      }
      catch (IOException localIOException)
      {
        v5.m.f("SimpleCache", "Failed to update index with new touch timestamp.");
      }
    } else {
      m = 1;
    }
    localObject3 = c.c(paramString);
    x6.b.H(c.remove(paramr));
    paramString = e;
    paramString.getClass();
    if (m != 0)
    {
      localObject2 = paramString.getParentFile();
      localObject2.getClass();
      l1 = b;
      localObject2 = r.h((File)localObject2, a, l1, l2);
      if (paramString.renameTo((File)localObject2))
      {
        paramString = (String)localObject2;
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to rename ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" to ");
        localStringBuilder.append(localObject2);
        v5.m.f("CachedContent", localStringBuilder.toString());
      }
    }
    x6.b.H(d);
    paramString = new r(a, b, c, l2, paramString);
    c.add(paramString);
    Object localObject2 = (ArrayList)e.get(a);
    if (localObject2 != null)
    {
      m = ((ArrayList)localObject2).size();
      for (;;)
      {
        m--;
        if (m < 0) {
          break;
        }
        ((a.b)((ArrayList)localObject2).get(m)).e(this, paramr, paramString);
      }
    }
    b.e(this, paramr, paramString);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     u5.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */