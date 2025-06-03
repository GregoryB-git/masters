package X1;

import android.util.Base64;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.i;
import x1.B;

public final class c
{
  public static final c a = new c();
  public static final String b = "/.well-known/oauth/openid/keys/";
  
  public static final PublicKey b(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    paramString = Base64.decode(i.q(i.q(i.q(paramString, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
    Intrinsics.checkNotNullExpressionValue(paramString, "decode(pubKeyString, Base64.DEFAULT)");
    paramString = new X509EncodedKeySpec(paramString);
    paramString = KeyFactory.getInstance("RSA").generatePublic(paramString);
    Intrinsics.checkNotNullExpressionValue(paramString, "kf.generatePublic(x509publicKey)");
    return paramString;
  }
  
  public static final String c(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "kid");
    URL localURL = new URL("https", Intrinsics.i("www.", B.u()), b);
    ReentrantLock localReentrantLock = new ReentrantLock();
    Condition localCondition = localReentrantLock.newCondition();
    u localu = new u();
    B.t().execute(new b(localURL, localu, paramString, localReentrantLock, localCondition));
    localReentrantLock.lock();
    try
    {
      localCondition.await(5000L, TimeUnit.MILLISECONDS);
      return (String)o;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public static final void d(URL paramURL, u paramu, String paramString, ReentrantLock paramReentrantLock, Condition paramCondition)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc -99
    //   3: invokestatic 34	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -97
    //   9: invokestatic 34	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc -95
    //   15: invokestatic 34	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_3
    //   19: ldc -93
    //   21: invokestatic 34	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 167	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   28: invokestatic 173	com/google/firebase/perf/network/FirebasePerfUrlConnection:instrument	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 175	java/net/URLConnection
    //   34: astore_0
    //   35: aload_0
    //   36: ifnull +256 -> 292
    //   39: aload_0
    //   40: checkcast 177	java/net/HttpURLConnection
    //   43: astore 5
    //   45: aload 5
    //   47: invokevirtual 181	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   50: astore 6
    //   52: aload 6
    //   54: ldc -73
    //   56: invokestatic 59	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   59: getstatic 188	kotlin/text/b:b	Ljava/nio/charset/Charset;
    //   62: astore_0
    //   63: new 190	java/io/InputStreamReader
    //   66: astore 7
    //   68: aload 7
    //   70: aload 6
    //   72: aload_0
    //   73: invokespecial 193	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   76: aload 7
    //   78: instanceof 195
    //   81: ifeq +20 -> 101
    //   84: aload 7
    //   86: checkcast 195	java/io/BufferedReader
    //   89: astore_0
    //   90: goto +24 -> 114
    //   93: astore_0
    //   94: goto +159 -> 253
    //   97: astore_0
    //   98: goto +90 -> 188
    //   101: new 195	java/io/BufferedReader
    //   104: dup
    //   105: aload 7
    //   107: sipush 8192
    //   110: invokespecial 198	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   113: astore_0
    //   114: aload_0
    //   115: invokestatic 204	e6/m:f	(Ljava/io/Reader;)Ljava/lang/String;
    //   118: astore_0
    //   119: aload 5
    //   121: invokevirtual 181	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   124: invokevirtual 209	java/io/InputStream:close	()V
    //   127: new 211	org/json/JSONObject
    //   130: astore 6
    //   132: aload 6
    //   134: aload_0
    //   135: invokespecial 214	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   138: aload_1
    //   139: aload 6
    //   141: aload_2
    //   142: invokevirtual 217	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   145: putfield 151	kotlin/jvm/internal/u:o	Ljava/lang/Object;
    //   148: aload 5
    //   150: invokevirtual 220	java/net/HttpURLConnection:disconnect	()V
    //   153: aload_3
    //   154: invokeinterface 130 1 0
    //   159: aload 4
    //   161: invokeinterface 223 1 0
    //   166: getstatic 228	V5/t:a	LV5/t;
    //   169: astore_0
    //   170: aload_3
    //   171: invokeinterface 147 1 0
    //   176: goto +67 -> 243
    //   179: astore_0
    //   180: aload_3
    //   181: invokeinterface 147 1 0
    //   186: aload_0
    //   187: athrow
    //   188: getstatic 15	X1/c:a	LX1/c;
    //   191: invokevirtual 232	java/lang/Object:getClass	()Ljava/lang/Class;
    //   194: invokevirtual 237	java/lang/Class:getName	()Ljava/lang/String;
    //   197: astore_2
    //   198: aload_0
    //   199: invokevirtual 242	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   202: astore_1
    //   203: aload_1
    //   204: astore_0
    //   205: aload_1
    //   206: ifnonnull +6 -> 212
    //   209: ldc -12
    //   211: astore_0
    //   212: aload_2
    //   213: aload_0
    //   214: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload 5
    //   220: invokevirtual 220	java/net/HttpURLConnection:disconnect	()V
    //   223: aload_3
    //   224: invokeinterface 130 1 0
    //   229: aload 4
    //   231: invokeinterface 223 1 0
    //   236: getstatic 228	V5/t:a	LV5/t;
    //   239: astore_0
    //   240: goto -70 -> 170
    //   243: return
    //   244: astore_0
    //   245: aload_3
    //   246: invokeinterface 147 1 0
    //   251: aload_0
    //   252: athrow
    //   253: aload 5
    //   255: invokevirtual 220	java/net/HttpURLConnection:disconnect	()V
    //   258: aload_3
    //   259: invokeinterface 130 1 0
    //   264: aload 4
    //   266: invokeinterface 223 1 0
    //   271: getstatic 228	V5/t:a	LV5/t;
    //   274: astore_1
    //   275: aload_3
    //   276: invokeinterface 147 1 0
    //   281: aload_0
    //   282: athrow
    //   283: astore_0
    //   284: aload_3
    //   285: invokeinterface 147 1 0
    //   290: aload_0
    //   291: athrow
    //   292: new 251	java/lang/NullPointerException
    //   295: dup
    //   296: ldc -3
    //   298: invokespecial 254	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   301: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	302	0	paramURL	URL
    //   0	302	1	paramu	u
    //   0	302	2	paramString	String
    //   0	302	3	paramReentrantLock	ReentrantLock
    //   0	302	4	paramCondition	Condition
    //   43	211	5	localHttpURLConnection	java.net.HttpURLConnection
    //   50	90	6	localObject	Object
    //   66	40	7	localInputStreamReader	java.io.InputStreamReader
    // Exception table:
    //   from	to	target	type
    //   45	90	93	finally
    //   101	114	93	finally
    //   114	148	93	finally
    //   188	203	93	finally
    //   212	218	93	finally
    //   45	90	97	java/lang/Exception
    //   101	114	97	java/lang/Exception
    //   114	148	97	java/lang/Exception
    //   159	170	179	finally
    //   229	240	244	finally
    //   264	275	283	finally
  }
  
  public static final boolean e(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramPublicKey, "publicKey");
    Intrinsics.checkNotNullParameter(paramString1, "data");
    Intrinsics.checkNotNullParameter(paramString2, "signature");
    try
    {
      Signature localSignature = Signature.getInstance("SHA256withRSA");
      localSignature.initVerify(paramPublicKey);
      paramPublicKey = paramString1.getBytes(kotlin.text.b.b);
      Intrinsics.checkNotNullExpressionValue(paramPublicKey, "(this as java.lang.String).getBytes(charset)");
      localSignature.update(paramPublicKey);
      paramPublicKey = Base64.decode(paramString2, 8);
      Intrinsics.checkNotNullExpressionValue(paramPublicKey, "decode(signature, Base64.URL_SAFE)");
      boolean bool = localSignature.verify(paramPublicKey);
      return bool;
    }
    catch (Exception paramPublicKey) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     X1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */