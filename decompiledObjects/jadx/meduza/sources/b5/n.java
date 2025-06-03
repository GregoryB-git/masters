package b5;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1904a = new a();

    public class a implements n {
        @Override // b5.n
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // b5.n
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // b5.n
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
