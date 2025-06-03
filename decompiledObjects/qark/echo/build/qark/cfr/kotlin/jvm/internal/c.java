/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.util.List
 *  java.util.Map
 */
package kotlin.jvm.internal;

import f6.b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.v;
import m6.d;
import m6.i;
import m6.j;

public abstract class c
implements m6.b,
Serializable {
    public static final Object NO_RECEIVER = a.a();
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient m6.b reflected;
    private final String signature;

    public c(Object object, Class class_, String string2, String string3, boolean bl) {
        this.receiver = object;
        this.owner = class_;
        this.name = string2;
        this.signature = string3;
        this.isTopLevel = bl;
    }

    @Override
    public /* varargs */ Object call(Object ... arrobject) {
        return this.getReflected().call(arrobject);
    }

    @Override
    public Object callBy(Map map) {
        return this.getReflected().callBy(map);
    }

    public m6.b compute() {
        m6.b b8;
        m6.b b9 = b8 = this.reflected;
        if (b8 == null) {
            this.reflected = b9 = this.computeReflected();
        }
        return b9;
    }

    public abstract m6.b computeReflected();

    public List<Annotation> getAnnotations() {
        return this.getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public d getOwner() {
        Class class_ = this.owner;
        if (class_ == null) {
            return null;
        }
        if (this.isTopLevel) {
            return v.c(class_);
        }
        return v.b(class_);
    }

    public List<Object> getParameters() {
        return this.getReflected().getParameters();
    }

    public m6.b getReflected() {
        m6.b b8 = this.compute();
        if (b8 != this) {
            return b8;
        }
        throw new b();
    }

    @Override
    public i getReturnType() {
        this.getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return this.getReflected().getTypeParameters();
    }

    @Override
    public j getVisibility() {
        return this.getReflected().getVisibility();
    }

    @Override
    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }

    @Override
    public boolean isFinal() {
        return this.getReflected().isFinal();
    }

    @Override
    public boolean isOpen() {
        return this.getReflected().isOpen();
    }

    public static class a
    implements Serializable {
        public static final a o = new a();

        public static /* synthetic */ a a() {
            return o;
        }

        private Object readResolve() {
            return o;
        }
    }

}

