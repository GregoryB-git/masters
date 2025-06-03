// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.j;
import m6.i;
import m6.d;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import m6.b;

public abstract class c implements b, Serializable
{
    public static final Object NO_RECEIVER;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;
    
    static {
        NO_RECEIVER = a.a();
    }
    
    public c(final Object receiver, final Class owner, final String name, final String signature, final boolean isTopLevel) {
        this.receiver = receiver;
        this.owner = owner;
        this.name = name;
        this.signature = signature;
        this.isTopLevel = isTopLevel;
    }
    
    @Override
    public Object call(final Object... array) {
        return this.getReflected().call(array);
    }
    
    @Override
    public Object callBy(final Map map) {
        return this.getReflected().callBy(map);
    }
    
    public b compute() {
        b reflected;
        if ((reflected = this.reflected) == null) {
            reflected = this.computeReflected();
            this.reflected = reflected;
        }
        return reflected;
    }
    
    public abstract b computeReflected();
    
    @Override
    public List<Annotation> getAnnotations() {
        return (List<Annotation>)this.getReflected().getAnnotations();
    }
    
    public Object getBoundReceiver() {
        return this.receiver;
    }
    
    public String getName() {
        return this.name;
    }
    
    public d getOwner() {
        final Class owner = this.owner;
        if (owner == null) {
            return null;
        }
        if (this.isTopLevel) {
            return v.c(owner);
        }
        return v.b(owner);
    }
    
    @Override
    public List<Object> getParameters() {
        return (List<Object>)this.getReflected().getParameters();
    }
    
    public b getReflected() {
        final b compute = this.compute();
        if (compute != this) {
            return compute;
        }
        throw new f6.b();
    }
    
    @Override
    public i getReturnType() {
        this.getReflected().getReturnType();
        return null;
    }
    
    public String getSignature() {
        return this.signature;
    }
    
    @Override
    public List<Object> getTypeParameters() {
        return (List<Object>)this.getReflected().getTypeParameters();
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
    
    public static class a implements Serializable
    {
        public static final a o;
        
        static {
            o = new a();
        }
        
        public static /* synthetic */ a a() {
            return a.o;
        }
        
        private Object readResolve() {
            return a.o;
        }
    }
}
