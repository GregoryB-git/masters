package va;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ApplicationInfoFlags;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.util.Log;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.m0;
import wa.c;
import x6.b;

public final class d
{
  public static Boolean n;
  public final boolean a;
  public final String b;
  public final int c;
  public final int d;
  public final Context e;
  public final ArrayList f = new ArrayList();
  public final HashMap g = new HashMap();
  public i h;
  public SQLiteDatabase i;
  public int j = 0;
  public int k = 0;
  public Integer l;
  public int m = 0;
  
  public d(Context paramContext, String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    e = paramContext;
    b = paramString;
    a = paramBoolean;
    c = paramInt1;
    d = paramInt2;
  }
  
  public static HashMap c(Cursor paramCursor, Integer paramInteger)
  {
    int i1 = 0;
    Object localObject1 = null;
    Object localObject2 = localObject1;
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
        i2 = i1;
        localObject4 = localObject2;
        if (localObject1 == null)
        {
          localObject4 = new ArrayList();
          localObject3 = new HashMap();
          i2 = paramCursor.getColumnCount();
          ((HashMap)localObject3).put("columns", Arrays.asList(paramCursor.getColumnNames()));
          ((HashMap)localObject3).put("rows", localObject4);
        }
        localObject2 = new ArrayList(i2);
        for (i1 = 0; i1 < i2; i1++)
        {
          int i3 = paramCursor.getType(i1);
          if (i3 != 1)
          {
            if (i3 != 2)
            {
              if (i3 != 3)
              {
                if (i3 != 4) {
                  localObject1 = null;
                } else {
                  localObject1 = paramCursor.getBlob(i1);
                }
              }
              else {
                localObject1 = paramCursor.getString(i1);
              }
            }
            else {
              localObject1 = Double.valueOf(paramCursor.getDouble(i1));
            }
          }
          else {
            localObject1 = Long.valueOf(paramCursor.getLong(i1));
          }
          ((ArrayList)localObject2).add(localObject1);
        }
        ((List)localObject4).add(localObject2);
        localObject1 = localObject3;
        i1 = i2;
        localObject2 = localObject4;
      } while (paramInteger == null);
      localObject1 = localObject3;
      i1 = i2;
      localObject2 = localObject4;
    } while (((List)localObject4).size() < paramInteger.intValue());
    paramCursor = (Cursor)localObject3;
    if (localObject3 == null) {
      paramCursor = new HashMap();
    }
    return paramCursor;
  }
  
  public final void a()
  {
    if (!g.isEmpty())
    {
      int i1 = d;
      int i2 = 1;
      if (i1 < 1) {
        i2 = 0;
      }
      if (i2 != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(h());
        localStringBuilder.append(g.size());
        localStringBuilder.append(" cursor(s) are left opened");
        Log.d("Sqflite", localStringBuilder.toString());
      }
    }
    i.close();
  }
  
  public final void b(l paraml)
  {
    try
    {
      int i1 = a;
      if (m0.O(d))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(h());
        localStringBuilder.append("closing cursor ");
        localStringBuilder.append(i1);
        Log.d("Sqflite", localStringBuilder.toString());
      }
      g.remove(Integer.valueOf(i1));
      c.close();
      return;
    }
    catch (Exception paraml)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final boolean d(m.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 203	va/d:g	(Lm/e;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_1
    //   11: invokevirtual 207	m/e:e	()Z
    //   14: istore_2
    //   15: aconst_null
    //   16: astore_3
    //   17: iload_2
    //   18: ifeq +13 -> 31
    //   21: aload_1
    //   22: checkcast 209	wa/a
    //   25: aconst_null
    //   26: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   29: iconst_1
    //   30: ireturn
    //   31: aload_0
    //   32: getfield 169	va/d:i	Landroid/database/sqlite/SQLiteDatabase;
    //   35: ldc -42
    //   37: aconst_null
    //   38: invokevirtual 220	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 4
    //   43: aload 4
    //   45: ifnull +309 -> 354
    //   48: aload 4
    //   50: astore 5
    //   52: aload 4
    //   54: invokeinterface 223 1 0
    //   59: ifle +295 -> 354
    //   62: aload 4
    //   64: astore 5
    //   66: aload 4
    //   68: invokeinterface 226 1 0
    //   73: ifeq +281 -> 354
    //   76: aload 4
    //   78: astore 5
    //   80: aload 4
    //   82: iconst_0
    //   83: invokeinterface 229 2 0
    //   88: ifne +136 -> 224
    //   91: aload 4
    //   93: astore 5
    //   95: aload_0
    //   96: getfield 59	va/d:d	I
    //   99: iconst_1
    //   100: if_icmplt +9 -> 109
    //   103: iconst_1
    //   104: istore 6
    //   106: goto +6 -> 112
    //   109: iconst_0
    //   110: istore 6
    //   112: iload 6
    //   114: ifeq +85 -> 199
    //   117: aload 4
    //   119: astore 5
    //   121: new 143	java/lang/StringBuilder
    //   124: astore_3
    //   125: aload 4
    //   127: astore 5
    //   129: aload_3
    //   130: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   133: aload 4
    //   135: astore 5
    //   137: aload_3
    //   138: aload_0
    //   139: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   142: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload 4
    //   148: astore 5
    //   150: aload_3
    //   151: ldc -25
    //   153: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload 4
    //   159: astore 5
    //   161: aload_3
    //   162: aload 4
    //   164: iconst_1
    //   165: invokeinterface 118 2 0
    //   170: invokevirtual 234	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload 4
    //   176: astore 5
    //   178: aload_3
    //   179: ldc -20
    //   181: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload 4
    //   187: astore 5
    //   189: ldc -97
    //   191: aload_3
    //   192: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokestatic 167	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   198: pop
    //   199: aload 4
    //   201: astore 5
    //   203: aload_1
    //   204: checkcast 209	wa/a
    //   207: aconst_null
    //   208: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   211: aload 4
    //   213: invokeinterface 200 1 0
    //   218: iconst_1
    //   219: ireturn
    //   220: astore_3
    //   221: goto +224 -> 445
    //   224: aload 4
    //   226: astore 5
    //   228: aload 4
    //   230: iconst_1
    //   231: invokeinterface 118 2 0
    //   236: lstore 7
    //   238: aload 4
    //   240: astore 5
    //   242: aload_0
    //   243: getfield 59	va/d:d	I
    //   246: iconst_1
    //   247: if_icmplt +9 -> 256
    //   250: iconst_1
    //   251: istore 6
    //   253: goto +6 -> 259
    //   256: iconst_0
    //   257: istore 6
    //   259: iload 6
    //   261: ifeq +68 -> 329
    //   264: aload 4
    //   266: astore 5
    //   268: new 143	java/lang/StringBuilder
    //   271: astore_3
    //   272: aload 4
    //   274: astore 5
    //   276: aload_3
    //   277: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   280: aload 4
    //   282: astore 5
    //   284: aload_3
    //   285: aload_0
    //   286: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   289: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload 4
    //   295: astore 5
    //   297: aload_3
    //   298: ldc -18
    //   300: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aload 4
    //   306: astore 5
    //   308: aload_3
    //   309: lload 7
    //   311: invokevirtual 234	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload 4
    //   317: astore 5
    //   319: ldc -97
    //   321: aload_3
    //   322: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: invokestatic 167	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   328: pop
    //   329: aload 4
    //   331: astore 5
    //   333: aload_1
    //   334: checkcast 209	wa/a
    //   337: lload 7
    //   339: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   342: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   345: aload 4
    //   347: invokeinterface 200 1 0
    //   352: iconst_1
    //   353: ireturn
    //   354: aload 4
    //   356: astore 5
    //   358: new 143	java/lang/StringBuilder
    //   361: astore_3
    //   362: aload 4
    //   364: astore 5
    //   366: aload_3
    //   367: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   370: aload 4
    //   372: astore 5
    //   374: aload_3
    //   375: aload_0
    //   376: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   379: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload 4
    //   385: astore 5
    //   387: aload_3
    //   388: ldc -16
    //   390: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload 4
    //   396: astore 5
    //   398: ldc -97
    //   400: aload_3
    //   401: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 242	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   407: pop
    //   408: aload 4
    //   410: astore 5
    //   412: aload_1
    //   413: checkcast 209	wa/a
    //   416: aconst_null
    //   417: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   420: aload 4
    //   422: ifnull +10 -> 432
    //   425: aload 4
    //   427: invokeinterface 200 1 0
    //   432: iconst_1
    //   433: ireturn
    //   434: astore 5
    //   436: aload_3
    //   437: astore_1
    //   438: goto +40 -> 478
    //   441: astore_3
    //   442: aconst_null
    //   443: astore 4
    //   445: aload 4
    //   447: astore 5
    //   449: aload_0
    //   450: aload_3
    //   451: aload_1
    //   452: invokevirtual 245	va/d:i	(Ljava/lang/Exception;Lm/e;)V
    //   455: aload 4
    //   457: ifnull +10 -> 467
    //   460: aload 4
    //   462: invokeinterface 200 1 0
    //   467: iconst_0
    //   468: ireturn
    //   469: astore 4
    //   471: aload 5
    //   473: astore_1
    //   474: aload 4
    //   476: astore 5
    //   478: aload_1
    //   479: ifnull +9 -> 488
    //   482: aload_1
    //   483: invokeinterface 200 1 0
    //   488: aload 5
    //   490: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	491	0	this	d
    //   0	491	1	parame	m.e
    //   14	4	2	bool	boolean
    //   16	176	3	localStringBuilder1	StringBuilder
    //   220	1	3	localException1	Exception
    //   271	166	3	localStringBuilder2	StringBuilder
    //   441	10	3	localException2	Exception
    //   41	420	4	localCursor1	Cursor
    //   469	6	4	localObject1	Object
    //   50	361	5	localCursor2	Cursor
    //   434	1	5	localObject2	Object
    //   447	42	5	localObject3	Object
    //   104	156	6	i1	int
    //   236	102	7	l1	long
    // Exception table:
    //   from	to	target	type
    //   52	62	220	java/lang/Exception
    //   66	76	220	java/lang/Exception
    //   80	91	220	java/lang/Exception
    //   95	103	220	java/lang/Exception
    //   121	125	220	java/lang/Exception
    //   129	133	220	java/lang/Exception
    //   137	146	220	java/lang/Exception
    //   150	157	220	java/lang/Exception
    //   161	174	220	java/lang/Exception
    //   178	185	220	java/lang/Exception
    //   189	199	220	java/lang/Exception
    //   203	211	220	java/lang/Exception
    //   228	238	220	java/lang/Exception
    //   242	250	220	java/lang/Exception
    //   268	272	220	java/lang/Exception
    //   276	280	220	java/lang/Exception
    //   284	293	220	java/lang/Exception
    //   297	304	220	java/lang/Exception
    //   308	315	220	java/lang/Exception
    //   319	329	220	java/lang/Exception
    //   333	345	220	java/lang/Exception
    //   358	362	220	java/lang/Exception
    //   366	370	220	java/lang/Exception
    //   374	383	220	java/lang/Exception
    //   387	394	220	java/lang/Exception
    //   398	408	220	java/lang/Exception
    //   412	420	220	java/lang/Exception
    //   31	43	434	finally
    //   31	43	441	java/lang/Exception
    //   52	62	469	finally
    //   66	76	469	finally
    //   80	91	469	finally
    //   95	103	469	finally
    //   121	125	469	finally
    //   129	133	469	finally
    //   137	146	469	finally
    //   150	157	469	finally
    //   161	174	469	finally
    //   178	185	469	finally
    //   189	199	469	finally
    //   203	211	469	finally
    //   228	238	469	finally
    //   242	250	469	finally
    //   268	272	469	finally
    //   276	280	469	finally
    //   284	293	469	finally
    //   297	304	469	finally
    //   308	315	469	finally
    //   319	329	469	finally
    //   333	345	469	finally
    //   358	362	469	finally
    //   366	370	469	finally
    //   374	383	469	finally
    //   387	394	469	finally
    //   398	408	469	finally
    //   412	420	469	finally
    //   449	455	469	finally
  }
  
  /* Error */
  public final boolean e(m.e parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc -9
    //   3: invokevirtual 250	m/e:c	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 135	java/lang/Integer
    //   9: astore_2
    //   10: aload_1
    //   11: ldc -4
    //   13: invokevirtual 250	m/e:c	(Ljava/lang/String;)Ljava/lang/Object;
    //   16: checkcast 254	java/lang/String
    //   19: astore_3
    //   20: new 256	va/t
    //   23: dup
    //   24: aload_3
    //   25: aload_1
    //   26: ldc_w 258
    //   29: invokevirtual 250	m/e:c	(Ljava/lang/String;)Ljava/lang/Object;
    //   32: checkcast 129	java/util/List
    //   35: invokespecial 261	va/t:<init>	(Ljava/lang/String;Ljava/util/List;)V
    //   38: astore 4
    //   40: aload_0
    //   41: getfield 59	va/d:d	I
    //   44: iconst_1
    //   45: if_icmplt +9 -> 54
    //   48: iconst_1
    //   49: istore 5
    //   51: goto +6 -> 57
    //   54: iconst_0
    //   55: istore 5
    //   57: iload 5
    //   59: ifeq +41 -> 100
    //   62: new 143	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   69: astore 6
    //   71: aload 6
    //   73: aload_0
    //   74: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   77: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload 6
    //   83: aload 4
    //   85: invokevirtual 264	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: ldc -97
    //   91: aload 6
    //   93: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokestatic 167	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   99: pop
    //   100: aconst_null
    //   101: astore 7
    //   103: aconst_null
    //   104: astore 6
    //   106: aconst_null
    //   107: astore 8
    //   109: aconst_null
    //   110: astore 9
    //   112: aconst_null
    //   113: astore 10
    //   115: aload_0
    //   116: getfield 169	va/d:i	Landroid/database/sqlite/SQLiteDatabase;
    //   119: astore 11
    //   121: new 266	u1/a
    //   124: astore 12
    //   126: aload 12
    //   128: aload 4
    //   130: iconst_1
    //   131: invokespecial 269	u1/a:<init>	(Ljava/lang/Object;I)V
    //   134: aload 11
    //   136: aload 12
    //   138: aload_3
    //   139: getstatic 274	va/a:a	[Ljava/lang/String;
    //   142: aconst_null
    //   143: invokevirtual 278	android/database/sqlite/SQLiteDatabase:rawQueryWithFactory	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   146: astore 4
    //   148: aload 7
    //   150: astore_3
    //   151: aload 4
    //   153: astore 9
    //   155: aload 8
    //   157: astore 6
    //   159: aload 4
    //   161: aload_2
    //   162: invokestatic 280	va/d:c	(Landroid/database/Cursor;Ljava/lang/Integer;)Ljava/util/HashMap;
    //   165: astore 12
    //   167: aload_2
    //   168: ifnull +51 -> 219
    //   171: aload 7
    //   173: astore_3
    //   174: aload 4
    //   176: astore 9
    //   178: aload 8
    //   180: astore 6
    //   182: aload 4
    //   184: invokeinterface 283 1 0
    //   189: ifne +30 -> 219
    //   192: aload 7
    //   194: astore_3
    //   195: aload 4
    //   197: astore 9
    //   199: aload 8
    //   201: astore 6
    //   203: aload 4
    //   205: invokeinterface 286 1 0
    //   210: ifne +9 -> 219
    //   213: iconst_1
    //   214: istore 5
    //   216: goto +6 -> 222
    //   219: iconst_0
    //   220: istore 5
    //   222: iload 5
    //   224: ifeq +137 -> 361
    //   227: aload 7
    //   229: astore_3
    //   230: aload 4
    //   232: astore 9
    //   234: aload 8
    //   236: astore 6
    //   238: aload_0
    //   239: getfield 49	va/d:m	I
    //   242: iconst_1
    //   243: iadd
    //   244: istore 5
    //   246: aload 7
    //   248: astore_3
    //   249: aload 4
    //   251: astore 9
    //   253: aload 8
    //   255: astore 6
    //   257: aload_0
    //   258: iload 5
    //   260: putfield 49	va/d:m	I
    //   263: aload 7
    //   265: astore_3
    //   266: aload 4
    //   268: astore 9
    //   270: aload 8
    //   272: astore 6
    //   274: aload 12
    //   276: ldc_w 288
    //   279: iload 5
    //   281: invokestatic 192	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   284: invokeinterface 291 3 0
    //   289: pop
    //   290: aload 7
    //   292: astore_3
    //   293: aload 4
    //   295: astore 9
    //   297: aload 8
    //   299: astore 6
    //   301: new 179	va/l
    //   304: astore 10
    //   306: aload 7
    //   308: astore_3
    //   309: aload 4
    //   311: astore 9
    //   313: aload 8
    //   315: astore 6
    //   317: aload 10
    //   319: iload 5
    //   321: aload_2
    //   322: invokevirtual 138	java/lang/Integer:intValue	()I
    //   325: aload 4
    //   327: invokespecial 294	va/l:<init>	(IILandroid/database/Cursor;)V
    //   330: aload_0
    //   331: getfield 43	va/d:g	Ljava/util/HashMap;
    //   334: iload 5
    //   336: invokestatic 192	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   339: aload 10
    //   341: invokevirtual 87	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   344: pop
    //   345: goto +16 -> 361
    //   348: astore 6
    //   350: aload 10
    //   352: astore_1
    //   353: goto +138 -> 491
    //   356: astore 7
    //   358: goto +65 -> 423
    //   361: aload 10
    //   363: astore_3
    //   364: aload 4
    //   366: astore 9
    //   368: aload 10
    //   370: astore 6
    //   372: aload_1
    //   373: checkcast 209	wa/a
    //   376: aload 12
    //   378: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   381: aload 10
    //   383: ifnonnull +10 -> 393
    //   386: aload 4
    //   388: invokeinterface 200 1 0
    //   393: iconst_1
    //   394: ireturn
    //   395: astore 7
    //   397: aload_3
    //   398: astore 10
    //   400: goto +23 -> 423
    //   403: astore 6
    //   405: aconst_null
    //   406: astore 4
    //   408: aload 9
    //   410: astore_1
    //   411: goto +80 -> 491
    //   414: astore 7
    //   416: aconst_null
    //   417: astore 4
    //   419: aload 6
    //   421: astore 10
    //   423: aload 4
    //   425: astore 9
    //   427: aload 10
    //   429: astore 6
    //   431: aload_0
    //   432: aload 7
    //   434: aload_1
    //   435: invokevirtual 245	va/d:i	(Ljava/lang/Exception;Lm/e;)V
    //   438: aload 10
    //   440: ifnull +17 -> 457
    //   443: aload 4
    //   445: astore 9
    //   447: aload 10
    //   449: astore 6
    //   451: aload_0
    //   452: aload 10
    //   454: invokevirtual 296	va/d:b	(Lva/l;)V
    //   457: aload 10
    //   459: ifnonnull +15 -> 474
    //   462: aload 4
    //   464: ifnull +10 -> 474
    //   467: aload 4
    //   469: invokeinterface 200 1 0
    //   474: iconst_0
    //   475: ireturn
    //   476: astore_1
    //   477: aload 9
    //   479: astore 4
    //   481: aload 6
    //   483: astore 10
    //   485: aload_1
    //   486: astore 6
    //   488: aload 10
    //   490: astore_1
    //   491: aload_1
    //   492: ifnonnull +15 -> 507
    //   495: aload 4
    //   497: ifnull +10 -> 507
    //   500: aload 4
    //   502: invokeinterface 200 1 0
    //   507: aload 6
    //   509: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	510	0	this	d
    //   0	510	1	parame	m.e
    //   9	313	2	localInteger	Integer
    //   19	379	3	localObject1	Object
    //   38	463	4	localObject2	Object
    //   49	286	5	i1	int
    //   69	247	6	localObject3	Object
    //   348	1	6	localObject4	Object
    //   370	1	6	localObject5	Object
    //   403	17	6	localObject6	Object
    //   429	79	6	localObject7	Object
    //   101	206	7	localObject8	Object
    //   356	1	7	localException1	Exception
    //   395	1	7	localException2	Exception
    //   414	19	7	localException3	Exception
    //   107	207	8	localObject9	Object
    //   110	368	9	localObject10	Object
    //   113	376	10	localObject11	Object
    //   119	16	11	localSQLiteDatabase	SQLiteDatabase
    //   124	253	12	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   330	345	348	finally
    //   330	345	356	java/lang/Exception
    //   159	167	395	java/lang/Exception
    //   182	192	395	java/lang/Exception
    //   203	213	395	java/lang/Exception
    //   238	246	395	java/lang/Exception
    //   257	263	395	java/lang/Exception
    //   274	290	395	java/lang/Exception
    //   301	306	395	java/lang/Exception
    //   317	330	395	java/lang/Exception
    //   372	381	395	java/lang/Exception
    //   115	148	403	finally
    //   115	148	414	java/lang/Exception
    //   159	167	476	finally
    //   182	192	476	finally
    //   203	213	476	finally
    //   238	246	476	finally
    //   257	263	476	finally
    //   274	290	476	finally
    //   301	306	476	finally
    //   317	330	476	finally
    //   372	381	476	finally
    //   431	438	476	finally
    //   451	457	476	finally
  }
  
  /* Error */
  public final boolean f(m.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 203	va/d:g	(Lm/e;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_1
    //   11: invokevirtual 207	m/e:e	()Z
    //   14: istore_2
    //   15: aconst_null
    //   16: astore_3
    //   17: aconst_null
    //   18: astore 4
    //   20: iload_2
    //   21: ifeq +13 -> 34
    //   24: aload_1
    //   25: checkcast 209	wa/a
    //   28: aconst_null
    //   29: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   32: iconst_1
    //   33: ireturn
    //   34: aload_0
    //   35: getfield 169	va/d:i	Landroid/database/sqlite/SQLiteDatabase;
    //   38: ldc_w 298
    //   41: aconst_null
    //   42: invokevirtual 220	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   45: astore 5
    //   47: aload 5
    //   49: ifnull +132 -> 181
    //   52: aload 5
    //   54: invokeinterface 223 1 0
    //   59: ifle +122 -> 181
    //   62: aload 5
    //   64: invokeinterface 226 1 0
    //   69: ifeq +112 -> 181
    //   72: aload 5
    //   74: iconst_0
    //   75: invokeinterface 229 2 0
    //   80: istore 6
    //   82: aload_0
    //   83: getfield 59	va/d:d	I
    //   86: iconst_1
    //   87: if_icmplt +9 -> 96
    //   90: iconst_1
    //   91: istore 7
    //   93: goto +6 -> 99
    //   96: iconst_0
    //   97: istore 7
    //   99: iload 7
    //   101: ifeq +51 -> 152
    //   104: new 143	java/lang/StringBuilder
    //   107: astore 4
    //   109: aload 4
    //   111: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   114: aload 4
    //   116: aload_0
    //   117: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   120: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload 4
    //   126: ldc_w 300
    //   129: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload 4
    //   135: iload 6
    //   137: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: ldc -97
    //   143: aload 4
    //   145: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: invokestatic 167	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   151: pop
    //   152: aload_1
    //   153: checkcast 209	wa/a
    //   156: iload 6
    //   158: invokestatic 192	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   164: aload 5
    //   166: invokeinterface 200 1 0
    //   171: iconst_1
    //   172: ireturn
    //   173: astore_1
    //   174: aload 5
    //   176: astore 4
    //   178: goto +104 -> 282
    //   181: new 143	java/lang/StringBuilder
    //   184: astore 4
    //   186: aload 4
    //   188: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   191: aload 4
    //   193: aload_0
    //   194: invokevirtual 147	va/d:h	()Ljava/lang/String;
    //   197: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload 4
    //   203: ldc_w 302
    //   206: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: ldc -97
    //   212: aload 4
    //   214: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: invokestatic 242	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   220: pop
    //   221: aload_1
    //   222: checkcast 209	wa/a
    //   225: aconst_null
    //   226: invokevirtual 212	wa/a:a	(Ljava/io/Serializable;)V
    //   229: aload 5
    //   231: ifnull +10 -> 241
    //   234: aload 5
    //   236: invokeinterface 200 1 0
    //   241: iconst_1
    //   242: ireturn
    //   243: astore 8
    //   245: goto +12 -> 257
    //   248: astore_1
    //   249: goto +33 -> 282
    //   252: astore 8
    //   254: aload_3
    //   255: astore 5
    //   257: aload 5
    //   259: astore 4
    //   261: aload_0
    //   262: aload 8
    //   264: aload_1
    //   265: invokevirtual 245	va/d:i	(Ljava/lang/Exception;Lm/e;)V
    //   268: aload 5
    //   270: ifnull +10 -> 280
    //   273: aload 5
    //   275: invokeinterface 200 1 0
    //   280: iconst_0
    //   281: ireturn
    //   282: aload 4
    //   284: ifnull +10 -> 294
    //   287: aload 4
    //   289: invokeinterface 200 1 0
    //   294: aload_1
    //   295: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	296	0	this	d
    //   0	296	1	parame	m.e
    //   14	7	2	bool	boolean
    //   16	239	3	localObject1	Object
    //   18	270	4	localObject2	Object
    //   45	229	5	localObject3	Object
    //   80	77	6	i1	int
    //   91	9	7	i2	int
    //   243	1	8	localException1	Exception
    //   252	11	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   52	90	173	finally
    //   104	152	173	finally
    //   152	164	173	finally
    //   181	229	173	finally
    //   52	90	243	java/lang/Exception
    //   104	152	243	java/lang/Exception
    //   152	164	243	java/lang/Exception
    //   181	229	243	java/lang/Exception
    //   34	47	248	finally
    //   261	268	248	finally
    //   34	47	252	java/lang/Exception
  }
  
  public final boolean g(m.e parame)
  {
    String str = (String)parame.c("sql");
    Object localObject1 = new t(str, (List)parame.c("arguments"));
    int i1;
    if (d >= 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(h());
      ((StringBuilder)localObject2).append(localObject1);
      Log.d("Sqflite", ((StringBuilder)localObject2).toString());
    }
    Object localObject2 = parame.c("inTransaction");
    if ((localObject2 instanceof Boolean)) {
      localObject2 = (Boolean)localObject2;
    } else {
      localObject2 = null;
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = i;
      Object localObject4 = b;
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      if (localObject4 != null)
      {
        localObject4 = ((List)localObject4).iterator();
        while (((Iterator)localObject4).hasNext()) {
          ((ArrayList)localObject1).add(t.a(((Iterator)localObject4).next()));
        }
      }
      localSQLiteDatabase.execSQL(str, ((ArrayList)localObject1).toArray(new Object[0]));
      try
      {
        if (Boolean.TRUE.equals(localObject2)) {
          j += 1;
        } else if (Boolean.FALSE.equals(localObject2)) {
          j -= 1;
        }
        return true;
      }
      finally {}
      return false;
    }
    catch (Exception localException)
    {
      i(localException, parame);
    }
  }
  
  public final String h()
  {
    StringBuilder localStringBuilder1 = f.l("[");
    Thread localThread = Thread.currentThread();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(c);
    localStringBuilder2.append(",");
    localStringBuilder2.append(localThread.getName());
    localStringBuilder2.append("(");
    localStringBuilder2.append(localThread.getId());
    localStringBuilder2.append(")");
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder1.append("] ");
    return localStringBuilder1.toString();
  }
  
  public final void i(Exception paramException, m.e parame)
  {
    HashMap localHashMap;
    if ((paramException instanceof SQLiteCantOpenDatabaseException))
    {
      paramException = f.l("open_failed ");
      paramException.append(b);
      paramException = paramException.toString();
      localHashMap = null;
    }
    else
    {
      boolean bool = paramException instanceof SQLException;
      paramException = paramException.getMessage();
      localHashMap = b.Y(parame);
    }
    ((wa.a)parame).b(paramException, localHashMap);
  }
  
  public final boolean j()
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
  
  public final void k()
  {
    if (n == null)
    {
      Context localContext = e;
      boolean bool1 = false;
      try
      {
        Object localObject1 = localContext.getPackageName();
        if (Build.VERSION.SDK_INT >= 33) {
          localObject1 = localContext.getPackageManager().getApplicationInfo((String)localObject1, PackageManager.ApplicationInfoFlags.of(128L));
        } else {
          localObject1 = localContext.getPackageManager().getApplicationInfo((String)localObject1, 128);
        }
        boolean bool2 = metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false);
        if (bool2) {
          bool1 = true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
      Object localObject2 = Boolean.valueOf(bool1);
      n = (Boolean)localObject2;
      if ((((Boolean)localObject2).booleanValue()) && (m0.O(d)))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(h());
        ((StringBuilder)localObject2).append("[sqflite] WAL enabled");
        Log.d("Sqflite", ((StringBuilder)localObject2).toString());
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
  
  public final void l(c paramc, Runnable paramRunnable)
  {
    paramc = (Integer)paramc.c("transactionId");
    Integer localInteger = l;
    if (localInteger == null)
    {
      paramRunnable.run();
    }
    else if ((paramc != null) && ((paramc.equals(localInteger)) || (paramc.intValue() == -1)))
    {
      paramRunnable.run();
      if ((l == null) && (!f.isEmpty())) {
        h.a(this, new u.a(this, 17));
      }
    }
    else
    {
      paramc = new wa.e(paramRunnable);
      f.add(paramc);
    }
  }
}

/* Location:
 * Qualified Name:     va.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */