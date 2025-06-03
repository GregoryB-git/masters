package x0;

import F0.L;
import F0.r;
import F0.s;
import F0.x;
import Y0.f;
import g0.a;

public final class d
  implements F
{
  public final x a;
  public r b;
  public s c;
  
  public d(x paramx)
  {
    a = paramx;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    ((r)a.e(b)).a(paramLong1, paramLong2);
  }
  
  /* Error */
  public void b(d0.i parami, android.net.Uri paramUri, java.util.Map paramMap, long paramLong1, long paramLong2, F0.t paramt)
  {
    // Byte code:
    //   0: new 57	F0/j
    //   3: dup
    //   4: aload_1
    //   5: lload 4
    //   7: lload 6
    //   9: invokespecial 60	F0/j:<init>	(Ld0/i;JJ)V
    //   12: astore_1
    //   13: aload_0
    //   14: aload_1
    //   15: putfield 62	x0/d:c	LF0/s;
    //   18: aload_0
    //   19: getfield 44	x0/d:b	LF0/r;
    //   22: ifnull +4 -> 26
    //   25: return
    //   26: aload_0
    //   27: getfield 19	x0/d:a	LF0/x;
    //   30: aload_2
    //   31: aload_3
    //   32: invokeinterface 67 3 0
    //   37: astore_3
    //   38: aload_3
    //   39: arraylength
    //   40: invokestatic 73	X2/v:S	(I)LX2/v$a;
    //   43: astore 9
    //   45: aload_3
    //   46: arraylength
    //   47: istore 10
    //   49: iconst_0
    //   50: istore 11
    //   52: iload 10
    //   54: iconst_1
    //   55: if_icmpne +13 -> 68
    //   58: aload_0
    //   59: aload_3
    //   60: iconst_0
    //   61: aaload
    //   62: putfield 44	x0/d:b	LF0/r;
    //   65: goto +191 -> 256
    //   68: aload_3
    //   69: arraylength
    //   70: istore 12
    //   72: iconst_0
    //   73: istore 10
    //   75: iload 10
    //   77: iload 12
    //   79: if_icmpge +170 -> 249
    //   82: aload_3
    //   83: iload 10
    //   85: aaload
    //   86: astore 13
    //   88: aload 13
    //   90: aload_1
    //   91: invokeinterface 76 2 0
    //   96: ifeq +26 -> 122
    //   99: aload_0
    //   100: aload 13
    //   102: putfield 44	x0/d:b	LF0/r;
    //   105: iconst_1
    //   106: invokestatic 79	g0/a:f	(Z)V
    //   109: aload_1
    //   110: invokeinterface 84 1 0
    //   115: goto +134 -> 249
    //   118: astore_2
    //   119: goto +61 -> 180
    //   122: aload 9
    //   124: aload 13
    //   126: invokeinterface 87 1 0
    //   131: invokevirtual 93	X2/v$a:j	(Ljava/lang/Iterable;)LX2/v$a;
    //   134: pop
    //   135: aload_0
    //   136: getfield 44	x0/d:b	LF0/r;
    //   139: ifnonnull +24 -> 163
    //   142: aload_1
    //   143: invokeinterface 97 1 0
    //   148: lload 4
    //   150: lcmp
    //   151: ifne +6 -> 157
    //   154: goto +9 -> 163
    //   157: iconst_0
    //   158: istore 14
    //   160: goto +6 -> 166
    //   163: iconst_1
    //   164: istore 14
    //   166: iload 14
    //   168: invokestatic 79	g0/a:f	(Z)V
    //   171: aload_1
    //   172: invokeinterface 84 1 0
    //   177: goto +66 -> 243
    //   180: aload_0
    //   181: getfield 44	x0/d:b	LF0/r;
    //   184: ifnonnull +19 -> 203
    //   187: iload 11
    //   189: istore 14
    //   191: aload_1
    //   192: invokeinterface 97 1 0
    //   197: lload 4
    //   199: lcmp
    //   200: ifne +6 -> 206
    //   203: iconst_1
    //   204: istore 14
    //   206: iload 14
    //   208: invokestatic 79	g0/a:f	(Z)V
    //   211: aload_1
    //   212: invokeinterface 84 1 0
    //   217: aload_2
    //   218: athrow
    //   219: astore 13
    //   221: aload_0
    //   222: getfield 44	x0/d:b	LF0/r;
    //   225: ifnonnull -62 -> 163
    //   228: aload_1
    //   229: invokeinterface 97 1 0
    //   234: lload 4
    //   236: lcmp
    //   237: ifne -80 -> 157
    //   240: goto -77 -> 163
    //   243: iinc 10 1
    //   246: goto -171 -> 75
    //   249: aload_0
    //   250: getfield 44	x0/d:b	LF0/r;
    //   253: ifnull +15 -> 268
    //   256: aload_0
    //   257: getfield 44	x0/d:b	LF0/r;
    //   260: aload 8
    //   262: invokeinterface 100 2 0
    //   267: return
    //   268: new 102	java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   275: astore_1
    //   276: aload_1
    //   277: ldc 105
    //   279: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_1
    //   284: ldc 111
    //   286: invokestatic 116	W2/h:g	(Ljava/lang/String;)LW2/h;
    //   289: aload_3
    //   290: invokestatic 120	X2/v:V	([Ljava/lang/Object;)LX2/v;
    //   293: new 122	x0/c
    //   296: dup
    //   297: invokespecial 123	x0/c:<init>	()V
    //   300: invokestatic 129	X2/E:k	(Ljava/util/List;LW2/g;)Ljava/util/List;
    //   303: invokevirtual 132	W2/h:d	(Ljava/lang/Iterable;)Ljava/lang/String;
    //   306: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload_1
    //   311: ldc -122
    //   313: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: new 136	x0/a0
    //   320: dup
    //   321: aload_1
    //   322: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: aload_2
    //   326: invokestatic 50	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   329: checkcast 141	android/net/Uri
    //   332: aload 9
    //   334: invokevirtual 144	X2/v$a:k	()LX2/v;
    //   337: invokespecial 147	x0/a0:<init>	(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V
    //   340: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	this	d
    //   0	341	1	parami	d0.i
    //   0	341	2	paramUri	android.net.Uri
    //   0	341	3	paramMap	java.util.Map
    //   0	341	4	paramLong1	long
    //   0	341	6	paramLong2	long
    //   0	341	8	paramt	F0.t
    //   43	290	9	locala	X2.v.a
    //   47	197	10	i	int
    //   50	138	11	bool1	boolean
    //   70	10	12	j	int
    //   86	39	13	localr	r
    //   219	1	13	localEOFException	java.io.EOFException
    //   158	49	14	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   88	105	118	finally
    //   122	135	118	finally
    //   88	105	219	java/io/EOFException
    //   122	135	219	java/io/EOFException
  }
  
  public int c(L paramL)
  {
    return ((r)a.e(b)).i((s)a.e(c), paramL);
  }
  
  public long d()
  {
    s locals = c;
    long l;
    if (locals != null) {
      l = locals.p();
    } else {
      l = -1L;
    }
    return l;
  }
  
  public void e()
  {
    r localr = b;
    if (localr == null) {
      return;
    }
    localr = localr.d();
    if ((localr instanceof f)) {
      ((f)localr).l();
    }
  }
  
  public void release()
  {
    r localr = b;
    if (localr != null)
    {
      localr.release();
      b = null;
    }
    c = null;
  }
}

/* Location:
 * Qualified Name:     x0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */