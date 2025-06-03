package t1;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(String str, int i7) {
        Trace.beginAsyncSection(str, i7);
    }

    public static void b(String str, int i7) {
        Trace.endAsyncSection(str, i7);
    }
}
