// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.res.ColorStateList;

public class a implements c
{
    @Override
    public void a(final b b, final float elevation) {
        b.a().setElevation(elevation);
    }
    
    @Override
    public float b(final b b) {
        return this.o(b).d();
    }
    
    @Override
    public float c(final b b) {
        return this.b(b) * 2.0f;
    }
    
    @Override
    public void d(final b b) {
        this.l(b, this.i(b));
    }
    
    @Override
    public float e(final b b) {
        return b.a().getElevation();
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void g(final b b, final float n) {
        this.o(b).h(n);
    }
    
    @Override
    public ColorStateList h(final b b) {
        return this.o(b).b();
    }
    
    @Override
    public float i(final b b) {
        return this.o(b).c();
    }
    
    @Override
    public void j(final b b, final Context context, final ColorStateList list, final float n, final float elevation, final float n2) {
        b.c(new d(list, n));
        final View a = b.a();
        a.setClipToOutline(true);
        a.setElevation(elevation);
        this.l(b, n2);
    }
    
    @Override
    public void k(final b b) {
        this.l(b, this.i(b));
    }
    
    @Override
    public void l(final b b, final float n) {
        this.o(b).g(n, b.e(), b.d());
        this.p(b);
    }
    
    @Override
    public void m(final b b, final ColorStateList list) {
        this.o(b).f(list);
    }
    
    @Override
    public float n(final b b) {
        return this.b(b) * 2.0f;
    }
    
    public final d o(final b b) {
        return (d)b.f();
    }
    
    public void p(final b b) {
        if (!b.e()) {
            b.b(0, 0, 0, 0);
            return;
        }
        final float i = this.i(b);
        final float b2 = this.b(b);
        final int n = (int)Math.ceil(e.a(i, b2, b.d()));
        final int n2 = (int)Math.ceil(e.b(i, b2, b.d()));
        b.b(n, n2, n, n2);
    }
}
