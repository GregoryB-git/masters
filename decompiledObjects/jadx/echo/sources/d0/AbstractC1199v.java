package d0;

import java.util.HashSet;

/* renamed from: d0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1199v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f12911a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f12912b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (AbstractC1199v.class) {
            if (f12911a.add(str)) {
                f12912b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (AbstractC1199v.class) {
            str = f12912b;
        }
        return str;
    }
}
