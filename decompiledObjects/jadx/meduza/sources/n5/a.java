package n5;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import h5.a;
import h5.f;
import h5.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.d;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f11268o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f11269p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f11270m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f11271n = new ArrayList<>();

    public static long i(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L;
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // h5.f
    public final g h(byte[] bArr, int i10, boolean z10) {
        u uVar;
        Charset charset;
        StringBuilder sb2;
        String str;
        long[] jArr;
        char c10;
        int i11;
        char c11;
        float f;
        h5.a a10;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        u uVar2 = new u(bArr, i10);
        Charset C = uVar2.C();
        if (C == null) {
            C = d.f11284c;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String h10 = uVar2.h(C);
            if (h10 != null) {
                if (h10.length() != 0) {
                    try {
                        Integer.parseInt(h10);
                        h10 = uVar2.h(C);
                    } catch (NumberFormatException unused) {
                        uVar = uVar2;
                        charset = C;
                        sb2 = new StringBuilder();
                        str = "Skipping invalid index: ";
                    }
                    if (h10 == null) {
                        m.f("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f11268o.matcher(h10);
                        if (matcher.matches()) {
                            long i14 = i(matcher, 1);
                            if (i13 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i13 * 2);
                            }
                            int i15 = i13 + 1;
                            jArr2[i13] = i14;
                            long i16 = i(matcher, 6);
                            if (i15 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i15 * 2);
                            }
                            int i17 = i15 + 1;
                            jArr2[i15] = i16;
                            aVar.f11270m.setLength(i12);
                            aVar.f11271n.clear();
                            String h11 = uVar2.h(C);
                            while (!TextUtils.isEmpty(h11)) {
                                if (aVar.f11270m.length() > 0) {
                                    aVar.f11270m.append("<br>");
                                }
                                StringBuilder sb3 = aVar.f11270m;
                                ArrayList<String> arrayList2 = aVar.f11271n;
                                String trim = h11.trim();
                                StringBuilder sb4 = new StringBuilder(trim);
                                Matcher matcher2 = f11269p.matcher(trim);
                                int i18 = i12;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i18;
                                    int length = group.length();
                                    sb4.replace(start, start + length, "");
                                    i18 += length;
                                }
                                sb3.append(sb4.toString());
                                h11 = uVar2.h(C);
                                i12 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(aVar.f11270m.toString());
                            String str2 = null;
                            int i19 = 0;
                            while (true) {
                                if (i19 < aVar.f11271n.size()) {
                                    String str3 = aVar.f11271n.get(i19);
                                    if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                        str2 = str3;
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                            a.C0105a c0105a = new a.C0105a();
                            c0105a.f7110a = fromHtml;
                            if (str2 == null) {
                                a10 = c0105a.a();
                                jArr = jArr2;
                                uVar = uVar2;
                                charset = C;
                                i11 = i17;
                            } else {
                                jArr = jArr2;
                                uVar = uVar2;
                                charset = C;
                                switch (str2.hashCode()) {
                                    case -685620710:
                                        if (str2.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str2.equals("{\\an2}")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str2.equals("{\\an3}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620617:
                                        if (str2.equals("{\\an4}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620586:
                                        if (str2.equals("{\\an5}")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620555:
                                        if (str2.equals("{\\an6}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str2.equals("{\\an7}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str2.equals("{\\an8}")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str2.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                i11 = i17;
                                c0105a.f7117i = (c10 == 0 || c10 == 1 || c10 == 2) ? 0 : (c10 == 3 || c10 == 4 || c10 == 5) ? 2 : 1;
                                switch (str2.hashCode()) {
                                    case -685620710:
                                        if (str2.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620679:
                                        if (str2.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620648:
                                        if (str2.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620617:
                                        if (str2.equals("{\\an4}")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620586:
                                        if (str2.equals("{\\an5}")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620555:
                                        if (str2.equals("{\\an6}")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620524:
                                        if (str2.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620493:
                                        if (str2.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620462:
                                        if (str2.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                int i20 = (c11 == 0 || c11 == 1 || c11 == 2) ? 2 : (c11 == 3 || c11 == 4 || c11 == 5) ? 0 : 1;
                                c0105a.f7115g = i20;
                                int i21 = c0105a.f7117i;
                                float f10 = 0.92f;
                                if (i21 == 0) {
                                    f = 0.08f;
                                } else if (i21 == 1) {
                                    f = 0.5f;
                                } else {
                                    if (i21 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f = 0.92f;
                                }
                                c0105a.f7116h = f;
                                if (i20 == 0) {
                                    f10 = 0.08f;
                                } else if (i20 == 1) {
                                    f10 = 0.5f;
                                } else if (i20 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                c0105a.f7114e = f10;
                                c0105a.f = 0;
                                a10 = c0105a.a();
                            }
                            arrayList.add(a10);
                            arrayList.add(h5.a.f7094z);
                            jArr2 = jArr;
                            i13 = i11;
                            aVar = this;
                            uVar2 = uVar;
                            C = charset;
                            i12 = 0;
                        } else {
                            uVar = uVar2;
                            charset = C;
                            sb2 = new StringBuilder();
                            str = "Skipping invalid timing: ";
                            sb2.append(str);
                            sb2.append(h10);
                            m.f("SubripDecoder", sb2.toString());
                            aVar = this;
                            uVar2 = uVar;
                            C = charset;
                            i12 = 0;
                        }
                    }
                }
            }
        }
        return new b((h5.a[]) arrayList.toArray(new h5.a[i12]), Arrays.copyOf(jArr2, i13));
    }
}
