package y0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f21304a = new a();

    public class a implements n {
        @Override // y0.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // y0.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // y0.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
