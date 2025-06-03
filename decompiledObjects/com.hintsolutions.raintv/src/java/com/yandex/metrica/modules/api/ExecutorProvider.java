/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.modules.api;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.Executor;

public interface ExecutorProvider {
    public ICommonExecutor getDefaultExecutor();

    public ICommonExecutor getSupportIOExecutor();

    public Thread getThread(String var1);

    public Executor getUiExecutor();
}

