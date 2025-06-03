/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.g;
import b5.h;
import b5.j;

public final class f
implements g {
    public static void b(char c8, StringBuilder stringBuilder) {
        if (c8 >= ' ' && c8 <= '?') {
            stringBuilder.append(c8);
            return;
        }
        if (c8 >= '@' && c8 <= '^') {
            stringBuilder.append((char)(c8 - 64));
            return;
        }
        j.e(c8);
    }

    private static String c(CharSequence charSequence, int n8) {
        int n9 = charSequence.length() - n8;
        if (n9 != 0) {
            char c8 = charSequence.charAt(n8);
            char c9 = '\u0000';
            char c10 = n9 >= 2 ? charSequence.charAt(n8 + 1) : '\u0000';
            char c11 = n9 >= 3 ? charSequence.charAt(n8 + 2) : '\u0000';
            if (n9 >= 4) {
                c9 = charSequence.charAt(n8 + 3);
            }
            n8 = (c8 << 18) + (c10 << 12) + (c11 << 6) + c9;
            char c12 = (char)(n8 >> 16 & 255);
            char c13 = (char)(n8 >> 8 & 255);
            char c14 = (char)(n8 & 255);
            charSequence = new StringBuilder(3);
            charSequence.append(c12);
            if (n9 >= 2) {
                charSequence.append(c13);
            }
            if (n9 >= 3) {
                charSequence.append(c14);
            }
            return charSequence.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /*
     * Exception decompiling
     */
    public static void e(h var0, CharSequence var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [] lbl27 : TryStatement: try { 2[TRYBLOCK]

        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    @Override
    public void a(h h8) {
        StringBuilder stringBuilder = new StringBuilder();
        while (h8.i()) {
            f.b(h8.c(), stringBuilder);
            ++h8.d;
            if (stringBuilder.length() < 4) continue;
            h8.s(f.c((CharSequence)stringBuilder, 0));
            stringBuilder.delete(0, 4);
            if (j.n(h8.d(), h8.d, this.d()) == this.d()) continue;
            h8.o(0);
            break;
        }
        stringBuilder.append('\u001f');
        f.e(h8, (CharSequence)stringBuilder);
    }

    public int d() {
        return 4;
    }
}

