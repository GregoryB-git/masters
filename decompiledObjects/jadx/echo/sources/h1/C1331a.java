package h1;

import W2.e;
import X2.AbstractC0703v;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331a implements t {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14572d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14573e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f14574a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14575b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final z f14576c = new z();

    private Charset f(z zVar) {
        Charset O6 = zVar.O();
        return O6 != null ? O6 : e.f6821c;
    }

    public static float g(int i7) {
        if (i7 == 0) {
            return 0.08f;
        }
        if (i7 == 1) {
            return 0.5f;
        }
        if (i7 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long h(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) AbstractC1297a.e(matcher.group(i7 + 2))) * 60000) + (Long.parseLong((String) AbstractC1297a.e(matcher.group(i7 + 3))) * 1000);
        String group2 = matcher.group(i7 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        String str;
        InterfaceC1303g interfaceC1303g2;
        String str2;
        String s7;
        String str3;
        String str4;
        InterfaceC1303g interfaceC1303g3;
        InterfaceC1303g interfaceC1303g4 = interfaceC1303g;
        String str5 = "SubripParser";
        this.f14576c.R(bArr, i7 + i8);
        this.f14576c.T(i7);
        Charset f7 = f(this.f14576c);
        ArrayList arrayList = (bVar.f10048a == -9223372036854775807L || !bVar.f10049b) ? null : new ArrayList();
        while (true) {
            String s8 = this.f14576c.s(f7);
            if (s8 == null) {
                break;
            }
            if (s8.length() != 0) {
                try {
                    Integer.parseInt(s8);
                    s7 = this.f14576c.s(f7);
                } catch (NumberFormatException unused) {
                    str = str5;
                    interfaceC1303g2 = interfaceC1303g4;
                    str2 = "Skipping invalid index: " + s8;
                }
                if (s7 == null) {
                    o.h(str5, "Unexpected end");
                    break;
                }
                Matcher matcher = f14572d.matcher(s7);
                if (matcher.matches()) {
                    long h7 = h(matcher, 1);
                    long h8 = h(matcher, 6);
                    int i9 = 0;
                    this.f14574a.setLength(0);
                    this.f14575b.clear();
                    String s9 = this.f14576c.s(f7);
                    while (!TextUtils.isEmpty(s9)) {
                        if (this.f14574a.length() > 0) {
                            this.f14574a.append("<br>");
                        }
                        this.f14574a.append(i(s9, this.f14575b));
                        s9 = this.f14576c.s(f7);
                    }
                    Spanned fromHtml = Html.fromHtml(this.f14574a.toString());
                    while (true) {
                        if (i9 >= this.f14575b.size()) {
                            str3 = str5;
                            str4 = null;
                            break;
                        } else {
                            str4 = (String) this.f14575b.get(i9);
                            if (str4.matches("\\{\\\\an[1-9]\\}")) {
                                str3 = str5;
                                break;
                            }
                            i9++;
                        }
                    }
                    long j7 = bVar.f10048a;
                    if (j7 == -9223372036854775807L || h7 >= j7) {
                        interfaceC1303g3 = interfaceC1303g;
                        interfaceC1303g3.accept(new C0816e(AbstractC0703v.Z(e(fromHtml, str4)), h7, h8 - h7));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C0816e(AbstractC0703v.Z(e(fromHtml, str4)), h7, h8 - h7));
                        }
                        interfaceC1303g3 = interfaceC1303g;
                    }
                    interfaceC1303g4 = interfaceC1303g3;
                    str5 = str3;
                } else {
                    String str6 = str5;
                    interfaceC1303g2 = interfaceC1303g4;
                    str2 = "Skipping invalid timing: " + s7;
                    str = str6;
                    o.h(str, str2);
                    interfaceC1303g4 = interfaceC1303g2;
                    str5 = str;
                }
            }
        }
        InterfaceC1303g interfaceC1303g5 = interfaceC1303g4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC1303g5.accept((C0816e) it.next());
            }
        }
    }

    @Override // c1.t
    public int d() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C1280a e(Spanned spanned, String str) {
        char c7;
        char c8;
        C1280a.b o7 = new C1280a.b().o(spanned);
        if (str == null) {
            return o7.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0 || c7 == 1 || c7 == 2) {
            o7.l(0);
        } else if (c7 == 3 || c7 == 4 || c7 == 5) {
            o7.l(2);
        } else {
            o7.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        if (c8 == 0 || c8 == 1 || c8 == 2) {
            o7.i(2);
        } else if (c8 == 3 || c8 == 4 || c8 == 5) {
            o7.i(0);
        } else {
            o7.i(1);
        }
        return o7.k(g(o7.d())).h(g(o7.c()), 0).a();
    }

    public final String i(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f14573e.matcher(trim);
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i7;
            int length = group.length();
            sb.replace(start, start + length, "");
            i7 += length;
        }
        return sb.toString();
    }
}
