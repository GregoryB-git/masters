package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import y.a;

/* loaded from: classes.dex */
public final class a implements z.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8787a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f8788b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f8789c;

    /* renamed from: d, reason: collision with root package name */
    public char f8790d;
    public char f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f8793h;

    /* renamed from: i, reason: collision with root package name */
    public Context f8794i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f8795j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f8796k;

    /* renamed from: e, reason: collision with root package name */
    public int f8791e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f8792g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8797l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f8798m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8799n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8800o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f8801p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f8794i = context;
        this.f8787a = charSequence;
    }

    @Override // z.b
    public final z.b a(e0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b
    public final e0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f8793h;
        if (drawable != null) {
            if (this.f8799n || this.f8800o) {
                this.f8793h = drawable;
                Drawable mutate = drawable.mutate();
                this.f8793h = mutate;
                if (this.f8799n) {
                    a.C0261a.h(mutate, this.f8797l);
                }
                if (this.f8800o) {
                    a.C0261a.i(this.f8793h, this.f8798m);
                }
            }
        }
    }

    @Override // z.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8792g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // z.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8795j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f8793h;
    }

    @Override // z.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8797l;
    }

    @Override // z.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8798m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8789c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8791e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8790d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8787a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8788b;
        return charSequence != null ? charSequence : this.f8787a;
    }

    @Override // z.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8796k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8801p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8801p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8801p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8801p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f = Character.toLowerCase(c10);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f = Character.toLowerCase(c10);
        this.f8792g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f8801p = (z10 ? 1 : 0) | (this.f8801p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f8801p = (z10 ? 2 : 0) | (this.f8801p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8795j = charSequence;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final z.b setContentDescription(CharSequence charSequence) {
        this.f8795j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f8801p = (z10 ? 16 : 0) | (this.f8801p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f8793h = v.a.getDrawable(this.f8794i, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8793h = drawable;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8797l = colorStateList;
        this.f8799n = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8798m = mode;
        this.f8800o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8789c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f8790d = c10;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f8790d = c10;
        this.f8791e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f8790d = c10;
        this.f = Character.toLowerCase(c11);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f8790d = c10;
        this.f8791e = KeyEvent.normalizeMetaState(i10);
        this.f = Character.toLowerCase(c11);
        this.f8792g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f8787a = this.f8794i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8787a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8788b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8796k = charSequence;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final z.b setTooltipText(CharSequence charSequence) {
        this.f8796k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f8801p = (this.f8801p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
