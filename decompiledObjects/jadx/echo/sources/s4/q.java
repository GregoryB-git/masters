package s4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import w4.InterfaceC2104a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final long f19310b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19311c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static q f19312d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2104a f19313a;

    public q(InterfaceC2104a interfaceC2104a) {
        this.f19313a = interfaceC2104a;
    }

    public static q c() {
        return d(w4.b.b());
    }

    public static q d(InterfaceC2104a interfaceC2104a) {
        if (f19312d == null) {
            f19312d = new q(interfaceC2104a);
        }
        return f19312d;
    }

    public static boolean g(String str) {
        return f19311c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f19313a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(u4.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f19310b;
    }
}
