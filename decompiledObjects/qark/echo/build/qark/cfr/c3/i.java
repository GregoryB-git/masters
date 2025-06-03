/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.security.GeneralSecurityException
 *  java.util.Set
 */
package c3;

import c3.h;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.x;
import java.security.GeneralSecurityException;
import java.util.Set;
import k3.d;
import p3.y;

public class i
implements h {
    public final d a;
    public final Class b;

    public i(d d8, Class class_) {
        if (!d8.i().contains((Object)class_) && !Void.class.equals((Object)class_)) {
            throw new IllegalArgumentException(String.format((String)"Given internalKeyMananger %s does not support primitive class %s", (Object[])new Object[]{d8.toString(), class_.getName()}));
        }
        this.a = d8;
        this.b = class_;
    }

    @Override
    public final Object a(com.google.crypto.tink.shaded.protobuf.h object) {
        try {
            object = this.f(this.a.h((com.google.crypto.tink.shaded.protobuf.h)object));
            return object;
        }
        catch (A a8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failures parsing proto of type ");
            stringBuilder.append(this.a.c().getName());
            throw new GeneralSecurityException(stringBuilder.toString(), (Throwable)a8);
        }
    }

    @Override
    public final O b(com.google.crypto.tink.shaded.protobuf.h object) {
        try {
            object = this.e().a((com.google.crypto.tink.shaded.protobuf.h)object);
            return object;
        }
        catch (A a8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failures parsing proto of type ");
            stringBuilder.append(this.a.f().b().getName());
            throw new GeneralSecurityException(stringBuilder.toString(), (Throwable)a8);
        }
    }

    @Override
    public final y c(com.google.crypto.tink.shaded.protobuf.h object) {
        try {
            object = this.e().a((com.google.crypto.tink.shaded.protobuf.h)object);
            object = (y)y.c0().z(this.d()).A(object.j()).y(this.a.g()).n();
            return object;
        }
        catch (A a8) {
            throw new GeneralSecurityException("Unexpected proto", (Throwable)a8);
        }
    }

    @Override
    public final String d() {
        return this.a.d();
    }

    public final a e() {
        return new a(this.a.f());
    }

    public final Object f(O o8) {
        if (!Void.class.equals((Object)this.b)) {
            this.a.j(o8);
            return this.a.e(o8, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public static class a {
        public final d.a a;

        public a(d.a a8) {
            this.a = a8;
        }

        public O a(com.google.crypto.tink.shaded.protobuf.h h8) {
            return this.b(this.a.d(h8));
        }

        public final O b(O o8) {
            this.a.e(o8);
            return this.a.a(o8);
        }
    }

}

