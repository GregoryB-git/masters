// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class c extends BaseAdapter
{
    public d o;
    public int p;
    public boolean q;
    public final boolean r;
    public final LayoutInflater s;
    public final int t;
    
    public c(final d o, final LayoutInflater s, final boolean r, final int t) {
        this.p = -1;
        this.r = r;
        this.s = s;
        this.o = o;
        this.t = t;
        this.a();
    }
    
    public void a() {
        final e t = this.o.t();
        if (t != null) {
            final ArrayList v = this.o.v();
            for (int size = v.size(), i = 0; i < size; ++i) {
                if (v.get(i) == t) {
                    this.p = i;
                    return;
                }
            }
        }
        this.p = -1;
    }
    
    public d b() {
        return this.o;
    }
    
    public e c(final int n) {
        ArrayList list;
        if (this.r) {
            list = this.o.v();
        }
        else {
            list = this.o.A();
        }
        final int p = this.p;
        int index = n;
        if (p >= 0 && (index = n) >= p) {
            index = n + 1;
        }
        return list.get(index);
    }
    
    public void d(final boolean q) {
        this.q = q;
    }
    
    public int getCount() {
        ArrayList list;
        if (this.r) {
            list = this.o.v();
        }
        else {
            list = this.o.A();
        }
        final int p = this.p;
        final int size = list.size();
        if (p < 0) {
            return size;
        }
        return size - 1;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.s.inflate(this.t, viewGroup, false);
        }
        final int groupId = this.c(n).getGroupId();
        final int n2 = n - 1;
        int groupId2;
        if (n2 >= 0) {
            groupId2 = this.c(n2).getGroupId();
        }
        else {
            groupId2 = groupId;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        listMenuItemView.setGroupDividerEnabled(this.o.B() && groupId != groupId2);
        final ListMenuItemView listMenuItemView2 = (ListMenuItemView)inflate;
        if (this.q) {
            listMenuItemView.setForceShowIcon(true);
        }
        ((h.a)listMenuItemView2).d(this.c(n), 0);
        return inflate;
    }
    
    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}
