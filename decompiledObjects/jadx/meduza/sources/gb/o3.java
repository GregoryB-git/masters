package gb;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6622a = new a();

    public class a implements o3 {
        @Override // gb.o3
        public final long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
