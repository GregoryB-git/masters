// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k;

import android.view.MenuItem$OnActionExpandListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ActionProvider;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import C.b;

public class a implements b
{
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public Intent f;
    public char g;
    public int h;
    public char i;
    public int j;
    public Drawable k;
    public Context l;
    public MenuItem$OnMenuItemClickListener m;
    public CharSequence n;
    public CharSequence o;
    public ColorStateList p;
    public PorterDuff$Mode q;
    public boolean r;
    public boolean s;
    public int t;
    
    public a(final Context l, final int b, final int a, final int n, final int c, final CharSequence d) {
        this.h = 4096;
        this.j = 4096;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = false;
        this.t = 16;
        this.l = l;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final Drawable k = this.k;
        if (k != null && (this.r || this.s)) {
            final Drawable o = B.a.o(k);
            this.k = o;
            final Drawable mutate = o.mutate();
            this.k = mutate;
            if (this.r) {
                B.a.m(mutate, this.p);
            }
            if (this.s) {
                B.a.n(this.k, this.q);
            }
        }
    }
    
    public b b(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public b c(final View view) {
        throw new UnsupportedOperationException();
    }
    
    public boolean collapseActionView() {
        return false;
    }
    
    public b d(final int showAsAction) {
        this.setShowAsAction(showAsAction);
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
    
    public PorterDuff$Mode getIconTintMode() {
        return this.q;
    }
    
    public Intent getIntent() {
        return this.f;
    }
    
    public int getItemId() {
        return this.a;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
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
        final CharSequence e = this.e;
        if (e != null) {
            return e;
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
        return (this.t & 0x1) != 0x0;
    }
    
    public boolean isChecked() {
        return (this.t & 0x2) != 0x0;
    }
    
    public boolean isEnabled() {
        return (this.t & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        return (this.t & 0x8) == 0x0;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setAlphabeticShortcut(final char ch) {
        this.i = Character.toLowerCase(ch);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setAlphabeticShortcut(final char ch, final int n) {
        this.i = Character.toLowerCase(ch);
        this.j = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        this.t = ((b ? 1 : 0) | (this.t & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        final int t = this.t;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.t = (n | (t & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    @Override
    public b setContentDescription(final CharSequence n) {
        this.n = n;
        return this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        final int t = this.t;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.t = (n | (t & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int n) {
        this.k = x.a.d(this.l, n);
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable k) {
        this.k = k;
        this.a();
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintList(final ColorStateList p) {
        this.p = p;
        this.r = true;
        this.a();
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintMode(final PorterDuff$Mode q) {
        this.q = q;
        this.s = true;
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent f) {
        this.f = f;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setNumericShortcut(final char g, final int n) {
        this.g = g;
        this.h = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener m) {
        this.m = m;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char g, final char ch) {
        this.g = g;
        this.i = Character.toLowerCase(ch);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char g, final char ch, final int n, final int n2) {
        this.g = g;
        this.h = KeyEvent.normalizeMetaState(n);
        this.i = Character.toLowerCase(ch);
        this.j = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int n) {
    }
    
    public MenuItem setTitle(final int n) {
        this.d = this.l.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence d) {
        this.d = d;
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence e) {
        this.e = e;
        return (MenuItem)this;
    }
    
    @Override
    public b setTooltipText(final CharSequence o) {
        this.o = o;
        return this;
    }
    
    public MenuItem setVisible(final boolean b) {
        final int t = this.t;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.t = ((t & 0x8) | n);
        return (MenuItem)this;
    }
}
