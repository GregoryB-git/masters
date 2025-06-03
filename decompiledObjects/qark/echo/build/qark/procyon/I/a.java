// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.os.BaseBundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.ViewGroup;
import J.u;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import J.v;
import android.view.accessibility.AccessibilityEvent;
import java.util.Collections;
import v.c;
import java.util.List;
import android.view.View;
import android.view.View$AccessibilityDelegate;

public class a
{
    public static final View$AccessibilityDelegate c;
    public final View$AccessibilityDelegate a;
    public final View$AccessibilityDelegate b;
    
    static {
        c = new View$AccessibilityDelegate();
    }
    
    public a() {
        this(I.a.c);
    }
    
    public a(final View$AccessibilityDelegate a) {
        this.a = a;
        this.b = new a(this);
    }
    
    public static List c(final View view) {
        List<Object> emptyList;
        if ((emptyList = (List<Object>)view.getTag(v.c.H)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public v b(final View view) {
        final AccessibilityNodeProvider a = I.a.b.a(this.a, view);
        if (a != null) {
            return new v(a);
        }
        return null;
    }
    
    public View$AccessibilityDelegate d() {
        return this.b;
    }
    
    public final boolean e(final ClickableSpan clickableSpan, final View view) {
        if (clickableSpan != null) {
            final ClickableSpan[] k = u.k(view.createAccessibilityNodeInfo().getText());
            for (int n = 0; k != null && n < k.length; ++n) {
                if (clickableSpan.equals(k[n])) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void f(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void g(final View view, final u u) {
        this.a.onInitializeAccessibilityNodeInfo(view, u.O());
    }
    
    public void h(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean j(final View view, final int n, final Bundle bundle) {
        final List c = c(view);
        final boolean b = false;
        int n2 = 0;
        boolean c2;
        while (true) {
            c2 = b;
            if (n2 >= c.size()) {
                break;
            }
            final u.a a = c.get(n2);
            if (a.a() == n) {
                c2 = a.c(view, bundle);
                break;
            }
            ++n2;
        }
        boolean b2 = c2;
        if (!c2) {
            b2 = I.a.b.b(this.a, view, n, bundle);
        }
        boolean k = b2;
        if (!b2) {
            k = b2;
            if (n == v.c.a) {
                k = b2;
                if (bundle != null) {
                    k = this.k(((BaseBundle)bundle).getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
                }
            }
        }
        return k;
    }
    
    public final boolean k(final int n, final View view) {
        final SparseArray sparseArray = (SparseArray)view.getTag(v.c.I);
        if (sparseArray != null) {
            final WeakReference weakReference = (WeakReference)sparseArray.get(n);
            if (weakReference != null) {
                final ClickableSpan clickableSpan = weakReference.get();
                if (this.e(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void l(final View view, final int n) {
        this.a.sendAccessibilityEvent(view, n);
    }
    
    public void m(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public static final class a extends View$AccessibilityDelegate
    {
        public final I.a a;
        
        public a(final I.a a) {
            this.a = a;
        }
        
        public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }
        
        public AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
            final v b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider)b.a();
            }
            return null;
        }
        
        public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }
        
        public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
            final u p2 = u.P(accessibilityNodeInfo);
            p2.L(s.u(view));
            p2.J(s.s(view));
            p2.K(s.i(view));
            p2.N(s.p(view));
            this.a.g(view, p2);
            p2.c(accessibilityNodeInfo.getText(), view);
            final List c = I.a.c(view);
            for (int i = 0; i < c.size(); ++i) {
                p2.a((u.a)c.get(i));
            }
        }
        
        public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }
        
        public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }
        
        public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
            return this.a.j(view, n, bundle);
        }
        
        public void sendAccessibilityEvent(final View view, final int n) {
            this.a.l(view, n);
        }
        
        public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }
    
    public abstract static class b
    {
        public static AccessibilityNodeProvider a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view) {
            return view$AccessibilityDelegate.getAccessibilityNodeProvider(view);
        }
        
        public static boolean b(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view, final int n, final Bundle bundle) {
            return view$AccessibilityDelegate.performAccessibilityAction(view, n, bundle);
        }
    }
}
