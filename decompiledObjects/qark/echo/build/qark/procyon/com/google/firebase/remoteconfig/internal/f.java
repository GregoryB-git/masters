// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import P4.s;
import P4.q;

public class f implements q
{
    public final long a;
    public final int b;
    public final s c;
    
    public f(final long a, final int b, final s c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static b d() {
        return new b(null);
    }
    
    @Override
    public long a() {
        return this.a;
    }
    
    @Override
    public s b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.b;
    }
    
    public static class b
    {
        public long a;
        public int b;
        public s c;
        
        public f a() {
            return new f(this.a, this.b, this.c, null);
        }
        
        public b b(final s c) {
            this.c = c;
            return this;
        }
        
        public b c(final int b) {
            this.b = b;
            return this;
        }
        
        public b d(final long a) {
            this.a = a;
            return this;
        }
    }
}
