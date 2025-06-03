package eb;

import gb.j2;
import gb.v2;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public interface j extends l, r {

    public static final class a implements j {
        @Override // eb.l, eb.r
        public final String a() {
            return "gzip";
        }

        @Override // eb.l
        public final OutputStream b(j2.a aVar) {
            return new GZIPOutputStream(aVar);
        }

        @Override // eb.r
        public final InputStream c(v2.a aVar) {
            return new GZIPInputStream(aVar);
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5135a = new b();

        @Override // eb.l, eb.r
        public final String a() {
            return "identity";
        }

        @Override // eb.l
        public final OutputStream b(j2.a aVar) {
            return aVar;
        }

        @Override // eb.r
        public final InputStream c(v2.a aVar) {
            return aVar;
        }
    }
}
