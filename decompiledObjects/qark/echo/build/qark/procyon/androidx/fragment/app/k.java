// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import x.a;
import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import H.e;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

public abstract class k extends g
{
    public final Activity o;
    public final Context p;
    public final Handler q;
    public final int r;
    public final n s;
    
    public k(final Activity o, final Context context, final Handler handler, final int r) {
        this.s = new o();
        this.o = o;
        this.p = (Context)e.c(context, "context == null");
        this.q = (Handler)e.c(handler, "handler == null");
        this.r = r;
    }
    
    public k(final androidx.fragment.app.e e) {
        this(e, (Context)e, new Handler(), 0);
    }
    
    public Activity h() {
        return this.o;
    }
    
    public Context i() {
        return this.p;
    }
    
    public Handler l() {
        return this.q;
    }
    
    public abstract Object m();
    
    public abstract LayoutInflater n();
    
    public abstract boolean o(final Fragment p0);
    
    public void p(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        if (n == -1) {
            a.j(this.p, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    
    public abstract void q();
}
