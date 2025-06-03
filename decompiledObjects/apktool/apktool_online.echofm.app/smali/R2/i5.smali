.class public final LR2/i5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LR2/i5;->a:Landroid/content/Context;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;II)I
    .locals 5

    .line 1
    iget-object p2, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p2, v0, v0}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, LR2/N2;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x2

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, LR2/Y1;->L()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "AppMeasurementService started with null intent"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p2}, LR2/Y1;->K()LR2/a2;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "Local AppMeasurementService called. startId, action"

    .line 38
    .line 39
    invoke-virtual {v2, v4, v3, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "com.google.android.gms.measurement.UPLOAD"

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    new-instance v1, LR2/k5;

    .line 51
    .line 52
    invoke-direct {v1, p0, p3, p2, p1}, LR2/k5;-><init>(LR2/i5;ILR2/Y1;Landroid/content/Intent;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, LR2/i5;->f(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return v0
.end method

.method public final b(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "onBind called with null intent"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "com.google.android.gms.measurement.START"

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance p1, LR2/R2;

    .line 31
    .line 32
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {v0}, LR2/D5;->k(Landroid/content/Context;)LR2/D5;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p1, v0}, LR2/R2;-><init>(LR2/D5;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_1
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "onBind received unknown action"

    .line 51
    .line 52
    invoke-virtual {v1, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Local AppMeasurementService is starting up"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final synthetic d(ILR2/Y1;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    check-cast v0, LR2/m5;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LR2/m5;->e(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, LR2/Y1;->K()LR2/a2;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "Local AppMeasurementService processed last upload request. StartId"

    .line 20
    .line 21
    invoke-virtual {p2, v0, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "Completed wakeful intent."

    .line 33
    .line 34
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, LR2/i5;->a:Landroid/content/Context;

    .line 38
    .line 39
    check-cast p1, LR2/m5;

    .line 40
    .line 41
    invoke-interface {p1, p3}, LR2/m5;->f(Landroid/content/Intent;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final synthetic e(LR2/Y1;Landroid/app/job/JobParameters;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "AppMeasurementJobService processed last upload request."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LR2/i5;->a:Landroid/content/Context;

    .line 11
    .line 12
    check-cast p1, LR2/m5;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-interface {p1, p2, v0}, LR2/m5;->g(Landroid/app/job/JobParameters;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->k(Landroid/content/Context;)LR2/D5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, LR2/j5;

    .line 12
    .line 13
    invoke-direct {v2, p0, v0, p1}, LR2/j5;-><init>(LR2/i5;LR2/D5;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final g(Landroid/app/job/JobParameters;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "action"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "Local AppMeasurementJobService called. action"

    .line 27
    .line 28
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "com.google.android.gms.measurement.UPLOAD"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    new-instance v1, LR2/h5;

    .line 40
    .line 41
    invoke-direct {v1, p0, v0, p1}, LR2/h5;-><init>(LR2/i5;LR2/Y1;Landroid/app/job/JobParameters;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, LR2/i5;->f(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 p1, 0x1

    .line 48
    return p1
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Local AppMeasurementService is shutting down"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final i(Landroid/content/Intent;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "onRebind called with null intent"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "onRebind called. action"

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final j()LR2/Y1;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/i5;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final k(Landroid/content/Intent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "onUnbind called with null intent"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, LR2/i5;->j()LR2/Y1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "onUnbind called for intent. action"

    .line 31
    .line 32
    invoke-virtual {v1, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return v0
.end method
