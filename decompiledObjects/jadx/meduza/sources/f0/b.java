package f0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.f;
import f0.d;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static int f5278b;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f5279a;

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5280d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f5281e;
        public static final a f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f5282g;

        /* renamed from: a, reason: collision with root package name */
        public final Object f5283a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5284b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<? extends d.a> f5285c;

        static {
            new a(null, 1, null);
            new a(null, 2, null);
            new a(null, 4, null);
            new a(null, 8, null);
            new a(null, 16, null);
            new a(null, 32, null);
            new a(null, 64, null);
            new a(null, 128, null);
            new a(null, 256, d.b.class);
            new a(null, 512, d.b.class);
            new a(null, 1024, d.c.class);
            new a(null, 2048, d.c.class);
            f5280d = new a(null, 4096, null);
            f5281e = new a(null, 8192, null);
            new a(null, 16384, null);
            new a(null, 32768, null);
            new a(null, 65536, null);
            new a(null, 131072, d.g.class);
            new a(null, 262144, null);
            new a(null, 524288, null);
            new a(null, 1048576, null);
            new a(null, 2097152, d.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, d.e.class);
            f = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
            f5282g = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
            new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, d.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, d.C0077d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
            new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null);
        }

        public a(Object obj, int i10, Class cls) {
            this.f5284b = i10;
            this.f5283a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, null) : obj;
            this.f5285c = cls;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f5283a;
            Object obj3 = ((a) obj).f5283a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f5283a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder l10 = f.l("AccessibilityActionCompat: ");
            String b10 = b.b(this.f5284b);
            if (b10.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) this.f5283a).getLabel() != null) {
                b10 = ((AccessibilityNodeInfo.AccessibilityAction) this.f5283a).getLabel().toString();
            }
            l10.append(b10);
            return l10.toString();
        }
    }

    /* renamed from: f0.b$b, reason: collision with other inner class name */
    public static class C0076b {
        public static Object a(int i10, float f, float f10, float f11) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f, f10, f11);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence stateDescription;
            stateDescription = accessibilityNodeInfo.getStateDescription();
            return stateDescription;
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static e a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new e(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static b b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return b.d(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
            extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
            return extraRenderingInfo;
        }

        public static b f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return b.d(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5286a;

        public e(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f5286a = collectionItemInfo;
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5279a = accessibilityNodeInfo;
    }

    @Deprecated
    public b(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        this.f5279a = accessibilityNodeInfo;
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
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
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
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
                        switch (i10) {
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
                                switch (i10) {
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

    public static b d(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            return new b(accessibilityNodeInfo, 0);
        }
        return null;
    }

    public final ArrayList a(String str) {
        ArrayList<Integer> integerArrayList = this.f5279a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f5279a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean c(int i10) {
        Bundle extras = this.f5279a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5279a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((b) obj).f5279a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5279a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableString] */
    public final String toString() {
        ?? text;
        ?? emptyList;
        ?? sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        this.f5279a.getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f5279a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f5279a, rect);
        } else {
            Rect rect2 = (Rect) this.f5279a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f5279a.getPackageName());
        sb2.append("; className: ");
        sb2.append(this.f5279a.getClassName());
        sb2.append("; text: ");
        if (!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            ArrayList a10 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList a11 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList a12 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList a13 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString(TextUtils.substring(this.f5279a.getText(), 0, this.f5279a.getText().length()));
            for (int i10 = 0; i10 < a10.size(); i10++) {
                text.setSpan(new f0.a(((Integer) a13.get(i10)).intValue(), this, this.f5279a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a10.get(i10)).intValue(), ((Integer) a11.get(i10)).intValue(), ((Integer) a12.get(i10)).intValue());
            }
        } else {
            text = this.f5279a.getText();
        }
        sb2.append(text);
        sb2.append("; error: ");
        sb2.append(this.f5279a.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(this.f5279a.getMaxTextLength());
        sb2.append("; stateDescription: ");
        int i11 = Build.VERSION.SDK_INT;
        sb2.append(i11 >= 30 ? C0076b.b(this.f5279a) : this.f5279a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb2.append("; contentDescription: ");
        sb2.append(this.f5279a.getContentDescription());
        sb2.append("; tooltipText: ");
        sb2.append(i11 >= 28 ? this.f5279a.getTooltipText() : this.f5279a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb2.append("; viewIdResName: ");
        sb2.append(this.f5279a.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5279a;
        sb2.append(i11 >= 33 ? c.g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(this.f5279a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f5279a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f5279a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f5279a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f5279a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f5279a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f5279a.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(this.f5279a.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(this.f5279a.isEnabled());
        sb2.append("; password: ");
        sb2.append(this.f5279a.isPassword());
        sb2.append("; scrollable: " + this.f5279a.isScrollable());
        sb2.append("; containerTitle: ");
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f5279a;
        sb2.append(i11 >= 34 ? d.c(accessibilityNodeInfo2) : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb2.append("; granularScrollingSupported: ");
        sb2.append(c(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(i11 >= 24 ? this.f5279a.isImportantForAccessibility() : true);
        sb2.append("; visible: ");
        sb2.append(this.f5279a.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(i11 >= 33 ? c.h(this.f5279a) : c(8388608));
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(i11 >= 34 ? d.f(this.f5279a) : c(64));
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f5279a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i12 = 0; i12 < size; i12++) {
                emptyList.add(new a(actionList.get(i12), 0, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i13 = 0; i13 < emptyList.size(); i13++) {
            a aVar = (a) emptyList.get(i13);
            String b10 = b(((AccessibilityNodeInfo.AccessibilityAction) aVar.f5283a).getId());
            if (b10.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f5283a).getLabel() != null) {
                b10 = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f5283a).getLabel().toString();
            }
            sb2.append(b10);
            if (i13 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
