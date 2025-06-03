package m0;

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
import defpackage.f;
import m0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: o, reason: collision with root package name */
    public m0.b f9863o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9859b = true;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f9860c = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9858a = false;

    /* renamed from: d, reason: collision with root package name */
    public int f9861d = -1;

    /* renamed from: e, reason: collision with root package name */
    public C0146a f9862e = new C0146a();
    public b f = new b();

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    public class C0146a extends ContentObserver {
        public C0146a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f9859b || (cursor = aVar.f9860c) == null || cursor.isClosed()) {
                return;
            }
            aVar.f9858a = aVar.f9860c.requery();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f9858a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f9858a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f9860c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0146a c0146a = this.f9862e;
                if (c0146a != null) {
                    cursor2.unregisterContentObserver(c0146a);
                }
                b bVar = this.f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f9860c = cursor;
            if (cursor != null) {
                C0146a c0146a2 = this.f9862e;
                if (c0146a2 != null) {
                    cursor.registerContentObserver(c0146a2);
                }
                b bVar2 = this.f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f9861d = cursor.getColumnIndexOrThrow("_id");
                this.f9858a = true;
                notifyDataSetChanged();
            } else {
                this.f9861d = -1;
                this.f9858a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f9858a || (cursor = this.f9860c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9858a) {
            return null;
        }
        this.f9860c.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f9869r.inflate(cVar.f9868q, viewGroup, false);
        }
        b(view, this.f9860c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f9863o == null) {
            this.f9863o = new m0.b(this);
        }
        return this.f9863o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f9858a || (cursor = this.f9860c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f9860c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f9858a && (cursor = this.f9860c) != null && cursor.moveToPosition(i10)) {
            return this.f9860c.getLong(this.f9861d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9858a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f9860c.moveToPosition(i10)) {
            throw new IllegalStateException(f.h("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.f9860c);
        return view;
    }
}
