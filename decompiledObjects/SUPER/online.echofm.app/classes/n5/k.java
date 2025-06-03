package n5;

import E5.k.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k
{
  public static Boolean n;
  public final boolean a;
  public final String b;
  public final int c;
  public final int d;
  public final Context e;
  public final List f = new ArrayList();
  public final Map g = new HashMap();
  public q h;
  public SQLiteDatabase i;
  public int j = 0;
  public int k = 0;
  public Integer l;
  public int m = 0;
  
  public k(Context paramContext, String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    e = paramContext;
    b = paramString;
    a = paramBoolean;
    c = paramInt1;
    d = paramInt2;
  }
  
  public static boolean i(Context paramContext, String paramString, boolean paramBoolean)
  {
    String str;
    try
    {
      str = paramContext.getPackageName();
      if (Build.VERSION.SDK_INT >= 33) {
        paramContext = c.a(paramContext.getPackageManager(), str, b.a(128L));
      }
    }
    catch (Exception paramContext)
    {
      break label60;
    }
    paramContext = y(paramContext, str, 128);
    paramBoolean = metaData.getBoolean(paramString, paramBoolean);
    if (paramBoolean)
    {
      return true;
      label60:
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean j(Context paramContext)
  {
    return i(paramContext, "com.tekartik.sqflite.wal_enabled", false);
  }
  
  public static void o(String paramString)
  {
    SQLiteDatabase.deleteDatabase(new File(paramString));
  }
  
  public static boolean x(String paramString)
  {
    boolean bool;
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
    }
    catch (Exception paramString)
    {
      bool = false;
    }
    return bool;
  }
  
  public static ApplicationInfo y(Context paramContext, String paramString, int paramInt)
  {
    return paramContext.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public String A()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append(B());
    localStringBuilder.append("] ");
    return localStringBuilder.toString();
  }
  
  public String B()
  {
    Thread localThread = Thread.currentThread();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("");
    localStringBuilder.append(c);
    localStringBuilder.append(",");
    localStringBuilder.append(localThread.getName());
    localStringBuilder.append("(");
    localStringBuilder.append(localThread.getId());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public SQLiteDatabase C()
  {
    return i;
  }
  
  public void D(Exception paramException, p5.e parame)
  {
    String str;
    if ((paramException instanceof SQLiteCantOpenDatabaseException))
    {
      paramException = new StringBuilder();
      paramException.append("open_failed ");
      paramException.append(b);
      str = paramException.toString();
    }
    for (paramException = null;; paramException = p5.h.a(parame))
    {
      parame.b("sqlite_error", str, paramException);
      return;
      boolean bool = paramException instanceof SQLException;
      str = paramException.getMessage();
    }
  }
  
  public void E(p5.e parame)
  {
    S(parame, new g(this, parame));
  }
  
  public boolean F()
  {
    try
    {
      int i1 = j;
      boolean bool;
      if (i1 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void M()
  {
    if (n == null)
    {
      Object localObject = Boolean.valueOf(j(e));
      n = (Boolean)localObject;
      if ((((Boolean)localObject).booleanValue()) && (t.c(d)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(A());
        ((StringBuilder)localObject).append("[sqflite] WAL enabled");
        Log.d("Sqflite", ((StringBuilder)localObject).toString());
      }
    }
    int i1;
    if (n.booleanValue()) {
      i1 = 805306368;
    } else {
      i1 = 268435456;
    }
    i = SQLiteDatabase.openDatabase(b, null, i1);
  }
  
  public void N()
  {
    i = SQLiteDatabase.openDatabase(b, null, 1, new a());
  }
  
  public void O(p5.e parame)
  {
    S(parame, new e(this, parame));
  }
  
  public void P(p5.e parame)
  {
    S(parame, new d(this, parame));
  }
  
  public final void Q()
  {
    while ((!f.isEmpty()) && (l == null))
    {
      ((p5.g)f.get(0)).a();
      f.remove(0);
    }
  }
  
  public void R(p5.e parame)
  {
    S(parame, new f(this, parame));
  }
  
  public final void S(p5.e parame, Runnable paramRunnable)
  {
    Integer localInteger1 = parame.g();
    Integer localInteger2 = l;
    if (localInteger2 == null)
    {
      paramRunnable.run();
    }
    else if ((localInteger1 != null) && ((localInteger1.equals(localInteger2)) || (localInteger1.intValue() == -1)))
    {
      paramRunnable.run();
      if ((l == null) && (!f.isEmpty())) {
        h.b(this, new j(this));
      }
    }
    else
    {
      parame = new p5.g(parame, paramRunnable);
      f.add(parame);
    }
  }
  
  public void h(E5.j paramj, k.d paramd)
  {
    paramj = new p5.d(paramj, paramd);
    boolean bool1 = paramj.e();
    boolean bool2 = paramj.l();
    paramj = (List)paramj.c("operations");
    Object localObject = new ArrayList();
    Iterator localIterator = paramj.iterator();
    while (localIterator.hasNext())
    {
      p5.c localc = new p5.c((Map)localIterator.next(), bool1);
      paramj = localc.i();
      paramj.hashCode();
      int i1 = paramj.hashCode();
      int i2 = -1;
      switch (i1)
      {
      default: 
        break;
      case 107944136: 
        if (paramj.equals("query")) {
          i2 = 3;
        }
        break;
      case -838846263: 
        if (paramj.equals("update")) {
          i2 = 2;
        }
        break;
      case -1183792455: 
        if (paramj.equals("insert")) {
          i2 = 1;
        }
        break;
      case -1319569547: 
        if (paramj.equals("execute")) {
          i2 = 0;
        }
        break;
      }
      switch (i2)
      {
      default: 
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Batch method '");
        ((StringBuilder)localObject).append(paramj);
        ((StringBuilder)localObject).append("' not supported");
        paramd.b("bad_param", ((StringBuilder)localObject).toString(), null);
        return;
      case 3: 
        if (r(localc)) {
          localc.t((List)localObject);
        } else if (!bool2) {}
        break;
      case 2: 
      case 1: 
      case 0: 
        label311:
        do
        {
          do
          {
            do
            {
              localc.s((List)localObject);
              break;
              localc.r(paramd);
              return;
              if (t(localc)) {
                break label311;
              }
            } while (bool2);
            localc.r(paramd);
            return;
            if (q(localc)) {
              break label311;
            }
          } while (bool2);
          localc.r(paramd);
          return;
          if (p(localc)) {
            break label311;
          }
        } while (bool2);
        localc.r(paramd);
        return;
      }
    }
    if (bool1) {
      paramd.a(null);
    } else {
      paramd.a(localObject);
    }
  }
  
  public void k()
  {
    if ((!g.isEmpty()) && (t.b(d)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(A());
      localStringBuilder.append(g.size());
      localStringBuilder.append(" cursor(s) are left opened");
      Log.d("Sqflite", localStringBuilder.toString());
    }
    i.close();
  }
  
  public final void l(int paramInt)
  {
    v localv = (v)g.get(Integer.valueOf(paramInt));
    if (localv != null) {
      m(localv);
    }
  }
  
  public final void m(v paramv)
  {
    try
    {
      int i1 = a;
      if (t.c(d))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(A());
        localStringBuilder.append("closing cursor ");
        localStringBuilder.append(i1);
        Log.d("Sqflite", localStringBuilder.toString());
      }
      g.remove(Integer.valueOf(i1));
      c.close();
      return;
    }
    catch (Exception paramv)
    {
      for (;;) {}
    }
  }
  
  public final Map n(Cursor paramCursor, Integer paramInteger)
  {
    Object localObject1 = null;
    int i1 = 0;
    Object localObject2 = null;
    Object localObject3;
    Object localObject4;
    do
    {
      int i2;
      do
      {
        localObject3 = localObject1;
        if (!paramCursor.moveToNext()) {
          break;
        }
        localObject3 = localObject1;
        localObject4 = localObject2;
        i2 = i1;
        if (localObject1 == null)
        {
          localObject4 = new ArrayList();
          localObject3 = new HashMap();
          i2 = paramCursor.getColumnCount();
          ((Map)localObject3).put("columns", Arrays.asList(paramCursor.getColumnNames()));
          ((Map)localObject3).put("rows", localObject4);
        }
        ((List)localObject4).add(G.a(paramCursor, i2));
        localObject1 = localObject3;
        localObject2 = localObject4;
        i1 = i2;
      } while (paramInteger == null);
      localObject1 = localObject3;
      localObject2 = localObject4;
      i1 = i2;
    } while (((List)localObject4).size() < paramInteger.intValue());
    paramCursor = (Cursor)localObject3;
    if (localObject3 == null) {
      paramCursor = new HashMap();
    }
    return paramCursor;
  }
  
  public final boolean p(p5.e parame)
  {
    if (!w(parame)) {
      return false;
    }
    parame.a(null);
    return true;
  }
  
  /* Error */
  public final boolean q(p5.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 286	n5/k:w	(Lp5/e;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_1
    //   11: invokeinterface 540 1 0
    //   16: istore_2
    //   17: aconst_null
    //   18: astore_3
    //   19: iload_2
    //   20: ifeq +12 -> 32
    //   23: aload_1
    //   24: aconst_null
    //   25: invokeinterface 297 2 0
    //   30: iconst_1
    //   31: ireturn
    //   32: aload_0
    //   33: invokevirtual 542	n5/k:C	()Landroid/database/sqlite/SQLiteDatabase;
    //   36: ldc_w 544
    //   39: aconst_null
    //   40: invokevirtual 548	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   43: astore 4
    //   45: aload 4
    //   47: ifnull +302 -> 349
    //   50: aload 4
    //   52: astore 5
    //   54: aload 4
    //   56: invokeinterface 551 1 0
    //   61: ifle +288 -> 349
    //   64: aload 4
    //   66: astore 5
    //   68: aload 4
    //   70: invokeinterface 554 1 0
    //   75: ifeq +274 -> 349
    //   78: aload 4
    //   80: astore 5
    //   82: aload 4
    //   84: iconst_0
    //   85: invokeinterface 558 2 0
    //   90: ifne +140 -> 230
    //   93: aload 4
    //   95: astore 5
    //   97: aload_0
    //   98: getfield 61	n5/k:d	I
    //   101: invokestatic 481	n5/t:b	(I)Z
    //   104: ifeq +106 -> 210
    //   107: aload 4
    //   109: astore 5
    //   111: new 179	java/lang/StringBuilder
    //   114: astore_3
    //   115: aload 4
    //   117: astore 5
    //   119: aload_3
    //   120: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   123: aload 4
    //   125: astore 5
    //   127: aload_3
    //   128: aload_0
    //   129: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   132: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload 4
    //   138: astore 5
    //   140: aload_3
    //   141: ldc_w 560
    //   144: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 4
    //   150: astore 5
    //   152: aload_3
    //   153: aload 4
    //   155: iconst_1
    //   156: invokeinterface 564 2 0
    //   161: invokevirtual 219	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload 4
    //   167: astore 5
    //   169: aload_3
    //   170: ldc -35
    //   172: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload 4
    //   178: astore 5
    //   180: ldc_w 334
    //   183: aload_3
    //   184: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 339	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   190: pop
    //   191: goto +19 -> 210
    //   194: astore 4
    //   196: aload 5
    //   198: astore_1
    //   199: aload 4
    //   201: astore 5
    //   203: goto +262 -> 465
    //   206: astore_3
    //   207: goto +234 -> 441
    //   210: aload 4
    //   212: astore 5
    //   214: aload_1
    //   215: aconst_null
    //   216: invokeinterface 297 2 0
    //   221: aload 4
    //   223: invokeinterface 512 1 0
    //   228: iconst_1
    //   229: ireturn
    //   230: aload 4
    //   232: astore 5
    //   234: aload 4
    //   236: iconst_1
    //   237: invokeinterface 564 2 0
    //   242: lstore 6
    //   244: aload 4
    //   246: astore 5
    //   248: aload_0
    //   249: getfield 61	n5/k:d	I
    //   252: invokestatic 481	n5/t:b	(I)Z
    //   255: ifeq +70 -> 325
    //   258: aload 4
    //   260: astore 5
    //   262: new 179	java/lang/StringBuilder
    //   265: astore_3
    //   266: aload 4
    //   268: astore 5
    //   270: aload_3
    //   271: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   274: aload 4
    //   276: astore 5
    //   278: aload_3
    //   279: aload_0
    //   280: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   283: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload 4
    //   289: astore 5
    //   291: aload_3
    //   292: ldc_w 566
    //   295: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: pop
    //   299: aload 4
    //   301: astore 5
    //   303: aload_3
    //   304: lload 6
    //   306: invokevirtual 219	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload 4
    //   312: astore 5
    //   314: ldc_w 334
    //   317: aload_3
    //   318: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: invokestatic 339	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   324: pop
    //   325: aload 4
    //   327: astore 5
    //   329: aload_1
    //   330: lload 6
    //   332: invokestatic 571	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   335: invokeinterface 297 2 0
    //   340: aload 4
    //   342: invokeinterface 512 1 0
    //   347: iconst_1
    //   348: ireturn
    //   349: aload 4
    //   351: astore 5
    //   353: new 179	java/lang/StringBuilder
    //   356: astore_3
    //   357: aload 4
    //   359: astore 5
    //   361: aload_3
    //   362: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   365: aload 4
    //   367: astore 5
    //   369: aload_3
    //   370: aload_0
    //   371: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   374: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: pop
    //   378: aload 4
    //   380: astore 5
    //   382: aload_3
    //   383: ldc_w 573
    //   386: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload 4
    //   392: astore 5
    //   394: ldc_w 334
    //   397: aload_3
    //   398: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 575	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   404: pop
    //   405: aload 4
    //   407: astore 5
    //   409: aload_1
    //   410: aconst_null
    //   411: invokeinterface 297 2 0
    //   416: aload 4
    //   418: ifnull +10 -> 428
    //   421: aload 4
    //   423: invokeinterface 512 1 0
    //   428: iconst_1
    //   429: ireturn
    //   430: astore 5
    //   432: aload_3
    //   433: astore_1
    //   434: goto +31 -> 465
    //   437: astore_3
    //   438: aconst_null
    //   439: astore 4
    //   441: aload 4
    //   443: astore 5
    //   445: aload_0
    //   446: aload_3
    //   447: aload_1
    //   448: invokevirtual 577	n5/k:D	(Ljava/lang/Exception;Lp5/e;)V
    //   451: aload 4
    //   453: ifnull +10 -> 463
    //   456: aload 4
    //   458: invokeinterface 512 1 0
    //   463: iconst_0
    //   464: ireturn
    //   465: aload_1
    //   466: ifnull +9 -> 475
    //   469: aload_1
    //   470: invokeinterface 512 1 0
    //   475: aload 5
    //   477: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	478	0	this	k
    //   0	478	1	parame	p5.e
    //   16	4	2	bool	boolean
    //   18	166	3	localStringBuilder1	StringBuilder
    //   206	1	3	localException1	Exception
    //   265	168	3	localStringBuilder2	StringBuilder
    //   437	10	3	localException2	Exception
    //   43	134	4	localCursor	Cursor
    //   194	228	4	localObject1	Object
    //   439	18	4	localObject2	Object
    //   52	356	5	localObject3	Object
    //   430	1	5	localObject4	Object
    //   443	33	5	localObject5	Object
    //   242	89	6	l1	long
    // Exception table:
    //   from	to	target	type
    //   54	64	194	finally
    //   68	78	194	finally
    //   82	93	194	finally
    //   97	107	194	finally
    //   111	115	194	finally
    //   119	123	194	finally
    //   127	136	194	finally
    //   140	148	194	finally
    //   152	165	194	finally
    //   169	176	194	finally
    //   180	191	194	finally
    //   214	221	194	finally
    //   234	244	194	finally
    //   248	258	194	finally
    //   262	266	194	finally
    //   270	274	194	finally
    //   278	287	194	finally
    //   291	299	194	finally
    //   303	310	194	finally
    //   314	325	194	finally
    //   329	340	194	finally
    //   353	357	194	finally
    //   361	365	194	finally
    //   369	378	194	finally
    //   382	390	194	finally
    //   394	405	194	finally
    //   409	416	194	finally
    //   445	451	194	finally
    //   54	64	206	java/lang/Exception
    //   68	78	206	java/lang/Exception
    //   82	93	206	java/lang/Exception
    //   97	107	206	java/lang/Exception
    //   111	115	206	java/lang/Exception
    //   119	123	206	java/lang/Exception
    //   127	136	206	java/lang/Exception
    //   140	148	206	java/lang/Exception
    //   152	165	206	java/lang/Exception
    //   169	176	206	java/lang/Exception
    //   180	191	206	java/lang/Exception
    //   214	221	206	java/lang/Exception
    //   234	244	206	java/lang/Exception
    //   248	258	206	java/lang/Exception
    //   262	266	206	java/lang/Exception
    //   270	274	206	java/lang/Exception
    //   278	287	206	java/lang/Exception
    //   291	299	206	java/lang/Exception
    //   303	310	206	java/lang/Exception
    //   314	325	206	java/lang/Exception
    //   329	340	206	java/lang/Exception
    //   353	357	206	java/lang/Exception
    //   361	365	206	java/lang/Exception
    //   369	378	206	java/lang/Exception
    //   382	390	206	java/lang/Exception
    //   394	405	206	java/lang/Exception
    //   409	416	206	java/lang/Exception
    //   32	45	430	finally
    //   32	45	437	java/lang/Exception
  }
  
  /* Error */
  public final boolean r(p5.e parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 579
    //   4: invokeinterface 580 2 0
    //   9: checkcast 276	java/lang/Integer
    //   12: astore_2
    //   13: aload_1
    //   14: invokeinterface 583 1 0
    //   19: astore_3
    //   20: aload_0
    //   21: getfield 61	n5/k:d	I
    //   24: invokestatic 481	n5/t:b	(I)Z
    //   27: ifeq +41 -> 68
    //   30: new 179	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   37: astore 4
    //   39: aload 4
    //   41: aload_0
    //   42: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   45: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload 4
    //   51: aload_3
    //   52: invokevirtual 586	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: ldc_w 334
    //   59: aload 4
    //   61: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: invokestatic 339	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   67: pop
    //   68: aconst_null
    //   69: astore 5
    //   71: aconst_null
    //   72: astore 6
    //   74: aconst_null
    //   75: astore 7
    //   77: aconst_null
    //   78: astore 4
    //   80: aconst_null
    //   81: astore 8
    //   83: aload_0
    //   84: invokevirtual 589	n5/k:z	()Landroid/database/sqlite/SQLiteDatabase;
    //   87: astore 9
    //   89: new 591	n5/i
    //   92: astore 10
    //   94: aload 10
    //   96: aload_3
    //   97: invokespecial 594	n5/i:<init>	(Ln5/F;)V
    //   100: aload 9
    //   102: aload 10
    //   104: aload_3
    //   105: invokevirtual 596	n5/F:c	()Ljava/lang/String;
    //   108: getstatic 601	n5/a:a	[Ljava/lang/String;
    //   111: aconst_null
    //   112: invokevirtual 605	android/database/sqlite/SQLiteDatabase:rawQueryWithFactory	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   115: astore_3
    //   116: aload_3
    //   117: astore 10
    //   119: aload 8
    //   121: astore 4
    //   123: aload 5
    //   125: astore 9
    //   127: aload_0
    //   128: aload_3
    //   129: aload_2
    //   130: invokevirtual 607	n5/k:n	(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/Map;
    //   133: astore 11
    //   135: aload 6
    //   137: astore 7
    //   139: aload_2
    //   140: ifnull +202 -> 342
    //   143: aload_3
    //   144: astore 10
    //   146: aload 8
    //   148: astore 4
    //   150: aload 5
    //   152: astore 9
    //   154: aload 6
    //   156: astore 7
    //   158: aload_3
    //   159: invokeinterface 610 1 0
    //   164: ifne +178 -> 342
    //   167: aload_3
    //   168: astore 10
    //   170: aload 8
    //   172: astore 4
    //   174: aload 5
    //   176: astore 9
    //   178: aload 6
    //   180: astore 7
    //   182: aload_3
    //   183: invokeinterface 613 1 0
    //   188: ifne +154 -> 342
    //   191: aload_3
    //   192: astore 10
    //   194: aload 8
    //   196: astore 4
    //   198: aload 5
    //   200: astore 9
    //   202: aload_0
    //   203: getfield 51	n5/k:m	I
    //   206: iconst_1
    //   207: iadd
    //   208: istore 12
    //   210: aload_3
    //   211: astore 10
    //   213: aload 8
    //   215: astore 4
    //   217: aload 5
    //   219: astore 9
    //   221: aload_0
    //   222: iload 12
    //   224: putfield 51	n5/k:m	I
    //   227: aload_3
    //   228: astore 10
    //   230: aload 8
    //   232: astore 4
    //   234: aload 5
    //   236: astore 9
    //   238: aload 11
    //   240: ldc_w 615
    //   243: iload 12
    //   245: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: invokeinterface 294 3 0
    //   253: pop
    //   254: aload_3
    //   255: astore 10
    //   257: aload 8
    //   259: astore 4
    //   261: aload 5
    //   263: astore 9
    //   265: new 497	n5/v
    //   268: astore 7
    //   270: aload_3
    //   271: astore 10
    //   273: aload 8
    //   275: astore 4
    //   277: aload 5
    //   279: astore 9
    //   281: aload 7
    //   283: iload 12
    //   285: aload_2
    //   286: invokevirtual 392	java/lang/Integer:intValue	()I
    //   289: aload_3
    //   290: invokespecial 618	n5/v:<init>	(IILandroid/database/Cursor;)V
    //   293: aload_0
    //   294: getfield 45	n5/k:g	Ljava/util/Map;
    //   297: iload 12
    //   299: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aload 7
    //   304: invokeinterface 294 3 0
    //   309: pop
    //   310: goto +32 -> 342
    //   313: astore_1
    //   314: aload 7
    //   316: astore 4
    //   318: goto +119 -> 437
    //   321: astore 8
    //   323: goto +65 -> 388
    //   326: astore_1
    //   327: aload 10
    //   329: astore_3
    //   330: goto +107 -> 437
    //   333: astore 8
    //   335: aload 9
    //   337: astore 7
    //   339: goto +49 -> 388
    //   342: aload_3
    //   343: astore 10
    //   345: aload 7
    //   347: astore 4
    //   349: aload 7
    //   351: astore 9
    //   353: aload_1
    //   354: aload 11
    //   356: invokeinterface 297 2 0
    //   361: aload 7
    //   363: ifnonnull +13 -> 376
    //   366: aload_3
    //   367: ifnull +9 -> 376
    //   370: aload_3
    //   371: invokeinterface 512 1 0
    //   376: iconst_1
    //   377: ireturn
    //   378: astore_1
    //   379: aconst_null
    //   380: astore_3
    //   381: goto +56 -> 437
    //   384: astore 8
    //   386: aconst_null
    //   387: astore_3
    //   388: aload_3
    //   389: astore 10
    //   391: aload 7
    //   393: astore 4
    //   395: aload_0
    //   396: aload 8
    //   398: aload_1
    //   399: invokevirtual 577	n5/k:D	(Ljava/lang/Exception;Lp5/e;)V
    //   402: aload 7
    //   404: ifnull +16 -> 420
    //   407: aload_3
    //   408: astore 10
    //   410: aload 7
    //   412: astore 4
    //   414: aload_0
    //   415: aload 7
    //   417: invokevirtual 500	n5/k:m	(Ln5/v;)V
    //   420: aload 7
    //   422: ifnonnull +13 -> 435
    //   425: aload_3
    //   426: ifnull +9 -> 435
    //   429: aload_3
    //   430: invokeinterface 512 1 0
    //   435: iconst_0
    //   436: ireturn
    //   437: aload 4
    //   439: ifnonnull +13 -> 452
    //   442: aload_3
    //   443: ifnull +9 -> 452
    //   446: aload_3
    //   447: invokeinterface 512 1 0
    //   452: aload_1
    //   453: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	454	0	this	k
    //   0	454	1	parame	p5.e
    //   12	274	2	localInteger	Integer
    //   19	428	3	localObject1	Object
    //   37	401	4	localObject2	Object
    //   69	209	5	localObject3	Object
    //   72	107	6	localObject4	Object
    //   75	346	7	localObject5	Object
    //   81	193	8	localObject6	Object
    //   321	1	8	localException1	Exception
    //   333	1	8	localException2	Exception
    //   384	13	8	localException3	Exception
    //   87	265	9	localObject7	Object
    //   92	317	10	localObject8	Object
    //   133	222	11	localMap	Map
    //   208	90	12	i1	int
    // Exception table:
    //   from	to	target	type
    //   293	310	313	finally
    //   293	310	321	java/lang/Exception
    //   127	135	326	finally
    //   158	167	326	finally
    //   182	191	326	finally
    //   202	210	326	finally
    //   221	227	326	finally
    //   238	254	326	finally
    //   265	270	326	finally
    //   281	293	326	finally
    //   353	361	326	finally
    //   395	402	326	finally
    //   414	420	326	finally
    //   127	135	333	java/lang/Exception
    //   158	167	333	java/lang/Exception
    //   182	191	333	java/lang/Exception
    //   202	210	333	java/lang/Exception
    //   221	227	333	java/lang/Exception
    //   238	254	333	java/lang/Exception
    //   265	270	333	java/lang/Exception
    //   281	293	333	java/lang/Exception
    //   353	361	333	java/lang/Exception
    //   83	116	378	finally
    //   83	116	384	java/lang/Exception
  }
  
  /* Error */
  public final boolean s(p5.e parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 615
    //   4: invokeinterface 580 2 0
    //   9: checkcast 276	java/lang/Integer
    //   12: astore_2
    //   13: aload_2
    //   14: invokevirtual 392	java/lang/Integer:intValue	()I
    //   17: istore_3
    //   18: getstatic 268	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   21: aload_1
    //   22: ldc_w 620
    //   25: invokeinterface 580 2 0
    //   30: invokevirtual 272	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   33: istore 4
    //   35: aload_0
    //   36: getfield 61	n5/k:d	I
    //   39: invokestatic 328	n5/t:c	(I)Z
    //   42: ifeq +76 -> 118
    //   45: new 179	java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   52: astore 5
    //   54: aload 5
    //   56: aload_0
    //   57: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   60: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload 5
    //   66: ldc_w 622
    //   69: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 5
    //   75: iload_3
    //   76: invokevirtual 205	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: iload 4
    //   82: ifeq +11 -> 93
    //   85: ldc_w 624
    //   88: astore 6
    //   90: goto +8 -> 98
    //   93: ldc_w 626
    //   96: astore 6
    //   98: aload 5
    //   100: aload 6
    //   102: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: ldc_w 334
    //   109: aload 5
    //   111: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 339	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   117: pop
    //   118: aconst_null
    //   119: astore 7
    //   121: iload 4
    //   123: ifeq +17 -> 140
    //   126: aload_0
    //   127: iload_3
    //   128: invokevirtual 628	n5/k:l	(I)V
    //   131: aload_1
    //   132: aconst_null
    //   133: invokeinterface 297 2 0
    //   138: iconst_1
    //   139: ireturn
    //   140: aload_0
    //   141: getfield 45	n5/k:g	Ljava/util/Map;
    //   144: aload_2
    //   145: invokeinterface 495 2 0
    //   150: checkcast 497	n5/v
    //   153: astore 5
    //   155: iconst_0
    //   156: istore 8
    //   158: aload 5
    //   160: ifnull +130 -> 290
    //   163: aload 5
    //   165: getfield 509	n5/v:c	Landroid/database/Cursor;
    //   168: astore 9
    //   170: aload_0
    //   171: aload 9
    //   173: aload 5
    //   175: getfield 630	n5/v:b	I
    //   178: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: invokevirtual 607	n5/k:n	(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/Map;
    //   184: astore 6
    //   186: aload 9
    //   188: invokeinterface 610 1 0
    //   193: ifne +35 -> 228
    //   196: aload 9
    //   198: invokeinterface 613 1 0
    //   203: istore 4
    //   205: iload 4
    //   207: ifne +21 -> 228
    //   210: iconst_1
    //   211: istore 8
    //   213: goto +18 -> 231
    //   216: astore_1
    //   217: goto +169 -> 386
    //   220: astore 6
    //   222: iconst_0
    //   223: istore 8
    //   225: goto +112 -> 337
    //   228: iconst_0
    //   229: istore 8
    //   231: iload 8
    //   233: ifeq +33 -> 266
    //   236: iload 8
    //   238: istore_3
    //   239: aload 6
    //   241: ldc_w 615
    //   244: aload_2
    //   245: invokeinterface 294 3 0
    //   250: pop
    //   251: goto +15 -> 266
    //   254: astore_1
    //   255: iload_3
    //   256: istore 8
    //   258: goto +128 -> 386
    //   261: astore 6
    //   263: goto +74 -> 337
    //   266: iload 8
    //   268: istore_3
    //   269: aload_1
    //   270: aload 6
    //   272: invokeinterface 297 2 0
    //   277: iload 8
    //   279: ifne +9 -> 288
    //   282: aload_0
    //   283: aload 5
    //   285: invokevirtual 500	n5/k:m	(Ln5/v;)V
    //   288: iconst_1
    //   289: ireturn
    //   290: new 632	java/lang/IllegalStateException
    //   293: astore 6
    //   295: new 179	java/lang/StringBuilder
    //   298: astore_2
    //   299: aload_2
    //   300: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   303: aload_2
    //   304: ldc_w 634
    //   307: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload_2
    //   312: iload_3
    //   313: invokevirtual 205	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload_2
    //   318: ldc_w 636
    //   321: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload 6
    //   327: aload_2
    //   328: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: invokespecial 637	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   334: aload 6
    //   336: athrow
    //   337: iload 8
    //   339: istore_3
    //   340: aload_0
    //   341: aload 6
    //   343: aload_1
    //   344: invokevirtual 577	n5/k:D	(Ljava/lang/Exception;Lp5/e;)V
    //   347: aload 5
    //   349: ifnull +18 -> 367
    //   352: iload 8
    //   354: istore_3
    //   355: aload_0
    //   356: aload 5
    //   358: invokevirtual 500	n5/k:m	(Ln5/v;)V
    //   361: aload 7
    //   363: astore_1
    //   364: goto +6 -> 370
    //   367: aload 5
    //   369: astore_1
    //   370: iload 8
    //   372: ifne +12 -> 384
    //   375: aload_1
    //   376: ifnull +8 -> 384
    //   379: aload_0
    //   380: aload_1
    //   381: invokevirtual 500	n5/k:m	(Ln5/v;)V
    //   384: iconst_0
    //   385: ireturn
    //   386: iload 8
    //   388: ifne +14 -> 402
    //   391: aload 5
    //   393: ifnull +9 -> 402
    //   396: aload_0
    //   397: aload 5
    //   399: invokevirtual 500	n5/k:m	(Ln5/v;)V
    //   402: aload_1
    //   403: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	this	k
    //   0	404	1	parame	p5.e
    //   12	316	2	localObject1	Object
    //   17	338	3	i1	int
    //   33	173	4	bool	boolean
    //   52	346	5	localObject2	Object
    //   88	97	6	localObject3	Object
    //   220	20	6	localException1	Exception
    //   261	10	6	localException2	Exception
    //   293	49	6	localIllegalStateException	IllegalStateException
    //   119	243	7	localObject4	Object
    //   156	231	8	i2	int
    //   168	29	9	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   163	205	216	finally
    //   290	337	216	finally
    //   163	205	220	java/lang/Exception
    //   290	337	220	java/lang/Exception
    //   239	251	254	finally
    //   269	277	254	finally
    //   340	347	254	finally
    //   355	361	254	finally
    //   239	251	261	java/lang/Exception
    //   269	277	261	java/lang/Exception
  }
  
  /* Error */
  public final boolean t(p5.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 286	n5/k:w	(Lp5/e;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_1
    //   11: invokeinterface 540 1 0
    //   16: istore_2
    //   17: aconst_null
    //   18: astore_3
    //   19: aconst_null
    //   20: astore 4
    //   22: iload_2
    //   23: ifeq +12 -> 35
    //   26: aload_1
    //   27: aconst_null
    //   28: invokeinterface 297 2 0
    //   33: iconst_1
    //   34: ireturn
    //   35: aload_0
    //   36: invokevirtual 542	n5/k:C	()Landroid/database/sqlite/SQLiteDatabase;
    //   39: ldc_w 639
    //   42: aconst_null
    //   43: invokevirtual 548	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull +128 -> 178
    //   53: aload 5
    //   55: invokeinterface 551 1 0
    //   60: ifle +118 -> 178
    //   63: aload 5
    //   65: invokeinterface 554 1 0
    //   70: ifeq +108 -> 178
    //   73: aload 5
    //   75: iconst_0
    //   76: invokeinterface 558 2 0
    //   81: istore 6
    //   83: aload_0
    //   84: getfield 61	n5/k:d	I
    //   87: invokestatic 481	n5/t:b	(I)Z
    //   90: ifeq +68 -> 158
    //   93: new 179	java/lang/StringBuilder
    //   96: astore 4
    //   98: aload 4
    //   100: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   103: aload 4
    //   105: aload_0
    //   106: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   109: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload 4
    //   115: ldc_w 641
    //   118: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload 4
    //   124: iload 6
    //   126: invokevirtual 205	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: ldc_w 334
    //   133: aload 4
    //   135: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 339	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: goto +16 -> 158
    //   145: astore_1
    //   146: aload 5
    //   148: astore 4
    //   150: goto +124 -> 274
    //   153: astore 7
    //   155: goto +94 -> 249
    //   158: aload_1
    //   159: iload 6
    //   161: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: invokeinterface 297 2 0
    //   169: aload 5
    //   171: invokeinterface 512 1 0
    //   176: iconst_1
    //   177: ireturn
    //   178: new 179	java/lang/StringBuilder
    //   181: astore 4
    //   183: aload 4
    //   185: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   188: aload 4
    //   190: aload_0
    //   191: invokevirtual 330	n5/k:A	()Ljava/lang/String;
    //   194: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload 4
    //   200: ldc_w 643
    //   203: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: ldc_w 334
    //   210: aload 4
    //   212: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 575	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   218: pop
    //   219: aload_1
    //   220: aconst_null
    //   221: invokeinterface 297 2 0
    //   226: aload 5
    //   228: ifnull +10 -> 238
    //   231: aload 5
    //   233: invokeinterface 512 1 0
    //   238: iconst_1
    //   239: ireturn
    //   240: astore_1
    //   241: goto +33 -> 274
    //   244: astore 7
    //   246: aload_3
    //   247: astore 5
    //   249: aload 5
    //   251: astore 4
    //   253: aload_0
    //   254: aload 7
    //   256: aload_1
    //   257: invokevirtual 577	n5/k:D	(Ljava/lang/Exception;Lp5/e;)V
    //   260: aload 5
    //   262: ifnull +10 -> 272
    //   265: aload 5
    //   267: invokeinterface 512 1 0
    //   272: iconst_0
    //   273: ireturn
    //   274: aload 4
    //   276: ifnull +10 -> 286
    //   279: aload 4
    //   281: invokeinterface 512 1 0
    //   286: aload_1
    //   287: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	k
    //   0	288	1	parame	p5.e
    //   16	7	2	bool	boolean
    //   18	229	3	localObject1	Object
    //   20	260	4	localObject2	Object
    //   46	220	5	localObject3	Object
    //   81	79	6	i1	int
    //   153	1	7	localException1	Exception
    //   244	11	7	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   53	142	145	finally
    //   158	169	145	finally
    //   178	226	145	finally
    //   53	142	153	java/lang/Exception
    //   158	169	153	java/lang/Exception
    //   178	226	153	java/lang/Exception
    //   35	48	240	finally
    //   253	260	240	finally
    //   35	48	244	java/lang/Exception
  }
  
  public void u(Boolean paramBoolean)
  {
    try
    {
      if (Boolean.TRUE.equals(paramBoolean)) {
        j += 1;
      }
    }
    finally
    {
      break label52;
    }
    if (Boolean.FALSE.equals(paramBoolean)) {
      j -= 1;
    }
    return;
    label52:
    throw paramBoolean;
  }
  
  public void v(p5.e parame)
  {
    S(parame, new h(this, parame));
  }
  
  public final boolean w(p5.e parame)
  {
    F localF = parame.d();
    if (t.b(d))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(A());
      ((StringBuilder)localObject).append(localF);
      Log.d("Sqflite", ((StringBuilder)localObject).toString());
    }
    Object localObject = parame.f();
    try
    {
      C().execSQL(localF.c(), localF.d());
      u((Boolean)localObject);
      return true;
    }
    catch (Exception localException)
    {
      D(localException, parame);
    }
    return false;
  }
  
  public SQLiteDatabase z()
  {
    return i;
  }
  
  public class a
    implements DatabaseErrorHandler
  {
    public a() {}
    
    public void onCorruption(SQLiteDatabase paramSQLiteDatabase) {}
  }
}

/* Location:
 * Qualified Name:     n5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */