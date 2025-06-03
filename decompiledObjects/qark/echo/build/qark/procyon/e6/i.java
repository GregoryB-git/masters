// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import java.nio.CharBuffer;
import V5.t;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.Closeable;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetEncoder;

public class i extends h
{
    public static final ByteBuffer a(final int n, final CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "encoder");
        final ByteBuffer allocate = ByteBuffer.allocate(n * (int)(float)Math.ceil(charsetEncoder.maxBytesPerChar()));
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        return allocate;
    }
    
    public static final CharsetEncoder b(final Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        final CharsetEncoder encoder = charset.newEncoder();
        final CodingErrorAction replace = CodingErrorAction.REPLACE;
        return encoder.onMalformedInput(replace).onUnmappableCharacter(replace);
    }
    
    public static final String c(File file, final Charset cs) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(cs, "charset");
        file = (File)new InputStreamReader(new FileInputStream(file), cs);
        try {
            final String f = m.f((Reader)file);
            b.a((Closeable)file, null);
            return f;
        }
        finally {
            try {}
            finally {
                b.a((Closeable)file, (Throwable)cs);
            }
        }
    }
    
    public static final void e(File file, final String s, final Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        file = (File)new FileOutputStream(file);
        try {
            g((OutputStream)file, s, charset);
            final t a = t.a;
            b.a((Closeable)file, null);
        }
        finally {
            try {}
            finally {
                b.a((Closeable)file, (Throwable)s);
            }
        }
    }
    
    public static final void g(final OutputStream outputStream, final String s, final Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (s.length() < 16384) {
            final byte[] bytes = s.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        final CharsetEncoder b = b(charset);
        final CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.b(b);
        final ByteBuffer a = a(8192, b);
        int dstBegin;
        int srcEnd;
        for (int i = dstBegin = 0; i < s.length(); i = srcEnd) {
            final int min = Math.min(8192 - dstBegin, s.length() - i);
            srcEnd = i + min;
            final char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            s.getChars(i, srcEnd, array, dstBegin);
            allocate.limit(min + dstBegin);
            final int length = s.length();
            dstBegin = 1;
            if (!b.encode(allocate, a, srcEnd == length).isUnderflow()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            outputStream.write(a.array(), 0, a.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            }
            else {
                dstBegin = 0;
            }
            allocate.clear();
            a.clear();
        }
    }
}
