// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import java.io.Closeable;
import e6.b;
import java.security.MessageDigest;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import android.content.pm.PackageManager;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import android.util.Log;
import java.math.BigInteger;
import java.util.List;
import java.lang.reflect.Method;
import java.util.concurrent.locks.Condition;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.u;
import java.util.Collection;
import W5.m;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.util.Base64;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import java.io.File;

public final class l
{
    public static final l a;
    public static final String b;
    public static final String[] c;
    
    static {
        a = new l();
        b = l.class.getSimpleName();
        c = new String[] { "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" };
    }
    
    public static final /* synthetic */ String a() {
        return l.b;
    }
    
    public static final String b(final String pathname) {
        return l.a.d(new File(pathname));
    }
    
    public static final String c(final Context context, final Long n) {
        Intrinsics.checkNotNullParameter(context, "context");
        final CertificateFactory instance = CertificateFactory.getInstance("X.509");
        final String[] c = l.c;
        final ArrayList list = new ArrayList<Certificate>(c.length);
        for (int length = c.length, i = 0; i < length; ++i) {
            list.add(instance.generateCertificate(new ByteArrayInputStream(Base64.decode(c[i], 0))));
        }
        final List j = m.I(list);
        final u u = new u();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition condition = reentrantLock.newCondition();
        reentrantLock.lock();
        while (true) {
            try {
                final Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
                Intrinsics.checkNotNullExpressionValue(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
                final Object value = field.get(null);
                final Class<?> forName = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
                final Object proxyInstance = Proxy.newProxyInstance(l.class.getClassLoader(), new Class[] { forName }, new InvocationHandler() {
                    @Override
                    public Object invoke(Object obj, Method method, final Object[] array) {
                        Intrinsics.checkNotNullParameter(method, "method");
                        Intrinsics.checkNotNullParameter(array, "objects");
                        while (true) {
                            try {
                                if (Intrinsics.a(method.getName(), "onChecksumsReady") && array.length == 1) {
                                    obj = array[0];
                                    if (obj instanceof List) {
                                        final Iterator<Object> iterator = ((List)obj).iterator();
                                        while (iterator.hasNext()) {
                                            obj = iterator.next();
                                            if (obj != null) {
                                                final Method method2 = obj.getClass().getMethod("getSplitName", (Class<?>[])new Class[0]);
                                                Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                                final Method method3 = obj.getClass().getMethod("getType", (Class<?>[])new Class[0]);
                                                Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                                                if (method2.invoke(obj, new Object[0]) == null && Intrinsics.a(method3.invoke(obj, new Object[0]), value)) {
                                                    method = obj.getClass().getMethod("getValue", (Class<?>[])new Class[0]);
                                                    Intrinsics.checkNotNullExpressionValue(method, "c.javaClass.getMethod(\"getValue\")");
                                                    obj = method.invoke(obj, new Object[0]);
                                                    if (obj != null) {
                                                        u.o = new BigInteger(1, (byte[])obj).toString(16);
                                                        reentrantLock.lock();
                                                        try {
                                                            condition.signalAll();
                                                            return null;
                                                        }
                                                        finally {
                                                            reentrantLock.unlock();
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                                }
                                                continue;
                                            }
                                        }
                                    }
                                }
                                return null;
                                final Throwable t;
                                Log.d(l.a(), "Can't fetch checksum.", t);
                                return null;
                            }
                            finally {}
                            final Throwable t2;
                            final Throwable t = t2;
                            continue;
                        }
                    }
                });
                Intrinsics.checkNotNullExpressionValue(proxyInstance, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
                final Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, forName);
                Intrinsics.checkNotNullExpressionValue(method, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
                method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, value, m.I(j), proxyInstance);
                if (n == null) {
                    condition.await();
                }
                else {
                    condition.awaitNanos(n);
                }
                final String s = (String)u.o;
                reentrantLock.unlock();
                return s;
                reentrantLock.unlock();
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String d(File file) {
        file = (File)new BufferedInputStream(new FileInputStream(file), 1024);
        while (true) {
            try {
                final MessageDigest instance = MessageDigest.getInstance("MD5");
                final byte[] array = new byte[1024];
                int i;
                do {
                    i = ((InputStream)file).read(array);
                    if (i > 0) {
                        instance.update(array, 0, i);
                    }
                } while (i != -1);
                final String string = new BigInteger(1, instance.digest()).toString(16);
                Intrinsics.checkNotNullExpressionValue(string, "BigInteger(1, md.digest()).toString(16)");
                e6.b.a((Closeable)file, null);
                return string;
                try {
                    throw;
                }
                finally {
                    final Throwable t;
                    e6.b.a((Closeable)file, t);
                }
            }
            finally {
                continue;
            }
            break;
        }
    }
}
