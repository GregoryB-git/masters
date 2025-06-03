// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import x1.B;
import kotlin.jvm.internal.g;

public final class o
{
    public static final a c;
    public final String a;
    public final boolean b;
    
    static {
        c = new a(null);
    }
    
    public o(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        edit.apply();
    }
    
    @Override
    public String toString() {
        String str;
        if (this.b) {
            str = "Applink";
        }
        else {
            str = "Unclassified";
        }
        String string = str;
        if (this.a != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            sb.append((Object)this.a);
            sb.append(')');
            string = sb.toString();
        }
        return string;
    }
    
    public static final class a
    {
        public final void a() {
            final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }
        
        public final o b() {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(B.l());
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String)null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
        }
    }
}
