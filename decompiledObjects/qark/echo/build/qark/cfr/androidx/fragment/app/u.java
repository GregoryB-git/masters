/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.q;
import androidx.fragment.app.s;
import androidx.fragment.app.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class u {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public q c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Fragment fragment) {
        if (!this.a.contains((Object)fragment)) {
            ArrayList arrayList = this.a;
            synchronized (arrayList) {
                this.a.add((Object)fragment);
            }
            fragment.z = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment already added: ");
        stringBuilder.append((Object)fragment);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void b() {
        this.b.values().removeAll((Collection)Collections.singleton((Object)null));
    }

    public boolean c(String string2) {
        if (this.b.get((Object)string2) != null) {
            return true;
        }
        return false;
    }

    public void d(int n8) {
        for (t t8 : this.b.values()) {
            if (t8 == null) continue;
            t8.t(n8);
        }
    }

    public void e(String string2, FileDescriptor object, PrintWriter printWriter, String[] arrstring) {
        int n8;
        Object object2 = new StringBuilder();
        object2.append(string2);
        object2.append("    ");
        object2 = object2.toString();
        if (!this.b.isEmpty()) {
            printWriter.print(string2);
            printWriter.print("Active Fragments:");
            Iterator iterator = this.b.values().iterator();
            while (iterator.hasNext()) {
                Object object3 = (t)iterator.next();
                printWriter.print(string2);
                if (object3 != null) {
                    object3 = object3.k();
                    printWriter.println(object3);
                    object3.h((String)object2, (FileDescriptor)object, printWriter, arrstring);
                    continue;
                }
                printWriter.println("null");
            }
        }
        if ((n8 = this.a.size()) > 0) {
            printWriter.print(string2);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < n8; ++i8) {
                object = (Fragment)this.a.get(i8);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(object.toString());
            }
        }
    }

    public Fragment f(String object) {
        if ((object = (t)this.b.get(object)) != null) {
            return object.k();
        }
        return null;
    }

    public Fragment g(int n8) {
        Object object;
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            object = (Fragment)this.a.get(i8);
            if (object == null || object.K != n8) continue;
            return object;
        }
        object = this.b.values().iterator();
        while (object.hasNext()) {
            Object object2 = (t)object.next();
            if (object2 == null) continue;
            object2 = object2.k();
            if (object2.K != n8) continue;
            return object2;
        }
        return null;
    }

    public Fragment h(String string2) {
        Object object;
        if (string2 != null) {
            for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
                object = (Fragment)this.a.get(i8);
                if (object == null || !string2.equals((Object)object.M)) continue;
                return object;
            }
        }
        if (string2 != null) {
            object = this.b.values().iterator();
            while (object.hasNext()) {
                Object object2 = (t)object.next();
                if (object2 == null) continue;
                object2 = object2.k();
                if (!string2.equals((Object)object2.M)) continue;
                return object2;
            }
        }
        return null;
    }

    public Fragment i(String string2) {
        for (Object object : this.b.values()) {
            if (object == null || (object = object.k().l(string2)) == null) continue;
            return object;
        }
        return null;
    }

    public int j(Fragment fragment) {
        int n8;
        ViewGroup viewGroup = fragment.U;
        if (viewGroup == null) {
            return -1;
        }
        int n9 = this.a.indexOf((Object)fragment);
        int n10 = n9 - 1;
        do {
            n8 = n9;
            if (n10 < 0) break;
            fragment = (Fragment)this.a.get(n10);
            if (fragment.U == viewGroup && (fragment = fragment.V) != null) {
                return viewGroup.indexOfChild((View)fragment) + 1;
            }
            --n10;
        } while (true);
        while (++n8 < this.a.size()) {
            fragment = (Fragment)this.a.get(n8);
            if (fragment.U != viewGroup || (fragment = fragment.V) == null) continue;
            return viewGroup.indexOfChild((View)fragment);
        }
        return -1;
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (t t8 : this.b.values()) {
            if (t8 == null) continue;
            arrayList.add((Object)t8);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List l() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            Object object = (t)iterator.next();
            object = object != null ? object.k() : null;
            arrayList.add(object);
        }
        return arrayList;
    }

    public t m(String string2) {
        return (t)this.b.get((Object)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List n() {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            return new ArrayList((Collection)this.a);
        }
    }

    public q o() {
        return this.c;
    }

    public void p(t t8) {
        Fragment fragment = t8.k();
        if (this.c(fragment.t)) {
            return;
        }
        this.b.put((Object)fragment.t, (Object)t8);
        if (fragment.Q) {
            if (fragment.P) {
                this.c.e(fragment);
            } else {
                this.c.m(fragment);
            }
            fragment.Q = false;
        }
        if (n.D0(2)) {
            t8 = new StringBuilder();
            t8.append("Added fragment to active set ");
            t8.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)t8.toString());
        }
    }

    public void q(t object) {
        object = object.k();
        if (object.P) {
            this.c.m((Fragment)object);
        }
        if ((t)this.b.put((Object)object.t, (Object)null) == null) {
            return;
        }
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removed fragment from active set ");
            stringBuilder.append(object);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public void r() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            Object object = (Fragment)iterator.next();
            object = (t)this.b.get((Object)object.t);
            if (object == null) continue;
            object.m();
        }
        for (Object object : this.b.values()) {
            if (object == null) continue;
            object.m();
            Fragment fragment = object.k();
            if (!fragment.A || fragment.Y()) continue;
            this.q((t)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(Fragment fragment) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            this.a.remove((Object)fragment);
        }
        fragment.z = false;
    }

    public void t() {
        this.b.clear();
    }

    public void u(List object) {
        this.a.clear();
        if (object != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                Fragment fragment = this.f((String)object);
                if (fragment != null) {
                    if (n.D0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("restoreSaveState: added (");
                        stringBuilder.append((String)object);
                        stringBuilder.append("): ");
                        stringBuilder.append((Object)fragment);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    this.a(fragment);
                    continue;
                }
                iterator = new StringBuilder();
                iterator.append("No instantiated fragment for (");
                iterator.append((String)object);
                iterator.append(")");
                throw new IllegalStateException(iterator.toString());
            }
        }
    }

    public ArrayList v() {
        ArrayList arrayList = new ArrayList(this.b.size());
        Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            Object object = (t)iterator.next();
            if (object == null) continue;
            Fragment fragment = object.k();
            object = object.r();
            arrayList.add(object);
            if (!n.D0(2)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Saved state of ");
            stringBuilder.append((Object)fragment);
            stringBuilder.append(": ");
            stringBuilder.append((Object)object.A);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList w() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(this.a.size());
                Iterator iterator = this.a.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return arrayList2;
                    }
                    Fragment fragment = (Fragment)iterator.next();
                    arrayList2.add((Object)fragment.t);
                    if (!n.D0(2)) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("saveAllState: adding fragment (");
                    stringBuilder.append(fragment.t);
                    stringBuilder.append("): ");
                    stringBuilder.append((Object)fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void x(q q8) {
        this.c = q8;
    }
}

