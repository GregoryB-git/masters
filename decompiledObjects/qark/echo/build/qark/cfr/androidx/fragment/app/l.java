/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.fragment.app;

import U.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import androidx.fragment.app.t;

public class l
implements LayoutInflater.Factory2 {
    public final n o;

    public l(n n8) {
        this.o = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public View onCreateView(View view, String object, Context object2, AttributeSet object3) {
        String string2;
        int n8;
        String string3;
        block19 : {
            TypedArray typedArray;
            block20 : {
                int n9;
                Object object4;
                block18 : {
                    if (h.class.getName().equals(object)) {
                        return new h((Context)object2, (AttributeSet)object3, this.o);
                    }
                    boolean bl = "fragment".equals(object);
                    object = null;
                    if (!bl) {
                        return null;
                    }
                    object4 = object3.getAttributeValue(null, "class");
                    typedArray = object2.obtainStyledAttributes((AttributeSet)object3, c.d);
                    string2 = object4;
                    if (object4 == null) {
                        string2 = typedArray.getString(c.e);
                    }
                    n8 = typedArray.getResourceId(c.f, -1);
                    string3 = typedArray.getString(c.g);
                    typedArray.recycle();
                    if (string2 == null) {
                        return null;
                    }
                    if (!j.b(object2.getClassLoader(), string2)) {
                        return null;
                    }
                    n9 = view != null ? view.getId() : 0;
                    if (n9 == -1 && n8 == -1 && string3 == null) {
                        view = new StringBuilder();
                        view.append(object3.getPositionDescription());
                        view.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                        view.append(string2);
                        throw new IllegalArgumentException(view.toString());
                    }
                    if (n8 != -1) {
                        object = this.o.g0(n8);
                    }
                    object4 = object;
                    if (object == null) {
                        object4 = object;
                        if (string3 != null) {
                            object4 = this.o.h0(string3);
                        }
                    }
                    object = object4;
                    if (object4 == null) {
                        object = object4;
                        if (n9 != -1) {
                            object = this.o.g0(n9);
                        }
                    }
                    if (object != null) break block18;
                    object4 = this.o.p0().a(object2.getClassLoader(), string2);
                    object4.B = true;
                    int n10 = n8 != 0 ? n8 : n9;
                    object4.K = n10;
                    object4.L = n9;
                    object4.M = string3;
                    object4.C = true;
                    object4.G = object = this.o;
                    object4.H = object.s0();
                    object4.y0(this.o.s0().i(), (AttributeSet)object3, object4.p);
                    object = this.o.v((Fragment)object4);
                    this.o.g((Fragment)object4);
                    object2 = object4;
                    object3 = object;
                    if (!n.D0(2)) break block19;
                    typedArray = new StringBuilder();
                    typedArray.append("Fragment ");
                    typedArray.append(object4);
                    object3 = " has been inflated via the <fragment> tag: id=0x";
                    object2 = object4;
                    break block20;
                }
                if (object.C) {
                    view = new StringBuilder();
                    view.append(object3.getPositionDescription());
                    view.append(": Duplicate id 0x");
                    view.append(Integer.toHexString((int)n8));
                    view.append(", tag ");
                    view.append(string3);
                    view.append(", or parent id 0x");
                    view.append(Integer.toHexString((int)n9));
                    view.append(" with another fragment for ");
                    view.append(string2);
                    throw new IllegalArgumentException(view.toString());
                }
                object.C = true;
                object.G = object2 = this.o;
                object.H = object2.s0();
                object.y0(this.o.s0().i(), (AttributeSet)object3, object.p);
                object4 = this.o.v((Fragment)object);
                object2 = object;
                object3 = object4;
                if (!n.D0(2)) break block19;
                typedArray = new StringBuilder();
                typedArray.append("Retained Fragment ");
                typedArray.append(object);
                object3 = " has been re-attached via the <fragment> tag: id=0x";
                object2 = object;
                object = object4;
            }
            typedArray.append((String)object3);
            typedArray.append(Integer.toHexString((int)n8));
            Log.v((String)"FragmentManager", (String)typedArray.toString());
            object3 = object;
        }
        object2.U = (ViewGroup)view;
        object3.m();
        object3.j();
        view = object2.V;
        if (view == null) {
            view = new StringBuilder();
            view.append("Fragment ");
            view.append(string2);
            view.append(" did not create a view.");
            throw new IllegalStateException(view.toString());
        }
        if (n8 != 0) {
            view.setId(n8);
        }
        if (object2.V.getTag() == null) {
            object2.V.setTag((Object)string3);
        }
        return object2.V;
    }

    public View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string2, context, attributeSet);
    }
}

