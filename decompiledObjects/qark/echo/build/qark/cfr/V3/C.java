/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package V3;

import Q3.d;
import V3.k;
import d4.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C {
    public final List a = new ArrayList();
    public int b;

    public C(k k8) {
        int n8 = 0;
        this.b = 0;
        for (b b8 : k8) {
            this.a.add((Object)b8.e());
        }
        this.b = Math.max((int)1, (int)this.a.size());
        while (n8 < this.a.size()) {
            this.b += C.f((CharSequence)this.a.get(n8));
            ++n8;
        }
        this.a();
    }

    public static String b(String string2, List list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (i8 > 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append((String)list.get(i8));
        }
        return stringBuilder.toString();
    }

    public static int f(CharSequence charSequence) {
        int n8 = charSequence.length();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = charSequence.charAt(i8);
            if (c8 <= '') {
                ++n9;
                continue;
            }
            if (c8 <= '\u07ff') {
                n9 += 2;
                continue;
            }
            if (Character.isHighSurrogate((char)c8)) {
                n9 += 4;
                ++i8;
                continue;
            }
            n9 += 3;
        }
        return n9;
    }

    public static void g(k k8, Object object) {
        new C(k8).h(object);
    }

    public final void a() {
        if (this.b <= 768) {
            if (this.a.size() <= 32) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            stringBuilder.append(this.e());
            throw new d(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data has a key path longer than 768 bytes (");
        stringBuilder.append(this.b);
        stringBuilder.append(").");
        throw new d(stringBuilder.toString());
    }

    public final String c() {
        Object object = this.a;
        object = (String)object.remove(object.size() - 1);
        this.b -= C.f((CharSequence)object);
        if (this.a.size() > 0) {
            --this.b;
        }
        return object;
    }

    public final void d(String string2) {
        if (this.a.size() > 0) {
            ++this.b;
        }
        this.a.add((Object)string2);
        this.b += C.f(string2);
        this.a();
    }

    public final String e() {
        if (this.a.size() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in path '");
        stringBuilder.append(C.b("/", this.a));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public final void h(Object object) {
        if (object instanceof Map) {
            object = (Map)object;
            for (String string2 : object.keySet()) {
                if (string2.startsWith(".")) continue;
                this.d(string2);
                this.h(object.get((Object)string2));
                this.c();
            }
            return;
        }
        if (object instanceof List) {
            object = (List)object;
            for (int i8 = 0; i8 < object.size(); ++i8) {
                this.d(Integer.toString((int)i8));
                this.h(object.get(i8));
                this.c();
            }
        }
    }
}

