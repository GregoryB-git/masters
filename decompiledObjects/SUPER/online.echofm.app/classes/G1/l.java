package G1;

import W5.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import e6.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

public final class l
{
  public static final l a = new l();
  public static final String b = l.class.getSimpleName();
  public static final String[] c = { "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" };
  
  public static final String b(String paramString)
  {
    return a.d(new File(paramString));
  }
  
  public static final String c(Context paramContext, Long paramLong)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Object localObject1 = CertificateFactory.getInstance("X.509");
    Object localObject2 = c;
    Object localObject3 = new ArrayList(localObject2.length);
    int i = localObject2.length;
    for (int j = 0; j < i; j++) {
      ((Collection)localObject3).add(((CertificateFactory)localObject1).generateCertificate(new ByteArrayInputStream(Base64.decode(localObject2[j], 0))));
    }
    localObject3 = m.I((Collection)localObject3);
    localObject1 = new u();
    localObject2 = new ReentrantLock();
    Condition localCondition = ((ReentrantLock)localObject2).newCondition();
    ((ReentrantLock)localObject2).lock();
    try
    {
      Object localObject4 = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
      Intrinsics.checkNotNullExpressionValue(localObject4, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
      localObject4 = ((Field)localObject4).get(null);
      Object localObject5 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
      Object localObject6 = l.class.getClassLoader();
      a locala = new G1/l$a;
      locala.<init>(localObject4, (u)localObject1, (ReentrantLock)localObject2, localCondition);
      localObject6 = Proxy.newProxyInstance((ClassLoader)localObject6, new Class[] { localObject5 }, locala);
      Intrinsics.checkNotNullExpressionValue(localObject6, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
      localObject5 = PackageManager.class.getMethod("requestChecksums", new Class[] { String.class, Boolean.TYPE, Integer.TYPE, List.class, localObject5 });
      Intrinsics.checkNotNullExpressionValue(localObject5, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
      ((Method)localObject5).invoke(paramContext.getPackageManager(), new Object[] { paramContext.getPackageName(), Boolean.FALSE, localObject4, m.I((Collection)localObject3), localObject6 });
      if (paramLong == null) {
        localCondition.await();
      } else {
        localCondition.awaitNanos(paramLong.longValue());
      }
      paramContext = (String)o;
      return paramContext;
    }
    finally
    {
      ((ReentrantLock)localObject2).unlock();
    }
    return null;
  }
  
  public final String d(File paramFile)
  {
    paramFile = new BufferedInputStream(new FileInputStream(paramFile), 1024);
    int i;
    do
    {
      try
      {
        localObject1 = MessageDigest.getInstance("MD5");
        byte[] arrayOfByte = new byte['Ѐ'];
        i = paramFile.read(arrayOfByte);
        if (i > 0) {
          ((MessageDigest)localObject1).update(arrayOfByte, 0, i);
        }
      }
      finally
      {
        break;
      }
    } while (i != -1);
    BigInteger localBigInteger = new java/math/BigInteger;
    localBigInteger.<init>(1, ((MessageDigest)localObject1).digest());
    Object localObject1 = localBigInteger.toString(16);
    Intrinsics.checkNotNullExpressionValue(localObject1, "BigInteger(1, md.digest()).toString(16)");
    b.a(paramFile, null);
    return (String)localObject1;
    try
    {
      throw localBigInteger;
    }
    finally
    {
      b.a(paramFile, localBigInteger);
    }
  }
  
  public static final class a
    implements InvocationHandler
  {
    public a(Object paramObject, u paramu, ReentrantLock paramReentrantLock, Condition paramCondition) {}
    
    /* Error */
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 36
      //   3: invokestatic 42	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_3
      //   7: ldc 44
      //   9: invokestatic 42	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_2
      //   13: invokevirtual 50	java/lang/reflect/Method:getName	()Ljava/lang/String;
      //   16: ldc 52
      //   18: invokestatic 55	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   21: ifeq +249 -> 270
      //   24: aload_3
      //   25: arraylength
      //   26: iconst_1
      //   27: if_icmpne +243 -> 270
      //   30: aload_3
      //   31: iconst_0
      //   32: aaload
      //   33: astore_1
      //   34: aload_1
      //   35: instanceof 57
      //   38: ifeq +232 -> 270
      //   41: aload_1
      //   42: checkcast 57	java/util/List
      //   45: invokeinterface 61 1 0
      //   50: astore_3
      //   51: aload_3
      //   52: invokeinterface 67 1 0
      //   57: ifeq +213 -> 270
      //   60: aload_3
      //   61: invokeinterface 71 1 0
      //   66: astore_1
      //   67: aload_1
      //   68: ifnull -17 -> 51
      //   71: aload_1
      //   72: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
      //   75: ldc 77
      //   77: iconst_0
      //   78: anewarray 79	java/lang/Class
      //   81: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   84: astore_2
      //   85: aload_2
      //   86: ldc 85
      //   88: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   91: aload_1
      //   92: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
      //   95: ldc 90
      //   97: iconst_0
      //   98: anewarray 79	java/lang/Class
      //   101: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   104: astore 4
      //   106: aload 4
      //   108: ldc 92
      //   110: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   113: aload_2
      //   114: aload_1
      //   115: iconst_0
      //   116: anewarray 4	java/lang/Object
      //   119: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   122: ifnonnull -71 -> 51
      //   125: aload 4
      //   127: aload_1
      //   128: iconst_0
      //   129: anewarray 4	java/lang/Object
      //   132: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   135: aload_0
      //   136: getfield 22	G1/l$a:a	Ljava/lang/Object;
      //   139: invokestatic 55	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   142: ifeq -91 -> 51
      //   145: aload_1
      //   146: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
      //   149: ldc 97
      //   151: iconst_0
      //   152: anewarray 79	java/lang/Class
      //   155: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   158: astore_2
      //   159: aload_2
      //   160: ldc 99
      //   162: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   165: aload_2
      //   166: aload_1
      //   167: iconst_0
      //   168: anewarray 4	java/lang/Object
      //   171: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   174: astore_1
      //   175: aload_1
      //   176: ifnull +72 -> 248
      //   179: aload_1
      //   180: checkcast 101	[B
      //   183: astore_2
      //   184: aload_0
      //   185: getfield 24	G1/l$a:b	Lkotlin/jvm/internal/u;
      //   188: astore_1
      //   189: new 103	java/math/BigInteger
      //   192: astore_3
      //   193: aload_3
      //   194: iconst_1
      //   195: aload_2
      //   196: invokespecial 106	java/math/BigInteger:<init>	(I[B)V
      //   199: aload_1
      //   200: aload_3
      //   201: bipush 16
      //   203: invokevirtual 110	java/math/BigInteger:toString	(I)Ljava/lang/String;
      //   206: putfield 115	kotlin/jvm/internal/u:o	Ljava/lang/Object;
      //   209: aload_0
      //   210: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
      //   213: invokevirtual 120	java/util/concurrent/locks/ReentrantLock:lock	()V
      //   216: aload_0
      //   217: getfield 28	G1/l$a:d	Ljava/util/concurrent/locks/Condition;
      //   220: invokeinterface 125 1 0
      //   225: aload_0
      //   226: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
      //   229: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   232: aconst_null
      //   233: areturn
      //   234: astore_1
      //   235: goto +25 -> 260
      //   238: astore_1
      //   239: aload_0
      //   240: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
      //   243: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   246: aload_1
      //   247: athrow
      //   248: new 130	java/lang/NullPointerException
      //   251: astore_1
      //   252: aload_1
      //   253: ldc -124
      //   255: invokespecial 135	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
      //   258: aload_1
      //   259: athrow
      //   260: invokestatic 137	G1/l:a	()Ljava/lang/String;
      //   263: ldc -117
      //   265: aload_1
      //   266: invokestatic 144	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   269: pop
      //   270: aconst_null
      //   271: areturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	272	0	this	a
      //   0	272	1	paramObject	Object
      //   0	272	2	paramMethod	Method
      //   0	272	3	paramArrayOfObject	Object[]
      //   104	22	4	localMethod	Method
      // Exception table:
      //   from	to	target	type
      //   12	30	234	finally
      //   34	51	234	finally
      //   51	67	234	finally
      //   71	175	234	finally
      //   179	216	234	finally
      //   225	232	234	finally
      //   239	248	234	finally
      //   248	260	234	finally
      //   216	225	238	finally
    }
  }
}

/* Location:
 * Qualified Name:     G1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */