/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URI
 */
package T3;

import java.net.URI;

public class f {
    public final String a;
    public final String b;
    public final boolean c;

    public f(String string2, String string3, boolean bl) {
        this.a = string2;
        this.b = string3;
        this.c = bl;
    }

    public static URI a(String string2, boolean bl, String string3, String string4) {
        String string5 = bl ? "wss" : "ws";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string5);
        stringBuilder.append("://");
        stringBuilder.append(string2);
        stringBuilder.append("/.ws?ns=");
        stringBuilder.append(string3);
        stringBuilder.append("&");
        stringBuilder.append("v");
        stringBuilder.append("=");
        stringBuilder.append("5");
        string2 = string3 = stringBuilder.toString();
        if (string4 != null) {
            string2 = new StringBuilder();
            string2.append(string3);
            string2.append("&ls=");
            string2.append(string4);
            string2 = string2.toString();
        }
        return URI.create((String)string2);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http");
        String string2 = this.c ? "s" : "";
        stringBuilder.append(string2);
        stringBuilder.append("://");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

