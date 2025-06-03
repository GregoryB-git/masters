package i1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import f0.C1280a;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14756b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14757c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14758d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14759e;

    /* renamed from: f, reason: collision with root package name */
    public final g f14760f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f14761g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14762h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14763i;

    /* renamed from: j, reason: collision with root package name */
    public final C1344c f14764j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f14765k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f14766l;

    /* renamed from: m, reason: collision with root package name */
    public List f14767m;

    public C1344c(String str, String str2, long j7, long j8, g gVar, String[] strArr, String str3, String str4, C1344c c1344c) {
        this.f14755a = str;
        this.f14756b = str2;
        this.f14763i = str4;
        this.f14760f = gVar;
        this.f14761g = strArr;
        this.f14757c = str2 != null;
        this.f14758d = j7;
        this.f14759e = j8;
        this.f14762h = (String) AbstractC1297a.e(str3);
        this.f14764j = c1344c;
        this.f14765k = new HashMap();
        this.f14766l = new HashMap();
    }

    public static C1344c c(String str, long j7, long j8, g gVar, String[] strArr, String str2, String str3, C1344c c1344c) {
        return new C1344c(str, null, j7, j8, gVar, strArr, str2, str3, c1344c);
    }

    public static C1344c d(String str) {
        return new C1344c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C1342a c1342a : (C1342a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1342a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1342a), spannableStringBuilder.getSpanEnd(c1342a), "");
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                int i9 = i8;
                while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                    i9++;
                }
                int i10 = i9 - i8;
                if (i10 > 0) {
                    spannableStringBuilder.delete(i7, i10 + i7);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
            if (spannableStringBuilder.charAt(i11) == '\n') {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            C1280a.b bVar = new C1280a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC1297a.e(((C1280a.b) map.get(str)).e());
    }

    public void a(C1344c c1344c) {
        if (this.f14767m == null) {
            this.f14767m = new ArrayList();
        }
        this.f14767m.add(c1344c);
    }

    public final void b(Map map, C1280a.b bVar, int i7, int i8, int i9) {
        g f7 = f.f(this.f14760f, this.f14761g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f7 != null) {
            f.a(spannableStringBuilder2, i7, i8, f7, this.f14764j, map, i9);
            if ("p".equals(this.f14755a)) {
                if (f7.k() != Float.MAX_VALUE) {
                    bVar.m((f7.k() * (-90.0f)) / 100.0f);
                }
                if (f7.m() != null) {
                    bVar.p(f7.m());
                }
                if (f7.h() != null) {
                    bVar.j(f7.h());
                }
            }
        }
    }

    public C1344c f(int i7) {
        List list = this.f14767m;
        if (list != null) {
            return (C1344c) list.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f14767m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j7, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j7, this.f14762h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j7, false, this.f14762h, treeMap);
        o(j7, map, map2, this.f14762h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C1346e c1346e = (C1346e) AbstractC1297a.e((C1346e) map2.get(pair.first));
                arrayList2.add(new C1280a.b().f(decodeByteArray).k(c1346e.f14783b).l(0).h(c1346e.f14784c, 0).i(c1346e.f14786e).n(c1346e.f14787f).g(c1346e.f14788g).r(c1346e.f14791j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1346e c1346e2 = (C1346e) AbstractC1297a.e((C1346e) map2.get(entry.getKey()));
            C1280a.b bVar = (C1280a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC1297a.e(bVar.e()));
            bVar.h(c1346e2.f14784c, c1346e2.f14785d);
            bVar.i(c1346e2.f14786e);
            bVar.k(c1346e2.f14783b);
            bVar.n(c1346e2.f14787f);
            bVar.q(c1346e2.f14790i, c1346e2.f14789h);
            bVar.r(c1346e2.f14791j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z7) {
        boolean equals = "p".equals(this.f14755a);
        boolean equals2 = "div".equals(this.f14755a);
        if (z7 || equals || (equals2 && this.f14763i != null)) {
            long j7 = this.f14758d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f14759e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f14767m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f14767m.size(); i7++) {
            ((C1344c) this.f14767m.get(i7)).i(treeSet, z7 || equals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f14761g;
    }

    public boolean m(long j7) {
        long j8 = this.f14758d;
        return (j8 == -9223372036854775807L && this.f14759e == -9223372036854775807L) || (j8 <= j7 && this.f14759e == -9223372036854775807L) || ((j8 == -9223372036854775807L && j7 < this.f14759e) || (j8 <= j7 && j7 < this.f14759e));
    }

    public final void n(long j7, String str, List list) {
        if (!"".equals(this.f14762h)) {
            str = this.f14762h;
        }
        if (m(j7) && "div".equals(this.f14755a) && this.f14763i != null) {
            list.add(new Pair(str, this.f14763i));
            return;
        }
        for (int i7 = 0; i7 < g(); i7++) {
            f(i7).n(j7, str, list);
        }
    }

    public final void o(long j7, Map map, Map map2, String str, Map map3) {
        int i7;
        if (m(j7)) {
            String str2 = "".equals(this.f14762h) ? str : this.f14762h;
            Iterator it = this.f14766l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f14765k.containsKey(str3) ? ((Integer) this.f14765k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (C1280a.b) AbstractC1297a.e((C1280a.b) map3.get(str3)), intValue, intValue2, ((C1346e) AbstractC1297a.e((C1346e) map2.get(str2))).f14791j);
                }
            }
            while (i7 < g()) {
                f(i7).o(j7, map, map2, str2, map3);
                i7++;
            }
        }
    }

    public final void p(long j7, boolean z7, String str, Map map) {
        this.f14765k.clear();
        this.f14766l.clear();
        if ("metadata".equals(this.f14755a)) {
            return;
        }
        if (!"".equals(this.f14762h)) {
            str = this.f14762h;
        }
        if (this.f14757c && z7) {
            k(str, map).append((CharSequence) AbstractC1297a.e(this.f14756b));
            return;
        }
        if ("br".equals(this.f14755a) && z7) {
            k(str, map).append('\n');
            return;
        }
        if (m(j7)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f14765k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC1297a.e(((C1280a.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.f14755a);
            for (int i7 = 0; i7 < g(); i7++) {
                f(i7).p(j7, z7 || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f14766l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC1297a.e(((C1280a.b) entry2.getValue()).e())).length()));
            }
        }
    }
}
