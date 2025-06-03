// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import android.app.Activity;
import android.content.Context;
import E5.o;
import B5.c;
import E5.k;
import A5.a;

public final class m implements a, B5.a
{
    public final q a;
    public k b;
    public c c;
    public l d;
    
    public m() {
        this.a = new q();
    }
    
    public final void a() {
        final c c = this.c;
        if (c != null) {
            c.d(this.a);
            this.c.f(this.a);
        }
    }
    
    public final void b() {
        final c c = this.c;
        if (c != null) {
            c.h(this.a);
            this.c.e(this.a);
        }
    }
    
    public final void c(final Context context, final E5.c c) {
        this.b = new k(c, "flutter.baseflow.com/permissions/methods");
        final l d = new l(context, new a(), this.a, new y());
        this.d = d;
        this.b.e((k.c)d);
    }
    
    public final void d(final Activity activity) {
        final l d = this.d;
        if (d != null) {
            d.i(activity);
        }
    }
    
    public final void e() {
        this.b.e(null);
        this.b = null;
        this.d = null;
    }
    
    public final void f() {
        final l d = this.d;
        if (d != null) {
            d.i(null);
        }
    }
    
    @Override
    public void onAttachedToActivity(final c c) {
        this.d(c.c());
        this.c = c;
        this.b();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.c(b.a(), b.b());
    }
    
    @Override
    public void onDetachedFromActivity() {
        this.f();
        this.a();
    }
    
    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.e();
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final c c) {
        this.onAttachedToActivity(c);
    }
}
