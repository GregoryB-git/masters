package i0;

import java.io.IOException;

/* loaded from: classes.dex */
public class h extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public final int f14645o;

    public h(int i7) {
        this.f14645o = i7;
    }

    public static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof h) && ((h) iOException2).f14645o == 2008) {
                return true;
            }
        }
        return false;
    }

    public h(String str, int i7) {
        super(str);
        this.f14645o = i7;
    }

    public h(String str, Throwable th, int i7) {
        super(str, th);
        this.f14645o = i7;
    }

    public h(Throwable th, int i7) {
        super(th);
        this.f14645o = i7;
    }
}
