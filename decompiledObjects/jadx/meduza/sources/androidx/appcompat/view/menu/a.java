package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public Context f620a;

    /* renamed from: b, reason: collision with root package name */
    public Context f621b;

    /* renamed from: c, reason: collision with root package name */
    public f f622c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f623d;

    /* renamed from: e, reason: collision with root package name */
    public j.a f624e;
    public int f = R.layout.abc_action_menu_layout;

    /* renamed from: o, reason: collision with root package name */
    public int f625o = R.layout.abc_action_menu_item_layout;

    /* renamed from: p, reason: collision with root package name */
    public k f626p;

    public a(Context context) {
        this.f620a = context;
        this.f623d = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.f624e = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(h hVar) {
        return false;
    }
}
