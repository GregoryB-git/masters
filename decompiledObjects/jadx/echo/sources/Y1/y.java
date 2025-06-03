package Y1;

import Y1.u;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import y1.C2237F;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7527d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f7528e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final String f7529a;

    /* renamed from: b, reason: collision with root package name */
    public final C2237F f7530b;

    /* renamed from: c, reason: collision with root package name */
    public String f7531c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public y(Context context, String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f7529a = applicationId;
        this.f7530b = new C2237F(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f7531c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String a() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.f7529a;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle b7 = f7527d.b(str);
            if (str3 != null) {
                b7.putString("2_result", str3);
            }
            if (str4 != null) {
                b7.putString("5_error_message", str4);
            }
            if (str5 != null) {
                b7.putString("4_error_code", str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b7.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b7.putString("3_method", str2);
            this.f7530b.g(str6, b7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle b7 = f7527d.b(str);
            b7.putString("3_method", str2);
            this.f7530b.g(str3, b7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void d(String str, String str2, String str3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle b7 = f7527d.b(str);
            b7.putString("3_method", str2);
            this.f7530b.g(str3, b7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle b7 = f7527d.b("");
            b7.putString("2_result", u.f.a.ERROR.e());
            b7.putString("5_error_message", str2);
            b7.putString("3_method", str3);
            this.f7530b.g(str, b7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
