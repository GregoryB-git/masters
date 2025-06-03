/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package r0;

import android.net.Uri;
import d0.H;
import d0.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r0.h;

public final class g
extends h {
    public static final g n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final q j;
    public final List k;
    public final Map l;
    public final List m;

    public g(String string2, List list, List list2, List list3, List list4, List list5, List list6, q q8, List list7, boolean bl, Map map, List list8) {
        super(string2, list, bl);
        this.d = Collections.unmodifiableList((List)g.f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList((List)list2);
        this.f = Collections.unmodifiableList((List)list3);
        this.g = Collections.unmodifiableList((List)list4);
        this.h = Collections.unmodifiableList((List)list5);
        this.i = Collections.unmodifiableList((List)list6);
        this.j = q8;
        string2 = list7 != null ? Collections.unmodifiableList((List)list7) : null;
        this.k = string2;
        this.l = Collections.unmodifiableMap((Map)map);
        this.m = Collections.unmodifiableList((List)list8);
    }

    public static void b(List list, List list2) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Uri uri = ((a)list.get((int)i8)).a;
            if (uri == null || list2.contains((Object)uri)) continue;
            list2.add((Object)uri);
        }
    }

    public static List d(List list, int n8, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        block0 : for (int i8 = 0; i8 < list.size(); ++i8) {
            Object object = list.get(i8);
            for (int i9 = 0; i9 < list2.size(); ++i9) {
                H h8 = (H)list2.get(i9);
                if (h8.p != n8 || h8.q != i8) continue;
                arrayList.add(object);
                continue block0;
            }
        }
        return arrayList;
    }

    public static g e(String string2) {
        string2 = Collections.singletonList((Object)b.b(Uri.parse((String)string2)));
        return new g("", Collections.emptyList(), (List)string2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Uri uri = ((b)list.get((int)i8)).a;
            if (arrayList.contains((Object)uri)) continue;
            arrayList.add((Object)uri);
        }
        g.b(list2, (List)arrayList);
        g.b(list3, (List)arrayList);
        g.b(list4, (List)arrayList);
        g.b(list5, (List)arrayList);
        return arrayList;
    }

    public g c(List list) {
        return new g(this.a, this.b, g.d(this.e, 0, list), Collections.emptyList(), g.d(this.g, 1, list), g.d(this.h, 2, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }

    public static final class a {
        public final Uri a;
        public final q b;
        public final String c;
        public final String d;

        public a(Uri uri, q q8, String string2, String string3) {
            this.a = uri;
            this.b = q8;
            this.c = string2;
            this.d = string3;
        }
    }

    public static final class b {
        public final Uri a;
        public final q b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, q q8, String string2, String string3, String string4, String string5) {
            this.a = uri;
            this.b = q8;
            this.c = string2;
            this.d = string3;
            this.e = string4;
            this.f = string5;
        }

        public static b b(Uri uri) {
            return new b(uri, new q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
        }

        public b a(q q8) {
            return new b(this.a, q8, this.c, this.d, this.e, this.f);
        }
    }

}

