/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.DeniedByServerException
 *  android.media.MediaDrm
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.MediaDrmResetException
 *  android.media.NotProvisionedException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package p0;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import g0.M;
import p0.P;
import p0.T;
import p0.h;

public abstract class B {
    public static int a(Throwable throwable, int n8) {
        int n9 = M.a;
        if (n9 >= 21 && a.a(throwable)) {
            return a.b(throwable);
        }
        if (n9 >= 23 && b.a(throwable)) {
            return 6006;
        }
        if (!(throwable instanceof NotProvisionedException)) {
            if (B.b(throwable)) {
                return 6002;
            }
            if (throwable instanceof DeniedByServerException) {
                return 6007;
            }
            if (throwable instanceof T) {
                return 6001;
            }
            if (throwable instanceof h.e) {
                return 6003;
            }
            if (throwable instanceof P) {
                return 6008;
            }
            if (n8 == 1) {
                return 6006;
            }
            if (n8 == 2) {
                return 6004;
            }
            if (n8 == 3) {
                return 6002;
            }
            throw new IllegalArgumentException();
        }
        return 6002;
    }

    public static boolean b(Throwable throwable) {
        if (M.a == 34 && throwable instanceof NoSuchMethodError && throwable.getMessage() != null && throwable.getMessage().contains((CharSequence)"Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean c(Throwable throwable) {
        if (M.a == 34 && throwable instanceof NoSuchMethodError && throwable.getMessage() != null && throwable.getMessage().contains((CharSequence)"Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static final abstract class a {
        public static boolean a(Throwable throwable) {
            return throwable instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable throwable) {
            return M.W(M.X(((MediaDrm.MediaDrmStateException)throwable).getDiagnosticInfo()));
        }
    }

    public static final abstract class b {
        public static boolean a(Throwable throwable) {
            return throwable instanceof MediaDrmResetException;
        }
    }

}

