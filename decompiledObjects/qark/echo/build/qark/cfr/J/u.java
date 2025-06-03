/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.text.style.ClickableSpan
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package J;

import J.c;
import J.d;
import J.e;
import J.f;
import J.g;
import J.h;
import J.i;
import J.j;
import J.k;
import J.l;
import J.m;
import J.n;
import J.o;
import J.p;
import J.q;
import J.r;
import J.s;
import J.t;
import J.x;
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

public class u {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public u(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static u P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new u(accessibilityNodeInfo);
    }

    public static String g(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                switch (n8) {
                                    default: {
                                        switch (n8) {
                                            default: {
                                                return "ACTION_UNKNOWN";
                                            }
                                            case 16908375: {
                                                return "ACTION_DRAG_CANCEL";
                                            }
                                            case 16908374: {
                                                return "ACTION_DRAG_DROP";
                                            }
                                            case 16908373: {
                                                return "ACTION_DRAG_START";
                                            }
                                            case 16908372: 
                                        }
                                        return "ACTION_IME_ENTER";
                                    }
                                    case 16908362: {
                                        return "ACTION_PRESS_AND_HOLD";
                                    }
                                    case 16908361: {
                                        return "ACTION_PAGE_RIGHT";
                                    }
                                    case 16908360: {
                                        return "ACTION_PAGE_LEFT";
                                    }
                                    case 16908359: {
                                        return "ACTION_PAGE_DOWN";
                                    }
                                    case 16908358: {
                                        return "ACTION_PAGE_UP";
                                    }
                                    case 16908357: {
                                        return "ACTION_HIDE_TOOLTIP";
                                    }
                                    case 16908356: 
                                }
                                return "ACTION_SHOW_TOOLTIP";
                            }
                            case 16908349: {
                                return "ACTION_SET_PROGRESS";
                            }
                            case 16908348: {
                                return "ACTION_CONTEXT_CLICK";
                            }
                            case 16908347: {
                                return "ACTION_SCROLL_RIGHT";
                            }
                            case 16908346: {
                                return "ACTION_SCROLL_DOWN";
                            }
                            case 16908345: {
                                return "ACTION_SCROLL_LEFT";
                            }
                            case 16908344: {
                                return "ACTION_SCROLL_UP";
                            }
                            case 16908343: {
                                return "ACTION_SCROLL_TO_POSITION";
                            }
                            case 16908342: 
                        }
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                    case 16908354: {
                        return "ACTION_MOVE_WINDOW";
                    }
                    case 2097152: {
                        return "ACTION_SET_TEXT";
                    }
                    case 524288: {
                        return "ACTION_COLLAPSE";
                    }
                    case 262144: {
                        return "ACTION_EXPAND";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean A() {
        return this.a.isFocused();
    }

    public boolean B() {
        return this.a.isLongClickable();
    }

    public boolean C() {
        return this.a.isPassword();
    }

    public boolean D() {
        return this.a.isScrollable();
    }

    public boolean E() {
        return this.a.isSelected();
    }

    public boolean F(int n8, Bundle bundle) {
        return this.a.performAction(n8, bundle);
    }

    public final void G(View view) {
        if ((view = this.p(view)) != null) {
            ArrayList arrayList = new ArrayList();
            int n8 = 0;
            int n9 = 0;
            do {
                if (n9 >= view.size()) break;
                if (((WeakReference)view.valueAt(n9)).get() == null) {
                    arrayList.add((Object)n9);
                }
                ++n9;
            } while (true);
            for (int i8 = n8; i8 < arrayList.size(); ++i8) {
                view.remove(((Integer)arrayList.get(i8)).intValue());
            }
        }
    }

    public final void H(int n8, boolean bl) {
        Bundle bundle = this.m();
        if (bundle != null) {
            int n9 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n10 = bl ? n8 : 0;
            bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n10 | n9 & n8);
        }
    }

    public void I(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void J(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.a(this.a, bl);
            return;
        }
        this.H(2, bl);
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.a(this.a, charSequence);
            return;
        }
        b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
    }

    public void L(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            J.b.a(this.a, bl);
            return;
        }
        this.H(1, bl);
    }

    public void M(boolean bl) {
        this.a.setScrollable(bl);
    }

    public void N(CharSequence charSequence) {
        if (E.b.b()) {
            e.a(this.a, charSequence);
            return;
        }
        b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
    }

    public AccessibilityNodeInfo O() {
        return this.a;
    }

    public void a(a a8) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)a8.a);
    }

    public final void b(ClickableSpan clickableSpan, Spanned spanned, int n8) {
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add((Object)spanned.getSpanStart((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add((Object)spanned.getSpanEnd((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add((Object)spanned.getSpanFlags((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add((Object)n8);
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            this.d();
            this.G(view);
            ClickableSpan[] arrclickableSpan = u.k(charSequence);
            if (arrclickableSpan != null && arrclickableSpan.length > 0) {
                this.m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.a);
                view = this.n(view);
                for (int i8 = 0; i8 < arrclickableSpan.length; ++i8) {
                    int n8 = this.u(arrclickableSpan[i8], (SparseArray)view);
                    view.put(n8, (Object)new WeakReference((Object)arrclickableSpan[i8]));
                    this.b(arrclickableSpan[i8], (Spanned)charSequence, n8);
                }
            }
        }
    }

    public final void d() {
        b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public final List e(String string2) {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList = b.a(this.a).getIntegerArrayList(string2);
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            b.a(this.a).putIntegerArrayList(string2, arrayList2);
        }
        return arrayList2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null ? object.a != null : !accessibilityNodeInfo.equals((Object)object.a)) {
            return false;
        }
        if (this.c != object.c) {
            return false;
        }
        if (this.b != object.b) {
            return false;
        }
        return true;
    }

    public List f() {
        List list = this.a.getActionList();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList.add((Object)new a(list.get(i8)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void h(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.a.getClassName();
    }

    public CharSequence l() {
        return this.a.getContentDescription();
    }

    public Bundle m() {
        return b.a(this.a);
    }

    public final SparseArray n(View view) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = sparseArray = this.p(view);
        if (sparseArray == null) {
            sparseArray2 = new SparseArray();
            view.setTag(v.c.I, (Object)sparseArray2);
        }
        return sparseArray2;
    }

    public CharSequence o() {
        return this.a.getPackageName();
    }

    public final SparseArray p(View view) {
        return (SparseArray)view.getTag(v.c.I);
    }

    public CharSequence q() {
        if (this.t()) {
            List list = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List list2 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List list3 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List list4 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence = this.a.getText();
            int n8 = this.a.getText().length();
            charSequence = new SpannableString((CharSequence)TextUtils.substring((CharSequence)charSequence, (int)0, (int)n8));
            for (int i8 = 0; i8 < list.size(); ++i8) {
                charSequence.setSpan((Object)new J.a((Integer)list4.get(i8), this, this.m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list.get(i8)).intValue(), ((Integer)list2.get(i8)).intValue(), ((Integer)list3.get(i8)).intValue());
            }
            return charSequence;
        }
        return this.a.getText();
    }

    public String r() {
        if (E.b.c()) {
            return f.a(this.a);
        }
        return b.a(this.a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String s() {
        return this.a.getViewIdResourceName();
    }

    public final boolean t() {
        return this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Object object = new Rect();
        this.h((Rect)object);
        Object object2 = new StringBuilder();
        object2.append("; boundsInParent: ");
        object2.append(object);
        stringBuilder.append(object2.toString());
        this.i((Rect)object);
        object2 = new StringBuilder();
        object2.append("; boundsInScreen: ");
        object2.append(object);
        stringBuilder.append(object2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.o());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.j());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.q());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.l());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.s());
        stringBuilder.append("; uniqueId: ");
        stringBuilder.append(this.r());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.v());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.w());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.z());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.A());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.E());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.x());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.B());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.y());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.C());
        object = new StringBuilder();
        object.append("; scrollable: ");
        object.append(this.D());
        stringBuilder.append(object.toString());
        stringBuilder.append("; [");
        List list = this.f();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a a8 = (a)list.get(i8);
            object = object2 = u.g(a8.a());
            if (object2.equals((Object)"ACTION_UNKNOWN")) {
                object = object2;
                if (a8.b() != null) {
                    object = a8.b().toString();
                }
            }
            stringBuilder.append((String)object);
            if (i8 == list.size() - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int u(ClickableSpan clickableSpan, SparseArray sparseArray) {
        int n8;
        if (sparseArray != null) {
            for (n8 = 0; n8 < sparseArray.size(); ++n8) {
                if (!clickableSpan.equals((Object)((ClickableSpan)((WeakReference)sparseArray.valueAt(n8)).get()))) continue;
                return sparseArray.keyAt(n8);
            }
        }
        n8 = d;
        d = n8 + 1;
        return n8;
    }

    public boolean v() {
        return this.a.isCheckable();
    }

    public boolean w() {
        return this.a.isChecked();
    }

    public boolean x() {
        return this.a.isClickable();
    }

    public boolean y() {
        return this.a.isEnabled();
    }

    public boolean z() {
        return this.a.isFocusable();
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        public final Object a;
        public final int b;
        public final Class c;

        static {
            Object var2 = null;
            d = new a(1, null);
            e = new a(2, null);
            f = new a(4, null);
            g = new a(8, null);
            h = new a(16, null);
            i = new a(32, null);
            j = new a(64, null);
            k = new a(128, null);
            l = new a(256, null, x.b.class);
            m = new a(512, null, x.b.class);
            n = new a(1024, null, x.c.class);
            o = new a(2048, null, x.c.class);
            p = new a(4096, null);
            q = new a(8192, null);
            r = new a(16384, null);
            s = new a(32768, null);
            t = new a(65536, null);
            u = new a(131072, null, x.g.class);
            v = new a(262144, null);
            w = new a(524288, null);
            x = new a(1048576, null);
            y = new a(2097152, null, x.h.class);
            int n8 = Build.VERSION.SDK_INT;
            z = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            A = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, x.e.class);
            B = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            C = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            D = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            E = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = n8 >= 29 ? g.a() : null;
            F = new a((Object)accessibilityAction, 16908358, null, null, null);
            accessibilityAction = n8 >= 29 ? p.a() : null;
            G = new a((Object)accessibilityAction, 16908359, null, null, null);
            accessibilityAction = n8 >= 29 ? q.a() : null;
            H = new a((Object)accessibilityAction, 16908360, null, null, null);
            accessibilityAction = n8 >= 29 ? r.a() : null;
            I = new a((Object)accessibilityAction, 16908361, null, null, null);
            J = new a((Object)AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            accessibilityAction = n8 >= 24 ? s.a() : null;
            K = new a((Object)accessibilityAction, 16908349, null, null, x.f.class);
            accessibilityAction = n8 >= 26 ? t.a() : null;
            L = new a((Object)accessibilityAction, 16908354, null, null, x.d.class);
            accessibilityAction = n8 >= 28 ? h.a() : null;
            M = new a((Object)accessibilityAction, 16908356, null, null, null);
            accessibilityAction = n8 >= 28 ? i.a() : null;
            N = new a((Object)accessibilityAction, 16908357, null, null, null);
            accessibilityAction = n8 >= 30 ? j.a() : null;
            O = new a((Object)accessibilityAction, 16908362, null, null, null);
            accessibilityAction = n8 >= 30 ? k.a() : null;
            P = new a((Object)accessibilityAction, 16908372, null, null, null);
            accessibilityAction = n8 >= 32 ? l.a() : null;
            Q = new a((Object)accessibilityAction, 16908373, null, null, null);
            accessibilityAction = n8 >= 32 ? m.a() : null;
            R = new a((Object)accessibilityAction, 16908374, null, null, null);
            accessibilityAction = n8 >= 32 ? n.a() : null;
            S = new a((Object)accessibilityAction, 16908375, null, null, null);
            accessibilityAction = var2;
            if (n8 >= 33) {
                accessibilityAction = o.a();
            }
            T = new a((Object)accessibilityAction, 16908376, null, null, null);
        }

        public a(int n8, CharSequence charSequence) {
            this(null, n8, charSequence, null, null);
        }

        public a(int n8, CharSequence charSequence, Class class_) {
            this(null, n8, charSequence, null, class_);
        }

        public a(Object object) {
            this(object, 0, null, null, null);
        }

        public a(Object object, int n8, CharSequence charSequence, x object2, Class class_) {
            this.b = n8;
            object2 = object;
            if (object == null) {
                object2 = new AccessibilityNodeInfo.AccessibilityAction(n8, charSequence);
            }
            this.a = object2;
            this.c = class_;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (!(object instanceof a)) {
                return false;
            }
            Object object2 = (a)object;
            object = this.a;
            object2 = object2.a;
            if (object == null ? object2 != null : !object.equals(object2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object object = this.a;
            if (object != null) {
                return object.hashCode();
            }
            return 0;
        }

        public String toString() {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AccessibilityActionCompat: ");
            String string3 = string2 = u.g(this.b);
            if (string2.equals((Object)"ACTION_UNKNOWN")) {
                string3 = string2;
                if (this.b() != null) {
                    string3 = this.b().toString();
                }
            }
            stringBuilder.append(string3);
            return stringBuilder.toString();
        }
    }

    public static abstract class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

}

