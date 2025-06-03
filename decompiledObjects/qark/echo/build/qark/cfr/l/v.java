/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.ref.WeakReference
 *  java.util.Locale
 */
package l;

import L.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import e.i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import l.B;
import l.V;
import l.X;
import l.e;
import l.o;
import l.p;
import l.q;
import l.r;
import l.s;
import l.t;
import l.u;
import l.x;
import z.h;

public class v {
    public final TextView a;
    public V b;
    public V c;
    public V d;
    public V e;
    public V f;
    public V g;
    public V h;
    public final x i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public v(TextView textView) {
        this.a = textView;
        this.i = new x(textView);
    }

    public static V d(Context context, e object, int n8) {
        if ((context = object.e(context, n8)) != null) {
            object = new V();
            object.d = true;
            object.a = context;
            return object;
        }
        return null;
    }

    public final void A(int n8, float f8) {
        this.i.u(n8, f8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void B(Context var1_1, X var2_3) {
        block14 : {
            this.j = var2_3.i(i.c2, this.j);
            var4_4 = Build.VERSION.SDK_INT;
            if (var4_4 >= 28) {
                this.k = var3_5 = var2_3.i(i.e2, -1);
                if (var3_5 != -1) {
                    this.j &= 2;
                }
            }
            var7_6 = var2_3.p(i.d2);
            var8_7 = true;
            if (!var7_6 && !var2_3.p(i.f2)) {
                if (var2_3.p(i.b2) == false) return;
                this.m = false;
                var3_5 = var2_3.i(i.b2, 1);
                if (var3_5 != 1) {
                    if (var3_5 != 2) {
                        if (var3_5 != 3) {
                            return;
                        }
                        var1_1 = Typeface.MONOSPACE;
                    } else {
                        var1_1 = Typeface.SERIF;
                    }
                } else {
                    var1_1 = Typeface.SANS_SERIF;
                }
                this.l = var1_1;
                return;
            }
            this.l = null;
            var3_5 = var2_3.p(i.f2) != false ? i.f2 : i.d2;
            var5_8 = this.k;
            var6_9 = this.j;
            if (var1_1.isRestricted()) break block14;
            var1_1 = new h.b(new WeakReference((Object)this.a)){
                public final /* synthetic */ WeakReference c;
                {
                    this.c = weakReference;
                }

                @Override
                public void h(int n8) {
                }

                @Override
                public void i(Typeface typeface) {
                    Typeface typeface2 = typeface;
                    if (Build.VERSION.SDK_INT >= 28) {
                        int n8 = var5_8;
                        typeface2 = typeface;
                        if (n8 != -1) {
                            boolean bl = (var6_9 & 2) != 0;
                            typeface2 = u.a(typeface, n8, bl);
                        }
                    }
                    v.this.n(this.c, typeface2);
                }
            };
            var9_10 = var2_3.h(var3_5, this.j, (h.b)var1_1);
            if (var9_10 == null) ** GOTO lbl43
            var1_1 = var9_10;
            if (var4_4 < 28) ** GOTO lbl42
            var1_1 = var9_10;
            try {
                if (this.k != -1) {
                    var1_1 = Typeface.create((Typeface)var9_10, (int)0);
                    var4_4 = this.k;
                    var7_6 = (this.j & 2) != 0;
                    var1_1 = u.a((Typeface)var1_1, var4_4, var7_6);
                }
lbl42: // 4 sources:
                this.l = var1_1;
lbl43: // 2 sources:
                var7_6 = this.l == null;
                this.m = var7_6;
            }
            catch (Resources.NotFoundException | UnsupportedOperationException var1_2) {}
        }
        if (this.l != null) return;
        var1_1 = var2_3.m(var3_5);
        if (var1_1 == null) return;
        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            var1_1 = Typeface.create((String)var1_1, (int)0);
            var3_5 = this.k;
            var7_6 = (this.j & 2) != 0 ? var8_7 : false;
            var1_1 = u.a((Typeface)var1_1, var3_5, var7_6);
        } else {
            var1_1 = Typeface.create((String)var1_1, (int)this.j);
        }
        this.l = var1_1;
    }

    public final void a(Drawable drawable2, V v8) {
        if (drawable2 != null && v8 != null) {
            e.g(drawable2, v8, this.a.getDrawableState());
        }
    }

    public void b() {
        Drawable[] arrdrawable;
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            arrdrawable = this.a.getCompoundDrawables();
            this.a(arrdrawable[0], this.b);
            this.a(arrdrawable[1], this.c);
            this.a(arrdrawable[2], this.d);
            this.a(arrdrawable[3], this.e);
        }
        if (this.f != null || this.g != null) {
            arrdrawable = this.a.getCompoundDrawablesRelative();
            this.a(arrdrawable[0], this.f);
            this.a(arrdrawable[2], this.g);
        }
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.g();
    }

