package hb;

import c4.x;
import gb.f3;
import java.io.IOException;
import java.net.Socket;
import xc.d;
import xc.f;
import xc.w;
import xc.z;

public final class a
  implements w
{
  public final Object a = new Object();
  public final f b = new f();
  public final f3 c;
  public final b.a d;
  public final int e;
  public boolean f = false;
  public boolean o = false;
  public boolean p = false;
  public w q;
  public Socket r;
  public boolean s;
  public int t;
  public int u;
  
  public a(f3 paramf3, b.a parama)
  {
    x6.b.y(paramf3, "executor");
    c = paramf3;
    x6.b.y(parama, "exceptionHandler");
    d = parama;
    e = 10000;
  }
  
  public final z c()
  {
    return z.d;
  }
  
  public final void close()
  {
    if (p) {
      return;
    }
    p = true;
    c.execute(new c());
  }
  
  public final void f(d paramd, Socket paramSocket)
  {
    boolean bool;
    if (q == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "AsyncSink's becomeConnected should only be called once.");
    q = paramd;
    r = paramSocket;
  }
  
  /* Error */
  public final void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	hb/a:p	Z
    //   4: ifne +83 -> 87
    //   7: invokestatic 103	pb/b:c	()V
    //   10: aload_0
    //   11: getfield 44	hb/a:a	Ljava/lang/Object;
    //   14: astore_1
    //   15: aload_1
    //   16: monitorenter
    //   17: aload_0
    //   18: getfield 53	hb/a:o	Z
    //   21: ifeq +13 -> 34
    //   24: aload_1
    //   25: monitorexit
    //   26: getstatic 106	pb/b:a	Lpb/a;
    //   29: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   32: pop
    //   33: return
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield 53	hb/a:o	Z
    //   39: aload_1
    //   40: monitorexit
    //   41: aload_0
    //   42: getfield 65	hb/a:c	Lgb/f3;
    //   45: astore_2
    //   46: new 10	hb/a$b
    //   49: astore_1
    //   50: aload_1
    //   51: aload_0
    //   52: invokespecial 111	hb/a$b:<init>	(Lhb/a;)V
    //   55: aload_2
    //   56: aload_1
    //   57: invokevirtual 88	gb/f3:execute	(Ljava/lang/Runnable;)V
    //   60: goto -34 -> 26
    //   63: astore_2
    //   64: aload_1
    //   65: monitorexit
    //   66: aload_2
    //   67: athrow
    //   68: astore_1
    //   69: getstatic 106	pb/b:a	Lpb/a;
    //   72: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   75: pop
    //   76: goto +9 -> 85
    //   79: astore_2
    //   80: aload_1
    //   81: aload_2
    //   82: invokevirtual 117	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   85: aload_1
    //   86: athrow
    //   87: new 119	java/io/IOException
    //   90: dup
    //   91: ldc 121
    //   93: invokespecial 124	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	a
    //   14	51	1	localObject1	Object
    //   68	18	1	localObject2	Object
    //   45	11	2	localf3	f3
    //   63	4	2	localObject3	Object
    //   79	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   17	26	63	finally
    //   34	41	63	finally
    //   64	66	63	finally
    //   10	17	68	finally
    //   41	60	68	finally
    //   66	68	68	finally
    //   69	76	79	finally
  }
  
  /* Error */
  public final void g0(f paramf, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc -128
    //   3: invokestatic 63	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   6: aload_0
    //   7: getfield 55	hb/a:p	Z
    //   10: ifne +207 -> 217
    //   13: invokestatic 103	pb/b:c	()V
    //   16: aload_0
    //   17: getfield 44	hb/a:a	Ljava/lang/Object;
    //   20: astore 4
    //   22: aload 4
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 49	hb/a:b	Lxc/f;
    //   29: aload_1
    //   30: lload_2
    //   31: invokevirtual 130	xc/f:g0	(Lxc/f;J)V
    //   34: aload_0
    //   35: getfield 132	hb/a:u	I
    //   38: aload_0
    //   39: getfield 134	hb/a:t	I
    //   42: iadd
    //   43: istore 5
    //   45: aload_0
    //   46: iload 5
    //   48: putfield 132	hb/a:u	I
    //   51: iconst_0
    //   52: istore 6
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield 134	hb/a:t	I
    //   59: aload_0
    //   60: getfield 136	hb/a:s	Z
    //   63: ifne +23 -> 86
    //   66: iload 5
    //   68: aload_0
    //   69: getfield 71	hb/a:e	I
    //   72: if_icmple +14 -> 86
    //   75: aload_0
    //   76: iconst_1
    //   77: putfield 136	hb/a:s	Z
    //   80: iconst_1
    //   81: istore 6
    //   83: goto +37 -> 120
    //   86: aload_0
    //   87: getfield 51	hb/a:f	Z
    //   90: ifne +95 -> 185
    //   93: aload_0
    //   94: getfield 53	hb/a:o	Z
    //   97: ifne +88 -> 185
    //   100: aload_0
    //   101: getfield 49	hb/a:b	Lxc/f;
    //   104: invokevirtual 140	xc/f:g	()J
    //   107: lconst_0
    //   108: lcmp
    //   109: ifgt +6 -> 115
    //   112: goto +73 -> 185
    //   115: aload_0
    //   116: iconst_1
    //   117: putfield 51	hb/a:f	Z
    //   120: aload 4
    //   122: monitorexit
    //   123: iload 6
    //   125: ifeq +36 -> 161
    //   128: aload_0
    //   129: getfield 98	hb/a:r	Ljava/net/Socket;
    //   132: invokevirtual 144	java/net/Socket:close	()V
    //   135: goto +14 -> 149
    //   138: astore_1
    //   139: aload_0
    //   140: getfield 69	hb/a:d	Lhb/b$a;
    //   143: aload_1
    //   144: invokeinterface 149 2 0
    //   149: getstatic 106	pb/b:a	Lpb/a;
    //   152: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   155: pop
    //   156: return
    //   157: astore_1
    //   158: goto +39 -> 197
    //   161: aload_0
    //   162: getfield 65	hb/a:c	Lgb/f3;
    //   165: astore 4
    //   167: new 8	hb/a$a
    //   170: astore_1
    //   171: aload_1
    //   172: aload_0
    //   173: invokespecial 150	hb/a$a:<init>	(Lhb/a;)V
    //   176: aload 4
    //   178: aload_1
    //   179: invokevirtual 88	gb/f3:execute	(Ljava/lang/Runnable;)V
    //   182: goto -33 -> 149
    //   185: aload 4
    //   187: monitorexit
    //   188: goto -39 -> 149
    //   191: astore_1
    //   192: aload 4
    //   194: monitorexit
    //   195: aload_1
    //   196: athrow
    //   197: getstatic 106	pb/b:a	Lpb/a;
    //   200: invokevirtual 110	java/lang/Object:getClass	()Ljava/lang/Class;
    //   203: pop
    //   204: goto +11 -> 215
    //   207: astore 4
    //   209: aload_1
    //   210: aload 4
    //   212: invokevirtual 117	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   215: aload_1
    //   216: athrow
    //   217: new 119	java/io/IOException
    //   220: dup
    //   221: ldc 121
    //   223: invokespecial 124	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   226: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	a
    //   0	227	1	paramf	f
    //   0	227	2	paramLong	long
    //   20	173	4	localObject	Object
    //   207	4	4	localThrowable	Throwable
    //   43	30	5	i	int
    //   52	72	6	j	int
    // Exception table:
    //   from	to	target	type
    //   128	135	138	java/io/IOException
    //   16	25	157	finally
    //   128	135	157	finally
    //   139	149	157	finally
    //   161	182	157	finally
    //   195	197	157	finally
    //   25	51	191	finally
    //   54	80	191	finally
    //   86	112	191	finally
    //   115	120	191	finally
    //   120	123	191	finally
    //   185	188	191	finally
    //   192	195	191	finally
    //   197	204	207	finally
  }
  
  public final class a
    extends a.e
  {
    public a()
    {
      super();
      pb.b.b();
    }
    
    /* Error */
    public final void a()
    {
      // Byte code:
      //   0: new 26	xc/f
      //   3: dup
      //   4: invokespecial 28	xc/f:<init>	()V
      //   7: astore_1
      //   8: invokestatic 31	pb/b:c	()V
      //   11: getstatic 34	pb/b:a	Lpb/a;
      //   14: astore_2
      //   15: aload_2
      //   16: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
      //   19: pop
      //   20: aload_0
      //   21: getfield 15	hb/a$a:b	Lhb/a;
      //   24: getfield 43	hb/a:a	Ljava/lang/Object;
      //   27: astore_3
      //   28: aload_3
      //   29: monitorenter
      //   30: aload_0
      //   31: getfield 15	hb/a$a:b	Lhb/a;
      //   34: getfield 46	hb/a:b	Lxc/f;
      //   37: astore 4
      //   39: aload_1
      //   40: aload 4
      //   42: aload 4
      //   44: invokevirtual 50	xc/f:g	()J
      //   47: invokevirtual 51	xc/f:g0	(Lxc/f;J)V
      //   50: aload_0
      //   51: getfield 15	hb/a$a:b	Lhb/a;
      //   54: astore 4
      //   56: aload 4
      //   58: iconst_0
      //   59: putfield 55	hb/a:f	Z
      //   62: aload 4
      //   64: getfield 59	hb/a:u	I
      //   67: istore 5
      //   69: aload_3
      //   70: monitorexit
      //   71: aload 4
      //   73: getfield 63	hb/a:q	Lxc/w;
      //   76: aload_1
      //   77: aload_1
      //   78: getfield 66	xc/f:b	J
      //   81: invokeinterface 69 4 0
      //   86: aload_0
      //   87: getfield 15	hb/a$a:b	Lhb/a;
      //   90: getfield 43	hb/a:a	Ljava/lang/Object;
      //   93: astore_3
      //   94: aload_3
      //   95: monitorenter
      //   96: aload_0
      //   97: getfield 15	hb/a$a:b	Lhb/a;
      //   100: astore_1
      //   101: aload_1
      //   102: aload_1
      //   103: getfield 59	hb/a:u	I
      //   106: iload 5
      //   108: isub
      //   109: putfield 59	hb/a:u	I
      //   112: aload_3
      //   113: monitorexit
      //   114: aload_2
      //   115: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
      //   118: pop
      //   119: return
      //   120: astore_2
      //   121: aload_3
      //   122: monitorexit
      //   123: aload_2
      //   124: athrow
      //   125: astore_2
      //   126: aload_3
      //   127: monitorexit
      //   128: aload_2
      //   129: athrow
      //   130: astore_3
      //   131: getstatic 34	pb/b:a	Lpb/a;
      //   134: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
      //   137: pop
      //   138: goto +9 -> 147
      //   141: astore_2
      //   142: aload_3
      //   143: aload_2
      //   144: invokevirtual 75	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   147: aload_3
      //   148: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	149	0	this	a
      //   7	96	1	localObject1	Object
      //   14	101	2	locala	pb.a
      //   120	4	2	localObject2	Object
      //   125	4	2	localObject3	Object
      //   141	3	2	localThrowable	Throwable
      //   27	100	3	localObject4	Object
      //   130	18	3	localObject5	Object
      //   37	35	4	localObject6	Object
      //   67	42	5	i	int
      // Exception table:
      //   from	to	target	type
      //   96	114	120	finally
      //   121	123	120	finally
      //   30	71	125	finally
      //   126	128	125	finally
      //   11	30	130	finally
      //   71	96	130	finally
      //   123	125	130	finally
      //   128	130	130	finally
      //   131	138	141	finally
    }
  }
  
  public final class b
    extends a.e
  {
    public b()
    {
      super();
      pb.b.b();
    }
    
    /* Error */
    public final void a()
    {
      // Byte code:
      //   0: new 25	xc/f
      //   3: dup
      //   4: invokespecial 27	xc/f:<init>	()V
      //   7: astore_1
      //   8: invokestatic 30	pb/b:c	()V
      //   11: getstatic 33	pb/b:a	Lpb/a;
      //   14: astore_2
      //   15: aload_2
      //   16: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
      //   19: pop
      //   20: aload_0
      //   21: getfield 15	hb/a$b:b	Lhb/a;
      //   24: getfield 42	hb/a:a	Ljava/lang/Object;
      //   27: astore_3
      //   28: aload_3
      //   29: monitorenter
      //   30: aload_0
      //   31: getfield 15	hb/a$b:b	Lhb/a;
      //   34: getfield 45	hb/a:b	Lxc/f;
      //   37: astore 4
      //   39: aload_1
      //   40: aload 4
      //   42: aload 4
      //   44: getfield 48	xc/f:b	J
      //   47: invokevirtual 52	xc/f:g0	(Lxc/f;J)V
      //   50: aload_0
      //   51: getfield 15	hb/a$b:b	Lhb/a;
      //   54: astore 4
      //   56: aload 4
      //   58: iconst_0
      //   59: putfield 56	hb/a:o	Z
      //   62: aload_3
      //   63: monitorexit
      //   64: aload 4
      //   66: getfield 60	hb/a:q	Lxc/w;
      //   69: aload_1
      //   70: aload_1
      //   71: getfield 48	xc/f:b	J
      //   74: invokeinterface 63 4 0
      //   79: aload_0
      //   80: getfield 15	hb/a$b:b	Lhb/a;
      //   83: getfield 60	hb/a:q	Lxc/w;
      //   86: invokeinterface 64 1 0
      //   91: aload_2
      //   92: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
      //   95: pop
      //   96: return
      //   97: astore_2
      //   98: aload_3
      //   99: monitorexit
      //   100: aload_2
      //   101: athrow
      //   102: astore_2
      //   103: getstatic 33	pb/b:a	Lpb/a;
      //   106: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
      //   109: pop
      //   110: goto +9 -> 119
      //   113: astore_3
      //   114: aload_2
      //   115: aload_3
      //   116: invokevirtual 70	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   119: aload_2
      //   120: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	121	0	this	b
      //   7	64	1	localf	f
      //   14	78	2	locala	pb.a
      //   97	4	2	localObject1	Object
      //   102	18	2	localObject2	Object
      //   27	72	3	localObject3	Object
      //   113	3	3	localThrowable	Throwable
      //   37	28	4	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   30	64	97	finally
      //   98	100	97	finally
      //   11	30	102	finally
      //   64	91	102	finally
      //   100	102	102	finally
      //   103	110	113	finally
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      try
      {
        Object localObject = a.this;
        w localw1 = q;
        if (localw1 != null)
        {
          localObject = b;
          long l = b;
          if (l > 0L) {
            localw1.g0((f)localObject, l);
          }
        }
      }
      catch (IOException localIOException1)
      {
        d.a(localIOException1);
      }
      b.getClass();
      try
      {
        w localw2 = q;
        if (localw2 != null) {
          localw2.close();
        }
      }
      catch (IOException localIOException2)
      {
        d.a(localIOException2);
      }
      try
      {
        Socket localSocket = r;
        if (localSocket != null) {
          localSocket.close();
        }
      }
      catch (IOException localIOException3)
      {
        d.a(localIOException3);
      }
    }
  }
  
  public final class d
    extends c
  {
    public d(jb.c paramc)
    {
      super();
    }
    
    public final void L(x paramx)
    {
      a locala = a.this;
      t += 1;
      a.L(paramx);
    }
    
    public final void R(int paramInt, jb.a parama)
    {
      a locala = a.this;
      t += 1;
      a.R(paramInt, parama);
    }
    
    public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        a locala = a.this;
        t += 1;
      }
      a.e(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public abstract class e
    implements Runnable
  {
    public e() {}
    
    public abstract void a();
    
    public final void run()
    {
      try
      {
        if (q != null)
        {
          a();
        }
        else
        {
          IOException localIOException = new java/io/IOException;
          localIOException.<init>("Unable to perform write due to unavailable sink.");
          throw localIOException;
        }
      }
      catch (Exception localException)
      {
        d.a(localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     hb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */