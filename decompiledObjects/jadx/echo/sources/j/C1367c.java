package j;

import I.AbstractC0412i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import e.AbstractC1238i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.AbstractC1494B;
import l.X;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1367c extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f15345e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f15346f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f15347a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15348b;

    /* renamed from: c, reason: collision with root package name */
    public Context f15349c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15350d;

    /* renamed from: j.c$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class[] f15351c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f15352a;

        /* renamed from: b, reason: collision with root package name */
        public Method f15353b;

        public a(Object obj, String str) {
            this.f15352a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f15353b = cls.getMethod(str, f15351c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f15353b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f15353b.invoke(this.f15352a, menuItem)).booleanValue();
                }
                this.f15353b.invoke(this.f15352a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: j.c$b */
    public class b {

        /* renamed from: A, reason: collision with root package name */
        public CharSequence f15354A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f15355B;

        /* renamed from: C, reason: collision with root package name */
        public ColorStateList f15356C = null;

        /* renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f15357D = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f15359a;

        /* renamed from: b, reason: collision with root package name */
        public int f15360b;

        /* renamed from: c, reason: collision with root package name */
        public int f15361c;

        /* renamed from: d, reason: collision with root package name */
        public int f15362d;

        /* renamed from: e, reason: collision with root package name */
        public int f15363e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15364f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15365g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f15366h;

        /* renamed from: i, reason: collision with root package name */
        public int f15367i;

        /* renamed from: j, reason: collision with root package name */
        public int f15368j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f15369k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f15370l;

        /* renamed from: m, reason: collision with root package name */
        public int f15371m;

        /* renamed from: n, reason: collision with root package name */
        public char f15372n;

        /* renamed from: o, reason: collision with root package name */
        public int f15373o;

        /* renamed from: p, reason: collision with root package name */
        public char f15374p;

        /* renamed from: q, reason: collision with root package name */
        public int f15375q;

        /* renamed from: r, reason: collision with root package name */
        public int f15376r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f15377s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f15378t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f15379u;

        /* renamed from: v, reason: collision with root package name */
        public int f15380v;

        /* renamed from: w, reason: collision with root package name */
        public int f15381w;

        /* renamed from: x, reason: collision with root package name */
        public String f15382x;

        /* renamed from: y, reason: collision with root package name */
        public String f15383y;

        /* renamed from: z, reason: collision with root package name */
        public String f15384z;

        public b(Menu menu) {
            this.f15359a = menu;
            h();
        }

        public void a() {
            this.f15366h = true;
            i(this.f15359a.add(this.f15360b, this.f15367i, this.f15368j, this.f15369k));
        }

        public SubMenu b() {
            this.f15366h = true;
            SubMenu addSubMenu = this.f15359a.addSubMenu(this.f15360b, this.f15367i, this.f15368j, this.f15369k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f15366h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1367c.this.f15349c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1367c.this.f15349c.obtainStyledAttributes(attributeSet, AbstractC1238i.f13514M0);
            this.f15360b = obtainStyledAttributes.getResourceId(AbstractC1238i.f13522O0, 0);
            this.f15361c = obtainStyledAttributes.getInt(AbstractC1238i.f13530Q0, 0);
            this.f15362d = obtainStyledAttributes.getInt(AbstractC1238i.f13534R0, 0);
            this.f15363e = obtainStyledAttributes.getInt(AbstractC1238i.f13538S0, 0);
            this.f15364f = obtainStyledAttributes.getBoolean(AbstractC1238i.f13526P0, true);
            this.f15365g = obtainStyledAttributes.getBoolean(AbstractC1238i.f13518N0, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            X r7 = X.r(C1367c.this.f15349c, attributeSet, AbstractC1238i.f13542T0);
            this.f15367i = r7.l(AbstractC1238i.f13554W0, 0);
            this.f15368j = (r7.i(AbstractC1238i.f13563Z0, this.f15361c) & (-65536)) | (r7.i(AbstractC1238i.f13567a1, this.f15362d) & 65535);
            this.f15369k = r7.n(AbstractC1238i.f13571b1);
            this.f15370l = r7.n(AbstractC1238i.f13575c1);
            this.f15371m = r7.l(AbstractC1238i.f13546U0, 0);
            this.f15372n = c(r7.m(AbstractC1238i.f13579d1));
            this.f15373o = r7.i(AbstractC1238i.f13607k1, 4096);
            this.f15374p = c(r7.m(AbstractC1238i.f13583e1));
            this.f15375q = r7.i(AbstractC1238i.f13623o1, 4096);
            this.f15376r = r7.p(AbstractC1238i.f13587f1) ? r7.a(AbstractC1238i.f13587f1, false) : this.f15363e;
            this.f15377s = r7.a(AbstractC1238i.f13557X0, false);
            this.f15378t = r7.a(AbstractC1238i.f13560Y0, this.f15364f);
            this.f15379u = r7.a(AbstractC1238i.f13550V0, this.f15365g);
            this.f15380v = r7.i(AbstractC1238i.f13627p1, -1);
            this.f15384z = r7.m(AbstractC1238i.f13591g1);
            this.f15381w = r7.l(AbstractC1238i.f13595h1, 0);
            this.f15382x = r7.m(AbstractC1238i.f13603j1);
            String m7 = r7.m(AbstractC1238i.f13599i1);
            this.f15383y = m7;
            boolean z7 = m7 != null;
            if (z7 && this.f15381w == 0 && this.f15382x == null) {
                android.support.v4.media.a.a(e(m7, C1367c.f15346f, C1367c.this.f15348b));
            } else if (z7) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f15354A = r7.n(AbstractC1238i.f13611l1);
            this.f15355B = r7.n(AbstractC1238i.f13631q1);
            if (r7.p(AbstractC1238i.f13619n1)) {
                this.f15357D = AbstractC1494B.c(r7.i(AbstractC1238i.f13619n1, -1), this.f15357D);
            } else {
                this.f15357D = null;
            }
            if (r7.p(AbstractC1238i.f13615m1)) {
                this.f15356C = r7.c(AbstractC1238i.f13615m1);
            } else {
                this.f15356C = null;
            }
            r7.t();
            this.f15366h = false;
        }

        public void h() {
            this.f15360b = 0;
            this.f15361c = 0;
            this.f15362d = 0;
            this.f15363e = 0;
            this.f15364f = true;
            this.f15365g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z7 = false;
            menuItem.setChecked(this.f15377s).setVisible(this.f15378t).setEnabled(this.f15379u).setCheckable(this.f15376r >= 1).setTitleCondensed(this.f15370l).setIcon(this.f15371m);
            int i7 = this.f15380v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f15384z != null) {
                if (C1367c.this.f15349c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C1367c.this.b(), this.f15384z));
            }
            if (this.f15376r >= 2 && (menuItem instanceof e)) {
                ((e) menuItem).s(true);
            }
            String str = this.f15382x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C1367c.f15345e, C1367c.this.f15347a));
                z7 = true;
            }
            int i8 = this.f15381w;
            if (i8 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC0412i.b(menuItem, this.f15354A);
            AbstractC0412i.f(menuItem, this.f15355B);
            AbstractC0412i.a(menuItem, this.f15372n, this.f15373o);
            AbstractC0412i.e(menuItem, this.f15374p, this.f15375q);
            PorterDuff.Mode mode = this.f15357D;
            if (mode != null) {
                AbstractC0412i.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f15356C;
            if (colorStateList != null) {
                AbstractC0412i.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f15345e = clsArr;
        f15346f = clsArr;
    }

    public C1367c(Context context) {
        super(context);
        this.f15349c = context;
        Object[] objArr = {context};
        this.f15347a = objArr;
        this.f15348b = objArr;
    }

    public final Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f15350d == null) {
            this.f15350d = a(this.f15349c);
        }
        return this.f15350d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r15.equals("menu") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r7 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r15.equals("group") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r15.equals("item") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r15.equals("menu") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            j.c$b r0 = new j.c$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lb8
            if (r15 == r3) goto Lb0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L80
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lab
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lab
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lab
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L78
            boolean r15 = r0.d()
            if (r15 != 0) goto Lab
            r0.a()
            goto Lab
        L78:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lab
            r6 = r3
            goto Lab
        L80:
            if (r7 == 0) goto L83
            goto Lab
        L83:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L91
            r0.f(r14)
            goto Lab
        L91:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9b
            r0.g(r14)
            goto Lab
        L9b:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto La9
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lab
        La9:
            r8 = r15
            r7 = r3
        Lab:
            int r15 = r13.next()
            goto L40
        Lb0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C1367c.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof C.a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f15349c.getResources().getLayout(i7);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
