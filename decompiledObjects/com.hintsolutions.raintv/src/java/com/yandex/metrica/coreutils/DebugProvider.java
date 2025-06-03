/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.coreutils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"Lcom/yandex/metrica/coreutils/DebugProvider;", "", "()V", "DEBUG", "", "core-utils_release"}, k=1, mv={1, 4, 2})
public final class DebugProvider {
    public static final boolean DEBUG = false;
    @NotNull
    public static final DebugProvider INSTANCE = new DebugProvider();

    private DebugProvider() {
    }
}

