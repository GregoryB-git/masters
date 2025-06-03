package I;

import J.u;
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

/* renamed from: I.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0404a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2415c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2416a;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f2417b;

    /* renamed from: I.a$a, reason: collision with other inner class name */
    public static final class C0040a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C0404a f2418a;

        public C0040a(C0404a c0404a) {
            this.f2418a = c0404a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2418a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            J.v b7 = this.f2418a.b(view);
            if (b7 != null) {
                return (AccessibilityNodeProvider) b7.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2418a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            J.u P6 = J.u.P(accessibilityNodeInfo);
            P6.L(AbstractC0421s.u(view));
            P6.J(AbstractC0421s.s(view));
            P6.K(AbstractC0421s.i(view));
            P6.N(AbstractC0421s.p(view));
            this.f2418a.g(view, P6);
            P6.c(accessibilityNodeInfo.getText(), view);
            List c7 = C0404a.c(view);
            for (int i7 = 0; i7 < c7.size(); i7++) {
                P6.a((u.a) c7.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2418a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2418a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f2418a.j(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f2418a.l(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2418a.m(view, accessibilityEvent);
        }
    }

    /* renamed from: I.a$b */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i7, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i7, bundle);
        }
    }

    public C0404a() {
        this(f2415c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(v.c.f20030H);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2416a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public J.v b(View view) {
        AccessibilityNodeProvider a7 = b.a(this.f2416a, view);
        if (a7 != null) {
            return new J.v(a7);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f2417b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] k7 = J.u.k(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; k7 != null && i7 < k7.length; i7++) {
                if (clickableSpan.equals(k7[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2416a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, J.u uVar) {
        this.f2416a.onInitializeAccessibilityNodeInfo(view, uVar.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2416a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2416a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i7, Bundle bundle) {
        List c7 = c(view);
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= c7.size()) {
                break;
            }
            u.a aVar = (u.a) c7.get(i8);
            if (aVar.a() == i7) {
                z7 = aVar.c(view, bundle);
                break;
            }
            i8++;
        }
        if (!z7) {
            z7 = b.b(this.f2416a, view, i7, bundle);
        }
        return (z7 || i7 != v.c.f20040a || bundle == null) ? z7 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(v.c.f20031I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i7) {
        this.f2416a.sendAccessibilityEvent(view, i7);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2416a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0404a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2416a = accessibilityDelegate;
        this.f2417b = new C0040a(this);
    }
}
