/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.Collections
 *  java.util.List
 */
package I;

import I.s;
import J.u;
import J.v;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import v.c;

public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final View.AccessibilityDelegate b;

    public a() {
        this(c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    public static List c(View view) {
        List list = (List)view.getTag(c.H);
        view = list;
        if (list == null) {
            view = Collections.emptyList();
        }
        return view;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public v b(View view) {
        if ((view = b.a(this.a, view)) != null) {
            return new v((Object)view);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public final boolean e(ClickableSpan clickableSpan, View arrclickableSpan) {
        if (clickableSpan != null) {
            arrclickableSpan = u.k(arrclickableSpan.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; arrclickableSpan != null && i8 < arrclickableSpan.length; ++i8) {
                if (!clickableSpan.equals((Object)arrclickableSpan[i8])) continue;
                return true;
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, u u8) {
        this.a.onInitializeAccessibilityNodeInfo(view, u8.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int n8, Bundle bundle) {
        boolean bl;
        List list = a.c(view);
        boolean bl2 = false;
        int n9 = 0;
        do {
            bl = bl2;
            if (n9 >= list.size()) break;
            u.a a8 = (u.a)list.get(n9);
            if (a8.a() == n8) {
                bl = a8.c(view, bundle);
                break;
            }
            ++n9;
        } while (true);
        bl2 = bl;
        if (!bl) {
            bl2 = b.b(this.a, view, n8, bundle);
        }
        bl = bl2;
        if (!bl2) {
            bl = bl2;
            if (n8 == c.a) {
                bl = bl2;
                if (bundle != null) {
                    bl = this.k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
                }
            }
        }
        return bl;
    }

    public final boolean k(int n8, View view) {
        SparseArray sparseArray = (SparseArray)view.getTag(c.I);
        if (sparseArray != null && (sparseArray = (WeakReference)sparseArray.get(n8)) != null && this.e((ClickableSpan)(sparseArray = (ClickableSpan)sparseArray.get()), view)) {
            sparseArray.onClick(view);
            return true;
        }
        return false;
    }

    public void l(View view, int n8) {
        this.a.sendAccessibilityEvent(view, n8);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public static final class a
    extends View.AccessibilityDelegate {
        public final a a;

        public a(a a8) {
            this.a = a8;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View object) {
            if ((object = this.a.b((View)object)) != null) {
                return (AccessibilityNodeProvider)object.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            u u8 = u.P(accessibilityNodeInfo);
            u8.L(s.u(view));
            u8.J(s.s(view));
            u8.K(s.i(view));
            u8.N(s.p(view));
            this.a.g(view, u8);
            u8.c(accessibilityNodeInfo.getText(), view);
            view = a.c(view);
            for (int i8 = 0; i8 < view.size(); ++i8) {
                u8.a((u.a)view.get(i8));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int n8, Bundle bundle) {
            return this.a.j(view, n8, bundle);
        }

        public void sendAccessibilityEvent(View view, int n8) {
            this.a.l(view, n8);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public static abstract class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int n8, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, n8, bundle);
        }
    }

}

