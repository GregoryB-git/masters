package d8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements t9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3595b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f3594a = i10;
        this.f3595b = obj;
    }

    @Override // t9.b
    public final Object get() {
        switch (this.f3594a) {
            case 0:
                String str = (String) this.f3595b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new n(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new n(String.format("Could not instantiate %s.", str), e10);
                } catch (InstantiationException e11) {
                    throw new n(String.format("Could not instantiate %s.", str), e11);
                } catch (NoSuchMethodException e12) {
                    throw new n(String.format("Could not instantiate %s", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new n(String.format("Could not instantiate %s", str), e13);
                }
            default:
                u7.f fVar = (u7.f) this.f3595b;
                Object obj = u9.c.f15111m;
                return new w9.b(fVar);
        }
    }
}
