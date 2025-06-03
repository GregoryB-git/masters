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

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: o, reason: collision with root package name */
    public boolean f3464o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3465p;

    /* renamed from: q, reason: collision with root package name */
    public Cursor f3466q;

    /* renamed from: r, reason: collision with root package name */
    public Context f3467r;

    /* renamed from: s, reason: collision with root package name */
    public int f3468s;

    /* renamed from: t, reason: collision with root package name */
    public C0064a f3469t;

    /* renamed from: u, reason: collision with root package name */
    public DataSetObserver f3470u;

    /* renamed from: v, reason: collision with root package name */
    public M.b f3471v;

    /* renamed from: M.a$a, reason: collision with other inner class name */
    public class C0064a extends ContentObserver {
        public C0064a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f3464o = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3464o = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z7) {
        f(context, cursor, z7 ? 1 : 2);
    }

    @Override // M.b.a
    public void a(Cursor cursor) {
        Cursor j7 = j(cursor);
        if (j7 != null) {
            j7.close();
        }
    }

    @Override // M.b.a
    public Cursor b() {
        return this.f3466q;
    }

    @Override // M.b.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i7) {
        b bVar;
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f3465p = true;
        } else {
            this.f3465p = false;
        }
        boolean z7 = cursor != null;
        this.f3466q = cursor;
        this.f3464o = z7;
        this.f3467r = context;
        this.f3468s = z7 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f3469t = new C0064a();
            bVar = new b();
        } else {
            bVar = null;
            this.f3469t = null;
        }
        this.f3470u = bVar;
        if (z7) {
            C0064a c0064a = this.f3469t;
            if (c0064a != null) {
                cursor.registerContentObserver(c0064a);
            }
            DataSetObserver dataSetObserver = this.f3470u;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3464o || (cursor = this.f3466q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3464o) {
            return null;
        }
        this.f3466q.moveToPosition(i7);
        if (view == null) {
            view = g(this.f3467r, this.f3466q, viewGroup);
        }
        e(view, this.f3467r, this.f3466q);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3471v == null) {
            this.f3471v = new M.b(this);
        }
        return this.f3471v;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f3464o || (cursor = this.f3466q) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f3466q;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f3464o && (cursor = this.f3466q) != null && cursor.moveToPosition(i7)) {
            return this.f3466q.getLong(this.f3468s);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3464o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3466q.moveToPosition(i7)) {
            if (view == null) {
                view = h(this.f3467r, this.f3466q, viewGroup);
            }
            e(view, this.f3467r, this.f3466q);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i7);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f3465p || (cursor = this.f3466q) == null || cursor.isClosed()) {
            return;
        }
        this.f3464o = this.f3466q.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f3466q;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0064a c0064a = this.f3469t;
            if (c0064a != null) {
                cursor2.unregisterContentObserver(c0064a);
            }
            DataSetObserver dataSetObserver = this.f3470u;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3466q = cursor;
        if (cursor != null) {
            C0064a c0064a2 = this.f3469t;
            if (c0064a2 != null) {
                cursor.registerContentObserver(c0064a2);
            }
            DataSetObserver dataSetObserver2 = this.f3470u;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3468s = cursor.getColumnIndexOrThrow("_id");
            this.f3464o = true;
            notifyDataSetChanged();
        } else {
            this.f3468s = -1;
            this.f3464o = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
