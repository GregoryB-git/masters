package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    public d f8436o;

    /* renamed from: p, reason: collision with root package name */
    public int f8437p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8438q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8439r;

    /* renamed from: s, reason: collision with root package name */
    public final LayoutInflater f8440s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8441t;

    public c(d dVar, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f8439r = z7;
        this.f8440s = layoutInflater;
        this.f8436o = dVar;
        this.f8441t = i7;
        a();
    }

    public void a() {
        e t7 = this.f8436o.t();
        if (t7 != null) {
            ArrayList v7 = this.f8436o.v();
            int size = v7.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((e) v7.get(i7)) == t7) {
                    this.f8437p = i7;
                    return;
                }
            }
        }
        this.f8437p = -1;
    }

    public d b() {
        return this.f8436o;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e getItem(int i7) {
        ArrayList v7 = this.f8439r ? this.f8436o.v() : this.f8436o.A();
        int i8 = this.f8437p;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (e) v7.get(i7);
    }

    public void d(boolean z7) {
        this.f8438q = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList v7 = this.f8439r ? this.f8436o.v() : this.f8436o.A();
        int i7 = this.f8437p;
        int size = v7.size();
        return i7 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8440s.inflate(this.f8441t, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f8436o.B() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        h.a aVar = (h.a) view;
        if (this.f8438q) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
