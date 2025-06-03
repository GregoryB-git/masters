package E;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1509a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1510b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1511c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1512d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f1513a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f1514b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f1515c;

        /* renamed from: d, reason: collision with root package name */
        public static final int f1516d;

        static {
            int extensionVersion;
            int extensionVersion2;
            int extensionVersion3;
            int extensionVersion4;
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            f1513a = extensionVersion;
            extensionVersion2 = SdkExtensions.getExtensionVersion(31);
            f1514b = extensionVersion2;
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            f1515c = extensionVersion3;
            extensionVersion4 = SdkExtensions.getExtensionVersion(1000000);
            f1516d = extensionVersion4;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1509a = i7 >= 30 ? a.f1513a : 0;
        f1510b = i7 >= 30 ? a.f1514b : 0;
        f1511c = i7 >= 30 ? a.f1515c : 0;
        f1512d = i7 >= 30 ? a.f1516d : 0;
    }

    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 33 || (i7 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
