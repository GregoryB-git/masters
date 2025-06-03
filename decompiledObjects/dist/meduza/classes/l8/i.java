package l8;

import a0.j;
import f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class i
  implements Closeable
{
  public static final Logger o = Logger.getLogger(i.class.getName());
  public final RandomAccessFile a;
  public int b;
  public int c;
  public a d;
  public a e;
  public final byte[] f;
  
  public i(File paramFile)
  {
    Object localObject1 = new byte[16];
    f = ((byte[])localObject1);
    int i;
    if (!paramFile.exists())
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(paramFile.getPath());
      ((StringBuilder)localObject2).append(".tmp");
      File localFile = new File(((StringBuilder)localObject2).toString());
      localObject2 = new RandomAccessFile(localFile, "rwd");
      try
      {
        ((RandomAccessFile)localObject2).setLength(4096L);
        ((RandomAccessFile)localObject2).seek(0L);
        byte[] arrayOfByte = new byte[16];
        i = 0;
        j = i;
        while (i < 4)
        {
          int k = new int[] { 4096, 0, 0, 0 }[i];
          arrayOfByte[j] = ((byte)(byte)(k >> 24));
          arrayOfByte[(j + 1)] = ((byte)(byte)(k >> 16));
          arrayOfByte[(j + 2)] = ((byte)(byte)(k >> 8));
          arrayOfByte[(j + 3)] = ((byte)(byte)k);
          j += 4;
          i++;
        }
        ((RandomAccessFile)localObject2).write(arrayOfByte);
        ((RandomAccessFile)localObject2).close();
        if (!localFile.renameTo(paramFile)) {
          throw new IOException("Rename failed!");
        }
      }
      finally
      {
        ((RandomAccessFile)localObject2).close();
      }
    }
    paramFile = new RandomAccessFile(paramFile, "rwd");
    a = paramFile;
    paramFile.seek(0L);
    paramFile.readFully((byte[])localObject1);
    int j = H((byte[])localObject1, 0);
    b = j;
    if (j <= paramFile.length())
    {
      c = H((byte[])localObject1, 4);
      i = H((byte[])localObject1, 8);
      j = H((byte[])localObject1, 12);
      d = C(i);
      e = C(j);
      return;
    }
    localObject1 = f.l("File is truncated. Expected length: ");
    ((StringBuilder)localObject1).append(b);
    ((StringBuilder)localObject1).append(", Actual length: ");
    ((StringBuilder)localObject1).append(paramFile.length());
    throw new IOException(((StringBuilder)localObject1).toString());
  }
  
  public static int H(byte[] paramArrayOfByte, int paramInt)
  {
    return ((paramArrayOfByte[paramInt] & 0xFF) << 24) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 3)] & 0xFF);
  }
  
  public final a C(int paramInt)
  {
    if (paramInt == 0) {
      return a.c;
    }
    a.seek(paramInt);
    return new a(paramInt, a.readInt());
  }
  
  /* Error */
  public final void I()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 118	l8/i:c	I
    //   8: istore_1
    //   9: iload_1
    //   10: ifne +8 -> 18
    //   13: iconst_1
    //   14: istore_2
    //   15: goto +5 -> 20
    //   18: iconst_0
    //   19: istore_2
    //   20: aload_0
    //   21: monitorexit
    //   22: iload_2
    //   23: ifne +179 -> 202
    //   26: iload_1
    //   27: iconst_1
    //   28: if_icmpne +83 -> 111
    //   31: aload_0
    //   32: monitorenter
    //   33: aload_0
    //   34: sipush 4096
    //   37: iconst_0
    //   38: iconst_0
    //   39: iconst_0
    //   40: invokevirtual 153	l8/i:h0	(IIII)V
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 118	l8/i:c	I
    //   48: getstatic 142	l8/i$a:c	Ll8/i$a;
    //   51: astore_3
    //   52: aload_0
    //   53: aload_3
    //   54: putfield 124	l8/i:d	Ll8/i$a;
    //   57: aload_0
    //   58: aload_3
    //   59: putfield 126	l8/i:e	Ll8/i$a;
    //   62: aload_0
    //   63: getfield 112	l8/i:b	I
    //   66: sipush 4096
    //   69: if_icmple +25 -> 94
    //   72: aload_0
    //   73: getfield 103	l8/i:a	Ljava/io/RandomAccessFile;
    //   76: sipush 4096
    //   79: i2l
    //   80: invokevirtual 82	java/io/RandomAccessFile:setLength	(J)V
    //   83: aload_0
    //   84: getfield 103	l8/i:a	Ljava/io/RandomAccessFile;
    //   87: invokevirtual 157	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   90: iconst_1
    //   91: invokevirtual 163	java/nio/channels/FileChannel:force	(Z)V
    //   94: aload_0
    //   95: sipush 4096
    //   98: putfield 112	l8/i:b	I
    //   101: aload_0
    //   102: monitorexit
    //   103: goto +96 -> 199
    //   106: astore_3
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_3
    //   110: athrow
    //   111: aload_0
    //   112: getfield 124	l8/i:d	Ll8/i$a;
    //   115: astore_3
    //   116: aload_0
    //   117: aload_3
    //   118: getfield 165	l8/i$a:a	I
    //   121: iconst_4
    //   122: iadd
    //   123: aload_3
    //   124: getfield 166	l8/i$a:b	I
    //   127: iadd
    //   128: invokevirtual 170	l8/i:c0	(I)I
    //   131: istore_2
    //   132: aload_0
    //   133: iload_2
    //   134: aload_0
    //   135: getfield 45	l8/i:f	[B
    //   138: iconst_0
    //   139: iconst_4
    //   140: invokevirtual 174	l8/i:M	(I[BII)V
    //   143: aload_0
    //   144: getfield 45	l8/i:f	[B
    //   147: iconst_0
    //   148: invokestatic 110	l8/i:H	([BI)I
    //   151: istore_1
    //   152: aload_0
    //   153: aload_0
    //   154: getfield 112	l8/i:b	I
    //   157: aload_0
    //   158: getfield 118	l8/i:c	I
    //   161: iconst_1
    //   162: isub
    //   163: iload_2
    //   164: aload_0
    //   165: getfield 126	l8/i:e	Ll8/i$a;
    //   168: getfield 165	l8/i$a:a	I
    //   171: invokevirtual 153	l8/i:h0	(IIII)V
    //   174: aload_0
    //   175: aload_0
    //   176: getfield 118	l8/i:c	I
    //   179: iconst_1
    //   180: isub
    //   181: putfield 118	l8/i:c	I
    //   184: new 8	l8/i$a
    //   187: astore_3
    //   188: aload_3
    //   189: iload_2
    //   190: iload_1
    //   191: invokespecial 149	l8/i$a:<init>	(II)V
    //   194: aload_0
    //   195: aload_3
    //   196: putfield 124	l8/i:d	Ll8/i$a;
    //   199: aload_0
    //   200: monitorexit
    //   201: return
    //   202: new 176	java/util/NoSuchElementException
    //   205: astore_3
    //   206: aload_3
    //   207: invokespecial 177	java/util/NoSuchElementException:<init>	()V
    //   210: aload_3
    //   211: athrow
    //   212: astore_3
    //   213: goto +8 -> 221
    //   216: astore_3
    //   217: aload_0
    //   218: monitorexit
    //   219: aload_3
    //   220: athrow
    //   221: aload_0
    //   222: monitorexit
    //   223: aload_3
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	i
    //   8	183	1	i	int
    //   14	176	2	j	int
    //   51	8	3	locala	a
    //   106	4	3	localObject1	Object
    //   115	96	3	localObject2	Object
    //   212	1	3	localObject3	Object
    //   216	8	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   33	94	106	finally
    //   94	101	106	finally
    //   2	4	212	finally
    //   20	22	212	finally
    //   31	33	212	finally
    //   101	103	212	finally
    //   107	111	212	finally
    //   111	199	212	finally
    //   202	212	212	finally
    //   217	221	212	finally
    //   4	9	216	finally
  }
  
  public final void M(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = c0(paramInt1);
    paramInt1 = b;
    RandomAccessFile localRandomAccessFile;
    if (i + paramInt3 <= paramInt1)
    {
      a.seek(i);
      localRandomAccessFile = a;
    }
    else
    {
      paramInt1 -= i;
      a.seek(i);
      a.readFully(paramArrayOfByte, paramInt2, paramInt1);
      a.seek(16L);
      localRandomAccessFile = a;
      paramInt2 += paramInt1;
      paramInt3 -= paramInt1;
    }
    localRandomAccessFile.readFully(paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public final void Q(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = c0(paramInt1);
    int j = b;
    paramInt1 = 0;
    RandomAccessFile localRandomAccessFile;
    if (i + paramInt2 <= j)
    {
      a.seek(i);
      localRandomAccessFile = a;
    }
    else
    {
      j -= i;
      a.seek(i);
      a.write(paramArrayOfByte, 0, j);
      a.seek(16L);
      localRandomAccessFile = a;
      paramInt1 = 0 + j;
      paramInt2 -= j;
    }
    localRandomAccessFile.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int b0()
  {
    if (c == 0) {
      return 16;
    }
    a locala = e;
    int i = a;
    int j = d.a;
    if (i >= j) {
      return i - j + 4 + b + 16;
    }
    return i + 4 + b + b - j;
  }
  
  public final int c0(int paramInt)
  {
    int i = b;
    if (paramInt >= i) {
      paramInt = paramInt + 16 - i;
    }
    return paramInt;
  }
  
  public final void close()
  {
    try
    {
      a.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void f(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if ((i | 0x0) >= 0) {}
    try
    {
      if (i <= paramArrayOfByte.length - 0)
      {
        g(i);
        try
        {
          int j = c;
          int k;
          if (j == 0) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0)
          {
            j = 16;
          }
          else
          {
            locala = e;
            j = c0(a + 4 + b);
          }
          a locala = new l8/i$a;
          locala.<init>(j, i);
          byte[] arrayOfByte = f;
          arrayOfByte[0] = ((byte)(byte)(i >> 24));
          arrayOfByte[1] = ((byte)(byte)(i >> 16));
          arrayOfByte[2] = ((byte)(byte)(i >> 8));
          arrayOfByte[3] = ((byte)(byte)i);
          Q(j, arrayOfByte, 4);
          Q(j + 4, paramArrayOfByte, i);
          if (k != 0) {
            i = j;
          } else {
            i = d.a;
          }
          h0(b, c + 1, i, j);
          e = locala;
          c += 1;
          if (k != 0) {
            d = locala;
          }
          return;
        }
        finally
        {
          paramArrayOfByte = finally;
          throw paramArrayOfByte;
        }
      }
      paramArrayOfByte = new java/lang/IndexOutOfBoundsException;
      paramArrayOfByte.<init>();
      throw paramArrayOfByte;
    }
    finally {}
  }
  
  public final void g(int paramInt)
  {
    int i = paramInt + 4;
    int j = b - b0();
    if (j >= i) {
      return;
    }
    paramInt = b;
    int k;
    int m;
    do
    {
      k = j + paramInt;
      m = paramInt << 1;
      j = k;
      paramInt = m;
    } while (k < i);
    a.setLength(m);
    a.getChannel().force(true);
    Object localObject = e;
    paramInt = c0(a + 4 + b);
    if (paramInt < d.a)
    {
      localObject = a.getChannel();
      ((FileChannel)localObject).position(b);
      long l = paramInt - 4;
      if (((FileChannel)localObject).transferTo(16L, l, (WritableByteChannel)localObject) != l) {
        throw new AssertionError("Copied insufficient number of bytes!");
      }
    }
    j = e.a;
    paramInt = d.a;
    if (j < paramInt)
    {
      j = b + j - 16;
      h0(m, c, paramInt, j);
      e = new a(j, e.b);
    }
    else
    {
      h0(m, c, paramInt, j);
    }
    b = m;
  }
  
  public final void h0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    byte[] arrayOfByte = f;
    int i = 0;
    int j = 0;
    while (i < 4)
    {
      int k = new int[] { paramInt1, paramInt2, paramInt3, paramInt4 }[i];
      arrayOfByte[j] = ((byte)(byte)(k >> 24));
      arrayOfByte[(j + 1)] = ((byte)(byte)(k >> 16));
      arrayOfByte[(j + 2)] = ((byte)(byte)(k >> 8));
      arrayOfByte[(j + 3)] = ((byte)(byte)k);
      j += 4;
      i++;
    }
    a.seek(0L);
    a.write(f);
  }
  
  public final String toString()
  {
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(i.class.getSimpleName());
    localStringBuilder.append('[');
    localStringBuilder.append("fileLength=");
    localStringBuilder.append(b);
    localStringBuilder.append(", size=");
    localStringBuilder.append(c);
    localStringBuilder.append(", first=");
    localStringBuilder.append(d);
    localStringBuilder.append(", last=");
    localStringBuilder.append(e);
    localStringBuilder.append(", element lengths=[");
    try
    {
      try
      {
        int i = d.a;
        int j = 1;
        for (int k = 0; k < c; k++)
        {
          a locala = C(i);
          new b(locala);
          i = b;
          if (j != 0) {
            j = 0;
          } else {
            localStringBuilder.append(", ");
          }
          localStringBuilder.append(i);
          i = c0(a + 4 + b);
        }
      }
      finally {}
      return localStringBuilder.toString();
    }
    catch (IOException localIOException)
    {
      o.log(Level.WARNING, "read error", localIOException);
      localStringBuilder.append("]]");
    }
  }
  
  public static final class a
  {
    public static final a c = new a(0, 0);
    public final int a;
    public final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a.class.getSimpleName());
      localStringBuilder.append("[position = ");
      localStringBuilder.append(a);
      localStringBuilder.append(", length = ");
      return j.m(localStringBuilder, b, "]");
    }
  }
  
  public final class b
    extends InputStream
  {
    public int a;
    public int b;
    
    public b(i.a parama)
    {
      a = c0(a + 4);
      b = b;
    }
    
    public final int read()
    {
      if (b == 0) {
        return -1;
      }
      a.seek(a);
      int i = a.read();
      a = c0(a + 1);
      b -= 1;
      return i;
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (paramArrayOfByte != null)
      {
        if (((paramInt1 | paramInt2) >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1))
        {
          int i = b;
          if (i > 0)
          {
            int j = paramInt2;
            if (paramInt2 > i) {
              j = i;
            }
            M(a, paramArrayOfByte, paramInt1, j);
            a = c0(a + j);
            b -= j;
            return j;
          }
          return -1;
        }
        throw new ArrayIndexOutOfBoundsException();
      }
      throw new NullPointerException("buffer");
    }
  }
}

/* Location:
 * Qualified Name:     l8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */