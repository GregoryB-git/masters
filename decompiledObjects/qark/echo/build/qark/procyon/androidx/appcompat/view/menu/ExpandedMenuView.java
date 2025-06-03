// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.widget.Adapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import l.X;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements b, h, AdapterView$OnItemClickListener
{
    public static final int[] q;
    public d o;
    public int p;
    
    static {
        q = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        this(context, set, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        ((AdapterView)this).setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final X s = X.s(context, set, ExpandedMenuView.q, n, 0);
        if (s.p(0)) {
            ((View)this).setBackgroundDrawable(s.f(0));
        }
        if (s.p(1)) {
            this.setDivider(s.f(1));
        }
        s.t();
    }
    
    public boolean a(final e e) {
        return this.o.H((MenuItem)e, 0);
    }
    
    public int getWindowAnimations() {
        return this.p;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ViewGroup)this).setChildrenDrawingCacheEnabled(false);
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a((e)((Adapter)this.getAdapter()).getItem(n));
    }
}
