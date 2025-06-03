package i3;

import b.a0;
import h3.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import k3.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7400c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<c> f7401d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7402e;
    public static final a f;

    /* renamed from: a, reason: collision with root package name */
    public final String f7403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7404b;

    static {
        String w10 = a0.w("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f7400c = w10;
        String w11 = a0.w("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String w12 = a0.w("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f7401d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f7402e = new a(w10, null);
        f = new a(w11, w12);
    }

    public a(String str, String str2) {
        this.f7403a = str;
        this.f7404b = str2;
    }

    public static a a(byte[] bArr) {
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
        return new a(str2, str3);
    }

    public final byte[] b() {
        String str = this.f7404b;
        if (str == null && this.f7403a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f7403a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
