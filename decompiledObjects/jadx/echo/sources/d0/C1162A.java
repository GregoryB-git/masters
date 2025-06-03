package d0;

import java.io.IOException;

/* renamed from: d0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1162A extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12342o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12343p;

    public C1162A(String str, Throwable th, boolean z7, int i7) {
        super(str, th);
        this.f12342o = z7;
        this.f12343p = i7;
    }

    public static C1162A a(String str, Throwable th) {
        return new C1162A(str, th, true, 1);
    }

    public static C1162A b(String str, Throwable th) {
        return new C1162A(str, th, true, 0);
    }

    public static C1162A c(String str, Throwable th) {
        return new C1162A(str, th, true, 4);
    }

    public static C1162A d(String str) {
        return new C1162A(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f12342o + ", dataType=" + this.f12343p + "}";
    }
}
