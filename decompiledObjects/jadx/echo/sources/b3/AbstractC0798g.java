package b3;

import java.util.concurrent.Future;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0798g {
    public static Object a(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
