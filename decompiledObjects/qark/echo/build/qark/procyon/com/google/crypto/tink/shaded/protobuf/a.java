// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public abstract class a implements O
{
    protected int memoizedHashCode;
    
    public a() {
        this.memoizedHashCode = 0;
    }
    
    public abstract int e(final e0 p0);
    
    @Override
    public byte[] f() {
        try {
            final byte[] array = new byte[this.a()];
            final k u = k.U(array);
            this.g(u);
            u.c();
            return array;
        }
        catch (IOException cause) {
            throw new RuntimeException(this.h("byte array"), cause);
        }
    }
    
    public final String h(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Serializing ");
        sb.append(this.getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
    
    public j0 i() {
        return new j0(this);
    }
    
    @Override
    public h j() {
        try {
            final h.h t = h.T(this.a());
            this.g(t.b());
            return t.a();
        }
        catch (IOException cause) {
            throw new RuntimeException(this.h("ByteString"), cause);
        }
    }
    
    public abstract static class a implements O.a
    {
        public static j0 l(final O o) {
            return new j0(o);
        }
    }
}
