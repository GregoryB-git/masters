package r0;

import android.net.Uri;
import d0.C1169H;
import d0.C1194q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final g f18992n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f18993d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18994e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18995f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18996g;

    /* renamed from: h, reason: collision with root package name */
    public final List f18997h;

    /* renamed from: i, reason: collision with root package name */
    public final List f18998i;

    /* renamed from: j, reason: collision with root package name */
    public final C1194q f18999j;

    /* renamed from: k, reason: collision with root package name */
    public final List f19000k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f19001l;

    /* renamed from: m, reason: collision with root package name */
    public final List f19002m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f19003a;

        /* renamed from: b, reason: collision with root package name */
        public final C1194q f19004b;

        /* renamed from: c, reason: collision with root package name */
        public final String f19005c;

        /* renamed from: d, reason: collision with root package name */
        public final String f19006d;

        public a(Uri uri, C1194q c1194q, String str, String str2) {
            this.f19003a = uri;
            this.f19004b = c1194q;
            this.f19005c = str;
            this.f19006d = str2;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f19007a;

        /* renamed from: b, reason: collision with root package name */
        public final C1194q f19008b;

        /* renamed from: c, reason: collision with root package name */
        public final String f19009c;

        /* renamed from: d, reason: collision with root package name */
        public final String f19010d;

        /* renamed from: e, reason: collision with root package name */
        public final String f19011e;

        /* renamed from: f, reason: collision with root package name */
        public final String f19012f;

        public b(Uri uri, C1194q c1194q, String str, String str2, String str3, String str4) {
            this.f19007a = uri;
            this.f19008b = c1194q;
            this.f19009c = str;
            this.f19010d = str2;
            this.f19011e = str3;
            this.f19012f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C1194q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
        }

        public b a(C1194q c1194q) {
            return new b(this.f19007a, c1194q, this.f19009c, this.f19010d, this.f19011e, this.f19012f);
        }
    }

    public g(String str, List list, List list2, List list3, List list4, List list5, List list6, C1194q c1194q, List list7, boolean z7, Map map, List list8) {
        super(str, list, z7);
        this.f18993d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f18994e = Collections.unmodifiableList(list2);
        this.f18995f = Collections.unmodifiableList(list3);
        this.f18996g = Collections.unmodifiableList(list4);
        this.f18997h = Collections.unmodifiableList(list5);
        this.f18998i = Collections.unmodifiableList(list6);
        this.f18999j = c1194q;
        this.f19000k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f19001l = Collections.unmodifiableMap(map);
        this.f19002m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, List list2) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((a) list.get(i7)).f19003a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static List d(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    C1169H c1169h = (C1169H) list2.get(i9);
                    if (c1169h.f12386p == i7 && c1169h.f12387q == i8) {
                        arrayList.add(obj);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    public static g e(String str) {
        return new g("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((b) list.get(i7)).f19007a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // v0.InterfaceC2047a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g a(List list) {
        return new g(this.f19013a, this.f19014b, d(this.f18994e, 0, list), Collections.emptyList(), d(this.f18996g, 1, list), d(this.f18997h, 2, list), Collections.emptyList(), this.f18999j, this.f19000k, this.f19015c, this.f19001l, this.f19002m);
    }
}
