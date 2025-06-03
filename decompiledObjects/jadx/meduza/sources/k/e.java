package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import r.h;

/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final z.a f8816d;

    public e(Context context, z.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f8816d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(this.f8816d.add(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f8816d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f8816d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f8816d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f8816d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return d(this.f8816d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f8816d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f8816d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f8816d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        h<z.b, MenuItem> hVar = this.f8803b;
        if (hVar != null) {
            hVar.clear();
        }
        h<z.c, SubMenu> hVar2 = this.f8804c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f8816d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f8816d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(this.f8816d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(this.f8816d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f8816d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f8816d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f8816d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f8816d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f8803b != null) {
            int i11 = 0;
            while (true) {
                h<z.b, MenuItem> hVar = this.f8803b;
                if (i11 >= hVar.f13500c) {
                    break;
                }
                if (hVar.i(i11).getGroupId() == i10) {
                    this.f8803b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f8816d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f8803b != null) {
            int i11 = 0;
            while (true) {
                h<z.b, MenuItem> hVar = this.f8803b;
                if (i11 >= hVar.f13500c) {
                    break;
                }
                if (hVar.i(i11).getItemId() == i10) {
                    this.f8803b.j(i11);
                    break;
                }
                i11++;
            }
        }
        this.f8816d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f8816d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f8816d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f8816d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f8816d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8816d.size();
    }
}
