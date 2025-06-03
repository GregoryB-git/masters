// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import android.media.MediaDrmResetException;
import android.media.MediaDrm$MediaDrmStateException;
import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import g0.M;

public abstract class B
{
    public static int a(final Throwable t, final int n) {
        final int a = M.a;
        if (a >= 21 && B.a.a(t)) {
            return B.a.b(t);
        }
        if (a >= 23 && b.a(t)) {
            return 6006;
        }
        if (t instanceof NotProvisionedException) {
            return 6002;
        }
        if (b(t)) {
            return 6002;
        }
        if (t instanceof DeniedByServerException) {
            return 6007;
        }
        if (t instanceof T) {
            return 6001;
        }
        if (t instanceof h.e) {
            return 6003;
        }
        if (t instanceof P) {
            return 6008;
        }
        if (n == 1) {
            return 6006;
        }
        if (n == 2) {
            return 6004;
        }
        if (n == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
    
    public static boolean b(final Throwable t) {
        return M.a == 34 && t instanceof NoSuchMethodError && t.getMessage() != null && t.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }
    
    public static boolean c(final Throwable t) {
        return M.a == 34 && t instanceof NoSuchMethodError && t.getMessage() != null && t.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
    
    public abstract static final class a
    {
        public static boolean a(final Throwable t) {
            return t instanceof MediaDrm$MediaDrmStateException;
        }
        
        public static int b(final Throwable t) {
            return M.W(M.X(((MediaDrm$MediaDrmStateException)t).getDiagnosticInfo()));
        }
    }
    
    public abstract static final class b
    {
        public static boolean a(final Throwable t) {
            return t instanceof MediaDrmResetException;
        }
    }
}
