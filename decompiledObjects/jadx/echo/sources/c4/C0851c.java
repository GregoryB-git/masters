package c4;

import c4.InterfaceC0852d;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0851c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0852d f10137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10138b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10139c;

    public C0851c(InterfaceC0852d interfaceC0852d, String str) {
        this(interfaceC0852d, str, null);
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void a(String str, Throwable th, Object... objArr) {
        if (f()) {
            String h7 = h(str, objArr);
            if (th != null) {
                h7 = h7 + "\n" + d(th);
            }
            this.f10137a.a(InterfaceC0852d.a.DEBUG, this.f10138b, h7, g());
        }
    }

    public void b(String str, Object... objArr) {
        a(str, null, objArr);
    }

    public void c(String str, Throwable th) {
        this.f10137a.a(InterfaceC0852d.a.ERROR, this.f10138b, h(str, new Object[0]) + "\n" + d(th), g());
    }

    public void e(String str) {
        this.f10137a.a(InterfaceC0852d.a.INFO, this.f10138b, h(str, new Object[0]), g());
    }

    public boolean f() {
        return this.f10137a.b().ordinal() <= InterfaceC0852d.a.DEBUG.ordinal();
    }

    public final long g() {
        return System.currentTimeMillis();
    }

    public final String h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f10139c == null) {
            return str;
        }
        return this.f10139c + " - " + str;
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        String h7 = h(str, new Object[0]);
        if (th != null) {
            h7 = h7 + "\n" + d(th);
        }
        this.f10137a.a(InterfaceC0852d.a.WARN, this.f10138b, h7, g());
    }

    public C0851c(InterfaceC0852d interfaceC0852d, String str, String str2) {
        this.f10137a = interfaceC0852d;
        this.f10138b = str;
        this.f10139c = str2;
    }
}
