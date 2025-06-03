.class public final Lcom/google/android/gms/internal/measurement/J0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/J0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic o:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/o1;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/measurement/o1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/t1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/t1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/s1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/s1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/p1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/p1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v2, Lcom/google/android/gms/internal/measurement/u1;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/u1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->o(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/q1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/q1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/r1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/r1;-><init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/J0;->p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method
