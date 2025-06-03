// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import J3.B;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;

public class g implements F
{
    public final byte[] a;
    public final String b;
    public final String c;
    
    public g(final String b, final String c, final byte[] a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final byte[] a() {
        if (this.b()) {
            return null;
        }
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutputStream;
            try {
                final OutputStream outputStream;
                gzipOutputStream = (GZIPOutputStream)(outputStream = new GZIPOutputStream(out));
                final g g = this;
                final byte[] array = g.a;
                outputStream.write(array);
                final GZIPOutputStream gzipOutputStream2 = gzipOutputStream;
                gzipOutputStream2.finish();
                final ByteArrayOutputStream byteArrayOutputStream = out;
                final byte[] array2 = byteArrayOutputStream.toByteArray();
                final GZIPOutputStream gzipOutputStream3 = gzipOutputStream;
                gzipOutputStream3.close();
                final ByteArrayOutputStream byteArrayOutputStream2 = out;
                byteArrayOutputStream2.close();
                return array2;
            }
            finally {
                final GZIPOutputStream gzipOutputStream4;
                gzipOutputStream = gzipOutputStream4;
                try {
                    out.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)gzipOutputStream).addSuppressed(exception);
                }
                try {
                    gzipOutputStream.close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception2;
                    t.addSuppressed(exception2);
                }
            }
            try {
                final OutputStream outputStream = gzipOutputStream;
                final g g = this;
                final byte[] array = g.a;
                outputStream.write(array);
                final GZIPOutputStream gzipOutputStream2 = gzipOutputStream;
                gzipOutputStream2.finish();
                final ByteArrayOutputStream byteArrayOutputStream = out;
                final byte[] array2 = byteArrayOutputStream.toByteArray();
                final GZIPOutputStream gzipOutputStream3 = gzipOutputStream;
                gzipOutputStream3.close();
                final ByteArrayOutputStream byteArrayOutputStream2 = out;
                byteArrayOutputStream2.close();
                return array2;
            }
            finally {}
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public final boolean b() {
        final byte[] a = this.a;
        return a == null || a.length == 0;
    }
    
    @Override
    public InputStream i() {
        if (this.b()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
    
    @Override
    public String j() {
        return this.c;
    }
    
    @Override
    public B.d.b k() {
        final byte[] a = this.a();
        if (a == null) {
            return null;
        }
        return B.d.b.a().b(a).c(this.b).a();
    }
}
