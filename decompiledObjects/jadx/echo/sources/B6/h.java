package B6;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class h implements Closeable {

    public class a extends h {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f863o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ D6.b f864p;

        public a(d dVar, long j7, D6.b bVar) {
            this.f863o = j7;
            this.f864p = bVar;
        }

        @Override // B6.h
        public D6.b c() {
            return this.f864p;
        }
    }

    public static h a(d dVar, long j7, D6.b bVar) {
        if (bVar != null) {
            return new a(dVar, j7, bVar);
        }
        throw new NullPointerException("source == null");
    }

    public static h b(d dVar, byte[] bArr) {
        return a(dVar, bArr.length, new D6.a().B(bArr));
    }

    public abstract D6.b c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6.a.c(c());
    }
}
