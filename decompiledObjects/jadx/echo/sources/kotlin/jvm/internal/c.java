package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements m6.b, Serializable {
    public static final Object NO_RECEIVER = a.f16215o;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient m6.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        public static final a f16215o = new a();

        private Object readResolve() {
            return f16215o;
        }
    }

    public c(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }

    @Override // m6.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // m6.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public m6.b compute() {
        m6.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        m6.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract m6.b computeReflected();

    @Override // m6.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public m6.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? v.c(cls) : v.b(cls);
    }

    @Override // m6.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public m6.b getReflected() {
        m6.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new f6.b();
    }

    @Override // m6.b
    public m6.i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // m6.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // m6.b
    public m6.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // m6.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // m6.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // m6.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