    public int f() {
        return this.i.h();
    }

    public int g() {
        return this.i.i();
    }

    public int[] h() {
        return this.i.j();
    }

    public int i() {
        return this.i.k();
    }

    public ColorStateList j() {
        V v8 = this.h;
        if (v8 != null) {
            return v8.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        V v8 = this.h;
        if (v8 != null) {
            return v8.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.o();
    }

    public void m(AttributeSet attributeSet, int n8) {
        boolean bl;
        Object object;
        boolean bl2;
        X x8;
        Context context = this.a.getContext();
        e e8 = e.b();
        Object object2 = X.s(context, attributeSet, i.M, n8, 0);
        Object object3 = this.a;
        I.s.B((View)object3, object3.getContext(), i.M, attributeSet, object2.o(), n8, 0);
        int n9 = object2.l(i.N, -1);
        if (object2.p(i.Q)) {
            this.b = v.d(context, e8, object2.l(i.Q, 0));
        }
        if (object2.p(i.O)) {
            this.c = v.d(context, e8, object2.l(i.O, 0));
        }
        if (object2.p(i.R)) {
            this.d = v.d(context, e8, object2.l(i.R, 0));
        }
        if (object2.p(i.P)) {
            this.e = v.d(context, e8, object2.l(i.P, 0));
        }
        int n10 = Build.VERSION.SDK_INT;
        if (object2.p(i.S)) {
            this.f = v.d(context, e8, object2.l(i.S, 0));
        }
        if (object2.p(i.T)) {
            this.g = v.d(context, e8, object2.l(i.T, 0));
        }
        object2.t();
        boolean bl3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n9 != -1) {
            object = X.q(context, n9, i.Z1);
            if (!bl3 && object.p(i.h2)) {
                bl2 = object.a(i.h2, false);
                bl = true;
            } else {
                bl = bl2 = false;
            }
            this.B(context, (X)object);
            object3 = object.p(i.i2) ? object.m(i.i2) : null;
            object2 = n10 >= 26 && object.p(i.g2) ? object.m(i.g2) : null;
            object.t();
        } else {
            bl = bl2 = false;
            object2 = null;
            object3 = null;
        }
        X x9 = X.s(context, attributeSet, i.Z1, n8, 0);
        if (!bl3 && x9.p(i.h2)) {
            bl2 = x9.a(i.h2, false);
            bl = true;
        }
        if (x9.p(i.i2)) {
            object3 = x9.m(i.i2);
        }
        object = object2;
        if (n10 >= 26) {
            object = object2;
            if (x9.p(i.g2)) {
                object = x9.m(i.g2);
            }
        }
        if (n10 >= 28 && x9.p(i.a2) && x9.e(i.a2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.B(context, x9);
        x9.t();
        if (!bl3 && bl) {
            this.r(bl2);
        }
        if ((object2 = this.l) != null) {
            if (this.k == -1) {
                this.a.setTypeface((Typeface)object2, this.j);
            } else {
                this.a.setTypeface((Typeface)object2);
            }
        }
        if (object != null) {
            o.a(this.a, (String)object);
        }
        if (object3 != null) {
            if (n10 >= 24) {
                q.a(this.a, p.a((String)object3));
            } else {
                object2 = object3.substring(0, object3.indexOf(44));
                this.a.setTextLocale(Locale.forLanguageTag((String)object2));
            }
        }
        this.i.p(attributeSet, n8);
        if (b.b && this.i.k() != 0 && (object2 = this.i.j()).length > 0) {
            if ((float)r.a(this.a) != -1.0f) {
                s.a(this.a, this.i.h(), this.i.g(), this.i.i(), 0);
            } else {
                t.a(this.a, (int[])object2, 0);
            }
        }
        attributeSet = (n8 = (x8 = X.r(context, attributeSet, i.U)).l(i.c0, -1)) != -1 ? e8.c(context, n8) : null;
        n8 = x8.l(i.h0, -1);
        object2 = n8 != -1 ? e8.c(context, n8) : null;
        n8 = x8.l(i.d0, -1);
        object3 = n8 != -1 ? e8.c(context, n8) : null;
        n8 = x8.l(i.a0, -1);
        object = n8 != -1 ? e8.c(context, n8) : null;
        n8 = x8.l(i.e0, -1);
        x9 = n8 != -1 ? e8.c(context, n8) : null;
        n8 = x8.l(i.b0, -1);
        context = n8 != -1 ? e8.c(context, n8) : null;
        this.x((Drawable)attributeSet, (Drawable)object2, (Drawable)object3, (Drawable)object, (Drawable)x9, (Drawable)context);
        if (x8.p(i.f0)) {
            attributeSet = x8.c(i.f0);
            L.h.f(this.a, (ColorStateList)attributeSet);
        }
        if (x8.p(i.g0)) {
            attributeSet = B.c(x8.i(i.g0, -1), null);
            L.h.g(this.a, (PorterDuff.Mode)attributeSet);
        }
        n8 = x8.e(i.i0, -1);
        n9 = x8.e(i.j0, -1);
        n10 = x8.e(i.k0, -1);
        x8.t();
        if (n8 != -1) {
            L.h.h(this.a, n8);
        }
        if (n9 != -1) {
            L.h.i(this.a, n9);
        }
        if (n10 != -1) {
            L.h.j(this.a, n10);
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            if ((weakReference = (TextView)weakReference.get()) != null) {
                weakReference.setTypeface(typeface, this.j);
            }
        }
    }

    public void o(boolean bl, int n8, int n9, int n10, int n11) {
        if (!b.b) {
            this.c();
        }
    }

    public void p() {
        this.b();
    }

    public void q(Context object, int n8) {
        X x8 = X.q((Context)object, n8, i.Z1);
        if (x8.p(i.h2)) {
            this.r(x8.a(i.h2, false));
        }
        n8 = Build.VERSION.SDK_INT;
        if (x8.p(i.a2) && x8.e(i.a2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.B((Context)object, x8);
        if (n8 >= 26 && x8.p(i.g2) && (object = x8.m(i.g2)) != null) {
            o.a(this.a, (String)object);
        }
        x8.t();
        object = this.l;
        if (object != null) {
            this.a.setTypeface((Typeface)object, this.j);
        }
    }

    public void r(boolean bl) {
        this.a.setAllCaps(bl);
    }

    public void s(int n8, int n9, int n10, int n11) {
        this.i.q(n8, n9, n10, n11);
    }

    public void t(int[] arrn, int n8) {
        this.i.r(arrn, n8);
    }

    public void u(int n8) {
        this.i.s(n8);
    }

    public void v(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new V();
        }
        V v8 = this.h;
        v8.a = colorStateList;
        boolean bl = colorStateList != null;
        v8.d = bl;
        this.y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new V();
        }
        V v8 = this.h;
        v8.b = mode;
        boolean bl = mode != null;
        v8.c = bl;
        this.y();
    }

    public final void x(Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6, Drawable arrdrawable) {
        if (drawable6 == null && arrdrawable == null) {
            if (drawable2 != null || drawable3 != null || drawable4 != null || drawable5 != null) {
                arrdrawable = this.a.getCompoundDrawablesRelative();
                drawable6 = arrdrawable[0];
                if (drawable6 == null && arrdrawable[2] == null) {
                    arrdrawable = this.a.getCompoundDrawables();
                    drawable6 = this.a;
                    if (drawable2 == null) {
                        drawable2 = arrdrawable[0];
                    }
                    if (drawable3 == null) {
                        drawable3 = arrdrawable[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = arrdrawable[2];
                    }
                    if (drawable5 == null) {
                        drawable5 = arrdrawable[3];
                    }
                    drawable6.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
                    return;
                }
                drawable2 = this.a;
                if (drawable3 == null) {
                    drawable3 = arrdrawable[1];
                }
                drawable4 = arrdrawable[2];
                if (drawable5 == null) {
                    drawable5 = arrdrawable[3];
                }
                drawable2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable3, drawable4, drawable5);
                return;
            }
        } else {
            drawable4 = this.a.getCompoundDrawablesRelative();
            drawable2 = this.a;
            if (drawable6 == null) {
                drawable6 = drawable4[0];
            }
            if (drawable3 == null) {
                drawable3 = drawable4[1];
            }
            if (arrdrawable == null) {
                arrdrawable = drawable4[2];
            }
            if (drawable5 == null) {
                drawable5 = drawable4[3];
            }
            drawable2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable3, (Drawable)arrdrawable, drawable5);
        }
    }

    public final void y() {
        V v8;
        this.b = v8 = this.h;
        this.c = v8;
        this.d = v8;
        this.e = v8;
        this.f = v8;
        this.g = v8;
    }

    public void z(int n8, float f8) {
        if (!b.b && !this.l()) {
            this.A(n8, f8);
        }
    }

}

