/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package a;

public abstract class b {
    public static final String a = "_COROUTINE";

    public static final /* synthetic */ StackTraceElement a(Throwable throwable, String string2) {
        return b.b(throwable, string2);
    }

    public static final StackTraceElement b(Throwable throwable, String string2) {
        throwable = throwable.getStackTrace()[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append('.');
        stringBuilder.append(string2);
        return new StackTraceElement(stringBuilder.toString(), "_", throwable.getFileName(), throwable.getLineNumber());
    }
}

