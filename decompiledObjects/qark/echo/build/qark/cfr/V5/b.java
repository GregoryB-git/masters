/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package V5;

import b6.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.Intrinsics;

public class b {
    public static void a(Throwable throwable, Throwable throwable2) {
        Intrinsics.checkNotNullParameter((Object)throwable, "<this>");
        Intrinsics.checkNotNullParameter((Object)throwable2, "exception");
        if (throwable != throwable2) {
            b6.b.a.a(throwable, throwable2);
        }
    }

    public static String b(Throwable object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer)stringWriter);
        object.printStackTrace(printWriter);
        printWriter.flush();
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

