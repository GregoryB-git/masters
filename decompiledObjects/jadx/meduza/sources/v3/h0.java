package v3;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f15399a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f15400b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (h0.class) {
            if (f15399a.add(str)) {
                f15400b += ", " + str;
            }
        }
    }
}
