// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

public class b
{
    public static void a(final Throwable t, final Throwable t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "exception");
        if (t != t2) {
            b6.b.a.a(t, t2);
        }
    }
    
    public static String b(final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        final StringWriter out = new StringWriter();
        final PrintWriter s = new PrintWriter(out);
        t.printStackTrace(s);
        s.flush();
        final String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
