// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public final class c0 implements M
{
    public final O a;
    public final String b;
    public final Object[] c;
    public final int d;
    
    public c0(final O a, final String b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int char1 = b.charAt(0);
        if (char1 >= 55296) {
            int n = char1 & 0x1FFF;
            int n2 = 13;
            int index = 1;
            char char2;
            while (true) {
                char2 = b.charAt(index);
                if (char2 < '\ud800') {
                    break;
                }
                n |= (char2 & '\u1fff') << n2;
                n2 += 13;
                ++index;
            }
            char1 = (n | char2 << n2);
        }
        this.d = char1;
    }
    
    @Override
    public boolean a() {
        return (this.d & 0x2) == 0x2;
    }
    
    @Override
    public Z b() {
        if ((this.d & 0x1) == 0x1) {
            return Z.o;
        }
        return Z.p;
    }
    
    @Override
    public O c() {
        return this.a;
    }
    
    public Object[] d() {
        return this.c;
    }
    
    public String e() {
        return this.b;
    }
}
