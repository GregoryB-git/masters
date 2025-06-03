// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import n6.c;
import java.util.Iterator;
import java.io.Closeable;
import V5.t;
import java.io.BufferedReader;
import g6.l;
import kotlin.jvm.internal.Intrinsics;
import java.io.Writer;
import java.io.Reader;

public abstract class m
{
    public static final long a(final Reader reader, final Writer writer, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(writer, "out");
        final char[] array = new char[i];
        i = reader.read(array);
        long n = 0L;
        while (i >= 0) {
            writer.write(array, 0, i);
            n += i;
            i = reader.read(array);
        }
        return n;
    }
    
    public static /* synthetic */ long b(final Reader reader, final Writer writer, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 8192;
        }
        return a(reader, writer, n);
    }
    
    public static final void c(Reader in, final l l) {
        Intrinsics.checkNotNullParameter(in, "<this>");
        Intrinsics.checkNotNullParameter(l, "action");
        if (in instanceof BufferedReader) {
            in = in;
        }
        else {
            in = new BufferedReader(in, 8192);
        }
        while (true) {
            try {
                final Iterator iterator = d((BufferedReader)in).iterator();
                while (iterator.hasNext()) {
                    l.invoke(iterator.next());
                }
                final t a = t.a;
                b.a(in, null);
                return;
                try {
                    throw;
                }
                finally {
                    final Throwable t;
                    b.a(in, t);
                }
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final n6.b d(final BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return c.b(new e6.l(bufferedReader));
    }
    
    public static final List e(final Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        final ArrayList list = new ArrayList();
        c(reader, new l() {
            public final void a(final String e) {
                Intrinsics.checkNotNullParameter(e, "it");
                list.add(e);
            }
        });
        return list;
    }
    
    public static final String f(final Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        final StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        final String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
