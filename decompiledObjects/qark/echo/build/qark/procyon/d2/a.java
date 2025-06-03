// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d2;

import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import c2.b;
import java.util.Set;
import f2.g;

public final class a implements g
{
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set f;
    public static final a g;
    public static final a h;
    public final String a;
    public final String b;
    
    static {
        final String s = c = d2.e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        final String s2 = d = d2.e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        final String s3 = e = d2.e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(b.b("proto"), b.b("json"))));
        g = new a(s, null);
        h = new a(s2, s3);
    }
    
    public a(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c(final byte[] bytes) {
        final String s = new String(bytes, Charset.forName("UTF-8"));
        if (!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        final String[] split = s.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        final String s2 = split[0];
        if (!s2.isEmpty()) {
            String s3;
            if ((s3 = split[1]).isEmpty()) {
                s3 = null;
            }
            return new a(s2, s3);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    }
    
    @Override
    public Set a() {
        return d2.a.f;
    }
    
    public byte[] b() {
        final String b = this.b;
        if (b == null && this.a == null) {
            return null;
        }
        final String a = this.a;
        String s;
        if ((s = b) == null) {
            s = "";
        }
        return String.format("%s%s%s%s", "1$", a, "\\", s).getBytes(Charset.forName("UTF-8"));
    }
    
    @Override
    public String d() {
        return "cct";
    }
    
    public String e() {
        return this.b;
    }
    
    public String f() {
        return this.a;
    }
    
    @Override
    public byte[] r() {
        return this.b();
    }
}
