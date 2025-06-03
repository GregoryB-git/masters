package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import nc.j0;

/* loaded from: classes.dex */
public final class zzas {
    public static final Task zza(j0 j0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        j0Var.invokeOnCompletion(new zzar(taskCompletionSource, j0Var));
        return taskCompletionSource.getTask();
    }
}
