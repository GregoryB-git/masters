// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E3;

import H3.i;
import java.io.InputStream;
import java.io.IOException;
import android.content.Context;

public class e
{
    public final Context a;
    public b b;
    
    public e(final Context a) {
        this.a = a;
        this.b = null;
    }
    
    public static /* synthetic */ Context a(final e e) {
        return e.a;
    }
    
    public final boolean c(final String s) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            final InputStream open = this.a.getAssets().open(s);
            if (open != null) {
                open.close();
            }
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public String d() {
        return e.b.a(this.f());
    }
    
    public String e() {
        return e.b.b(this.f());
    }
    
    public final b f() {
        if (this.b == null) {
            this.b = new b(null);
        }
        return this.b;
    }
    
    public class b
    {
        public final String a;
        public final String b;
        
        public b() {
            final int q = i.q(e.a(e.this), "com.google.firebase.crashlytics.unity_version", "string");
            if (q != 0) {
                this.a = "Unity";
                final String string = e.a(e.this).getResources().getString(q);
                this.b = string;
                final f f = E3.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Unity Editor version is: ");
                sb.append(string);
                f.i(sb.toString());
                return;
            }
            if (e.this.c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                f.f().i("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }
        
        public static /* synthetic */ String a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ String b(final b b) {
            return b.b;
        }
    }
}
