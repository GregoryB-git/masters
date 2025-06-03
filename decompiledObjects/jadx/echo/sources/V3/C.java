package V3;

import d4.C1227b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final List f6478a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f6479b;

    public C(k kVar) {
        this.f6479b = 0;
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            this.f6478a.add(((C1227b) it.next()).e());
        }
        this.f6479b = Math.max(1, this.f6478a.size());
        for (int i7 = 0; i7 < this.f6478a.size(); i7++) {
            this.f6479b += f((CharSequence) this.f6478a.get(i7));
        }
        a();
    }

    public static String b(String str, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (i7 > 0) {
                sb.append(str);
            }
            sb.append((String) list.get(i7));
        }
        return sb.toString();
    }

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt <= 127) {
                i8++;
            } else if (charAt <= 2047) {
                i8 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i8 += 4;
                i7++;
            } else {
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    public static void g(k kVar, Object obj) {
        new C(kVar).h(obj);
    }

    public final void a() {
        if (this.f6479b > 768) {
            throw new Q3.d("Data has a key path longer than 768 bytes (" + this.f6479b + ").");
        }
        if (this.f6478a.size() <= 32) {
            return;
        }
        throw new Q3.d("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + e());
    }

    public final String c() {
        String str = (String) this.f6478a.remove(r0.size() - 1);
        this.f6479b -= f(str);
        if (this.f6478a.size() > 0) {
            this.f6479b--;
        }
        return str;
    }

    public final void d(String str) {
        if (this.f6478a.size() > 0) {
            this.f6479b++;
        }
        this.f6478a.add(str);
        this.f6479b += f(str);
        a();
    }

    public final String e() {
        if (this.f6478a.size() == 0) {
            return "";
        }
        return "in path '" + b("/", this.f6478a) + "'";
    }

    public final void h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    d(str);
                    h(map.get(str));
                    c();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i7 = 0; i7 < list.size(); i7++) {
                d(Integer.toString(i7));
                h(list.get(i7));
                c();
            }
        }
    }
}
