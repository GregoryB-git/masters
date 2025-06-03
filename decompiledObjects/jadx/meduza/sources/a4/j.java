package a4;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* loaded from: classes.dex */
public final class j {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
