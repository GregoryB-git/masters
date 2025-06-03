// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j;

import android.view.View;
import androidx.appcompat.view.menu.e;
import android.content.res.TypedArray;
import e.i;
import java.lang.reflect.Constructor;
import android.util.Log;
import android.view.SubMenu;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import android.util.Xml;
import C.a;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public class c extends MenuInflater
{
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;
    
    static {
        f = (e = new Class[] { Context.class });
    }
    
    public c(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    public final Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    public Object b() {
        if (this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }
    
    public final void c(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                final int next = xmlPullParser.next();
                if ((i = next) == 1) {
                    int next2 = next;
                    int n;
                    int j = n = 0;
                    String anObject = null;
                    while (j == 0) {
                        if (next2 == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n2;
                        int n3;
                        String name;
                        if (next2 != 2) {
                            if (next2 != 3) {
                                n2 = j;
                                n3 = n;
                                name = anObject;
                            }
                            else {
                                final String name2 = xmlPullParser.getName();
                                if (n != 0 && name2.equals(anObject)) {
                                    n3 = 0;
                                    name = null;
                                    n2 = j;
                                }
                                else if (name2.equals("group")) {
                                    b.h();
                                    n2 = j;
                                    n3 = n;
                                    name = anObject;
                                }
                                else if (name2.equals("item")) {
                                    n2 = j;
                                    n3 = n;
                                    name = anObject;
                                    if (!b.d()) {
                                        b.a();
                                        n2 = j;
                                        n3 = n;
                                        name = anObject;
                                    }
                                }
                                else {
                                    n2 = j;
                                    n3 = n;
                                    name = anObject;
                                    if (name2.equals("menu")) {
                                        n2 = 1;
                                        n3 = n;
                                        name = anObject;
                                    }
                                }
                            }
                        }
                        else if (n != 0) {
                            n2 = j;
                            n3 = n;
                            name = anObject;
                        }
                        else {
                            name = xmlPullParser.getName();
                            if (name.equals("group")) {
                                b.f(set);
                                n2 = j;
                                n3 = n;
                                name = anObject;
                            }
                            else if (name.equals("item")) {
                                b.g(set);
                                n2 = j;
                                n3 = n;
                                name = anObject;
                            }
                            else if (name.equals("menu")) {
                                this.c(xmlPullParser, set, (Menu)b.b());
                                n2 = j;
                                n3 = n;
                                name = anObject;
                            }
                            else {
                                n3 = 1;
                                n2 = j;
                            }
                        }
                        final int next3 = xmlPullParser.next();
                        j = n2;
                        n = n3;
                        anObject = name;
                        next2 = next3;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                final int next2 = xmlPullParser.next();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expecting menu, got ");
        sb.append(name3);
        throw new RuntimeException(sb.toString());
    }
    
    public void inflate(final int n, final Menu menu) {
        if (!(menu instanceof C.a)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser2;
                final XmlResourceParser xmlResourceParser = xmlResourceParser2 = (layout = this.c.getResources().getLayout(n));
                this.c((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
                final IOException ex;
                throw new InflateException("Error inflating menu XML", (Throwable)ex);
            }
        }
        catch (IOException ex2) {}
        catch (XmlPullParserException ex3) {}
    }
    
    public static class a implements MenuItem$OnMenuItemClickListener
    {
        public static final Class[] c;
        public Object a;
        public Method b;
        
        static {
            c = new Class[] { MenuItem.class };
        }
        
        public a(final Object a, final String s) {
            this.a = a;
            final Class<?> class1 = a.getClass();
            try {
                this.b = class1.getMethod(s, (Class<?>[])a.c);
            }
            catch (Exception cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(s);
                sb.append(" in class ");
                sb.append(class1.getName());
                final InflateException ex = new InflateException(sb.toString());
                ((Throwable)ex).initCause(cause);
                throw ex;
            }
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.b.invoke(this.a, menuItem);
                }
                this.b.invoke(this.a, menuItem);
                return true;
            }
            catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    public class b
    {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C;
        public PorterDuff$Mode D;
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
        
        public b(final Menu a) {
            this.C = null;
            this.D = null;
            this.a = a;
            this.h();
        }
        
        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }
        
        public SubMenu b() {
            this.h = true;
            final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(addSubMenu.getItem());
            return addSubMenu;
        }
        
        public final char c(final String s) {
            if (s == null) {
                return '\0';
            }
            return s.charAt(0);
        }
        
        public boolean d() {
            return this.h;
        }
        
        public final Object e(final String s, final Class[] parameterTypes, final Object[] initargs) {
            try {
                final Constructor<?> constructor = Class.forName(s, false, j.c.this.c.getClassLoader()).getConstructor((Class<?>[])parameterTypes);
                constructor.setAccessible(true);
                return constructor.newInstance(initargs);
            }
            catch (Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(s);
                Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        
        public void f(final AttributeSet set) {
            final TypedArray obtainStyledAttributes = j.c.this.c.obtainStyledAttributes(set, e.i.M0);
            this.b = obtainStyledAttributes.getResourceId(e.i.O0, 0);
            this.c = obtainStyledAttributes.getInt(e.i.Q0, 0);
            this.d = obtainStyledAttributes.getInt(e.i.R0, 0);
            this.e = obtainStyledAttributes.getInt(e.i.S0, 0);
            this.f = obtainStyledAttributes.getBoolean(e.i.P0, true);
            this.g = obtainStyledAttributes.getBoolean(e.i.N0, true);
            obtainStyledAttributes.recycle();
        }
        
        public void g(final AttributeSet set) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
        
        public final void i(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            final int r = this.r;
            boolean b = false;
            setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            final int v = this.v;
            if (v >= 0) {
                menuItem.setShowAsAction(v);
            }
            if (this.z != null) {
                if (j.c.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(j.c.this.b(), this.z));
            }
            if (this.r >= 2 && menuItem instanceof e) {
                ((e)menuItem).s(true);
            }
            final String x = this.x;
            if (x != null) {
                menuItem.setActionView((View)this.e(x, j.c.e, j.c.this.a));
                b = true;
            }
            final int w = this.w;
            if (w > 0) {
                if (!b) {
                    menuItem.setActionView(w);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            I.i.b(menuItem, this.A);
            I.i.f(menuItem, this.B);
            I.i.a(menuItem, this.n, this.o);
            I.i.e(menuItem, this.p, this.q);
            final PorterDuff$Mode d = this.D;
            if (d != null) {
                I.i.d(menuItem, d);
            }
            final ColorStateList c = this.C;
            if (c != null) {
                I.i.c(menuItem, c);
            }
        }
    }
}
