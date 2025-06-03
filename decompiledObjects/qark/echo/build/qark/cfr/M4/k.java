/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package M4;

public abstract class k
extends Enum {
    public static final /* enum */ k p;
    public static final /* enum */ k q;
    public static final /* enum */ k r;
    public static final /* enum */ k s;
    public static final /* enum */ k t;
    public static final /* synthetic */ k[] u;
    public long o;

    static {
        k k8;
        k k9;
        k k10;
        k k11;
        k k12;
        p = k8 = new k("TERABYTES", 0, 0x10000000000L){};
        q = k9 = new k("GIGABYTES", 1, 0x40000000L){};
        r = k10 = new k("MEGABYTES", 2, 0x100000L){};
        s = k11 = new k("KILOBYTES", 3, 1024L){};
        t = k12 = new k("BYTES", 4, 1L){};
        u = new k[]{k8, k9, k10, k11, k12};
    }

    public k(long l8) {
        this.o = l8;
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ k(long var1,  var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Synthetic arg - offset is 1, but got 3
        // org.benf.cfr.reader.bytecode.analysis.types.MethodPrototype.collectInitialSlotUsage(MethodPrototype.java:244)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiersInner(Op02WithProcessedDataAndRefs.java:1561)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1518)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1762)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:382)
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

    public static k valueOf(String string2) {
        return (k)Enum.valueOf(k.class, (String)string2);
    }

    public static k[] values() {
        return (k[])u.clone();
    }

    public long c(long l8) {
        return l8 * this.o / k.s.o;
    }

}

