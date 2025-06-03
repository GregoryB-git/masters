// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q2;

import R2.u3;
import java.util.Map;
import java.util.List;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;

public class a
{
    public final J0 a;
    
    public a(final J0 a) {
        this.a = a;
    }
    
    public void a(final String s, final String s2, final Bundle bundle) {
        this.a.u(s, s2, bundle);
    }
    
    public List b(final String s, final String s2) {
        return this.a.g(s, s2);
    }
    
    public int c(final String s) {
        return this.a.a(s);
    }
    
    public Map d(final String s, final String s2, final boolean b) {
        return this.a.h(s, s2, b);
    }
    
    public void e(final String s, final String s2, final Bundle bundle) {
        this.a.D(s, s2, bundle);
    }
    
    public void f(final a a) {
        this.a.k(a);
    }
    
    public void g(final Bundle bundle) {
        this.a.m(bundle);
    }
    
    public void h(final String s, final String s2, final Object o) {
        this.a.w(s, s2, o, true);
    }
    
    public final void i(final boolean b) {
        this.a.x(b);
    }
    
    public interface a extends u3
    {
    }
}
