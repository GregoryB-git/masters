package H3;

import J3.B.d.b;
import J3.B.d.b.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class B
  implements F
{
  public final File a;
  public final String b;
  public final String c;
  
  public B(String paramString1, String paramString2, File paramFile)
  {
    b = paramString1;
    c = paramString2;
    a = paramFile;
  }
  
  /* Error */
  private byte[] a()
  {
    // Byte code:
    //   0: sipush 8192
    //   3: newarray <illegal type>
    //   5: astore_1
    //   6: aload_0
    //   7: invokevirtual 30	H3/B:i	()Ljava/io/InputStream;
    //   10: astore_2
    //   11: new 32	java/io/ByteArrayOutputStream
    //   14: astore_3
    //   15: aload_3
    //   16: invokespecial 33	java/io/ByteArrayOutputStream:<init>	()V
    //   19: new 35	java/util/zip/GZIPOutputStream
    //   22: astore 4
    //   24: aload 4
    //   26: aload_3
    //   27: invokespecial 38	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: aload_2
    //   31: ifnonnull +31 -> 62
    //   34: aload 4
    //   36: invokevirtual 43	java/io/OutputStream:close	()V
    //   39: aload_3
    //   40: invokevirtual 44	java/io/ByteArrayOutputStream:close	()V
    //   43: aload_2
    //   44: ifnull +7 -> 51
    //   47: aload_2
    //   48: invokevirtual 47	java/io/InputStream:close	()V
    //   51: aconst_null
    //   52: areturn
    //   53: astore_3
    //   54: goto +96 -> 150
    //   57: astore 4
    //   59: goto +74 -> 133
    //   62: aload_2
    //   63: aload_1
    //   64: invokevirtual 51	java/io/InputStream:read	([B)I
    //   67: istore 5
    //   69: iload 5
    //   71: ifle +19 -> 90
    //   74: aload 4
    //   76: aload_1
    //   77: iconst_0
    //   78: iload 5
    //   80: invokevirtual 55	java/util/zip/GZIPOutputStream:write	([BII)V
    //   83: goto -21 -> 62
    //   86: astore_1
    //   87: goto +28 -> 115
    //   90: aload 4
    //   92: invokevirtual 58	java/util/zip/GZIPOutputStream:finish	()V
    //   95: aload_3
    //   96: invokevirtual 61	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   99: astore_1
    //   100: aload 4
    //   102: invokevirtual 43	java/io/OutputStream:close	()V
    //   105: aload_3
    //   106: invokevirtual 44	java/io/ByteArrayOutputStream:close	()V
    //   109: aload_2
    //   110: invokevirtual 47	java/io/InputStream:close	()V
    //   113: aload_1
    //   114: areturn
    //   115: aload 4
    //   117: invokevirtual 43	java/io/OutputStream:close	()V
    //   120: goto +11 -> 131
    //   123: astore 4
    //   125: aload_1
    //   126: aload 4
    //   128: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   131: aload_1
    //   132: athrow
    //   133: aload_3
    //   134: invokevirtual 44	java/io/ByteArrayOutputStream:close	()V
    //   137: goto +10 -> 147
    //   140: astore_3
    //   141: aload 4
    //   143: aload_3
    //   144: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   147: aload 4
    //   149: athrow
    //   150: aload_2
    //   151: ifnull +16 -> 167
    //   154: aload_2
    //   155: invokevirtual 47	java/io/InputStream:close	()V
    //   158: goto +9 -> 167
    //   161: astore_2
    //   162: aload_3
    //   163: aload_2
    //   164: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   167: aload_3
    //   168: athrow
    //   169: astore_2
    //   170: aconst_null
    //   171: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	B
    //   5	72	1	arrayOfByte1	byte[]
    //   86	1	1	localObject1	Object
    //   99	33	1	arrayOfByte2	byte[]
    //   10	145	2	localInputStream	InputStream
    //   161	3	2	localThrowable1	Throwable
    //   169	1	2	localIOException	java.io.IOException
    //   14	26	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   53	81	3	localObject2	Object
    //   140	28	3	localThrowable2	Throwable
    //   22	13	4	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   57	59	4	localObject3	Object
    //   123	25	4	localThrowable3	Throwable
    //   67	12	5	i	int
    // Exception table:
    //   from	to	target	type
    //   11	19	53	finally
    //   39	43	53	finally
    //   105	109	53	finally
    //   141	147	53	finally
    //   147	150	53	finally
    //   19	30	57	finally
    //   34	39	57	finally
    //   100	105	57	finally
    //   125	131	57	finally
    //   131	133	57	finally
    //   62	69	86	finally
    //   74	83	86	finally
    //   90	100	86	finally
    //   115	120	123	finally
    //   133	137	140	finally
    //   154	158	161	finally
    //   6	11	169	java/io/IOException
    //   47	51	169	java/io/IOException
    //   109	113	169	java/io/IOException
    //   162	167	169	java/io/IOException
    //   167	169	169	java/io/IOException
  }
  
  public InputStream i()
  {
    if ((a.exists()) && (a.isFile())) {}
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(a);
      return localFileInputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;) {}
    }
    return null;
  }
  
  public String j()
  {
    return c;
  }
  
  public B.d.b k()
  {
    Object localObject = a();
    if (localObject != null) {
      localObject = B.d.b.a().b((byte[])localObject).c(b).a();
    } else {
      localObject = null;
    }
    return (B.d.b)localObject;
  }
}

/* Location:
 * Qualified Name:     H3.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */