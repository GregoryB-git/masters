package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import b.a0;
import e0.d0;
import e0.i;
import e0.o0;
import e0.q0;
import g.u;
import j.a;
import j.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import l.f1;
import l.g0;

/* loaded from: classes.dex */
public final class g extends g.f implements f.a, LayoutInflater.Factory2 {

    /* renamed from: q0, reason: collision with root package name */
    public static final r.h<String, Integer> f5553q0 = new r.h<>();

    /* renamed from: r0, reason: collision with root package name */
    public static final int[] f5554r0 = {R.attr.windowBackground};

    /* renamed from: s0, reason: collision with root package name */
    public static final boolean f5555s0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: t0, reason: collision with root package name */
    public static final boolean f5556t0 = true;
    public d A;
    public q B;
    public j.a C;
    public ActionBarContextView D;
    public PopupWindow E;
    public g.j F;
    public boolean I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public p[] U;
    public p V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public Configuration f5557a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5558b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f5559c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f5560d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5561e0;

    /* renamed from: f0, reason: collision with root package name */
    public n f5562f0;

    /* renamed from: g0, reason: collision with root package name */
    public l f5563g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f5564h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f5565i0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f5567k0;

    /* renamed from: l0, reason: collision with root package name */
    public Rect f5568l0;

    /* renamed from: m0, reason: collision with root package name */
    public Rect f5569m0;

    /* renamed from: n0, reason: collision with root package name */
    public g.o f5570n0;

    /* renamed from: o0, reason: collision with root package name */
    public OnBackInvokedDispatcher f5571o0;

    /* renamed from: p0, reason: collision with root package name */
    public OnBackInvokedCallback f5572p0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5573r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f5574s;
    public Window t;

    /* renamed from: u, reason: collision with root package name */
    public k f5575u;

    /* renamed from: v, reason: collision with root package name */
    public final g.d f5576v;

    /* renamed from: w, reason: collision with root package name */
    public g.a f5577w;

    /* renamed from: x, reason: collision with root package name */
    public j.f f5578x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f5579y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f5580z;
    public o0 G = null;
    public boolean H = true;

    /* renamed from: j0, reason: collision with root package name */
    public final a f5566j0 = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if ((gVar.f5565i0 & 1) != 0) {
                gVar.M(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f5565i0 & 4096) != 0) {
                gVar2.M(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            g gVar3 = g.this;
            gVar3.f5564h0 = false;
            gVar3.f5565i0 = 0;
        }
    }

    public class b implements g.b {
    }

    public interface c {
    }

    public final class d implements j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            g.this.I(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback S = g.this.S();
            if (S == null) {
                return true;
            }
            S.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public class e implements a.InterfaceC0121a {

        /* renamed from: a, reason: collision with root package name */
        public a.InterfaceC0121a f5583a;

        public class a extends q0 {
            public a() {
                super(0);
            }

            @Override // e0.p0
            public final void c() {
                g.this.D.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.D.getParent() instanceof View) {
                    View view = (View) g.this.D.getParent();
                    WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                    d0.c.c(view);
                }
                g.this.D.h();
                g.this.G.d(null);
                g gVar2 = g.this;
                gVar2.G = null;
                ViewGroup viewGroup = gVar2.J;
                WeakHashMap<View, o0> weakHashMap2 = d0.f3766a;
                d0.c.c(viewGroup);
            }
        }

        public e(a.InterfaceC0121a interfaceC0121a) {
            this.f5583a = interfaceC0121a;
        }

        @Override // j.a.InterfaceC0121a
        public final boolean a(j.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f5583a.a(aVar, fVar);
        }

        @Override // j.a.InterfaceC0121a
        public final void b(j.a aVar) {
            this.f5583a.b(aVar);
            g gVar = g.this;
            if (gVar.E != null) {
                gVar.t.getDecorView().removeCallbacks(g.this.F);
            }
            g gVar2 = g.this;
            if (gVar2.D != null) {
                o0 o0Var = gVar2.G;
                if (o0Var != null) {
                    o0Var.b();
                }
                g gVar3 = g.this;
                o0 a10 = d0.a(gVar3.D);
                a10.a(0.0f);
                gVar3.G = a10;
                g.this.G.d(new a());
            }
            g gVar4 = g.this;
            g.d dVar = gVar4.f5576v;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(gVar4.C);
            }
            g gVar5 = g.this;
            gVar5.C = null;
            ViewGroup viewGroup = gVar5.J;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.c.c(viewGroup);
            g.this.a0();
        }

