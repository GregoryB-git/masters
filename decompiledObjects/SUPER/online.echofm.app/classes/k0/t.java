package k0;

import D0.E;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import m0.N.f;
import m0.x;
import s0.c.a;
import s0.g;
import t0.k;
import t0.m.b;
import u0.c;
import z0.h;
import z0.i;

public class t
  implements c1
{
  public final Context a;
  public final k b;
  public int c;
  public long d;
  public boolean e;
  public t0.z f;
  public boolean g;
  public boolean h;
  
  public t(Context paramContext)
  {
    a = paramContext;
    b = new k(paramContext);
    c = 0;
    d = 5000L;
    f = t0.z.a;
  }
  
  public Y0[] a(Handler paramHandler, E paramE, x paramx, h paramh, u0.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    i(a, c, f, e, paramHandler, paramE, d, localArrayList);
    paramE = c(a, g, h);
    if (paramE != null) {
      b(a, c, f, e, paramE, paramHandler, paramx, localArrayList);
    }
    h(a, paramh, paramHandler.getLooper(), c, localArrayList);
    f(a, paramb, paramHandler.getLooper(), c, localArrayList);
    d(a, c, localArrayList);
    e(localArrayList);
    g(a, paramHandler, c, localArrayList);
    return (Y0[])localArrayList.toArray(new Y0[0]);
  }
  
  /* Error */
  public void b(Context paramContext, int paramInt, t0.z paramz, boolean paramBoolean, m0.z paramz1, Handler paramHandler, x paramx, ArrayList paramArrayList)
  {
    // Byte code:
    //   0: aload 8
    //   2: new 101	m0/b0
    //   5: dup
    //   6: aload_1
    //   7: aload_0
    //   8: invokevirtual 105	k0/t:j	()Lt0/m$b;
    //   11: aload_3
    //   12: iload 4
    //   14: aload 6
    //   16: aload 7
    //   18: aload 5
    //   20: invokespecial 108	m0/b0:<init>	(Landroid/content/Context;Lt0/m$b;Lt0/z;ZLandroid/os/Handler;Lm0/x;Lm0/z;)V
    //   23: invokevirtual 112	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   26: pop
    //   27: iload_2
    //   28: ifne +4 -> 32
    //   31: return
    //   32: aload 8
    //   34: invokevirtual 116	java/util/ArrayList:size	()I
    //   37: istore 9
    //   39: iload 9
    //   41: istore 10
    //   43: iload_2
    //   44: iconst_2
    //   45: if_icmpne +9 -> 54
    //   48: iload 9
    //   50: iconst_1
    //   51: isub
    //   52: istore 10
    //   54: ldc 118
    //   56: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   59: iconst_1
    //   60: anewarray 120	java/lang/Class
    //   63: dup
    //   64: iconst_0
    //   65: ldc 126
    //   67: aastore
    //   68: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   71: iconst_1
    //   72: anewarray 4	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_1
    //   78: aastore
    //   79: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 89	k0/Y0
    //   85: astore_1
    //   86: iload 10
    //   88: iconst_1
    //   89: iadd
    //   90: istore_2
    //   91: aload 8
    //   93: iload 10
    //   95: aload_1
    //   96: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   99: ldc -115
    //   101: ldc -113
    //   103: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: goto +35 -> 141
    //   109: astore_1
    //   110: goto +17 -> 127
    //   113: iload_2
    //   114: istore 10
    //   116: goto +22 -> 138
    //   119: astore_1
    //   120: goto -7 -> 113
    //   123: astore_1
    //   124: goto +14 -> 138
    //   127: new 150	java/lang/RuntimeException
    //   130: dup
    //   131: ldc -104
    //   133: aload_1
    //   134: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: athrow
    //   138: iload 10
    //   140: istore_2
    //   141: ldc -99
    //   143: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   146: iconst_3
    //   147: anewarray 120	java/lang/Class
    //   150: dup
    //   151: iconst_0
    //   152: ldc 68
    //   154: aastore
    //   155: dup
    //   156: iconst_1
    //   157: ldc -97
    //   159: aastore
    //   160: dup
    //   161: iconst_2
    //   162: ldc -95
    //   164: aastore
    //   165: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   168: iconst_3
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload 6
    //   176: aastore
    //   177: dup
    //   178: iconst_1
    //   179: aload 7
    //   181: aastore
    //   182: dup
    //   183: iconst_2
    //   184: aload 5
    //   186: aastore
    //   187: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   190: checkcast 89	k0/Y0
    //   193: astore_1
    //   194: iload_2
    //   195: iconst_1
    //   196: iadd
    //   197: istore 10
    //   199: aload 8
    //   201: iload_2
    //   202: aload_1
    //   203: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   206: ldc -115
    //   208: ldc -93
    //   210: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: iload 10
    //   215: istore_2
    //   216: goto +25 -> 241
    //   219: astore_1
    //   220: goto +10 -> 230
    //   223: astore_1
    //   224: iload 10
    //   226: istore_2
    //   227: goto +14 -> 241
    //   230: new 150	java/lang/RuntimeException
    //   233: dup
    //   234: ldc -91
    //   236: aload_1
    //   237: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   240: athrow
    //   241: ldc -89
    //   243: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   246: iconst_3
    //   247: anewarray 120	java/lang/Class
    //   250: dup
    //   251: iconst_0
    //   252: ldc 68
    //   254: aastore
    //   255: dup
    //   256: iconst_1
    //   257: ldc -97
    //   259: aastore
    //   260: dup
    //   261: iconst_2
    //   262: ldc -95
    //   264: aastore
    //   265: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   268: iconst_3
    //   269: anewarray 4	java/lang/Object
    //   272: dup
    //   273: iconst_0
    //   274: aload 6
    //   276: aastore
    //   277: dup
    //   278: iconst_1
    //   279: aload 7
    //   281: aastore
    //   282: dup
    //   283: iconst_2
    //   284: aload 5
    //   286: aastore
    //   287: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   290: checkcast 89	k0/Y0
    //   293: astore_1
    //   294: iload_2
    //   295: iconst_1
    //   296: iadd
    //   297: istore 10
    //   299: aload 8
    //   301: iload_2
    //   302: aload_1
    //   303: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   306: ldc -115
    //   308: ldc -87
    //   310: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: iload 10
    //   315: istore_2
    //   316: goto +25 -> 341
    //   319: astore_1
    //   320: goto +10 -> 330
    //   323: astore_1
    //   324: iload 10
    //   326: istore_2
    //   327: goto +14 -> 341
    //   330: new 150	java/lang/RuntimeException
    //   333: dup
    //   334: ldc -85
    //   336: aload_1
    //   337: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   340: athrow
    //   341: aload 8
    //   343: iload_2
    //   344: ldc -83
    //   346: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   349: iconst_3
    //   350: anewarray 120	java/lang/Class
    //   353: dup
    //   354: iconst_0
    //   355: ldc 68
    //   357: aastore
    //   358: dup
    //   359: iconst_1
    //   360: ldc -97
    //   362: aastore
    //   363: dup
    //   364: iconst_2
    //   365: ldc -95
    //   367: aastore
    //   368: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   371: iconst_3
    //   372: anewarray 4	java/lang/Object
    //   375: dup
    //   376: iconst_0
    //   377: aload 6
    //   379: aastore
    //   380: dup
    //   381: iconst_1
    //   382: aload 7
    //   384: aastore
    //   385: dup
    //   386: iconst_2
    //   387: aload 5
    //   389: aastore
    //   390: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   393: checkcast 89	k0/Y0
    //   396: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   399: ldc -115
    //   401: ldc -81
    //   403: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   406: goto +15 -> 421
    //   409: astore_1
    //   410: new 150	java/lang/RuntimeException
    //   413: dup
    //   414: ldc -79
    //   416: aload_1
    //   417: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   420: athrow
    //   421: return
    //   422: astore_1
    //   423: goto -310 -> 113
    //   426: astore_1
    //   427: goto -186 -> 241
    //   430: astore_1
    //   431: goto -90 -> 341
    //   434: astore_1
    //   435: goto -14 -> 421
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	438	0	this	t
    //   0	438	1	paramContext	Context
    //   0	438	2	paramInt	int
    //   0	438	3	paramz	t0.z
    //   0	438	4	paramBoolean	boolean
    //   0	438	5	paramz1	m0.z
    //   0	438	6	paramHandler	Handler
    //   0	438	7	paramx	x
    //   0	438	8	paramArrayList	ArrayList
    //   37	15	9	i	int
    //   41	284	10	j	int
    // Exception table:
    //   from	to	target	type
    //   54	86	109	java/lang/Exception
    //   91	99	109	java/lang/Exception
    //   99	106	109	java/lang/Exception
    //   91	99	119	java/lang/ClassNotFoundException
    //   54	86	123	java/lang/ClassNotFoundException
    //   141	194	219	java/lang/Exception
    //   199	213	219	java/lang/Exception
    //   199	213	223	java/lang/ClassNotFoundException
    //   241	294	319	java/lang/Exception
    //   299	313	319	java/lang/Exception
    //   299	313	323	java/lang/ClassNotFoundException
    //   341	406	409	java/lang/Exception
    //   99	106	422	java/lang/ClassNotFoundException
    //   141	194	426	java/lang/ClassNotFoundException
    //   241	294	430	java/lang/ClassNotFoundException
    //   341	406	434	java/lang/ClassNotFoundException
  }
  
  public m0.z c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new N.f(paramContext).k(paramBoolean1).j(paramBoolean2).i();
  }
  
  public void d(Context paramContext, int paramInt, ArrayList paramArrayList)
  {
    paramArrayList.add(new E0.b());
  }
  
  public void e(ArrayList paramArrayList)
  {
    paramArrayList.add(new g(c.a.a, null));
  }
  
  public void f(Context paramContext, u0.b paramb, Looper paramLooper, int paramInt, ArrayList paramArrayList)
  {
    paramArrayList.add(new c(paramb, paramLooper));
  }
  
  public void g(Context paramContext, Handler paramHandler, int paramInt, ArrayList paramArrayList) {}
  
  public void h(Context paramContext, h paramh, Looper paramLooper, int paramInt, ArrayList paramArrayList)
  {
    paramArrayList.add(new i(paramh, paramLooper));
  }
  
  /* Error */
  public void i(Context paramContext, int paramInt, t0.z paramz, boolean paramBoolean, Handler paramHandler, E paramE, long paramLong, ArrayList paramArrayList)
  {
    // Byte code:
    //   0: aload 9
    //   2: new 214	D0/k
    //   5: dup
    //   6: aload_1
    //   7: aload_0
    //   8: invokevirtual 105	k0/t:j	()Lt0/m$b;
    //   11: aload_3
    //   12: lload 7
    //   14: iload 4
    //   16: aload 5
    //   18: aload 6
    //   20: bipush 50
    //   22: invokespecial 217	D0/k:<init>	(Landroid/content/Context;Lt0/m$b;Lt0/z;JZLandroid/os/Handler;LD0/E;I)V
    //   25: invokevirtual 112	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   28: pop
    //   29: iload_2
    //   30: ifne +4 -> 34
    //   33: return
    //   34: aload 9
    //   36: invokevirtual 116	java/util/ArrayList:size	()I
    //   39: istore 10
    //   41: iload 10
    //   43: istore 11
    //   45: iload_2
    //   46: iconst_2
    //   47: if_icmpne +9 -> 56
    //   50: iload 10
    //   52: iconst_1
    //   53: isub
    //   54: istore 11
    //   56: ldc -37
    //   58: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   61: iconst_4
    //   62: anewarray 120	java/lang/Class
    //   65: dup
    //   66: iconst_0
    //   67: getstatic 225	java/lang/Long:TYPE	Ljava/lang/Class;
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: ldc 68
    //   75: aastore
    //   76: dup
    //   77: iconst_2
    //   78: ldc -29
    //   80: aastore
    //   81: dup
    //   82: iconst_3
    //   83: getstatic 230	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   86: aastore
    //   87: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   90: iconst_4
    //   91: anewarray 4	java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: lload 7
    //   98: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   101: aastore
    //   102: dup
    //   103: iconst_1
    //   104: aload 5
    //   106: aastore
    //   107: dup
    //   108: iconst_2
    //   109: aload 6
    //   111: aastore
    //   112: dup
    //   113: iconst_3
    //   114: bipush 50
    //   116: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   119: aastore
    //   120: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   123: checkcast 89	k0/Y0
    //   126: astore_1
    //   127: iload 11
    //   129: iconst_1
    //   130: iadd
    //   131: istore_2
    //   132: aload 9
    //   134: iload 11
    //   136: aload_1
    //   137: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   140: ldc -115
    //   142: ldc -17
    //   144: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: goto +28 -> 175
    //   150: astore_1
    //   151: goto +10 -> 161
    //   154: astore_1
    //   155: iload_2
    //   156: istore 11
    //   158: goto +14 -> 172
    //   161: new 150	java/lang/RuntimeException
    //   164: dup
    //   165: ldc -15
    //   167: aload_1
    //   168: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   171: athrow
    //   172: iload 11
    //   174: istore_2
    //   175: ldc -13
    //   177: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   180: iconst_4
    //   181: anewarray 120	java/lang/Class
    //   184: dup
    //   185: iconst_0
    //   186: getstatic 225	java/lang/Long:TYPE	Ljava/lang/Class;
    //   189: aastore
    //   190: dup
    //   191: iconst_1
    //   192: ldc 68
    //   194: aastore
    //   195: dup
    //   196: iconst_2
    //   197: ldc -29
    //   199: aastore
    //   200: dup
    //   201: iconst_3
    //   202: getstatic 230	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   205: aastore
    //   206: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   209: iconst_4
    //   210: anewarray 4	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: lload 7
    //   217: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   220: aastore
    //   221: dup
    //   222: iconst_1
    //   223: aload 5
    //   225: aastore
    //   226: dup
    //   227: iconst_2
    //   228: aload 6
    //   230: aastore
    //   231: dup
    //   232: iconst_3
    //   233: bipush 50
    //   235: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   238: aastore
    //   239: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   242: checkcast 89	k0/Y0
    //   245: astore_1
    //   246: iload_2
    //   247: iconst_1
    //   248: iadd
    //   249: istore 11
    //   251: aload 9
    //   253: iload_2
    //   254: aload_1
    //   255: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   258: ldc -115
    //   260: ldc -11
    //   262: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: iload 11
    //   267: istore_2
    //   268: goto +25 -> 293
    //   271: astore_1
    //   272: goto +10 -> 282
    //   275: astore_1
    //   276: iload 11
    //   278: istore_2
    //   279: goto +14 -> 293
    //   282: new 150	java/lang/RuntimeException
    //   285: dup
    //   286: ldc -9
    //   288: aload_1
    //   289: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   292: athrow
    //   293: aload 9
    //   295: iload_2
    //   296: ldc -7
    //   298: invokestatic 124	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   301: iconst_4
    //   302: anewarray 120	java/lang/Class
    //   305: dup
    //   306: iconst_0
    //   307: getstatic 225	java/lang/Long:TYPE	Ljava/lang/Class;
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: ldc 68
    //   315: aastore
    //   316: dup
    //   317: iconst_2
    //   318: ldc -29
    //   320: aastore
    //   321: dup
    //   322: iconst_3
    //   323: getstatic 230	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   326: aastore
    //   327: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   330: iconst_4
    //   331: anewarray 4	java/lang/Object
    //   334: dup
    //   335: iconst_0
    //   336: lload 7
    //   338: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   341: aastore
    //   342: dup
    //   343: iconst_1
    //   344: aload 5
    //   346: aastore
    //   347: dup
    //   348: iconst_2
    //   349: aload 6
    //   351: aastore
    //   352: dup
    //   353: iconst_3
    //   354: bipush 50
    //   356: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   359: aastore
    //   360: invokevirtual 136	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   363: checkcast 89	k0/Y0
    //   366: invokevirtual 139	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   369: ldc -115
    //   371: ldc -5
    //   373: invokestatic 148	g0/o:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   376: goto +15 -> 391
    //   379: astore_1
    //   380: new 150	java/lang/RuntimeException
    //   383: dup
    //   384: ldc -79
    //   386: aload_1
    //   387: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   390: athrow
    //   391: return
    //   392: astore_1
    //   393: goto -221 -> 172
    //   396: astore_1
    //   397: goto -104 -> 293
    //   400: astore_1
    //   401: goto -10 -> 391
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	this	t
    //   0	404	1	paramContext	Context
    //   0	404	2	paramInt	int
    //   0	404	3	paramz	t0.z
    //   0	404	4	paramBoolean	boolean
    //   0	404	5	paramHandler	Handler
    //   0	404	6	paramE	E
    //   0	404	7	paramLong	long
    //   0	404	9	paramArrayList	ArrayList
    //   39	15	10	i	int
    //   43	234	11	j	int
    // Exception table:
    //   from	to	target	type
    //   56	127	150	java/lang/Exception
    //   132	147	150	java/lang/Exception
    //   132	147	154	java/lang/ClassNotFoundException
    //   175	246	271	java/lang/Exception
    //   251	265	271	java/lang/Exception
    //   251	265	275	java/lang/ClassNotFoundException
    //   293	376	379	java/lang/Exception
    //   56	127	392	java/lang/ClassNotFoundException
    //   175	246	396	java/lang/ClassNotFoundException
    //   293	376	400	java/lang/ClassNotFoundException
  }
  
  public m.b j()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     k0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */