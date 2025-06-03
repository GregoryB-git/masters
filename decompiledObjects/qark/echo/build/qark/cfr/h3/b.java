/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.logging.Logger
 */
package h3;

import h3.a;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public abstract class b {
    public static final Logger a = Logger.getLogger((String)b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Boolean a() {
        try {
            return (Boolean)Class.forName((String)"org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object)null, new Object[0]);
        }
        catch (Exception exception) {}
        a.info("Conscrypt is not available or does not support checking for FIPS build.");
        return Boolean.FALSE;
    }

    public static boolean b() {
        return b.a();
    }

    public static boolean c() {
        if (!a.a() && !b.get()) {
            return false;
        }
        return true;
    }

    public static abstract class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* synthetic */ b[] q;

        static {
            b b8;
            b b9;
            o = b9 = new b("ALGORITHM_NOT_FIPS", 0){

                @Override
                public boolean c() {
                    return b.c() ^ true;
                }
            };
            p = b8 = new b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1){

                @Override
                public boolean c() {
                    if (b.c() && !b.b()) {
                        return false;
                    }
                    return true;
                }
            };
            q = new b[]{b9, b8};
        }

        public b() {
        }

        /*
         * Exception decompiling
         */
        public /* synthetic */ b(h3.b$a var1) {
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
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }

        public abstract boolean c();

    }

}

