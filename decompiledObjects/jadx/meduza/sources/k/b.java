package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8802a;

    /* renamed from: b, reason: collision with root package name */
    public h<z.b, MenuItem> f8803b;

    /* renamed from: c, reason: collision with root package name */
    public h<z.c, SubMenu> f8804c;

    public b(Context context) {
        this.f8802a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof z.b)) {
            return menuItem;
        }
        z.b bVar = (z.b) menuItem;
        if (this.f8803b == null) {
            this.f8803b = new h<>();
        }
        MenuItem orDefault = this.f8803b.getOrDefault(bVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f8802a, bVar);
        this.f8803b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof z.c)) {
            return subMenu;
        }
        z.c cVar = (z.c) subMenu;
        if (this.f8804c == null) {
            this.f8804c = new h<>();
        }
        SubMenu orDefault = this.f8804c.getOrDefault(cVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        g gVar = new g(this.f8802a, cVar);
        this.f8804c.put(cVar, gVar);
        return gVar;
    }
}
