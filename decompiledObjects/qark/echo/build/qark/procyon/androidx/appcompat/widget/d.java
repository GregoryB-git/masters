// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import l.X;
import e.a;
import e.i;
import e.g;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import l.A;

public class d implements A
{
    public Toolbar a;
    public int b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window$Callback k;
    public boolean l;
    public int m;
    public int n;
    public Drawable o;
    
    public d(final Toolbar toolbar, final boolean b) {
        this(toolbar, b, e.g.a, e.d.n);
    }
    
    public d(final Toolbar a, final boolean b, final int n, int popupTheme) {
        this.m = 0;
        this.n = 0;
        this.a = a;
        this.h = a.getTitle();
        this.i = a.getSubtitle();
        this.g = (this.h != null);
        this.f = a.getNavigationIcon();
        final X s = X.s(((View)a).getContext(), null, e.i.a, e.a.c, 0);
        this.o = s.f(e.i.j);
        if (b) {
            final CharSequence n2 = s.n(e.i.p);
            if (!TextUtils.isEmpty(n2)) {
                this.n(n2);
            }
            final CharSequence n3 = s.n(e.i.n);
            if (!TextUtils.isEmpty(n3)) {
                this.m(n3);
            }
            final Drawable f = s.f(e.i.l);
            if (f != null) {
                this.i(f);
            }
            final Drawable f2 = s.f(e.i.k);
            if (f2 != null) {
                this.setIcon(f2);
            }
            if (this.f == null) {
                final Drawable o = this.o;
                if (o != null) {
                    this.l(o);
                }
            }
            this.h(s.i(e.i.h, 0));
            popupTheme = s.l(e.i.g, 0);
            if (popupTheme != 0) {
                this.f(LayoutInflater.from(((View)this.a).getContext()).inflate(popupTheme, (ViewGroup)this.a, false));
                this.h(this.b | 0x10);
            }
            popupTheme = s.k(e.i.i, 0);
            if (popupTheme > 0) {
                final ViewGroup$LayoutParams layoutParams = ((View)this.a).getLayoutParams();
                layoutParams.height = popupTheme;
                ((View)this.a).setLayoutParams(layoutParams);
            }
            popupTheme = s.d(e.i.f, -1);
            final int d = s.d(e.i.e, -1);
            if (popupTheme >= 0 || d >= 0) {
                this.a.C(Math.max(popupTheme, 0), Math.max(d, 0));
            }
            popupTheme = s.l(e.i.q, 0);
            if (popupTheme != 0) {
                final Toolbar a2 = this.a;
                a2.E(((View)a2).getContext(), popupTheme);
            }
            popupTheme = s.l(e.i.o, 0);
            if (popupTheme != 0) {
                final Toolbar a3 = this.a;
                a3.D(((View)a3).getContext(), popupTheme);
            }
            popupTheme = s.l(e.i.m, 0);
            if (popupTheme != 0) {
                this.a.setPopupTheme(popupTheme);
            }
        }
        else {
            this.b = this.d();
        }
        s.t();
        this.g(n);
        this.j = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final k.a o = new k.a(((View)androidx.appcompat.widget.d.this.a).getContext(), 0, 16908332, 0, 0, androidx.appcompat.widget.d.this.h);
            
            public void onClick(final View view) {
                final d p = androidx.appcompat.widget.d.this;
                final Window$Callback k = p.k;
                if (k != null && p.l) {
                    k.onMenuItemSelected(0, (MenuItem)this.o);
                }
            }
        });
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        if (!this.g) {
            this.o(charSequence);
        }
    }
    
    @Override
    public void b(final Window$Callback k) {
        this.k = k;
    }
    
    @Override
    public void c(final int n) {
        Drawable b;
        if (n != 0) {
            b = g.a.b(this.e(), n);
        }
        else {
            b = null;
        }
        this.i(b);
    }
    
    public final int d() {
        if (this.a.getNavigationIcon() != null) {
            this.o = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }
    
    public Context e() {
        return ((View)this.a).getContext();
    }
    
    public void f(final View c) {
        final View c2 = this.c;
        if (c2 != null && (this.b & 0x10) != 0x0) {
            this.a.removeView(c2);
        }
        if ((this.c = c) != null && (this.b & 0x10) != 0x0) {
            this.a.addView(c);
        }
    }
    
    public void g(final int n) {
        if (n == this.n) {
            return;
        }
        this.n = n;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.j(this.n);
        }
    }
    
    @Override
    public CharSequence getTitle() {
        return this.a.getTitle();
    }
    
    public void h(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.p();
                }
                this.q();
            }
            if ((n & 0x3) != 0x0) {
                this.r();
            }
            if ((n & 0x8) != 0x0) {
                Toolbar toolbar;
                CharSequence i;
                if ((b & 0x8) != 0x0) {
                    this.a.setTitle(this.h);
                    toolbar = this.a;
                    i = this.i;
                }
                else {
                    final Toolbar a = this.a;
                    i = null;
                    a.setTitle(null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(i);
            }
            if ((n & 0x10) != 0x0) {
                final View c = this.c;
                if (c != null) {
                    if ((b & 0x10) != 0x0) {
                        this.a.addView(c);
                        return;
                    }
                    this.a.removeView(c);
                }
            }
        }
    }
    
    public void i(final Drawable e) {
        this.e = e;
        this.r();
    }
    
    public void j(final int n) {
        CharSequence string;
        if (n == 0) {
            string = null;
        }
        else {
            string = this.e().getString(n);
        }
        this.k(string);
    }
    
    public void k(final CharSequence j) {
        this.j = j;
        this.p();
    }
    
    public void l(final Drawable f) {
        this.f = f;
        this.q();
    }
    
    public void m(final CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setSubtitle(charSequence);
        }
    }
    
    public void n(final CharSequence charSequence) {
        this.g = true;
        this.o(charSequence);
    }
    
    public final void o(final CharSequence charSequence) {
        this.h = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setTitle(charSequence);
        }
    }
    
    public final void p() {
        if ((this.b & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.j)) {
                this.a.setNavigationContentDescription(this.n);
                return;
            }
            this.a.setNavigationContentDescription(this.j);
        }
    }
    
    public final void q() {
        Toolbar toolbar;
        Drawable navigationIcon;
        if ((this.b & 0x4) != 0x0) {
            toolbar = this.a;
            navigationIcon = this.f;
            if (navigationIcon == null) {
                navigationIcon = this.o;
            }
        }
        else {
            toolbar = this.a;
            navigationIcon = null;
        }
        toolbar.setNavigationIcon(navigationIcon);
    }
    
    public final void r() {
        final int b = this.b;
        Drawable logo = null;
        Label_0039: {
            if ((b & 0x2) != 0x0) {
                if ((b & 0x1) != 0x0) {
                    logo = this.e;
                    if (logo != null) {
                        break Label_0039;
                    }
                }
                logo = this.d;
            }
            else {
                logo = null;
            }
        }
        this.a.setLogo(logo);
    }
    
    @Override
    public void setIcon(final int n) {
        Drawable b;
        if (n != 0) {
            b = g.a.b(this.e(), n);
        }
        else {
            b = null;
        }
        this.setIcon(b);
    }
    
    @Override
    public void setIcon(final Drawable d) {
        this.d = d;
        this.r();
    }
}
