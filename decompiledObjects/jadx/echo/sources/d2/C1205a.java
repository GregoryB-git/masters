package d2;

import c2.C0819b;
import f2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205a implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13117c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f13118d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f13119e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f13120f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1205a f13121g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1205a f13122h;

    /* renamed from: a, reason: collision with root package name */
    public final String f13123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13124b;

    static {
        String a7 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13117c = a7;
        String a8 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f13118d = a8;
        String a9 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13119e = a9;
        f13120f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0819b.b("proto"), C0819b.b("json"))));
        f13121g = new C1205a(a7, null);
        f13122h = new C1205a(a8, a9);
    }

    public C1205a(String str, String str2) {
        this.f13123a = str;
        this.f13124b = str2;
    }

    public static C1205a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C1205a(str2, str3);
    }

    @Override // f2.g
    public Set a() {
        return f13120f;
    }

    public byte[] b() {
        String str = this.f13124b;
        if (str == null && this.f13123a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f13123a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Override // f2.f
    public String d() {
        return "cct";
    }

    public String e() {
        return this.f13124b;
    }

    public String f() {
        return this.f13123a;
    }

    @Override // f2.f
    public byte[] r() {
        return b();
    }
}
