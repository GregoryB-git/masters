package e6;

import V5.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i extends h {
    public static final ByteBuffer a(int i7, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i7 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        return allocate;
    }

    public static final CharsetEncoder b(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String c(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String f7 = m.f(inputStreamReader);
            b.a(inputStreamReader, null);
            return f7;
        } finally {
        }
    }

    public static /* synthetic */ String d(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = kotlin.text.b.f16240b;
        }
        return c(file, charset);
    }

    public static final void e(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            g(fileOutputStream, text, charset);
            t tVar = t.f6803a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void f(File file, String str, Charset charset, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = kotlin.text.b.f16240b;
        }
        e(file, str, charset);
    }

    public static final void g(OutputStream outputStream, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder b7 = b(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.b(b7);
        ByteBuffer a7 = a(8192, b7);
        int i7 = 0;
        int i8 = 0;
        while (i7 < text.length()) {
            int min = Math.min(8192 - i8, text.length() - i7);
            int i9 = i7 + min;
            char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            text.getChars(i7, i9, array, i8);
            allocate.limit(min + i8);
            i8 = 1;
            if (!b7.encode(allocate, a7, i9 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            outputStream.write(a7.array(), 0, a7.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i8 = 0;
            }
            allocate.clear();
            a7.clear();
            i7 = i9;
        }
    }
}
