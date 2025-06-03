/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.ActionProvider
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package androidx.appcompat.view.menu;

import B.a;
import C.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import e.g;

public final class e
implements b {
    public View A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i = 4096;
    public char j;
    public int k = 4096;
    public Drawable l;
    public int m = 0;
    public d n;
    public j o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public int z;

    public e(d d8, int n8, int n9, int n10, int n11, CharSequence charSequence, int n12) {
        this.n = d8;
        this.a = n9;
        this.b = n8;
        this.c = n10;
        this.d = n11;
        this.e = charSequence;
        this.z = n12;
    }

    public static void b(StringBuilder stringBuilder, int n8, int n9, String string2) {
        if ((n8 & n9) == n9) {
            stringBuilder.append(string2);
        }
    }

    public boolean A() {
        if ((this.z & 4) == 4) {
            return true;
        }
        return false;
    }

    public void a() {
        this.n.E(this);
    }

    public final Drawable c(Drawable drawable2) {
        Drawable drawable3;
        block5 : {
            block6 : {
                drawable3 = drawable2;
                if (drawable2 == null) break block5;
                drawable3 = drawable2;
                if (!this.x) break block5;
                if (this.v) break block6;
                drawable3 = drawable2;
                if (!this.w) break block5;
            }
            drawable3 = a.o(drawable2).mutate();
            if (this.v) {
                a.m(drawable3, this.t);
            }
            if (this.w) {
                a.n(drawable3, this.u);
            }
            this.x = false;
        }
        return drawable3;
    }

    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) {
            return false;
        }
        return this.n.e(this);
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
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) {
            return false;
        }
        return this.n.j(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String f() {
        char c8 = this.e();
        if (c8 == '\u0000') {
            return "";
        }
        Resources resources = this.n.s().getResources();
        StringBuilder stringBuilder = new StringBuilder();
        if (ViewConfiguration.get((Context)this.n.s()).hasPermanentMenuKey()) {
            stringBuilder.append(resources.getString(g.k));
        }
        int n8 = this.n.C() ? this.k : this.i;
        e.b(stringBuilder, n8, 65536, resources.getString(g.g));
        e.b(stringBuilder, n8, 4096, resources.getString(g.c));
        e.b(stringBuilder, n8, 2, resources.getString(g.b));
        e.b(stringBuilder, n8, 1, resources.getString(g.h));
        e.b(stringBuilder, n8, 4, resources.getString(g.j));
        e.b(stringBuilder, n8, 8, resources.getString(g.f));
        if (c8 != '\b') {
            if (c8 != '\n') {
                if (c8 != ' ') {
                    stringBuilder.append(c8);
                    return stringBuilder.toString();
                }
                n8 = g.i;
            } else {
                n8 = g.e;
            }
        } else {
            n8 = g.d;
        }
        stringBuilder.append(resources.getString(n8));
        return stringBuilder.toString();
    }

    public I.b g() {
        return null;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
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
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            return this.c(drawable2);
        }
        if (this.m != 0) {
            drawable2 = g.a.b(this.n.s(), this.m);
            this.m = 0;
            this.l = drawable2;
            return this.c(drawable2);
        }
        return null;
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.g;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
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
        return this.o;
    }

    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.e;
    }

    public CharSequence getTooltipText() {
        return this.s;
    }

    public CharSequence h(h.a a8) {
        if (a8 != null && a8.a()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }

    public boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        boolean bl;
        int n8 = this.z;
        boolean bl2 = bl = false;
        if ((n8 & 8) != 0) {
            bl2 = bl;
            if (this.A != null) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        if ((this.y & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.y & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.y & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.y & 8) == 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        Object object = this.q;
        if (object != null && object.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        object = this.n;
        if (object.g((d)object, this)) {
            return true;
        }
        object = this.p;
        if (object != null) {
            object.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.s().startActivity(this.g);
                return true;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                Log.e((String)"MenuItemImpl", (String)"Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
            }
        }
        return false;
    }

    public boolean k() {
        if ((this.y & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if ((this.y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((this.z & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.z & 2) == 2) {
            return true;
        }
        return false;
    }

    public b o(int n8) {
        Context context = this.n.s();
        this.p(LayoutInflater.from((Context)context).inflate(n8, (ViewGroup)new LinearLayout(context), false));
        return this;
    }

    public b p(View view) {
        int n8;
        this.A = view;
        if (view != null && view.getId() == -1 && (n8 = this.a) > 0) {
            view.setId(n8);
        }
        this.n.E(this);
        return this;
    }

    public void q(boolean bl) {
        this.C = bl;
        this.n.G(false);
    }

    public void r(boolean bl) {
        int n8 = this.y;
        int n9 = bl ? 2 : 0;
        this.y = n9 |= n8 & -3;
        if (n8 != n9) {
            this.n.G(false);
        }
    }

    public void s(boolean bl) {
        int n8 = this.y;
        int n9 = bl ? 4 : 0;
        this.y = n9 | n8 & -5;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.j == c8) {
            return this;
        }
        this.j = Character.toLowerCase((char)c8);
        this.n.G(false);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c8, int n8) {
        if (this.j == c8 && this.k == n8) {
            return this;
        }
        this.j = Character.toLowerCase((char)c8);
        this.k = KeyEvent.normalizeMetaState((int)n8);
        this.n.G(false);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        int n8;
        int n9 = this.y;
        this.y = n8 = bl | n9 & -2;
        if (n9 != n8) {
            this.n.G(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        if ((this.y & 4) != 0) {
            this.n.M(this);
            return this;
        }
        this.r(bl);
        return this;
    }

    @Override
    public b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.G(false);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem setEnabled(boolean bl) {
        int n8 = bl ? this.y | 16 : this.y & -17;
        this.y = n8;
        this.n.G(false);
        return this;
    }

    public MenuItem setIcon(int n8) {
        this.l = null;
        this.m = n8;
        this.x = true;
        this.n.G(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable2) {
        this.m = 0;
        this.l = drawable2;
        this.x = true;
        this.n.G(false);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.G(false);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.G(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c8) {
        if (this.h == c8) {
            return this;
        }
        this.h = c8;
        this.n.G(false);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c8, int n8) {
        if (this.h == c8 && this.i == n8) {
            return this;
        }
        this.h = c8;
        this.i = KeyEvent.normalizeMetaState((int)n8);
        this.n.G(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c8, char c9) {
        this.h = c8;
        this.j = Character.toLowerCase((char)c9);
        this.n.G(false);
        return this;
    }

    public MenuItem setShortcut(char c8, char c9, int n8, int n9) {
        this.h = c8;
        this.i = KeyEvent.normalizeMetaState((int)n8);
        this.j = Character.toLowerCase((char)c9);
        this.k = KeyEvent.normalizeMetaState((int)n9);
        this.n.G(false);
        return this;
    }

    public void setShowAsAction(int n8) {
        int n9 = n8 & 3;
        if (n9 != 0 && n9 != 1 && n9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = n8;
        this.n.E(this);
    }

    public MenuItem setTitle(int n8) {
        return this.setTitle(this.n.s().getString(n8));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.G(false);
        j j8 = this.o;
        if (j8 != null) {
            j8.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.G(false);
        return this;
    }

    @Override
    public b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.G(false);
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        if (this.x(bl)) {
            this.n.F(this);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void t(boolean bl) {
        int n8 = bl ? this.y | 32 : this.y & -33;
        this.y = n8;
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.D = contextMenuInfo;
    }

    public b v(int n8) {
        this.setShowAsAction(n8);
        return this;
    }

    public void w(j j8) {
        this.o = j8;
        j8.setHeaderTitle(this.getTitle());
    }

    public boolean x(boolean bl) {
        int n8 = this.y;
        boolean bl2 = false;
        int n9 = bl ? 0 : 8;
        this.y = n9 |= n8 & -9;
        bl = bl2;
        if (n8 != n9) {
            bl = true;
        }
        return bl;
    }

    public boolean y() {
        return this.n.w();
    }

    public boolean z() {
        if (this.n.D() && this.e() != '\u0000') {
            return true;
        }
        return false;
    }
}

