// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import java.util.Locale;
import android.os.LocaleList;

public final class o implements i
{
    public final LocaleList a;
    
    public o(final Object o) {
        this.a = n.a(o);
    }
    
    @Override
    public Object a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return j.a(this.a, ((i)o).a());
    }
    
    @Override
    public Locale get(final int n) {
        return l.a(this.a, n);
    }
    
    @Override
    public int hashCode() {
        return m.a(this.a);
    }
    
    @Override
    public String toString() {
        return k.a(this.a);
    }
}
