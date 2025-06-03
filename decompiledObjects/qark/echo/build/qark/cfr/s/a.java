/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  java.lang.Math
 *  java.lang.Object
 */
package s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import s.b;
import s.c;
import s.d;
import s.e;

public class a
implements c {
    @Override
    public void a(b b8, float f8) {
        b8.a().setElevation(f8);
    }

    @Override
    public float b(b b8) {
        return this.o(b8).d();
    }

    @Override
    public float c(b b8) {
        return this.b(b8) * 2.0f;
    }

    @Override
    public void d(b b8) {
        this.l(b8, this.i(b8));
    }

    @Override
    public float e(b b8) {
        return b8.a().getElevation();
    }

    @Override
    public void f() {
    }

    @Override
    public void g(b b8, float f8) {
        this.o(b8).h(f8);
    }

    @Override
    public ColorStateList h(b b8) {
        return this.o(b8).b();
    }

    @Override
    public float i(b b8) {
        return this.o(b8).c();
    }

    @Override
    public void j(b b8, Context context, ColorStateList colorStateList, float f8, float f9, float f10) {
        b8.c(new d(colorStateList, f8));
        context = b8.a();
        context.setClipToOutline(true);
        context.setElevation(f9);
        this.l(b8, f10);
    }

    @Override
    public void k(b b8) {
        this.l(b8, this.i(b8));
    }

    @Override
    public void l(b b8, float f8) {
        this.o(b8).g(f8, b8.e(), b8.d());
        this.p(b8);
    }

    @Override
    public void m(b b8, ColorStateList colorStateList) {
        this.o(b8).f(colorStateList);
    }

    @Override
    public float n(b b8) {
        return this.b(b8) * 2.0f;
    }

    public final d o(b b8) {
        return (d)b8.f();
    }

    public void p(b b8) {
        if (!b8.e()) {
            b8.b(0, 0, 0, 0);
            return;
        }
        float f8 = this.i(b8);
        float f9 = this.b(b8);
        int n8 = (int)Math.ceil((double)e.a(f8, f9, b8.d()));
        int n9 = (int)Math.ceil((double)e.b(f8, f9, b8.d()));
        b8.b(n8, n9, n8, n9);
    }
}

