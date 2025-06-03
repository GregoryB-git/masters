package androidx.appcompat.view.menu;

import I.AbstractC0405b;
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
import androidx.appcompat.view.menu.h;
import e.AbstractC1236g;
import g.AbstractC1294a;

/* loaded from: classes.dex */
public final class e implements C.b {

    /* renamed from: A, reason: collision with root package name */
    public View f8469A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f8470B;

    /* renamed from: D, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f8472D;

    /* renamed from: a, reason: collision with root package name */
    public final int f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8474b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8476d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8477e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8478f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f8479g;

    /* renamed from: h, reason: collision with root package name */
    public char f8480h;

    /* renamed from: j, reason: collision with root package name */
    public char f8482j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f8484l;

    /* renamed from: n, reason: collision with root package name */
    public d f8486n;

    /* renamed from: o, reason: collision with root package name */
    public j f8487o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f8488p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8489q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f8490r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f8491s;

    /* renamed from: z, reason: collision with root package name */
    public int f8498z;

    /* renamed from: i, reason: collision with root package name */
    public int f8481i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f8483k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f8485m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f8492t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f8493u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8494v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8495w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8496x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f8497y = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8471C = false;

    public e(d dVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f8486n = dVar;
        this.f8473a = i8;
        this.f8474b = i7;
        this.f8475c = i9;
        this.f8476d = i10;
        this.f8477e = charSequence;
        this.f8498z = i11;
    }

