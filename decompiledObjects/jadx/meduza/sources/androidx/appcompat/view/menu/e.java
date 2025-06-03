package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public f f659a;

    /* renamed from: b, reason: collision with root package name */
    public int f660b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f661c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f662d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f663e;
    public final int f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f662d = z10;
        this.f663e = layoutInflater;
        this.f659a = fVar;
        this.f = i10;
        b();
    }

    public final void b() {
        f fVar = this.f659a;
        h hVar = fVar.f685w;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f673j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f660b = i10;
                    return;
                }
            }
        }
        this.f660b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i10) {
        ArrayList<h> l10;
        if (this.f662d) {
            f fVar = this.f659a;
            fVar.i();
            l10 = fVar.f673j;
        } else {
            l10 = this.f659a.l();
        }
        int i11 = this.f660b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l10;
        if (this.f662d) {
            f fVar = this.f659a;
            fVar.i();
            l10 = fVar.f673j;
        } else {
            l10 = this.f659a.l();
        }
        int i10 = this.f660b;
        int size = l10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f663e.inflate(this.f, viewGroup, false);
        }
        int i11 = getItem(i10).f692b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f692b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f659a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f661c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
