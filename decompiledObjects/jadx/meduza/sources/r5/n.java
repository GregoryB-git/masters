package r5;

import android.os.SystemClock;
import t5.c0;

/* loaded from: classes.dex */
public final class n {
    public static c0.a a(h hVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = hVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (hVar.l(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new c0.a(1, 0, length, i10);
    }
}
