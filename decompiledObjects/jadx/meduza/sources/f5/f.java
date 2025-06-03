package f5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v3.i0;

/* loaded from: classes.dex */
public class f extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final f f5410n = new f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f5411d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f5412e;
    public final List<a> f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f5413g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f5414h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f5415i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f5416j;

    /* renamed from: k, reason: collision with root package name */
    public final List<i0> f5417k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f5418l;

    /* renamed from: m, reason: collision with root package name */
    public final List<a4.d> f5419m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f5420a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f5421b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5422c;

        public a(Uri uri, i0 i0Var, String str) {
            this.f5420a = uri;
            this.f5421b = i0Var;
            this.f5422c = str;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f5423a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f5424b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5425c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5426d;

        /* renamed from: e, reason: collision with root package name */
        public final String f5427e;
        public final String f;

        public b(Uri uri, i0 i0Var, String str, String str2, String str3, String str4) {
            this.f5423a = uri;
            this.f5424b = i0Var;
            this.f5425c = str;
            this.f5426d = str2;
            this.f5427e = str3;
            this.f = str4;
        }
    }

    public f(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, i0 i0Var, List<i0> list7, boolean z10, Map<String, String> map, List<a4.d> list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = list2.get(i10).f5423a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f5411d = Collections.unmodifiableList(arrayList);
        this.f5412e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.f5413g = Collections.unmodifiableList(list4);
        this.f5414h = Collections.unmodifiableList(list5);
        this.f5415i = Collections.unmodifiableList(list6);
        this.f5416j = i0Var;
        this.f5417k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f5418l = Collections.unmodifiableMap(map);
        this.f5419m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f5420a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    y4.c cVar = (y4.c) list2.get(i12);
                    if (cVar.f17429b == i10 && cVar.f17430c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // y4.a
    public final g a(List list) {
        return new f(this.f5428a, this.f5429b, c(this.f5412e, 0, list), Collections.emptyList(), c(this.f5413g, 1, list), c(this.f5414h, 2, list), Collections.emptyList(), this.f5416j, this.f5417k, this.f5430c, this.f5418l, this.f5419m);
    }
}
