// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import java.net.URI;

public class f
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public f(final String a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static URI a(String s, final boolean b, String s2, final String str) {
        String str2;
        if (b) {
            str2 = "wss";
        }
        else {
            str2 = "ws";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        sb.append(s);
        sb.append("/.ws?ns=");
        sb.append(s2);
        sb.append("&");
        sb.append("v");
        sb.append("=");
        sb.append("5");
        s2 = (s = sb.toString());
        if (str != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append("&ls=");
            sb2.append(str);
            s = sb2.toString();
        }
        return URI.create(s);
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("http");
        String str;
        if (this.c) {
            str = "s";
        }
        else {
            str = "";
        }
        sb.append(str);
        sb.append("://");
        sb.append(this.a);
        return sb.toString();
    }
}
