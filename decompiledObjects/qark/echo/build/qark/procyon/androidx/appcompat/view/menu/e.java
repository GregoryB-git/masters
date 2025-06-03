// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.SubMenu;
import android.view.ActionProvider;
import android.content.res.Resources;
import e.g;
import android.view.ViewConfiguration;
import android.view.MenuItem;
import B.a;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.MenuItem$OnActionExpandListener;
import android.view.View;
import C.b;

public final class e implements b
{
    public View A;
    public MenuItem$OnActionExpandListener B;
    public boolean C;
    public ContextMenu$ContextMenuInfo D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public d n;
    public j o;
    public Runnable p;
    public MenuItem$OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public ColorStateList t;
    public PorterDuff$Mode u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    
    public e(final d n, final int b, final int a, final int c, final int d, final CharSequence e, final int z) {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 16;
        this.C = false;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.z = z;
    }
    
    public static void b(final StringBuilder sb, final int n, final int n2, final String str) {
        if ((n & n2) == n2) {
            sb.append(str);
        }
    }
    
    public boolean A() {
        return (this.z & 0x4) == 0x4;
    }
    
    public void a() {
        this.n.E(this);
    }
    
    public final Drawable c(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.x) {
                if (!this.v) {
                    mutate = drawable;
                    if (!this.w) {
                        return mutate;
                    }
                }
                mutate = B.a.o(drawable).mutate();
                if (this.v) {
                    B.a.m(mutate, this.t);
                }
                if (this.w) {
                    B.a.n(mutate, this.u);
                }
                this.x = false;
            }
        }
        return mutate;
    }
    
    public boolean collapseActionView() {
        if ((this.z & 0x8) == 0x0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionCollapse((MenuItem)this)) && this.n.e(this);
    }
    
    public int d() {
        return this.d;
    }
    
    public char e() {
        if (this.n.C()) {
            return this.j;
        }
        return this.h;
    }
    
    public boolean expandActionView() {
        if (!this.i()) {
            return false;
        }
        final MenuItem$OnActionExpandListener b = this.B;
        return (b == null || b.onMenuItemActionExpand((MenuItem)this)) && this.n.j(this);
    }
    
    public String f() {
        final char e = this.e();
        if (e == '\0') {
            return "";
        }
        final Resources resources = this.n.s().getResources();
        final StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(e.g.k));
        }
        int n;
        if (this.n.C()) {
            n = this.k;
        }
        else {
            n = this.i;
        }
        b(sb, n, 65536, resources.getString(e.g.g));
        b(sb, n, 4096, resources.getString(e.g.c));
        b(sb, n, 2, resources.getString(e.g.b));
        b(sb, n, 1, resources.getString(e.g.h));
        b(sb, n, 4, resources.getString(e.g.j));
        b(sb, n, 8, resources.getString(e.g.f));
        int n2;
        if (e != '\b') {
            if (e != '\n') {
                if (e != ' ') {
                    sb.append(e);
                    return sb.toString();
                }
                n2 = e.g.i;
            }
            else {
                n2 = e.g.e;
            }
        }
        else {
            n2 = e.g.d;
        }
        sb.append(resources.getString(n2));
        return sb.toString();
    }
    
    public I.b g() {
        return null;
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    public View getActionView() {
        final View a = this.A;
        if (a != null) {
            return a;
        }
        return null;
    }
    
    public int getAlphabeticModifiers() {
        return this.k;
    }
    
    public char getAlphabeticShortcut() {
        return this.j;
    }
    
    public CharSequence getContentDescription() {
        return this.r;
    }
    
    public int getGroupId() {
        return this.b;
    }
    
    public Drawable getIcon() {
        final Drawable l = this.l;
        if (l != null) {
            return this.c(l);
        }
        if (this.m != 0) {
            final Drawable b = g.a.b(this.n.s(), this.m);
            this.m = 0;
            this.l = b;
            return this.c(b);
        }
        return null;
    }
    
    public ColorStateList getIconTintList() {
        return this.t;
    }
    
    public PorterDuff$Mode getIconTintMode() {
        return this.u;
    }
    
    public Intent getIntent() {
        return this.g;
    }
    
    public int getItemId() {
        return this.a;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.D;
    }
    
    public int getNumericModifiers() {
        return this.i;
    }
    
    public char getNumericShortcut() {
        return this.h;
    }
    
    public int getOrder() {
        return this.c;
    }
    
    public SubMenu getSubMenu() {
        return (SubMenu)this.o;
    }
    
    public CharSequence getTitle() {
        return this.e;
    }
    
    public CharSequence getTitleCondensed() {
        final CharSequence f = this.f;
        if (f != null) {
            return f;
        }
        return this.e;
    }
    
    public CharSequence getTooltipText() {
        return this.s;
    }
    
    public CharSequence h(final h.a a) {
        if (a != null && a.a()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }
    
    public boolean hasSubMenu() {
        return this.o != null;
    }
    
    public boolean i() {
        final int z = this.z;
        boolean b = false;
        if ((z & 0x8) != 0x0) {
            b = b;
            if (this.A != null) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean isActionViewExpanded() {
        return this.C;
    }
    
    public boolean isCheckable() {
        return (this.y & 0x1) == 0x1;
    }
    
    public boolean isChecked() {
        return (this.y & 0x2) == 0x2;
    }
    
    public boolean isEnabled() {
        return (this.y & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        return (this.y & 0x8) == 0x0;
    }
    
    public boolean j() {
        final MenuItem$OnMenuItemClickListener q = this.q;
        if (q != null && q.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        final d n = this.n;
        if (n.g(n, (MenuItem)this)) {
            return true;
        }
        final Runnable p = this.p;
        if (p != null) {
            p.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.s().startActivity(this.g);
                return true;
            }
            catch (ActivityNotFoundException ex) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
            }
        }
        return false;
    }
    
    public boolean k() {
        return (this.y & 0x20) == 0x20;
    }
    
    public boolean l() {
        return (this.y & 0x4) != 0x0;
    }
    
    public boolean m() {
        return (this.z & 0x1) == 0x1;
    }
    
    public boolean n() {
        return (this.z & 0x2) == 0x2;
    }
    
    public b o(final int n) {
        final Context s = this.n.s();
        this.p(LayoutInflater.from(s).inflate(n, (ViewGroup)new LinearLayout(s), false));
        return this;
    }
    
    public b p(final View a) {
        this.A = a;
        if (a != null && a.getId() == -1) {
            final int a2 = this.a;
            if (a2 > 0) {
                a.setId(a2);
            }
        }
        this.n.E(this);
        return this;
    }
    
    public void q(final boolean c) {
        this.C = c;
        this.n.G(false);
    }
    
    public void r(final boolean b) {
        final int y = this.y;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        final int y2 = n | (y & 0xFFFFFFFD);
        this.y = y2;
        if (y != y2) {
            this.n.G(false);
        }
    }
    
    public void s(final boolean b) {
        final int y = this.y;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.y = (n | (y & 0xFFFFFFFB));
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public MenuItem setAlphabeticShortcut(final char ch) {
        if (this.j == ch) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(ch);
        this.n.G(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setAlphabeticShortcut(final char ch, final int n) {
        if (this.j == ch && this.k == n) {
            return (MenuItem)this;
        }
        this.j = Character.toLowerCase(ch);
        this.k = KeyEvent.normalizeMetaState(n);
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        final int y = this.y;
        final int y2 = (b ? 1 : 0) | (y & 0xFFFFFFFE);
        this.y = y2;
        if (y != y2) {
            this.n.G(false);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        if ((this.y & 0x4) != 0x0) {
            this.n.M((MenuItem)this);
            return (MenuItem)this;
        }
        this.r(b);
        return (MenuItem)this;
    }
    
    @Override
    public b setContentDescription(final CharSequence r) {
        this.r = r;
        this.n.G(false);
        return this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        int y;
        if (b) {
            y = (this.y | 0x10);
        }
        else {
            y = (this.y & 0xFFFFFFEF);
        }
        this.y = y;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int m) {
        this.l = null;
        this.m = m;
        this.x = true;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable l) {
        this.m = 0;
        this.l = l;
        this.x = true;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintList(final ColorStateList t) {
        this.t = t;
        this.v = true;
        this.x = true;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintMode(final PorterDuff$Mode u) {
        this.u = u;
        this.w = true;
        this.x = true;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char h) {
        if (this.h == h) {
            return (MenuItem)this;
        }
        this.h = h;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setNumericShortcut(final char h, final int n) {
        if (this.h == h && this.i == n) {
            return (MenuItem)this;
        }
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener b) {
        this.B = b;
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener q) {
        this.q = q;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char h, final char ch) {
        this.h = h;
        this.j = Character.toLowerCase(ch);
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char h, final char ch, final int n, final int n2) {
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        this.j = Character.toLowerCase(ch);
        this.k = KeyEvent.normalizeMetaState(n2);
        this.n.G(false);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int z) {
        final int n = z & 0x3;
        if (n != 0 && n != 1 && n != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = z;
        this.n.E(this);
    }
    
    public MenuItem setTitle(final int n) {
        return this.setTitle(this.n.s().getString(n));
    }
    
    public MenuItem setTitle(final CharSequence charSequence) {
        this.e = charSequence;
        this.n.G(false);
        final j o = this.o;
        if (o != null) {
            o.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence f) {
        this.f = f;
        this.n.G(false);
        return (MenuItem)this;
    }
    
    @Override
    public b setTooltipText(final CharSequence s) {
        this.s = s;
        this.n.G(false);
        return this;
    }
    
    public MenuItem setVisible(final boolean b) {
        if (this.x(b)) {
            this.n.F(this);
        }
        return (MenuItem)this;
    }
    
    public void t(final boolean b) {
        int y;
        if (b) {
            y = (this.y | 0x20);
        }
        else {
            y = (this.y & 0xFFFFFFDF);
        }
        this.y = y;
    }
    
    @Override
    public String toString() {
        final CharSequence e = this.e;
        if (e != null) {
            return e.toString();
        }
        return null;
    }
    
    public void u(final ContextMenu$ContextMenuInfo d) {
        this.D = d;
    }
    
    public b v(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
    
    public void w(final j o) {
        (this.o = o).setHeaderTitle(this.getTitle());
    }
    
    public boolean x(final boolean b) {
        final int y = this.y;
        final boolean b2 = false;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        final int y2 = n | (y & 0xFFFFFFF7);
        this.y = y2;
        boolean b3 = b2;
        if (y != y2) {
            b3 = true;
        }
        return b3;
    }
    
    public boolean y() {
        return this.n.w();
    }
    
    public boolean z() {
        return this.n.D() && this.e() != '\0';
    }
}
