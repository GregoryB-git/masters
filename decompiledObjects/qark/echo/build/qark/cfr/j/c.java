/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package j;

import I.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c
extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    static {
        Class[] arrclass = new Class[]{Context.class};
        e = arrclass;
        f = arrclass;
    }

    public c(Context context) {
        super(context);
        this.c = context;
        Object[] arrobject = new Object[]{context};
        this.a = arrobject;
        this.b = arrobject;
    }

    public final Object a(Object object) {
        if (object instanceof Activity) {
            return object;
        }
        Object object2 = object;
        if (object instanceof ContextWrapper) {
            object2 = this.a((Object)((ContextWrapper)object).getBaseContext());
        }
        return object2;
    }

    public Object b() {
        if (this.d == null) {
            this.d = this.a((Object)this.c);
        }
        return this.d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu object) {
        b b8;
        int n8;
        int n9;
        block25 : {
            b8 = new b((Menu)object);
            n8 = xmlPullParser.getEventType();
            do {
                if (n8 == 2) {
                    object = xmlPullParser.getName();
                    if (object.equals((Object)"menu")) {
                        n8 = xmlPullParser.next();
                        break block25;
                    }
                    xmlPullParser = new StringBuilder();
                    xmlPullParser.append("Expecting menu, got ");
                    xmlPullParser.append((String)object);
                    throw new RuntimeException(xmlPullParser.toString());
                }
                n8 = n9 = xmlPullParser.next();
            } while (n9 != 1);
            n8 = n9;
        }
        int n10 = n9 = 0;
        Object object2 = null;
        while (n9 == 0) {
            if (n8 != 1) {
                int n11;
                if (n8 != 2) {
                    if (n8 != 3) {
                        n11 = n9;
                        n8 = n10;
                        object = object2;
                    } else {
                        String string2 = xmlPullParser.getName();
                        if (n10 != 0 && string2.equals(object2)) {
                            n8 = 0;
                            object = null;
                            n11 = n9;
                        } else if (string2.equals((Object)"group")) {
                            b8.h();
                            n11 = n9;
                            n8 = n10;
                            object = object2;
                        } else if (string2.equals((Object)"item")) {
                            n11 = n9;
                            n8 = n10;
                            object = object2;
                            if (!b8.d()) {
                                b8.a();
                                n11 = n9;
                                n8 = n10;
                                object = object2;
                            }
                        } else {
                            n11 = n9;
                            n8 = n10;
                            object = object2;
                            if (string2.equals((Object)"menu")) {
                                n11 = 1;
                                n8 = n10;
                                object = object2;
                            }
                        }
                    }
                } else if (n10 != 0) {
                    n11 = n9;
                    n8 = n10;
                    object = object2;
                } else {
                    object = xmlPullParser.getName();
                    if (object.equals((Object)"group")) {
                        b8.f(attributeSet);
                        n11 = n9;
                        n8 = n10;
                        object = object2;
                    } else if (object.equals((Object)"item")) {
                        b8.g(attributeSet);
                        n11 = n9;
                        n8 = n10;
                        object = object2;
                    } else if (object.equals((Object)"menu")) {
                        this.c(xmlPullParser, attributeSet, (Menu)b8.b());
                        n11 = n9;
                        n8 = n10;
                        object = object2;
                    } else {
                        n8 = 1;
                        n11 = n9;
                    }
                }
                int n12 = xmlPullParser.next();
                n9 = n11;
                n10 = n8;
                object2 = object;
                n8 = n12;
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void inflate(int var1_1, Menu var2_2) {
        block6 : {
            if (!(var2_2 instanceof C.a)) {
                super.inflate(var1_1, var2_2);
                return;
            }
            var4_6 = null;
            var5_7 = null;
            var3_8 = null;
            try {
                var3_8 = var6_9 = this.c.getResources().getLayout(var1_1);
                var4_6 = var6_9;
                var5_7 = var6_9;
                this.c((XmlPullParser)var6_9, Xml.asAttributeSet((XmlPullParser)var6_9), var2_2);
                if (var6_9 == null) return;
            }
            catch (Throwable var2_3) {
                break block6;
            }
            catch (IOException var2_4) {
            }
            catch (XmlPullParserException var2_5) {
                ** GOTO lbl23
            }
            var6_9.close();
            return;
            var3_8 = var4_6;
            {
                throw new InflateException("Error inflating menu XML", (Throwable)var2_4);
lbl23: // 1 sources:
                var3_8 = var5_7;
                throw new InflateException("Error inflating menu XML", (Throwable)var2_5);
            }
        }
        if (var3_8 == null) throw var2_3;
        var3_8.close();
        throw var2_3;
    }

    public static class a
    implements MenuItem.OnMenuItemClickListener {
        public static final Class[] c = new Class[]{MenuItem.class};
        public Object a;
        public Method b;

        public a(Object object, String string2) {
            this.a = object;
            Class class_ = object.getClass();
            try {
                this.b = class_.getMethod(string2, c);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(string2);
                stringBuilder.append(" in class ");
                stringBuilder.append(class_.getName());
                string2 = new InflateException(stringBuilder.toString());
                string2.initCause((Throwable)exception);
                throw string2;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (Boolean)this.b.invoke(this.a, new Object[]{menuItem});
                }
                this.b.invoke(this.a, new Object[]{menuItem});
                return true;
            }
            catch (Exception exception) {
                throw new RuntimeException((Throwable)exception);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C;
        public PorterDuff.Mode D;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.C = null;
            this.D = null;
            this.a = menu;
            this.h();
        }

        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(subMenu.getItem());
            return subMenu;
        }

        public final char c(String string2) {
            if (string2 == null) {
                return '\u0000';
            }
            return string2.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final Object e(String string2, Class[] object, Object[] stringBuilder) {
            try {
                object = Class.forName((String)string2, (boolean)false, (ClassLoader)c.this.c.getClassLoader()).getConstructor((Class[])object);
                object.setAccessible(true);
                object = object.newInstance((Object[])stringBuilder);
                return object;
            }
            catch (Exception exception) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot instantiate class: ");
                stringBuilder.append(string2);
                Log.w((String)"SupportMenuInflater", (String)stringBuilder.toString(), (Throwable)exception);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            attributeSet = c.this.c.obtainStyledAttributes(attributeSet, e.i.M0);
            this.b = attributeSet.getResourceId(e.i.O0, 0);
            this.c = attributeSet.getInt(e.i.Q0, 0);
            this.d = attributeSet.getInt(e.i.R0, 0);
            this.e = attributeSet.getInt(e.i.S0, 0);
            this.f = attributeSet.getBoolean(e.i.P0, true);
            this.g = attributeSet.getBoolean(e.i.N0, true);
            attributeSet.recycle();
        }

        public void g(AttributeSet attributeSet) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            Object object = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            int n8 = this.r;
            boolean bl = false;
            boolean bl2 = n8 >= 1;
            object.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
            n8 = this.v;
            if (n8 >= 0) {
                menuItem.setShowAsAction(n8);
            }
            if (this.z != null) {
                if (!c.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new a(c.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2 && menuItem instanceof e) {
                ((e)menuItem).s(true);
            }
            if ((object = this.x) != null) {
                menuItem.setActionView((View)this.e((String)object, c.e, c.this.a));
                bl = true;
            }
            if ((n8 = this.w) > 0) {
                if (!bl) {
                    menuItem.setActionView(n8);
                } else {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            i.b(menuItem, this.A);
            i.f(menuItem, this.B);
            i.a(menuItem, this.n, this.o);
            i.e(menuItem, this.p, this.q);
            object = this.D;
            if (object != null) {
                i.d(menuItem, (PorterDuff.Mode)object);
            }
            if ((object = this.C) != null) {
                i.c(menuItem, (ColorStateList)object);
            }
        }
    }

}

