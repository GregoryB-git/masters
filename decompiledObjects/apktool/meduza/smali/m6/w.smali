.class public final Lm6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk6/g$a;


# instance fields
.field public final synthetic a:Lk6/g;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lm6/i;


# direct methods
.method public constructor <init>(Lk6/g;Lcom/google/android/gms/tasks/TaskCompletionSource;Lm6/i;)V
    .locals 0

    iput-object p1, p0, Lm6/w;->a:Lk6/g;

    iput-object p2, p0, Lm6/w;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lm6/w;->c:Lm6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lm6/w;->a:Lk6/g;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lk6/g;->await(JLjava/util/concurrent/TimeUnit;)Lk6/j;

    move-result-object p1

    iget-object v0, p0, Lm6/w;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v1, p0, Lm6/w;->c:Lm6/i;

    invoke-interface {v1, p1}, Lm6/i;->d(Lk6/j;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm6/w;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1}, Lb/a0;->r(Lcom/google/android/gms/common/api/Status;)Lk6/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
