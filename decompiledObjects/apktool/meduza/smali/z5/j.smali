.class public final synthetic Lz5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/k;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lg/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/j;->b:Ljava/lang/Object;

    iput-object p2, p0, Lz5/j;->c:Ljava/lang/Object;

    iput-object p3, p0, Lz5/j;->a:Ljava/lang/String;

    iput-object p4, p0, Lz5/j;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz5/j;->b:Ljava/lang/Object;

    iput-object p4, p0, Lz5/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lz5/j;->c:Ljava/lang/Object;

    iput-object p3, p0, Lz5/j;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;Lz5/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lz5/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Lz5/j;->c:Ljava/lang/Object;

    iput-object p4, p0, Lz5/j;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz5/j;->b:Ljava/lang/Object;

    check-cast v0, Landroid/accounts/Account;

    iget-object v1, p0, Lz5/j;->a:Ljava/lang/String;

    iget-object v2, p0, Lz5/j;->c:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    iget-object v3, p0, Lz5/j;->d:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zze;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/auth/zzf;

    move-result-object p1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/auth/zzf;->zze(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v3, p1}, Lz5/l;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Service call returned null"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 8

    iget-object v0, p0, Lz5/j;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lz5/j;->a:Ljava/lang/String;

    iget-object v2, p0, Lz5/j;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    .line 1
    sget-object v3, Lcom/google/firebase/iid/FirebaseInstanceId;->j:Lcom/google/firebase/iid/a;

    .line 2
    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->g()Ljava/lang/String;

    move-result-object v4

    .line 3
    iget-object v0, v0, Lcom/google/firebase/iid/FirebaseInstanceId;->c:Lr9/h;

    .line 4
    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v5, v0, Lr9/h;->b:Ljava/lang/String;

    if-nez v5, :cond_0

    invoke-virtual {v0}, Lr9/h;->c()V

    :cond_0
    iget-object v5, v0, Lr9/h;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    .line 6
    monitor-enter v3

    .line 7
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7, p1, v5}, Lcom/google/firebase/iid/a$a;->a(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, v3, Lcom/google/firebase/iid/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-static {v4, v1, v2}, Lcom/google/firebase/iid/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v3

    .line 8
    new-instance v0, Lr9/g;

    invoke-direct {v0, p1}, Lr9/g;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    .line 10
    monitor-exit v0

    throw p1
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lz5/j;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v1, p0, Lz5/j;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v2, p0, Lz5/j;->a:Ljava/lang/String;

    iget-object v3, p0, Lz5/j;->d:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/tasks/Continuation;

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzd(Ljava/lang/Exception;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string p1, "RecaptchaCallWrapper"

    const/4 v4, 0x4

    invoke-static {p1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "RecaptchaCallWrapper"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Falling back to recaptcha enterprise flow for action "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    move-result-object p1

    if-nez p1, :cond_2

    new-instance p1, Lc8/m0;

    .line 12
    iget-object v4, v1, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 13
    invoke-direct {p1, v4, v1}, Lc8/m0;-><init>(Lu7/f;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 14
    monitor-enter v1

    :try_start_0
    iput-object p1, v1, Lcom/google/firebase/auth/FirebaseAuth;->l:Lc8/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    .line 15
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    move-result-object p1

    .line 16
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v2, v1, v0}, Lc8/m0;->b(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v4, Lc8/j0;

    invoke-direct {v4, v3, v0, p1, v2}, Lc8/j0;-><init>(Lcom/google/android/gms/tasks/Continuation;Lcom/google/android/recaptcha/RecaptchaAction;Lc8/m0;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string v1, "RecaptchaCallWrapper"

    .line 17
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Initial task failed for action "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "with exception - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_1
    return-object p1
.end method
