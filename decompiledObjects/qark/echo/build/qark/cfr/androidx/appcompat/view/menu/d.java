/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyCharacterMap
 *  android.view.KeyCharacterMap$KeyData
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewConfiguration
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package androidx.appcompat.view.menu;

import I.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class d
implements C.a {
    public static final int[] A = new int[]{1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public a e;
    public ArrayList f;
    public ArrayList g;
    public boolean h;
    public ArrayList i;
    public ArrayList j;
    public boolean k;
    public int l = 0;
    public ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public ArrayList v = new ArrayList();
    public CopyOnWriteArrayList w = new CopyOnWriteArrayList();
    public e x;
    public boolean y = false;
    public boolean z;

    public d(Context context) {
        this.a = context;
        this.b = context.getResources();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        this.T(true);
    }

    public static int m(ArrayList arrayList, int n8) {
        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            if (((e)arrayList.get(i8)).d() > n8) continue;
            return i8 + 1;
        }
        return 0;
    }

    public static int x(int n8) {
        int[] arrn;
        int n9 = (-65536 & n8) >> 16;
        if (n9 >= 0 && n9 < (arrn = A).length) {
            return n8 & 65535 | arrn[n9] << 16;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public ArrayList A() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int n8 = this.f.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            e e8 = (e)this.f.get(i8);
            if (!e8.isVisible()) continue;
            this.g.add((Object)e8);
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean B() {
        return this.y;
    }

    public boolean C() {
        return this.c;
    }

    public boolean D() {
        return this.d;
    }

    public void E(e e8) {
        this.k = true;
        this.G(true);
    }

    public void F(e e8) {
        this.h = true;
        this.G(true);
    }

    public void G(boolean bl) {
        if (!this.q) {
            if (bl) {
                this.h = true;
                this.k = true;
            }
            this.h(bl);
            return;
        }
        this.r = true;
        if (bl) {
            this.s = true;
        }
    }

    public boolean H(MenuItem menuItem, int n8) {
        return this.I(menuItem, null, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean I(MenuItem menuItem, g g8, int n8) {
        boolean bl;
        block8 : {
            block9 : {
                boolean bl2;
                block10 : {
                    block7 : {
                        if ((menuItem = (e)menuItem) == null) {
                            return false;
                        }
                        if (!menuItem.isEnabled()) {
                            return false;
                        }
                        bl2 = menuItem.j();
                        menuItem.g();
                        if (!menuItem.i()) break block7;
                        bl = bl2 |= menuItem.expandActionView();
                        if (!bl2) break block8;
                        bl = bl2;
                        break block9;
                    }
                    if (menuItem.hasSubMenu()) break block10;
                    bl = bl2;
                    if ((n8 & 1) != 0) break block8;
                    bl = bl2;
                    break block9;
                }
                if ((n8 & 4) == 0) {
                    this.d(false);
                }
                if (!menuItem.hasSubMenu()) {
                    menuItem.w(new j(this.s(), this, (e)menuItem));
                }
                bl = bl2 |= this.i((j)menuItem.getSubMenu(), g8);
                if (bl2) break block8;
                bl = bl2;
            }
            this.d(true);
            return bl;
        }
        return bl;
    }

    public final void J(int n8, boolean bl) {
        if (n8 >= 0) {
            if (n8 >= this.f.size()) {
                return;
            }
            this.f.remove(n8);
            if (bl) {
                this.G(true);
            }
        }
    }

    public void K(g g8) {
        for (WeakReference weakReference : this.w) {
            g g9 = (g)weakReference.get();
            if (g9 != null && g9 != g8) continue;
            this.w.remove((Object)weakReference);
        }
    }

    public void L(a a8) {
        this.e = a8;
    }

    public void M(MenuItem menuItem) {
        int n8 = menuItem.getGroupId();
        int n9 = this.f.size();
        this.V();
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = (e)this.f.get(i8);
            if (e8.getGroupId() != n8 || !e8.l() || !e8.isCheckable()) continue;
            boolean bl = e8 == menuItem;
            e8.r(bl);
        }
        this.U();
    }

    public d N(int n8) {
        this.P(0, null, n8, null, null);
        return this;
    }

    public d O(Drawable drawable2) {
        this.P(0, null, 0, drawable2, null);
        return this;
    }

    public final void P(int n8, CharSequence charSequence, int n9, Drawable drawable2, View view) {
        Resources resources = this.y();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (n8 > 0) {
                this.n = resources.getText(n8);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (n9 > 0) {
                this.o = x.a.d(this.s(), n9);
            } else if (drawable2 != null) {
                this.o = drawable2;
            }
            this.p = null;
        }
        this.G(false);
    }

    public d Q(int n8) {
        this.P(n8, null, 0, null, null);
        return this;
    }

    public d R(CharSequence charSequence) {
        this.P(0, charSequence, 0, null, null);
        return this;
    }

    public d S(View view) {
        this.P(0, null, 0, null, view);
        return this;
    }

    public final void T(boolean bl) {
        block3 : {
            block2 : {
                if (!bl) break block2;
                int n8 = this.b.getConfiguration().keyboard;
                bl = true;
                if (n8 != 1 && u.b(ViewConfiguration.get((Context)this.a), this.a)) break block3;
            }
            bl = false;
        }
        this.d = bl;
    }

    public void U() {
        this.q = false;
        if (this.r) {
            this.r = false;
            this.G(this.s);
        }
    }

    public void V() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public MenuItem a(int n8, int n9, int n10, CharSequence object) {
        int n11 = d.x(n10);
        object = this.f(n8, n9, n10, n11, (CharSequence)object, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            object.u(contextMenuInfo);
        }
        contextMenuInfo = this.f;
        contextMenuInfo.add(d.m((ArrayList)contextMenuInfo, n11), object);
        this.G(true);
        return object;
    }

    public MenuItem add(int n8) {
        return this.a(0, 0, 0, this.b.getString(n8));
    }

    public MenuItem add(int n8, int n9, int n10, int n11) {
        return this.a(n8, n9, n10, this.b.getString(n11));
    }

    public MenuItem add(int n8, int n9, int n10, CharSequence charSequence) {
        return this.a(n8, n9, n10, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int n8, int n9, int n10, ComponentName componentName, Intent[] arrintent, Intent intent, int n11, MenuItem[] arrmenuItem) {
        PackageManager packageManager = this.a.getPackageManager();
        int n12 = 0;
        List list = packageManager.queryIntentActivityOptions(componentName, arrintent, intent, 0);
        int n13 = list != null ? list.size() : 0;
        int n14 = n12;
        if ((n11 & 1) == 0) {
            this.removeGroup(n8);
            n14 = n12;
        }
        while (n14 < n13) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n14);
            n11 = resolveInfo.specificIndex;
            componentName = n11 < 0 ? intent : arrintent[n11];
            componentName = new Intent((Intent)componentName);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            componentName.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            componentName = this.add(n8, n9, n10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent((Intent)componentName);
            if (arrmenuItem != null && (n11 = resolveInfo.specificIndex) >= 0) {
                arrmenuItem[n11] = componentName;
            }
            ++n14;
        }
        return n13;
    }

    public SubMenu addSubMenu(int n8) {
        return this.addSubMenu(0, 0, 0, this.b.getString(n8));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, int n11) {
        return this.addSubMenu(n8, n9, n10, this.b.getString(n11));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, CharSequence object) {
        object = (e)this.a(n8, n9, n10, (CharSequence)object);
        j j8 = new j(this.a, this, (e)object);
        object.w(j8);
        return j8;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    public void b(g g8, Context context) {
        this.w.add((Object)new WeakReference((Object)g8));
        g8.c(context, this);
        this.k = true;
    }

    public void c() {
        a a8 = this.e;
        if (a8 != null) {
            a8.b(this);
        }
    }

    public void clear() {
        e e8 = this.x;
        if (e8 != null) {
            this.e(e8);
        }
        this.f.clear();
        this.G(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        this.G(false);
    }

    public void close() {
        this.d(true);
    }

    public final void d(boolean bl) {
        if (this.u) {
            return;
        }
        this.u = true;
        for (WeakReference weakReference : this.w) {
            g g8 = (g)weakReference.get();
            if (g8 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            g8.b(this, bl);
        }
        this.u = false;
    }

    public boolean e(e e8) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        boolean bl3 = false;
        if (!bl) {
            if (this.x != e8) {
                return false;
            }
            this.V();
            Iterator iterator = this.w.iterator();
            bl2 = bl3;
            do {
                bl3 = bl2;
                if (!iterator.hasNext()) break;
                WeakReference weakReference = (WeakReference)iterator.next();
                g g8 = (g)weakReference.get();
                if (g8 == null) {
                    this.w.remove((Object)weakReference);
                    continue;
                }
                bl2 = bl3 = g8.h(this, e8);
                if (bl3) break;
            } while (true);
            this.U();
            bl2 = bl3;
            if (bl3) {
                this.x = null;
                bl2 = bl3;
            }
        }
        return bl2;
    }

    public final e f(int n8, int n9, int n10, int n11, CharSequence charSequence, int n12) {
        return new e(this, n8, n9, n10, n11, charSequence, n12);
    }

    public MenuItem findItem(int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = (e)this.f.get(i8);
            if (e8.getItemId() == n8) {
                return e8;
            }
            if (!e8.hasSubMenu() || (e8 = e8.getSubMenu().findItem(n8)) == null) continue;
            return e8;
        }
        return null;
    }

    public boolean g(d d8, MenuItem menuItem) {
        a a8 = this.e;
        if (a8 != null && a8.a(d8, menuItem)) {
            return true;
        }
        return false;
    }

    public MenuItem getItem(int n8) {
        return (MenuItem)this.f.get(n8);
    }

    public final void h(boolean bl) {
        if (this.w.isEmpty()) {
            return;
        }
        this.V();
        for (WeakReference weakReference : this.w) {
            g g8 = (g)weakReference.get();
            if (g8 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            g8.f(bl);
        }
        this.U();
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!((e)this.f.get(i8)).isVisible()) continue;
            return true;
        }
        return false;
    }

    public final boolean i(j j8, g g8) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (g8 != null) {
            bl2 = g8.e(j8);
        }
        for (WeakReference weakReference : this.w) {
            g g9 = (g)weakReference.get();
            if (g9 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            if (bl2) continue;
            bl2 = g9.e(j8);
        }
        return bl2;
    }

    public boolean isShortcutKey(int n8, KeyEvent keyEvent) {
        if (this.o(n8, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean j(e e8) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        this.V();
        Iterator iterator = this.w.iterator();
        do {
            bl = bl2;
            if (!iterator.hasNext()) break;
            WeakReference weakReference = (WeakReference)iterator.next();
            g g8 = (g)weakReference.get();
            if (g8 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            bl2 = bl = g8.j(this, e8);
            if (bl) break;
        } while (true);
        this.U();
        if (bl) {
            this.x = e8;
        }
        return bl;
    }

    public int k(int n8) {
        return this.l(n8, 0);
    }

    public int l(int n8, int n9) {
        int n10 = this.size();
        int n11 = n9;
        if (n9 < 0) {
            n11 = 0;
        }
        while (n11 < n10) {
            if (((e)this.f.get(n11)).getGroupId() == n8) {
                return n11;
            }
            ++n11;
        }
        return -1;
    }

    public int n(int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            if (((e)this.f.get(i8)).getItemId() != n8) continue;
            return i8;
        }
        return -1;
    }

    public e o(int n8, KeyEvent object) {
        ArrayList arrayList = this.v;
        arrayList.clear();
        this.p((List)arrayList, n8, (KeyEvent)object);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n9 = object.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        object.getKeyData(keyData);
        int n10 = arrayList.size();
        if (n10 == 1) {
            return (e)arrayList.get(0);
        }
        boolean bl = this.C();
        for (int i8 = 0; i8 < n10; ++i8) {
            char[] arrc;
            object = (e)arrayList.get(i8);
            char c8 = bl ? object.getAlphabeticShortcut() : object.getNumericShortcut();
            if (!(c8 == (arrc = keyData.meta)[0] && (n9 & 2) == 0 || c8 == arrc[2] && (n9 & 2) != 0) && (!bl || c8 != '\b' || n8 != 67)) continue;
            return object;
        }
        return null;
    }

    public void p(List list, int n8, KeyEvent keyEvent) {
        boolean bl = this.C();
        int n9 = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && n8 != 67) {
            return;
        }
        int n10 = this.f.size();
        for (int i8 = 0; i8 < n10; ++i8) {
            char[] arrc;
            e e8 = (e)this.f.get(i8);
            if (e8.hasSubMenu()) {
                ((d)e8.getSubMenu()).p(list, n8, keyEvent);
            }
            char c8 = bl ? e8.getAlphabeticShortcut() : e8.getNumericShortcut();
            int n11 = bl ? e8.getAlphabeticModifiers() : e8.getNumericModifiers();
            if ((n9 & 69647) != (n11 & 69647) || c8 == '\u0000' || c8 != (arrc = keyData.meta)[0] && c8 != arrc[2] && (!bl || c8 != '\b' || n8 != 67) || !e8.isEnabled()) continue;
            list.add((Object)e8);
        }
    }

    public boolean performIdentifierAction(int n8, int n9) {
        return this.H(this.findItem(n8), n9);
    }

    public boolean performShortcut(int n8, KeyEvent object, int n9) {
        boolean bl = (object = this.o(n8, (KeyEvent)object)) != null ? this.H((MenuItem)object, n9) : false;
        if ((n9 & 2) != 0) {
            this.d(true);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void q() {
        ArrayList arrayList = this.A();
        if (!this.k) {
            return;
        }
        Iterator iterator = this.w.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            g g8 = (g)weakReference.get();
            if (g8 == null) {
                this.w.remove((Object)weakReference);
                continue;
            }
            n8 |= g8.g();
        }
        this.i.clear();
        this.j.clear();
        this.j.addAll((Collection)this.A());
        this.k = false;
    }

    public ArrayList r() {
        this.q();
        return this.i;
    }

    public void removeGroup(int n8) {
        int n9 = this.k(n8);
        if (n9 >= 0) {
            int n10 = this.f.size();
            for (int i8 = 0; i8 < n10 - n9 && ((e)this.f.get(n9)).getGroupId() == n8; ++i8) {
                this.J(n9, false);
            }
            this.G(true);
        }
    }

    public void removeItem(int n8) {
        this.J(this.n(n8), true);
    }

    public Context s() {
        return this.a;
    }

    public void setGroupCheckable(int n8, boolean bl, boolean bl2) {
        int n9 = this.f.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = (e)this.f.get(i8);
            if (e8.getGroupId() != n8) continue;
            e8.s(bl2);
            e8.setCheckable(bl);
        }
    }

    public void setGroupDividerEnabled(boolean bl) {
        this.y = bl;
    }

    public void setGroupEnabled(int n8, boolean bl) {
        int n9 = this.f.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = (e)this.f.get(i8);
            if (e8.getGroupId() != n8) continue;
            e8.setEnabled(bl);
        }
    }

    public void setGroupVisible(int n8, boolean bl) {
        int n9 = this.f.size();
        boolean bl2 = false;
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = (e)this.f.get(i8);
            boolean bl3 = bl2;
            if (e8.getGroupId() == n8) {
                bl3 = bl2;
                if (e8.x(bl)) {
                    bl3 = true;
                }
            }
            bl2 = bl3;
        }
        if (bl2) {
            this.G(true);
        }
    }

    public void setQwertyMode(boolean bl) {
        this.c = bl;
        this.G(false);
    }

    public int size() {
        return this.f.size();
    }

    public e t() {
        return this.x;
    }

    public CharSequence u() {
        return this.n;
    }

    public ArrayList v() {
        this.q();
        return this.j;
    }

    public boolean w() {
        return this.t;
    }

    public Resources y() {
        return this.b;
    }

    public d z() {
        return this;
    }

    public static interface a {
        public boolean a(d var1, MenuItem var2);

        public void b(d var1);
    }

    public static interface b {
        public boolean a(e var1);
    }

}

