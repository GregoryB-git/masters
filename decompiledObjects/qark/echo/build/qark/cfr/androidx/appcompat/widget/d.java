/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import e.a;
import e.g;
import e.i;
import l.A;
import l.X;

public class d
implements A {
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
    public Window.Callback k;
    public boolean l;
    public int m = 0;
    public int n = 0;
    public Drawable o;

    public d(Toolbar toolbar, boolean bl) {
        this(toolbar, bl, g.a, e.d.n);
    }

    public d(Toolbar object, boolean bl, int n8, int n9) {
        this.a = object;
        this.h = object.getTitle();
        this.i = object.getSubtitle();
        boolean bl2 = this.h != null;
        this.g = bl2;
        this.f = object.getNavigationIcon();
        object = X.s(object.getContext(), null, i.a, a.c, 0);
        this.o = object.f(i.j);
        if (bl) {
            Object object2 = object.n(i.p);
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                this.n((CharSequence)object2);
            }
            if (!TextUtils.isEmpty((CharSequence)(object2 = object.n(i.n)))) {
                this.m((CharSequence)object2);
            }
            if ((object2 = object.f(i.l)) != null) {
                this.i((Drawable)object2);
            }
            if ((object2 = object.f(i.k)) != null) {
                this.setIcon((Drawable)object2);
            }
            if (this.f == null && (object2 = this.o) != null) {
                this.l((Drawable)object2);
            }
            this.h(object.i(i.h, 0));
            n9 = object.l(i.g, 0);
            if (n9 != 0) {
                this.f(LayoutInflater.from((Context)this.a.getContext()).inflate(n9, (ViewGroup)this.a, false));
                this.h(this.b | 16);
            }
            if ((n9 = object.k(i.i, 0)) > 0) {
                object2 = this.a.getLayoutParams();
                object2.height = n9;
                this.a.setLayoutParams((ViewGroup.LayoutParams)object2);
            }
            n9 = object.d(i.f, -1);
            int n10 = object.d(i.e, -1);
            if (n9 >= 0 || n10 >= 0) {
                this.a.C(Math.max((int)n9, (int)0), Math.max((int)n10, (int)0));
            }
            if ((n9 = object.l(i.q, 0)) != 0) {
                object2 = this.a;
                object2.E(object2.getContext(), n9);
            }
            if ((n9 = object.l(i.o, 0)) != 0) {
                object2 = this.a;
                object2.D(object2.getContext(), n9);
            }
            if ((n9 = object.l(i.m, 0)) != 0) {
                this.a.setPopupTheme(n9);
            }
        } else {
            this.b = this.d();
        }
        object.t();
        this.g(n8);
        this.j = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new View.OnClickListener(){
            public final k.a o;
            {
                this.o = new k.a(d.this.a.getContext(), 0, 16908332, 0, 0, d.this.h);
            }

            public void onClick(View object) {
                object = d.this;
                Window.Callback callback = object.k;
                if (callback != null && object.l) {
                    callback.onMenuItemSelected(0, (MenuItem)this.o);
                }
            }
        });
    }

    @Override
    public void a(CharSequence charSequence) {
        if (!this.g) {
            this.o(charSequence);
        }
    }

    @Override
    public void b(Window.Callback callback) {
        this.k = callback;
    }

    @Override
    public void c(int n8) {
        Drawable drawable2 = n8 != 0 ? g.a.b(this.e(), n8) : null;
        this.i(drawable2);
    }

    public final int d() {
        if (this.a.getNavigationIcon() != null) {
            this.o = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public Context e() {
        return this.a.getContext();
    }

    public void f(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void g(int n8) {
        if (n8 == this.n) {
            return;
        }
        this.n = n8;
        if (TextUtils.isEmpty((CharSequence)this.a.getNavigationContentDescription())) {
            this.j(this.n);
        }
    }

    @Override
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void h(int n8) {
        int n9 = this.b ^ n8;
        this.b = n8;
        if (n9 != 0) {
            Toolbar toolbar;
            if ((n9 & 4) != 0) {
                if ((n8 & 4) != 0) {
                    this.p();
                }
                this.q();
            }
            if ((n9 & 3) != 0) {
                this.r();
            }
            if ((n9 & 8) != 0) {
                CharSequence charSequence;
                if ((n8 & 8) != 0) {
                    this.a.setTitle(this.h);
                    toolbar = this.a;
                    charSequence = this.i;
                } else {
                    toolbar = this.a;
                    charSequence = null;
                    toolbar.setTitle(null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((n9 & 16) != 0 && (toolbar = this.c) != null) {
                if ((n8 & 16) != 0) {
                    this.a.addView((View)toolbar);
                    return;
                }
                this.a.removeView((View)toolbar);
            }
        }
    }

    public void i(Drawable drawable2) {
        this.e = drawable2;
        this.r();
    }

    public void j(int n8) {
        String string2 = n8 == 0 ? null : this.e().getString(n8);
        this.k(string2);
    }

    public void k(CharSequence charSequence) {
        this.j = charSequence;
        this.p();
    }

    public void l(Drawable drawable2) {
        this.f = drawable2;
        this.q();
    }

    public void m(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.g = true;
        this.o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public final void p() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty((CharSequence)this.j)) {
                this.a.setNavigationContentDescription(this.n);
                return;
            }
            this.a.setNavigationContentDescription(this.j);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void q() {
        Toolbar toolbar;
        Drawable drawable2;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable2 = this.f;
            if (drawable2 == null) {
                drawable2 = this.o;
            }
        } else {
            toolbar = this.a;
            drawable2 = null;
        }
        toolbar.setNavigationIcon(drawable2);
    }

    public final void r() {
        Drawable drawable2;
        int n8 = this.b;
        if ((n8 & 2) != 0) {
            if ((n8 & 1) == 0 || (drawable2 = this.e) == null) {
                drawable2 = this.d;
            }
        } else {
            drawable2 = null;
        }
        this.a.setLogo(drawable2);
    }

    @Override
    public void setIcon(int n8) {
        Drawable drawable2 = n8 != 0 ? g.a.b(this.e(), n8) : null;
        this.setIcon(drawable2);
    }

    @Override
    public void setIcon(Drawable drawable2) {
        this.d = drawable2;
        this.r();
    }

}

