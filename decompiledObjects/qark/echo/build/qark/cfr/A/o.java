/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.CancellationSignal
 *  android.os.ParcelFileDescriptor
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.MappedByteBuffer
 *  java.nio.channels.FileChannel
 *  java.nio.channels.FileChannel$MapMode
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package A;

import F.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class o {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static ByteBuffer b(Context context, Resources resources, int n8) {
        block5 : {
            if ((context = o.e(context)) == null) {
                return null;
            }
            boolean bl = o.c((File)context, resources, n8);
            if (bl) break block5;
            context.delete();
            return null;
        }
        try {
            resources = o.g((File)context);
            return resources;
        }
        finally {
            context.delete();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean c(File file, Resources resources, int n8) {
        void var0_3;
        block4 : {
            boolean bl;
            resources = resources.openRawResource(n8);
            try {
                bl = o.d(file, (InputStream)resources);
            }
            catch (Throwable throwable) {
                break block4;
            }
            o.a((Closeable)resources);
            return bl;
            catch (Throwable throwable) {
                resources = null;
            }
        }
        o.a((Closeable)resources);
        throw var0_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean d(File throwable, InputStream inputStream) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block8 : {
            StringBuilder stringBuilder;
            block9 : {
                threadPolicy = StrictMode.allowThreadDiskWrites();
                stringBuilder = null;
                throwable2 = null;
                throwable = new FileOutputStream((File)throwable, false);
                try {
                    int n8;
                    throwable2 = new byte[1024];
                    while ((n8 = inputStream.read((byte[])throwable2)) != -1) {
                        throwable.write((byte[])throwable2, 0, n8);
                    }
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable;
                    throwable = throwable3;
                    break block8;
                }
                catch (IOException iOException) {
                    break block9;
                }
                o.a((Closeable)throwable);
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return true;
                catch (Throwable throwable4) {
                    break block8;
                }
                catch (IOException iOException) {
                    throwable = stringBuilder;
                }
            }
            throwable2 = throwable;
            {
                void var1_6;
                stringBuilder = new StringBuilder();
                throwable2 = throwable;
                stringBuilder.append("Error copying resource contents to temp file: ");
                throwable2 = throwable;
                stringBuilder.append(var1_6.getMessage());
                throwable2 = throwable;
                Log.e((String)"TypefaceCompatUtil", (String)stringBuilder.toString());
            }
            o.a((Closeable)throwable);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return false;
        }
        o.a((Closeable)throwable2);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File e(Context context) {
        if ((context = context.getCacheDir()) == null) {
            return null;
        }
        Object object = new StringBuilder();
        object.append(".font");
        object.append(Process.myPid());
        object.append("-");
        object.append(Process.myTid());
        object.append("-");
        object = object.toString();
        int n8 = 0;
        while (n8 < 100) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(n8);
            stringBuilder = new File((File)context, stringBuilder.toString());
            try {
                boolean bl = stringBuilder.createNewFile();
                if (bl) {
                    return stringBuilder;
                }
            }
            catch (IOException iOException) {}
            ++n8;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static ByteBuffer f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        Throwable throwable422;
        block14 : {
            context = context.getContentResolver();
            context = a.a((ContentResolver)context, uri, "r", cancellationSignal);
            if (context != null) break block14;
            if (context == null) return null;
            context.close();
            return null;
            {
                catch (IOException iOException) {
                    return null;
                }
            }
        }
        cancellationSignal = new FileInputStream(context.getFileDescriptor());
        uri = cancellationSignal.getChannel();
        long l8 = uri.size();
        uri = uri.map(FileChannel.MapMode.READ_ONLY, 0L, l8);
        cancellationSignal.close();
        context.close();
        return uri;
        catch (Throwable throwable2) {
            try {
                cancellationSignal.close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422) {}
            }
        }
        try {
            context.close();
            throw throwable422;
        }
        catch (Throwable throwable5) {
            throwable422.addSuppressed(throwable5);
            throw throwable422;
        }
    }

    /*
     * Exception decompiling
     */
    public static ByteBuffer g(File var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static Map h(Context context, g.b[] arrb, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (g.b b8 : arrb) {
            if (b8.b() != 0 || hashMap.containsKey((Object)(b8 = b8.d()))) continue;
            hashMap.put((Object)b8, (Object)o.f(context, cancellationSignal, (Uri)b8));
        }
        return Collections.unmodifiableMap((Map)hashMap);
    }

    public static abstract class a {
        public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String string2, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, string2, cancellationSignal);
        }
    }

}

