package R2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class q4
  extends l3
{
  public q4(N2 paramN2)
  {
    super(paramN2);
  }
  
  /* Error */
  public static byte[] v(java.net.HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_1
    //   3: astore_2
    //   4: new 17	java/io/ByteArrayOutputStream
    //   7: astore_3
    //   8: aload_1
    //   9: astore_2
    //   10: aload_3
    //   11: invokespecial 20	java/io/ByteArrayOutputStream:<init>	()V
    //   14: aload_1
    //   15: astore_2
    //   16: aload_0
    //   17: invokevirtual 26	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   20: astore_0
    //   21: aload_0
    //   22: astore_2
    //   23: sipush 1024
    //   26: newarray <illegal type>
    //   28: astore_1
    //   29: aload_0
    //   30: astore_2
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual 32	java/io/InputStream:read	([B)I
    //   36: istore 4
    //   38: iload 4
    //   40: ifle +20 -> 60
    //   43: aload_0
    //   44: astore_2
    //   45: aload_3
    //   46: aload_1
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 36	java/io/ByteArrayOutputStream:write	([BII)V
    //   53: goto -24 -> 29
    //   56: astore_0
    //   57: goto +16 -> 73
    //   60: aload_0
    //   61: astore_2
    //   62: aload_3
    //   63: invokevirtual 40	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   66: astore_1
    //   67: aload_0
    //   68: invokevirtual 43	java/io/InputStream:close	()V
    //   71: aload_1
    //   72: areturn
    //   73: aload_2
    //   74: ifnull +7 -> 81
    //   77: aload_2
    //   78: invokevirtual 43	java/io/InputStream:close	()V
    //   81: aload_0
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramHttpURLConnection	java.net.HttpURLConnection
    //   1	71	1	arrayOfByte	byte[]
    //   3	75	2	localObject	Object
    //   7	56	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   36	13	4	i	int
    // Exception table:
    //   from	to	target	type
    //   4	8	56	finally
    //   10	14	56	finally
    //   16	21	56	finally
    //   23	29	56	finally
    //   31	38	56	finally
    //   45	53	56	finally
    //   62	67	56	finally
  }
  
  public final boolean s()
  {
    return false;
  }
  
  public final boolean w()
  {
    o();
    Object localObject = (ConnectivityManager)a().getSystemService("connectivity");
    if (localObject != null) {}
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    localObject = null;
    return (localObject != null) && (((NetworkInfo)localObject).isConnected());
  }
}

/* Location:
 * Qualified Name:     R2.q4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */