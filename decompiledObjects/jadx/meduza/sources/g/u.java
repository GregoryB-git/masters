package g;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import e0.d0;
import e0.o0;
import g.a;
import g.g;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u extends g.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.d f5651a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f5652b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5653c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5655e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<a.b> f5656g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public final a f5657h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = u.this;
            Menu v10 = uVar.v();
            androidx.appcompat.view.menu.f fVar = v10 instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) v10 : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                v10.clear();
                if (!uVar.f5652b.onCreatePanelMenu(0, v10) || !uVar.f5652b.onPreparePanel(0, null, v10)) {
                    v10.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.v();
                }
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5660a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (this.f5660a) {
                return;
            }
            this.f5660a = true;
            u.this.f5651a.h();
            u.this.f5652b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            this.f5660a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            u.this.f5652b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (u.this.f5651a.a()) {
                u.this.f5652b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            } else if (u.this.f5652b.onPreparePanel(0, null, fVar)) {
                u.this.f5652b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            }
        }
    }

    public class e implements g.c {
        public e() {
        }
    }

    public u(Toolbar toolbar, CharSequence charSequence, g.k kVar) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(toolbar, false);
        this.f5651a = dVar;
        kVar.getClass();
        this.f5652b = kVar;
        dVar.f922l = kVar;
        toolbar.setOnMenuItemClickListener(bVar);
        dVar.setWindowTitle(charSequence);
        this.f5653c = new e();
    }

    @Override // g.a
    public final boolean a() {
        return this.f5651a.f();
    }

    @Override // g.a
    public final boolean b() {
        if (!this.f5651a.j()) {
            return false;
        }
        this.f5651a.collapseActionView();
        return true;
    }

    @Override // g.a
    public final void c(boolean z10) {
        if (z10 == this.f) {
            return;
        }
        this.f = z10;
        int size = this.f5656g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5656g.get(i10).a();
        }
    }

    @Override // g.a
    public final int d() {
        return this.f5651a.f913b;
    }

    @Override // g.a
    public final Context e() {
        return this.f5651a.getContext();
    }

    @Override // g.a
    public final void f() {
        this.f5651a.p(8);
    }

    @Override // g.a
    public final boolean g() {
        this.f5651a.f912a.removeCallbacks(this.f5657h);
        Toolbar toolbar = this.f5651a.f912a;
        a aVar = this.f5657h;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        toolbar.postOnAnimation(aVar);
        return true;
    }

    @Override // g.a
    public final boolean h() {
        return this.f5651a.f912a.getVisibility() == 0;
    }

    @Override // g.a
    public final void i() {
    }

    @Override // g.a
    public final void j() {
        this.f5651a.f912a.removeCallbacks(this.f5657h);
    }

    @Override // g.a
    public final boolean k(int i10, KeyEvent keyEvent) {
        Menu v10 = v();
        if (v10 == null) {
            return false;
        }
        v10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return v10.performShortcut(i10, keyEvent, 0);
    }

    @Override // g.a
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // g.a
    public final boolean m() {
        return this.f5651a.g();
    }

    @Override // g.a
    public final void n(ColorDrawable colorDrawable) {
        Toolbar toolbar = this.f5651a.f912a;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        toolbar.setBackground(colorDrawable);
    }

    @Override // g.a
    public final void o(boolean z10) {
    }

    @Override // g.a
    public final void p(boolean z10) {
        int i10 = z10 ? 8 : 0;
        androidx.appcompat.widget.d dVar = this.f5651a;
        dVar.k((i10 & 8) | (dVar.f913b & (-9)));
    }

    @Override // g.a
    public final void q(boolean z10) {
    }

    @Override // g.a
    public final void r(CharSequence charSequence) {
        this.f5651a.setTitle(charSequence);
    }

    @Override // g.a
    public final void s(CharSequence charSequence) {
        this.f5651a.setWindowTitle(charSequence);
    }

    @Override // g.a
    public final void t() {
        this.f5651a.p(0);
    }

    public final Menu v() {
        if (!this.f5655e) {
            androidx.appcompat.widget.d dVar = this.f5651a;
            c cVar = new c();
            d dVar2 = new d();
            Toolbar toolbar = dVar.f912a;
            toolbar.V = cVar;
            toolbar.W = dVar2;
            ActionMenuView actionMenuView = toolbar.f847a;
            if (actionMenuView != null) {
                actionMenuView.C = cVar;
                actionMenuView.D = dVar2;
            }
            this.f5655e = true;
        }
        return this.f5651a.f912a.getMenu();
    }
}
