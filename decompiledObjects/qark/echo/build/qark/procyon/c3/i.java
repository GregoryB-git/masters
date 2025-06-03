// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import com.google.crypto.tink.shaded.protobuf.x;
import p3.y;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import k3.d;

public class i implements h
{
    public final d a;
    public final Class b;
    
    public i(final d a, final Class clazz) {
        if (!a.i().contains(clazz) && !Void.class.equals(clazz)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", a.toString(), clazz.getName()));
        }
        this.a = a;
        this.b = clazz;
    }
    
    @Override
    public final Object a(final com.google.crypto.tink.shaded.protobuf.h h) {
        try {
            return this.f(this.a.h(h));
        }
        catch (A cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failures parsing proto of type ");
            sb.append(this.a.c().getName());
            throw new GeneralSecurityException(sb.toString(), cause);
        }
    }
    
    @Override
    public final O b(final com.google.crypto.tink.shaded.protobuf.h h) {
        try {
            return this.e().a(h);
        }
        catch (A cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failures parsing proto of type ");
            sb.append(this.a.f().b().getName());
            throw new GeneralSecurityException(sb.toString(), cause);
        }
    }
    
    @Override
    public final y c(final com.google.crypto.tink.shaded.protobuf.h h) {
        try {
            return (y)((x.a)y.c0().z(this.d()).A(this.e().a(h).j()).y(this.a.g())).n();
        }
        catch (A cause) {
            throw new GeneralSecurityException("Unexpected proto", cause);
        }
    }
    
    @Override
    public final String d() {
        return this.a.d();
    }
    
    public final a e() {
        return new a(this.a.f());
    }
    
    public final Object f(final O o) {
        if (!Void.class.equals(this.b)) {
            this.a.j(o);
            return this.a.e(o, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
    
    public static class a
    {
        public final d.a a;
        
        public a(final d.a a) {
            this.a = a;
        }
        
        public O a(final com.google.crypto.tink.shaded.protobuf.h h) {
            return this.b(this.a.d(h));
        }
        
        public final O b(final O o) {
            this.a.e(o);
            return this.a.a(o);
        }
    }
}
