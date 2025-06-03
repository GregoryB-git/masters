/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.CharBuffer
 *  java.nio.charset.Charset
 *  java.nio.charset.CharsetEncoder
 *  java.nio.charset.CoderResult
 *  java.nio.charset.CodingErrorAction
 */
package e6;

import V5.t;
import e6.b;
import e6.h;
import e6.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

public class i
extends h {
    public static final ByteBuffer a(int n8, CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter((Object)charsetEncoder, "encoder");
        charsetEncoder = ByteBuffer.allocate((int)(n8 * (int)Math.ceil((double)charsetEncoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue((Object)charsetEncoder, "allocate(...)");
        return charsetEncoder;
    }

    public static final CharsetEncoder b(Charset charset) {
        Intrinsics.checkNotNullParameter((Object)charset, "<this>");
        charset = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charset.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String c(File file, Charset object) {
        Intrinsics.checkNotNullParameter((Object)file, "<this>");
        Intrinsics.checkNotNullParameter(object, "charset");
        file = new InputStreamReader((InputStream)new FileInputStream(file), (Charset)object);
        try {
            object = m.f((Reader)file);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                b.a((Closeable)file, throwable);
                throw throwable2;
            }
        }
        b.a((Closeable)file, null);
        return object;
    }

    public static /* synthetic */ String d(File file, Charset charset, int n8, Object object) {
        if ((n8 & 1) != 0) {
            charset = kotlin.text.b.b;
        }
        return i.c(file, charset);
    }

    public static final void e(File file, String object, Charset charset) {
        Intrinsics.checkNotNullParameter((Object)file, "<this>");
        Intrinsics.checkNotNullParameter(object, "text");
        Intrinsics.checkNotNullParameter((Object)charset, "charset");
        file = new FileOutputStream(file);
        try {
            i.g((OutputStream)file, (String)object, charset);
            object = t.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                b.a((Closeable)file, throwable);
                throw throwable2;
            }
        }
        b.a((Closeable)file, null);
    }

    public static /* synthetic */ void f(File file, String string2, Charset charset, int n8, Object object) {
        if ((n8 & 2) != 0) {
            charset = kotlin.text.b.b;
        }
        i.e(file, string2, charset);
    }

    public static final void g(OutputStream outputStream, String arrby, Charset charset) {
        int n8;
        Intrinsics.checkNotNullParameter((Object)outputStream, "<this>");
        Intrinsics.checkNotNullParameter(arrby, "text");
        Intrinsics.checkNotNullParameter((Object)charset, "charset");
        if (arrby.length() < 16384) {
            arrby = arrby.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(arrby, "getBytes(...)");
            outputStream.write(arrby);
            return;
        }
        charset = i.b(charset);
        CharBuffer charBuffer = CharBuffer.allocate((int)8192);
        Intrinsics.b((Object)charset);
        ByteBuffer byteBuffer = i.a(8192, (CharsetEncoder)charset);
        int n9 = n8 = 0;
        while (n8 < arrby.length()) {
            int n10 = Math.min((int)(8192 - n9), (int)(arrby.length() - n8));
            int n11 = n8 + n10;
            char[] arrc = charBuffer.array();
            Intrinsics.checkNotNullExpressionValue(arrc, "array(...)");
            arrby.getChars(n8, n11, arrc, n9);
            charBuffer.limit(n10 + n9);
            n8 = arrby.length();
            n9 = 1;
            boolean bl = n11 == n8;
            if (charset.encode(charBuffer, byteBuffer, bl).isUnderflow()) {
                outputStream.write(byteBuffer.array(), 0, byteBuffer.position());
                if (charBuffer.position() != charBuffer.limit()) {
                    charBuffer.put(0, charBuffer.get());
                } else {
                    n9 = 0;
                }
                charBuffer.clear();
                byteBuffer.clear();
                n8 = n11;
                continue;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}

