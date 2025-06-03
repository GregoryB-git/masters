package x3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f16967a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f16968e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f16969a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16970b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16971c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16972d;

        public a(int i10, int i11, int i12) {
            this.f16969a = i10;
            this.f16970b = i11;
            this.f16971c = i12;
            this.f16972d = e0.F(i12) ? e0.w(i12, i11) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16969a == aVar.f16969a && this.f16970b == aVar.f16970b && this.f16971c == aVar.f16971c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16969a), Integer.valueOf(this.f16970b), Integer.valueOf(this.f16971c)});
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("AudioFormat[sampleRate=");
            l10.append(this.f16969a);
            l10.append(", channelCount=");
            l10.append(this.f16970b);
            l10.append(", encoding=");
            l10.append(this.f16971c);
            l10.append(']');
            return l10.toString();
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    a e(a aVar);

    void flush();

    boolean isActive();

    void reset();
}