        @Override // j.a.InterfaceC0121a
        public final boolean c(j.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = g.this.J;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.c.c(viewGroup);
            return this.f5583a.c(aVar, fVar);
        }

        @Override // j.a.InterfaceC0121a
        public final boolean d(j.a aVar, MenuItem menuItem) {
            return this.f5583a.d(aVar, menuItem);
        }
    }

    public static class f {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: g.g$g, reason: collision with other inner class name */
    public static class C0089g {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class h {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static a0.i b(Configuration configuration) {
            return a0.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(a0.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.f7a.a()));
        }

        public static void d(Configuration configuration, a0.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.f7a.a()));
        }
    }

    public static class i {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode & 3;
            if (i10 != i11) {
                configuration3.colorMode |= i11;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode & 12;
            if (i12 != i13) {
                configuration3.colorMode |= i13;
            }
        }
    }

    public static class j {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: g.l
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    g.this.V();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class k extends j.h {

        /* renamed from: b, reason: collision with root package name */
        public c f5586b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5587c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5588d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5589e;

        public k(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f5587c = true;
                callback.onContentChanged();
            } finally {
                this.f5587c = false;
            }
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f5588d ? this.f8249a.dispatchKeyEvent(keyEvent) : g.this.L(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            if (r6 != false) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // j.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4d
                g.g r0 = g.g.this
                int r3 = r6.getKeyCode()
                r0.T()
                g.a r4 = r0.f5577w
                if (r4 == 0) goto L1c
                boolean r3 = r4.k(r3, r6)
                if (r3 == 0) goto L1c
                goto L48
            L1c:
                g.g$p r3 = r0.V
                if (r3 == 0) goto L31
                int r4 = r6.getKeyCode()
                boolean r3 = r0.X(r3, r4, r6)
                if (r3 == 0) goto L31
                g.g$p r6 = r0.V
                if (r6 == 0) goto L48
                r6.f5608l = r2
                goto L48
            L31:
                g.g$p r3 = r0.V
                if (r3 != 0) goto L4a
                g.g$p r3 = r0.R(r1)
                r0.Y(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.X(r3, r4, r6)
                r3.f5607k = r1
                if (r6 == 0) goto L4a
            L48:
                r6 = r2
                goto L4b
            L4a:
                r6 = r1
            L4b:
                if (r6 == 0) goto L4e
            L4d:
                r1 = r2
            L4e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.g.k.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f5587c) {
                this.f8249a.onContentChanged();
            }
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // j.h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            c cVar = this.f5586b;
            if (cVar != null) {
                View view = i10 == 0 ? new View(u.this.f5651a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.T();
                g.a aVar = gVar.f5577w;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                gVar.getClass();
            }
            return true;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f5589e) {
                this.f8249a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.T();
                g.a aVar = gVar.f5577w;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i10 != 0) {
                gVar.getClass();
                return;
            }
            p R = gVar.R(i10);
            if (R.f5609m) {
                gVar.J(R, false);
            }
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f687y = true;
            }
            c cVar = this.f5586b;
            if (cVar != null) {
                u.e eVar = (u.e) cVar;
                if (i10 == 0) {
                    u uVar = u.this;
                    if (!uVar.f5654d) {
                        uVar.f5651a.f923m = true;
                        uVar.f5654d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f687y = false;
            }
            return onPreparePanel;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = g.this.R(0).f5604h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // j.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            g gVar = g.this;
            if (!gVar.H || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            e.a aVar = new e.a(gVar.f5574s, callback);
            j.a D = g.this.D(aVar);
            if (D != null) {
                return aVar.e(D);
            }
            return null;
        }
    }

    public class l extends m {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f5590c;

        public l(Context context) {
            super();
            this.f5590c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // g.g.m
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // g.g.m
        public final int c() {
            return this.f5590c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // g.g.m
        public final void d() {
            g.this.E(true, true);
        }
    }

    public abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public a f5592a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                m.this.d();
            }
        }

        public m() {
        }

        public final void a() {
            a aVar = this.f5592a;
            if (aVar != null) {
                try {
                    g.this.f5574s.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f5592a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f5592a == null) {
                this.f5592a = new a();
            }
            g.this.f5574s.registerReceiver(this.f5592a, b10);
        }
    }

    public class n extends m {

        /* renamed from: c, reason: collision with root package name */
        public final w f5595c;

        public n(w wVar) {
            super();
            this.f5595c = wVar;
        }

        @Override // g.g.m
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // g.g.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.g.n.c():int");
        }

        @Override // g.g.m
        public final void d() {
            g.this.E(true, true);
        }
    }

    public class o extends ContentFrameLayout {
        public o(j.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.L(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    g gVar = g.this;
                    gVar.J(gVar.R(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(x6.b.X(getContext(), i10));
        }
    }

    public static final class p {

        /* renamed from: a, reason: collision with root package name */
        public int f5598a;

        /* renamed from: b, reason: collision with root package name */
        public int f5599b;

        /* renamed from: c, reason: collision with root package name */
        public int f5600c;

        /* renamed from: d, reason: collision with root package name */
        public int f5601d;

        /* renamed from: e, reason: collision with root package name */
        public o f5602e;
        public View f;

        /* renamed from: g, reason: collision with root package name */
        public View f5603g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f5604h;

        /* renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f5605i;

        /* renamed from: j, reason: collision with root package name */
        public j.c f5606j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f5607k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f5608l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f5609m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f5610n = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f5611o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f5612p;

        public p(int i10) {
            this.f5598a = i10;
        }
    }

    public final class q implements j.a {
        public q() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            p pVar;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i10 = 0;
            boolean z11 = k10 != fVar;
            g gVar = g.this;
            if (z11) {
                fVar = k10;
            }
            p[] pVarArr = gVar.U;
            int length = pVarArr != null ? pVarArr.length : 0;
            while (true) {
                if (i10 < length) {
                    pVar = pVarArr[i10];
                    if (pVar != null && pVar.f5604h == fVar) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                g gVar2 = g.this;
                if (!z11) {
                    gVar2.J(pVar, z10);
                } else {
                    gVar2.H(pVar.f5598a, pVar, k10);
                    g.this.J(pVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback S;
            if (fVar != fVar.k()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.O || (S = gVar.S()) == null || g.this.Z) {
                return true;
            }
            S.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public g(Context context, Window window, g.d dVar, Object obj) {
        r.h<String, Integer> hVar;
        Integer orDefault;
        g.c cVar;
        this.f5558b0 = -100;
        this.f5574s = context;
        this.f5576v = dVar;
        this.f5573r = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof g.c)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    cVar = (g.c) context;
                    break;
                }
            }
            cVar = null;
            if (cVar != null) {
                this.f5558b0 = cVar.getDelegate().h();
            }
        }
        if (this.f5558b0 == -100 && (orDefault = (hVar = f5553q0).getOrDefault(this.f5573r.getClass().getName(), null)) != null) {
            this.f5558b0 = orDefault.intValue();
            hVar.remove(this.f5573r.getClass().getName());
        }
        if (window != null) {
            F(window);
        }
        l.j.c();
    }

    public static a0.i G(Context context) {
        a0.i iVar;
        a0.i b10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (iVar = g.f.f5547c) == null) {
            return null;
        }
        a0.i Q = Q(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        if (i10 < 24) {
            b10 = iVar.d() ? a0.i.f6b : a0.i.b(iVar.c(0).toString());
        } else if (iVar.d()) {
            b10 = a0.i.f6b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < Q.f7a.size() + iVar.f7a.size()) {
                Locale c10 = i11 < iVar.f7a.size() ? iVar.c(i11) : Q.c(i11 - iVar.f7a.size());
                if (c10 != null) {
                    linkedHashSet.add(c10);
                }
                i11++;
            }
            b10 = a0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return b10.d() ? Q : b10;
    }

    public static Configuration K(Context context, int i10, a0.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                h.d(configuration2, iVar);
            } else {
                f.b(configuration2, iVar.c(0));
                f.a(configuration2, iVar.c(0));
            }
        }
        return configuration2;
    }

    public static a0.i Q(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? h.b(configuration) : a0.i.b(C0089g.a(configuration.locale));
    }

    @Override // g.f
    public final void A(Toolbar toolbar) {
        if (this.f5573r instanceof Activity) {
            T();
            g.a aVar = this.f5577w;
            if (aVar instanceof x) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f5578x = null;
            if (aVar != null) {
                aVar.j();
            }
            this.f5577w = null;
            if (toolbar != null) {
                Object obj = this.f5573r;
                u uVar = new u(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5579y, this.f5575u);
                this.f5577w = uVar;
                this.f5575u.f5586b = uVar.f5653c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f5575u.f5586b = null;
            }
            l();
        }
    }

    @Override // g.f
    public final void B(int i10) {
        this.f5559c0 = i10;
    }

    @Override // g.f
    public final void C(CharSequence charSequence) {
        this.f5579y = charSequence;
        g0 g0Var = this.f5580z;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
            return;
        }
        g.a aVar = this.f5577w;
        if (aVar != null) {
            aVar.s(charSequence);
            return;
        }
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        if (r8.isLaidOut() != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    @Override // g.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j.a D(j.a.InterfaceC0121a r8) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.D(j.a$a):j.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0217, code lost:
    
        if ((((b1.o) r0).getLifecycle().b().compareTo(b1.k.b.CREATED) >= 0) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0222, code lost:
    
        r0.onConfigurationChanged(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0220, code lost:
    
        if (r16.Z == false) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.E(boolean, boolean):boolean");
    }

    public final void F(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.t != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        k kVar = new k(callback);
        this.f5575u = kVar;
        window.setCallback(kVar);
        Context context = this.f5574s;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f5554r0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            l.j a10 = l.j.a();
            synchronized (a10) {
                drawable = a10.f9360a.g(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.t = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f5571o0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f5572p0) != null) {
            j.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5572p0 = null;
        }
        Object obj = this.f5573r;
        if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
            onBackInvokedDispatcher2 = j.a((Activity) this.f5573r);
        }
        this.f5571o0 = onBackInvokedDispatcher2;
        a0();
    }

    public final void H(int i10, p pVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (pVar == null && i10 >= 0) {
                p[] pVarArr = this.U;
                if (i10 < pVarArr.length) {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null) {
                fVar = pVar.f5604h;
            }
        }
        if ((pVar == null || pVar.f5609m) && !this.Z) {
            k kVar = this.f5575u;
            Window.Callback callback = this.t.getCallback();
            kVar.getClass();
            try {
                kVar.f5589e = true;
                callback.onPanelClosed(i10, fVar);
            } finally {
                kVar.f5589e = false;
            }
        }
    }

    public final void I(androidx.appcompat.view.menu.f fVar) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f5580z.i();
        Window.Callback S = S();
        if (S != null && !this.Z) {
            S.onPanelClosed(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
        }
        this.T = false;
    }

    public final void J(p pVar, boolean z10) {
        o oVar;
        g0 g0Var;
        if (z10 && pVar.f5598a == 0 && (g0Var = this.f5580z) != null && g0Var.a()) {
            I(pVar.f5604h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5574s.getSystemService("window");
        if (windowManager != null && pVar.f5609m && (oVar = pVar.f5602e) != null) {
            windowManager.removeView(oVar);
            if (z10) {
                H(pVar.f5598a, pVar, null);
            }
        }
        pVar.f5607k = false;
        pVar.f5608l = false;
        pVar.f5609m = false;
        pVar.f = null;
        pVar.f5610n = true;
        if (this.V == pVar) {
            this.V = null;
        }
        if (pVar.f5598a == 0) {
            a0();
        }
    }

    public final boolean L(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        Object obj = this.f5573r;
        if (((obj instanceof i.a) || (obj instanceof g.n)) && (decorView = this.t.getDecorView()) != null && e0.i.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            k kVar = this.f5575u;
            Window.Callback callback = this.t.getCallback();
            kVar.getClass();
            try {
                kVar.f5588d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                kVar.f5588d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.W = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                p R = R(0);
                if (R.f5609m) {
                    return true;
                }
                Y(R, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.C != null) {
                    return true;
                }
                p R2 = R(0);
                g0 g0Var = this.f5580z;
                if (g0Var == null || !g0Var.c() || ViewConfiguration.get(this.f5574s).hasPermanentMenuKey()) {
                    boolean z12 = R2.f5609m;
                    if (z12 || R2.f5608l) {
                        J(R2, true);
                        z10 = z12;
                    } else {
                        if (R2.f5607k) {
                            if (R2.f5611o) {
                                R2.f5607k = false;
                                z11 = Y(R2, keyEvent);
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                W(R2, keyEvent);
                                z10 = true;
                            }
                        }
                        z10 = false;
                    }
                } else if (this.f5580z.a()) {
                    z10 = this.f5580z.f();
                } else {
                    if (!this.Z && Y(R2, keyEvent)) {
                        z10 = this.f5580z.g();
                    }
                    z10 = false;
                }
                if (!z10) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.f5574s.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (V()) {
            return true;
        }
        return false;
    }

    public final void M(int i10) {
        p R = R(i10);
        if (R.f5604h != null) {
            Bundle bundle = new Bundle();
            R.f5604h.t(bundle);
            if (bundle.size() > 0) {
                R.f5612p = bundle;
            }
            R.f5604h.w();
            R.f5604h.clear();
        }
        R.f5611o = true;
        R.f5610n = true;
        if ((i10 == 108 || i10 == 0) && this.f5580z != null) {
            p R2 = R(0);
            R2.f5607k = false;
            Y(R2, null);
        }
    }

    public final void N() {
        ViewGroup viewGroup;
        if (this.I) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f5574s.obtainStyledAttributes(a0.f1581w);
        if (!obtainStyledAttributes.hasValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            w(1);
        } else if (obtainStyledAttributes.getBoolean(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowActionBar, false)) {
            w(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (obtainStyledAttributes.getBoolean(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            w(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (obtainStyledAttributes.getBoolean(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            w(10);
        }
        this.R = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        O();
        this.t.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f5574s);
        if (this.S) {
            viewGroup = (ViewGroup) from.inflate(this.Q ? io.meduza.meduza.R.layout.abc_screen_simple_overlay_action_mode : io.meduza.meduza.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.R) {
            viewGroup = (ViewGroup) from.inflate(io.meduza.meduza.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.P = false;
            this.O = false;
        } else if (this.O) {
            TypedValue typedValue = new TypedValue();
            this.f5574s.getTheme().resolveAttribute(io.meduza.meduza.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.c(this.f5574s, typedValue.resourceId) : this.f5574s).inflate(io.meduza.meduza.R.layout.abc_screen_toolbar, (ViewGroup) null);
            g0 g0Var = (g0) viewGroup.findViewById(io.meduza.meduza.R.id.decor_content_parent);
            this.f5580z = g0Var;
            g0Var.setWindowCallback(S());
            if (this.P) {
                this.f5580z.h(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.M) {
                this.f5580z.h(2);
            }
            if (this.N) {
                this.f5580z.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder l10 = defpackage.f.l("AppCompat does not support the current theme features: { windowActionBar: ");
            l10.append(this.O);
            l10.append(", windowActionBarOverlay: ");
            l10.append(this.P);
            l10.append(", android:windowIsFloating: ");
            l10.append(this.R);
            l10.append(", windowActionModeOverlay: ");
            l10.append(this.Q);
            l10.append(", windowNoTitle: ");
            l10.append(this.S);
            l10.append(" }");
            throw new IllegalArgumentException(l10.toString());
        }
        g.h hVar = new g.h(this);
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        d0.d.u(viewGroup, hVar);
        if (this.f5580z == null) {
            this.K = (TextView) viewGroup.findViewById(io.meduza.meduza.R.id.title);
        }
        Method method = f1.f9340a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            e = e11;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(io.meduza.meduza.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.t.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.t.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new g.i(this));
        this.J = viewGroup;
        Object obj = this.f5573r;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5579y;
        if (!TextUtils.isEmpty(title)) {
            g0 g0Var2 = this.f5580z;
            if (g0Var2 != null) {
                g0Var2.setWindowTitle(title);
            } else {
                g.a aVar = this.f5577w;
                if (aVar != null) {
                    aVar.s(title);
                } else {
                    TextView textView = this.K;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J.findViewById(R.id.content);
        View decorView = this.t.getDecorView();
        contentFrameLayout2.f801o.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, o0> weakHashMap2 = d0.f3766a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.f5574s.obtainStyledAttributes(a0.f1581w);
        obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes2.getValue(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.I = true;
        p R = R(0);
        if (this.Z || R.f5604h != null) {
            return;
        }
        this.f5565i0 |= 4096;
        if (this.f5564h0) {
            return;
        }
        this.t.getDecorView().postOnAnimation(this.f5566j0);
        this.f5564h0 = true;
    }

    public final void O() {
        if (this.t == null) {
            Object obj = this.f5573r;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final m P(Context context) {
        if (this.f5562f0 == null) {
            if (w.f5668d == null) {
                Context applicationContext = context.getApplicationContext();
                w.f5668d = new w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f5562f0 = new n(w.f5668d);
        }
        return this.f5562f0;
    }

    public final p R(int i10) {
        p[] pVarArr = this.U;
        if (pVarArr == null || pVarArr.length <= i10) {
            p[] pVarArr2 = new p[i10 + 1];
            if (pVarArr != null) {
                System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            }
            this.U = pVarArr2;
            pVarArr = pVarArr2;
        }
        p pVar = pVarArr[i10];
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(i10);
        pVarArr[i10] = pVar2;
        return pVar2;
    }

    public final Window.Callback S() {
        return this.t.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            r3 = this;
            r3.N()
            boolean r0 = r3.O
            if (r0 == 0) goto L37
            g.a r0 = r3.f5577w
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f5573r
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            g.x r0 = new g.x
            java.lang.Object r1 = r3.f5573r
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.P
            r0.<init>(r1, r2)
        L1d:
            r3.f5577w = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            g.x r0 = new g.x
            java.lang.Object r1 = r3.f5573r
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            g.a r0 = r3.f5577w
            if (r0 == 0) goto L37
            boolean r1 = r3.f5567k0
            r0.o(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.T():void");
    }

    public final int U(Context context, int i10) {
        m P;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.f5563g0 == null) {
                        this.f5563g0 = new l(context);
                    }
                    P = this.f5563g0;
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                P = P(context);
            }
            return P.c();
        }
        return i10;
    }

    public final boolean V() {
        boolean z10 = this.W;
        this.W = false;
        p R = R(0);
        if (R.f5609m) {
            if (!z10) {
                J(R, true);
            }
            return true;
        }
        j.a aVar = this.C;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        T();
        g.a aVar2 = this.f5577w;
        return aVar2 != null && aVar2.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
    
        if (r15.f.getCount() > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0151, code lost:
    
        if (r15 != null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(g.g.p r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.W(g.g$p, android.view.KeyEvent):void");
    }

    public final boolean X(p pVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pVar.f5607k || Y(pVar, keyEvent)) && (fVar = pVar.f5604h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean Y(p pVar, KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2;
        Resources.Theme theme;
        g0 g0Var3;
        g0 g0Var4;
        if (this.Z) {
            return false;
        }
        if (pVar.f5607k) {
            return true;
        }
        p pVar2 = this.V;
        if (pVar2 != null && pVar2 != pVar) {
            J(pVar2, false);
        }
        Window.Callback S = S();
        if (S != null) {
            pVar.f5603g = S.onCreatePanelView(pVar.f5598a);
        }
        int i10 = pVar.f5598a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (g0Var4 = this.f5580z) != null) {
            g0Var4.b();
        }
        if (pVar.f5603g == null && (!z10 || !(this.f5577w instanceof u))) {
            androidx.appcompat.view.menu.f fVar = pVar.f5604h;
            if (fVar == null || pVar.f5611o) {
                if (fVar == null) {
                    Context context = this.f5574s;
                    int i11 = pVar.f5598a;
                    if ((i11 == 0 || i11 == 108) && this.f5580z != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(io.meduza.meduza.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(io.meduza.meduza.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(io.meduza.meduza.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            j.c cVar = new j.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f669e = this;
                    androidx.appcompat.view.menu.f fVar3 = pVar.f5604h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(pVar.f5605i);
                        }
                        pVar.f5604h = fVar2;
                        androidx.appcompat.view.menu.d dVar = pVar.f5605i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f665a);
                        }
                    }
                    if (pVar.f5604h == null) {
                        return false;
                    }
                }
                if (z10 && (g0Var2 = this.f5580z) != null) {
                    if (this.A == null) {
                        this.A = new d();
                    }
                    g0Var2.d(pVar.f5604h, this.A);
                }
                pVar.f5604h.w();
                if (!S.onCreatePanelMenu(pVar.f5598a, pVar.f5604h)) {
                    androidx.appcompat.view.menu.f fVar4 = pVar.f5604h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(pVar.f5605i);
                        }
                        pVar.f5604h = null;
                    }
                    if (z10 && (g0Var = this.f5580z) != null) {
                        g0Var.d(null, this.A);
                    }
                    return false;
                }
                pVar.f5611o = false;
            }
            pVar.f5604h.w();
            Bundle bundle = pVar.f5612p;
            if (bundle != null) {
                pVar.f5604h.s(bundle);
                pVar.f5612p = null;
            }
            if (!S.onPreparePanel(0, pVar.f5603g, pVar.f5604h)) {
                if (z10 && (g0Var3 = this.f5580z) != null) {
                    g0Var3.d(null, this.A);
                }
                pVar.f5604h.v();
                return false;
            }
            pVar.f5604h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            pVar.f5604h.v();
        }
        pVar.f5607k = true;
        pVar.f5608l = false;
        this.V = pVar;
        return true;
    }

    public final void Z() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        int i11;
        p pVar;
        Window.Callback S = S();
        if (S != null && !this.Z) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            p[] pVarArr = this.U;
            if (pVarArr != null) {
                i10 = pVarArr.length;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    pVar = pVarArr[i11];
                    if (pVar != null && pVar.f5604h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return S.onMenuItemSelected(pVar.f5598a, menuItem);
            }
        }
        return false;
    }

    public final void a0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f5571o0 != null && (R(0).f5609m || this.C != null)) {
                z10 = true;
            }
            if (z10 && this.f5572p0 == null) {
                this.f5572p0 = j.b(this.f5571o0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f5572p0) == null) {
                    return;
                }
                j.c(this.f5571o0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        g0 g0Var = this.f5580z;
        if (g0Var == null || !g0Var.c() || (ViewConfiguration.get(this.f5574s).hasPermanentMenuKey() && !this.f5580z.e())) {
            p R = R(0);
            R.f5610n = true;
            J(R, false);
            W(R, null);
            return;
        }
        Window.Callback S = S();
        if (this.f5580z.a()) {
            this.f5580z.f();
            if (this.Z) {
                return;
            }
            S.onPanelClosed(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R(0).f5604h);
            return;
        }
        if (S == null || this.Z) {
            return;
        }
        if (this.f5564h0 && (1 & this.f5565i0) != 0) {
            this.t.getDecorView().removeCallbacks(this.f5566j0);
            this.f5566j0.run();
        }
        p R2 = R(0);
        androidx.appcompat.view.menu.f fVar2 = R2.f5604h;
        if (fVar2 == null || R2.f5611o || !S.onPreparePanel(0, R2.f5603g, fVar2)) {
            return;
        }
        S.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R2.f5604h);
        this.f5580z.g();
    }

    @Override // g.f
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.J.findViewById(R.id.content)).addView(view, layoutParams);
        this.f5575u.a(this.t.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d3  */
    @Override // g.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Context d(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.d(android.content.Context):android.content.Context");
    }

    @Override // g.f
    public final <T extends View> T e(int i10) {
        N();
        return (T) this.t.findViewById(i10);
    }

    @Override // g.f
    public final Context f() {
        return this.f5574s;
    }

    @Override // g.f
    public final b g() {
        return new b();
    }

    @Override // g.f
    public final int h() {
        return this.f5558b0;
    }

    @Override // g.f
    public final MenuInflater i() {
        if (this.f5578x == null) {
            T();
            g.a aVar = this.f5577w;
            this.f5578x = new j.f(aVar != null ? aVar.e() : this.f5574s);
        }
        return this.f5578x;
    }

    @Override // g.f
    public final g.a j() {
        T();
        return this.f5577w;
    }

    @Override // g.f
    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.f5574s);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.f
    public final void l() {
        if (this.f5577w != null) {
            T();
            if (this.f5577w.g()) {
                return;
            }
            this.f5565i0 |= 1;
            if (this.f5564h0) {
                return;
            }
            View decorView = this.t.getDecorView();
            a aVar = this.f5566j0;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            decorView.postOnAnimation(aVar);
            this.f5564h0 = true;
        }
    }

    @Override // g.f
    public final void n(Configuration configuration) {
        if (this.O && this.I) {
            T();
            g.a aVar = this.f5577w;
            if (aVar != null) {
                aVar.i();
            }
        }
        l.j a10 = l.j.a();
        Context context = this.f5574s;
        synchronized (a10) {
            l.q0 q0Var = a10.f9360a;
            synchronized (q0Var) {
                try {
                    r.e<WeakReference<Drawable.ConstantState>> eVar = q0Var.f9449d.get(context);
                    if (eVar != null) {
                        int i10 = eVar.f13479d;
                        Object[] objArr = eVar.f13478c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            objArr[i11] = null;
                        }
                        eVar.f13479d = 0;
                        eVar.f13476a = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f5557a0 = new Configuration(this.f5574s.getResources().getConfiguration());
        E(false, false);
    }

    @Override // g.f
    public final void o() {
        this.X = true;
        E(false, true);
        O();
        Object obj = this.f5573r;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = u.m.b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                g.a aVar = this.f5577w;
                if (aVar == null) {
                    this.f5567k0 = true;
                } else {
                    aVar.o(true);
                }
            }
            synchronized (g.f.f5551p) {
                g.f.v(this);
                g.f.f5550o.add(new WeakReference<>(this));
            }
        }
        this.f5557a0 = new Configuration(this.f5574s.getResources().getConfiguration());
        this.Y = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r10.equals("ImageButton") == false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // g.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5573r
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = g.f.f5551p
            monitor-enter(r0)
            g.f.v(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f5564h0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.t
            android.view.View r0 = r0.getDecorView()
            g.g$a r1 = r3.f5566j0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Z = r0
            int r0 = r3.f5558b0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f5573r
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            r.h<java.lang.String, java.lang.Integer> r0 = g.g.f5553q0
            java.lang.Object r1 = r3.f5573r
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f5558b0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            r.h<java.lang.String, java.lang.Integer> r0 = g.g.f5553q0
            java.lang.Object r1 = r3.f5573r
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            g.a r0 = r3.f5577w
            if (r0 == 0) goto L63
            r0.j()
        L63:
            g.g$n r0 = r3.f5562f0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            g.g$l r0 = r3.f5563g0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.p():void");
    }

    @Override // g.f
    public final void q() {
        N();
    }

    @Override // g.f
    public final void r() {
        T();
        g.a aVar = this.f5577w;
        if (aVar != null) {
            aVar.q(true);
        }
    }

    @Override // g.f
    public final void s() {
    }

    @Override // g.f
    public final void t() {
        E(true, false);
    }

    @Override // g.f
    public final void u() {
        T();
        g.a aVar = this.f5577w;
        if (aVar != null) {
            aVar.q(false);
        }
    }

    @Override // g.f
    public final boolean w(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.S && i10 == 108) {
            return false;
        }
        if (this.O && i10 == 1) {
            this.O = false;
        }
        if (i10 == 1) {
            Z();
            this.S = true;
            return true;
        }
        if (i10 == 2) {
            Z();
            this.M = true;
            return true;
        }
        if (i10 == 5) {
            Z();
            this.N = true;
            return true;
        }
        if (i10 == 10) {
            Z();
            this.Q = true;
            return true;
        }
        if (i10 == 108) {
            Z();
            this.O = true;
            return true;
        }
        if (i10 != 109) {
            return this.t.requestFeature(i10);
        }
        Z();
        this.P = true;
        return true;
    }

    @Override // g.f
    public final void x(int i10) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5574s).inflate(i10, viewGroup);
        this.f5575u.a(this.t.getCallback());
    }

    @Override // g.f
    public final void y(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5575u.a(this.t.getCallback());
    }

    @Override // g.f
    public final void z(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5575u.a(this.t.getCallback());
    }
}
