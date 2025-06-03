package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class xu
{
  private static final acx<?> a = acx.a(Object.class);
  private final ThreadLocal<Map<acx<?>, ya<?>>> b = new ThreadLocal();
  private final Map<acx<?>, yn<?>> c = new ConcurrentHashMap();
  private final za d;
  private final aao e;
  private final List<yp> f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  
  public xu()
  {
    this(zn.a, xm.a, Collections.emptyMap(), false, false, false, true, false, false, false, yo.a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
  }
  
  public xu(zn paramzn, xr paramxr, Map<Type, yc<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, yo paramyo, String paramString, int paramInt1, int paramInt2, List<yp> paramList1, List<yp> paramList2, List<yp> paramList3)
  {
    paramString = new za(paramMap);
    d = paramString;
    g = paramBoolean1;
    h = paramBoolean3;
    i = paramBoolean4;
    j = paramBoolean5;
    k = paramBoolean6;
    paramList1 = new ArrayList();
    paramList1.add(abi.D);
    paramList1.add(aat.a);
    paramList1.add(paramzn);
    paramList1.addAll(paramList3);
    paramList1.add(abi.r);
    paramList1.add(abi.g);
    paramList1.add(abi.d);
    paramList1.add(abi.e);
    paramList1.add(abi.f);
    if (paramyo == yo.a) {
      paramMap = abi.k;
    } else {
      paramMap = new xv();
    }
    paramList1.add(abi.a(Long.TYPE, Long.class, paramMap));
    paramList2 = Double.TYPE;
    if (paramBoolean7) {
      paramyo = abi.m;
    } else {
      paramyo = new xt(this);
    }
    paramList1.add(abi.a(paramList2, Double.class, paramyo));
    paramList2 = Float.TYPE;
    if (paramBoolean7) {
      paramyo = abi.l;
    } else {
      paramyo = new xw(this);
    }
    paramList1.add(abi.a(paramList2, Float.class, paramyo));
    paramList1.add(abi.n);
    paramList1.add(abi.h);
    paramList1.add(abi.i);
    paramList1.add(abi.a(AtomicLong.class, new xy(paramMap).nullSafe()));
    paramList1.add(abi.a(AtomicLongArray.class, new xx(paramMap).nullSafe()));
    paramList1.add(abi.j);
    paramList1.add(abi.o);
    paramList1.add(abi.s);
    paramList1.add(abi.t);
    paramList1.add(abi.a(BigDecimal.class, abi.p));
    paramList1.add(abi.a(BigInteger.class, abi.q));
    paramList1.add(abi.u);
    paramList1.add(abi.v);
    paramList1.add(abi.x);
    paramList1.add(abi.y);
    paramList1.add(abi.B);
    paramList1.add(abi.w);
    paramList1.add(abi.b);
    paramList1.add(aam.a);
    paramList1.add(abi.A);
    paramList1.add(abc.a);
    paramList1.add(aba.a);
    paramList1.add(abi.z);
    paramList1.add(aai.a);
    paramList1.add(abi.a);
    paramList1.add(new aak(paramString));
    paramList1.add(new aar(paramString, paramBoolean2));
    paramMap = new aao(paramString);
    e = paramMap;
    paramList1.add(paramMap);
    paramList1.add(abi.E);
    paramList1.add(new aav(paramString, paramxr, paramzn, paramMap));
    f = Collections.unmodifiableList(paramList1);
  }
  
  private final adb a(Writer paramWriter)
    throws IOException
  {
    if (h) {
      paramWriter.write(")]}'\n");
    }
    paramWriter = new adb(paramWriter);
    if (j) {
      paramWriter.c("  ");
    }
    paramWriter.d(g);
    return paramWriter;
  }
  
  /* Error */
  private final <T> T a(ada paramada, Type paramType)
    throws yg, yl
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 320	com/google/ads/interactivemedia/v3/internal/ada:q	()Z
    //   4: istore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: aload_1
    //   9: iconst_1
    //   10: invokevirtual 322	com/google/ads/interactivemedia/v3/internal/ada:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 325	com/google/ads/interactivemedia/v3/internal/ada:f	()Lcom/google/ads/interactivemedia/v3/internal/adc;
    //   17: pop
    //   18: iconst_0
    //   19: istore 4
    //   21: aload_0
    //   22: aload_2
    //   23: invokestatic 328	com/google/ads/interactivemedia/v3/internal/acx:a	(Ljava/lang/reflect/Type;)Lcom/google/ads/interactivemedia/v3/internal/acx;
    //   26: invokevirtual 331	com/google/ads/interactivemedia/v3/internal/xu:a	(Lcom/google/ads/interactivemedia/v3/internal/acx;)Lcom/google/ads/interactivemedia/v3/internal/yn;
    //   29: aload_1
    //   30: invokevirtual 335	com/google/ads/interactivemedia/v3/internal/yn:read	(Lcom/google/ads/interactivemedia/v3/internal/ada;)Ljava/lang/Object;
    //   33: astore_2
    //   34: aload_1
    //   35: iload_3
    //   36: invokevirtual 322	com/google/ads/interactivemedia/v3/internal/ada:a	(Z)V
    //   39: aload_2
    //   40: areturn
    //   41: astore_2
    //   42: goto +101 -> 143
    //   45: astore_2
    //   46: new 315	java/lang/AssertionError
    //   49: astore 5
    //   51: new 337	java/lang/StringBuilder
    //   54: astore 6
    //   56: aload 6
    //   58: ldc_w 339
    //   61: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload 6
    //   66: aload_2
    //   67: invokevirtual 347	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   70: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload 5
    //   76: aload 6
    //   78: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: aload_2
    //   82: invokespecial 357	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   85: aload 5
    //   87: athrow
    //   88: astore 6
    //   90: new 309	com/google/ads/interactivemedia/v3/internal/yl
    //   93: astore_2
    //   94: aload_2
    //   95: aload 6
    //   97: invokespecial 360	com/google/ads/interactivemedia/v3/internal/yl:<init>	(Ljava/lang/Throwable;)V
    //   100: aload_2
    //   101: athrow
    //   102: astore 6
    //   104: new 309	com/google/ads/interactivemedia/v3/internal/yl
    //   107: astore_2
    //   108: aload_2
    //   109: aload 6
    //   111: invokespecial 360	com/google/ads/interactivemedia/v3/internal/yl:<init>	(Ljava/lang/Throwable;)V
    //   114: aload_2
    //   115: athrow
    //   116: astore_2
    //   117: iload 4
    //   119: ifeq +10 -> 129
    //   122: aload_1
    //   123: iload_3
    //   124: invokevirtual 322	com/google/ads/interactivemedia/v3/internal/ada:a	(Z)V
    //   127: aconst_null
    //   128: areturn
    //   129: new 309	com/google/ads/interactivemedia/v3/internal/yl
    //   132: astore 6
    //   134: aload 6
    //   136: aload_2
    //   137: invokespecial 360	com/google/ads/interactivemedia/v3/internal/yl:<init>	(Ljava/lang/Throwable;)V
    //   140: aload 6
    //   142: athrow
    //   143: aload_1
    //   144: iload_3
    //   145: invokevirtual 322	com/google/ads/interactivemedia/v3/internal/ada:a	(Z)V
    //   148: aload_2
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	xu
    //   0	150	1	paramada	ada
    //   0	150	2	paramType	Type
    //   4	141	3	bool	boolean
    //   6	112	4	m	int
    //   49	37	5	localAssertionError	AssertionError
    //   54	23	6	localStringBuilder	StringBuilder
    //   88	8	6	localIOException	IOException
    //   102	8	6	localIllegalStateException	IllegalStateException
    //   132	9	6	localyl	yl
    // Exception table:
    //   from	to	target	type
    //   13	18	41	finally
    //   21	34	41	finally
    //   46	88	41	finally
    //   90	102	41	finally
    //   104	116	41	finally
    //   129	143	41	finally
    //   13	18	45	java/lang/AssertionError
    //   21	34	45	java/lang/AssertionError
    //   13	18	88	java/io/IOException
    //   21	34	88	java/io/IOException
    //   13	18	102	java/lang/IllegalStateException
    //   21	34	102	java/lang/IllegalStateException
    //   13	18	116	java/io/EOFException
    //   21	34	116	java/io/EOFException
  }
  
  public static void a(double paramDouble)
  {
    if ((!Double.isNaN(paramDouble)) && (!Double.isInfinite(paramDouble))) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramDouble);
    localStringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  /* Error */
  private final void a(yd paramyd, Appendable paramAppendable)
    throws yg
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokestatic 384	com/google/ads/interactivemedia/v3/internal/aaa:a	(Ljava/lang/Appendable;)Ljava/io/Writer;
    //   5: invokespecial 386	com/google/ads/interactivemedia/v3/internal/xu:a	(Ljava/io/Writer;)Lcom/google/ads/interactivemedia/v3/internal/adb;
    //   8: astore_2
    //   9: aload_2
    //   10: invokevirtual 388	com/google/ads/interactivemedia/v3/internal/adb:g	()Z
    //   13: istore_3
    //   14: aload_2
    //   15: iconst_1
    //   16: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   19: aload_2
    //   20: invokevirtual 392	com/google/ads/interactivemedia/v3/internal/adb:h	()Z
    //   23: istore 4
    //   25: aload_2
    //   26: aload_0
    //   27: getfield 90	com/google/ads/interactivemedia/v3/internal/xu:i	Z
    //   30: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   33: aload_2
    //   34: invokevirtual 396	com/google/ads/interactivemedia/v3/internal/adb:i	()Z
    //   37: istore 5
    //   39: aload_2
    //   40: aload_0
    //   41: getfield 86	com/google/ads/interactivemedia/v3/internal/xu:g	Z
    //   44: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   47: aload_1
    //   48: aload_2
    //   49: invokestatic 399	com/google/ads/interactivemedia/v3/internal/aaa:a	(Lcom/google/ads/interactivemedia/v3/internal/yd;Lcom/google/ads/interactivemedia/v3/internal/adb;)V
    //   52: aload_2
    //   53: iload_3
    //   54: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   57: aload_2
    //   58: iload 4
    //   60: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   63: aload_2
    //   64: iload 5
    //   66: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   69: return
    //   70: astore_1
    //   71: goto +60 -> 131
    //   74: astore 6
    //   76: new 315	java/lang/AssertionError
    //   79: astore 7
    //   81: new 337	java/lang/StringBuilder
    //   84: astore_1
    //   85: aload_1
    //   86: ldc_w 339
    //   89: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_1
    //   93: aload 6
    //   95: invokevirtual 347	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   98: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload 7
    //   104: aload_1
    //   105: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: aload 6
    //   110: invokespecial 357	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: aload 7
    //   115: athrow
    //   116: astore_1
    //   117: new 307	com/google/ads/interactivemedia/v3/internal/yg
    //   120: astore 6
    //   122: aload 6
    //   124: aload_1
    //   125: invokespecial 400	com/google/ads/interactivemedia/v3/internal/yg:<init>	(Ljava/lang/Throwable;)V
    //   128: aload 6
    //   130: athrow
    //   131: aload_2
    //   132: iload_3
    //   133: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   136: aload_2
    //   137: iload 4
    //   139: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   142: aload_2
    //   143: iload 5
    //   145: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   148: aload_1
    //   149: athrow
    //   150: astore_1
    //   151: new 307	com/google/ads/interactivemedia/v3/internal/yg
    //   154: dup
    //   155: aload_1
    //   156: invokespecial 400	com/google/ads/interactivemedia/v3/internal/yg:<init>	(Ljava/lang/Throwable;)V
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	xu
    //   0	160	1	paramyd	yd
    //   0	160	2	paramAppendable	Appendable
    //   13	120	3	bool1	boolean
    //   23	115	4	bool2	boolean
    //   37	107	5	bool3	boolean
    //   74	35	6	localAssertionError1	AssertionError
    //   120	9	6	localyg	yg
    //   79	35	7	localAssertionError2	AssertionError
    // Exception table:
    //   from	to	target	type
    //   47	52	70	finally
    //   76	116	70	finally
    //   117	131	70	finally
    //   47	52	74	java/lang/AssertionError
    //   47	52	116	java/io/IOException
    //   0	47	150	java/io/IOException
    //   52	69	150	java/io/IOException
    //   131	150	150	java/io/IOException
  }
  
  private static void a(Object paramObject, ada paramada)
  {
    if (paramObject != null) {
      try
      {
        if (paramada.f() != adc.j)
        {
          paramObject = new com/google/ads/interactivemedia/v3/internal/yg;
          ((yg)paramObject).<init>("JSON document was not fully consumed.");
          throw ((Throwable)paramObject);
        }
      }
      catch (IOException paramObject)
      {
        throw new yg((Throwable)paramObject);
      }
      catch (ade paramObject)
      {
        throw new yl((Throwable)paramObject);
      }
    }
  }
  
  /* Error */
  private final void a(Object paramObject, Type paramType, Appendable paramAppendable)
    throws yg
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: invokestatic 384	com/google/ads/interactivemedia/v3/internal/aaa:a	(Ljava/lang/Appendable;)Ljava/io/Writer;
    //   5: invokespecial 386	com/google/ads/interactivemedia/v3/internal/xu:a	(Ljava/io/Writer;)Lcom/google/ads/interactivemedia/v3/internal/adb;
    //   8: astore_3
    //   9: aload_0
    //   10: aload_2
    //   11: invokestatic 328	com/google/ads/interactivemedia/v3/internal/acx:a	(Ljava/lang/reflect/Type;)Lcom/google/ads/interactivemedia/v3/internal/acx;
    //   14: invokevirtual 331	com/google/ads/interactivemedia/v3/internal/xu:a	(Lcom/google/ads/interactivemedia/v3/internal/acx;)Lcom/google/ads/interactivemedia/v3/internal/yn;
    //   17: astore_2
    //   18: aload_3
    //   19: invokevirtual 388	com/google/ads/interactivemedia/v3/internal/adb:g	()Z
    //   22: istore 4
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   29: aload_3
    //   30: invokevirtual 392	com/google/ads/interactivemedia/v3/internal/adb:h	()Z
    //   33: istore 5
    //   35: aload_3
    //   36: aload_0
    //   37: getfield 90	com/google/ads/interactivemedia/v3/internal/xu:i	Z
    //   40: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   43: aload_3
    //   44: invokevirtual 396	com/google/ads/interactivemedia/v3/internal/adb:i	()Z
    //   47: istore 6
    //   49: aload_3
    //   50: aload_0
    //   51: getfield 86	com/google/ads/interactivemedia/v3/internal/xu:g	Z
    //   54: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   57: aload_2
    //   58: aload_3
    //   59: aload_1
    //   60: invokevirtual 415	com/google/ads/interactivemedia/v3/internal/yn:write	(Lcom/google/ads/interactivemedia/v3/internal/adb;Ljava/lang/Object;)V
    //   63: aload_3
    //   64: iload 4
    //   66: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   69: aload_3
    //   70: iload 5
    //   72: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   75: aload_3
    //   76: iload 6
    //   78: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   81: return
    //   82: astore_1
    //   83: goto +54 -> 137
    //   86: astore_1
    //   87: new 315	java/lang/AssertionError
    //   90: astore 7
    //   92: new 337	java/lang/StringBuilder
    //   95: astore_2
    //   96: aload_2
    //   97: ldc_w 339
    //   100: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: aload_2
    //   104: aload_1
    //   105: invokevirtual 347	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   108: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload 7
    //   114: aload_2
    //   115: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: aload_1
    //   119: invokespecial 357	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   122: aload 7
    //   124: athrow
    //   125: astore_1
    //   126: new 307	com/google/ads/interactivemedia/v3/internal/yg
    //   129: astore_2
    //   130: aload_2
    //   131: aload_1
    //   132: invokespecial 400	com/google/ads/interactivemedia/v3/internal/yg:<init>	(Ljava/lang/Throwable;)V
    //   135: aload_2
    //   136: athrow
    //   137: aload_3
    //   138: iload 4
    //   140: invokevirtual 390	com/google/ads/interactivemedia/v3/internal/adb:b	(Z)V
    //   143: aload_3
    //   144: iload 5
    //   146: invokevirtual 394	com/google/ads/interactivemedia/v3/internal/adb:c	(Z)V
    //   149: aload_3
    //   150: iload 6
    //   152: invokevirtual 303	com/google/ads/interactivemedia/v3/internal/adb:d	(Z)V
    //   155: aload_1
    //   156: athrow
    //   157: astore_1
    //   158: new 307	com/google/ads/interactivemedia/v3/internal/yg
    //   161: dup
    //   162: aload_1
    //   163: invokespecial 400	com/google/ads/interactivemedia/v3/internal/yg:<init>	(Ljava/lang/Throwable;)V
    //   166: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	this	xu
    //   0	167	1	paramObject	Object
    //   0	167	2	paramType	Type
    //   0	167	3	paramAppendable	Appendable
    //   22	117	4	bool1	boolean
    //   33	112	5	bool2	boolean
    //   47	104	6	bool3	boolean
    //   90	33	7	localAssertionError	AssertionError
    // Exception table:
    //   from	to	target	type
    //   57	63	82	finally
    //   87	125	82	finally
    //   126	137	82	finally
    //   57	63	86	java/lang/AssertionError
    //   57	63	125	java/io/IOException
    //   0	57	157	java/io/IOException
    //   63	81	157	java/io/IOException
    //   137	157	157	java/io/IOException
  }
  
  public final <T> yn<T> a(acx<T> paramacx)
  {
    Object localObject1 = c;
    if (paramacx == null) {
      localObject3 = a;
    } else {
      localObject3 = paramacx;
    }
    Object localObject3 = (yn)((Map)localObject1).get(localObject3);
    if (localObject3 != null) {
      return (yn<T>)localObject3;
    }
    localObject1 = (Map)b.get();
    int m = 0;
    localObject3 = localObject1;
    if (localObject1 == null)
    {
      localObject3 = new HashMap();
      b.set(localObject3);
      m = 1;
    }
    localObject1 = (ya)((Map)localObject3).get(paramacx);
    if (localObject1 != null) {
      return (yn<T>)localObject1;
    }
    try
    {
      Object localObject4 = new com/google/ads/interactivemedia/v3/internal/ya;
      ((ya)localObject4).<init>();
      ((Map)localObject3).put(paramacx, localObject4);
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = ((yp)localIterator.next()).a(this, paramacx);
        if (localObject1 != null)
        {
          ((ya)localObject4).a((yn)localObject1);
          c.put(paramacx, localObject1);
          return (yn<T>)localObject1;
        }
      }
      localObject4 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("GSON (2.8.5) cannot handle ");
      ((StringBuilder)localObject1).append(paramacx);
      ((IllegalArgumentException)localObject4).<init>(((StringBuilder)localObject1).toString());
      throw ((Throwable)localObject4);
    }
    finally
    {
      ((Map)localObject3).remove(paramacx);
      if (m != 0) {
        b.remove();
      }
    }
  }
  
  public final <T> yn<T> a(yp paramyp, acx<T> paramacx)
  {
    Object localObject1 = paramyp;
    if (!f.contains(paramyp)) {
      localObject1 = e;
    }
    int m = 0;
    paramyp = f.iterator();
    while (paramyp.hasNext())
    {
      Object localObject2 = (yp)paramyp.next();
      if (m == 0)
      {
        if (localObject2 == localObject1) {
          m = 1;
        }
      }
      else
      {
        localObject2 = ((yp)localObject2).a(this, paramacx);
        if (localObject2 != null) {
          return (yn<T>)localObject2;
        }
      }
    }
    paramyp = new StringBuilder("GSON cannot serialize ");
    paramyp.append(paramacx);
    throw new IllegalArgumentException(paramyp.toString());
  }
  
  public final <T> yn<T> a(Class<T> paramClass)
  {
    return a(acx.a(paramClass));
  }
  
  public final <T> T a(String paramString, Class<T> paramClass)
    throws yl
  {
    if (paramString == null)
    {
      paramString = null;
    }
    else
    {
      ada localada = new ada(new StringReader(paramString));
      localada.a(k);
      paramString = a(localada, paramClass);
      a(paramString, localada);
    }
    return (T)zx.a(paramClass).cast(paramString);
  }
  
  public final String a(Object paramObject)
  {
    if (paramObject == null)
    {
      paramObject = yf.a;
      localObject = new StringWriter();
      a((yd)paramObject, (Appendable)localObject);
      return ((StringWriter)localObject).toString();
    }
    Object localObject = paramObject.getClass();
    StringWriter localStringWriter = new StringWriter();
    a(paramObject, (Type)localObject, localStringWriter);
    return localStringWriter.toString();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{serializeNulls:");
    localStringBuilder.append(g);
    localStringBuilder.append(",factories:");
    localStringBuilder.append(f);
    localStringBuilder.append(",instanceCreators:");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.xu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */