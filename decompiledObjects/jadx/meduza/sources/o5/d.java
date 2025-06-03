package o5;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import h5.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f11888a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11889b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11890c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11891d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11892e;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f11893g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11894h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11895i;

    /* renamed from: j, reason: collision with root package name */
    public final d f11896j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f11897k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f11898l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f11899m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        this.f11888a = str;
        this.f11889b = str2;
        this.f11895i = str4;
        this.f = fVar;
        this.f11893g = strArr;
        this.f11890c = str2 != null;
        this.f11891d = j10;
        this.f11892e = j11;
        str3.getClass();
        this.f11894h = str3;
        this.f11896j = dVar;
        this.f11897k = new HashMap<>();
        this.f11898l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.C0105a c0105a = new a.C0105a();
            c0105a.f7110a = new SpannableStringBuilder();
            treeMap.put(str, c0105a);
        }
        CharSequence charSequence = ((a.C0105a) treeMap.get(str)).f7110a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i10) {
        ArrayList arrayList = this.f11899m;
        if (arrayList != null) {
            return (d) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f11899m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f11888a);
        boolean equals2 = "div".equals(this.f11888a);
        if (z10 || equals || (equals2 && this.f11895i != null)) {
            long j10 = this.f11891d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f11892e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f11899m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f11899m.size(); i10++) {
            ((d) this.f11899m.get(i10)).d(treeSet, z10 || equals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f11891d;
        return (j11 == -9223372036854775807L && this.f11892e == -9223372036854775807L) || (j11 <= j10 && this.f11892e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f11892e) || (j11 <= j10 && j10 < this.f11892e));
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f11894h)) {
            str = this.f11894h;
        }
        if (f(j10) && "div".equals(this.f11888a) && this.f11895i != null) {
            arrayList.add(new Pair(str, this.f11895i));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r19, java.util.Map r21, java.util.Map r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.d.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        this.f11897k.clear();
        this.f11898l.clear();
        if ("metadata".equals(this.f11888a)) {
            return;
        }
        if (!"".equals(this.f11894h)) {
            str = this.f11894h;
        }
        if (this.f11890c && z10) {
            SpannableStringBuilder e10 = e(str, treeMap);
            String str2 = this.f11889b;
            str2.getClass();
            e10.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f11888a) && z10) {
            e(str, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap = this.f11897k;
                String str3 = (String) entry.getKey();
                CharSequence charSequence = ((a.C0105a) entry.getValue()).f7110a;
                charSequence.getClass();
                hashMap.put(str3, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(this.f11888a);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j10, z10 || equals, str, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str, treeMap);
                int length = e11.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e11.charAt(length) == ' ');
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap2 = this.f11898l;
                String str4 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a.C0105a) entry2.getValue()).f7110a;
                charSequence2.getClass();
                hashMap2.put(str4, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
