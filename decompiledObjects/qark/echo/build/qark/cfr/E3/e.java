/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package E3;

import E3.f;
import H3.i;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

public class e {
    public final Context a;
    public b b;

    public e(Context context) {
        this.a = context;
        this.b = null;
    }

    public final boolean c(String string2) {
        block4 : {
            if (this.a.getAssets() == null) {
                return false;
            }
            try {
                string2 = this.a.getAssets().open(string2);
                if (string2 == null) break block4;
            }
            catch (IOException iOException) {
                return false;
            }
            string2.close();
        }
        return true;
    }

    public String d() {
        return this.f().a;
    }

    public String e() {
        return this.f().b;
    }

    public final b f() {
        if (this.b == null) {
            this.b = new b(null);
        }
        return this.b;
    }

    public class b {
        public final String a;
        public final String b;

        public b() {
            int n8 = i.q(((e)e.this).a, "com.google.firebase.crashlytics.unity_version", "string");
            if (n8 != 0) {
                this.a = "Unity";
                this.b = object = ((e)e.this).a.getResources().getString(n8);
                f f8 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unity Editor version is: ");
                stringBuilder.append((String)e.this);
                f8.i(stringBuilder.toString());
                return;
            }
            if (((e)e.this).c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                f.f().i("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }

        public /* synthetic */ b( a8) {
            this();
        }
    }

}

