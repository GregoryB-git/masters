/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.Object
 */
package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import k.c;

public abstract class b
implements c,
g,
AdapterView.OnItemClickListener {
    public Rect o;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int n8) {
        int n9;
        int n10 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n11 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n12 = listAdapter.getCount();
        int n13 = n9 = 0;
        ViewGroup viewGroup2 = null;
        ViewGroup viewGroup3 = viewGroup;
        viewGroup = viewGroup2;
        for (int i8 = 0; i8 < n12; ++i8) {
            int n14 = listAdapter.getItemViewType(i8);
            int n15 = n13;
            if (n14 != n13) {
                viewGroup = null;
                n15 = n14;
            }
            viewGroup2 = viewGroup3;
            if (viewGroup3 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            viewGroup = listAdapter.getView(i8, (View)viewGroup, viewGroup2);
            viewGroup.measure(n10, n11);
            n14 = viewGroup.getMeasuredWidth();
            if (n14 >= n8) {
                return n8;
            }
            n13 = n9;
            if (n14 > n9) {
                n13 = n14;
            }
            n9 = n13;
            n13 = n15;
            viewGroup3 = viewGroup2;
        }
        return n9;
    }

    public static boolean x(d d8) {
        int n8 = d8.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = d8.getItem(i8);
            if (!menuItem.isVisible() || menuItem.getIcon() == null) continue;
            return true;
        }
        return false;
    }

    public static androidx.appcompat.view.menu.c y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (androidx.appcompat.view.menu.c)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (androidx.appcompat.view.menu.c)listAdapter;
    }

    @Override
    public void c(Context context, d d8) {
    }

    @Override
    public boolean h(d d8, e e8) {
        return false;
    }

    @Override
    public boolean j(d d8, e e8) {
        return false;
    }

    public abstract void l(d var1);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.o;
    }

    public void onItemClick(AdapterView object, View view, int n8, long l8) {
        view = (ListAdapter)object.getAdapter();
        object = b.y((ListAdapter)view).o;
        view = (MenuItem)view.getItem(n8);
        n8 = this.m() ? 0 : 4;
        object.I((MenuItem)view, this, n8);
    }

    public abstract void p(View var1);

    public void q(Rect rect) {
        this.o = rect;
    }

    public abstract void r(boolean var1);

    public abstract void s(int var1);

    public abstract void t(int var1);

    public abstract void u(PopupWindow.OnDismissListener var1);

    public abstract void v(boolean var1);

    public abstract void w(int var1);
}

