package b9;

import g;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import y8.b;

public final class e
  implements y8.e
{
  public static final Charset f = Charset.forName("UTF-8");
  public static final y8.c g = new y8.c("key", g.i(f.n(d.class, new a(1))));
  public static final y8.c h = new y8.c("value", g.i(f.n(d.class, new a(2))));
  public static final a9.a i = new a9.a(1);
  public OutputStream a;
  public final Map<Class<?>, y8.d<?>> b;
  public final Map<Class<?>, y8.f<?>> c;
  public final y8.d<Object> d;
  public final h e = new h(this);
  
  public e(ByteArrayOutputStream paramByteArrayOutputStream, Map paramMap1, Map paramMap2, y8.d paramd)
  {
    a = paramByteArrayOutputStream;
    b = paramMap1;
    c = paramMap2;
    d = paramd;
  }
  
  public static int j(y8.c paramc)
  {
    paramc = (d)b.get(d.class);
    if (paramc != null) {
      return a;
    }
    throw new b("Field has no @Protobuf config");
  }
  
  public final y8.e a(y8.c paramc, boolean paramBoolean)
  {
    h(paramc, paramBoolean, true);
    return this;
  }
  
  public final y8.e b(y8.c paramc, double paramDouble)
  {
    g(paramc, paramDouble, true);
    return this;
  }
  
  public final y8.e c(y8.c paramc, int paramInt)
  {
    h(paramc, paramInt, true);
    return this;
  }
  
  public final y8.e d(y8.c paramc, long paramLong)
  {
    if (paramLong != 0L)
    {
      paramc = (d)b.get(d.class);
      if (paramc != null)
      {
        k(a << 3);
        l(paramLong);
      }
    }
    else
    {
      return this;
    }
    throw new b("Field has no @Protobuf config");
  }
  
  public final y8.e e(y8.c paramc, Object paramObject)
  {
    f(paramc, paramObject, true);
    return this;
  }
  
  public final e f(y8.c paramc, Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      return this;
    }
    if ((paramObject instanceof CharSequence))
    {
      paramObject = (CharSequence)paramObject;
      if ((paramBoolean) && (((CharSequence)paramObject).length() == 0)) {
        return this;
      }
      k(j(paramc) << 3 | 0x2);
      paramc = ((CharSequence)paramObject).toString().getBytes(f);
      k(paramc.length);
      a.write(paramc);
      return this;
    }
    if ((paramObject instanceof Collection))
    {
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        f(paramc, ((Iterator)paramObject).next(), false);
      }
      return this;
    }
    if ((paramObject instanceof Map))
    {
      localObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramObject = (Map.Entry)((Iterator)localObject).next();
        i(i, paramc, paramObject, false);
      }
      return this;
    }
    if ((paramObject instanceof Double))
    {
      g(paramc, ((Double)paramObject).doubleValue(), paramBoolean);
      return this;
    }
    if ((paramObject instanceof Float))
    {
      float f1 = ((Float)paramObject).floatValue();
      if ((!paramBoolean) || (f1 != 0.0F))
      {
        k(j(paramc) << 3 | 0x5);
        a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f1).array());
      }
      return this;
    }
    if ((paramObject instanceof Number))
    {
      long l = ((Number)paramObject).longValue();
      if ((!paramBoolean) || (l != 0L))
      {
        paramc = (d)b.get(d.class);
        if (paramc != null)
        {
          k(a << 3);
          l(l);
        }
      }
      else
      {
        return this;
      }
      throw new b("Field has no @Protobuf config");
    }
    if ((paramObject instanceof Boolean))
    {
      h(paramc, ((Boolean)paramObject).booleanValue(), paramBoolean);
      return this;
    }
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      if ((paramBoolean) && (paramObject.length == 0)) {
        return this;
      }
      k(j(paramc) << 3 | 0x2);
      k(paramObject.length);
      a.write((byte[])paramObject);
      return this;
    }
    Object localObject = (y8.d)b.get(paramObject.getClass());
    if (localObject != null)
    {
      i((y8.d)localObject, paramc, paramObject, paramBoolean);
      return this;
    }
    y8.f localf = (y8.f)c.get(paramObject.getClass());
    if (localf != null)
    {
      localObject = e;
      a = false;
      c = paramc;
      b = paramBoolean;
      localf.a(paramObject, localObject);
      return this;
    }
    if ((paramObject instanceof c))
    {
      h(paramc, ((c)paramObject).a(), true);
      return this;
    }
    if ((paramObject instanceof Enum))
    {
      h(paramc, ((Enum)paramObject).ordinal(), true);
      return this;
    }
    i(d, paramc, paramObject, paramBoolean);
    return this;
  }
  
  public final void g(y8.c paramc, double paramDouble, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramDouble == 0.0D)) {
      return;
    }
    k(j(paramc) << 3 | 0x1);
    a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(paramDouble).array());
  }
  
  public final void h(y8.c paramc, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 0)) {
      return;
    }
    paramc = (d)b.get(d.class);
    if (paramc != null)
    {
      k(a << 3);
      k(paramInt);
      return;
    }
    throw new b("Field has no @Protobuf config");
  }
  
  /* Error */
  public final void i(y8.d paramd, y8.c paramc, Object paramObject, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 269	b9/b
    //   3: dup
    //   4: invokespecial 270	b9/b:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: getfield 85	b9/e:a	Ljava/io/OutputStream;
    //   13: astore 6
    //   15: aload_0
    //   16: aload 5
    //   18: putfield 85	b9/e:a	Ljava/io/OutputStream;
    //   21: aload_1
    //   22: aload_3
    //   23: aload_0
    //   24: invokeinterface 254 3 0
    //   29: aload_0
    //   30: aload 6
    //   32: putfield 85	b9/e:a	Ljava/io/OutputStream;
    //   35: aload 5
    //   37: getfield 273	b9/b:a	J
    //   40: lstore 7
    //   42: aload 5
    //   44: invokevirtual 276	java/io/OutputStream:close	()V
    //   47: iload 4
    //   49: ifeq +11 -> 60
    //   52: lload 7
    //   54: lconst_0
    //   55: lcmp
    //   56: ifne +4 -> 60
    //   59: return
    //   60: aload_0
    //   61: aload_2
    //   62: invokestatic 141	b9/e:j	(Ly8/c;)I
    //   65: iconst_3
    //   66: ishl
    //   67: iconst_2
    //   68: ior
    //   69: invokevirtual 125	b9/e:k	(I)V
    //   72: aload_0
    //   73: lload 7
    //   75: invokevirtual 129	b9/e:l	(J)V
    //   78: aload_1
    //   79: aload_3
    //   80: aload_0
    //   81: invokeinterface 254 3 0
    //   86: return
    //   87: astore_1
    //   88: aload_0
    //   89: aload 6
    //   91: putfield 85	b9/e:a	Ljava/io/OutputStream;
    //   94: aload_1
    //   95: athrow
    //   96: astore_1
    //   97: aload 5
    //   99: invokevirtual 276	java/io/OutputStream:close	()V
    //   102: goto +9 -> 111
    //   105: astore_2
    //   106: aload_1
    //   107: aload_2
    //   108: invokevirtual 282	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   111: aload_1
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	e
    //   0	113	1	paramd	y8.d
    //   0	113	2	paramc	y8.c
    //   0	113	3	paramObject	Object
    //   0	113	4	paramBoolean	boolean
    //   7	91	5	localb	b
    //   13	77	6	localOutputStream	OutputStream
    //   40	34	7	l	long
    // Exception table:
    //   from	to	target	type
    //   21	29	87	finally
    //   9	21	96	finally
    //   29	42	96	finally
    //   88	96	96	finally
    //   97	102	105	finally
  }
  
  public final void k(int paramInt)
  {
    while ((paramInt & 0xFFFFFF80) != 0L)
    {
      a.write(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
    a.write(paramInt & 0x7F);
  }
  
  public final void l(long paramLong)
  {
    while ((0xFFFFFFFFFFFFFF80 & paramLong) != 0L)
    {
      a.write((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
    a.write((int)paramLong & 0x7F);
  }
}

/* Location:
 * Qualified Name:     b9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */