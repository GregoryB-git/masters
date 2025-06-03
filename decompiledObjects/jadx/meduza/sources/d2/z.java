package d2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f3420c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f3421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3422b;

    public static class a extends z {
        public a() {
            super("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        }

        @Override // d2.z
        public final boolean b() {
            return false;
        }
    }

    public static class b extends z {
        public b() {
            super("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        }

        @Override // d2.z
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public z(String str, String str2) {
        this.f3421a = str;
        this.f3422b = str2;
        f3420c.add(this);
    }

    public final boolean a(Context context) {
        ServiceInfo serviceInfo;
        if (!b()) {
            PackageInfo b10 = c2.p.b(context);
            Bundle bundle = null;
            if (b10 != null) {
                ComponentName componentName = new ComponentName(b10.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                int i10 = Build.VERSION.SDK_INT;
                try {
                    if (i10 >= 33) {
                        serviceInfo = n.a(context.getPackageManager(), componentName, n.b(640L));
                    } else {
                        serviceInfo = context.getPackageManager().getServiceInfo(componentName, i10 >= 24 ? 640 : 128);
                    }
                    bundle = serviceInfo.metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (!(bundle == null ? false : bundle.containsKey(this.f3422b))) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean b();
}
