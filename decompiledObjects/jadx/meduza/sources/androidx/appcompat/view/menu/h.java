package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import e0.b;
import y.a;

/* loaded from: classes.dex */
public final class h implements z.b {
    public e0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f692b;

    /* renamed from: c, reason: collision with root package name */
    public final int f693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f694d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f695e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f696g;

    /* renamed from: h, reason: collision with root package name */
    public char f697h;

    /* renamed from: j, reason: collision with root package name */
    public char f699j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f701l;

    /* renamed from: n, reason: collision with root package name */
    public f f703n;

    /* renamed from: o, reason: collision with root package name */
    public m f704o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f705p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f706q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f707r;

    /* renamed from: y, reason: collision with root package name */
    public int f713y;

    /* renamed from: z, reason: collision with root package name */
    public View f714z;

    /* renamed from: i, reason: collision with root package name */
    public int f698i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f700k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f702m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f708s = null;
    public PorterDuff.Mode t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f709u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f710v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f711w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f712x = 16;
    public boolean C = false;

    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f703n = fVar;
        this.f691a = i11;
        this.f692b = i10;
        this.f693c = i12;
        this.f694d = i13;
        this.f695e = charSequence;
        this.f713y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // z.b
    public final z.b a(e0.b bVar) {
        e0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f3751a = null;
        }
        this.f714z = null;
        this.A = bVar;
        this.f703n.p(true);
        e0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // z.b
    public final e0.b b() {
        return this.A;
    }

    @Override // z.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f713y & 8) == 0) {
            return false;
        }
        if (this.f714z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f703n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f711w && (this.f709u || this.f710v)) {
            drawable = drawable.mutate();
            if (this.f709u) {
                a.C0261a.h(drawable, this.f708s);
            }
            if (this.f710v) {
                a.C0261a.i(drawable, this.t);
            }
            this.f711w = false;
        }
        return drawable;
    }

    public final boolean e() {
        e0.b bVar;
        if ((this.f713y & 8) == 0) {
            return false;
        }
        if (this.f714z == null && (bVar = this.A) != null) {
            this.f714z = bVar.d(this);
        }
        return this.f714z != null;
    }

    @Override // z.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f703n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f712x = z10 ? this.f712x | 32 : this.f712x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f714z;
        if (view != null) {
            return view;
        }
        e0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f714z = d10;
        return d10;
    }

    @Override // z.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f700k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f699j;
    }

    @Override // z.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f706q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f692b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f701l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f702m;
        if (i10 == 0) {
            return null;
        }
        Drawable X = x6.b.X(this.f703n.f665a, i10);
        this.f702m = 0;
        this.f701l = X;
        return d(X);
    }

    @Override // z.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f708s;
    }

    @Override // z.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f696g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f691a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f698i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f697h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f693c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f704o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f695e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f695e;
    }

    @Override // z.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f707r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f704o != null;
    }

    @Override // z.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f712x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f712x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f712x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        e0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f712x & 8) == 0 : (this.f712x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f703n.f665a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f714z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f691a) > 0) {
            inflate.setId(i11);
        }
        f fVar = this.f703n;
        fVar.f674k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f699j == c10) {
            return this;
        }
        this.f699j = Character.toLowerCase(c10);
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f699j == c10 && this.f700k == i10) {
            return this;
        }
        this.f699j = Character.toLowerCase(c10);
        this.f700k = KeyEvent.normalizeMetaState(i10);
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f712x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f712x = i11;
        if (i10 != i11) {
            this.f703n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f712x;
        if ((i10 & 4) != 0) {
            f fVar = this.f703n;
            fVar.getClass();
            int i11 = this.f692b;
            int size = fVar.f.size();
            fVar.w();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = fVar.f.get(i12);
                if (hVar.f692b == i11) {
                    if (((hVar.f712x & 4) != 0) && hVar.isCheckable()) {
                        boolean z11 = hVar == this;
                        int i13 = hVar.f712x;
                        int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                        hVar.f712x = i14;
                        if (i13 != i14) {
                            hVar.f703n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i15 = (z10 ? 2 : 0) | (i10 & (-3));
            this.f712x = i15;
            if (i10 != i15) {
                this.f703n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final z.b setContentDescription(CharSequence charSequence) {
        this.f706q = charSequence;
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f712x = z10 ? this.f712x | 16 : this.f712x & (-17);
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f701l = null;
        this.f702m = i10;
        this.f711w = true;
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f702m = 0;
        this.f701l = drawable;
        this.f711w = true;
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f708s = colorStateList;
        this.f709u = true;
        this.f711w = true;
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f710v = true;
        this.f711w = true;
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f696g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f697h == c10) {
            return this;
        }
        this.f697h = c10;
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f697h == c10 && this.f698i == i10) {
            return this;
        }
        this.f697h = c10;
        this.f698i = KeyEvent.normalizeMetaState(i10);
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f705p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f697h = c10;
        this.f699j = Character.toLowerCase(c11);
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f697h = c10;
        this.f698i = KeyEvent.normalizeMetaState(i10);
        this.f699j = Character.toLowerCase(c11);
        this.f700k = KeyEvent.normalizeMetaState(i11);
        this.f703n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f713y = i10;
        f fVar = this.f703n;
        fVar.f674k = true;
        fVar.p(true);
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f703n.f665a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f695e = charSequence;
        this.f703n.p(false);
        m mVar = this.f704o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public final z.b setTooltipText(CharSequence charSequence) {
        this.f707r = charSequence;
        this.f703n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f712x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f712x = i11;
        if (i10 != i11) {
            f fVar = this.f703n;
            fVar.f671h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f695e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f714z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f691a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f703n;
        fVar.f674k = true;
        fVar.p(true);
        return this;
    }
}
