/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayDeque
 *  java.util.Deque
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.logging.Logger
 */
package C3;

import A2.n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

public final class A
implements Executor {
    public static final Logger t = Logger.getLogger((String)A.class.getName());
    public final Executor o;
    public final Deque p = new ArrayDeque();
    public c q = c.o;
    public long r = 0L;
    public final b s;

    public A(Executor executor) {
        this.s = new b(null);
        this.o = (Executor)n.i((Object)executor);
    }

    public static /* synthetic */ long d(A a8) {
        long l8 = a8.r;
        a8.r = 1L + l8;
        return l8;
    }

    public static /* synthetic */ Logger e() {
        return t;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void execute(Runnable object) {
        void var1_5;
        boolean bl;
        block16 : {
            c c8;
            n.i(object);
            Deque deque = this.p;
            // MONITORENTER : deque
            Object object2 = this.q;
            if (object2 == c.r || object2 == (c8 = c.q)) break block16;
            long l8 = this.r;
            object2 = new Runnable((Runnable)object){
                public final /* synthetic */ Runnable o;
                {
                    this.o = runnable;
                }

                public void run() {
                    this.o.run();
                }

                public String toString() {
                    return this.o.toString();
                }
            };
            this.p.add(object2);
            this.q = object = c.p;
            // MONITOREXIT : deque
            this.o.execute((Runnable)this.s);
            if (this.q != object) {
                return;
            }
            object2 = this.p;
            // MONITORENTER : object2
            if (this.r == l8 && this.q == object) {
                this.q = c8;
            }
            // MONITOREXIT : object2
            return;
            catch (Error error) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            deque = this.p;
            // MONITORENTER : deque
            c8 = this.q;
            bl = (c8 == c.o || c8 == c.p) && this.p.removeLastOccurrence(object2);
        }
        this.p.add(object);
        // MONITOREXIT : deque
        return;
        if (!(var1_5 instanceof RejectedExecutionException)) throw var1_5;
        if (bl) throw var1_5;
        // MONITOREXIT : deque
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SequentialExecutor@");
        stringBuilder.append(System.identityHashCode((Object)this));
        stringBuilder.append("{");
        stringBuilder.append((Object)this.o);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final class b
    implements Runnable {
        public Runnable o;

        public b() {
        }

        public /* synthetic */ b( a9) {
            this();
        }

        /*
         * Exception decompiling
         */
        public final void a() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 16[UNCONDITIONALDOLOOP]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            try {
                this.a();
                return;
            }
            catch (Error error) {
                Deque deque = A.this.p;
                synchronized (deque) {
                    A.this.q = c.o;
                    throw error;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.o;
            if (runnable != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SequentialExecutorWorker{running=");
                stringBuilder.append((Object)runnable);
                stringBuilder.append("}");
                return stringBuilder.toString();
            }
            runnable = new StringBuilder();
            runnable.append("SequentialExecutorWorker{state=");
            runnable.append((Object)A.this.q);
            runnable.append("}");
            return runnable.toString();
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o;
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* enum */ c r;
        public static final /* synthetic */ c[] s;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            o = c10 = new c();
            p = c8 = new c();
            q = c9 = new c();
            r = c11 = new c();
            s = new c[]{c10, c8, c9, c11};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])s.clone();
        }
    }

}

