// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M;

import android.os.Handler;
import android.widget.Filter;
import android.view.ViewGroup;
import android.database.ContentObserver;
import android.view.View;
import android.database.DataSetObserver;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class a extends BaseAdapter implements Filterable, M.b.a
{
    public boolean o;
    public boolean p;
    public Cursor q;
    public Context r;
    public int s;
    public a t;
    public DataSetObserver u;
    public M.b v;
    
    public a(final Context context, final Cursor cursor, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        this.f(context, cursor, n);
    }
    
    public void a(Cursor j) {
        j = this.j(j);
        if (j != null) {
            j.close();
        }
    }
    
    public Cursor b() {
        return this.q;
    }
    
    public abstract CharSequence c(final Cursor p0);
    
    public abstract void e(final View p0, final Context p1, final Cursor p2);
    
    public void f(final Context r, final Cursor q, int n) {
        boolean o = false;
        if ((n & 0x1) == 0x1) {
            n |= 0x2;
            this.p = true;
        }
        else {
            this.p = false;
        }
        if (q != null) {
            o = true;
        }
        this.q = q;
        this.o = o;
        this.r = r;
        int columnIndexOrThrow;
        if (o) {
            columnIndexOrThrow = q.getColumnIndexOrThrow("_id");
        }
        else {
            columnIndexOrThrow = -1;
        }
        this.s = columnIndexOrThrow;
        DataSetObserver u;
        if ((n & 0x2) == 0x2) {
            this.t = new a();
            u = new b();
        }
        else {
            u = null;
            this.t = null;
        }
        this.u = u;
        if (o) {
            final a t = this.t;
            if (t != null) {
                q.registerContentObserver((ContentObserver)t);
            }
            final DataSetObserver u2 = this.u;
            if (u2 != null) {
                q.registerDataSetObserver(u2);
            }
        }
    }
    
    public abstract View g(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public int getCount() {
        if (this.o) {
            final Cursor q = this.q;
            if (q != null) {
                return q.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.o) {
            this.q.moveToPosition(n);
            View g;
            if ((g = view) == null) {
                g = this.g(this.r, this.q, viewGroup);
            }
            this.e(g, this.r, this.q);
            return g;
        }
        return null;
    }
    
    public Filter getFilter() {
        if (this.v == null) {
            this.v = new M.b((M.b.a)this);
        }
        return this.v;
    }
    
    public Object getItem(final int n) {
        if (this.o) {
            final Cursor q = this.q;
            if (q != null) {
                q.moveToPosition(n);
                return this.q;
            }
        }
        return null;
    }
    
    public long getItemId(final int n) {
        if (this.o) {
            final Cursor q = this.q;
            if (q != null && q.moveToPosition(n)) {
                return this.q.getLong(this.s);
            }
        }
        return 0L;
    }
    
    public View getView(final int i, final View view, final ViewGroup viewGroup) {
        if (!this.o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.q.moveToPosition(i)) {
            View h;
            if ((h = view) == null) {
                h = this.h(this.r, this.q, viewGroup);
            }
            this.e(h, this.r, this.q);
            return h;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("couldn't move cursor to position ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    public abstract View h(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public void i() {
        if (this.p) {
            final Cursor q = this.q;
            if (q != null && !q.isClosed()) {
                this.o = this.q.requery();
            }
        }
    }
    
    public Cursor j(final Cursor q) {
        final Cursor q2 = this.q;
        if (q == q2) {
            return null;
        }
        if (q2 != null) {
            final a t = this.t;
            if (t != null) {
                q2.unregisterContentObserver((ContentObserver)t);
            }
            final DataSetObserver u = this.u;
            if (u != null) {
                q2.unregisterDataSetObserver(u);
            }
        }
        if ((this.q = q) != null) {
            final a t2 = this.t;
            if (t2 != null) {
                q.registerContentObserver((ContentObserver)t2);
            }
            final DataSetObserver u2 = this.u;
            if (u2 != null) {
                q.registerDataSetObserver(u2);
            }
            this.s = q.getColumnIndexOrThrow("_id");
            this.o = true;
            this.notifyDataSetChanged();
            return q2;
        }
        this.s = -1;
        this.o = false;
        this.notifyDataSetInvalidated();
        return q2;
    }
    
    public class a extends ContentObserver
    {
        public a() {
            super(new Handler());
        }
        
        public boolean deliverSelfNotifications() {
            return true;
        }
        
        public void onChange(final boolean b) {
            M.a.this.i();
        }
    }
    
    public class b extends DataSetObserver
    {
        public void onChanged() {
            final a a = M.a.this;
            a.o = true;
            a.notifyDataSetChanged();
        }
        
        public void onInvalidated() {
            final a a = M.a.this;
            a.o = false;
            a.notifyDataSetInvalidated();
        }
    }
}
