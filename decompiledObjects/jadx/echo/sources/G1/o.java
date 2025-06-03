package G1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import x1.C2146B;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2074c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2076b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final o b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2146B.l());
            kotlin.jvm.internal.g gVar = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), gVar);
            }
            return null;
        }
    }

    public o(String str, boolean z7) {
        this.f2075a = str;
        this.f2076b = z7;
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f2075a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f2076b);
        edit.apply();
    }

    public String toString() {
        String str = this.f2076b ? "Applink" : "Unclassified";
        if (this.f2075a == null) {
            return str;
        }
        return str + '(' + ((Object) this.f2075a) + ')';
    }

    public /* synthetic */ o(String str, boolean z7, kotlin.jvm.internal.g gVar) {
        this(str, z7);
    }
}
