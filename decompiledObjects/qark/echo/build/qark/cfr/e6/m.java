/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.Closeable
 *  java.io.Reader
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package e6;

import V5.t;
import e6.b;
import e6.l;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n6.c;

public abstract class m {
    public static final long a(Reader reader, Writer writer, int n8) {
        Intrinsics.checkNotNullParameter((Object)reader, "<this>");
        Intrinsics.checkNotNullParameter((Object)writer, "out");
        char[] arrc = new char[n8];
        n8 = reader.read(arrc);
        long l8 = 0L;
        while (n8 >= 0) {
            writer.write(arrc, 0, n8);
            l8 += (long)n8;
            n8 = reader.read(arrc);
        }
        return l8;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int n8, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = 8192;
        }
        return m.a(reader, writer, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void c(Reader reader, g6.l object) {
        Intrinsics.checkNotNullParameter((Object)reader, "<this>");
        Intrinsics.checkNotNullParameter(object, "action");
        reader = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, 8192);
        try {
            Iterator iterator = m.d((BufferedReader)reader).iterator();
            while (iterator.hasNext()) {
                object.invoke(iterator.next());
            }
            object = t.a;
        }
        catch (Throwable throwable) {}
        b.a((Closeable)reader, null);
        return;
        try {
            throw throwable;
        }
        catch (Throwable throwable) {
            b.a((Closeable)reader, throwable);
            throw throwable;
        }
    }

    public static final n6.b d(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter((Object)bufferedReader, "<this>");
        return c.b(new l(bufferedReader));
    }

    public static final List e(Reader reader) {
        Intrinsics.checkNotNullParameter((Object)reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        m.c(reader, new g6.l(){

            public final void a(String string2) {
                Intrinsics.checkNotNullParameter(string2, "it");
                arrayList.add((Object)string2);
            }
        });
        return arrayList;
    }

    public static final String f(Reader object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        StringWriter stringWriter = new StringWriter();
        m.b((Reader)object, (Writer)stringWriter, 0, 2, null);
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

}

