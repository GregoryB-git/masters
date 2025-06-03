package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import io.meduza.meduza.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f652a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f653b;

    /* renamed from: c, reason: collision with root package name */
    public f f654c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f655d;

    /* renamed from: e, reason: collision with root package name */
    public j.a f656e;
    public a f;

    public class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f657a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f654c;
            h hVar = fVar.f685w;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f673j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f657a = i10;
                        return;
                    }
                }
            }
            this.f657a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i10) {
            f fVar = d.this.f654c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f673j;
            d.this.getClass();
            int i11 = i10 + 0;
            int i12 = this.f657a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = d.this.f654c;
            fVar.i();
            int size = fVar.f673j.size();
            d.this.getClass();
            int i10 = size + 0;
            return this.f657a < 0 ? i10 : i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f653b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f652a = context;
        this.f653b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        j.a aVar = this.f656e;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.f656e = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Context context, f fVar) {
        if (this.f652a != null) {
            this.f652a = context;
            if (this.f653b == null) {
                this.f653b = LayoutInflater.from(context);
            }
        }
        this.f654c = fVar;
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        b.a aVar = new b.a(mVar.f665a);
        d dVar = new d(aVar.getContext());
        gVar.f690c = dVar;
        dVar.f656e = gVar;
        f fVar = gVar.f688a;
        fVar.b(dVar, fVar.f665a);
        d dVar2 = gVar.f690c;
        if (dVar2.f == null) {
            dVar2.f = dVar2.new a();
        }
        a aVar2 = dVar2.f;
        AlertController.b bVar = aVar.f590a;
        bVar.f582m = aVar2;
        bVar.f583n = gVar;
        View view = mVar.f678o;
        if (view != null) {
            bVar.f575e = view;
        } else {
            bVar.f573c = mVar.f677n;
            aVar.setTitle(mVar.f676m);
        }
        aVar.f590a.f581l = gVar;
        androidx.appcompat.app.b create = aVar.create();
        gVar.f689b = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f689b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f689b.show();
        j.a aVar3 = this.f656e;
        if (aVar3 == null) {
            return true;
        }
        aVar3.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f654c.q(this.f.getItem(i10), this, 0);
    }
}
