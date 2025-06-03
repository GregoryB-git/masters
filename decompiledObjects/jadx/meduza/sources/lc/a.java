package lc;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f9829a;

    static {
        Charset forName = Charset.forName("UTF-8");
        ec.i.d(forName, "forName(...)");
        f9829a = forName;
        ec.i.d(Charset.forName("UTF-16"), "forName(...)");
        ec.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        ec.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        ec.i.d(Charset.forName("US-ASCII"), "forName(...)");
        ec.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
