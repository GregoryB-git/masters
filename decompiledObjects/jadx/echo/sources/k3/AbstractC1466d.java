package k3;

import c3.C0834l;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.O;
import h3.AbstractC1336b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3.y;

/* renamed from: k3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1466d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16140a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16141b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16142c;

    /* renamed from: k3.d$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16143a;

        /* renamed from: k3.d$a$a, reason: collision with other inner class name */
        public static final class C0228a {

            /* renamed from: a, reason: collision with root package name */
            public Object f16144a;

            /* renamed from: b, reason: collision with root package name */
            public C0834l.b f16145b;

            public C0228a(Object obj, C0834l.b bVar) {
                this.f16144a = obj;
                this.f16145b = bVar;
            }
        }

        public a(Class cls) {
            this.f16143a = cls;
        }

        public abstract O a(O o7);

        public final Class b() {
            return this.f16143a;
        }

        public Map c() {
            return Collections.emptyMap();
        }

        public abstract O d(AbstractC1093h abstractC1093h);

        public abstract void e(O o7);
    }

    public AbstractC1466d(Class cls, m... mVarArr) {
        this.f16140a = cls;
        HashMap hashMap = new HashMap();
        for (m mVar : mVarArr) {
            if (hashMap.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            hashMap.put(mVar.b(), mVar);
        }
        this.f16142c = mVarArr.length > 0 ? mVarArr[0].b() : Void.class;
        this.f16141b = Collections.unmodifiableMap(hashMap);
    }

    public AbstractC1336b.EnumC0213b a() {
        return AbstractC1336b.EnumC0213b.f14584o;
    }

    public final Class b() {
        return this.f16142c;
    }

    public final Class c() {
        return this.f16140a;
    }

    public abstract String d();

    public final Object e(O o7, Class cls) {
        m mVar = (m) this.f16141b.get(cls);
        if (mVar != null) {
            return mVar.a(o7);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract y.c g();

    public abstract O h(AbstractC1093h abstractC1093h);

    public final Set i() {
        return this.f16141b.keySet();
    }

    public abstract void j(O o7);
}
