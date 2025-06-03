package a4;

import android.media.MediaDrm;
import v5.e0;

/* loaded from: classes.dex */
public final class k {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return e0.r(e0.s(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
