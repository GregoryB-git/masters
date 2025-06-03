// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.os.ParcelFileDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import F.g;
import java.nio.MappedByteBuffer;
import android.content.ContentResolver;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode$ThreadPolicy;
import android.util.Log;
import java.io.FileOutputStream;
import android.os.StrictMode;
import java.io.InputStream;
import java.io.File;
import java.nio.ByteBuffer;
import android.content.res.Resources;
import android.content.Context;
import java.io.IOException;
import java.io.Closeable;

public abstract class o
{
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static ByteBuffer b(Context e, final Resources resources, final int n) {
        e = (Context)e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!c((File)e, resources, n)) {
                return null;
            }
            return g((File)e);
        }
        finally {
            ((File)e).delete();
        }
    }
    
    public static boolean c(final File file, final Resources resources, final int n) {
        Closeable closeable;
        try {
            final InputStream openRawResource = resources.openRawResource(n);
            try {
                final boolean d = d(file, openRawResource);
                a(openRawResource);
                return d;
            }
            finally {}
        }
        finally {
            closeable = null;
        }
        a(closeable);
    }
    
    public static boolean d(File file, final InputStream ex) {
        final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        final Closeable closeable = null;
        Object o = null;
        Label_0135: {
            Closeable closeable2;
            try {
                try {
                    file = (File)new FileOutputStream(file, false);
                    IOException ex2 = null;
                    try {
                        o = new byte[1024];
                        while (true) {
                            final int read = ((InputStream)ex).read((byte[])o);
                            if (read == -1) {
                                break;
                            }
                            ((FileOutputStream)file).write((byte[])o, 0, read);
                        }
                    }
                    catch (IOException ex) {}
                    finally {
                        o = file;
                        ex2 = ex;
                        break Label_0135;
                    }
                    a((Closeable)ex2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                finally {}
            }
            catch (IOException ex) {
                closeable2 = closeable;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Error copying resource contents to temp file: ");
            sb.append(ex.getMessage());
            Log.e("TypefaceCompatUtil", sb.toString());
            a(closeable2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
        a((Closeable)o);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
    }
    
    public static File e(Context cacheDir) {
        cacheDir = (Context)cacheDir.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        final String string = sb.toString();
        int i = 0;
    Label_0120_Outer:
        while (true) {
            Label_0127: {
                if (i >= 100) {
                    break Label_0127;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(i);
                final File file = new File((File)cacheDir, sb2.toString());
                while (true) {
                    try {
                        if (file.createNewFile()) {
                            return file;
                        }
                        ++i;
                        continue Label_0120_Outer;
                        return null;
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static ByteBuffer f(Context a, CancellationSignal cancellationSignal, final Uri uri) {
        final ContentResolver contentResolver = a.getContentResolver();
        try {
            a = (Context)o.a.a(contentResolver, uri, "r", cancellationSignal);
            if (a == null) {
                if (a != null) {
                    ((ParcelFileDescriptor)a).close();
                }
                return null;
            }
            try {
                final Object o;
                cancellationSignal = (CancellationSignal)(o = new FileInputStream(((ParcelFileDescriptor)a).getFileDescriptor()));
                final FileChannel fileChannel = ((FileInputStream)o).getChannel();
                final FileChannel fileChannel3;
                final FileChannel fileChannel2 = fileChannel3 = fileChannel;
                final long n = fileChannel3.size();
                final FileChannel fileChannel4 = fileChannel2;
                final FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
                final long n2 = 0L;
                final long n3 = n;
                final MappedByteBuffer mappedByteBuffer = fileChannel4.map(mapMode, n2, n3);
                final CancellationSignal cancellationSignal2 = cancellationSignal;
                ((FileInputStream)cancellationSignal2).close();
                final Context context = a;
                ((ParcelFileDescriptor)context).close();
                return mappedByteBuffer;
            }
            finally {
                final CancellationSignal cancellationSignal3;
                cancellationSignal = cancellationSignal3;
                try {
                    ((ParcelFileDescriptor)a).close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)cancellationSignal).addSuppressed(exception);
                }
                while (true) {
                    try {
                        ((FileInputStream)cancellationSignal).close();
                    }
                    finally {
                        final Throwable exception2;
                        ((Throwable)uri).addSuppressed(exception2);
                    }
                    continue;
                }
            }
            try {
                final Object o = cancellationSignal;
                final FileChannel fileChannel = ((FileInputStream)o).getChannel();
                final FileChannel fileChannel3;
                final FileChannel fileChannel2 = fileChannel3 = fileChannel;
                final long n = fileChannel3.size();
                final FileChannel fileChannel4 = fileChannel2;
                final FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
                final long n2 = 0L;
                final long n3 = n;
                final MappedByteBuffer mappedByteBuffer = fileChannel4.map(mapMode, n2, n3);
                final CancellationSignal cancellationSignal2 = cancellationSignal;
                ((FileInputStream)cancellationSignal2).close();
                final Context context = a;
                ((ParcelFileDescriptor)context).close();
                return mappedByteBuffer;
            }
            finally {}
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static ByteBuffer g(File file) {
        try {
            file = (File)new FileInputStream(file);
            try {
                final FileChannel channel = ((FileInputStream)file).getChannel();
                final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                ((FileInputStream)file).close();
                return map;
            }
            finally {
                try {
                    ((FileInputStream)file).close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
            return null;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static Map h(final Context context, final g.b[] array, final CancellationSignal cancellationSignal) {
        final HashMap<Uri, ByteBuffer> m = new HashMap<Uri, ByteBuffer>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final g.b b = array[i];
            if (b.b() == 0) {
                final Uri d = b.d();
                if (!m.containsKey(d)) {
                    m.put(d, f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public abstract static class a
    {
        public static ParcelFileDescriptor a(final ContentResolver contentResolver, final Uri uri, final String s, final CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, s, cancellationSignal);
        }
    }
}
