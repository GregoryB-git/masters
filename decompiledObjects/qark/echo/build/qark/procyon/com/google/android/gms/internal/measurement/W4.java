// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class W4 implements G4
{
    public final I4 a;
    public final String b;
    public final Object[] c;
    public final int d;
    
    public W4(final I4 a, final String b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final char char1 = b.charAt(0);
        if (char1 < '\ud800') {
            this.d = char1;
            return;
        }
        int n = char1 & '\u1fff';
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
        this.d = (n | char2 << n2);
    }
    
    @Override
    public final I4 a() {
        return this.a;
    }
    
    @Override
    public final V4 b() {
        final int d = this.d;
        if ((d & 0x1) != 0x0) {
            return V4.o;
        }
        if ((d & 0x4) == 0x4) {
            return V4.q;
        }
        return V4.p;
    }
    
    @Override
    public final boolean c() {
        return (this.d & 0x2) == 0x2;
    }
    
    public final String d() {
        return this.b;
    }
    
    public final Object[] e() {
        return this.c;
    }
}
