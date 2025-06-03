package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8203a;

    /* renamed from: b, reason: collision with root package name */
    public final j.a f8204b;

    public static class a implements a.InterfaceC0121a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f8205a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f8206b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f8207c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final r.h<Menu, Menu> f8208d = new r.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f8206b = context;
            this.f8205a = callback;
        }

        @Override // j.a.InterfaceC0121a
        public final boolean a(j.a aVar, androidx.appcompat.view.menu.f fVar) {
            ActionMode.Callback callback = this.f8205a;
            e e10 = e(aVar);
            Menu orDefault = this.f8208d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new k.e(this.f8206b, fVar);
                this.f8208d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e10, orDefault);
        }

        @Override // j.a.InterfaceC0121a
        public final void b(j.a aVar) {
            this.f8205a.onDestroyActionMode(e(aVar));
        }

        @Override // j.a.InterfaceC0121a
        public final boolean c(j.a aVar, androidx.appcompat.view.menu.f fVar) {
            ActionMode.Callback callback = this.f8205a;
            e e10 = e(aVar);
            Menu orDefault = this.f8208d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new k.e(this.f8206b, fVar);
                this.f8208d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e10, orDefault);
        }

        @Override // j.a.InterfaceC0121a
        public final boolean d(j.a aVar, MenuItem menuItem) {
            return this.f8205a.onActionItemClicked(e(aVar), new k.c(this.f8206b, (z.b) menuItem));
        }

        public final e e(j.a aVar) {
            int size = this.f8207c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f8207c.get(i10);
                if (eVar != null && eVar.f8204b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f8206b, aVar);
            this.f8207c.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, j.a aVar) {
        this.f8203a = context;
        this.f8204b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f8204b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f8204b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new k.e(this.f8203a, this.f8204b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f8204b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f8204b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f8204b.f8191a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f8204b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f8204b.f8192b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f8204b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f8204b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f8204b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f8204b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f8204b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f8204b.f8191a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f8204b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f8204b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f8204b.p(z10);
    }
}
