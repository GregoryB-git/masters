// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.net.Uri$Builder;
import java.util.Iterator;
import android.util.Pair;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Bundle;

public final class c6
{
    public final N2 a;
    
    public c6(final N2 a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.e().n();
        if (!this.d()) {
            return;
        }
        if (this.e()) {
            this.a.F().w.b(null);
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("source", "(not set)");
            ((BaseBundle)bundle).putString("medium", "(not set)");
            ((BaseBundle)bundle).putString("_cis", "intent");
            ((BaseBundle)bundle).putLong("_cc", 1L);
            this.a.H().z0("auto", "_cmpx", bundle);
        }
        else {
            final String a = this.a.F().w.a();
            if (TextUtils.isEmpty((CharSequence)a)) {
                this.a.j().I().a("Cache still valid but referrer not found");
            }
            else {
                final long n = this.a.F().x.a() / 3600000L;
                final Uri parse = Uri.parse(a);
                final Bundle bundle2 = new Bundle();
                final Pair pair = new Pair((Object)parse.getPath(), (Object)bundle2);
                for (final String s : parse.getQueryParameterNames()) {
                    ((BaseBundle)bundle2).putString(s, parse.getQueryParameter(s));
                }
                ((BaseBundle)pair.second).putLong("_cc", (n - 1L) * 3600000L);
                final Object first = pair.first;
                String s2;
                if (first == null) {
                    s2 = "app";
                }
                else {
                    s2 = (String)first;
                }
                this.a.H().z0(s2, "_cmp", (Bundle)pair.second);
            }
            this.a.F().w.b(null);
        }
        this.a.F().x.b(0L);
    }
    
    public final void b(String string, final Bundle bundle) {
        this.a.e().n();
        if (!this.a.p()) {
            if (bundle != null && !((BaseBundle)bundle).isEmpty()) {
                String s = null;
                Label_0050: {
                    if (string != null) {
                        s = string;
                        if (!string.isEmpty()) {
                            break Label_0050;
                        }
                    }
                    s = "auto";
                }
                final Uri$Builder uri$Builder = new Uri$Builder();
                uri$Builder.path(s);
                for (final String s2 : ((BaseBundle)bundle).keySet()) {
                    uri$Builder.appendQueryParameter(s2, ((BaseBundle)bundle).getString(s2));
                }
                string = uri$Builder.build().toString();
            }
            else {
                string = null;
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a.F().w.b(string);
                this.a.F().x.b(this.a.b().a());
            }
        }
    }
    
    public final void c() {
        if (this.d() && this.e()) {
            this.a.F().w.b(null);
        }
    }
    
    public final boolean d() {
        return this.a.F().x.a() > 0L;
    }
    
    public final boolean e() {
        return this.d() && this.a.b().a() - this.a.F().x.a() > this.a.z().x(null, K.V);
    }
}
