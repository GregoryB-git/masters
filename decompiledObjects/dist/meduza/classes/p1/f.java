package p1;

import android.database.Cursor;
import java.io.Closeable;
import rb.h;
import tb.g;
import x6.b;

public final class f
  implements Runnable
{
  public f(e parame) {}
  
  public final g a()
  {
    Object localObject1 = a;
    g localg = new g();
    localObject1 = a.l(new t1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
    try
    {
      while (((Cursor)localObject1).moveToNext()) {
        localg.add(Integer.valueOf(((Cursor)localObject1).getInt(0)));
      }
      h localh = h.a;
      b.L((Closeable)localObject1, null);
      localg = va.a.a(localg);
      if ((localg.isEmpty() ^ true)) {
        if (a.h != null)
        {
          localObject1 = a.h;
          if (localObject1 != null) {
            ((t1.f)localObject1).p();
          } else {
            throw new IllegalArgumentException("Required value was null.".toString());
          }
        }
        else
        {
          throw new IllegalStateException("Required value was null.".toString());
        }
      }
      return localg;
    }
    finally
    {
      try
      {
        throw localThrowable;
      }
      finally
      {
        b.L((Closeable)localObject1, localThrowable);
      }
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	p1/f:a	Lp1/e;
    //   4: getfield 25	p1/e:a	Lp1/j;
    //   7: getfield 106	p1/j:i	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   10: invokevirtual 112	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   13: astore_1
    //   14: aload_1
    //   15: ldc 114
    //   17: invokestatic 120	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_1
    //   21: invokeinterface 125 1 0
    //   26: aload_0
    //   27: getfield 12	p1/f:a	Lp1/e;
    //   30: invokevirtual 128	p1/e:b	()Z
    //   33: istore_2
    //   34: iload_2
    //   35: ifne +18 -> 53
    //   38: aload_1
    //   39: invokeinterface 131 1 0
    //   44: aload_0
    //   45: getfield 12	p1/f:a	Lp1/e;
    //   48: invokevirtual 135	java/lang/Object:getClass	()Ljava/lang/Class;
    //   51: pop
    //   52: return
    //   53: aload_0
    //   54: getfield 12	p1/f:a	Lp1/e;
    //   57: getfield 139	p1/e:f	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   60: iconst_1
    //   61: iconst_0
    //   62: invokevirtual 145	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   65: ifne +6 -> 71
    //   68: goto -30 -> 38
    //   71: aload_0
    //   72: getfield 12	p1/f:a	Lp1/e;
    //   75: getfield 25	p1/e:a	Lp1/j;
    //   78: invokevirtual 149	p1/j:g	()Lt1/c;
    //   81: invokeinterface 155 1 0
    //   86: invokeinterface 160 1 0
    //   91: ifeq +6 -> 97
    //   94: goto -56 -> 38
    //   97: aload_0
    //   98: getfield 12	p1/f:a	Lp1/e;
    //   101: getfield 25	p1/e:a	Lp1/j;
    //   104: invokevirtual 149	p1/j:g	()Lt1/c;
    //   107: invokeinterface 155 1 0
    //   112: astore_3
    //   113: aload_3
    //   114: invokeinterface 163 1 0
    //   119: aload_0
    //   120: invokevirtual 165	p1/f:a	()Ltb/g;
    //   123: astore 4
    //   125: aload_3
    //   126: invokeinterface 168 1 0
    //   131: aload_3
    //   132: invokeinterface 171 1 0
    //   137: goto +54 -> 191
    //   140: astore 4
    //   142: aload_3
    //   143: invokeinterface 171 1 0
    //   148: aload 4
    //   150: athrow
    //   151: astore 4
    //   153: goto +140 -> 293
    //   156: astore 4
    //   158: ldc -83
    //   160: ldc -81
    //   162: aload 4
    //   164: invokestatic 181	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   167: pop
    //   168: getstatic 186	sb/u:a	Lsb/u;
    //   171: astore 4
    //   173: goto +18 -> 191
    //   176: astore 4
    //   178: ldc -83
    //   180: ldc -81
    //   182: aload 4
    //   184: invokestatic 181	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   187: pop
    //   188: goto -20 -> 168
    //   191: aload_1
    //   192: invokeinterface 131 1 0
    //   197: aload_0
    //   198: getfield 12	p1/f:a	Lp1/e;
    //   201: invokevirtual 135	java/lang/Object:getClass	()Ljava/lang/Class;
    //   204: pop
    //   205: aload 4
    //   207: invokeinterface 189 1 0
    //   212: iconst_1
    //   213: ixor
    //   214: ifeq +78 -> 292
    //   217: aload_0
    //   218: getfield 12	p1/f:a	Lp1/e;
    //   221: astore_3
    //   222: aload_3
    //   223: getfield 193	p1/e:k	Ln/b;
    //   226: astore_1
    //   227: aload_1
    //   228: monitorenter
    //   229: aload_3
    //   230: getfield 193	p1/e:k	Ln/b;
    //   233: invokevirtual 199	n/b:iterator	()Ljava/util/Iterator;
    //   236: astore_3
    //   237: aload_3
    //   238: checkcast 201	n/b$e
    //   241: astore 5
    //   243: aload 5
    //   245: invokevirtual 204	n/b$e:hasNext	()Z
    //   248: ifeq +27 -> 275
    //   251: aload 5
    //   253: invokevirtual 208	n/b$e:next	()Ljava/lang/Object;
    //   256: checkcast 210	java/util/Map$Entry
    //   259: invokeinterface 213 1 0
    //   264: checkcast 215	p1/e$d
    //   267: aload 4
    //   269: invokevirtual 218	p1/e$d:a	(Ljava/util/Set;)V
    //   272: goto -35 -> 237
    //   275: getstatic 63	rb/h:a	Lrb/h;
    //   278: astore 4
    //   280: aload_1
    //   281: monitorexit
    //   282: goto +10 -> 292
    //   285: astore 4
    //   287: aload_1
    //   288: monitorexit
    //   289: aload 4
    //   291: athrow
    //   292: return
    //   293: aload_1
    //   294: invokeinterface 131 1 0
    //   299: aload_0
    //   300: getfield 12	p1/f:a	Lp1/e;
    //   303: invokevirtual 135	java/lang/Object:getClass	()Ljava/lang/Class;
    //   306: pop
    //   307: aload 4
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	this	f
    //   13	281	1	localObject1	Object
    //   33	2	2	bool	boolean
    //   112	126	3	localObject2	Object
    //   123	1	4	localg	g
    //   140	9	4	localObject3	Object
    //   151	1	4	localObject4	Object
    //   156	7	4	localSQLiteException	android.database.sqlite.SQLiteException
    //   171	1	4	localu	sb.u
    //   176	92	4	localIllegalStateException	IllegalStateException
    //   278	1	4	localh	h
    //   285	23	4	localObject5	Object
    //   241	11	5	locale	n.b.e
    // Exception table:
    //   from	to	target	type
    //   119	131	140	finally
    //   26	34	151	finally
    //   53	68	151	finally
    //   71	94	151	finally
    //   97	119	151	finally
    //   131	137	151	finally
    //   142	151	151	finally
    //   158	168	151	finally
    //   168	173	151	finally
    //   178	188	151	finally
    //   26	34	156	android/database/sqlite/SQLiteException
    //   53	68	156	android/database/sqlite/SQLiteException
    //   71	94	156	android/database/sqlite/SQLiteException
    //   97	119	156	android/database/sqlite/SQLiteException
    //   131	137	156	android/database/sqlite/SQLiteException
    //   142	151	156	android/database/sqlite/SQLiteException
    //   26	34	176	java/lang/IllegalStateException
    //   53	68	176	java/lang/IllegalStateException
    //   71	94	176	java/lang/IllegalStateException
    //   97	119	176	java/lang/IllegalStateException
    //   131	137	176	java/lang/IllegalStateException
    //   142	151	176	java/lang/IllegalStateException
    //   229	237	285	finally
    //   237	272	285	finally
    //   275	280	285	finally
  }
}

/* Location:
 * Qualified Name:     p1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */