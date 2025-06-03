package n4;

import B3.E;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1728a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f17957a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17958b;

    public C1728a(Class cls, Object obj) {
        this.f17957a = (Class) E.b(cls);
        this.f17958b = E.b(obj);
    }

    public Object a() {
        return this.f17958b;
    }

    public Class b() {
        return this.f17957a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f17957a, this.f17958b);
    }
}
