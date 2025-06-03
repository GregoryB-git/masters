package m4;

import m4.InterfaceC1676d;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673a {

    /* renamed from: a, reason: collision with root package name */
    public int f17745a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1676d.a f17746b = InterfaceC1676d.a.DEFAULT;

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    public static final class C0237a implements InterfaceC1676d {

        /* renamed from: a, reason: collision with root package name */
        public final int f17747a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1676d.a f17748b;

        public C0237a(int i7, InterfaceC1676d.a aVar) {
            this.f17747a = i7;
            this.f17748b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC1676d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC1676d)) {
                return false;
            }
            InterfaceC1676d interfaceC1676d = (InterfaceC1676d) obj;
            return this.f17747a == interfaceC1676d.tag() && this.f17748b.equals(interfaceC1676d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f17747a) + (this.f17748b.hashCode() ^ 2041407134);
        }

        @Override // m4.InterfaceC1676d
        public InterfaceC1676d.a intEncoding() {
            return this.f17748b;
        }

        @Override // m4.InterfaceC1676d
        public int tag() {
            return this.f17747a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f17747a + "intEncoding=" + this.f17748b + ')';
        }
    }

    public static C1673a b() {
        return new C1673a();
    }

    public InterfaceC1676d a() {
        return new C0237a(this.f17745a, this.f17746b);
    }

    public C1673a c(int i7) {
        this.f17745a = i7;
        return this;
    }
}
