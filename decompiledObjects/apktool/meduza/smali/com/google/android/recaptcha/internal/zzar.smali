.class final Lcom/google/android/recaptcha/internal/zzar;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic zzb:Lnc/j0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lnc/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzar;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzar;->zzb:Lnc/j0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzar;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzar;->zzb:Lnc/j0;

    invoke-interface {p1}, Lnc/j0;->getCompletionExceptionOrNull()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzar;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzar;->zzb:Lnc/j0;

    invoke-interface {v0}, Lnc/j0;->getCompleted()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzar;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    instance-of v1, p1, Ljava/lang/Exception;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/lang/Exception;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    invoke-direct {v1, p1}, Lcom/google/android/gms/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
