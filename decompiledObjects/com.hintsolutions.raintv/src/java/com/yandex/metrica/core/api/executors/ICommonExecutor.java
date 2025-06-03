/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.core.api.executors;

import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public interface ICommonExecutor
extends IInterruptionSafeThread,
Executor {
    public void execute(Runnable var1);

    public void executeDelayed(Runnable var1, long var2);

    public void executeDelayed(Runnable var1, long var2, TimeUnit var4);

    public void remove(Runnable var1);

    public void removeAll();

    public Future submit(Callable var1);
}

