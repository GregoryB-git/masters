package gb;

import eb.e1;
import eb.g1;
import eb.j.b;
import eb.r;
import f;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import m.e;

public final class i2
  implements Closeable, a0
{
  public volatile boolean A = false;
  public a a;
  public int b;
  public final l3 c;
  public final r3 d;
  public r e;
  public w0 f;
  public byte[] o;
  public int p;
  public int q = 1;
  public int r = 5;
  public boolean s;
  public w t;
  public w u = new w();
  public long v;
  public boolean w = false;
  public int x = -1;
  public int y;
  public boolean z = false;
  
  public i2(a parama, int paramInt, l3 paraml3, r3 paramr3)
  {
    x6.b.y(parama, "sink");
    a = parama;
    e = localb;
    b = paramInt;
    c = paraml3;
    x6.b.y(paramr3, "transportTracer");
    d = paramr3;
  }
  
  /* Error */
  public final void C(u2 paramu2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 94
    //   3: invokestatic 77	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   6: iconst_0
    //   7: istore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: aload_0
    //   11: invokevirtual 98	gb/i2:isClosed	()Z
    //   14: ifne +19 -> 33
    //   17: aload_0
    //   18: getfield 68	gb/i2:z	Z
    //   21: ifeq +6 -> 27
    //   24: goto +9 -> 33
    //   27: iconst_0
    //   28: istore 4
    //   30: goto +6 -> 36
    //   33: iconst_1
    //   34: istore 4
    //   36: iload 4
    //   38: ifne +70 -> 108
    //   41: aload_0
    //   42: getfield 100	gb/i2:f	Lgb/w0;
    //   45: astore 5
    //   47: aload 5
    //   49: ifnull +33 -> 82
    //   52: aload 5
    //   54: getfield 104	gb/w0:q	Z
    //   57: iconst_1
    //   58: ixor
    //   59: ldc 106
    //   61: invokestatic 109	x6/b:I	(ZLjava/lang/String;)V
    //   64: aload 5
    //   66: getfield 111	gb/w0:a	Lgb/w;
    //   69: aload_1
    //   70: invokevirtual 114	gb/w:g	(Lgb/u2;)V
    //   73: aload 5
    //   75: iconst_0
    //   76: putfield 115	gb/w0:w	Z
    //   79: goto +11 -> 90
    //   82: aload_0
    //   83: getfield 62	gb/i2:u	Lgb/w;
    //   86: aload_1
    //   87: invokevirtual 114	gb/w:g	(Lgb/u2;)V
    //   90: aload_0
    //   91: invokevirtual 118	gb/i2:M	()V
    //   94: iload_3
    //   95: istore 4
    //   97: goto +14 -> 111
    //   100: astore 5
    //   102: iload_2
    //   103: istore 4
    //   105: goto +23 -> 128
    //   108: iconst_1
    //   109: istore 4
    //   111: iload 4
    //   113: ifeq +9 -> 122
    //   116: aload_1
    //   117: invokeinterface 123 1 0
    //   122: return
    //   123: astore 5
    //   125: iconst_1
    //   126: istore 4
    //   128: iload 4
    //   130: ifeq +9 -> 139
    //   133: aload_1
    //   134: invokeinterface 123 1 0
    //   139: aload 5
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	i2
    //   0	142	1	paramu2	u2
    //   7	96	2	i	int
    //   9	86	3	j	int
    //   28	101	4	k	int
    //   45	29	5	localw0	w0
    //   100	1	5	localObject1	Object
    //   123	17	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   90	94	100	finally
    //   10	24	123	finally
    //   41	47	123	finally
    //   52	79	123	finally
    //   82	90	123	finally
  }
  
  public final void H()
  {
    if (isClosed()) {
      return;
    }
    w0 localw0 = f;
    boolean bool;
    if (localw0 != null)
    {
      x6.b.I(q ^ true, "GzipInflatingBuffer is closed");
      bool = w;
    }
    else if (u.c == 0)
    {
      bool = true;
    }
    else
    {
      bool = false;
    }
    if (bool) {
      close();
    } else {
      z = true;
    }
  }
  
  public final void I(r paramr)
  {
    boolean bool;
    if (f == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "Already set full stream decompressor");
    e = paramr;
  }
  
  public final void M()
  {
    if (w) {
      return;
    }
    boolean bool = true;
    w = true;
    Object localObject2;
    try
    {
      for (;;)
      {
        if ((A) || (v <= 0L) || (!c0())) {
          break label129;
        }
        int i = q0.g.c(q);
        if (i == 0) {
          break label122;
        }
        if (i != 1) {
          break;
        }
        Q();
        v -= 1L;
      }
    }
    finally
    {
      for (;;)
      {
        break;
        localObject2 = new java/lang/AssertionError;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Invalid state: ");
        localStringBuilder.append(g.o(q));
        ((AssertionError)localObject2).<init>(localStringBuilder.toString());
        throw ((Throwable)localObject2);
        label122:
        b0();
        continue;
        label129:
        if (A)
        {
          close();
          w = false;
          return;
        }
        if (z)
        {
          localObject2 = f;
          if (localObject2 != null)
          {
            x6.b.I(true ^ q, "GzipInflatingBuffer is closed");
            bool = w;
          }
          else if (u.c != 0)
          {
            bool = false;
          }
          if (bool) {
            close();
          }
        }
        w = false;
        return;
      }
      w = false;
    }
  }
  
  public final void Q()
  {
    Object localObject1 = c;
    int i = x;
    long l = y;
    localObject1 = a;
    int j = localObject1.length;
    int k = 0;
    for (int m = 0; m < j; m++) {
      localObject1[m].h(i, l);
    }
    y = 0;
    Object localObject3;
    Object localObject2;
    if (s)
    {
      localObject3 = e;
      if (localObject3 != j.b.a) {
        try
        {
          localObject1 = t;
          Object localObject4 = v2.a;
          localObject4 = new gb/v2$a;
          ((v2.a)localObject4).<init>((u2)localObject1);
          localObject1 = new c(((r)localObject3).c((v2.a)localObject4), b, c);
        }
        catch (IOException localIOException)
        {
          throw new RuntimeException(localIOException);
        }
      } else {
        throw new g1(e1.m.g("Can't decode compressed gRPC message as compression not configured"));
      }
    }
    else
    {
      localObject2 = c;
      l = t.c;
      localObject2 = a;
      i = localObject2.length;
      for (m = k; m < i; m++) {
        localObject2[m].i(l);
      }
      localObject2 = t;
      localObject3 = v2.a;
      localObject2 = new v2.a((u2)localObject2);
    }
    t.getClass();
    t = null;
    a.a(new b((InputStream)localObject2));
    q = 1;
    r = 5;
  }
  
  public final void b0()
  {
    int i = t.readUnsignedByte();
    if ((i & 0xFE) == 0)
    {
      int j = 0;
      boolean bool;
      if ((i & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      s = bool;
      Object localObject = t;
      ((b)localObject).f(4);
      int k = ((w)localObject).readUnsignedByte();
      i = ((w)localObject).readUnsignedByte();
      int m = ((w)localObject).readUnsignedByte();
      i = ((w)localObject).readUnsignedByte() | k << 24 | i << 16 | m << 8;
      r = i;
      if ((i >= 0) && (i <= b))
      {
        i = x + 1;
        x = i;
        localObject = c.a;
        k = localObject.length;
        while (j < k)
        {
          localObject[j].g(i);
          j++;
        }
        localObject = d;
        b.b();
        a.a();
        q = 2;
        return;
      }
      throw new g1(e1.k.g(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", new Object[] { Integer.valueOf(b), Integer.valueOf(r) })));
    }
    throw new g1(e1.m.g("gRPC frame header malformed: reserved bits not zero"));
  }
  
  /* Error */
  public final boolean c0()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 187	gb/i2:t	Lgb/w;
    //   6: ifnonnull +16 -> 22
    //   9: new 59	gb/w
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial 60	gb/w:<init>	()V
    //   17: aload_0
    //   18: aload_2
    //   19: putfield 187	gb/i2:t	Lgb/w;
    //   22: iconst_0
    //   23: istore_3
    //   24: iload_3
    //   25: istore 4
    //   27: iload_3
    //   28: istore_1
    //   29: iload 4
    //   31: istore 5
    //   33: aload_0
    //   34: getfield 57	gb/i2:r	I
    //   37: aload_0
    //   38: getfield 187	gb/i2:t	Lgb/w;
    //   41: getfield 126	gb/w:c	I
    //   44: isub
    //   45: istore 6
    //   47: iload 6
    //   49: ifle +855 -> 904
    //   52: iload_3
    //   53: istore_1
    //   54: iload 4
    //   56: istore 5
    //   58: aload_0
    //   59: getfield 100	gb/i2:f	Lgb/w0;
    //   62: astore_2
    //   63: aload_2
    //   64: ifnull +702 -> 766
    //   67: iload_3
    //   68: istore 7
    //   70: iload 4
    //   72: istore 8
    //   74: iload_3
    //   75: istore 9
    //   77: iload 4
    //   79: istore 10
    //   81: iload_3
    //   82: istore_1
    //   83: iload 4
    //   85: istore 5
    //   87: aload_0
    //   88: getfield 296	gb/i2:o	[B
    //   91: astore_2
    //   92: aload_2
    //   93: ifnull +32 -> 125
    //   96: iload_3
    //   97: istore 7
    //   99: iload 4
    //   101: istore 8
    //   103: iload_3
    //   104: istore 9
    //   106: iload 4
    //   108: istore 10
    //   110: iload_3
    //   111: istore_1
    //   112: iload 4
    //   114: istore 5
    //   116: aload_0
    //   117: getfield 298	gb/i2:p	I
    //   120: aload_2
    //   121: arraylength
    //   122: if_icmpne +62 -> 184
    //   125: iload_3
    //   126: istore 7
    //   128: iload 4
    //   130: istore 8
    //   132: iload_3
    //   133: istore 9
    //   135: iload 4
    //   137: istore 10
    //   139: iload_3
    //   140: istore_1
    //   141: iload 4
    //   143: istore 5
    //   145: aload_0
    //   146: iload 6
    //   148: ldc_w 299
    //   151: invokestatic 305	java/lang/Math:min	(II)I
    //   154: newarray <illegal type>
    //   156: putfield 296	gb/i2:o	[B
    //   159: iload_3
    //   160: istore 7
    //   162: iload 4
    //   164: istore 8
    //   166: iload_3
    //   167: istore 9
    //   169: iload 4
    //   171: istore 10
    //   173: iload_3
    //   174: istore_1
    //   175: iload 4
    //   177: istore 5
    //   179: aload_0
    //   180: iconst_0
    //   181: putfield 298	gb/i2:p	I
    //   184: iload_3
    //   185: istore 7
    //   187: iload 4
    //   189: istore 8
    //   191: iload_3
    //   192: istore 9
    //   194: iload 4
    //   196: istore 10
    //   198: iload_3
    //   199: istore_1
    //   200: iload 4
    //   202: istore 5
    //   204: iload 6
    //   206: aload_0
    //   207: getfield 296	gb/i2:o	[B
    //   210: arraylength
    //   211: aload_0
    //   212: getfield 298	gb/i2:p	I
    //   215: isub
    //   216: invokestatic 305	java/lang/Math:min	(II)I
    //   219: istore 6
    //   221: iload_3
    //   222: istore 7
    //   224: iload 4
    //   226: istore 8
    //   228: iload_3
    //   229: istore 9
    //   231: iload 4
    //   233: istore 10
    //   235: iload_3
    //   236: istore_1
    //   237: iload 4
    //   239: istore 5
    //   241: aload_0
    //   242: getfield 100	gb/i2:f	Lgb/w0;
    //   245: aload_0
    //   246: getfield 296	gb/i2:o	[B
    //   249: aload_0
    //   250: getfield 298	gb/i2:p	I
    //   253: iload 6
    //   255: invokevirtual 308	gb/w0:f	([BII)I
    //   258: istore 6
    //   260: iload_3
    //   261: istore 7
    //   263: iload 4
    //   265: istore 8
    //   267: iload_3
    //   268: istore 9
    //   270: iload 4
    //   272: istore 10
    //   274: iload_3
    //   275: istore_1
    //   276: iload 4
    //   278: istore 5
    //   280: aload_0
    //   281: getfield 100	gb/i2:f	Lgb/w0;
    //   284: astore_2
    //   285: iload_3
    //   286: istore 7
    //   288: iload 4
    //   290: istore 8
    //   292: iload_3
    //   293: istore 9
    //   295: iload 4
    //   297: istore 10
    //   299: iload_3
    //   300: istore_1
    //   301: iload 4
    //   303: istore 5
    //   305: aload_2
    //   306: getfield 310	gb/w0:u	I
    //   309: istore 11
    //   311: iload_3
    //   312: istore 7
    //   314: iload 4
    //   316: istore 8
    //   318: iload_3
    //   319: istore 9
    //   321: iload 4
    //   323: istore 10
    //   325: iload_3
    //   326: istore_1
    //   327: iload 4
    //   329: istore 5
    //   331: aload_2
    //   332: iconst_0
    //   333: putfield 310	gb/w0:u	I
    //   336: iload_3
    //   337: iload 11
    //   339: iadd
    //   340: istore_3
    //   341: iload_3
    //   342: istore 7
    //   344: iload 4
    //   346: istore 8
    //   348: iload_3
    //   349: istore 9
    //   351: iload 4
    //   353: istore 10
    //   355: iload_3
    //   356: istore_1
    //   357: iload 4
    //   359: istore 5
    //   361: aload_2
    //   362: getfield 312	gb/w0:v	I
    //   365: istore 11
    //   367: iload_3
    //   368: istore 7
    //   370: iload 4
    //   372: istore 8
    //   374: iload_3
    //   375: istore 9
    //   377: iload 4
    //   379: istore 10
    //   381: iload_3
    //   382: istore_1
    //   383: iload 4
    //   385: istore 5
    //   387: aload_2
    //   388: iconst_0
    //   389: putfield 312	gb/w0:v	I
    //   392: iload 4
    //   394: iload 11
    //   396: iadd
    //   397: istore 4
    //   399: iload 6
    //   401: ifne +76 -> 477
    //   404: iload_3
    //   405: ifle +70 -> 475
    //   408: aload_0
    //   409: getfield 79	gb/i2:a	Lgb/i2$a;
    //   412: iload_3
    //   413: invokeinterface 314 2 0
    //   418: aload_0
    //   419: getfield 55	gb/i2:q	I
    //   422: iconst_2
    //   423: if_icmpne +52 -> 475
    //   426: aload_0
    //   427: getfield 100	gb/i2:f	Lgb/w0;
    //   430: ifnull +24 -> 454
    //   433: aload_0
    //   434: getfield 85	gb/i2:c	Lgb/l3;
    //   437: iload 4
    //   439: i2l
    //   440: invokevirtual 316	gb/l3:a	(J)V
    //   443: aload_0
    //   444: getfield 172	gb/i2:y	I
    //   447: iload 4
    //   449: iadd
    //   450: istore_1
    //   451: goto +19 -> 470
    //   454: aload_0
    //   455: getfield 85	gb/i2:c	Lgb/l3;
    //   458: iload_3
    //   459: i2l
    //   460: invokevirtual 316	gb/l3:a	(J)V
    //   463: aload_0
    //   464: getfield 172	gb/i2:y	I
    //   467: iload_3
    //   468: iadd
    //   469: istore_1
    //   470: aload_0
    //   471: iload_1
    //   472: putfield 172	gb/i2:y	I
    //   475: iconst_0
    //   476: ireturn
    //   477: iload_3
    //   478: istore 7
    //   480: iload 4
    //   482: istore 8
    //   484: iload_3
    //   485: istore 9
    //   487: iload 4
    //   489: istore 10
    //   491: iload_3
    //   492: istore_1
    //   493: iload 4
    //   495: istore 5
    //   497: aload_0
    //   498: getfield 187	gb/i2:t	Lgb/w;
    //   501: astore_2
    //   502: iload_3
    //   503: istore 7
    //   505: iload 4
    //   507: istore 8
    //   509: iload_3
    //   510: istore 9
    //   512: iload 4
    //   514: istore 10
    //   516: iload_3
    //   517: istore_1
    //   518: iload 4
    //   520: istore 5
    //   522: aload_0
    //   523: getfield 296	gb/i2:o	[B
    //   526: astore 12
    //   528: iload_3
    //   529: istore 7
    //   531: iload 4
    //   533: istore 8
    //   535: iload_3
    //   536: istore 9
    //   538: iload 4
    //   540: istore 10
    //   542: iload_3
    //   543: istore_1
    //   544: iload 4
    //   546: istore 5
    //   548: aload_0
    //   549: getfield 298	gb/i2:p	I
    //   552: istore 11
    //   554: iload_3
    //   555: istore 7
    //   557: iload 4
    //   559: istore 8
    //   561: iload_3
    //   562: istore 9
    //   564: iload 4
    //   566: istore 10
    //   568: iload_3
    //   569: istore_1
    //   570: iload 4
    //   572: istore 5
    //   574: getstatic 192	gb/v2:a	Lgb/v2$b;
    //   577: astore 13
    //   579: iload_3
    //   580: istore 7
    //   582: iload 4
    //   584: istore 8
    //   586: iload_3
    //   587: istore 9
    //   589: iload 4
    //   591: istore 10
    //   593: iload_3
    //   594: istore_1
    //   595: iload 4
    //   597: istore 5
    //   599: new 318	gb/v2$b
    //   602: astore 13
    //   604: iload_3
    //   605: istore 7
    //   607: iload 4
    //   609: istore 8
    //   611: iload_3
    //   612: istore 9
    //   614: iload 4
    //   616: istore 10
    //   618: iload_3
    //   619: istore_1
    //   620: iload 4
    //   622: istore 5
    //   624: aload 13
    //   626: aload 12
    //   628: iload 11
    //   630: iload 6
    //   632: invokespecial 321	gb/v2$b:<init>	([BII)V
    //   635: iload_3
    //   636: istore 7
    //   638: iload 4
    //   640: istore 8
    //   642: iload_3
    //   643: istore 9
    //   645: iload 4
    //   647: istore 10
    //   649: iload_3
    //   650: istore_1
    //   651: iload 4
    //   653: istore 5
    //   655: aload_2
    //   656: aload 13
    //   658: invokevirtual 114	gb/w:g	(Lgb/u2;)V
    //   661: iload_3
    //   662: istore 7
    //   664: iload 4
    //   666: istore 8
    //   668: iload_3
    //   669: istore 9
    //   671: iload 4
    //   673: istore 10
    //   675: iload_3
    //   676: istore_1
    //   677: iload 4
    //   679: istore 5
    //   681: aload_0
    //   682: aload_0
    //   683: getfield 298	gb/i2:p	I
    //   686: iload 6
    //   688: iadd
    //   689: putfield 298	gb/i2:p	I
    //   692: goto -665 -> 27
    //   695: astore_2
    //   696: iload 7
    //   698: istore_1
    //   699: iload 8
    //   701: istore 5
    //   703: new 206	java/lang/RuntimeException
    //   706: astore 12
    //   708: iload 7
    //   710: istore_1
    //   711: iload 8
    //   713: istore 5
    //   715: aload 12
    //   717: aload_2
    //   718: invokespecial 209	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   721: iload 7
    //   723: istore_1
    //   724: iload 8
    //   726: istore 5
    //   728: aload 12
    //   730: athrow
    //   731: astore 12
    //   733: iload 9
    //   735: istore_1
    //   736: iload 10
    //   738: istore 5
    //   740: new 206	java/lang/RuntimeException
    //   743: astore_2
    //   744: iload 9
    //   746: istore_1
    //   747: iload 10
    //   749: istore 5
    //   751: aload_2
    //   752: aload 12
    //   754: invokespecial 209	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   757: iload 9
    //   759: istore_1
    //   760: iload 10
    //   762: istore 5
    //   764: aload_2
    //   765: athrow
    //   766: iload_3
    //   767: istore_1
    //   768: iload 4
    //   770: istore 5
    //   772: aload_0
    //   773: getfield 62	gb/i2:u	Lgb/w;
    //   776: getfield 126	gb/w:c	I
    //   779: istore 9
    //   781: iload 9
    //   783: ifne +76 -> 859
    //   786: iload_3
    //   787: ifle +70 -> 857
    //   790: aload_0
    //   791: getfield 79	gb/i2:a	Lgb/i2$a;
    //   794: iload_3
    //   795: invokeinterface 314 2 0
    //   800: aload_0
    //   801: getfield 55	gb/i2:q	I
    //   804: iconst_2
    //   805: if_icmpne +52 -> 857
    //   808: aload_0
    //   809: getfield 100	gb/i2:f	Lgb/w0;
    //   812: ifnull +24 -> 836
    //   815: aload_0
    //   816: getfield 85	gb/i2:c	Lgb/l3;
    //   819: iload 4
    //   821: i2l
    //   822: invokevirtual 316	gb/l3:a	(J)V
    //   825: aload_0
    //   826: getfield 172	gb/i2:y	I
    //   829: iload 4
    //   831: iadd
    //   832: istore_1
    //   833: goto +19 -> 852
    //   836: aload_0
    //   837: getfield 85	gb/i2:c	Lgb/l3;
    //   840: iload_3
    //   841: i2l
    //   842: invokevirtual 316	gb/l3:a	(J)V
    //   845: aload_0
    //   846: getfield 172	gb/i2:y	I
    //   849: iload_3
    //   850: iadd
    //   851: istore_1
    //   852: aload_0
    //   853: iload_1
    //   854: putfield 172	gb/i2:y	I
    //   857: iconst_0
    //   858: ireturn
    //   859: iload_3
    //   860: istore_1
    //   861: iload 4
    //   863: istore 5
    //   865: iload 6
    //   867: iload 9
    //   869: invokestatic 305	java/lang/Math:min	(II)I
    //   872: istore 9
    //   874: iload_3
    //   875: iload 9
    //   877: iadd
    //   878: istore_3
    //   879: iload_3
    //   880: istore_1
    //   881: iload 4
    //   883: istore 5
    //   885: aload_0
    //   886: getfield 187	gb/i2:t	Lgb/w;
    //   889: aload_0
    //   890: getfield 62	gb/i2:u	Lgb/w;
    //   893: iload 9
    //   895: invokevirtual 324	gb/w:r	(I)Lgb/u2;
    //   898: invokevirtual 114	gb/w:g	(Lgb/u2;)V
    //   901: goto -874 -> 27
    //   904: iload_3
    //   905: ifle +70 -> 975
    //   908: aload_0
    //   909: getfield 79	gb/i2:a	Lgb/i2$a;
    //   912: iload_3
    //   913: invokeinterface 314 2 0
    //   918: aload_0
    //   919: getfield 55	gb/i2:q	I
    //   922: iconst_2
    //   923: if_icmpne +52 -> 975
    //   926: aload_0
    //   927: getfield 100	gb/i2:f	Lgb/w0;
    //   930: ifnull +24 -> 954
    //   933: aload_0
    //   934: getfield 85	gb/i2:c	Lgb/l3;
    //   937: iload 4
    //   939: i2l
    //   940: invokevirtual 316	gb/l3:a	(J)V
    //   943: aload_0
    //   944: getfield 172	gb/i2:y	I
    //   947: iload 4
    //   949: iadd
    //   950: istore_1
    //   951: goto +19 -> 970
    //   954: aload_0
    //   955: getfield 85	gb/i2:c	Lgb/l3;
    //   958: iload_3
    //   959: i2l
    //   960: invokevirtual 316	gb/l3:a	(J)V
    //   963: aload_0
    //   964: getfield 172	gb/i2:y	I
    //   967: iload_3
    //   968: iadd
    //   969: istore_1
    //   970: aload_0
    //   971: iload_1
    //   972: putfield 172	gb/i2:y	I
    //   975: iconst_1
    //   976: ireturn
    //   977: astore_2
    //   978: goto +7 -> 985
    //   981: astore_2
    //   982: iconst_0
    //   983: istore 5
    //   985: iload_1
    //   986: ifle +70 -> 1056
    //   989: aload_0
    //   990: getfield 79	gb/i2:a	Lgb/i2$a;
    //   993: iload_1
    //   994: invokeinterface 314 2 0
    //   999: aload_0
    //   1000: getfield 55	gb/i2:q	I
    //   1003: iconst_2
    //   1004: if_icmpne +52 -> 1056
    //   1007: aload_0
    //   1008: getfield 100	gb/i2:f	Lgb/w0;
    //   1011: ifnull +24 -> 1035
    //   1014: aload_0
    //   1015: getfield 85	gb/i2:c	Lgb/l3;
    //   1018: iload 5
    //   1020: i2l
    //   1021: invokevirtual 316	gb/l3:a	(J)V
    //   1024: aload_0
    //   1025: getfield 172	gb/i2:y	I
    //   1028: iload 5
    //   1030: iadd
    //   1031: istore_1
    //   1032: goto +19 -> 1051
    //   1035: aload_0
    //   1036: getfield 85	gb/i2:c	Lgb/l3;
    //   1039: iload_1
    //   1040: i2l
    //   1041: invokevirtual 316	gb/l3:a	(J)V
    //   1044: aload_0
    //   1045: getfield 172	gb/i2:y	I
    //   1048: iload_1
    //   1049: iadd
    //   1050: istore_1
    //   1051: aload_0
    //   1052: iload_1
    //   1053: putfield 172	gb/i2:y	I
    //   1056: aload_2
    //   1057: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1058	0	this	i2
    //   1	1052	1	i	int
    //   12	644	2	localObject1	Object
    //   695	23	2	localDataFormatException	java.util.zip.DataFormatException
    //   743	22	2	localRuntimeException	RuntimeException
    //   977	1	2	localObject2	Object
    //   981	76	2	localObject3	Object
    //   23	946	3	j	int
    //   25	925	4	k	int
    //   31	1000	5	m	int
    //   45	821	6	n	int
    //   68	654	7	i1	int
    //   72	653	8	i2	int
    //   75	819	9	i3	int
    //   79	682	10	i4	int
    //   309	320	11	i5	int
    //   526	203	12	localObject4	Object
    //   731	22	12	localIOException	IOException
    //   577	80	13	localb	v2.b
    // Exception table:
    //   from	to	target	type
    //   87	92	695	java/util/zip/DataFormatException
    //   116	125	695	java/util/zip/DataFormatException
    //   145	159	695	java/util/zip/DataFormatException
    //   179	184	695	java/util/zip/DataFormatException
    //   204	221	695	java/util/zip/DataFormatException
    //   241	260	695	java/util/zip/DataFormatException
    //   280	285	695	java/util/zip/DataFormatException
    //   305	311	695	java/util/zip/DataFormatException
    //   331	336	695	java/util/zip/DataFormatException
    //   361	367	695	java/util/zip/DataFormatException
    //   387	392	695	java/util/zip/DataFormatException
    //   497	502	695	java/util/zip/DataFormatException
    //   522	528	695	java/util/zip/DataFormatException
    //   548	554	695	java/util/zip/DataFormatException
    //   574	579	695	java/util/zip/DataFormatException
    //   599	604	695	java/util/zip/DataFormatException
    //   624	635	695	java/util/zip/DataFormatException
    //   655	661	695	java/util/zip/DataFormatException
    //   681	692	695	java/util/zip/DataFormatException
    //   87	92	731	java/io/IOException
    //   116	125	731	java/io/IOException
    //   145	159	731	java/io/IOException
    //   179	184	731	java/io/IOException
    //   204	221	731	java/io/IOException
    //   241	260	731	java/io/IOException
    //   280	285	731	java/io/IOException
    //   305	311	731	java/io/IOException
    //   331	336	731	java/io/IOException
    //   361	367	731	java/io/IOException
    //   387	392	731	java/io/IOException
    //   497	502	731	java/io/IOException
    //   522	528	731	java/io/IOException
    //   548	554	731	java/io/IOException
    //   574	579	731	java/io/IOException
    //   599	604	731	java/io/IOException
    //   624	635	731	java/io/IOException
    //   655	661	731	java/io/IOException
    //   681	692	731	java/io/IOException
    //   33	47	977	finally
    //   58	63	977	finally
    //   87	92	977	finally
    //   116	125	977	finally
    //   145	159	977	finally
    //   179	184	977	finally
    //   204	221	977	finally
    //   241	260	977	finally
    //   280	285	977	finally
    //   305	311	977	finally
    //   331	336	977	finally
    //   361	367	977	finally
    //   387	392	977	finally
    //   497	502	977	finally
    //   522	528	977	finally
    //   548	554	977	finally
    //   574	579	977	finally
    //   599	604	977	finally
    //   624	635	977	finally
    //   655	661	977	finally
    //   681	692	977	finally
    //   703	708	977	finally
    //   715	721	977	finally
    //   728	731	977	finally
    //   740	744	977	finally
    //   751	757	977	finally
    //   764	766	977	finally
    //   772	781	977	finally
    //   865	874	977	finally
    //   885	901	977	finally
    //   2	22	981	finally
  }
  
  public final void close()
  {
    if (isClosed()) {
      return;
    }
    Object localObject1 = t;
    boolean bool1 = false;
    boolean bool2;
    if ((localObject1 != null) && (c > 0)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    try
    {
      localObject1 = f;
      boolean bool3 = bool2;
      if (localObject1 != null)
      {
        if (!bool2)
        {
          x6.b.I(q ^ true, "GzipInflatingBuffer is closed");
          int i;
          if ((c.d() == 0) && (p == 1)) {
            i = 0;
          } else {
            i = 1;
          }
          bool2 = bool1;
          if (i == 0) {}
        }
        else
        {
          bool2 = true;
        }
        f.close();
        bool3 = bool2;
      }
      localObject1 = u;
      if (localObject1 != null) {
        ((w)localObject1).close();
      }
      localObject1 = t;
      if (localObject1 != null) {
        ((w)localObject1).close();
      }
      f = null;
      u = null;
      t = null;
      a.c(bool3);
      return;
    }
    finally
    {
      f = null;
      u = null;
      t = null;
    }
  }
  
  public final void f(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.s("numMessages must be > 0", bool);
    if (isClosed()) {
      return;
    }
    v += paramInt;
    M();
  }
  
  public final void g(int paramInt)
  {
    b = paramInt;
  }
  
  public final boolean isClosed()
  {
    boolean bool;
    if ((u == null) && (f == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void a(n3.a parama);
    
    public abstract void c(boolean paramBoolean);
    
    public abstract void d(int paramInt);
    
    public abstract void e(Throwable paramThrowable);
  }
  
  public static final class b
    implements n3.a
  {
    public InputStream a;
    
    public b(InputStream paramInputStream)
    {
      a = paramInputStream;
    }
    
    public final InputStream next()
    {
      InputStream localInputStream = a;
      a = null;
      return localInputStream;
    }
  }
  
  public static final class c
    extends FilterInputStream
  {
    public final int a;
    public final l3 b;
    public long c;
    public long d;
    public long e = -1L;
    
    public c(InputStream paramInputStream, int paramInt, l3 paraml3)
    {
      super();
      a = paramInt;
      b = paraml3;
    }
    
    public final void f()
    {
      long l1 = d;
      long l2 = c;
      if (l1 > l2)
      {
        e[] arrayOfe = b.a;
        int i = arrayOfe.length;
        for (int j = 0; j < i; j++) {
          arrayOfe[j].i(l1 - l2);
        }
        c = d;
      }
    }
    
    public final void g()
    {
      if (d <= a) {
        return;
      }
      e1 locale1 = e1.k;
      StringBuilder localStringBuilder = f.l("Decompressed gRPC message exceeds maximum size ");
      localStringBuilder.append(a);
      throw new g1(locale1.g(localStringBuilder.toString()));
    }
    
    public final void mark(int paramInt)
    {
      try
      {
        in.mark(paramInt);
        e = d;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final int read()
    {
      int i = in.read();
      if (i != -1) {
        d += 1L;
      }
      g();
      f();
      return i;
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = in.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1) {
        d += paramInt1;
      }
      g();
      f();
      return paramInt1;
    }
    
    public final void reset()
    {
      try
      {
        if (in.markSupported())
        {
          if (e != -1L)
          {
            in.reset();
            d = e;
            return;
          }
          localIOException = new java/io/IOException;
          localIOException.<init>("Mark not set");
          throw localIOException;
        }
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("Mark not supported");
        throw localIOException;
      }
      finally {}
    }
    
    public final long skip(long paramLong)
    {
      paramLong = in.skip(paramLong);
      d += paramLong;
      g();
      f();
      return paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     gb.i2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */