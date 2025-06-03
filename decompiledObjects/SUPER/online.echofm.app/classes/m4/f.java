package m4;

import j4.b;
import j4.c.b;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  implements j4.e
{
  public static final Charset f = Charset.forName("UTF-8");
  public static final j4.c g = j4.c.a("key").b(a.b().c(1).a()).a();
  public static final j4.c h = j4.c.a("value").b(a.b().c(2).a()).a();
  public static final j4.d i = new e();
  public OutputStream a;
  public final Map b;
  public final Map c;
  public final j4.d d;
  public final i e = new i(this);
  
  public f(OutputStream paramOutputStream, Map paramMap1, Map paramMap2, j4.d paramd)
  {
    a = paramOutputStream;
    b = paramMap1;
    c = paramMap2;
    d = paramd;
  }
  
  public static ByteBuffer p(int paramInt)
  {
    return ByteBuffer.allocate(paramInt).order(ByteOrder.LITTLE_ENDIAN);
  }
  
  public static d u(j4.c paramc)
  {
    paramc = (d)paramc.c(d.class);
    if (paramc != null) {
      return paramc;
    }
    throw new b("Field has no @Protobuf config");
  }
  
  public static int v(j4.c paramc)
  {
    paramc = (d)paramc.c(d.class);
    if (paramc != null) {
      return paramc.tag();
    }
    throw new b("Field has no @Protobuf config");
  }
  
  public j4.e a(j4.c paramc, double paramDouble)
  {
    return e(paramc, paramDouble, true);
  }
  
  public j4.e e(j4.c paramc, double paramDouble, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramDouble == 0.0D)) {
      return this;
    }
    x(v(paramc) << 3 | 0x1);
    a.write(p(8).putDouble(paramDouble).array());
    return this;
  }
  
  public j4.e g(j4.c paramc, Object paramObject)
  {
    return i(paramc, paramObject, true);
  }
  
  public j4.e h(j4.c paramc, float paramFloat, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramFloat == 0.0F)) {
      return this;
    }
    x(v(paramc) << 3 | 0x5);
    a.write(p(4).putFloat(paramFloat).array());
    return this;
  }
  
  public j4.e i(j4.c paramc, Object paramObject, boolean paramBoolean)
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
      x(v(paramc) << 3 | 0x2);
      paramc = ((CharSequence)paramObject).toString().getBytes(f);
      x(paramc.length);
      a.write(paramc);
      return this;
    }
    if ((paramObject instanceof Collection))
    {
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        i(paramc, ((Iterator)paramObject).next(), false);
      }
      return this;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject = (Map.Entry)((Iterator)paramObject).next();
        r(i, paramc, localObject, false);
      }
      return this;
    }
    if ((paramObject instanceof Double)) {
      return e(paramc, ((Double)paramObject).doubleValue(), paramBoolean);
    }
    if ((paramObject instanceof Float)) {
      return h(paramc, ((Float)paramObject).floatValue(), paramBoolean);
    }
    if ((paramObject instanceof Number)) {
      return m(paramc, ((Number)paramObject).longValue(), paramBoolean);
    }
    if ((paramObject instanceof Boolean)) {
      return o(paramc, ((Boolean)paramObject).booleanValue(), paramBoolean);
    }
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      if ((paramBoolean) && (paramObject.length == 0)) {
        return this;
      }
      x(v(paramc) << 3 | 0x2);
      x(paramObject.length);
      a.write((byte[])paramObject);
      return this;
    }
    Object localObject = (j4.d)b.get(paramObject.getClass());
    if (localObject != null) {
      return r((j4.d)localObject, paramc, paramObject, paramBoolean);
    }
    localObject = (j4.f)c.get(paramObject.getClass());
    if (localObject != null) {
      return s((j4.f)localObject, paramc, paramObject, paramBoolean);
    }
    if ((paramObject instanceof c)) {
      return j(paramc, ((c)paramObject).g());
    }
    if ((paramObject instanceof Enum)) {
      return j(paramc, ((Enum)paramObject).ordinal());
    }
    return r(d, paramc, paramObject, paramBoolean);
  }
  
  public f j(j4.c paramc, int paramInt)
  {
    return k(paramc, paramInt, true);
  }
  
  public f k(j4.c paramc, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 0)) {
      return this;
    }
    paramc = u(paramc);
    int j = a.a[paramc.intEncoding().ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j == 3)
        {
          x(paramc.tag() << 3 | 0x5);
          a.write(p(4).putInt(paramInt).array());
        }
      }
      else
      {
        x(paramc.tag() << 3);
        x(paramInt << 1 ^ paramInt >> 31);
      }
    }
    else
    {
      x(paramc.tag() << 3);
      x(paramInt);
    }
    return this;
  }
  
  public f l(j4.c paramc, long paramLong)
  {
    return m(paramc, paramLong, true);
  }
  
  public f m(j4.c paramc, long paramLong, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramLong == 0L)) {
      return this;
    }
    paramc = u(paramc);
    int j = a.a[paramc.intEncoding().ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j == 3)
        {
          x(paramc.tag() << 3 | 0x1);
          a.write(p(8).putLong(paramLong).array());
        }
      }
      else
      {
        x(paramc.tag() << 3);
        y(paramLong >> 63 ^ paramLong << 1);
      }
    }
    else
    {
      x(paramc.tag() << 3);
      y(paramLong);
    }
    return this;
  }
  
  public f n(j4.c paramc, boolean paramBoolean)
  {
    return o(paramc, paramBoolean, true);
  }
  
  public f o(j4.c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    return k(paramc, paramBoolean1, paramBoolean2);
  }
  
  /* Error */
  public final long q(j4.d paramd, Object paramObject)
  {
    // Byte code:
    //   0: new 325	m4/b
    //   3: dup
    //   4: invokespecial 326	m4/b:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 86	m4/f:a	Ljava/io/OutputStream;
    //   12: astore 4
    //   14: aload_0
    //   15: aload_3
    //   16: putfield 86	m4/f:a	Ljava/io/OutputStream;
    //   19: aload_1
    //   20: aload_2
    //   21: aload_0
    //   22: invokeinterface 329 3 0
    //   27: aload_0
    //   28: aload 4
    //   30: putfield 86	m4/f:a	Ljava/io/OutputStream;
    //   33: aload_3
    //   34: invokevirtual 331	m4/b:a	()J
    //   37: lstore 5
    //   39: aload_3
    //   40: invokevirtual 334	java/io/OutputStream:close	()V
    //   43: lload 5
    //   45: lreturn
    //   46: astore_1
    //   47: goto +12 -> 59
    //   50: astore_1
    //   51: aload_0
    //   52: aload 4
    //   54: putfield 86	m4/f:a	Ljava/io/OutputStream;
    //   57: aload_1
    //   58: athrow
    //   59: aload_3
    //   60: invokevirtual 334	java/io/OutputStream:close	()V
    //   63: goto +9 -> 72
    //   66: astore_2
    //   67: aload_1
    //   68: aload_2
    //   69: invokevirtual 340	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	f
    //   0	74	1	paramd	j4.d
    //   0	74	2	paramObject	Object
    //   7	53	3	localb	b
    //   12	41	4	localOutputStream	OutputStream
    //   37	7	5	l	long
    // Exception table:
    //   from	to	target	type
    //   8	19	46	finally
    //   27	39	46	finally
    //   51	59	46	finally
    //   19	27	50	finally
    //   59	63	66	finally
  }
  
  public final f r(j4.d paramd, j4.c paramc, Object paramObject, boolean paramBoolean)
  {
    long l = q(paramd, paramObject);
    if ((paramBoolean) && (l == 0L)) {
      return this;
    }
    x(v(paramc) << 3 | 0x2);
    y(l);
    paramd.a(paramObject, this);
    return this;
  }
  
  public final f s(j4.f paramf, j4.c paramc, Object paramObject, boolean paramBoolean)
  {
    e.b(paramc, paramBoolean);
    paramf.a(paramObject, e);
    return this;
  }
  
  public f t(Object paramObject)
  {
    if (paramObject == null) {
      return this;
    }
    Object localObject = (j4.d)b.get(paramObject.getClass());
    if (localObject != null)
    {
      ((j4.d)localObject).a(paramObject, this);
      return this;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No encoder for ");
    ((StringBuilder)localObject).append(paramObject.getClass());
    throw new b(((StringBuilder)localObject).toString());
  }
  
  public final void x(int paramInt)
  {
    while ((paramInt & 0xFFFFFF80) != 0L)
    {
      a.write(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
    a.write(paramInt & 0x7F);
  }
  
  public final void y(long paramLong)
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
 * Qualified Name:     m4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */