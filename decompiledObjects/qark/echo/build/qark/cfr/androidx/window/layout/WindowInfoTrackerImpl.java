/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo
 *  java.lang.Object
 */
package androidx.window.layout;

import android.app.Activity;
import androidx.window.layout.WindowBackend;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerImpl;
import androidx.window.layout.WindowMetricsCalculator;
import g6.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import s6.b;
import s6.d;

@Metadata
public final class WindowInfoTrackerImpl
implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final WindowBackend windowBackend;
    @NotNull
    private final WindowMetricsCalculator windowMetricsCalculator;

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator, @NotNull WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    public static final /* synthetic */ WindowBackend access$getWindowBackend$p(WindowInfoTrackerImpl windowInfoTrackerImpl) {
        return windowInfoTrackerImpl.windowBackend;
    }

    @NotNull
    @Override
    public b windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        return d.e(new p(this, activity, null){
            final /* synthetic */ Activity $activity;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ WindowInfoTrackerImpl this$0;
            {
                this.this$0 = windowInfoTrackerImpl;
                this.$activity = activity;
                super(2, d8);
            }

            public static /* synthetic */ void a(r6.d d8, androidx.window.layout.WindowLayoutInfo windowLayoutInfo2) {
                windowLayoutInfo.invokeSuspend$lambda-0(d8, windowLayoutInfo2);
            }

            private static final void invokeSuspend$lambda-0(r6.d d8, androidx.window.layout.WindowLayoutInfo windowLayoutInfo2) {
                Intrinsics.checkNotNullExpressionValue(windowLayoutInfo2, "info");
                d8.d(windowLayoutInfo2);
            }

            @NotNull
            public final X5.d create(Object object, @NotNull X5.d d8) {
                d8 = new ;
                d8.L$0 = object;
                return d8;
            }

            public final Object invoke(@NotNull s6.c c8, X5.d d8) {
                return (this.create(c8, d8)).invokeSuspend(V5.t.a);
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(@NotNull Object var1_1) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[DOLOOP]
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
                // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
                // org.benf.cfr.reader.entities.Method.dump(Method.java:437)
                // org.benf.cfr.reader.entities.classfilehelpers.ClassFileDumperAnonymousInner.dumpWithArgs(ClassFileDumperAnonymousInner.java:80)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.ConstructorInvokationAnonymousInner.dumpInner(ConstructorInvokationAnonymousInner.java:90)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dumpWithOuterPrecedence(AbstractExpression.java:118)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dump(AbstractExpression.java:80)
                // org.benf.cfr.reader.util.output.StreamDumper.dump(StreamDumper.java:146)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.dumpInner(StaticFunctionInvokation.java:117)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dumpWithOuterPrecedence(AbstractExpression.java:118)
                // org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dump(AbstractExpression.java:80)
                // org.benf.cfr.reader.util.output.StreamDumper.dump(StreamDumper.java:146)
                // org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.dump(StructuredReturn.java:52)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.dump(Op04StructuredStatement.java:188)
                // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.dump(Block.java:509)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.dump(Op04StructuredStatement.java:188)
                // org.benf.cfr.reader.entities.attributes.AttributeCode.dump(AttributeCode.java:144)
                // org.benf.cfr.reader.util.output.StreamDumper.dump(StreamDumper.java:146)
                // org.benf.cfr.reader.entities.Method.dump(Method.java:456)
                // org.benf.cfr.reader.entities.classfilehelpers.ClassFileDumperNormal.dump(ClassFileDumperNormal.java:87)
                // org.benf.cfr.reader.entities.ClassFile.dump(ClassFile.java:866)
                // org.benf.cfr.reader.Main.doJar(Main.java:140)
                // org.benf.cfr.reader.Main.main(Main.java:189)
                throw new IllegalStateException("Decompilation failed");
            }
        });
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

}

