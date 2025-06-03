/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.identifiers.impl.e;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.i;
import com.yandex.metrica.identifiers.impl.q;
import com.yandex.metrica.identifiers.impl.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class r
implements i {
    private final e a;

    public r() {
        this(new e(s.a(), q.a, "huawei"));
    }

    @VisibleForTesting
    public r(@NotNull e e2) {
        Intrinsics.checkNotNullParameter((Object)e2, (String)"connectionController");
        this.a = e2;
    }

    /*
     * Exception decompiling
     */
    @Override
    @NotNull
    public g a(@NotNull Context var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at kb.j.j1(SourceFile:66)
         *     at kb.j.X0(SourceFile:54)
         *     at kb.i.Z0(SourceFile:40)
         *     at ib.f.d(SourceFile:217)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

