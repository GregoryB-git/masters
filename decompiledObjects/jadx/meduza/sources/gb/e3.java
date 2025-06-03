package gb;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e3 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f6326c = Logger.getLogger(e3.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public boolean f6327a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque<Runnable> f6328b;

    public final void a() {
        while (true) {
            Runnable poll = this.f6328b.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                f6326c.log(Level.SEVERE, "Exception while executing runnable " + poll, th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r6.f6328b != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            x6.b.y(r7, r0)
            boolean r0 = r6.f6327a
            if (r0 != 0) goto L43
            r0 = 1
            r6.f6327a = r0
            r0 = 0
            r7.run()     // Catch: java.lang.Throwable -> L15
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f6328b
            if (r7 == 0) goto L35
            goto L32
        L15:
            r1 = move-exception
            java.util.logging.Logger r2 = gb.e3.f6326c     // Catch: java.lang.Throwable -> L38
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r2.log(r3, r7, r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f6328b
            if (r7 == 0) goto L35
        L32:
            r6.a()
        L35:
            r6.f6327a = r0
            goto L54
        L38:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f6328b
            if (r1 == 0) goto L40
            r6.a()
        L40:
            r6.f6327a = r0
            throw r7
        L43:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f6328b
            if (r0 != 0) goto L4f
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r6.f6328b = r0
        L4f:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f6328b
            r0.add(r7)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e3.execute(java.lang.Runnable):void");
    }
}
