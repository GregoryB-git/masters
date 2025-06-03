/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  java.lang.Object
 *  java.util.ArrayList
 */
package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

public class c
extends BaseAdapter {
    public d o;
    public int p = -1;
    public boolean q;
    public final boolean r;
    public final LayoutInflater s;
    public final int t;

    public c(d d8, LayoutInflater layoutInflater, boolean bl, int n8) {
        this.r = bl;
        this.s = layoutInflater;
        this.o = d8;
        this.t = n8;
        this.a();
    }

    public void a() {
        e e8 = this.o.t();
        if (e8 != null) {
            ArrayList arrayList = this.o.v();
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                if ((e)arrayList.get(i8) != e8) continue;
                this.p = i8;
                return;
            }
        }
        this.p = -1;
    }

    public d b() {
        return this.o;
    }

    public e c(int n8) {
        ArrayList arrayList = this.r ? this.o.v() : this.o.A();
        int n9 = this.p;
        int n10 = n8;
        if (n9 >= 0) {
            n10 = n8;
            if (n8 >= n9) {
                n10 = n8 + 1;
            }
        }
        return (e)arrayList.get(n10);
    }

    public void d(boolean bl) {
        this.q = bl;
    }

    public int getCount() {
        ArrayList arrayList = this.r ? this.o.v() : this.o.A();
        int n8 = this.p;
        int n9 = arrayList.size();
        if (n8 < 0) {
            return n9;
        }
        return n9 - 1;
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View object, ViewGroup object2) {
        View view = object;
        if (object == null) {
            view = this.s.inflate(this.t, (ViewGroup)object2, false);
        }
        int n9 = this.c(n8).getGroupId();
        int n10 = n8 - 1;
        n10 = n10 >= 0 ? this.c(n10).getGroupId() : n9;
        object = (ListMenuItemView)view;
        boolean bl = this.o.B() && n9 != n10;
        object.setGroupDividerEnabled(bl);
        object2 = (h.a)view;
        if (this.q) {
            object.setForceShowIcon(true);
        }
        object2.d(this.c(n8), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