    public static void b(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public boolean A() {
        return (this.f8498z & 4) == 4;
    }

    public void a() {
        this.f8486n.E(this);
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.f8496x && (this.f8494v || this.f8495w)) {
            drawable = B.a.o(drawable).mutate();
            if (this.f8494v) {
                B.a.m(drawable, this.f8492t);
            }
            if (this.f8495w) {
                B.a.n(drawable, this.f8493u);
            }
            this.f8496x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f8498z & 8) == 0) {
            return false;
        }
        if (this.f8469A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8470B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8486n.e(this);
        }
        return false;
    }

    public int d() {
        return this.f8476d;
    }

    public char e() {
        return this.f8486n.C() ? this.f8482j : this.f8480h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8470B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8486n.j(this);
        }
        return false;
    }

    public String f() {
        int i7;
        char e7 = e();
        if (e7 == 0) {
            return "";
        }
        Resources resources = this.f8486n.s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f8486n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC1236g.f13462k));
        }
        int i8 = this.f8486n.C() ? this.f8483k : this.f8481i;
        b(sb, i8, 65536, resources.getString(AbstractC1236g.f13458g));
        b(sb, i8, 4096, resources.getString(AbstractC1236g.f13454c));
        b(sb, i8, 2, resources.getString(AbstractC1236g.f13453b));
        b(sb, i8, 1, resources.getString(AbstractC1236g.f13459h));
        b(sb, i8, 4, resources.getString(AbstractC1236g.f13461j));
        b(sb, i8, 8, resources.getString(AbstractC1236g.f13457f));
        if (e7 == '\b') {
            i7 = AbstractC1236g.f13455d;
        } else if (e7 == '\n') {
            i7 = AbstractC1236g.f13456e;
        } else {
            if (e7 != ' ') {
                sb.append(e7);
                return sb.toString();
            }
            i7 = AbstractC1236g.f13460i;
        }
        sb.append(resources.getString(i7));
        return sb.toString();
    }

    public AbstractC0405b g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f8469A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8483k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8482j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8490r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8474b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f8484l;
        if (drawable != null) {
            return c(drawable);
        }
        if (this.f8485m == 0) {
            return null;
        }
        Drawable b7 = AbstractC1294a.b(this.f8486n.s(), this.f8485m);
        this.f8485m = 0;
        this.f8484l = b7;
        return c(b7);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8492t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8493u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8479g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8473a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8472D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8481i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8480h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8475c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f8487o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8477e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8478f;
        return charSequence != null ? charSequence : this.f8477e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8491s;
    }

    public CharSequence h(h.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f8487o != null;
    }

    public boolean i() {
        return ((this.f8498z & 8) == 0 || this.f8469A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f8471C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8497y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8497y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8497y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8497y & 8) == 0;
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f8489q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.f8486n;
        if (dVar.g(dVar, this)) {
            return true;
        }
        Runnable runnable = this.f8488p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f8479g == null) {
            return false;
        }
        try {
            this.f8486n.s().startActivity(this.f8479g);
            return true;
        } catch (ActivityNotFoundException e7) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
            return false;
        }
    }

    public boolean k() {
        return (this.f8497y & 32) == 32;
    }

    public boolean l() {
        return (this.f8497y & 4) != 0;
    }

    public boolean m() {
        return (this.f8498z & 1) == 1;
    }

    public boolean n() {
        return (this.f8498z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C.b setActionView(int i7) {
        Context s7 = this.f8486n.s();
        setActionView(LayoutInflater.from(s7).inflate(i7, (ViewGroup) new LinearLayout(s7), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C.b setActionView(View view) {
        int i7;
        this.f8469A = view;
        if (view != null && view.getId() == -1 && (i7 = this.f8473a) > 0) {
            view.setId(i7);
        }
        this.f8486n.E(this);
        return this;
    }

    public void q(boolean z7) {
        this.f8471C = z7;
        this.f8486n.G(false);
    }

    public void r(boolean z7) {
        int i7 = this.f8497y;
        int i8 = (z7 ? 2 : 0) | (i7 & (-3));
        this.f8497y = i8;
        if (i7 != i8) {
            this.f8486n.G(false);
        }
    }

    public void s(boolean z7) {
        this.f8497y = (z7 ? 4 : 0) | (this.f8497y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        if (this.f8482j == c7) {
            return this;
        }
        this.f8482j = Character.toLowerCase(c7);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        int i7 = this.f8497y;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f8497y = i8;
        if (i7 != i8) {
            this.f8486n.G(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        if ((this.f8497y & 4) != 0) {
            this.f8486n.M(this);
        } else {
            r(z7);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public C.b setContentDescription(CharSequence charSequence) {
        this.f8490r = charSequence;
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f8497y = z7 ? this.f8497y | 16 : this.f8497y & (-17);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f8484l = null;
        this.f8485m = i7;
        this.f8496x = true;
        this.f8486n.G(false);
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8492t = colorStateList;
        this.f8494v = true;
        this.f8496x = true;
        this.f8486n.G(false);
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8493u = mode;
        this.f8495w = true;
        this.f8496x = true;
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8479g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        if (this.f8480h == c7) {
            return this;
        }
        this.f8480h = c7;
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8470B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8489q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f8480h = c7;
        this.f8482j = Character.toLowerCase(c8);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8498z = i7;
        this.f8486n.E(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f8486n.s().getString(i7));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8478f = charSequence;
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public C.b setTooltipText(CharSequence charSequence) {
        this.f8491s = charSequence;
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        if (x(z7)) {
            this.f8486n.F(this);
        }
        return this;
    }

    public void t(boolean z7) {
        this.f8497y = z7 ? this.f8497y | 32 : this.f8497y & (-33);
    }

    public String toString() {
        CharSequence charSequence = this.f8477e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f8472D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    public void w(j jVar) {
        this.f8487o = jVar;
        jVar.setHeaderTitle(getTitle());
    }

    public boolean x(boolean z7) {
        int i7 = this.f8497y;
        int i8 = (z7 ? 0 : 8) | (i7 & (-9));
        this.f8497y = i8;
        return i7 != i8;
    }

    public boolean y() {
        return this.f8486n.w();
    }

    public boolean z() {
        return this.f8486n.D() && e() != 0;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f8482j == c7 && this.f8483k == i7) {
            return this;
        }
        this.f8482j = Character.toLowerCase(c7);
        this.f8483k = KeyEvent.normalizeMetaState(i7);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8485m = 0;
        this.f8484l = drawable;
        this.f8496x = true;
        this.f8486n.G(false);
        return this;
    }

    @Override // C.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f8480h == c7 && this.f8481i == i7) {
            return this;
        }
        this.f8480h = c7;
        this.f8481i = KeyEvent.normalizeMetaState(i7);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f8480h = c7;
        this.f8481i = KeyEvent.normalizeMetaState(i7);
        this.f8482j = Character.toLowerCase(c8);
        this.f8483k = KeyEvent.normalizeMetaState(i8);
        this.f8486n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8477e = charSequence;
        this.f8486n.G(false);
        j jVar = this.f8487o;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }
}
