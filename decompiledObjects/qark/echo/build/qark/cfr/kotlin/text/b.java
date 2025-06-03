/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static final b a = new b();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;

    static {
        Charset charset = Charset.forName((String)"UTF-8");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        b = charset;
        charset = Charset.forName((String)"UTF-16");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        c = charset;
        charset = Charset.forName((String)"UTF-16BE");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        d = charset;
        charset = Charset.forName((String)"UTF-16LE");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        e = charset;
        charset = Charset.forName((String)"US-ASCII");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        f = charset;
        charset = Charset.forName((String)"ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(...)");
        g = charset;
    }
}

