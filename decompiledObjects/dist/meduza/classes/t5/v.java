package t5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import v5.e0;

public final class v
  extends f
{
  public RandomAccessFile e;
  public Uri f;
  public long g;
  public boolean h;
  
  public v()
  {
    super(false);
  }
  
  /* Error */
  public final long a(n paramn)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 37	t5/n:a	Landroid/net/Uri;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 39	t5/v:f	Landroid/net/Uri;
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 43	t5/f:q	(Lt5/n;)V
    //   15: sipush 2006
    //   18: istore_3
    //   19: aload_2
    //   20: invokevirtual 49	android/net/Uri:getPath	()Ljava/lang/String;
    //   23: astore 4
    //   25: aload 4
    //   27: invokevirtual 55	java/lang/Object:getClass	()Ljava/lang/Class;
    //   30: pop
    //   31: new 57	java/io/RandomAccessFile
    //   34: dup
    //   35: aload 4
    //   37: ldc 59
    //   39: invokespecial 62	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: astore 4
    //   44: aload_0
    //   45: aload 4
    //   47: putfield 64	t5/v:e	Ljava/io/RandomAccessFile;
    //   50: aload 4
    //   52: aload_1
    //   53: getfield 66	t5/n:f	J
    //   56: invokevirtual 70	java/io/RandomAccessFile:seek	(J)V
    //   59: aload_1
    //   60: getfield 72	t5/n:g	J
    //   63: lstore 5
    //   65: lload 5
    //   67: lstore 7
    //   69: lload 5
    //   71: ldc2_w 73
    //   74: lcmp
    //   75: ifne +17 -> 92
    //   78: aload_0
    //   79: getfield 64	t5/v:e	Ljava/io/RandomAccessFile;
    //   82: invokevirtual 78	java/io/RandomAccessFile:length	()J
    //   85: aload_1
    //   86: getfield 66	t5/n:f	J
    //   89: lsub
    //   90: lstore 7
    //   92: aload_0
    //   93: lload 7
    //   95: putfield 79	t5/v:g	J
    //   98: lload 7
    //   100: lconst_0
    //   101: lcmp
    //   102: iflt +18 -> 120
    //   105: aload_0
    //   106: iconst_1
    //   107: putfield 81	t5/v:h	Z
    //   110: aload_0
    //   111: aload_1
    //   112: invokevirtual 83	t5/f:r	(Lt5/n;)V
    //   115: aload_0
    //   116: getfield 79	t5/v:g	J
    //   119: lreturn
    //   120: new 9	t5/v$b
    //   123: dup
    //   124: sipush 2008
    //   127: aconst_null
    //   128: aconst_null
    //   129: invokespecial 86	t5/v$b:<init>	(ILjava/lang/String;Ljava/io/FileNotFoundException;)V
    //   132: athrow
    //   133: astore_1
    //   134: new 9	t5/v$b
    //   137: dup
    //   138: sipush 2000
    //   141: aload_1
    //   142: invokespecial 89	t5/v$b:<init>	(ILjava/lang/Exception;)V
    //   145: athrow
    //   146: astore_1
    //   147: new 9	t5/v$b
    //   150: dup
    //   151: sipush 2000
    //   154: aload_1
    //   155: invokespecial 89	t5/v$b:<init>	(ILjava/lang/Exception;)V
    //   158: athrow
    //   159: astore_1
    //   160: new 9	t5/v$b
    //   163: dup
    //   164: sipush 2006
    //   167: aload_1
    //   168: invokespecial 89	t5/v$b:<init>	(ILjava/lang/Exception;)V
    //   171: athrow
    //   172: astore_1
    //   173: aload_2
    //   174: invokevirtual 92	android/net/Uri:getQuery	()Ljava/lang/String;
    //   177: invokestatic 98	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   180: ifeq +48 -> 228
    //   183: aload_2
    //   184: invokevirtual 101	android/net/Uri:getFragment	()Ljava/lang/String;
    //   187: invokestatic 98	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   190: ifeq +38 -> 228
    //   193: getstatic 106	v5/e0:a	I
    //   196: bipush 21
    //   198: if_icmplt +16 -> 214
    //   201: aload_1
    //   202: invokevirtual 112	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   205: invokestatic 115	t5/v$a:a	(Ljava/lang/Throwable;)Z
    //   208: ifeq +6 -> 214
    //   211: goto +7 -> 218
    //   214: sipush 2005
    //   217: istore_3
    //   218: new 9	t5/v$b
    //   221: dup
    //   222: iload_3
    //   223: aload_1
    //   224: invokespecial 89	t5/v$b:<init>	(ILjava/lang/Exception;)V
    //   227: athrow
    //   228: new 9	t5/v$b
    //   231: dup
    //   232: sipush 1004
    //   235: ldc 117
    //   237: iconst_3
    //   238: anewarray 51	java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload_2
    //   244: invokevirtual 49	android/net/Uri:getPath	()Ljava/lang/String;
    //   247: aastore
    //   248: dup
    //   249: iconst_1
    //   250: aload_2
    //   251: invokevirtual 92	android/net/Uri:getQuery	()Ljava/lang/String;
    //   254: aastore
    //   255: dup
    //   256: iconst_2
    //   257: aload_2
    //   258: invokevirtual 101	android/net/Uri:getFragment	()Ljava/lang/String;
    //   261: aastore
    //   262: invokestatic 123	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   265: aload_1
    //   266: invokespecial 86	t5/v$b:<init>	(ILjava/lang/String;Ljava/io/FileNotFoundException;)V
    //   269: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	v
    //   0	270	1	paramn	n
    //   4	254	2	localUri	Uri
    //   18	205	3	i	int
    //   23	28	4	localObject	Object
    //   63	7	5	l1	long
    //   67	32	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   50	65	133	java/io/IOException
    //   78	92	133	java/io/IOException
    //   92	98	133	java/io/IOException
    //   19	44	146	java/lang/RuntimeException
    //   19	44	159	java/lang/SecurityException
    //   19	44	172	java/io/FileNotFoundException
  }
  
  public final void close()
  {
    f = null;
    try
    {
      localObject1 = e;
      if (localObject1 != null) {
        ((RandomAccessFile)localObject1).close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new t5/v$b;
      ((b)localObject1).<init>(2000, localIOException);
      throw ((Throwable)localObject1);
    }
    finally
    {
      e = null;
      if (h)
      {
        h = false;
        p();
      }
    }
  }
  
  public final Uri l()
  {
    return f;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l = g;
    if (l == 0L) {
      return -1;
    }
    try
    {
      RandomAccessFile localRandomAccessFile = e;
      int i = e0.a;
      paramInt1 = localRandomAccessFile.read(paramArrayOfByte, paramInt1, (int)Math.min(l, paramInt2));
      if (paramInt1 > 0)
      {
        g -= paramInt1;
        o(paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new b(2000, paramArrayOfByte);
    }
  }
  
  public static final class a
  {
    private static boolean b(Throwable paramThrowable)
    {
      boolean bool;
      if (((paramThrowable instanceof ErrnoException)) && (errno == OsConstants.EACCES)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class b
    extends l
  {
    public b(int paramInt, Exception paramException)
    {
      super(paramException);
    }
    
    public b(int paramInt, String paramString, FileNotFoundException paramFileNotFoundException)
    {
      super(paramString, paramFileNotFoundException);
    }
  }
}

/* Location:
 * Qualified Name:     t5.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */