package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import l.X;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements d.b, h, AdapterView.OnItemClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f8370q = {R.attr.background, R.attr.divider};

    /* renamed from: o, reason: collision with root package name */
    public d f8371o;

    /* renamed from: p, reason: collision with root package name */
    public int f8372p;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(e eVar) {
        return this.f8371o.H(eVar, 0);
    }

    public int getWindowAnimations() {
        return this.f8372p;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        a((e) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        X s7 = X.s(context, attributeSet, f8370q, i7, 0);
        if (s7.p(0)) {
            setBackgroundDrawable(s7.f(0));
        }
        if (s7.p(1)) {
            setDivider(s7.f(1));
        }
        s7.t();
    }
}
