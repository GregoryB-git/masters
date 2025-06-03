package p0;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import p0.C1776h;

/* renamed from: p0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1768B {

    /* renamed from: p0.B$a */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return g0.M.W(g0.M.X(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: p0.B$b */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Throwable th, int i7) {
        int i8 = g0.M.f14261a;
        if (i8 >= 21 && a.a(th)) {
            return a.b(th);
        }
        if (i8 >= 23 && b.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || b(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof T) {
            return 6001;
        }
        if (th instanceof C1776h.e) {
            return 6003;
        }
        if (th instanceof P) {
            return 6008;
        }
        if (i7 == 1) {
            return 6006;
        }
        if (i7 == 2) {
            return 6004;
        }
        if (i7 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Throwable th) {
        return g0.M.f14261a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return g0.M.f14261a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
