package t5;

import java.io.IOException;

/* loaded from: classes.dex */
public class l extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14531b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f14532a;

    public l(int i10) {
        this.f14532a = i10;
    }

    public l(int i10, String str, Throwable th) {
        super(str, th);
        this.f14532a = i10;
    }

    public l(int i10, Throwable th) {
        super(th);
        this.f14532a = i10;
    }

    public l(String str, int i10) {
        super(str);
        this.f14532a = i10;
    }
}
