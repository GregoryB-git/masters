/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 */
package R2;

import A2.n;
import R2.G2;
import R2.Y1;
import R2.a2;
import java.util.concurrent.BlockingQueue;

public final class K2
extends Thread {
    public final Object o;
    public final BlockingQueue p;
    public boolean q;
    public final /* synthetic */ G2 r;

    public K2(G2 g22, String string2, BlockingQueue blockingQueue) {
        this.r = g22;
        this.q = false;
        n.i(string2);
        n.i((Object)blockingQueue);
        this.o = new Object();
        this.p = blockingQueue;
        this.setName(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.o;
        synchronized (object) {
            this.o.notifyAll();
            return;
        }
    }

    public final void b(InterruptedException interruptedException) {
        a2 a22 = this.r.j().L();
        String string2 = this.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" was interrupted");
        a22.b(stringBuilder.toString(), (Object)interruptedException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = G2.E(this.r);
        synchronized (object) {
            try {
                if (!this.q) {
                    G2.H(this.r).release();
                    G2.E(this.r).notifyAll();
                    if (this == G2.A(this.r)) {
                        G2.C(this.r, null);
                    } else if (this == G2.u(this.r)) {
                        G2.x(this.r, null);
                    } else {
                        this.r.j().G().a("Current scheduler thread is neither worker nor network");
                    }
                    this.q = true;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 16[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }
}

