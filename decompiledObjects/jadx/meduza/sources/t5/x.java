package t5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class x extends l {

    /* renamed from: c, reason: collision with root package name */
    public final int f14615c;

    public x() {
        super(2008);
        this.f14615c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r3, r2)
            r1.f14615c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.x.<init>(java.io.IOException, int, int):void");
    }

    public x(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f14615c = 1;
    }

    public x(String str, IOException iOException, int i10) {
        super(i10 == 2000 ? 2001 : i10, str, iOException);
        this.f14615c = 1;
    }

    public static x a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !x6.b.x0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new w(iOException) : new x(iOException, i11, i10);
    }
}
