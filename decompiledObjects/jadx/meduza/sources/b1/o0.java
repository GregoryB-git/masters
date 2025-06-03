package b1;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1766a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1767b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1768c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }
}
