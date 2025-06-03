// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J;

import android.text.Spannable;
import android.os.BaseBundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.os.Build$VERSION;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.view.View;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;

public class u
{
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;
    
    public u(final AccessibilityNodeInfo a) {
        this.b = -1;
        this.c = -1;
        this.a = a;
    }
    
    public static u P(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new u(accessibilityNodeInfo);
    }
    
    public static String g(final int n) {
        if (n == 1) {
            return "ACTION_FOCUS";
        }
        if (n == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
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
                                    case 16908372: {
                                        return "ACTION_IME_ENTER";
                                    }
                                }
                                break;
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
                            case 16908356: {
                                return "ACTION_SHOW_TOOLTIP";
                            }
                        }
                        break;
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
                    case 16908342: {
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                }
                break;
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
            case 4: {
                return "ACTION_SELECT";
            }
        }
    }
    
    public static ClickableSpan[] k(final CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), (Class)ClickableSpan.class);
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
    
    public boolean F(final int n, final Bundle bundle) {
        return this.a.performAction(n, bundle);
    }
    
    public final void G(final View view) {
        final SparseArray p = this.p(view);
        if (p != null) {
            final ArrayList<Integer> list = new ArrayList<Integer>();
            final int n = 0;
            int i = 0;
            int j;
            while (true) {
                j = n;
                if (i >= p.size()) {
                    break;
                }
                if (((WeakReference)p.valueAt(i)).get() == null) {
                    list.add(i);
                }
                ++i;
            }
            while (j < list.size()) {
                p.remove((int)list.get(j));
                ++j;
            }
        }
    }
    
    public final void H(final int n, final boolean b) {
        final Bundle m = this.m();
        if (m != null) {
            final int int1 = ((BaseBundle)m).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            ((BaseBundle)m).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & n));
        }
    }
    
    public void I(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    public void J(final boolean b) {
        if (Build$VERSION.SDK_INT >= 28) {
            J.d.a(this.a, b);
            return;
        }
        this.H(2, b);
    }
    
    public void K(final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 28) {
            J.c.a(this.a, charSequence);
            return;
        }
        u.b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
    }
    
    public void L(final boolean b) {
        if (Build$VERSION.SDK_INT >= 28) {
            b.a(this.a, b);
            return;
        }
        this.H(1, b);
    }
    
    public void M(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    public void N(final CharSequence charSequence) {
        if (E.b.b()) {
            e.a(this.a, charSequence);
            return;
        }
        u.b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
    }
    
    public AccessibilityNodeInfo O() {
        return this.a;
    }
    
    public void a(final a a) {
        this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)a.a);
    }
    
    public final void b(final ClickableSpan clickableSpan, final Spanned spanned, final int i) {
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan));
        this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(i);
    }
    
    public void c(final CharSequence charSequence, final View view) {
        if (Build$VERSION.SDK_INT < 26) {
            this.d();
            this.G(view);
            final ClickableSpan[] k = k(charSequence);
            if (k != null && k.length > 0) {
                ((BaseBundle)this.m()).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.a);
                final SparseArray n = this.n(view);
                for (int i = 0; i < k.length; ++i) {
                    final int u = this.u(k[i], n);
                    n.put(u, (Object)new WeakReference(k[i]));
                    this.b(k[i], (Spanned)charSequence, u);
                }
            }
        }
    }
    
    public final void d() {
        u.b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        u.b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        u.b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        u.b.a(this.a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }
    
    public final List e(final String s) {
        ArrayList integerArrayList;
        if ((integerArrayList = u.b.a(this.a).getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            u.b.a(this.a).putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof u)) {
            return false;
        }
        final u u = (u)o;
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            if (u.a != null) {
                return false;
            }
        }
        else if (!a.equals((Object)u.a)) {
            return false;
        }
        return this.c == u.c && this.b == u.b;
    }
    
    public List f() {
        final List actionList = this.a.getActionList();
        if (actionList != null) {
            final ArrayList<a> list = new ArrayList<a>();
            for (int size = actionList.size(), i = 0; i < size; ++i) {
                list.add(new a(actionList.get(i)));
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public void h(final Rect rect) {
        this.a.getBoundsInParent(rect);
    }
    
    @Override
    public int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    public void i(final Rect rect) {
        this.a.getBoundsInScreen(rect);
    }
    
    public CharSequence j() {
        return this.a.getClassName();
    }
    
    public CharSequence l() {
        return this.a.getContentDescription();
    }
    
    public Bundle m() {
        return u.b.a(this.a);
    }
    
    public final SparseArray n(final View view) {
        SparseArray p;
        if ((p = this.p(view)) == null) {
            p = new SparseArray();
            view.setTag(v.c.I, (Object)p);
        }
        return p;
    }
    
    public CharSequence o() {
        return this.a.getPackageName();
    }
    
    public final SparseArray p(final View view) {
        return (SparseArray)view.getTag(v.c.I);
    }
    
    public CharSequence q() {
        if (this.t()) {
            final List e = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List e2 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List e3 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List e4 = this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = this.a.getText();
            final int length = this.a.getText().length();
            int i = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (i < e.size()) {
                ((Spannable)spannableString).setSpan((Object)new J.a(e4.get(i), this, ((BaseBundle)this.m()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)e.get(i), (int)e2.get(i), (int)e3.get(i));
                ++i;
            }
            return (CharSequence)spannableString;
        }
        return this.a.getText();
    }
    
    public String r() {
        if (E.b.c()) {
            return f.a(this.a);
        }
        return ((BaseBundle)u.b.a(this.a)).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }
    
    public String s() {
        return this.a.getViewIdResourceName();
    }
    
    public final boolean t() {
        return this.e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.h(rect);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.i(rect);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.o());
        sb.append("; className: ");
        sb.append(this.j());
        sb.append("; text: ");
        sb.append(this.q());
        sb.append("; contentDescription: ");
        sb.append(this.l());
        sb.append("; viewId: ");
        sb.append(this.s());
        sb.append("; uniqueId: ");
        sb.append(this.r());
        sb.append("; checkable: ");
        sb.append(this.v());
        sb.append("; checked: ");
        sb.append(this.w());
        sb.append("; focusable: ");
        sb.append(this.z());
        sb.append("; focused: ");
        sb.append(this.A());
        sb.append("; selected: ");
        sb.append(this.E());
        sb.append("; clickable: ");
        sb.append(this.x());
        sb.append("; longClickable: ");
        sb.append(this.B());
        sb.append("; enabled: ");
        sb.append(this.y());
        sb.append("; password: ");
        sb.append(this.C());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(this.D());
        sb.append(sb4.toString());
        sb.append("; [");
        final List f = this.f();
        for (int i = 0; i < f.size(); ++i) {
            final a a = f.get(i);
            String str;
            final String s = str = g(a.a());
            if (s.equals("ACTION_UNKNOWN")) {
                str = s;
                if (a.b() != null) {
                    str = a.b().toString();
                }
            }
            sb.append(str);
            if (i != f.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public final int u(final ClickableSpan clickableSpan, final SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); ++i) {
                if (clickableSpan.equals(((WeakReference)sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        final int d = u.d;
        u.d = d + 1;
        return d;
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
    
    public static class a
    {
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
            final Object o2 = null;
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
            final int sdk_INT = Build$VERSION.SDK_INT;
            z = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            A = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, x.e.class);
            B = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            C = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            D = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            E = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a;
            if (sdk_INT >= 29) {
                a = J.g.a();
            }
            else {
                a = null;
            }
            F = new a(a, 16908358, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a2;
            if (sdk_INT >= 29) {
                a2 = J.p.a();
            }
            else {
                a2 = null;
            }
            G = new a(a2, 16908359, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a3;
            if (sdk_INT >= 29) {
                a3 = J.q.a();
            }
            else {
                a3 = null;
            }
            H = new a(a3, 16908360, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a4;
            if (sdk_INT >= 29) {
                a4 = J.r.a();
            }
            else {
                a4 = null;
            }
            I = new a(a4, 16908361, null, null, null);
            J = new a(AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a5;
            if (sdk_INT >= 24) {
                a5 = J.s.a();
            }
            else {
                a5 = null;
            }
            K = new a(a5, 16908349, null, null, x.f.class);
            AccessibilityNodeInfo$AccessibilityAction a6;
            if (sdk_INT >= 26) {
                a6 = J.t.a();
            }
            else {
                a6 = null;
            }
            L = new a(a6, 16908354, null, null, x.d.class);
            AccessibilityNodeInfo$AccessibilityAction a7;
            if (sdk_INT >= 28) {
                a7 = J.h.a();
            }
            else {
                a7 = null;
            }
            M = new a(a7, 16908356, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a8;
            if (sdk_INT >= 28) {
                a8 = J.i.a();
            }
            else {
                a8 = null;
            }
            N = new a(a8, 16908357, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a9;
            if (sdk_INT >= 30) {
                a9 = J.j.a();
            }
            else {
                a9 = null;
            }
            O = new a(a9, 16908362, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a10;
            if (sdk_INT >= 30) {
                a10 = J.k.a();
            }
            else {
                a10 = null;
            }
            P = new a(a10, 16908372, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a11;
            if (sdk_INT >= 32) {
                a11 = J.l.a();
            }
            else {
                a11 = null;
            }
            Q = new a(a11, 16908373, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a12;
            if (sdk_INT >= 32) {
                a12 = J.m.a();
            }
            else {
                a12 = null;
            }
            R = new a(a12, 16908374, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a13;
            if (sdk_INT >= 32) {
                a13 = J.n.a();
            }
            else {
                a13 = null;
            }
            S = new a(a13, 16908375, null, null, null);
            Object a14 = o2;
            if (sdk_INT >= 33) {
                a14 = J.o.a();
            }
            T = new a(a14, 16908376, null, null, null);
        }
        
        public a(final int n, final CharSequence charSequence) {
            this(null, n, charSequence, null, null);
        }
        
        public a(final int n, final CharSequence charSequence, final Class clazz) {
            this(null, n, charSequence, null, clazz);
        }
        
        public a(final Object o) {
            this(o, 0, null, null, null);
        }
        
        public a(final Object o, final int b, final CharSequence charSequence, final x x, final Class c) {
            this.b = b;
            Object a = o;
            if (o == null) {
                a = new AccessibilityNodeInfo$AccessibilityAction(b, charSequence);
            }
            this.a = a;
            this.c = c;
        }
        
        public int a() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getId();
        }
        
        public CharSequence b() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getLabel();
        }
        
        public boolean c(final View view, final Bundle bundle) {
            return false;
        }
        
        @Override
        public boolean equals(Object a) {
            if (a == null) {
                return false;
            }
            if (!(a instanceof a)) {
                return false;
            }
            final a a2 = (a)a;
            a = this.a;
            final Object a3 = a2.a;
            if (a == null) {
                if (a3 != null) {
                    return false;
                }
            }
            else if (!a.equals(a3)) {
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            final Object a = this.a;
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String str;
            final String s = str = J.u.g(this.b);
            if (s.equals("ACTION_UNKNOWN")) {
                str = s;
                if (this.b() != null) {
                    str = this.b().toString();
                }
            }
            sb.append(str);
            return sb.toString();
        }
    }
    
    public abstract static class b
    {
        public static Bundle a(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }
}
