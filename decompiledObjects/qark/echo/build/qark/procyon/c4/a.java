// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c4;

import android.util.Log;
import java.util.List;

public class a extends b
{
    public a(final d.a a, final List list) {
        super(a, list);
    }
    
    @Override
    public String c(final d.a a, final String s, final String s2, final long n) {
        return s2;
    }
    
    @Override
    public void d(final String s, final String s2) {
        Log.d(s, s2);
    }
    
    @Override
    public void e(final String s, final String s2) {
        Log.e(s, s2);
    }
    
    @Override
    public void f(final String s, final String s2) {
        Log.i(s, s2);
    }
    
    @Override
    public void h(final String s, final String s2) {
        Log.w(s, s2);
    }
}
