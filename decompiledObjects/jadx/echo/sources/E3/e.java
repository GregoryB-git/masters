package E3;

import H3.AbstractC0387i;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1627a;

    /* renamed from: b, reason: collision with root package name */
    public b f1628b = null;

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1629a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1630b;

        public b() {
            int q7 = AbstractC0387i.q(e.this.f1627a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q7 == 0) {
                if (!e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f1629a = null;
                    this.f1630b = null;
                    return;
                } else {
                    this.f1629a = "Flutter";
                    this.f1630b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f1629a = "Unity";
            String string = e.this.f1627a.getResources().getString(q7);
            this.f1630b = string;
            f.f().i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f1627a = context;
    }

    public final boolean c(String str) {
        if (this.f1627a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f1627a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f1629a;
    }

    public String e() {
        return f().f1630b;
    }

    public final b f() {
        if (this.f1628b == null) {
            this.f1628b = new b();
        }
        return this.f1628b;
    }
}
