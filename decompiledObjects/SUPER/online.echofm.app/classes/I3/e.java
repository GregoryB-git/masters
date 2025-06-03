package I3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e
  implements Closeable
{
  public static final Logger u = Logger.getLogger(e.class.getName());
  public final RandomAccessFile o;
  public int p;
  public int q;
  public b r;
  public b s;
  public final byte[] t = new byte[16];
  
  public e(File paramFile)
  {
    if (!paramFile.exists()) {
      n(paramFile);
    }
    o = s(paramFile);
    u();
  }
  
  public static void H(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 >> 24));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(byte)paramInt2);
  }
  
  public static void I(byte[] paramArrayOfByte, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      H(paramArrayOfByte, k, paramVarArgs[j]);
      k += 4;
      j++;
    }
  }
  
  public static void n(File paramFile)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramFile.getPath());
    ((StringBuilder)localObject).append(".tmp");
    File localFile = new File(((StringBuilder)localObject).toString());
    localObject = s(localFile);
    try
    {
      ((RandomAccessFile)localObject).setLength(4096L);
      ((RandomAccessFile)localObject).seek(0L);
      byte[] arrayOfByte = new byte[16];
      I(arrayOfByte, new int[] { 4096, 0, 0, 0 });
      ((RandomAccessFile)localObject).write(arrayOfByte);
      ((RandomAccessFile)localObject).close();
      if (localFile.renameTo(paramFile)) {
        return;
      }
      throw new IOException("Rename failed!");
    }
    finally
    {
      ((RandomAccessFile)localObject).close();
    }
  }
  
  public static Object r(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static RandomAccessFile s(File paramFile)
  {
    return new RandomAccessFile(paramFile, "rwd");
  }
  
  public static int v(byte[] paramArrayOfByte, int paramInt)
  {
    return ((paramArrayOfByte[paramInt] & 0xFF) << 24) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 3)] & 0xFF);
  }
  
  public final void B(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = F(paramInt1);
    paramInt1 = p;
    RandomAccessFile localRandomAccessFile;
    if (i + paramInt3 <= paramInt1)
    {
      o.seek(i);
      localRandomAccessFile = o;
    }
    for (;;)
    {
      localRandomAccessFile.readFully(paramArrayOfByte, paramInt2, paramInt3);
      break;
      paramInt1 -= i;
      o.seek(i);
      o.readFully(paramArrayOfByte, paramInt2, paramInt1);
      o.seek(16L);
      localRandomAccessFile = o;
      paramInt2 += paramInt1;
      paramInt3 -= paramInt1;
    }
  }
  
  public final void C(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = F(paramInt1);
    paramInt1 = p;
    RandomAccessFile localRandomAccessFile;
    if (i + paramInt3 <= paramInt1)
    {
      o.seek(i);
      localRandomAccessFile = o;
    }
    for (;;)
    {
      localRandomAccessFile.write(paramArrayOfByte, paramInt2, paramInt3);
      break;
      paramInt1 -= i;
      o.seek(i);
      o.write(paramArrayOfByte, paramInt2, paramInt1);
      o.seek(16L);
      localRandomAccessFile = o;
      paramInt2 += paramInt1;
      paramInt3 -= paramInt1;
    }
  }
  
  public final void D(int paramInt)
  {
    o.setLength(paramInt);
    o.getChannel().force(true);
  }
  
  public int E()
  {
    if (q == 0) {
      return 16;
    }
    b localb = s;
    int i = a;
    int j = r.a;
    if (i >= j) {
      return i - j + 4 + b + 16;
    }
    return i + 4 + b + p - j;
  }
  
  public final int F(int paramInt)
  {
    int i = p;
    if (paramInt >= i) {
      paramInt = paramInt + 16 - i;
    }
    return paramInt;
  }
  
  public final void G(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    I(t, new int[] { paramInt1, paramInt2, paramInt3, paramInt4 });
    o.seek(0L);
    o.write(t);
  }
  
  public void close()
  {
    try
    {
      o.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void h(byte[] paramArrayOfByte)
  {
    i(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    b localb;
    try
    {
      r(paramArrayOfByte, "buffer");
      if (((paramInt1 | paramInt2) < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
        break label198;
      }
      l(paramInt2);
      bool = q();
      int i;
      if (bool)
      {
        i = 16;
      }
      else
      {
        localb = s;
        i = F(a + 4 + b);
      }
      localb = new I3/e$b;
      localb.<init>(i, paramInt2);
      H(t, 0, paramInt2);
      C(a, t, 0, 4);
      C(a + 4, paramArrayOfByte, paramInt1, paramInt2);
      if (bool) {
        paramInt1 = a;
      }
    }
    finally
    {
      break label208;
    }
    paramInt1 = r.a;
    G(p, q + 1, paramInt1, a);
    s = localb;
    q += 1;
    if (bool) {
      r = localb;
    }
    return;
    label198:
    paramArrayOfByte = new java/lang/IndexOutOfBoundsException;
    paramArrayOfByte.<init>();
    throw paramArrayOfByte;
    label208:
    throw paramArrayOfByte;
  }
  
  public void k()
  {
    try
    {
      G(4096, 0, 0, 0);
      q = 0;
      b localb = b.c;
      r = localb;
      s = localb;
      if (p > 4096) {
        D(4096);
      }
    }
    finally
    {
      break label65;
    }
    p = 4096;
    return;
    label65:
    throw ((Throwable)localObject);
  }
  
  public final void l(int paramInt)
  {
    int i = paramInt + 4;
    int j = w();
    if (j >= i) {
      return;
    }
    paramInt = p;
    int k;
    int m;
    do
    {
      k = j + paramInt;
      m = paramInt << 1;
      j = k;
      paramInt = m;
    } while (k < i);
    D(m);
    Object localObject = s;
    paramInt = F(a + 4 + b);
    if (paramInt < r.a)
    {
      localObject = o.getChannel();
      ((FileChannel)localObject).position(p);
      long l = paramInt - 4;
      if (((FileChannel)localObject).transferTo(16L, l, (WritableByteChannel)localObject) != l) {
        throw new AssertionError("Copied insufficient number of bytes!");
      }
    }
    j = s.a;
    paramInt = r.a;
    if (j < paramInt)
    {
      j = p + j - 16;
      G(m, q, paramInt, j);
      s = new b(j, s.b);
    }
    else
    {
      G(m, q, paramInt, j);
    }
    p = m;
  }
  
  /* Error */
  public void m(d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 178	I3/e:r	LI3/e$b;
    //   6: getfield 176	I3/e$b:a	I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: iload_3
    //   13: aload_0
    //   14: getfield 172	I3/e:q	I
    //   17: if_icmpge +65 -> 82
    //   20: aload_0
    //   21: iload_2
    //   22: invokevirtual 231	I3/e:t	(I)LI3/e$b;
    //   25: astore 4
    //   27: new 13	I3/e$c
    //   30: astore 5
    //   32: aload 5
    //   34: aload_0
    //   35: aload 4
    //   37: aconst_null
    //   38: invokespecial 234	I3/e$c:<init>	(LI3/e;LI3/e$b;LI3/e$a;)V
    //   41: aload_1
    //   42: aload 5
    //   44: aload 4
    //   46: getfield 180	I3/e$b:b	I
    //   49: invokeinterface 237 3 0
    //   54: aload_0
    //   55: aload 4
    //   57: getfield 176	I3/e$b:a	I
    //   60: iconst_4
    //   61: iadd
    //   62: aload 4
    //   64: getfield 180	I3/e$b:b	I
    //   67: iadd
    //   68: invokevirtual 79	I3/e:F	(I)I
    //   71: istore_2
    //   72: iinc 3 1
    //   75: goto -63 -> 12
    //   78: astore_1
    //   79: goto +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_1
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	e
    //   0	89	1	paramd	d
    //   9	63	2	i	int
    //   11	62	3	j	int
    //   25	38	4	localb	b
    //   30	13	5	localc	c
    // Exception table:
    //   from	to	target	type
    //   2	10	78	finally
    //   12	72	78	finally
  }
  
  public boolean q()
  {
    try
    {
      int i = q;
      boolean bool;
      if (i == 0) {
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
  
  public final b t(int paramInt)
  {
    if (paramInt == 0) {
      return b.c;
    }
    o.seek(paramInt);
    return new b(paramInt, o.readInt());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('[');
    localStringBuilder.append("fileLength=");
    localStringBuilder.append(p);
    localStringBuilder.append(", size=");
    localStringBuilder.append(q);
    localStringBuilder.append(", first=");
    localStringBuilder.append(r);
    localStringBuilder.append(", last=");
    localStringBuilder.append(s);
    localStringBuilder.append(", element lengths=[");
    try
    {
      a locala = new I3/e$a;
      locala.<init>(this, localStringBuilder);
      m(locala);
    }
    catch (IOException localIOException)
    {
      u.log(Level.WARNING, "read error", localIOException);
    }
    localStringBuilder.append("]]");
    return localStringBuilder.toString();
  }
  
  public final void u()
  {
    o.seek(0L);
    o.readFully(t);
    int i = v(t, 0);
    p = i;
    if (i <= o.length())
    {
      q = v(t, 4);
      int j = v(t, 8);
      i = v(t, 12);
      r = t(j);
      s = t(i);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("File is truncated. Expected length: ");
    localStringBuilder.append(p);
    localStringBuilder.append(", Actual length: ");
    localStringBuilder.append(o.length());
    throw new IOException(localStringBuilder.toString());
  }
  
  public final int w()
  {
    return p - E();
  }
  
  public void x()
  {
    try
    {
      if (q()) {
        break label119;
      }
      if (q == 1) {
        k();
      }
    }
    finally
    {
      break label129;
    }
    Object localObject2 = r;
    int i = F(a + 4 + b);
    B(i, t, 0, 4);
    int j = v(t, 0);
    G(p, q - 1, i, s.a);
    q -= 1;
    localObject2 = new I3/e$b;
    ((b)localObject2).<init>(i, j);
    r = ((b)localObject2);
    return;
    label119:
    localObject2 = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject2).<init>();
    throw ((Throwable)localObject2);
    label129:
    throw ((Throwable)localObject2);
  }
  
  public class a
    implements e.d
  {
    public boolean a = true;
    
    public a(StringBuilder paramStringBuilder) {}
    
    public void a(InputStream paramInputStream, int paramInt)
    {
      if (a) {
        a = false;
      } else {
        b.append(", ");
      }
      b.append(paramInt);
    }
  }
  
  public static class b
  {
    public static final b c = new b(0, 0);
    public final int a;
    public final int b;
    
    public b(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append("[position = ");
      localStringBuilder.append(a);
      localStringBuilder.append(", length = ");
      localStringBuilder.append(b);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public final class c
    extends InputStream
  {
    public int o;
    public int p;
    
    public c(e.b paramb)
    {
      o = e.a(e.this, a + 4);
      p = b;
    }
    
    public int read()
    {
      if (p == 0) {
        return -1;
      }
      e.e(e.this).seek(o);
      int i = e.e(e.this).read();
      o = e.a(e.this, o + 1);
      p -= 1;
      return i;
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      e.b(paramArrayOfByte, "buffer");
      if (((paramInt1 | paramInt2) >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1))
      {
        int i = p;
        if (i > 0)
        {
          int j = paramInt2;
          if (paramInt2 > i) {
            j = i;
          }
          e.c(e.this, o, paramArrayOfByte, paramInt1, j);
          o = e.a(e.this, o + j);
          p -= j;
          return j;
        }
        return -1;
      }
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(InputStream paramInputStream, int paramInt);
  }
}

/* Location:
 * Qualified Name:     I3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */