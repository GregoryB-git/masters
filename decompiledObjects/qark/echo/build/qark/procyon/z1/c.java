// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z1;

import kotlin.text.i;
import android.widget.TextView;
import android.widget.EditText;
import android.content.res.Resources$NotFoundException;
import kotlin.text.Regex;
import java.util.Iterator;
import android.view.ViewGroup;
import java.util.Collection;
import C1.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import java.util.List;
import android.view.View;

public final class c
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    public static final List a(final View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        Label_0093: {
            ArrayList list;
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                list = new ArrayList();
                final ViewGroup j = f.j(view);
                if (j != null) {
                    for (final View view2 : f.b((View)j)) {
                        if (view != view2) {
                            list.addAll(c.a.c(view2));
                        }
                    }
                }
            }
            finally {
                break Label_0093;
            }
            return list;
        }
        final Throwable t;
        T1.a.b(t, c.class);
        return null;
    }
    
    public static final List b(final View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                Object iterator = new ArrayList<String>();
                ((List<String>)iterator).add(f.i(view));
                final Object tag = view.getTag();
                if (tag != null) {
                    ((List<String>)iterator).add(tag.toString());
                }
                final CharSequence contentDescription = view.getContentDescription();
                if (contentDescription != null) {
                    ((List<String>)iterator).add(contentDescription.toString());
                }
                try {
                    if (view.getId() != -1) {
                        final String resourceName = view.getResources().getResourceName(view.getId());
                        Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                        final Object[] array = new Regex("/").c(resourceName, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        final String[] array2 = (String[])array;
                        if (array2.length == 2) {
                            ((List<String>)iterator).add(array2[1]);
                        }
                    }
                    final ArrayList<String> list = new ArrayList<String>();
                    iterator = ((List<Object>)iterator).iterator();
                    while (((Iterator)iterator).hasNext()) {
                        final String s = ((Iterator<String>)iterator).next();
                        if (s.length() > 0 && s.length() <= 100) {
                            final String lowerCase = s.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                            list.add(lowerCase);
                        }
                    }
                    return list;
                    final Throwable t;
                    T1.a.b(t, c.class);
                    return null;
                }
                catch (Resources$NotFoundException ex) {}
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final boolean e(final List list, final List list2) {
        if (T1.a.d(c.class)) {
            return false;
        }
        Label_0069: {
            try {
                Intrinsics.checkNotNullParameter(list, "indicators");
                Intrinsics.checkNotNullParameter(list2, "keys");
                final Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (c.a.d(iterator.next(), list2)) {
                        return true;
                    }
                }
                return false;
            }
            finally {
                break Label_0069;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, c.class);
        return false;
    }
    
    public static final boolean f(final String s, final String s2) {
        if (T1.a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "text");
            Intrinsics.checkNotNullParameter(s2, "rule");
            return new Regex(s2).b(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, c.class);
            return false;
        }
    }
    
    public final List c(final View view) {
        if (T1.a.d(this)) {
            return null;
        }
        ArrayList<String> list;
        while (true) {
            try {
                list = new ArrayList<String>();
                if (view instanceof EditText) {
                    return list;
                }
                if (!(view instanceof TextView)) {
                    final Iterator<View> iterator = f.b(view).iterator();
                    while (iterator.hasNext()) {
                        list.addAll((Collection<?>)this.c(iterator.next()));
                    }
                    return list;
                }
                final String string = ((TextView)view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    final String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    list.add(lowerCase);
                    return list;
                }
                return list;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
        return list;
    }
    
    public final boolean d(final String s, final List list) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0054: {
            try {
                final Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (i.v(s, iterator.next(), false, 2, null)) {
                        return true;
                    }
                }
                return false;
            }
            finally {
                break Label_0054;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
}
