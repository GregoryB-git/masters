/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package k;

import C.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a
implements b {
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public Intent f;
    public char g;
    public int h = 4096;
    public char i;
    public int j = 4096;
    public Drawable k;
    public Context l;
    public MenuItem.OnMenuItemClickListener m;
    public CharSequence n;
    public CharSequence o;
    public ColorStateList p = null;
    public PorterDuff.Mode q = null;
    public boolean r = false;
    public boolean s = false;
    public int t = 16;

    public a(Context context, int n8, int n9, int n10, int n11, CharSequence charSequence) {
        this.l = context;
        this.a = n9;
        this.b = n8;
        this.c = n11;
        this.d = charSequence;
    }

    public final void a() {
        Drawable drawable2 = this.k;
        if (drawable2 != null && (this.r || this.s)) {
            this.k = drawable2 = B.a.o(drawable2);
            this.k = drawable2 = drawable2.mutate();
            if (this.r) {
                B.a.m(drawable2, this.p);
            }
            if (this.s) {
                B.a.n(this.k, this.q);
            }
        }
    }

    public b b(int n8) {
        throw new UnsupportedOperationException();
    }

    public b c(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    public b d(int n8) {
        this.setShowAsAction(n8);
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    public CharSequence getContentDescription() {
        return this.n;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public ColorStateList getIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.q;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.h;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.d;
    }

    public CharSequence getTooltipText() {
        return this.o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.t & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c8) {
        this.i = Character.toLowerCase((char)c8);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c8, int n8) {
        this.i = Character.toLowerCase((char)c8);
        this.j = KeyEvent.normalizeMetaState((int)n8);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.t = bl | this.t & -2;
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        int n8 = this.t;
        int n9 = bl ? 2 : 0;
        this.t = n9 | n8 & -3;
        return this;
    }

    @Override
    public b setContentDescription(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        int n8 = this.t;
        int n9 = bl ? 16 : 0;
        this.t = n9 | n8 & -17;
        return this;
    }

    public MenuItem setIcon(int n8) {
        this.k = x.a.d(this.l, n8);
        this.a();
        return this;
    }

    public MenuItem setIcon(Drawable drawable2) {
        this.k = drawable2;
        this.a();
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        this.r = true;
        this.a();
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.q = mode;
        this.s = true;
        this.a();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c8) {
        this.g = c8;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c8, int n8) {
        this.g = c8;
        this.h = KeyEvent.normalizeMetaState((int)n8);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c8, char c9) {
        this.g = c8;
        this.i = Character.toLowerCase((char)c9);
        return this;
    }

    public MenuItem setShortcut(char c8, char c9, int n8, int n9) {
        this.g = c8;
        this.h = KeyEvent.normalizeMetaState((int)n8);
        this.i = Character.toLowerCase((char)c9);
        this.j = KeyEvent.normalizeMetaState((int)n9);
        return this;
    }

    public void setShowAsAction(int n8) {
    }

    public MenuItem setTitle(int n8) {
        this.d = this.l.getResources().getString(n8);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override
    public b setTooltipText(CharSequence charSequence) {
        this.o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        int n8 = this.t;
        int n9 = 8;
        if (bl) {
            n9 = 0;
        }
        this.t = n8 & 8 | n9;
        return this;
    }
}

