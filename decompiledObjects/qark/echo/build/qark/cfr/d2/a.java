/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.regex.Pattern
 */
package d2;

import c2.b;
import d2.e;
import f2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a
implements g {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set f;
    public static final a g;
    public static final a h;
    public final String a;
    public final String b;

    static {
        String string2;
        String string3;
        String string4;
        c = string4 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        d = string3 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        e = string2 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new b[]{b.b("proto"), b.b("json")})));
        g = new a(string4, null);
        h = new a(string3, string2);
    }

    public a(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public static a c(byte[] object) {
        if ((object = new String((byte[])object, Charset.forName((String)"UTF-8"))).startsWith("1$")) {
            if ((object = object.substring(2).split(Pattern.quote((String)"\\"), 2)).length == 2) {
                String string2 = object[0];
                if (!string2.isEmpty()) {
                    String string3 = object[1];
                    object = string3;
                    if (string3.isEmpty()) {
                        object = null;
                    }
                    return new a(string2, (String)object);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override
    public Set a() {
        return f;
    }

    public byte[] b() {
        String string2 = this.b;
        if (string2 == null && this.a == null) {
            return null;
        }
        String string3 = this.a;
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        return String.format((String)"%s%s%s%s", (Object[])new Object[]{"1$", string3, "\\", string4}).getBytes(Charset.forName((String)"UTF-8"));
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

