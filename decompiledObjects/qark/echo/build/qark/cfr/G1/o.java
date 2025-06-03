/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package G1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.g;
import x1.B;

public final class o {
    public static final a c = new a(null);
    public final String a;
    public final boolean b;

    public o(String string2, boolean bl) {
        this.a = string2;
        this.b = bl;
    }

    public /* synthetic */ o(String string2, boolean bl, g g8) {
        this(string2, bl);
    }

    public final void a() {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).edit();
        editor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        editor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        editor.apply();
    }

    public String toString() {
        String string2 = this.b ? "Applink" : "Unclassified";
        String string3 = string2;
        if (this.a != null) {
            string3 = new StringBuilder();
            string3.append(string2);
            string3.append('(');
            string3.append((Object)this.a);
            string3.append(')');
            string3 = string3.toString();
        }
        return string3;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).edit();
            editor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editor.apply();
        }

        public final o b() {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)B.l());
            if (!sharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new o(sharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), sharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
        }
    }

}

