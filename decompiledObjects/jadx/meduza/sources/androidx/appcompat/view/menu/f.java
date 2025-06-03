package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e0.j0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class f implements z.a {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f664z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f665a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f666b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f668d;

    /* renamed from: e, reason: collision with root package name */
    public a f669e;
    public ArrayList<h> f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<h> f670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f671h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<h> f672i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<h> f673j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f674k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f676m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f677n;

    /* renamed from: o, reason: collision with root package name */
    public View f678o;

    /* renamed from: w, reason: collision with root package name */
    public h f685w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f687y;

    /* renamed from: l, reason: collision with root package name */
    public int f675l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f679p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f680q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f681r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f682s = false;
    public boolean t = false;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<h> f683u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<j>> f684v = new CopyOnWriteArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    public boolean f686x = false;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f665a = context;
        Resources resources = context.getResources();
        this.f666b = resources;
        this.f = new ArrayList<>();
        this.f670g = new ArrayList<>();
        this.f671h = true;
        this.f672i = new ArrayList<>();
        this.f673j = new ArrayList<>();
        this.f674k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.f3800a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = j0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f668d = z11;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f664z;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f675l);
                ArrayList<h> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i13 = 0;
                        break;
                    }
                    if (arrayList.get(size).f694d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                }
                arrayList.add(i13, hVar);
                p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f666b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f666b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f665a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f696g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f666b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f666b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f665a, this, a10);
        a10.f704o = mVar;
        mVar.setHeaderTitle(a10.f695e);
        return mVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f684v.add(new WeakReference<>(jVar));
        jVar.f(context, this);
        this.f674k = true;
    }

    public final void c(boolean z10) {
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator<WeakReference<j>> it = this.f684v.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f684v.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.t = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f685w;
        if (hVar != null) {
            d(hVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f677n = null;
        this.f676m = null;
        this.f678o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        boolean z10 = false;
        if (!this.f684v.isEmpty() && this.f685w == hVar) {
            w();
            Iterator<WeakReference<j>> it = this.f684v.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f684v.remove(next);
                } else {
                    z10 = jVar.e(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f685w = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f669e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        boolean z10 = false;
        if (this.f684v.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = this.f684v.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f684v.remove(next);
            } else {
                z10 = jVar.j(hVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f685w = hVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f.get(i11);
            if (hVar.f691a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f704o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f683u;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char c10 = n2 ? hVar.f699j : hVar.f697h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n2 && c10 == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f.get(i11);
                if (hVar.hasSubMenu()) {
                    hVar.f704o.h(arrayList, i10, keyEvent);
                }
                char c10 = n2 ? hVar.f699j : hVar.f697h;
                if (((modifiers & 69647) == ((n2 ? hVar.f700k : hVar.f698i) & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n2 && c10 == '\b' && i10 == 67)) && hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f687y) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> l10 = l();
        if (this.f674k) {
            Iterator<WeakReference<j>> it = this.f684v.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f684v.remove(next);
                } else {
                    z10 |= jVar.c();
                }
            }
            if (z10) {
                this.f672i.clear();
                this.f673j.clear();
                int size = l10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = l10.get(i10);
                    ((hVar.f712x & 32) == 32 ? this.f672i : this.f673j).add(hVar);
                }
            } else {
                this.f672i.clear();
                this.f673j.clear();
                this.f673j.addAll(l());
            }
            this.f674k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        if (!this.f671h) {
            return this.f670g;
        }
        this.f670g.clear();
        int size = this.f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f.get(i10);
            if (hVar.isVisible()) {
                this.f670g.add(hVar);
            }
        }
        this.f671h = false;
        this.f674k = true;
        return this.f670g;
    }

    public boolean m() {
        return this.f686x;
    }

    public boolean n() {
        return this.f667c;
    }

    public boolean o() {
        return this.f668d;
    }

    public final void p(boolean z10) {
        if (this.f679p) {
            this.f680q = true;
            if (z10) {
                this.f681r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f671h = true;
            this.f674k = true;
        }
        if (this.f684v.isEmpty()) {
            return;
        }
        w();
        Iterator<WeakReference<j>> it = this.f684v.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f684v.remove(next);
            } else {
                jVar.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        h g10 = g(i10, keyEvent);
        boolean q10 = g10 != null ? q(g10, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r1 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if ((r9 & 1) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f705p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            androidx.appcompat.view.menu.f r1 = r7.f703n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f696g
            if (r1 == 0) goto L36
            androidx.appcompat.view.menu.f r3 = r7.f703n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f665a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            e0.b r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            e0.b r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = r2
            goto L50
        L4f:
            r4 = r0
        L50:
            boolean r5 = r7.e()
            if (r5 == 0) goto L5f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            goto Lc8
        L5f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L68
            goto L6d
        L68:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            goto Lc8
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f665a
            r9.<init>(r5, r6, r7)
            r7.f704o = r9
            java.lang.CharSequence r5 = r7.f695e
            r9.setHeaderTitle(r5)
        L88:
            androidx.appcompat.view.menu.m r7 = r7.f704o
            if (r4 == 0) goto L8f
            r3.f(r7)
        L8f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f684v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L98
            goto Lc5
        L98:
            if (r8 == 0) goto L9e
            boolean r0 = r8.i(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r8 = r6.f684v
            java.util.Iterator r8 = r8.iterator()
        La4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.j r3 = (androidx.appcompat.view.menu.j) r3
            if (r3 != 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r3 = r6.f684v
            r3.remove(r9)
            goto La4
        Lbe:
            if (r0 != 0) goto La4
            boolean r0 = r3.i(r7)
            goto La4
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
        Lc8:
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        Iterator<WeakReference<j>> it = this.f684v.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f684v.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (this.f.get(i12).f692b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = this.f.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || this.f.get(i12).f692b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < this.f.size()) {
                    this.f.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f.get(i11).f691a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= this.f.size()) {
            return;
        }
        this.f.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f.get(i11);
            if (hVar.f692b == i10) {
                hVar.f712x = (hVar.f712x & (-5)) | (z11 ? 4 : 0);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f686x = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        int size = this.f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f.get(i11);
            if (hVar.f692b == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int size = this.f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f.get(i11);
            if (hVar.f692b == i10) {
                int i12 = hVar.f712x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                hVar.f712x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f667c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f666b;
        if (view != null) {
            this.f678o = view;
            this.f676m = null;
            this.f677n = null;
        } else {
            if (i10 > 0) {
                this.f676m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f676m = charSequence;
            }
            if (i11 > 0) {
                this.f677n = v.a.getDrawable(this.f665a, i11);
            } else if (drawable != null) {
                this.f677n = drawable;
            }
            this.f678o = null;
        }
        p(false);
    }

    public final void v() {
        this.f679p = false;
        if (this.f680q) {
            this.f680q = false;
            p(this.f681r);
        }
    }

    public final void w() {
        if (this.f679p) {
            return;
        }
        this.f679p = true;
        this.f680q = false;
        this.f681r = false;
    }
}
