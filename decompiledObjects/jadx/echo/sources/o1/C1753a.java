package o1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1753a f18173a = new C1753a();

    /* renamed from: o1.a$a, reason: collision with other inner class name */
    public static final class C0242a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0242a f18174a = new C0242a();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0242a.f18174a.a();
        }
        return 0;
    }
}
