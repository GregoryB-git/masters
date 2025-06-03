package C3;

import A2.AbstractC0328n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class A implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f922t = Logger.getLogger(A.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public final Executor f923o;

    /* renamed from: p, reason: collision with root package name */
    public final Deque f924p = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public c f925q = c.IDLE;

    /* renamed from: r, reason: collision with root package name */
    public long f926r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final b f927s = new b(this, null);

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Runnable f928o;

        public a(Runnable runnable) {
            this.f928o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f928o.run();
        }

        public String toString() {
            return this.f928o.toString();
        }
    }

    public final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public Runnable f930o;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            r8.f930o.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            r8.f930o = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            C3.A.f922t.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f930o, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                C3.A r2 = C3.A.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = C3.A.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                C3.A r0 = C3.A.this     // Catch: java.lang.Throwable -> L20
                C3.A$c r0 = C3.A.b(r0)     // Catch: java.lang.Throwable -> L20
                C3.A$c r3 = C3.A.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                C3.A r0 = C3.A.this     // Catch: java.lang.Throwable -> L20
                C3.A.d(r0)     // Catch: java.lang.Throwable -> L20
                C3.A r0 = C3.A.this     // Catch: java.lang.Throwable -> L20
                C3.A.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                C3.A r3 = C3.A.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = C3.A.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f930o = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                C3.A r0 = C3.A.this     // Catch: java.lang.Throwable -> L20
                C3.A$c r3 = C3.A.c.IDLE     // Catch: java.lang.Throwable -> L20
                C3.A.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f930o     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f930o = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = C3.A.e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f930o     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f930o = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: C3.A.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e7) {
                synchronized (A.this.f924p) {
                    A.this.f925q = c.IDLE;
                    throw e7;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f930o;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + A.this.f925q + "}";
        }

        public /* synthetic */ b(A a7, a aVar) {
            this();
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public A(Executor executor) {
        this.f923o = (Executor) AbstractC0328n.i(executor);
    }

    public static /* synthetic */ long d(A a7) {
        long j7 = a7.f926r;
        a7.f926r = 1 + j7;
        return j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            A2.AbstractC0328n.i(r8)
            java.util.Deque r0 = r7.f924p
            monitor-enter(r0)
            C3.A$c r1 = r7.f925q     // Catch: java.lang.Throwable -> L6d
            C3.A$c r2 = C3.A.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            C3.A$c r2 = C3.A.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f926r     // Catch: java.lang.Throwable -> L6d
            C3.A$a r1 = new C3.A$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f924p     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            C3.A$c r8 = C3.A.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f925q = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f923o     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            C3.A$b r5 = r7.f927s     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            C3.A$c r0 = r7.f925q
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f924p
            monitor-enter(r0)
            long r5 = r7.f926r     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            C3.A$c r1 = r7.f925q     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f925q = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f924p
            monitor-enter(r2)
            C3.A$c r0 = r7.f925q     // Catch: java.lang.Throwable -> L55
            C3.A$c r3 = C3.A.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            C3.A$c r3 = C3.A.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f924p     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f924p     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.A.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f923o + "}";
    }
}
