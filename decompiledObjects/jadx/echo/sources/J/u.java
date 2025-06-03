package J;

import J.x;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    public static int f2623d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2624a;

    /* renamed from: b, reason: collision with root package name */
    public int f2625b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2626c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f2627A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f2628B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f2629C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f2630D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f2631E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f2632F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f2633G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f2634H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f2635I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f2636J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f2637K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f2638L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f2639M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f2640N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f2641O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f2642P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f2643Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f2644R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f2645S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f2646T;

        /* renamed from: d, reason: collision with root package name */
        public static final a f2647d = new a(1, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f2648e = new a(2, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f2649f = new a(4, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f2650g = new a(8, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f2651h = new a(16, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f2652i = new a(32, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f2653j = new a(64, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f2654k = new a(128, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f2655l = new a(256, null, x.b.class);

        /* renamed from: m, reason: collision with root package name */
        public static final a f2656m = new a(512, null, x.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f2657n = new a(1024, null, x.c.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f2658o = new a(2048, null, x.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f2659p = new a(4096, null);

        /* renamed from: q, reason: collision with root package name */
        public static final a f2660q = new a(8192, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f2661r = new a(16384, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f2662s = new a(32768, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f2663t = new a(65536, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f2664u = new a(131072, null, x.g.class);

        /* renamed from: v, reason: collision with root package name */
        public static final a f2665v = new a(262144, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f2666w = new a(524288, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f2667x = new a(1048576, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f2668y = new a(2097152, null, x.h.class);

        /* renamed from: z, reason: collision with root package name */
        public static final a f2669z;

        /* renamed from: a, reason: collision with root package name */
        public final Object f2670a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2671b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f2672c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            int i7 = Build.VERSION.SDK_INT;
            f2669z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f2627A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, x.e.class);
            f2628B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f2629C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f2630D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f2631E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i7 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction26;
            } else {
                accessibilityAction = null;
            }
            f2632F = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i7 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction25;
            } else {
                accessibilityAction2 = null;
            }
            f2633G = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i7 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction24;
            } else {
                accessibilityAction3 = null;
            }
            f2634H = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i7 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction23;
            } else {
                accessibilityAction4 = null;
            }
            f2635I = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            f2636J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            if (i7 >= 24) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction5 = accessibilityAction22;
            } else {
                accessibilityAction5 = null;
            }
            f2637K = new a(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, x.f.class);
            if (i7 >= 26) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction6 = accessibilityAction21;
            } else {
                accessibilityAction6 = null;
            }
            f2638L = new a(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, x.d.class);
            if (i7 >= 28) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction7 = accessibilityAction20;
            } else {
                accessibilityAction7 = null;
            }
            f2639M = new a(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i7 >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction8 = accessibilityAction19;
            } else {
                accessibilityAction8 = null;
            }
            f2640N = new a(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i7 >= 30) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction9 = accessibilityAction18;
            } else {
                accessibilityAction9 = null;
            }
            f2641O = new a(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i7 >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction10 = accessibilityAction17;
            } else {
                accessibilityAction10 = null;
            }
            f2642P = new a(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
            if (i7 >= 32) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction11 = accessibilityAction16;
            } else {
                accessibilityAction11 = null;
            }
            f2643Q = new a(accessibilityAction11, R.id.accessibilityActionDragStart, null, null, null);
            if (i7 >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction12 = accessibilityAction15;
            } else {
                accessibilityAction12 = null;
            }
            f2644R = new a(accessibilityAction12, R.id.accessibilityActionDragDrop, null, null, null);
            if (i7 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction13 = accessibilityAction14;
            } else {
                accessibilityAction13 = null;
            }
            f2645S = new a(accessibilityAction13, R.id.accessibilityActionDragCancel, null, null, null);
            f2646T = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2670a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2670a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2670a;
            Object obj3 = ((a) obj).f2670a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2670a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g7 = u.g(this.f2671b);
            if (g7.equals("ACTION_UNKNOWN") && b() != null) {
                g7 = b().toString();
            }
            sb.append(g7);
            return sb.toString();
        }

        public a(int i7, CharSequence charSequence, Class cls) {
            this(null, i7, charSequence, null, cls);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i7, CharSequence charSequence, x xVar, Class cls) {
            this.f2671b = i7;
            this.f2670a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence) : obj;
            this.f2672c = cls;
        }
    }

    public static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public u(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2624a = accessibilityNodeInfo;
    }

    public static u P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new u(accessibilityNodeInfo);
    }

    public static String g(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean A() {
        return this.f2624a.isFocused();
    }

    public boolean B() {
        return this.f2624a.isLongClickable();
    }

    public boolean C() {
        return this.f2624a.isPassword();
    }

    public boolean D() {
        return this.f2624a.isScrollable();
    }

    public boolean E() {
        return this.f2624a.isSelected();
    }

    public boolean F(int i7, Bundle bundle) {
        return this.f2624a.performAction(i7, bundle);
    }

    public final void G(View view) {
        SparseArray p7 = p(view);
        if (p7 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < p7.size(); i7++) {
                if (((WeakReference) p7.valueAt(i7)).get() == null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                p7.remove(((Integer) arrayList.get(i8)).intValue());
            }
        }
    }

    public final void H(int i7, boolean z7) {
        Bundle m7 = m();
        if (m7 != null) {
            int i8 = m7.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z7) {
                i7 = 0;
            }
            m7.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    public void I(CharSequence charSequence) {
        this.f2624a.setClassName(charSequence);
    }

    public void J(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2624a.setHeading(z7);
        } else {
            H(2, z7);
        }
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2624a.setPaneTitle(charSequence);
        } else {
            b.a(this.f2624a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2624a.setScreenReaderFocusable(z7);
        } else {
            H(1, z7);
        }
    }

    public void M(boolean z7) {
        this.f2624a.setScrollable(z7);
    }

    public void N(CharSequence charSequence) {
        if (E.b.b()) {
            this.f2624a.setStateDescription(charSequence);
        } else {
            b.a(this.f2624a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.f2624a;
    }

    public void a(a aVar) {
        this.f2624a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2670a);
    }

    public final void b(ClickableSpan clickableSpan, Spanned spanned, int i7) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            d();
            G(view);
            ClickableSpan[] k7 = k(charSequence);
            if (k7 == null || k7.length <= 0) {
                return;
            }
            m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.f20040a);
            SparseArray n7 = n(view);
            for (int i7 = 0; i7 < k7.length; i7++) {
                int u7 = u(k7[i7], n7);
                n7.put(u7, new WeakReference(k7[i7]));
                b(k7[i7], (Spanned) charSequence, u7);
            }
        }
    }

    public final void d() {
        b.a(this.f2624a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f2624a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f2624a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f2624a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public final List e(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f2624a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f2624a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2624a;
        if (accessibilityNodeInfo == null) {
            if (uVar.f2624a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(uVar.f2624a)) {
            return false;
        }
        return this.f2626c == uVar.f2626c && this.f2625b == uVar.f2625b;
    }

    public List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2624a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    public void h(Rect rect) {
        this.f2624a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2624a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f2624a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.f2624a.getClassName();
    }

    public CharSequence l() {
        return this.f2624a.getContentDescription();
    }

    public Bundle m() {
        return b.a(this.f2624a);
    }

    public final SparseArray n(View view) {
        SparseArray p7 = p(view);
        if (p7 != null) {
            return p7;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(v.c.f20031I, sparseArray);
        return sparseArray;
    }

    public CharSequence o() {
        return this.f2624a.getPackageName();
    }

    public final SparseArray p(View view) {
        return (SparseArray) view.getTag(v.c.f20031I);
    }

    public CharSequence q() {
        if (!t()) {
            return this.f2624a.getText();
        }
        List e7 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List e8 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List e9 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List e10 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2624a.getText(), 0, this.f2624a.getText().length()));
        for (int i7 = 0; i7 < e7.size(); i7++) {
            spannableString.setSpan(new J.a(((Integer) e10.get(i7)).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) e7.get(i7)).intValue(), ((Integer) e8.get(i7)).intValue(), ((Integer) e9.get(i7)).intValue());
        }
        return spannableString;
    }

    public String r() {
        String uniqueId;
        if (!E.b.c()) {
            return b.a(this.f2624a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        uniqueId = this.f2624a.getUniqueId();
        return uniqueId;
    }

    public String s() {
        return this.f2624a.getViewIdResourceName();
    }

    public final boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(j());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(l());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; uniqueId: ");
        sb.append(r());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        List f7 = f();
        for (int i7 = 0; i7 < f7.size(); i7++) {
            a aVar = (a) f7.get(i7);
            String g7 = g(aVar.a());
            if (g7.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                g7 = aVar.b().toString();
            }
            sb.append(g7);
            if (i7 != f7.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final int u(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i7)).get())) {
                    return sparseArray.keyAt(i7);
                }
            }
        }
        int i8 = f2623d;
        f2623d = i8 + 1;
        return i8;
    }

    public boolean v() {
        return this.f2624a.isCheckable();
    }

    public boolean w() {
        return this.f2624a.isChecked();
    }

    public boolean x() {
        return this.f2624a.isClickable();
    }

    public boolean y() {
        return this.f2624a.isEnabled();
    }

    public boolean z() {
        return this.f2624a.isFocusable();
    }
}
