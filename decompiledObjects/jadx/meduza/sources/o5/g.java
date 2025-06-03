package o5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import h5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import v5.e0;

/* loaded from: classes.dex */
public final class g implements h5.g {

    /* renamed from: a, reason: collision with root package name */
    public final d f11927a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11928b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, f> f11929c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, e> f11930d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f11931e;

    public g(d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f11927a = dVar;
        this.f11930d = hashMap2;
        this.f11931e = hashMap3;
        this.f11929c = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        this.f11928b = jArr;
    }

    @Override // h5.g
    public final int f(long j10) {
        int b10 = e0.b(this.f11928b, j10, false);
        if (b10 < this.f11928b.length) {
            return b10;
        }
        return -1;
    }

    @Override // h5.g
    public final long g(int i10) {
        return this.f11928b[i10];
    }

    @Override // h5.g
    public final List<h5.a> h(long j10) {
        d dVar = this.f11927a;
        Map<String, f> map = this.f11929c;
        Map<String, e> map2 = this.f11930d;
        Map<String, String> map3 = this.f11931e;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.f11894h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.f11894h, treeMap);
        dVar.h(j10, map, map2, dVar.f11894h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                a.C0105a c0105a = new a.C0105a();
                c0105a.f7111b = decodeByteArray;
                c0105a.f7116h = eVar.f11901b;
                c0105a.f7117i = 0;
                c0105a.f7114e = eVar.f11902c;
                c0105a.f = 0;
                c0105a.f7115g = eVar.f11904e;
                c0105a.f7120l = eVar.f;
                c0105a.f7121m = eVar.f11905g;
                c0105a.f7124p = eVar.f11908j;
                arrayList2.add(c0105a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            a.C0105a c0105a2 = (a.C0105a) entry.getValue();
            CharSequence charSequence = c0105a2.f7110a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = eVar2.f11902c;
            int i18 = eVar2.f11903d;
            c0105a2.f7114e = f;
            c0105a2.f = i18;
            c0105a2.f7115g = eVar2.f11904e;
            c0105a2.f7116h = eVar2.f11901b;
            c0105a2.f7120l = eVar2.f;
            float f10 = eVar2.f11907i;
            int i19 = eVar2.f11906h;
            c0105a2.f7119k = f10;
            c0105a2.f7118j = i19;
            c0105a2.f7124p = eVar2.f11908j;
            arrayList2.add(c0105a2.a());
        }
        return arrayList2;
    }

    @Override // h5.g
    public final int i() {
        return this.f11928b.length;
    }
}
