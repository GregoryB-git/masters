/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package z1;

import C1.f;
import T1.a;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;

public final class c {
    public static final c a = new c();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List a(View view) {
        if (a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup = f.j(view);
            if (viewGroup == null) return arrayList;
            for (View view2 : f.b((View)viewGroup)) {
                if (view == view2) continue;
                arrayList.addAll((Collection)a.c(view2));
            }
            return arrayList;
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List b(View arrobject) {
        if (a.d(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList;
            Object object;
            Intrinsics.checkNotNullParameter(arrobject, "view");
            arrayList = new ArrayList();
            arrayList.add((Object)f.i((View)arrobject));
            object = arrobject.getTag();
            if (object != null) {
                arrayList.add((Object)object.toString());
            }
            if ((object = arrobject.getContentDescription()) != null) {
                arrayList.add((Object)object.toString());
            }
            try {
                if (arrobject.getId() != -1) {
                    arrobject = arrobject.getResources().getResourceName(arrobject.getId());
                    Intrinsics.checkNotNullExpressionValue(arrobject, "resourceName");
                    arrobject = ((Collection)new Regex("/").c((CharSequence)arrobject, 0)).toArray((Object[])new String[0]);
                    if (arrobject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    if ((arrobject = (String[])arrobject).length == 2) {
                        arrayList.add(arrobject[1]);
                    }
                }
            }
            catch (Resources.NotFoundException notFoundException) {}
            arrobject = new ArrayList();
            arrayList = arrayList.iterator();
            do {
                if (!arrayList.hasNext()) {
                    return arrobject;
                }
                object = (String)arrayList.next();
                if (object.length() <= 0 || object.length() > 100) continue;
                object = object.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).toLowerCase()");
                arrobject.add(object);
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
        return null;
    }

    public static final boolean e(List list, List list2) {
        Throwable throwable2;
        block4 : {
            if (a.d(c.class)) {
                return false;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)list, "indicators");
                Intrinsics.checkNotNullParameter((Object)list2, "keys");
                for (String string2 : list) {
                    boolean bl = a.d(string2, list2);
                    if (!bl) continue;
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return false;
        }
        a.b(throwable2, c.class);
        return false;
    }

    public static final boolean f(String string2, String string3) {
        if (a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "text");
            Intrinsics.checkNotNullParameter(string3, "rule");
            boolean bl = new Regex(string3).b(string2);
            return bl;
        }
        catch (Throwable throwable) {
            a.b(throwable, c.class);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List c(View object) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (object instanceof EditText) {
                return arrayList;
            }
            if (object instanceof TextView) {
                if ((object = ((TextView)object).getText().toString()).length() <= 0 || object.length() >= 100) return arrayList;
                {
                    object = object.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(object);
                    return arrayList;
                }
            }
            object = f.b((View)object).iterator();
            do {
                if (!object.hasNext()) {
                    return arrayList;
                }
                arrayList.addAll((Collection)this.c((View)object.next()));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
        return null;
    }

    public final boolean d(String string2, List list) {
        Throwable throwable2;
        block4 : {
            if (a.d(this)) {
                return false;
            }
            try {
                list = list.iterator();
                while (list.hasNext()) {
                    boolean bl = i.v(string2, (String)list.next(), false, 2, null);
                    if (!bl) continue;
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return false;
        }
        a.b(throwable2, this);
        return false;
    }
}

