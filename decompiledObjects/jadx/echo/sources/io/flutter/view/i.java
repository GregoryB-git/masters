package io.flutter.view;

import D5.a;
import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final View f15169a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.a f15170b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f15171c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f15172d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.o f15173e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f15174f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f15175g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f15176h;

    /* renamed from: i, reason: collision with root package name */
    public l f15177i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f15178j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f15179k;

    /* renamed from: l, reason: collision with root package name */
    public int f15180l;

    /* renamed from: m, reason: collision with root package name */
    public l f15181m;

    /* renamed from: n, reason: collision with root package name */
    public l f15182n;

    /* renamed from: o, reason: collision with root package name */
    public l f15183o;

    /* renamed from: p, reason: collision with root package name */
    public final List f15184p;

    /* renamed from: q, reason: collision with root package name */
    public int f15185q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f15186r;

    /* renamed from: s, reason: collision with root package name */
    public k f15187s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15188t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15189u;

    /* renamed from: v, reason: collision with root package name */
    public final a.b f15190v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f15191w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f15192x;

    /* renamed from: y, reason: collision with root package name */
    public final ContentObserver f15193y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f15168z = ((g.SCROLL_RIGHT.f15232o | g.SCROLL_LEFT.f15232o) | g.SCROLL_UP.f15232o) | g.SCROLL_DOWN.f15232o;

    /* renamed from: A, reason: collision with root package name */
    public static final int f15165A = ((((((((((EnumC0222i.HAS_CHECKED_STATE.f15267o | EnumC0222i.IS_CHECKED.f15267o) | EnumC0222i.IS_SELECTED.f15267o) | EnumC0222i.IS_TEXT_FIELD.f15267o) | EnumC0222i.IS_FOCUSED.f15267o) | EnumC0222i.HAS_ENABLED_STATE.f15267o) | EnumC0222i.IS_ENABLED.f15267o) | EnumC0222i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f15267o) | EnumC0222i.HAS_TOGGLED_STATE.f15267o) | EnumC0222i.IS_TOGGLED.f15267o) | EnumC0222i.IS_FOCUSABLE.f15267o) | EnumC0222i.IS_SLIDER.f15267o;

    /* renamed from: B, reason: collision with root package name */
    public static int f15166B = 267386881;

    /* renamed from: C, reason: collision with root package name */
    public static int f15167C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f15232o & g.DID_LOSE_ACCESSIBILITY_FOCUS.f15232o) & g.SHOW_ON_SCREEN.f15232o;

    public class a implements a.b {
        public a() {
        }

        @Override // D5.a.b
        public void a(String str) {
            i.this.f15169a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            i.this.c0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            i.this.b0(byteBuffer, strArr);
        }

        @Override // D5.a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent H6 = i.this.H(0, 32);
            H6.getText().add(str);
            i.this.T(H6);
        }

        @Override // D5.a.b
        public void e(int i7) {
            i.this.S(i7, 8);
        }

        @Override // D5.a.b
        public void f(int i7) {
            i.this.S(i7, 2);
        }

        @Override // D5.a.b
        public void g(int i7) {
            i.this.S(i7, 1);
        }
    }

    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z7) {
            if (i.this.f15189u) {
                return;
            }
            i iVar = i.this;
            if (z7) {
                iVar.f15170b.g(i.this.f15190v);
                i.this.f15170b.e();
            } else {
                iVar.X(false);
                i.this.f15170b.g(null);
                i.this.f15170b.d();
            }
            if (i.this.f15187s != null) {
                i.this.f15187s.a(z7, i.this.f15171c.isTouchExplorationEnabled());
            }
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            onChange(z7, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7, Uri uri) {
            if (i.this.f15189u) {
                return;
            }
            String string = Settings.Global.getString(i.this.f15174f, "transition_animation_scale");
            if (string == null || !string.equals("0")) {
                i.e(i.this, ~f.DISABLE_ANIMATIONS.f15208o);
            } else {
                i.f(i.this, f.DISABLE_ANIMATIONS.f15208o);
            }
            i.this.U();
        }
    }

    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f15197a;

        public d(AccessibilityManager accessibilityManager) {
            this.f15197a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z7) {
            if (i.this.f15189u) {
                return;
            }
            if (!z7) {
                i.this.X(false);
                i.this.M();
            }
            if (i.this.f15187s != null) {
                i.this.f15187s.a(this.f15197a.isEnabled(), z7);
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15199a;

        static {
            int[] iArr = new int[o.values().length];
            f15199a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15199a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: o, reason: collision with root package name */
        public final int f15208o;

        f(int i7) {
            this.f15208o = i7;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* renamed from: o, reason: collision with root package name */
        public final int f15232o;

        g(int i7) {
            this.f15232o = i7;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f15233a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f15234b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f15235c = -1;

        /* renamed from: d, reason: collision with root package name */
        public String f15236d;

        /* renamed from: e, reason: collision with root package name */
        public String f15237e;
    }

    /* renamed from: io.flutter.view.i$i, reason: collision with other inner class name */
    public enum EnumC0222i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* renamed from: o, reason: collision with root package name */
        public final int f15267o;

        EnumC0222i(int i7) {
            this.f15267o = i7;
        }
    }

    public static class j extends n {

        /* renamed from: d, reason: collision with root package name */
        public String f15268d;

        public j() {
            super(null);
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z7, boolean z8);
    }

    public static class l {

        /* renamed from: B, reason: collision with root package name */
        public p f15270B;

        /* renamed from: D, reason: collision with root package name */
        public int f15272D;

        /* renamed from: E, reason: collision with root package name */
        public int f15273E;

        /* renamed from: F, reason: collision with root package name */
        public int f15274F;

        /* renamed from: G, reason: collision with root package name */
        public int f15275G;

        /* renamed from: H, reason: collision with root package name */
        public float f15276H;

        /* renamed from: I, reason: collision with root package name */
        public float f15277I;

        /* renamed from: J, reason: collision with root package name */
        public float f15278J;

        /* renamed from: K, reason: collision with root package name */
        public String f15279K;

        /* renamed from: L, reason: collision with root package name */
        public String f15280L;

        /* renamed from: M, reason: collision with root package name */
        public float f15281M;

        /* renamed from: N, reason: collision with root package name */
        public float f15282N;

        /* renamed from: O, reason: collision with root package name */
        public float f15283O;

        /* renamed from: P, reason: collision with root package name */
        public float f15284P;

        /* renamed from: Q, reason: collision with root package name */
        public float[] f15285Q;

        /* renamed from: R, reason: collision with root package name */
        public l f15286R;

        /* renamed from: U, reason: collision with root package name */
        public List f15289U;

        /* renamed from: V, reason: collision with root package name */
        public h f15290V;

        /* renamed from: W, reason: collision with root package name */
        public h f15291W;

        /* renamed from: Y, reason: collision with root package name */
        public float[] f15293Y;

        /* renamed from: a, reason: collision with root package name */
        public final i f15295a;

        /* renamed from: a0, reason: collision with root package name */
        public float[] f15296a0;

        /* renamed from: b0, reason: collision with root package name */
        public Rect f15298b0;

        /* renamed from: c, reason: collision with root package name */
        public int f15299c;

        /* renamed from: d, reason: collision with root package name */
        public int f15300d;

        /* renamed from: e, reason: collision with root package name */
        public int f15301e;

        /* renamed from: f, reason: collision with root package name */
        public int f15302f;

        /* renamed from: g, reason: collision with root package name */
        public int f15303g;

        /* renamed from: h, reason: collision with root package name */
        public int f15304h;

        /* renamed from: i, reason: collision with root package name */
        public int f15305i;

        /* renamed from: j, reason: collision with root package name */
        public int f15306j;

        /* renamed from: k, reason: collision with root package name */
        public int f15307k;

        /* renamed from: l, reason: collision with root package name */
        public float f15308l;

        /* renamed from: m, reason: collision with root package name */
        public float f15309m;

        /* renamed from: n, reason: collision with root package name */
        public float f15310n;

        /* renamed from: o, reason: collision with root package name */
        public String f15311o;

        /* renamed from: p, reason: collision with root package name */
        public String f15312p;

        /* renamed from: q, reason: collision with root package name */
        public List f15313q;

        /* renamed from: r, reason: collision with root package name */
        public String f15314r;

        /* renamed from: s, reason: collision with root package name */
        public List f15315s;

        /* renamed from: t, reason: collision with root package name */
        public String f15316t;

        /* renamed from: u, reason: collision with root package name */
        public List f15317u;

        /* renamed from: v, reason: collision with root package name */
        public String f15318v;

        /* renamed from: w, reason: collision with root package name */
        public List f15319w;

        /* renamed from: x, reason: collision with root package name */
        public String f15320x;

        /* renamed from: y, reason: collision with root package name */
        public List f15321y;

        /* renamed from: z, reason: collision with root package name */
        public String f15322z;

        /* renamed from: b, reason: collision with root package name */
        public int f15297b = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f15269A = -1;

        /* renamed from: C, reason: collision with root package name */
        public boolean f15271C = false;

        /* renamed from: S, reason: collision with root package name */
        public List f15287S = new ArrayList();

        /* renamed from: T, reason: collision with root package name */
        public List f15288T = new ArrayList();

        /* renamed from: X, reason: collision with root package name */
        public boolean f15292X = true;

        /* renamed from: Z, reason: collision with root package name */
        public boolean f15294Z = true;

        public l(i iVar) {
            this.f15295a = iVar;
        }

        public static boolean C0(l lVar, T5.e eVar) {
            return (lVar == null || lVar.l0(eVar) == null) ? false : true;
        }

        public static /* synthetic */ int n(l lVar, int i7) {
            int i8 = lVar.f15304h + i7;
            lVar.f15304h = i8;
            return i8;
        }

        public static /* synthetic */ int o(l lVar, int i7) {
            int i8 = lVar.f15304h - i7;
            lVar.f15304h = i8;
            return i8;
        }

        public final float A0(float f7, float f8, float f9, float f10) {
            return Math.max(f7, Math.max(f8, Math.max(f9, f10)));
        }

        public final float B0(float f7, float f8, float f9, float f10) {
            return Math.min(f7, Math.min(f8, Math.min(f9, f10)));
        }

        public final void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f7 = fArr[3];
            fArr[0] = fArr[0] / f7;
            fArr[1] = fArr[1] / f7;
            fArr[2] = fArr[2] / f7;
            fArr[3] = 0.0f;
        }

        public final void E0(float[] fArr, Set set, boolean z7) {
            set.add(this);
            if (this.f15294Z) {
                z7 = true;
            }
            if (z7) {
                if (this.f15296a0 == null) {
                    this.f15296a0 = new float[16];
                }
                if (this.f15285Q == null) {
                    this.f15285Q = new float[16];
                }
                Matrix.multiplyMM(this.f15296a0, 0, fArr, 0, this.f15285Q, 0);
                float[] fArr2 = new float[4];
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = {this.f15281M, this.f15282N, 0.0f, 1.0f};
                D0(fArr2, this.f15296a0, fArr6);
                fArr6[0] = this.f15283O;
                fArr6[1] = this.f15282N;
                D0(fArr3, this.f15296a0, fArr6);
                fArr6[0] = this.f15283O;
                fArr6[1] = this.f15284P;
                D0(fArr4, this.f15296a0, fArr6);
                fArr6[0] = this.f15281M;
                fArr6[1] = this.f15284P;
                D0(fArr5, this.f15296a0, fArr6);
                if (this.f15298b0 == null) {
                    this.f15298b0 = new Rect();
                }
                this.f15298b0.set(Math.round(B0(fArr2[0], fArr3[0], fArr4[0], fArr5[0])), Math.round(B0(fArr2[1], fArr3[1], fArr4[1], fArr5[1])), Math.round(A0(fArr2[0], fArr3[0], fArr4[0], fArr5[0])), Math.round(A0(fArr2[1], fArr3[1], fArr4[1], fArr5[1])));
                this.f15294Z = false;
            }
            int i7 = -1;
            for (l lVar : this.f15287S) {
                lVar.f15269A = i7;
                i7 = lVar.f15297b;
                lVar.E0(this.f15296a0, set, z7);
            }
        }

        public final void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f15271C = true;
            this.f15279K = this.f15314r;
            this.f15280L = this.f15312p;
            this.f15272D = this.f15299c;
            this.f15273E = this.f15300d;
            this.f15274F = this.f15303g;
            this.f15275G = this.f15304h;
            this.f15276H = this.f15308l;
            this.f15277I = this.f15309m;
            this.f15278J = this.f15310n;
            this.f15299c = byteBuffer.getInt();
            this.f15300d = byteBuffer.getInt();
            this.f15301e = byteBuffer.getInt();
            this.f15302f = byteBuffer.getInt();
            this.f15303g = byteBuffer.getInt();
            this.f15304h = byteBuffer.getInt();
            this.f15305i = byteBuffer.getInt();
            this.f15306j = byteBuffer.getInt();
            this.f15307k = byteBuffer.getInt();
            this.f15308l = byteBuffer.getFloat();
            this.f15309m = byteBuffer.getFloat();
            this.f15310n = byteBuffer.getFloat();
            int i7 = byteBuffer.getInt();
            this.f15311o = i7 == -1 ? null : strArr[i7];
            int i8 = byteBuffer.getInt();
            this.f15312p = i8 == -1 ? null : strArr[i8];
            this.f15313q = q0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f15314r = i9 == -1 ? null : strArr[i9];
            this.f15315s = q0(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            this.f15316t = i10 == -1 ? null : strArr[i10];
            this.f15317u = q0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f15318v = i11 == -1 ? null : strArr[i11];
            this.f15319w = q0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f15320x = i12 == -1 ? null : strArr[i12];
            this.f15321y = q0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f15322z = i13 == -1 ? null : strArr[i13];
            this.f15270B = p.e(byteBuffer.getInt());
            this.f15281M = byteBuffer.getFloat();
            this.f15282N = byteBuffer.getFloat();
            this.f15283O = byteBuffer.getFloat();
            this.f15284P = byteBuffer.getFloat();
            if (this.f15285Q == null) {
                this.f15285Q = new float[16];
            }
            for (int i14 = 0; i14 < 16; i14++) {
                this.f15285Q[i14] = byteBuffer.getFloat();
            }
            this.f15292X = true;
            this.f15294Z = true;
            int i15 = byteBuffer.getInt();
            this.f15287S.clear();
            this.f15288T.clear();
            for (int i16 = 0; i16 < i15; i16++) {
                l y7 = this.f15295a.y(byteBuffer.getInt());
                y7.f15286R = this;
                this.f15287S.add(y7);
            }
            for (int i17 = 0; i17 < i15; i17++) {
                l y8 = this.f15295a.y(byteBuffer.getInt());
                y8.f15286R = this;
                this.f15288T.add(y8);
            }
            int i18 = byteBuffer.getInt();
            if (i18 == 0) {
                this.f15289U = null;
                return;
            }
            List list = this.f15289U;
            if (list == null) {
                this.f15289U = new ArrayList(i18);
            } else {
                list.clear();
            }
            for (int i19 = 0; i19 < i18; i19++) {
                h x7 = this.f15295a.x(byteBuffer.getInt());
                if (x7.f15235c == g.TAP.f15232o) {
                    this.f15290V = x7;
                } else if (x7.f15235c == g.LONG_PRESS.f15232o) {
                    this.f15291W = x7;
                } else {
                    this.f15289U.add(x7);
                }
                this.f15289U.add(x7);
            }
        }

        public final void g0(List list) {
            if (x0(EnumC0222i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.f15287S.iterator();
            while (it.hasNext()) {
                ((l) it.next()).g0(list);
            }
        }

        public final SpannableString h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i7 = e.f15199a[nVar.f15325c.ordinal()];
                    if (i7 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f15323a, nVar.f15324b, 0);
                    } else if (i7 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f15268d)), nVar.f15323a, nVar.f15324b, 0);
                    }
                }
            }
            return spannableString;
        }

        public final boolean i0() {
            String str;
            String str2 = this.f15312p;
            if (str2 == null && this.f15280L == null) {
                return false;
            }
            return str2 == null || (str = this.f15280L) == null || !str2.equals(str);
        }

        public final boolean j0() {
            return (Float.isNaN(this.f15308l) || Float.isNaN(this.f15276H) || this.f15276H == this.f15308l) ? false : true;
        }

        public final void k0() {
            if (this.f15292X) {
                this.f15292X = false;
                if (this.f15293Y == null) {
                    this.f15293Y = new float[16];
                }
                if (Matrix.invertM(this.f15293Y, 0, this.f15285Q, 0)) {
                    return;
                }
                Arrays.fill(this.f15293Y, 0.0f);
            }
        }

        public final l l0(T5.e eVar) {
            for (l lVar = this.f15286R; lVar != null; lVar = lVar.f15286R) {
                if (eVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        public final Rect m0() {
            return this.f15298b0;
        }

        public final CharSequence n0() {
            return h0(this.f15320x, this.f15321y);
        }

        public final CharSequence o0() {
            return h0(this.f15312p, this.f15313q);
        }

        public final String p0() {
            String str;
            if (x0(EnumC0222i.NAMES_ROUTE) && (str = this.f15312p) != null && !str.isEmpty()) {
                return this.f15312p;
            }
            Iterator it = this.f15287S.iterator();
            while (it.hasNext()) {
                String p02 = ((l) it.next()).p0();
                if (p02 != null && !p02.isEmpty()) {
                    return p02;
                }
            }
            return null;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i7 = byteBuffer.getInt();
            a aVar = null;
            if (i7 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i11 = e.f15199a[oVar.ordinal()];
                if (i11 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f15323a = i9;
                    mVar.f15324b = i10;
                    mVar.f15325c = oVar;
                    arrayList.add(mVar);
                } else if (i11 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f15323a = i9;
                    jVar.f15324b = i10;
                    jVar.f15325c = oVar;
                    jVar.f15268d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i7 = 0; i7 < 2; i7++) {
                CharSequence charSequence2 = charSequenceArr[i7];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final CharSequence s0() {
            return h0(this.f15314r, this.f15315s);
        }

        public final CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i7 = 0; i7 < 3; i7++) {
                CharSequence charSequence2 = charSequenceArr[i7];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final boolean u0(g gVar) {
            return (gVar.f15232o & this.f15273E) != 0;
        }

        public final boolean v0(EnumC0222i enumC0222i) {
            return (enumC0222i.f15267o & this.f15272D) != 0;
        }

        public final boolean w0(g gVar) {
            return (gVar.f15232o & this.f15300d) != 0;
        }

        public final boolean x0(EnumC0222i enumC0222i) {
            return (enumC0222i.f15267o & this.f15299c) != 0;
        }

        public final l y0(float[] fArr, boolean z7) {
            float f7 = fArr[3];
            boolean z8 = false;
            float f8 = fArr[0] / f7;
            float f9 = fArr[1] / f7;
            if (f8 < this.f15281M || f8 >= this.f15283O || f9 < this.f15282N || f9 >= this.f15284P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.f15288T) {
                if (!lVar.x0(EnumC0222i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.f15293Y, 0, fArr, 0);
                    l y02 = lVar.y0(fArr2, z7);
                    if (y02 != null) {
                        return y02;
                    }
                }
            }
            if (z7 && this.f15305i != -1) {
                z8 = true;
            }
            if (z0() || z8) {
                return this;
            }
            return null;
        }

        public final boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(EnumC0222i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(EnumC0222i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f15300d & (~i.f15168z)) == 0 && (this.f15299c & i.f15165A) == 0 && ((str = this.f15312p) == null || str.isEmpty()) && (((str2 = this.f15314r) == null || str2.isEmpty()) && ((str3 = this.f15320x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    public static class m extends n {
        public m() {
            super(null);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public int f15323a;

        /* renamed from: b, reason: collision with root package name */
        public int f15324b;

        /* renamed from: c, reason: collision with root package name */
        public o f15325c;

        public n() {
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public enum o {
        SPELLOUT,
        LOCALE
    }

    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p e(int i7) {
            return i7 != 1 ? i7 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public i(View view, D5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), oVar);
    }

    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    public static /* synthetic */ boolean F(l lVar) {
        return lVar.x0(EnumC0222i.HAS_IMPLICIT_SCROLLING);
    }

    public static /* synthetic */ int e(i iVar, int i7) {
        int i8 = i7 & iVar.f15180l;
        iVar.f15180l = i8;
        return i8;
    }

    public static /* synthetic */ int f(i iVar, int i7) {
        int i8 = i7 | iVar.f15180l;
        iVar.f15180l = i8;
        return i8;
    }

    public final void A(float f7, float f8, boolean z7) {
        l y02;
        if (this.f15175g.isEmpty() || (y02 = z().y0(new float[]{f7, f8, 0.0f, 1.0f}, z7)) == this.f15183o) {
            return;
        }
        if (y02 != null) {
            S(y02.f15297b, 128);
        }
        l lVar = this.f15183o;
        if (lVar != null) {
            S(lVar.f15297b, 256);
        }
        this.f15183o = y02;
    }

    public boolean B() {
        return this.f15171c.isEnabled();
    }

    public final boolean C(l lVar) {
        if (lVar.x0(EnumC0222i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.f15300d & (~f15167C)) == 0) ? false : true;
    }

    public boolean D() {
        return this.f15171c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent G(int i7) {
        return AccessibilityEvent.obtain(i7);
    }

    public final AccessibilityEvent H(int i7, int i8) {
        AccessibilityEvent G6 = G(i8);
        G6.setPackageName(this.f15169a.getContext().getPackageName());
        G6.setSource(this.f15169a, i7);
        return G6;
    }

    public AccessibilityNodeInfo I(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo J(View view, int i7) {
        return AccessibilityNodeInfo.obtain(view, i7);
    }

    public boolean K(MotionEvent motionEvent) {
        return L(motionEvent, false);
    }

    public boolean L(MotionEvent motionEvent, boolean z7) {
        if (!this.f15171c.isTouchExplorationEnabled() || this.f15175g.isEmpty()) {
            return false;
        }
        l y02 = z().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z7);
        if (y02 != null && y02.f15305i != -1) {
            if (z7) {
                return false;
            }
            return this.f15172d.onAccessibilityHoverEvent(y02.f15297b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            A(motionEvent.getX(), motionEvent.getY(), z7);
        } else {
            if (motionEvent.getAction() != 10) {
                AbstractC1995b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            M();
        }
        return true;
    }

    public final void M() {
        l lVar = this.f15183o;
        if (lVar != null) {
            S(lVar.f15297b, 256);
            this.f15183o = null;
        }
    }

    public final void N(l lVar) {
        String p02 = lVar.p0();
        if (p02 == null) {
            p02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            W(p02);
            return;
        }
        AccessibilityEvent H6 = H(lVar.f15297b, 32);
        H6.getText().add(p02);
        T(H6);
    }

    public final boolean O(l lVar, int i7, Bundle bundle, boolean z7) {
        int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z8 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i9 = lVar.f15303g;
        int i10 = lVar.f15304h;
        Q(lVar, i8, z7, z8);
        if (i9 != lVar.f15303g || i10 != lVar.f15304h) {
            String str = lVar.f15314r != null ? lVar.f15314r : "";
            AccessibilityEvent H6 = H(lVar.f15297b, 8192);
            H6.getText().add(str);
            H6.setFromIndex(lVar.f15303g);
            H6.setToIndex(lVar.f15304h);
            H6.setItemCount(str.length());
            T(H6);
        }
        if (i8 == 1) {
            if (z7) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f15170b.c(i7, gVar, Boolean.valueOf(z8));
                    return true;
                }
            }
            if (z7) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f15170b.c(i7, gVar2, Boolean.valueOf(z8));
            return true;
        }
        if (i8 != 2) {
            return i8 == 4 || i8 == 8 || i8 == 16;
        }
        if (z7) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.w0(gVar3)) {
                this.f15170b.c(i7, gVar3, Boolean.valueOf(z8));
                return true;
            }
        }
        if (z7) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.w0(gVar4)) {
            return false;
        }
        this.f15170b.c(i7, gVar4, Boolean.valueOf(z8));
        return true;
    }

    public final boolean P(l lVar, int i7, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f15170b.c(i7, g.SET_TEXT, string);
        lVar.f15314r = string;
        lVar.f15315s = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r5 = r4.f15314r.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r4.f15304h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r4.f15304h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        io.flutter.view.i.l.n(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(io.flutter.view.i.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.i.l.l(r4)
            if (r0 < 0) goto L111
            int r0 = io.flutter.view.i.l.j(r4)
            if (r0 >= 0) goto Le
            goto L111
        Le:
            r0 = 1
            if (r5 == r0) goto Le9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L94
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L108
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.i.l.r(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.i.l.m(r4, r5)
            goto L108
        L31:
            io.flutter.view.i.l.m(r4, r2)
            goto L108
        L36:
            if (r6 == 0) goto L6b
            int r5 = io.flutter.view.i.l.l(r4)
            java.lang.String r1 = io.flutter.view.i.l.r(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L6b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.i.l.r(r4)
            int r1 = io.flutter.view.i.l.l(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r5 = r5.start(r0)
            io.flutter.view.i.l.n(r4, r5)
            goto L108
        L6b:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.i.l.l(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.i.l.r(r4)
            int r1 = io.flutter.view.i.l.l(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L8f:
            int r5 = r5.start(r0)
            goto L2c
        L94:
            if (r6 == 0) goto Lc4
            int r5 = io.flutter.view.i.l.l(r4)
            java.lang.String r1 = io.flutter.view.i.l.r(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.i.l.r(r4)
            int r1 = io.flutter.view.i.l.l(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc4:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.i.l.l(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.i.l.r(r4)
            int r1 = io.flutter.view.i.l.l(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L108
            goto L8f
        Le9:
            if (r6 == 0) goto Lfd
            int r5 = io.flutter.view.i.l.l(r4)
            java.lang.String r1 = io.flutter.view.i.l.r(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lfd
            io.flutter.view.i.l.n(r4, r0)
            goto L108
        Lfd:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.i.l.l(r4)
            if (r5 <= 0) goto L108
            io.flutter.view.i.l.o(r4, r0)
        L108:
            if (r7 != 0) goto L111
            int r5 = io.flutter.view.i.l.l(r4)
            io.flutter.view.i.l.k(r4, r5)
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.i.Q(io.flutter.view.i$l, int, boolean, boolean):void");
    }

    public void R() {
        this.f15189u = true;
        this.f15173e.d();
        Z(null);
        this.f15171c.removeAccessibilityStateChangeListener(this.f15191w);
        this.f15171c.removeTouchExplorationStateChangeListener(this.f15192x);
        this.f15174f.unregisterContentObserver(this.f15193y);
        this.f15170b.g(null);
    }

    public void S(int i7, int i8) {
        if (this.f15171c.isEnabled()) {
            T(H(i7, i8));
        }
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        if (this.f15171c.isEnabled()) {
            this.f15169a.getParent().requestSendAccessibilityEvent(this.f15169a, accessibilityEvent);
        }
    }

    public final void U() {
        this.f15170b.f(this.f15180l);
    }

    public final void V(int i7) {
        AccessibilityEvent H6 = H(i7, 2048);
        H6.setContentChangeTypes(1);
        T(H6);
    }

    public final void W(String str) {
        this.f15169a.setAccessibilityPaneTitle(str);
    }

    public final void X(boolean z7) {
        if (this.f15188t == z7) {
            return;
        }
        this.f15188t = z7;
        this.f15180l = z7 ? this.f15180l | f.ACCESSIBLE_NAVIGATION.f15208o : this.f15180l & (~f.ACCESSIBLE_NAVIGATION.f15208o);
        U();
    }

    public final void Y() {
        int i7;
        View view = this.f15169a;
        if (view == null || view.getResources() == null) {
            return;
        }
        i7 = this.f15169a.getResources().getConfiguration().fontWeightAdjustment;
        this.f15180l = (i7 == Integer.MAX_VALUE || i7 < 300) ? this.f15180l & f.BOLD_TEXT.f15208o : this.f15180l | f.BOLD_TEXT.f15208o;
        U();
    }

    public void Z(k kVar) {
        this.f15187s = kVar;
    }

    public final boolean a0(final l lVar) {
        return lVar.f15306j > 0 && (l.C0(this.f15177i, new T5.e() { // from class: io.flutter.view.g
            @Override // T5.e
            public final boolean test(Object obj) {
                boolean E6;
                E6 = i.E(i.l.this, (i.l) obj);
                return E6;
            }
        }) || !l.C0(this.f15177i, new T5.e() { // from class: io.flutter.view.h
            @Override // T5.e
            public final boolean test(Object obj) {
                boolean F6;
                F6 = i.F((i.l) obj);
                return F6;
            }
        }));
    }

    public void b0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h x7 = x(byteBuffer.getInt());
            x7.f15235c = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            String str = null;
            x7.f15236d = i7 == -1 ? null : strArr[i7];
            int i8 = byteBuffer.getInt();
            if (i8 != -1) {
                str = strArr[i8];
            }
            x7.f15237e = str;
        }
    }

    public void c0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f7;
        float f8;
        WindowInsets rootWindowInsets;
        View c7;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l y7 = y(byteBuffer.getInt());
            y7.F0(byteBuffer, strArr, byteBufferArr);
            if (!y7.x0(EnumC0222i.IS_HIDDEN)) {
                if (y7.x0(EnumC0222i.IS_FOCUSED)) {
                    this.f15181m = y7;
                }
                if (y7.f15271C) {
                    arrayList.add(y7);
                }
                if (y7.f15305i != -1 && !this.f15173e.b(y7.f15305i) && (c7 = this.f15173e.c(y7.f15305i)) != null) {
                    c7.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l z7 = z();
        ArrayList<l> arrayList2 = new ArrayList();
        if (z7 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || v()) && (rootWindowInsets = this.f15169a.getRootWindowInsets()) != null) {
                if (!this.f15186r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    z7.f15294Z = true;
                    z7.f15292X = true;
                }
                this.f15186r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            z7.E0(fArr, hashSet, false);
            z7.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f15184p.contains(Integer.valueOf(lVar4.f15297b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f15297b != this.f15185q || arrayList2.size() != this.f15184p.size())) {
            this.f15185q = lVar3.f15297b;
            N(lVar3);
        }
        this.f15184p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f15184p.add(Integer.valueOf(((l) it.next()).f15297b));
        }
        Iterator it2 = this.f15175g.entrySet().iterator();
        while (it2.hasNext()) {
            l lVar5 = (l) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(lVar5)) {
                d0(lVar5);
                it2.remove();
            }
        }
        V(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar6 = (l) it3.next();
            if (lVar6.j0()) {
                AccessibilityEvent H6 = H(lVar6.f15297b, 4096);
                float f9 = lVar6.f15308l;
                float f10 = lVar6.f15309m;
                if (Float.isInfinite(lVar6.f15309m)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f15310n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    f7 = f10 - lVar6.f15310n;
                    f8 = f9 - lVar6.f15310n;
                }
                if (lVar6.u0(g.SCROLL_UP) || lVar6.u0(g.SCROLL_DOWN)) {
                    H6.setScrollY((int) f8);
                    H6.setMaxScrollY((int) f7);
                } else if (lVar6.u0(g.SCROLL_LEFT) || lVar6.u0(g.SCROLL_RIGHT)) {
                    H6.setScrollX((int) f8);
                    H6.setMaxScrollX((int) f7);
                }
                if (lVar6.f15306j > 0) {
                    H6.setItemCount(lVar6.f15306j);
                    H6.setFromIndex(lVar6.f15307k);
                    Iterator it4 = lVar6.f15288T.iterator();
                    int i7 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).x0(EnumC0222i.IS_HIDDEN)) {
                            i7++;
                        }
                    }
                    H6.setToIndex((lVar6.f15307k + i7) - 1);
                }
                T(H6);
            }
            if (lVar6.x0(EnumC0222i.IS_LIVE_REGION) && lVar6.i0()) {
                V(lVar6.f15297b);
            }
            l lVar7 = this.f15177i;
            if (lVar7 != null && lVar7.f15297b == lVar6.f15297b) {
                EnumC0222i enumC0222i = EnumC0222i.IS_SELECTED;
                if (!lVar6.v0(enumC0222i) && lVar6.x0(enumC0222i)) {
                    AccessibilityEvent H7 = H(lVar6.f15297b, 4);
                    H7.getText().add(lVar6.f15312p);
                    T(H7);
                }
            }
            l lVar8 = this.f15181m;
            if (lVar8 != null && lVar8.f15297b == lVar6.f15297b && ((lVar2 = this.f15182n) == null || lVar2.f15297b != this.f15181m.f15297b)) {
                this.f15182n = this.f15181m;
                T(H(lVar6.f15297b, 8));
            } else if (this.f15181m == null) {
                this.f15182n = null;
            }
            l lVar9 = this.f15181m;
            if (lVar9 != null && lVar9.f15297b == lVar6.f15297b) {
                EnumC0222i enumC0222i2 = EnumC0222i.IS_TEXT_FIELD;
                if (lVar6.v0(enumC0222i2) && lVar6.x0(enumC0222i2) && ((lVar = this.f15177i) == null || lVar.f15297b == this.f15181m.f15297b)) {
                    String str = lVar6.f15279K != null ? lVar6.f15279K : "";
                    String str2 = lVar6.f15314r != null ? lVar6.f15314r : "";
                    AccessibilityEvent u7 = u(lVar6.f15297b, str, str2);
                    if (u7 != null) {
                        T(u7);
                    }
                    if (lVar6.f15274F != lVar6.f15303g || lVar6.f15275G != lVar6.f15304h) {
                        AccessibilityEvent H8 = H(lVar6.f15297b, 8192);
                        H8.getText().add(str2);
                        H8.setFromIndex(lVar6.f15303g);
                        H8.setToIndex(lVar6.f15304h);
                        H8.setItemCount(str2.length());
                        T(H8);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0473  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.i.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public final void d0(l lVar) {
        View c7;
        Integer num;
        lVar.f15286R = null;
        if (lVar.f15305i != -1 && (num = this.f15178j) != null && this.f15172d.platformViewOfNode(num.intValue()) == this.f15173e.c(lVar.f15305i)) {
            S(this.f15178j.intValue(), 65536);
            this.f15178j = null;
        }
        if (lVar.f15305i != -1 && (c7 = this.f15173e.c(lVar.f15305i)) != null) {
            c7.setImportantForAccessibility(4);
        }
        l lVar2 = this.f15177i;
        if (lVar2 == lVar) {
            S(lVar2.f15297b, 65536);
            this.f15177i = null;
        }
        if (this.f15181m == lVar) {
            this.f15181m = null;
        }
        if (this.f15183o == lVar) {
            this.f15183o = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.i$l r2 = r1.f15181m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.i.l.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.f15179k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.i$l r2 = r1.f15177i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.f15178j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.i.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i7, int i8, Bundle bundle) {
        int i9;
        if (i7 >= 65536) {
            boolean performAction = this.f15172d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.f15178j = null;
            }
            return performAction;
        }
        l lVar = (l) this.f15175g.get(Integer.valueOf(i7));
        if (lVar == null) {
            return false;
        }
        switch (i8) {
            case 16:
                this.f15170b.b(i7, g.TAP);
                return true;
            case 32:
                this.f15170b.b(i7, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f15177i == null) {
                    this.f15169a.invalidate();
                }
                this.f15177i = lVar;
                this.f15170b.b(i7, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.f15297b));
                this.f15170b.f1273a.c(hashMap);
                S(i7, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    S(i7, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f15177i;
                if (lVar2 != null && lVar2.f15297b == i7) {
                    this.f15177i = null;
                }
                Integer num = this.f15178j;
                if (num != null && num.intValue() == i7) {
                    this.f15178j = null;
                }
                this.f15170b.b(i7, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                S(i7, 65536);
                return true;
            case 256:
                return O(lVar, i7, bundle, true);
            case 512:
                return O(lVar, i7, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.w0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.w0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.w0(gVar)) {
                            return false;
                        }
                        lVar.f15314r = lVar.f15316t;
                        lVar.f15315s = lVar.f15317u;
                        S(i7, 4);
                    }
                }
                this.f15170b.b(i7, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.w0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.w0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.w0(gVar2)) {
                            return false;
                        }
                        lVar.f15314r = lVar.f15318v;
                        lVar.f15315s = lVar.f15319w;
                        S(i7, 4);
                    }
                }
                this.f15170b.b(i7, gVar2);
                return true;
            case 16384:
                this.f15170b.b(i7, g.COPY);
                return true;
            case 32768:
                this.f15170b.b(i7, g.PASTE);
                return true;
            case 65536:
                this.f15170b.b(i7, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i9 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap2.put("base", Integer.valueOf(lVar.f15304h));
                    i9 = lVar.f15304h;
                }
                hashMap2.put("extent", Integer.valueOf(i9));
                this.f15170b.c(i7, g.SET_SELECTION, hashMap2);
                l lVar3 = (l) this.f15175g.get(Integer.valueOf(i7));
                lVar3.f15303g = ((Integer) hashMap2.get("base")).intValue();
                lVar3.f15304h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f15170b.b(i7, g.DISMISS);
                return true;
            case 2097152:
                return P(lVar, i7, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f15170b.b(i7, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f15176h.get(Integer.valueOf(i8 - f15166B));
                if (hVar == null) {
                    return false;
                }
                this.f15170b.c(i7, g.CUSTOM_ACTION, Integer.valueOf(hVar.f15234b));
                return true;
        }
    }

    public final AccessibilityEvent u(int i7, String str, String str2) {
        AccessibilityEvent H6 = H(i7, 16);
        H6.setBeforeText(str);
        H6.getText().add(str2);
        int i8 = 0;
        while (i8 < str.length() && i8 < str2.length() && str.charAt(i8) == str2.charAt(i8)) {
            i8++;
        }
        if (i8 >= str.length() && i8 >= str2.length()) {
            return null;
        }
        H6.setFromIndex(i8);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i8 && length2 >= i8 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        H6.setRemovedCount((length - i8) + 1);
        H6.setAddedCount((length2 - i8) + 1);
        return H6;
    }

    public final boolean v() {
        int i7;
        Activity b7 = T5.g.b(this.f15169a.getContext());
        if (b7 == null || b7.getWindow() == null) {
            return false;
        }
        i7 = b7.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i7 == 2 || i7 == 0;
    }

    public final Rect w(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f15169a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final h x(int i7) {
        h hVar = (h) this.f15176h.get(Integer.valueOf(i7));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f15234b = i7;
        hVar2.f15233a = f15166B + i7;
        this.f15176h.put(Integer.valueOf(i7), hVar2);
        return hVar2;
    }

    public final l y(int i7) {
        l lVar = (l) this.f15175g.get(Integer.valueOf(i7));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f15297b = i7;
        this.f15175g.put(Integer.valueOf(i7), lVar2);
        return lVar2;
    }

    public final l z() {
        return (l) this.f15175g.get(0);
    }

    public i(View view, D5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o oVar) {
        this.f15175g = new HashMap();
        this.f15176h = new HashMap();
        this.f15180l = 0;
        this.f15184p = new ArrayList();
        this.f15185q = 0;
        this.f15186r = 0;
        this.f15188t = false;
        this.f15189u = false;
        this.f15190v = new a();
        b bVar = new b();
        this.f15191w = bVar;
        c cVar = new c(new Handler());
        this.f15193y = cVar;
        this.f15169a = view;
        this.f15170b = aVar;
        this.f15171c = accessibilityManager;
        this.f15174f = contentResolver;
        this.f15172d = accessibilityViewEmbedder;
        this.f15173e = oVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f15192x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            Y();
        }
        oVar.a(this);
    }
}
