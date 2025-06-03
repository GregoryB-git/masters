// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.View;
import L.g;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public class i extends PopupWindow
{
    public static final boolean b;
    public boolean a;
    
    static {
        b = false;
    }
    
    public i(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a(context, set, n, n2);
    }
    
    public final void a(final Context context, final AttributeSet set, final int n, final int n2) {
        final X s = X.s(context, set, e.i.w1, n, n2);
        if (s.p(e.i.y1)) {
            this.b(s.a(e.i.y1, false));
        }
        this.setBackgroundDrawable(s.f(e.i.x1));
        s.t();
    }
    
    public final void b(final boolean a) {
        if (i.b) {
            this.a = a;
            return;
        }
        g.a(this, a);
    }
    
    public void showAsDropDown(final View view, final int n, final int n2) {
        int n3 = n2;
        if (i.b) {
            n3 = n2;
            if (this.a) {
                n3 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n3);
    }
    
    public void showAsDropDown(final View view, final int n, final int n2, final int n3) {
        int n4 = n2;
        if (i.b) {
            n4 = n2;
            if (this.a) {
                n4 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n4, n3);
    }
    
    public void update(final View view, final int n, final int n2, final int n3, final int n4) {
        int n5 = n2;
        if (i.b) {
            n5 = n2;
            if (this.a) {
                n5 = n2 - view.getHeight();
            }
        }
        super.update(view, n, n5, n3, n4);
    }
}
