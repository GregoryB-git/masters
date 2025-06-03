/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.MenuItem
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Object
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import l.X;

public final class ExpandedMenuView
extends ListView
implements d.b,
h,
AdapterView.OnItemClickListener {
    public static final int[] q = new int[]{16842964, 16843049};
    public d o;
    public int p;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet);
        this.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        object = X.s((Context)object, attributeSet, q, n8, 0);
        if (object.p(0)) {
            this.setBackgroundDrawable(object.f(0));
        }
        if (object.p(1)) {
            this.setDivider(object.f(1));
        }
        object.t();
    }

    @Override
    public boolean a(e e8) {
        return this.o.H(e8, 0);
    }

    public int getWindowAnimations() {
        return this.p;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int n8, long l8) {
        this.a((e)this.getAdapter().getItem(n8));
    }
}

