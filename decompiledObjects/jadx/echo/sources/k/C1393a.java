package k;

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
import x.AbstractC2112a;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1393a implements C.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f15485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15487c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f15488d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15489e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f15490f;

    /* renamed from: g, reason: collision with root package name */
    public char f15491g;

    /* renamed from: i, reason: collision with root package name */
    public char f15493i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f15495k;

    /* renamed from: l, reason: collision with root package name */
    public Context f15496l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f15497m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f15498n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f15499o;

    /* renamed from: h, reason: collision with root package name */
    public int f15492h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f15494j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f15500p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f15501q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15502r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15503s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f15504t = 16;

    public C1393a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f15496l = context;
        this.f15485a = i8;
        this.f15486b = i7;
        this.f15487c = i10;
        this.f15488d = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f15495k;
        if (drawable != null) {
            if (this.f15502r || this.f15503s) {
                Drawable o7 = B.a.o(drawable);
                this.f15495k = o7;
                Drawable mutate = o7.mutate();
                this.f15495k = mutate;
                if (this.f15502r) {
                    B.a.m(mutate, this.f15500p);
                }
                if (this.f15503s) {
                    B.a.n(this.f15495k, this.f15501q);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C.b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15494j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15493i;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15498n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15486b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15495k;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15500p;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15501q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15490f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15485a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15492h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15491g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15487c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15488d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15489e;
        return charSequence != null ? charSequence : this.f15488d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15499o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f15504t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f15504t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f15504t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f15504t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f15493i = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f15504t = (z7 ? 1 : 0) | (this.f15504t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f15504t = (z7 ? 2 : 0) | (this.f15504t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public C.b setContentDescription(CharSequence charSequence) {
        this.f15498n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f15504t = (z7 ? 16 : 0) | (this.f15504t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f15495k = AbstractC2112a.d(this.f15496l, i7);
        a();
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15500p = colorStateList;
        this.f15502r = true;
        a();
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15501q = mode;
        this.f15503s = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15490f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f15491g = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15497m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f15491g = c7;
        this.f15493i = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f15488d = this.f15496l.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15489e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public C.b setTooltipText(CharSequence charSequence) {
        this.f15499o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        this.f15504t = (this.f15504t & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f15493i = Character.toLowerCase(c7);
        this.f15494j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15495k = drawable;
        a();
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f15491g = c7;
        this.f15492h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f15491g = c7;
        this.f15492h = KeyEvent.normalizeMetaState(i7);
        this.f15493i = Character.toLowerCase(c8);
        this.f15494j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15488d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
    }
}
