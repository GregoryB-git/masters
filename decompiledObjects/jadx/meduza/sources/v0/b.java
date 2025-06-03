package v0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15185a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f15186b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f15187c;

    public b() {
        try {
            f15187c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f15187c;
        return cls != null ? new t0.h(cls, charSequence) : super.newEditable(charSequence);
    }
}
