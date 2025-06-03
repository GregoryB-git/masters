package i0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class r extends h {

    /* renamed from: p, reason: collision with root package name */
    public final k f14717p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14718q;

    public r(k kVar, int i7, int i8) {
        super(b(i7, i8));
        this.f14717p = kVar;
        this.f14718q = i8;
    }

    public static int b(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static r c(IOException iOException, k kVar, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !W2.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new q(iOException, kVar) : new r(iOException, kVar, i8, i7);
    }

    public r(IOException iOException, k kVar, int i7, int i8) {
        super(iOException, b(i7, i8));
        this.f14717p = kVar;
        this.f14718q = i8;
    }

    public r(String str, k kVar, int i7, int i8) {
        super(str, b(i7, i8));
        this.f14717p = kVar;
        this.f14718q = i8;
    }

    public r(String str, IOException iOException, k kVar, int i7, int i8) {
        super(str, iOException, b(i7, i8));
        this.f14717p = kVar;
        this.f14718q = i8;
    }
}
