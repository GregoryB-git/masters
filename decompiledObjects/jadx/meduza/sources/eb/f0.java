package eb;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f5101d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f5102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5103b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5104c;

    public f0(long j10, String str, String str2) {
        x6.b.y(str, "typeName");
        x6.b.s("empty type", !str.isEmpty());
        this.f5102a = str;
        this.f5103b = str2;
        this.f5104c = j10;
    }

    public static f0 a(Class<?> cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new f0(f5101d.incrementAndGet(), simpleName, str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5102a + "<" + this.f5104c + ">");
        if (this.f5103b != null) {
            sb2.append(": (");
            sb2.append(this.f5103b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
