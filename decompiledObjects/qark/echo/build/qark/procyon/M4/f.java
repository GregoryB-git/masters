// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.os.BaseBundle;
import android.os.Bundle;
import F4.a;

public final class f
{
    public static final a b;
    public final Bundle a;
    
    static {
        b = a.e();
    }
    
    public f() {
        this(new Bundle());
    }
    
    public f(final Bundle bundle) {
        this.a = (Bundle)bundle.clone();
    }
    
    public boolean a(final String s) {
        return s != null && ((BaseBundle)this.a).containsKey(s);
    }
    
    public g b(final String s) {
        if (!this.a(s)) {
            return g.a();
        }
        try {
            return g.b(((BaseBundle)this.a).get(s));
        }
        catch (ClassCastException ex) {
            f.b.b("Metadata key %s contains type other than boolean: %s", s, ex.getMessage());
            return g.a();
        }
    }
    
    public g c(final String s) {
        if (!this.a(s)) {
            return g.a();
        }
        final Object value = ((BaseBundle)this.a).get(s);
        if (value == null) {
            return g.a();
        }
        if (value instanceof Float) {
            return g.e((double)value);
        }
        if (value instanceof Double) {
            return g.e(value);
        }
        f.b.b("Metadata key %s contains type other than double: %s", s);
        return g.a();
    }
    
    public final g d(final String s) {
        if (!this.a(s)) {
            return g.a();
        }
        try {
            return g.b(((BaseBundle)this.a).get(s));
        }
        catch (ClassCastException ex) {
            f.b.b("Metadata key %s contains type other than int: %s", s, ex.getMessage());
            return g.a();
        }
    }
    
    public g e(final String s) {
        final g d = this.d(s);
        if (d.d()) {
            return g.e((long)(int)d.c());
        }
        return g.a();
    }
}
