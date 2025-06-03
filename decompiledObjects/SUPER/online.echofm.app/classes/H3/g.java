package H3;

import J3.B.d.b;
import J3.B.d.b.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class g
  implements F
{
  public final byte[] a;
  public final String b;
  public final String c;
  
  public g(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    b = paramString1;
    c = paramString2;
    a = paramArrayOfByte;
  }
  
  /* Error */
  public final byte[] a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 29	H3/g:b	()Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 31	java/io/ByteArrayOutputStream
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 32	java/io/ByteArrayOutputStream:<init>	()V
    //   17: new 34	java/util/zip/GZIPOutputStream
    //   20: astore_2
    //   21: aload_2
    //   22: aload_1
    //   23: invokespecial 37	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 22	H3/g:a	[B
    //   31: invokevirtual 43	java/io/OutputStream:write	([B)V
    //   34: aload_2
    //   35: invokevirtual 46	java/util/zip/GZIPOutputStream:finish	()V
    //   38: aload_1
    //   39: invokevirtual 49	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   42: astore_3
    //   43: aload_2
    //   44: invokevirtual 52	java/io/OutputStream:close	()V
    //   47: aload_1
    //   48: invokevirtual 53	java/io/ByteArrayOutputStream:close	()V
    //   51: aload_3
    //   52: areturn
    //   53: astore_2
    //   54: goto +19 -> 73
    //   57: astore_3
    //   58: aload_2
    //   59: invokevirtual 52	java/io/OutputStream:close	()V
    //   62: goto +9 -> 71
    //   65: astore_2
    //   66: aload_3
    //   67: aload_2
    //   68: invokevirtual 59	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   71: aload_3
    //   72: athrow
    //   73: aload_1
    //   74: invokevirtual 53	java/io/ByteArrayOutputStream:close	()V
    //   77: goto +9 -> 86
    //   80: astore_1
    //   81: aload_2
    //   82: aload_1
    //   83: invokevirtual 59	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   86: aload_2
    //   87: athrow
    //   88: astore_1
    //   89: aconst_null
    //   90: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	g
    //   12	62	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   80	3	1	localThrowable1	Throwable
    //   88	1	1	localIOException	java.io.IOException
    //   20	24	2	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   53	6	2	localObject1	Object
    //   65	22	2	localThrowable2	Throwable
    //   42	10	3	arrayOfByte	byte[]
    //   57	15	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   17	26	53	finally
    //   43	47	53	finally
    //   66	71	53	finally
    //   71	73	53	finally
    //   26	43	57	finally
    //   58	62	65	finally
    //   73	77	80	finally
    //   9	17	88	java/io/IOException
    //   47	51	88	java/io/IOException
    //   81	86	88	java/io/IOException
    //   86	88	88	java/io/IOException
  }
  
  public final boolean b()
  {
    byte[] arrayOfByte = a;
    boolean bool;
    if ((arrayOfByte != null) && (arrayOfByte.length != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public InputStream i()
  {
    ByteArrayInputStream localByteArrayInputStream;
    if (b()) {
      localByteArrayInputStream = null;
    } else {
      localByteArrayInputStream = new ByteArrayInputStream(a);
    }
    return localByteArrayInputStream;
  }
  
  public String j()
  {
    return c;
  }
  
  public B.d.b k()
  {
    Object localObject = a();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = B.d.b.a().b((byte[])localObject).c(b).a();
    }
    return (B.d.b)localObject;
  }
}

/* Location:
 * Qualified Name:     H3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */