package ec;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements jc.b, Serializable {
    public static final Object NO_RECEIVER = a.f5264a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient jc.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5264a = new a();
    }

    public b() {
        this(NO_RECEIVER);
    }

    public b(Object obj) {
        this(obj, null, null, null, false);
    }

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // jc.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // jc.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public jc.b compute() {
        jc.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        jc.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract jc.b computeReflected();

    @Override // jc.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // jc.b
    public String getName() {
        return this.name;
    }

    public jc.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return t.a(cls);
        }
        t.f5273a.getClass();
        return new k(cls);
    }

    @Override // jc.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public jc.b getReflected() {
        jc.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new cc.a();
    }

    @Override // jc.b
    public jc.i getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // jc.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // jc.b
    public jc.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // jc.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // jc.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // jc.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // jc.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
