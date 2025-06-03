package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class d implements C.a {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f8442A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f8443a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f8444b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8445c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8446d;

    /* renamed from: e, reason: collision with root package name */
    public a f8447e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f8455m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f8456n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f8457o;

    /* renamed from: p, reason: collision with root package name */
    public View f8458p;

    /* renamed from: x, reason: collision with root package name */
    public e f8466x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8468z;

    /* renamed from: l, reason: collision with root package name */
    public int f8454l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8459q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8460r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8461s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8462t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8463u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f8464v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f8465w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f8467y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f8448f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f8449g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f8450h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f8451i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f8452j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f8453k = true;

    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    public interface b {
        boolean a(e eVar);
    }

    public d(Context context) {
        this.f8443a = context;
        this.f8444b = context.getResources();
        T(true);
    }

    public static int m(ArrayList arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((e) arrayList.get(size)).d() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int x(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = f8442A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public ArrayList A() {
        if (!this.f8450h) {
            return this.f8449g;
        }
        this.f8449g.clear();
        int size = this.f8448f.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f8448f.get(i7);
            if (eVar.isVisible()) {
                this.f8449g.add(eVar);
            }
        }
        this.f8450h = false;
        this.f8453k = true;
        return this.f8449g;
    }

    public boolean B() {
        return this.f8467y;
    }

    public boolean C() {
        return this.f8445c;
    }

    public boolean D() {
        return this.f8446d;
    }

    public void E(e eVar) {
        this.f8453k = true;
        G(true);
    }

    public void F(e eVar) {
        this.f8450h = true;
        G(true);
    }

    public void G(boolean z7) {
        if (this.f8459q) {
            this.f8460r = true;
            if (z7) {
                this.f8461s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f8450h = true;
            this.f8453k = true;
        }
        h(z7);
    }

    public boolean H(MenuItem menuItem, int i7) {
        return I(menuItem, null, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if ((r7 & 1) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        d(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I(android.view.MenuItem r5, androidx.appcompat.view.menu.g r6, int r7) {
        /*
            r4 = this;
            androidx.appcompat.view.menu.e r5 = (androidx.appcompat.view.menu.e) r5
            r0 = 0
            if (r5 == 0) goto L58
            boolean r1 = r5.isEnabled()
            if (r1 != 0) goto Lc
            goto L58
        Lc:
            boolean r1 = r5.j()
            r5.g()
            boolean r2 = r5.i()
            r3 = 1
            if (r2 == 0) goto L25
            boolean r5 = r5.expandActionView()
            r1 = r1 | r5
            if (r1 == 0) goto L57
        L21:
            r4.d(r3)
            goto L57
        L25:
            boolean r2 = r5.hasSubMenu()
            if (r2 != 0) goto L30
            r5 = r7 & 1
            if (r5 != 0) goto L57
            goto L21
        L30:
            r7 = r7 & 4
            if (r7 != 0) goto L37
            r4.d(r0)
        L37:
            boolean r7 = r5.hasSubMenu()
            if (r7 != 0) goto L49
            androidx.appcompat.view.menu.j r7 = new androidx.appcompat.view.menu.j
            android.content.Context r0 = r4.s()
            r7.<init>(r0, r4, r5)
            r5.w(r7)
        L49:
            android.view.SubMenu r5 = r5.getSubMenu()
            androidx.appcompat.view.menu.j r5 = (androidx.appcompat.view.menu.j) r5
            boolean r5 = r4.i(r5, r6)
            r1 = r1 | r5
            if (r1 != 0) goto L57
            goto L21
        L57:
            return r1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.I(android.view.MenuItem, androidx.appcompat.view.menu.g, int):boolean");
    }

    public final void J(int i7, boolean z7) {
        if (i7 < 0 || i7 >= this.f8448f.size()) {
            return;
        }
        this.f8448f.remove(i7);
        if (z7) {
            G(true);
        }
    }

    public void K(g gVar) {
        Iterator it = this.f8465w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null || gVar2 == gVar) {
                this.f8465w.remove(weakReference);
            }
        }
    }

    public void L(a aVar) {
        this.f8447e = aVar;
    }

    public void M(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f8448f.size();
        V();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f8448f.get(i7);
            if (eVar.getGroupId() == groupId && eVar.l() && eVar.isCheckable()) {
                eVar.r(eVar == menuItem);
            }
        }
        U();
    }

    public d N(int i7) {
        P(0, null, i7, null, null);
        return this;
    }

    public d O(Drawable drawable) {
        P(0, null, 0, drawable, null);
        return this;
    }

    public final void P(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources y7 = y();
        if (view != null) {
            this.f8458p = view;
            this.f8456n = null;
            this.f8457o = null;
        } else {
            if (i7 > 0) {
                this.f8456n = y7.getText(i7);
            } else if (charSequence != null) {
                this.f8456n = charSequence;
            }
            if (i8 > 0) {
                this.f8457o = AbstractC2112a.d(s(), i8);
            } else if (drawable != null) {
                this.f8457o = drawable;
            }
            this.f8458p = null;
        }
        G(false);
    }

    public d Q(int i7) {
        P(i7, null, 0, null, null);
        return this;
    }

    public d R(CharSequence charSequence) {
        P(0, charSequence, 0, null, null);
        return this;
    }

    public d S(View view) {
        P(0, null, 0, null, view);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (I.AbstractC0423u.b(android.view.ViewConfiguration.get(r2.f8443a), r2.f8443a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f8444b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f8443a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f8443a
            boolean r3 = I.AbstractC0423u.b(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f8446d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.T(boolean):void");
    }

    public void U() {
        this.f8459q = false;
        if (this.f8460r) {
            this.f8460r = false;
            G(this.f8461s);
        }
    }

    public void V() {
        if (this.f8459q) {
            return;
        }
        this.f8459q = true;
        this.f8460r = false;
        this.f8461s = false;
    }

    public MenuItem a(int i7, int i8, int i9, CharSequence charSequence) {
        int x7 = x(i9);
        e f7 = f(i7, i8, i9, x7, charSequence, this.f8454l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f8455m;
        if (contextMenuInfo != null) {
            f7.u(contextMenuInfo);
        }
        ArrayList arrayList = this.f8448f;
        arrayList.add(m(arrayList, x7), f7);
        G(true);
        return f7;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return a(0, 0, 0, this.f8444b.getString(i7));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f8443a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f8444b.getString(i7));
    }

    public void b(g gVar, Context context) {
        this.f8465w.add(new WeakReference(gVar));
        gVar.c(context, this);
        this.f8453k = true;
    }

    public void c() {
        a aVar = this.f8447e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        e eVar = this.f8466x;
        if (eVar != null) {
            e(eVar);
        }
        this.f8448f.clear();
        G(true);
    }

    public void clearHeader() {
        this.f8457o = null;
        this.f8456n = null;
        this.f8458p = null;
        G(false);
    }

    @Override // android.view.Menu
    public void close() {
        d(true);
    }

    public final void d(boolean z7) {
        if (this.f8463u) {
            return;
        }
        this.f8463u = true;
        Iterator it = this.f8465w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f8465w.remove(weakReference);
            } else {
                gVar.b(this, z7);
            }
        }
        this.f8463u = false;
    }

    public boolean e(e eVar) {
        boolean z7 = false;
        if (!this.f8465w.isEmpty() && this.f8466x == eVar) {
            V();
            Iterator it = this.f8465w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f8465w.remove(weakReference);
                } else {
                    z7 = gVar.h(this, eVar);
                    if (z7) {
                        break;
                    }
                }
            }
            U();
            if (z7) {
                this.f8466x = null;
            }
        }
        return z7;
    }

    public final e f(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new e(this, i7, i8, i9, i10, charSequence, i11);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem findItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f8448f.get(i8);
            if (eVar.getItemId() == i7) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (findItem = eVar.getSubMenu().findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(d dVar, MenuItem menuItem) {
        a aVar = this.f8447e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return (MenuItem) this.f8448f.get(i7);
    }

    public final void h(boolean z7) {
        if (this.f8465w.isEmpty()) {
            return;
        }
        V();
        Iterator it = this.f8465w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f8465w.remove(weakReference);
            } else {
                gVar.f(z7);
            }
        }
        U();
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f8468z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((e) this.f8448f.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(j jVar, g gVar) {
        if (this.f8465w.isEmpty()) {
            return false;
        }
        boolean e7 = gVar != null ? gVar.e(jVar) : false;
        Iterator it = this.f8465w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null) {
                this.f8465w.remove(weakReference);
            } else if (!e7) {
                e7 = gVar2.e(jVar);
            }
        }
        return e7;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return o(i7, keyEvent) != null;
    }

    public boolean j(e eVar) {
        boolean z7 = false;
        if (this.f8465w.isEmpty()) {
            return false;
        }
        V();
        Iterator it = this.f8465w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f8465w.remove(weakReference);
            } else {
                z7 = gVar.j(this, eVar);
                if (z7) {
                    break;
                }
            }
        }
        U();
        if (z7) {
            this.f8466x = eVar;
        }
        return z7;
    }

    public int k(int i7) {
        return l(i7, 0);
    }

    public int l(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (((e) this.f8448f.get(i8)).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public int n(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((e) this.f8448f.get(i8)).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    public e o(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f8464v;
        arrayList.clear();
        p(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (e) arrayList.get(0);
        }
        boolean C7 = C();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) arrayList.get(i8);
            char alphabeticShortcut = C7 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (C7 && alphabeticShortcut == '\b' && i7 == 67))) {
                return eVar;
            }
        }
        return null;
    }

    public void p(List list, int i7, KeyEvent keyEvent) {
        boolean C7 = C();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f8448f.size();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar = (e) this.f8448f.get(i8);
                if (eVar.hasSubMenu()) {
                    ((d) eVar.getSubMenu()).p(list, i7, keyEvent);
                }
                char alphabeticShortcut = C7 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
                if ((modifiers & 69647) == ((C7 ? eVar.getAlphabeticModifiers() : eVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (C7 && alphabeticShortcut == '\b' && i7 == 67)) && eVar.isEnabled()) {
                        list.add(eVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return H(findItem(i7), i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        e o7 = o(i7, keyEvent);
        boolean H6 = o7 != null ? H(o7, i8) : false;
        if ((i8 & 2) != 0) {
            d(true);
        }
        return H6;
    }

    public void q() {
        ArrayList A7 = A();
        if (this.f8453k) {
            Iterator it = this.f8465w.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f8465w.remove(weakReference);
                } else {
                    z7 |= gVar.g();
                }
            }
            if (z7) {
                this.f8451i.clear();
                this.f8452j.clear();
                int size = A7.size();
                for (int i7 = 0; i7 < size; i7++) {
                    e eVar = (e) A7.get(i7);
                    (eVar.k() ? this.f8451i : this.f8452j).add(eVar);
                }
            } else {
                this.f8451i.clear();
                this.f8452j.clear();
                this.f8452j.addAll(A());
            }
            this.f8453k = false;
        }
    }

    public ArrayList r() {
        q();
        return this.f8451i;
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int k7 = k(i7);
        if (k7 >= 0) {
            int size = this.f8448f.size() - k7;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || ((e) this.f8448f.get(k7)).getGroupId() != i7) {
                    break;
                }
                J(k7, false);
                i8 = i9;
            }
            G(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        J(n(i7), true);
    }

    public Context s() {
        return this.f8443a;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int size = this.f8448f.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f8448f.get(i8);
            if (eVar.getGroupId() == i7) {
                eVar.s(z8);
                eVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f8467y = z7;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z7) {
        int size = this.f8448f.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f8448f.get(i8);
            if (eVar.getGroupId() == i7) {
                eVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z7) {
        int size = this.f8448f.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f8448f.get(i8);
            if (eVar.getGroupId() == i7 && eVar.x(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            G(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f8445c = z7;
        G(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f8448f.size();
    }

    public e t() {
        return this.f8466x;
    }

    public CharSequence u() {
        return this.f8456n;
    }

    public ArrayList v() {
        q();
        return this.f8452j;
    }

    public boolean w() {
        return this.f8462t;
    }

    public Resources y() {
        return this.f8444b;
    }

    public d z() {
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f8444b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f8444b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        e eVar = (e) a(i7, i8, i9, charSequence);
        j jVar = new j(this.f8443a, this, eVar);
        eVar.w(jVar);
        return jVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
