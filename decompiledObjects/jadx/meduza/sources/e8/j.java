package e8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j implements Executor {
    public static final Logger f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4835a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4836b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f4837c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f4838d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final b f4839e = new b();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f4840a;

        public a(Runnable runnable) {
            this.f4840a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4840a.run();
        }

        public final String toString() {
            return this.f4840a.toString();
        }
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f4841a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r10.f4841a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            r10.f4841a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            e8.j.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f4841a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = r0
            L2:
                e8.j r2 = e8.j.this     // Catch: java.lang.Throwable -> L76
                java.util.ArrayDeque r2 = r2.f4836b     // Catch: java.lang.Throwable -> L76
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L76
                r3 = 1
                if (r0 != 0) goto L26
                e8.j r0 = e8.j.this     // Catch: java.lang.Throwable -> L73
                int r4 = r0.f4837c     // Catch: java.lang.Throwable -> L73
                r5 = 4
                if (r4 != r5) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r6 = r0.f4838d     // Catch: java.lang.Throwable -> L73
                r8 = 1
                long r6 = r6 + r8
                r0.f4838d = r6     // Catch: java.lang.Throwable -> L73
                r0.f4837c = r5     // Catch: java.lang.Throwable -> L73
                r0 = r3
            L26:
                e8.j r4 = e8.j.this     // Catch: java.lang.Throwable -> L73
                java.util.ArrayDeque r4 = r4.f4836b     // Catch: java.lang.Throwable -> L73
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L73
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L73
                r10.f4841a = r4     // Catch: java.lang.Throwable -> L73
                if (r4 != 0) goto L43
                e8.j r0 = e8.j.this     // Catch: java.lang.Throwable -> L73
                r0.f4837c = r3     // Catch: java.lang.Throwable -> L73
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L76
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r10.f4841a     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
                r3.run()     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
                goto L6d
            L50:
                r0 = move-exception
                goto L70
            L52:
                r3 = move-exception
                java.util.logging.Logger r4 = e8.j.f     // Catch: java.lang.Throwable -> L50
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L50
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
                r6.<init>()     // Catch: java.lang.Throwable -> L50
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L50
                java.lang.Runnable r7 = r10.f4841a     // Catch: java.lang.Throwable -> L50
                r6.append(r7)     // Catch: java.lang.Throwable -> L50
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L50
            L6d:
                r10.f4841a = r2     // Catch: java.lang.Throwable -> L76
                goto L2
            L70:
                r10.f4841a = r2     // Catch: java.lang.Throwable -> L76
                throw r0     // Catch: java.lang.Throwable -> L76
            L73:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                throw r0     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                if (r1 == 0) goto L80
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L80:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e8.j.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (j.this.f4836b) {
                    j.this.f4837c = 1;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f4841a;
            if (runnable == null) {
                StringBuilder l10 = defpackage.f.l("SequentialExecutorWorker{state=");
                l10.append(defpackage.g.m(j.this.f4837c));
                l10.append("}");
                return l10.toString();
            }
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
    }

    public j(Executor executor) {
        m6.j.i(executor);
        this.f4835a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m6.j.i(runnable);
        synchronized (this.f4836b) {
            int i10 = this.f4837c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f4838d;
                a aVar = new a(runnable);
                this.f4836b.add(aVar);
                this.f4837c = 2;
                try {
                    this.f4835a.execute(this.f4839e);
                    if (this.f4837c != 2) {
                        return;
                    }
                    synchronized (this.f4836b) {
                        if (this.f4838d == j10 && this.f4837c == 2) {
                            this.f4837c = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f4836b) {
                        int i11 = this.f4837c;
                        if ((i11 == 1 || i11 == 2) && this.f4836b.removeLastOccurrence(aVar)) {
                            r0 = true;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f4836b.add(runnable);
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SequentialExecutor@");
        l10.append(System.identityHashCode(this));
        l10.append("{");
        l10.append(this.f4835a);
        l10.append("}");
        return l10.toString();
    }
}
