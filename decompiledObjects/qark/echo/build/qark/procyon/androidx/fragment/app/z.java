// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import androidx.savedstate.SavedStateRegistry;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.d;
import androidx.savedstate.b;
import androidx.lifecycle.i;
import androidx.savedstate.c;

public class z implements c
{
    public i o;
    public b p;
    
    public z() {
        this.o = null;
        this.p = null;
    }
    
    public void a(final d.b b) {
        this.o.h(b);
    }
    
    public void b() {
        if (this.o == null) {
            this.o = new i(this);
            this.p = b.a(this);
        }
    }
    
    public boolean c() {
        return this.o != null;
    }
    
    public void d(final Bundle bundle) {
        this.p.c(bundle);
    }
    
    public void e(final Bundle bundle) {
        this.p.d(bundle);
    }
    
    public void f(final d.c c) {
        this.o.o(c);
    }
    
    @Override
    public d g() {
        this.b();
        return this.o;
    }
    
    @Override
    public SavedStateRegistry k() {
        return this.p.b();
    }
}
