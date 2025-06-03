package e6;

import V5.t;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m {

    public static final class a extends kotlin.jvm.internal.l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f14060o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f14060o = arrayList;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f14060o.add(it);
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return t.f6803a;
        }
    }

    public static final long a(Reader reader, Writer out, int i7) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i7];
        int read = reader.read(cArr);
        long j7 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j7 += read;
            read = reader.read(cArr);
        }
        return j7;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return a(reader, writer, i7);
    }

    public static final void c(Reader reader, g6.l action) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            t tVar = t.f6803a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final n6.b d(BufferedReader bufferedReader) {
        n6.b b7;
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        b7 = n6.f.b(new l(bufferedReader));
        return b7;
    }

    public static final List e(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        c(reader, new a(arrayList));
        return arrayList;
    }

    public static final String f(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
