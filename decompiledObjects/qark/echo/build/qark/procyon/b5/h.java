// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

import V4.b;
import java.nio.charset.StandardCharsets;

public final class h
{
    public final String a;
    public l b;
    public final StringBuilder c;
    public int d;
    public int e;
    public k f;
    public int g;
    
    public h(final String s) {
        final byte[] bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        final StringBuilder sb = new StringBuilder(bytes.length);
        for (int length = bytes.length, i = 0; i < length; ++i) {
            final char c = (char)(bytes[i] & 0xFF);
            if (c == '?' && s.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = l.o;
        this.c = new StringBuilder(s.length());
        this.e = -1;
    }
    
    public int a() {
        return this.c.length();
    }
    
    public StringBuilder b() {
        return this.c;
    }
    
    public char c() {
        return this.a.charAt(this.d);
    }
    
    public String d() {
        return this.a;
    }
    
    public int e() {
        return this.e;
    }
    
    public int f() {
        return this.h() - this.d;
    }
    
    public k g() {
        return this.f;
    }
    
    public final int h() {
        return this.a.length() - this.g;
    }
    
    public boolean i() {
        return this.d < this.h();
    }
    
    public void j() {
        this.e = -1;
    }
    
    public void k() {
        this.f = null;
    }
    
    public void l(final b b, final b b2) {
    }
    
    public void m(final int g) {
        this.g = g;
    }
    
    public void n(final l b) {
        this.b = b;
    }
    
    public void o(final int e) {
        this.e = e;
    }
    
    public void p() {
        this.q(this.a());
    }
    
    public void q(final int n) {
        final k f = this.f;
        if (f == null || n > f.a()) {
            this.f = k.l(n, this.b, null, null, true);
        }
    }
    
    public void r(final char c) {
        this.c.append(c);
    }
    
    public void s(final String str) {
        this.c.append(str);
    }
}
