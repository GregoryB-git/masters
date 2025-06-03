/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.util.Base64
 *  android.util.Log
 *  java.io.BufferedInputStream
 *  java.io.ByteArrayInputStream
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateFactory
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.ReentrantLock
 */
package G1;

import W5.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import e6.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

public final class l {
    public static final l a = new l();
    public static final String b = l.class.getSimpleName();
    public static final String[] c = new String[]{"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"};

    public static final /* synthetic */ String a() {
        return b;
    }

    public static final String b(String string2) {
        return a.d(new File(string2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String c(Context object, Long l8) {
        Intrinsics.checkNotNullParameter(object, "context");
        CertificateFactory certificateFactory = CertificateFactory.getInstance((String)"X.509");
        List list = c;
        Object object2 = new ArrayList(list.length);
        int n8 = list.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object2.add((Object)certificateFactory.generateCertificate((InputStream)new ByteArrayInputStream(Base64.decode((String)list[i8], (int)0))));
        }
        list = m.I((Collection)object2);
        object2 = new u();
        certificateFactory = new ReentrantLock();
        Condition condition = certificateFactory.newCondition();
        certificateFactory.lock();
        try {
            final Object object3 = Class.forName((String)"android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            Intrinsics.checkNotNullExpressionValue(object3, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            object3 = object3.get((Object)null);
            Class class_ = Class.forName((String)"android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object object4 = l.class.getClassLoader();
            InvocationHandler invocationHandler = new InvocationHandler((u)object2, (ReentrantLock)certificateFactory, condition){
                public final /* synthetic */ u b;
                public final /* synthetic */ ReentrantLock c;
                public final /* synthetic */ Condition d;
                {
                    this.b = u8;
                    this.c = reentrantLock;
                    this.d = condition;
                }

                /*
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                public Object invoke(Object var1_1, Method var2_4, Object[] var3_5) {
                    Intrinsics.checkNotNullParameter((Object)var2_4, "method");
                    Intrinsics.checkNotNullParameter((Object)var3_5, "objects");
                    if (Intrinsics.a(var2_4.getName(), "onChecksumsReady") == false) return null;
                    if (var3_5.length != 1) return null;
                    var1_1 = var3_5[0];
                    try {
                        if (var1_1 instanceof List == false) return null;
                        var2_4 = ((List)var1_1).iterator();
                        do lbl-1000: // 3 sources:
                        {
                            if (var2_4.hasNext() == false) return null;
                            var1_1 = var2_4.next();
                            if (var1_1 == null) ** GOTO lbl-1000
                            var3_5 = var1_1.getClass().getMethod("getSplitName", new Class[0]);
                            Intrinsics.checkNotNullExpressionValue((Object)var3_5, "c.javaClass.getMethod(\"getSplitName\")");
                            var4_6 = var1_1.getClass().getMethod("getType", new Class[0]);
                            Intrinsics.checkNotNullExpressionValue((Object)var4_6, "c.javaClass.getMethod(\"getType\")");
                        } while (var3_5.invoke(var1_1, new Object[0]) != null || !Intrinsics.a(var4_6.invoke(var1_1, new Object[0]), object3));
                        var2_4 = var1_1.getClass().getMethod("getValue", new Class[0]);
                        Intrinsics.checkNotNullExpressionValue((Object)var2_4, "c.javaClass.getMethod(\"getValue\")");
                        var1_1 = var2_4.invoke(var1_1, new Object[0]);
                        if (var1_1 == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        var1_1 = (byte[])var1_1;
                        this.b.o = new BigInteger(1, (byte[])var1_1).toString(16);
                        this.c.lock();
                    }
                    catch (Throwable var1_3) {}
                    this.d.signalAll();
                    {
                        catch (Throwable var1_2) {
                            this.c.unlock();
                            throw var1_2;
                        }
                    }
                    this.c.unlock();
                    return null;
                    Log.d((String)l.a(), (String)"Can't fetch checksum.", (Throwable)var1_3);
                    return null;
                }
            };
            object4 = Proxy.newProxyInstance((ClassLoader)object4, (Class[])new Class[]{class_}, (InvocationHandler)invocationHandler);
            Intrinsics.checkNotNullExpressionValue(object4, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
            class_ = PackageManager.class.getMethod("requestChecksums", new Class[]{String.class, Boolean.TYPE, Integer.TYPE, List.class, class_});
            Intrinsics.checkNotNullExpressionValue((Object)class_, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
            class_.invoke((Object)object.getPackageManager(), new Object[]{object.getPackageName(), Boolean.FALSE, object3, m.I((Collection)list), object4});
            if (l8 == null) {
                condition.await();
            } else {
                condition.awaitNanos(l8.longValue());
            }
            object = (String)object2.o;
        }
        catch (Throwable throwable) {}
        certificateFactory.unlock();
        return object;
        certificateFactory.unlock();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d(File file) {
        Object object;
        file = new BufferedInputStream((InputStream)new FileInputStream(file), 1024);
        try {
            int n8;
            object = MessageDigest.getInstance((String)"MD5");
            byte[] arrby = new byte[1024];
            do {
                if ((n8 = file.read(arrby)) <= 0) continue;
                object.update(arrby, 0, n8);
            } while (n8 != -1);
            object = new BigInteger(1, object.digest()).toString(16);
            Intrinsics.checkNotNullExpressionValue(object, "BigInteger(1, md.digest()).toString(16)");
        }
        catch (Throwable throwable) {}
        b.a((Closeable)file, null);
        return object;
        try {
            throw throwable;
        }
        catch (Throwable throwable) {
            b.a((Closeable)file, throwable);
            throw throwable;
        }
    }

}

