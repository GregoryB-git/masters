package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.a0;
import e0.n;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.i0;
import l.z0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f8209e;
    public static final Class<?>[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8210a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8211b;

    /* renamed from: c, reason: collision with root package name */
    public Context f8212c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8213d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f8214c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f8215a;

        /* renamed from: b, reason: collision with root package name */
        public Method f8216b;

        public a(Object obj, String str) {
            this.f8215a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8216b = cls.getMethod(str, f8214c);
            } catch (Exception e10) {
                StringBuilder m10 = defpackage.f.m("Couldn't resolve menu item onClick handler ", str, " in class ");
                m10.append(cls.getName());
                InflateException inflateException = new InflateException(m10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8216b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8216b.invoke(this.f8215a, menuItem)).booleanValue();
                }
                this.f8216b.invoke(this.f8215a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public Menu f8217a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8223h;

        /* renamed from: i, reason: collision with root package name */
        public int f8224i;

        /* renamed from: j, reason: collision with root package name */
        public int f8225j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f8226k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f8227l;

        /* renamed from: m, reason: collision with root package name */
        public int f8228m;

        /* renamed from: n, reason: collision with root package name */
        public char f8229n;

        /* renamed from: o, reason: collision with root package name */
        public int f8230o;

        /* renamed from: p, reason: collision with root package name */
        public char f8231p;

        /* renamed from: q, reason: collision with root package name */
        public int f8232q;

        /* renamed from: r, reason: collision with root package name */
        public int f8233r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f8234s;
        public boolean t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f8235u;

        /* renamed from: v, reason: collision with root package name */
        public int f8236v;

        /* renamed from: w, reason: collision with root package name */
        public int f8237w;

        /* renamed from: x, reason: collision with root package name */
        public String f8238x;

        /* renamed from: y, reason: collision with root package name */
        public String f8239y;

        /* renamed from: z, reason: collision with root package name */
        public e0.b f8240z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f8218b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f8219c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f8220d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f8221e = 0;
        public boolean f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8222g = true;

        public b(Menu menu) {
            this.f8217a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f8212c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f8234s).setVisible(this.t).setEnabled(this.f8235u).setCheckable(this.f8233r >= 1).setTitleCondensed(this.f8227l).setIcon(this.f8228m);
            int i10 = this.f8236v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f8239y != null) {
                if (f.this.f8212c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                f fVar = f.this;
                if (fVar.f8213d == null) {
                    fVar.f8213d = f.a(fVar.f8212c);
                }
                menuItem.setOnMenuItemClickListener(new a(fVar.f8213d, this.f8239y));
            }
            if (this.f8233r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f712x = (hVar.f712x & (-5)) | 4;
                } else if (menuItem instanceof k.c) {
                    k.c cVar = (k.c) menuItem;
                    try {
                        if (cVar.f8806e == null) {
                            cVar.f8806e = cVar.f8805d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f8806e.invoke(cVar.f8805d, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f8238x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.f8209e, f.this.f8210a));
                z10 = true;
            }
            int i11 = this.f8237w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            e0.b bVar = this.f8240z;
            if (bVar != null) {
                if (menuItem instanceof z.b) {
                    ((z.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof z.b;
            if (z11) {
                ((z.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((z.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n.m(menuItem, charSequence2);
            }
            char c10 = this.f8229n;
            int i12 = this.f8230o;
            if (z11) {
                ((z.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n.g(menuItem, c10, i12);
            }
            char c11 = this.f8231p;
            int i13 = this.f8232q;
            if (z11) {
                ((z.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((z.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    n.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z11) {
                    ((z.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    n.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f8209e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f8212c = context;
        Object[] objArr = {context};
        this.f8210a = objArr;
        this.f8211b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        e0.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(defpackage.g.d("Expecting menu, got ", name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar2.f8218b = 0;
                        bVar2.f8219c = 0;
                        bVar2.f8220d = 0;
                        bVar2.f8221e = 0;
                        bVar2.f = true;
                        bVar2.f8222g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar2.f8223h) {
                            e0.b bVar3 = bVar2.f8240z;
                            if (bVar3 == null || !bVar3.a()) {
                                bVar2.f8223h = true;
                                bVar2.b(bVar2.f8217a.add(bVar2.f8218b, bVar2.f8224i, bVar2.f8225j, bVar2.f8226k));
                            } else {
                                bVar2.f8223h = true;
                                bVar2.b(bVar2.f8217a.addSubMenu(bVar2.f8218b, bVar2.f8224i, bVar2.f8225j, bVar2.f8226k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlResourceParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = f.this.f8212c.obtainStyledAttributes(attributeSet, a0.C);
                    bVar2.f8218b = obtainStyledAttributes.getResourceId(1, 0);
                    bVar2.f8219c = obtainStyledAttributes.getInt(3, 0);
                    bVar2.f8220d = obtainStyledAttributes.getInt(4, 0);
                    bVar2.f8221e = obtainStyledAttributes.getInt(5, 0);
                    bVar2.f = obtainStyledAttributes.getBoolean(2, true);
                    bVar2.f8222g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = f.this.f8212c;
                    z0 z0Var = new z0(context, context.obtainStyledAttributes(attributeSet, a0.D));
                    bVar2.f8224i = z0Var.i(2, 0);
                    bVar2.f8225j = (z0Var.h(5, bVar2.f8219c) & (-65536)) | (z0Var.h(6, bVar2.f8220d) & 65535);
                    bVar2.f8226k = z0Var.k(7);
                    bVar2.f8227l = z0Var.k(8);
                    bVar2.f8228m = z0Var.i(0, 0);
                    String j10 = z0Var.j(9);
                    bVar2.f8229n = j10 == null ? (char) 0 : j10.charAt(0);
                    bVar2.f8230o = z0Var.h(16, 4096);
                    String j11 = z0Var.j(10);
                    bVar2.f8231p = j11 == null ? (char) 0 : j11.charAt(0);
                    bVar2.f8232q = z0Var.h(20, 4096);
                    bVar2.f8233r = z0Var.l(11) ? z0Var.a(11, false) : bVar2.f8221e;
                    bVar2.f8234s = z0Var.a(3, false);
                    bVar2.t = z0Var.a(4, bVar2.f);
                    bVar2.f8235u = z0Var.a(1, bVar2.f8222g);
                    bVar2.f8236v = z0Var.h(21, -1);
                    bVar2.f8239y = z0Var.j(12);
                    bVar2.f8237w = z0Var.i(13, 0);
                    bVar2.f8238x = z0Var.j(15);
                    String j12 = z0Var.j(14);
                    boolean z12 = j12 != null;
                    if (z12 && bVar2.f8237w == 0 && bVar2.f8238x == null) {
                        bVar = (e0.b) bVar2.a(j12, f, f.this.f8211b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar = null;
                    }
                    bVar2.f8240z = bVar;
                    bVar2.A = z0Var.k(17);
                    bVar2.B = z0Var.k(22);
                    if (z0Var.l(19)) {
                        bVar2.D = i0.b(z0Var.h(19, -1), bVar2.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar2.D = null;
                    }
                    if (z0Var.l(18)) {
                        colorStateList = z0Var.b(18);
                    }
                    bVar2.C = colorStateList;
                    z0Var.n();
                    bVar2.f8223h = false;
                } else if (name3.equals("menu")) {
                    bVar2.f8223h = true;
                    SubMenu addSubMenu = bVar2.f8217a.addSubMenu(bVar2.f8218b, bVar2.f8224i, bVar2.f8225j, bVar2.f8226k);
                    bVar2.b(addSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, addSubMenu);
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlResourceParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof z.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f8212c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
