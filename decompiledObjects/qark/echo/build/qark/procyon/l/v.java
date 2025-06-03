// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import L.b;
import java.util.Locale;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import I.s;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import z.h;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import e.i;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class v
{
    public final TextView a;
    public V b;
    public V c;
    public V d;
    public V e;
    public V f;
    public V g;
    public V h;
    public final x i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;
    
    public v(final TextView a) {
        this.j = 0;
        this.k = -1;
        this.a = a;
        this.i = new x(a);
    }
    
    public static V d(final Context context, final e e, final int n) {
        final ColorStateList e2 = e.e(context, n);
        if (e2 != null) {
            final V v = new V();
            v.d = true;
            v.a = e2;
            return v;
        }
        return null;
    }
    
    public final void A(final int n, final float n2) {
        this.i.u(n, n2);
    }
    
    public final void B(final Context context, final X x) {
        this.j = x.i(e.i.c2, this.j);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28 && (this.k = x.i(e.i.e2, -1)) != -1) {
            this.j &= 0x2;
        }
        final boolean p2 = x.p(e.i.d2);
        final boolean b = true;
        if (!p2 && !x.p(e.i.f2)) {
            if (x.p(e.i.b2)) {
                this.m = false;
                final int i = x.i(e.i.b2, 1);
                Typeface l;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        l = Typeface.MONOSPACE;
                    }
                    else {
                        l = Typeface.SERIF;
                    }
                }
                else {
                    l = Typeface.SANS_SERIF;
                }
                this.l = l;
            }
        }
        else {
            this.l = null;
            int n;
            if (x.p(e.i.f2)) {
                n = e.i.f2;
            }
            else {
                n = e.i.d2;
            }
            final int k = this.k;
            final int j = this.j;
        Label_0319:
            while (true) {
                if (context.isRestricted()) {
                    break Label_0319;
                }
            Label_0313_Outer:
                while (true) {
                    final h.b b2 = new h.b() {
                        public final /* synthetic */ WeakReference c = new WeakReference((T)v.this.a);
                        
                        @Override
                        public void h(final int n) {
                        }
                        
                        @Override
                        public void i(final Typeface typeface) {
                            Typeface a = typeface;
                            if (Build$VERSION.SDK_INT >= 28) {
                                final int a2 = k;
                                a = typeface;
                                if (a2 != -1) {
                                    a = u.a(typeface, a2, (j & 0x2) != 0x0);
                                }
                            }
                            v.this.n(this.c, a);
                        }
                    };
                    while (true) {
                    Label_0419:
                        while (true) {
                            Label_0413: {
                                try {
                                    final Typeface h = x.h(n, this.j, b2);
                                    if (h != null) {
                                        Typeface a = h;
                                        if (sdk_INT >= 28) {
                                            a = h;
                                            if (this.k != -1) {
                                                final Typeface create = Typeface.create(h, 0);
                                                final int m = this.k;
                                                if ((this.j & 0x2) == 0x0) {
                                                    break Label_0413;
                                                }
                                                final boolean b3 = true;
                                                a = u.a(create, m, b3);
                                            }
                                        }
                                        this.l = a;
                                    }
                                    if (this.l == null) {
                                        final boolean m2 = true;
                                        this.m = m2;
                                        if (this.l == null) {
                                            final String m3 = x.m(n);
                                            if (m3 != null) {
                                                Typeface l2;
                                                if (Build$VERSION.SDK_INT >= 28 && this.k != -1) {
                                                    final Typeface create2 = Typeface.create(m3, 0);
                                                    n = this.k;
                                                    l2 = u.a(create2, n, (this.j & 0x2) != 0x0 && b);
                                                }
                                                else {
                                                    l2 = Typeface.create(m3, this.j);
                                                }
                                                this.l = l2;
                                            }
                                        }
                                        return;
                                    }
                                    break Label_0419;
                                }
                                catch (UnsupportedOperationException | Resources$NotFoundException ex) {
                                    continue Label_0319;
                                }
                            }
                            final boolean b3 = false;
                            continue Label_0313_Outer;
                        }
                        final boolean m2 = false;
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final void a(final Drawable drawable, final V v) {
        if (drawable != null && v != null) {
            l.e.g(drawable, v, ((View)this.a).getDrawableState());
        }
    }
    
    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            this.a(compoundDrawables[0], this.b);
            this.a(compoundDrawables[1], this.c);
            this.a(compoundDrawables[2], this.d);
            this.a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            final Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            this.a(compoundDrawablesRelative[0], this.f);
            this.a(compoundDrawablesRelative[2], this.g);
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
        final V h = this.h;
        if (h != null) {
            return h.a;
        }
        return null;
    }
    
    public PorterDuff$Mode k() {
        final V h = this.h;
        if (h != null) {
            return h.b;
        }
        return null;
    }
    
    public boolean l() {
        return this.i.o();
    }
    
    public void m(final AttributeSet set, int n) {
        final Context context = ((View)this.a).getContext();
        final e b = l.e.b();
        final X s = X.s(context, set, e.i.M, n, 0);
        final TextView a = this.a;
        I.s.B((View)a, ((View)a).getContext(), e.i.M, set, s.o(), n, 0);
        final int l = s.l(e.i.N, -1);
        if (s.p(e.i.Q)) {
            this.b = d(context, b, s.l(e.i.Q, 0));
        }
        if (s.p(e.i.O)) {
            this.c = d(context, b, s.l(e.i.O, 0));
        }
        if (s.p(e.i.R)) {
            this.d = d(context, b, s.l(e.i.R, 0));
        }
        if (s.p(e.i.P)) {
            this.e = d(context, b, s.l(e.i.P, 0));
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (s.p(e.i.S)) {
            this.f = d(context, b, s.l(e.i.S, 0));
        }
        if (s.p(e.i.T)) {
            this.g = d(context, b, s.l(e.i.T, 0));
        }
        s.t();
        final boolean b2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean b3;
        boolean b4;
        String s2;
        String m;
        if (l != -1) {
            final X q = X.q(context, l, e.i.Z1);
            if (!b2 && q.p(e.i.h2)) {
                b3 = q.a(e.i.h2, false);
                b4 = true;
            }
            else {
                b3 = (b4 = false);
            }
            this.B(context, q);
            if (q.p(e.i.i2)) {
                s2 = q.m(e.i.i2);
            }
            else {
                s2 = null;
            }
            if (sdk_INT >= 26 && q.p(e.i.g2)) {
                m = q.m(e.i.g2);
            }
            else {
                m = null;
            }
            q.t();
        }
        else {
            b3 = (b4 = false);
            m = null;
            s2 = null;
        }
        final X s3 = X.s(context, set, e.i.Z1, n, 0);
        if (!b2 && s3.p(e.i.h2)) {
            b3 = s3.a(e.i.h2, false);
            b4 = true;
        }
        if (s3.p(e.i.i2)) {
            s2 = s3.m(e.i.i2);
        }
        String i = m;
        if (sdk_INT >= 26) {
            i = m;
            if (s3.p(e.i.g2)) {
                i = s3.m(e.i.g2);
            }
        }
        if (sdk_INT >= 28 && s3.p(e.i.a2) && s3.e(e.i.a2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.B(context, s3);
        s3.t();
        if (!b2 && b4) {
            this.r(b3);
        }
        final Typeface j = this.l;
        if (j != null) {
            if (this.k == -1) {
                this.a.setTypeface(j, this.j);
            }
            else {
                this.a.setTypeface(j);
            }
        }
        if (i != null) {
            o.a(this.a, i);
        }
        if (s2 != null) {
            if (sdk_INT >= 24) {
                q.a(this.a, p.a(s2));
            }
            else {
                this.a.setTextLocale(Locale.forLanguageTag(s2.substring(0, s2.indexOf(44))));
            }
        }
        this.i.p(set, n);
        if (L.b.b && this.i.k() != 0) {
            final int[] k = this.i.j();
            if (k.length > 0) {
                if (r.a(this.a) != -1.0f) {
                    l.s.a(this.a, this.i.h(), this.i.g(), this.i.i(), 0);
                }
                else {
                    t.a(this.a, k, 0);
                }
            }
        }
        final X r = X.r(context, set, e.i.U);
        n = r.l(e.i.c0, -1);
        Drawable c;
        if (n != -1) {
            c = b.c(context, n);
        }
        else {
            c = null;
        }
        n = r.l(e.i.h0, -1);
        Drawable c2;
        if (n != -1) {
            c2 = b.c(context, n);
        }
        else {
            c2 = null;
        }
        n = r.l(e.i.d0, -1);
        Drawable c3;
        if (n != -1) {
            c3 = b.c(context, n);
        }
        else {
            c3 = null;
        }
        n = r.l(e.i.a0, -1);
        Drawable c4;
        if (n != -1) {
            c4 = b.c(context, n);
        }
        else {
            c4 = null;
        }
        n = r.l(e.i.e0, -1);
        Drawable c5;
        if (n != -1) {
            c5 = b.c(context, n);
        }
        else {
            c5 = null;
        }
        n = r.l(e.i.b0, -1);
        Drawable c6;
        if (n != -1) {
            c6 = b.c(context, n);
        }
        else {
            c6 = null;
        }
        this.x(c, c2, c3, c4, c5, c6);
        if (r.p(e.i.f0)) {
            L.h.f(this.a, r.c(e.i.f0));
        }
        if (r.p(e.i.g0)) {
            L.h.g(this.a, B.c(r.i(e.i.g0, -1), null));
        }
        n = r.e(e.i.i0, -1);
        final int e = r.e(e.i.j0, -1);
        final int e2 = r.e(e.i.k0, -1);
        r.t();
        if (n != -1) {
            L.h.h(this.a, n);
        }
        if (e != -1) {
            L.h.i(this.a, e);
        }
        if (e2 != -1) {
            L.h.j(this.a, e2);
        }
    }
    
    public void n(final WeakReference weakReference, final Typeface l) {
        if (this.m) {
            this.l = l;
            final TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(l, this.j);
            }
        }
    }
    
    public void o(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!b.b) {
            this.c();
        }
    }
    
    public void p() {
        this.b();
    }
    
    public void q(final Context context, int sdk_INT) {
        final X q = X.q(context, sdk_INT, e.i.Z1);
        if (q.p(e.i.h2)) {
            this.r(q.a(e.i.h2, false));
        }
        sdk_INT = Build$VERSION.SDK_INT;
        if (q.p(e.i.a2) && q.e(e.i.a2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.B(context, q);
        if (sdk_INT >= 26 && q.p(e.i.g2)) {
            final String m = q.m(e.i.g2);
            if (m != null) {
                o.a(this.a, m);
            }
        }
        q.t();
        final Typeface l = this.l;
        if (l != null) {
            this.a.setTypeface(l, this.j);
        }
    }
    
    public void r(final boolean allCaps) {
        this.a.setAllCaps(allCaps);
    }
    
    public void s(final int n, final int n2, final int n3, final int n4) {
        this.i.q(n, n2, n3, n4);
    }
    
    public void t(final int[] array, final int n) {
        this.i.r(array, n);
    }
    
    public void u(final int n) {
        this.i.s(n);
    }
    
    public void v(final ColorStateList a) {
        if (this.h == null) {
            this.h = new V();
        }
        final V h = this.h;
        h.a = a;
        h.d = (a != null);
        this.y();
    }
    
    public void w(final PorterDuff$Mode b) {
        if (this.h == null) {
            this.h = new V();
        }
        final V h = this.h;
        h.b = b;
        h.c = (b != null);
        this.y();
    }
    
    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                final Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                drawable5 = compoundDrawablesRelative[0];
                if (drawable5 == null && compoundDrawablesRelative[2] == null) {
                    final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                    final TextView a = this.a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    a.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                final TextView a2 = this.a;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative[1];
                }
                drawable3 = compoundDrawablesRelative[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative[3];
                }
                a2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable3, drawable4);
            }
        }
        else {
            final Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            final TextView a3 = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            a3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
    }
    
    public final void y() {
        final V h = this.h;
        this.b = h;
        this.c = h;
        this.d = h;
        this.e = h;
        this.f = h;
        this.g = h;
    }
    
    public void z(final int n, final float n2) {
        if (!L.b.b && !this.l()) {
            this.A(n, n2);
        }
    }
}
