package V3;

import java.lang.Thread;

/* loaded from: classes.dex */
public interface z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f6751a = new a();

    public class a implements z {
        @Override // V3.z
        public void a(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // V3.z
        public void b(Thread thread, boolean z7) {
            thread.setDaemon(z7);
        }

        @Override // V3.z
        public void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    void a(Thread thread, String str);

    void b(Thread thread, boolean z7);

    void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
