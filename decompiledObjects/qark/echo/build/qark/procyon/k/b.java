// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k;

import android.widget.Adapter;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.e;
import android.widget.HeaderViewListAdapter;
import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import android.view.View;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.view.menu.g;

public abstract class b implements c, g, AdapterView$OnItemClickListener
{
    public Rect o;
    
    public static int o(final ListAdapter listAdapter, final ViewGroup viewGroup, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = ((Adapter)listAdapter).getCount();
        int n3;
        int n2 = n3 = 0;
        final View view = null;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        while (i < count) {
            final int itemViewType = ((Adapter)listAdapter).getItemViewType(i);
            int n4;
            if (itemViewType != (n4 = n3)) {
                view2 = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup2) == null) {
                o = new FrameLayout(context);
            }
            view2 = ((Adapter)listAdapter).getView(i, view2, (ViewGroup)o);
            view2.measure(measureSpec, measureSpec2);
            final int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup2 = (ViewGroup)o;
        }
        return n2;
    }
    
    public static boolean x(final d d) {
        for (int size = d.size(), i = 0; i < size; ++i) {
            final MenuItem item = d.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
    
    public static androidx.appcompat.view.menu.c y(final ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (androidx.appcompat.view.menu.c)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (androidx.appcompat.view.menu.c)listAdapter;
    }
    
    @Override
    public void c(final Context context, final d d) {
    }
    
    @Override
    public boolean h(final d d, final e e) {
        return false;
    }
    
    @Override
    public boolean j(final d d, final e e) {
        return false;
    }
    
    public abstract void l(final d p0);
    
    public boolean m() {
        return true;
    }
    
    public Rect n() {
        return this.o;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        final d o = y(listAdapter).o;
        final MenuItem menuItem = (MenuItem)((Adapter)listAdapter).getItem(n);
        if (this.m()) {
            n = 0;
        }
        else {
            n = 4;
        }
        o.I(menuItem, this, n);
    }
    
    public abstract void p(final View p0);
    
    public void q(final Rect o) {
        this.o = o;
    }
    
    public abstract void r(final boolean p0);
    
    public abstract void s(final int p0);
    
    public abstract void t(final int p0);
    
    public abstract void u(final PopupWindow$OnDismissListener p0);
    
    public abstract void v(final boolean p0);
    
    public abstract void w(final int p0);
}
