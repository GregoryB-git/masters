package e0;

import X2.AbstractC0703v;
import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1239a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0703v f13669a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13670b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f13671c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1240b.a f13672d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1240b.a f13673e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13674f;

    public C1239a(AbstractC0703v abstractC0703v) {
        this.f13669a = abstractC0703v;
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13672d = aVar;
        this.f13673e = aVar;
        this.f13674f = false;
    }

    public InterfaceC1240b.a a(InterfaceC1240b.a aVar) {
        if (aVar.equals(InterfaceC1240b.a.f13676e)) {
            throw new InterfaceC1240b.C0195b(aVar);
        }
        for (int i7 = 0; i7 < this.f13669a.size(); i7++) {
            InterfaceC1240b interfaceC1240b = (InterfaceC1240b) this.f13669a.get(i7);
            InterfaceC1240b.a g7 = interfaceC1240b.g(aVar);
            if (interfaceC1240b.a()) {
                AbstractC1297a.f(!g7.equals(InterfaceC1240b.a.f13676e));
                aVar = g7;
            }
        }
        this.f13673e = aVar;
        return aVar;
    }

    public void b() {
        this.f13670b.clear();
        this.f13672d = this.f13673e;
        this.f13674f = false;
        for (int i7 = 0; i7 < this.f13669a.size(); i7++) {
            InterfaceC1240b interfaceC1240b = (InterfaceC1240b) this.f13669a.get(i7);
            interfaceC1240b.flush();
            if (interfaceC1240b.a()) {
                this.f13670b.add(interfaceC1240b);
            }
        }
        this.f13671c = new ByteBuffer[this.f13670b.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f13671c[i8] = ((InterfaceC1240b) this.f13670b.get(i8)).d();
        }
    }

    public final int c() {
        return this.f13671c.length - 1;
    }

    public ByteBuffer d() {
        if (!f()) {
            return InterfaceC1240b.f13675a;
        }
        ByteBuffer byteBuffer = this.f13671c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(InterfaceC1240b.f13675a);
        return this.f13671c[c()];
    }

    public boolean e() {
        return this.f13674f && ((InterfaceC1240b) this.f13670b.get(c())).c() && !this.f13671c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1239a)) {
            return false;
        }
        C1239a c1239a = (C1239a) obj;
        if (this.f13669a.size() != c1239a.f13669a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f13669a.size(); i7++) {
            if (this.f13669a.get(i7) != c1239a.f13669a.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f13670b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z7;
        do {
            int i7 = 0;
            z7 = false;
            while (i7 <= c()) {
                if (!this.f13671c[i7].hasRemaining()) {
                    InterfaceC1240b interfaceC1240b = (InterfaceC1240b) this.f13670b.get(i7);
                    if (!interfaceC1240b.c()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f13671c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1240b.f13675a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC1240b.f(byteBuffer2);
                        this.f13671c[i7] = interfaceC1240b.d();
                        z7 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f13671c[i7].hasRemaining();
                    } else if (!this.f13671c[i7].hasRemaining() && i7 < c()) {
                        ((InterfaceC1240b) this.f13670b.get(i7 + 1)).e();
                    }
                }
                i7++;
            }
        } while (z7);
    }

    public void h() {
        if (!f() || this.f13674f) {
            return;
        }
        this.f13674f = true;
        ((InterfaceC1240b) this.f13670b.get(0)).e();
    }

    public int hashCode() {
        return this.f13669a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f13674f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i7 = 0; i7 < this.f13669a.size(); i7++) {
            InterfaceC1240b interfaceC1240b = (InterfaceC1240b) this.f13669a.get(i7);
            interfaceC1240b.flush();
            interfaceC1240b.b();
        }
        this.f13671c = new ByteBuffer[0];
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13672d = aVar;
        this.f13673e = aVar;
        this.f13674f = false;
    }
}
