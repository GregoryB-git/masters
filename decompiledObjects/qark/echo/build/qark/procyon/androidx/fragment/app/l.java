// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.util.Log;
import U.c;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

public class l implements LayoutInflater$Factory2
{
    public final n o;
    
    public l(final n o) {
        this.o = o;
    }
    
    public View onCreateView(View v, final String s, final Context context, final AttributeSet set) {
        if (h.class.getName().equals(s)) {
            return (View)new h(context, set, this.o);
        }
        final boolean equals = "fragment".equals(s);
        Fragment g0 = null;
        if (!equals) {
            return null;
        }
        final String attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.d);
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(c.e);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(c.f, -1);
        final String string2 = obtainStyledAttributes.getString(c.g);
        obtainStyledAttributes.recycle();
        if (string == null) {
            return null;
        }
        if (!j.b(context.getClassLoader(), string)) {
            return null;
        }
        int id;
        if (v != null) {
            id = v.getId();
        }
        else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(set.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(string);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            g0 = this.o.g0(resourceId);
        }
        Fragment h0;
        if ((h0 = g0) == null) {
            h0 = g0;
            if (string2 != null) {
                h0 = this.o.h0(string2);
            }
        }
        Fragment g2;
        if ((g2 = h0) == null) {
            g2 = h0;
            if (id != -1) {
                g2 = this.o.g0(id);
            }
        }
        Fragment fragment = null;
        t t = null;
        Label_0604: {
            t v2;
            StringBuilder sb2;
            String str;
            if (g2 == null) {
                final Fragment a = this.o.p0().a(context.getClassLoader(), string);
                a.B = true;
                int k;
                if (resourceId != 0) {
                    k = resourceId;
                }
                else {
                    k = id;
                }
                a.K = k;
                a.L = id;
                a.M = string2;
                a.C = true;
                final n o = this.o;
                a.G = o;
                a.H = o.s0();
                a.y0(this.o.s0().i(), set, a.p);
                v2 = this.o.v(a);
                this.o.g(a);
                fragment = a;
                t = v2;
                if (!n.D0(2)) {
                    break Label_0604;
                }
                sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(a);
                str = " has been inflated via the <fragment> tag: id=0x";
                fragment = a;
            }
            else {
                if (g2.C) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(set.getPositionDescription());
                    sb3.append(": Duplicate id 0x");
                    sb3.append(Integer.toHexString(resourceId));
                    sb3.append(", tag ");
                    sb3.append(string2);
                    sb3.append(", or parent id 0x");
                    sb3.append(Integer.toHexString(id));
                    sb3.append(" with another fragment for ");
                    sb3.append(string);
                    throw new IllegalArgumentException(sb3.toString());
                }
                g2.C = true;
                final n o2 = this.o;
                g2.G = o2;
                g2.H = o2.s0();
                g2.y0(this.o.s0().i(), set, g2.p);
                final t v3 = this.o.v(g2);
                fragment = g2;
                t = v3;
                if (!n.D0(2)) {
                    break Label_0604;
                }
                sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(g2);
                str = " has been re-attached via the <fragment> tag: id=0x";
                fragment = g2;
                v2 = v3;
            }
            sb2.append(str);
            sb2.append(Integer.toHexString(resourceId));
            Log.v("FragmentManager", sb2.toString());
            t = v2;
        }
        fragment.U = (ViewGroup)v;
        t.m();
        t.j();
        v = fragment.V;
        if (v != null) {
            if (resourceId != 0) {
                v.setId(resourceId);
            }
            if (fragment.V.getTag() == null) {
                fragment.V.setTag((Object)string2);
            }
            return fragment.V;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(string);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
