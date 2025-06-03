// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.view.Menu;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import I.u;
import android.view.ViewConfiguration;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.MenuItem;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import java.util.ArrayList;
import android.content.res.Resources;
import android.content.Context;
import C.a;

public class d implements C.a
{
    public static final int[] A;
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
    public int l;
    public ContextMenu$ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ArrayList v;
    public CopyOnWriteArrayList w;
    public e x;
    public boolean y;
    public boolean z;
    
    static {
        A = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public d(final Context a) {
        this.l = 0;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = new ArrayList();
        this.w = new CopyOnWriteArrayList();
        this.y = false;
        this.a = a;
        this.b = a.getResources();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.T(this.k = true);
    }
    
    public static int m(final ArrayList list, final int n) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).d() <= n) {
                return i + 1;
            }
        }
        return 0;
    }
    
    public static int x(final int n) {
        final int n2 = (0xFFFF0000 & n) >> 16;
        if (n2 >= 0) {
            final int[] a = d.A;
            if (n2 < a.length) {
                return (n & 0xFFFF) | a[n2] << 16;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public ArrayList A() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.isVisible()) {
                this.g.add(e);
            }
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
    
    public void E(final e e) {
        this.G(this.k = true);
    }
    
    public void F(final e e) {
        this.G(this.h = true);
    }
    
    public void G(final boolean b) {
        if (!this.q) {
            if (b) {
                this.h = true;
                this.k = true;
            }
            this.h(b);
            return;
        }
        this.r = true;
        if (b) {
            this.s = true;
        }
    }
    
    public boolean H(final MenuItem menuItem, final int n) {
        return this.I(menuItem, null, n);
    }
    
    public boolean I(final MenuItem menuItem, final g g, final int n) {
        final e e = (e)menuItem;
        if (e == null) {
            return false;
        }
        if (!e.isEnabled()) {
            return false;
        }
        final boolean j = e.j();
        e.g();
        boolean b3;
        if (e.i()) {
            final boolean b2;
            final boolean b = b2 = (j | e.expandActionView());
            if (!b) {
                return b2;
            }
            b3 = b;
        }
        else if (!e.hasSubMenu()) {
            final boolean b2 = j;
            if ((n & 0x1) != 0x0) {
                return b2;
            }
            b3 = j;
        }
        else {
            if ((n & 0x4) == 0x0) {
                this.d(false);
            }
            if (!e.hasSubMenu()) {
                e.w(new j(this.s(), this, e));
            }
            final boolean b2;
            final boolean b4 = b2 = (j | this.i((j)e.getSubMenu(), g));
            if (b4) {
                return b2;
            }
            b3 = b4;
        }
        this.d(true);
        return b3;
    }
    
    public final void J(final int index, final boolean b) {
        if (index >= 0) {
            if (index >= this.f.size()) {
                return;
            }
            this.f.remove(index);
            if (b) {
                this.G(true);
            }
        }
    }
    
    public void K(final g g) {
        for (final WeakReference<g> o : this.w) {
            final g g2 = o.get();
            if (g2 == null || g2 == g) {
                this.w.remove(o);
            }
        }
    }
    
    public void L(final a e) {
        this.e = e;
    }
    
    public void M(final MenuItem menuItem) {
        final int groupId = menuItem.getGroupId();
        final int size = this.f.size();
        this.V();
        for (int i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.getGroupId() == groupId) {
                if (e.l()) {
                    if (e.isCheckable()) {
                        e.r(e == menuItem);
                    }
                }
            }
        }
        this.U();
    }
    
    public d N(final int n) {
        this.P(0, null, n, null, null);
        return this;
    }
    
    public d O(final Drawable drawable) {
        this.P(0, null, 0, drawable, null);
        return this;
    }
    
    public final void P(final int n, final CharSequence n2, final int n3, final Drawable o, final View p5) {
        final Resources y = this.y();
        if (p5 != null) {
            this.p = p5;
            this.n = null;
            this.o = null;
        }
        else {
            if (n > 0) {
                this.n = y.getText(n);
            }
            else if (n2 != null) {
                this.n = n2;
            }
            if (n3 > 0) {
                this.o = x.a.d(this.s(), n3);
            }
            else if (o != null) {
                this.o = o;
            }
            this.p = null;
        }
        this.G(false);
    }
    
    public d Q(final int n) {
        this.P(n, null, 0, null, null);
        return this;
    }
    
    public d R(final CharSequence charSequence) {
        this.P(0, charSequence, 0, null, null);
        return this;
    }
    
    public d S(final View view) {
        this.P(0, null, 0, null, view);
        return this;
    }
    
    public final void T(final boolean b) {
        boolean d = false;
        Label_0044: {
            if (b) {
                final int keyboard = this.b.getConfiguration().keyboard;
                d = true;
                if (keyboard != 1 && I.u.b(ViewConfiguration.get(this.a), this.a)) {
                    break Label_0044;
                }
            }
            d = false;
        }
        this.d = d;
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
    
    public MenuItem a(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int x = x(n3);
        final e f = this.f(n, n2, n3, x, charSequence, this.l);
        final ContextMenu$ContextMenuInfo m = this.m;
        if (m != null) {
            f.u(m);
        }
        final ArrayList f2 = this.f;
        f2.add(m(f2, x), f);
        this.G(true);
        return (MenuItem)f;
    }
    
    public MenuItem add(final int n) {
        return this.a(0, 0, 0, this.b.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(n, n2, n3, this.b.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            n4 = resolveInfo.specificIndex;
            Intent intent2;
            if (n4 < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[n4];
            }
            final Intent intent3 = new Intent(intent2);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            final MenuItem setIntent = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (array2 != null) {
                n4 = resolveInfo.specificIndex;
                if (n4 >= 0) {
                    array2[n4] = setIntent;
                }
            }
            ++i;
        }
        return size;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.b.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.b.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final e e = (e)this.a(n, n2, n3, charSequence);
        final j j = new j(this.a, this, e);
        e.w(j);
        return (SubMenu)j;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public void b(final g referent, final Context context) {
        this.w.add(new WeakReference<g>(referent));
        referent.c(context, this);
        this.k = true;
    }
    
    public void c() {
        final a e = this.e;
        if (e != null) {
            e.b(this);
        }
    }
    
    public void clear() {
        final e x = this.x;
        if (x != null) {
            this.e(x);
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
    
    public final void d(final boolean b) {
        if (this.u) {
            return;
        }
        this.u = true;
        for (final WeakReference<g> o : this.w) {
            final g g = o.get();
            if (g == null) {
                this.w.remove(o);
            }
            else {
                g.b(this, b);
            }
        }
        this.u = false;
    }
    
    public boolean e(final e e) {
        final boolean empty = this.w.isEmpty();
        boolean b = false;
        final boolean b2 = false;
        if (!empty) {
            if (this.x != e) {
                return false;
            }
            this.V();
            final Iterator iterator = this.w.iterator();
            boolean h = b2;
            boolean b3;
            while (true) {
                b3 = h;
                if (!iterator.hasNext()) {
                    break;
                }
                final WeakReference<g> o = iterator.next();
                final g g = o.get();
                if (g == null) {
                    this.w.remove(o);
                }
                else {
                    b3 = (h = g.h(this, e));
                    if (b3) {
                        break;
                    }
                    continue;
                }
            }
            this.U();
            b = b3;
            if (b3) {
                this.x = null;
                b = b3;
            }
        }
        return b;
    }
    
    public final e f(final int n, final int n2, final int n3, final int n4, final CharSequence charSequence, final int n5) {
        return new e(this, n, n2, n3, n4, charSequence, n5);
    }
    
    public MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.getItemId() == n) {
                return (MenuItem)e;
            }
            if (e.hasSubMenu()) {
                final MenuItem item = ((Menu)e.getSubMenu()).findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public boolean g(final d d, final MenuItem menuItem) {
        final a e = this.e;
        return e != null && e.a(d, menuItem);
    }
    
    public MenuItem getItem(final int index) {
        return this.f.get(index);
    }
    
    public final void h(final boolean b) {
        if (this.w.isEmpty()) {
            return;
        }
        this.V();
        for (final WeakReference<g> o : this.w) {
            final g g = o.get();
            if (g == null) {
                this.w.remove(o);
            }
            else {
                g.f(b);
            }
        }
        this.U();
    }
    
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (((e)this.f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean i(final j j, final g g) {
        final boolean empty = this.w.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        if (g != null) {
            b = g.e(j);
        }
        for (final WeakReference<g> o : this.w) {
            final g g2 = o.get();
            if (g2 == null) {
                this.w.remove(o);
            }
            else {
                if (b) {
                    continue;
                }
                b = g2.e(j);
            }
        }
        return b;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.o(n, keyEvent) != null;
    }
    
    public boolean j(final e x) {
        final boolean empty = this.w.isEmpty();
        boolean j = false;
        if (empty) {
            return false;
        }
        this.V();
        final Iterator iterator = this.w.iterator();
        boolean b;
        while (true) {
            b = j;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference<g> o = iterator.next();
            final g g = o.get();
            if (g == null) {
                this.w.remove(o);
            }
            else {
                b = (j = g.j(this, x));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.U();
        if (b) {
            this.x = x;
        }
        return b;
    }
    
    public int k(final int n) {
        return this.l(n, 0);
    }
    
    public int l(final int n, final int n2) {
        final int size = this.size();
        int i = n2;
        if (n2 < 0) {
            i = 0;
        }
        while (i < size) {
            if (((e)this.f.get(i)).getGroupId() == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public int n(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (((e)this.f.get(i)).getItemId() == n) {
                return i;
            }
        }
        return -1;
    }
    
    public e o(final int n, final KeyEvent keyEvent) {
        final ArrayList v = this.v;
        v.clear();
        this.p(v, n, keyEvent);
        if (v.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = v.size();
        if (size == 1) {
            return v.get(0);
        }
        final boolean c = this.C();
        for (int i = 0; i < size; ++i) {
            final e e = v.get(i);
            char c2;
            if (c) {
                c2 = e.getAlphabeticShortcut();
            }
            else {
                c2 = e.getNumericShortcut();
            }
            final char[] meta = keyCharacterMap$KeyData.meta;
            if ((c2 == meta[0] && (metaState & 0x2) == 0x0) || (c2 == meta[2] && (metaState & 0x2) != 0x0) || (c && c2 == '\b' && n == 67)) {
                return e;
            }
        }
        return null;
    }
    
    public void p(final List list, final int n, final KeyEvent keyEvent) {
        final boolean c = this.C();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.hasSubMenu()) {
                ((d)e.getSubMenu()).p(list, n, keyEvent);
            }
            char c2;
            if (c) {
                c2 = e.getAlphabeticShortcut();
            }
            else {
                c2 = e.getNumericShortcut();
            }
            int n2;
            if (c) {
                n2 = e.getAlphabeticModifiers();
            }
            else {
                n2 = e.getNumericModifiers();
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c2 != '\0') {
                final char[] meta = keyCharacterMap$KeyData.meta;
                if ((c2 == meta[0] || c2 == meta[2] || (c && c2 == '\b' && n == 67)) && e.isEnabled()) {
                    list.add(e);
                }
            }
        }
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.H(this.findItem(n), n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final e o = this.o(n, keyEvent);
        final boolean b = o != null && this.H((MenuItem)o, n2);
        if ((n2 & 0x2) != 0x0) {
            this.d(true);
        }
        return b;
    }
    
    public void q() {
        final ArrayList a = this.A();
        if (!this.k) {
            return;
        }
        final Iterator<WeakReference<g>> iterator = (Iterator<WeakReference<g>>)this.w.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference<g> o = iterator.next();
            final g g = o.get();
            if (g == null) {
                this.w.remove(o);
            }
            else {
                b |= g.g();
            }
        }
        if (b) {
            this.i.clear();
            this.j.clear();
            for (int size = a.size(), i = 0; i < size; ++i) {
                final e e = a.get(i);
                ArrayList list;
                if (e.k()) {
                    list = this.i;
                }
                else {
                    list = this.j;
                }
                list.add(e);
            }
        }
        else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(this.A());
        }
        this.k = false;
    }
    
    public ArrayList r() {
        this.q();
        return this.i;
    }
    
    public void removeGroup(final int n) {
        final int k = this.k(n);
        if (k >= 0) {
            for (int size = this.f.size(), n2 = 0; n2 < size - k && this.f.get(k).getGroupId() == n; ++n2) {
                this.J(k, false);
            }
            this.G(true);
        }
    }
    
    public void removeItem(final int n) {
        this.J(this.n(n), true);
    }
    
    public Context s() {
        return this.a;
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.getGroupId() == n) {
                e.s(b);
                e.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean y) {
        this.y = y;
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final e e = this.f.get(i);
            if (e.getGroupId() == n) {
                e.setEnabled(enabled);
            }
        }
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        final int size = this.f.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final e e = this.f.get(i);
            int n3 = n2;
            if (e.getGroupId() == n) {
                n3 = n2;
                if (e.x(b)) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.G(true);
        }
    }
    
    public void setQwertyMode(final boolean c) {
        this.c = c;
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
    
    public interface a
    {
        boolean a(final d p0, final MenuItem p1);
        
        void b(final d p0);
    }
    
    public interface b
    {
        boolean a(final e p0);
    }
}
