/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.DataSetObserver
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Filter
 *  android.widget.Filterable
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package M;

import M.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a
extends BaseAdapter
implements Filterable,
b.a {
    public boolean o;
    public boolean p;
    public Cursor q;
    public Context r;
    public int s;
    public a t;
    public DataSetObserver u;
    public M.b v;

    public a(Context context, Cursor cursor, boolean bl) {
        int n8 = bl ? 1 : 2;
        this.f(context, cursor, n8);
    }

    @Override
    public void a(Cursor cursor) {
        if ((cursor = this.j(cursor)) != null) {
            cursor.close();
        }
    }

    @Override
    public Cursor b() {
        return this.q;
    }

    @Override
    public abstract CharSequence c(Cursor var1);

    public abstract void e(View var1, Context var2, Cursor var3);

    /*
     * Enabled aggressive block sorting
     */
    public void f(Context object, Cursor cursor, int n8) {
        boolean bl = false;
        if ((n8 & 1) == 1) {
            n8 |= 2;
            this.p = true;
        } else {
            this.p = false;
        }
        if (cursor != null) {
            bl = true;
        }
        this.q = cursor;
        this.o = bl;
        this.r = object;
        int n9 = bl ? cursor.getColumnIndexOrThrow("_id") : -1;
        this.s = n9;
        if ((n8 & 2) == 2) {
            this.t = new a();
            object = new b();
        } else {
            object = null;
            this.t = null;
        }
        this.u = object;
        if (bl) {
            object = this.t;
            if (object != null) {
                cursor.registerContentObserver((ContentObserver)object);
            }
            if ((object = this.u) != null) {
                cursor.registerDataSetObserver((DataSetObserver)object);
            }
        }
    }

    public abstract View g(Context var1, Cursor var2, ViewGroup var3);

    public int getCount() {
        Cursor cursor;
        if (this.o && (cursor = this.q) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        if (this.o) {
            this.q.moveToPosition(n8);
            View view2 = view;
            if (view == null) {
                view2 = this.g(this.r, this.q, viewGroup);
            }
            this.e(view2, this.r, this.q);
            return view2;
        }
        return null;
    }

    public Filter getFilter() {
        if (this.v == null) {
            this.v = new M.b(this);
        }
        return this.v;
    }

    public Object getItem(int n8) {
        Cursor cursor;
        if (this.o && (cursor = this.q) != null) {
            cursor.moveToPosition(n8);
            return this.q;
        }
        return null;
    }

    public long getItemId(int n8) {
        Cursor cursor;
        if (this.o && (cursor = this.q) != null && cursor.moveToPosition(n8)) {
            return this.q.getLong(this.s);
        }
        return 0L;
    }

    public View getView(int n8, View view, ViewGroup viewGroup) {
        if (this.o) {
            if (this.q.moveToPosition(n8)) {
                View view2 = view;
                if (view == null) {
                    view2 = this.h(this.r, this.q, viewGroup);
                }
                this.e(view2, this.r, this.q);
                return view2;
            }
            view = new StringBuilder();
            view.append("couldn't move cursor to position ");
            view.append(n8);
            throw new IllegalStateException(view.toString());
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context var1, Cursor var2, ViewGroup var3);

    public void i() {
        Cursor cursor;
        if (this.p && (cursor = this.q) != null && !cursor.isClosed()) {
            this.o = this.q.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        a a8;
        Cursor cursor2 = this.q;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a8 = this.t;
            if (a8 != null) {
                cursor2.unregisterContentObserver((ContentObserver)a8);
            }
            if ((a8 = this.u) != null) {
                cursor2.unregisterDataSetObserver((DataSetObserver)a8);
            }
        }
        this.q = cursor;
        if (cursor != null) {
            a8 = this.t;
            if (a8 != null) {
                cursor.registerContentObserver((ContentObserver)a8);
            }
            if ((a8 = this.u) != null) {
                cursor.registerDataSetObserver((DataSetObserver)a8);
            }
            this.s = cursor.getColumnIndexOrThrow("_id");
            this.o = true;
            this.notifyDataSetChanged();
            return cursor2;
        }
        this.s = -1;
        this.o = false;
        this.notifyDataSetInvalidated();
        return cursor2;
    }

    public class a
    extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean bl) {
            a.this.i();
        }
    }

    public class b
    extends DataSetObserver {
        public void onChanged() {
            a a8 = a.this;
            a8.o = true;
            a8.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a a8 = a.this;
            a8.o = false;
            a8.notifyDataSetInvalidated();
        }
    }

}

