.class public LR2/N2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/o3;


# static fields
.field public static volatile I:LR2/N2;


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;

.field public C:Ljava/lang/Boolean;

.field public volatile D:Z

.field public E:I

.field public F:I

.field public G:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final H:J

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:LR2/f;

.field public final g:LR2/g;

.field public final h:LR2/l2;

.field public final i:LR2/Y1;

.field public final j:LR2/G2;

.field public final k:LR2/l5;

.field public final l:LR2/S5;

.field public final m:LR2/X1;

.field public final n:LE2/e;

.field public final o:LR2/v4;

.field public final p:LR2/C3;

.field public final q:LR2/B;

.field public final r:LR2/q4;

.field public final s:Ljava/lang/String;

.field public t:LR2/V1;

.field public u:LR2/D4;

.field public v:LR2/C;

.field public w:LR2/S1;

.field public x:Z

.field public y:Ljava/lang/Boolean;

.field public z:J


# direct methods
.method public constructor <init>(LR2/x3;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LR2/N2;->x:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, LR2/N2;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, LR2/x3;->a:Landroid/content/Context;

    new-instance v2, LR2/f;

    invoke-direct {v2, v1}, LR2/f;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, LR2/N2;->f:LR2/f;

    sput-object v2, LR2/M1;->a:LR2/f;

    iget-object v1, p1, LR2/x3;->a:Landroid/content/Context;

    iput-object v1, p0, LR2/N2;->a:Landroid/content/Context;

    iget-object v2, p1, LR2/x3;->b:Ljava/lang/String;

    iput-object v2, p0, LR2/N2;->b:Ljava/lang/String;

    iget-object v2, p1, LR2/x3;->c:Ljava/lang/String;

    iput-object v2, p0, LR2/N2;->c:Ljava/lang/String;

    iget-object v2, p1, LR2/x3;->d:Ljava/lang/String;

    iput-object v2, p0, LR2/N2;->d:Ljava/lang/String;

    iget-boolean v2, p1, LR2/x3;->h:Z

    iput-boolean v2, p0, LR2/N2;->e:Z

    iget-object v2, p1, LR2/x3;->e:Ljava/lang/Boolean;

    iput-object v2, p0, LR2/N2;->A:Ljava/lang/Boolean;

    iget-object v2, p1, LR2/x3;->j:Ljava/lang/String;

    iput-object v2, p0, LR2/N2;->s:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, LR2/N2;->D:Z

    iget-object v3, p1, LR2/x3;->g:Lcom/google/android/gms/internal/measurement/H0;

    if-eqz v3, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    if-eqz v4, :cond_1

    const-string v5, "measurementEnabled"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/Boolean;

    iput-object v4, p0, LR2/N2;->B:Ljava/lang/Boolean;

    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    const-string v4, "measurementDeactivated"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/Boolean;

    iput-object v3, p0, LR2/N2;->C:Ljava/lang/Boolean;

    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/S2;->l(Landroid/content/Context;)V

    invoke-static {}, LE2/h;->d()LE2/e;

    move-result-object v3

    iput-object v3, p0, LR2/N2;->n:LE2/e;

    iget-object v4, p1, LR2/x3;->i:Ljava/lang/Long;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    invoke-interface {v3}, LE2/e;->a()J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, LR2/N2;->H:J

    new-instance v3, LR2/g;

    invoke-direct {v3, p0}, LR2/g;-><init>(LR2/N2;)V

    iput-object v3, p0, LR2/N2;->g:LR2/g;

    new-instance v3, LR2/l2;

    invoke-direct {v3, p0}, LR2/l2;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/l3;->p()V

    iput-object v3, p0, LR2/N2;->h:LR2/l2;

    new-instance v3, LR2/Y1;

    invoke-direct {v3, p0}, LR2/Y1;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/l3;->p()V

    iput-object v3, p0, LR2/N2;->i:LR2/Y1;

    new-instance v3, LR2/S5;

    invoke-direct {v3, p0}, LR2/S5;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/l3;->p()V

    iput-object v3, p0, LR2/N2;->l:LR2/S5;

    new-instance v3, LR2/w3;

    invoke-direct {v3, p1, p0}, LR2/w3;-><init>(LR2/x3;LR2/N2;)V

    new-instance v4, LR2/X1;

    invoke-direct {v4, v3}, LR2/X1;-><init>(LR2/W1;)V

    iput-object v4, p0, LR2/N2;->m:LR2/X1;

    new-instance v3, LR2/B;

    invoke-direct {v3, p0}, LR2/B;-><init>(LR2/N2;)V

    iput-object v3, p0, LR2/N2;->q:LR2/B;

    new-instance v3, LR2/v4;

    invoke-direct {v3, p0}, LR2/v4;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/f1;->w()V

    iput-object v3, p0, LR2/N2;->o:LR2/v4;

    new-instance v3, LR2/C3;

    invoke-direct {v3, p0}, LR2/C3;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/f1;->w()V

    iput-object v3, p0, LR2/N2;->p:LR2/C3;

    new-instance v3, LR2/l5;

    invoke-direct {v3, p0}, LR2/l5;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/f1;->w()V

    iput-object v3, p0, LR2/N2;->k:LR2/l5;

    new-instance v3, LR2/q4;

    invoke-direct {v3, p0}, LR2/q4;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/l3;->p()V

    iput-object v3, p0, LR2/N2;->r:LR2/q4;

    new-instance v3, LR2/G2;

    invoke-direct {v3, p0}, LR2/G2;-><init>(LR2/N2;)V

    invoke-virtual {v3}, LR2/l3;->p()V

    iput-object v3, p0, LR2/N2;->j:LR2/G2;

    iget-object v4, p1, LR2/x3;->g:Lcom/google/android/gms/internal/measurement/H0;

    if-eqz v4, :cond_3

    iget-wide v4, v4, Lcom/google/android/gms/internal/measurement/H0;->p:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    move v0, v2

    :cond_3
    xor-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v1

    invoke-virtual {v1}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_6

    invoke-virtual {v1}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    iget-object v4, v1, LR2/C3;->c:LR2/k4;

    if-nez v4, :cond_4

    new-instance v4, LR2/k4;

    invoke-direct {v4, v1}, LR2/k4;-><init>(LR2/C3;)V

    iput-object v4, v1, LR2/C3;->c:LR2/k4;

    :cond_4
    if-eqz v0, :cond_6

    iget-object v0, v1, LR2/C3;->c:LR2/k4;

    invoke-virtual {v2, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, LR2/C3;->c:LR2/k4;

    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    :goto_1
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_6
    new-instance v0, LR2/O2;

    invoke-direct {v0, p0, p1}, LR2/O2;-><init>(LR2/N2;LR2/x3;)V

    invoke-virtual {v3, v0}, LR2/G2;->D(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;
    .locals 12

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/H0;->s:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/H0;->t:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/H0;

    .line 12
    .line 13
    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/H0;->o:J

    .line 14
    .line 15
    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/H0;->p:J

    .line 16
    .line 17
    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/H0;->q:Z

    .line 18
    .line 19
    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/H0;->r:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    move-object v1, v0

    .line 27
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/H0;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :cond_1
    invoke-static {p0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v0, LR2/N2;->I:LR2/N2;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    const-class v0, LR2/N2;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_0
    sget-object v1, LR2/N2;->I:LR2/N2;

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    new-instance v1, LR2/x3;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, p2}, LR2/x3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, LR2/N2;

    .line 58
    .line 59
    invoke-direct {p0, v1}, LR2/N2;-><init>(LR2/x3;)V

    .line 60
    .line 61
    .line 62
    sput-object p0, LR2/N2;->I:LR2/N2;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    monitor-exit v0

    .line 68
    goto :goto_2

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p0

    .line 71
    :cond_3
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    const-string p2, "dataCollectionDefaultEnabled"

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    sget-object p0, LR2/N2;->I:LR2/N2;

    .line 86
    .line 87
    invoke-static {p0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object p0, LR2/N2;->I:LR2/N2;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    .line 93
    .line 94
    const-string p2, "dataCollectionDefaultEnabled"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p0, p1}, LR2/N2;->m(Z)V

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_2
    sget-object p0, LR2/N2;->I:LR2/N2;

    .line 104
    .line 105
    invoke-static {p0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object p0, LR2/N2;->I:LR2/N2;

    .line 109
    .line 110
    return-object p0
.end method

.method public static f(LR2/f1;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/f1;->z()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Component not initialized: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "Component not created"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public static synthetic g(LR2/N2;LR2/x3;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    new-instance v0, LR2/C;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LR2/C;-><init>(LR2/N2;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LR2/l3;->p()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LR2/N2;->v:LR2/C;

    .line 17
    .line 18
    new-instance v0, LR2/S1;

    .line 19
    .line 20
    iget-wide v1, p1, LR2/x3;->f:J

    .line 21
    .line 22
    invoke-direct {v0, p0, v1, v2}, LR2/S1;-><init>(LR2/N2;J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, LR2/f1;->w()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LR2/N2;->w:LR2/S1;

    .line 29
    .line 30
    new-instance p1, LR2/V1;

    .line 31
    .line 32
    invoke-direct {p1, p0}, LR2/V1;-><init>(LR2/N2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, LR2/f1;->w()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LR2/N2;->t:LR2/V1;

    .line 39
    .line 40
    new-instance p1, LR2/D4;

    .line 41
    .line 42
    invoke-direct {p1, p0}, LR2/D4;-><init>(LR2/N2;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, LR2/f1;->w()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LR2/N2;->u:LR2/D4;

    .line 49
    .line 50
    iget-object p1, p0, LR2/N2;->l:LR2/S5;

    .line 51
    .line 52
    invoke-virtual {p1}, LR2/l3;->q()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LR2/N2;->h:LR2/l2;

    .line 56
    .line 57
    invoke-virtual {p1}, LR2/l3;->q()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, LR2/N2;->w:LR2/S1;

    .line 61
    .line 62
    invoke-virtual {p1}, LR2/f1;->x()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-wide/32 v1, 0x14051

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "App measurement initialized, version"

    .line 81
    .line 82
    invoke-virtual {p1, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 94
    .line 95
    invoke-virtual {p1, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, LR2/S1;->F()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object v0, p0, LR2/N2;->b:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, p1}, LR2/S5;->F0(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_0

    .line 119
    .line 120
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 129
    .line 130
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_0
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {v0, p1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_1
    :goto_0
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const-string v0, "Debug-level message logging enabled"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget p1, p0, LR2/N2;->E:I

    .line 173
    .line 174
    iget-object v0, p0, LR2/N2;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eq p1, v0, :cond_2

    .line 181
    .line 182
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget v0, p0, LR2/N2;->E:I

    .line 191
    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, LR2/N2;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const-string v2, "Not all components initialized"

    .line 207
    .line 208
    invoke-virtual {p1, v2, v0, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_2
    const/4 p1, 0x1

    .line 212
    iput-boolean p1, p0, LR2/N2;->x:Z

    .line 213
    .line 214
    return-void
.end method

.method public static h(LR2/l3;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/l3;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Component not initialized: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "Component not created"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public static i(LR2/m3;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v0, "Component not created"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method


# virtual methods
.method public final A()LR2/C;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->v:LR2/C;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->h(LR2/l3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->v:LR2/C;

    .line 7
    .line 8
    return-object v0
.end method

.method public final B()LR2/S1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->w:LR2/S1;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->w:LR2/S1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final C()LR2/V1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->t:LR2/V1;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->t:LR2/V1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final D()LR2/X1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->m:LR2/X1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()LR2/Y1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->i:LR2/Y1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/l3;->r()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LR2/N2;->i:LR2/Y1;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final F()LR2/l2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->h:LR2/l2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->i(LR2/m3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->h:LR2/l2;

    .line 7
    .line 8
    return-object v0
.end method

.method public final G()LR2/G2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->j:LR2/G2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()LR2/C3;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->p:LR2/C3;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->p:LR2/C3;

    .line 7
    .line 8
    return-object v0
.end method

.method public final I()LR2/v4;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->o:LR2/v4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->o:LR2/v4;

    .line 7
    .line 8
    return-object v0
.end method

.method public final J()LR2/D4;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->u:LR2/D4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->u:LR2/D4;

    .line 7
    .line 8
    return-object v0
.end method

.method public final K()LR2/l5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->k:LR2/l5;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->f(LR2/f1;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->k:LR2/l5;

    .line 7
    .line 8
    return-object v0
.end method

.method public final L()LR2/S5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->l:LR2/S5;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->i(LR2/m3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->l:LR2/S5;

    .line 7
    .line 8
    return-object v0
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Unexpected call on client side"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final R()V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LE2/e;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->n:LE2/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LR2/f;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->f:LR2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LR2/G2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->j:LR2/G2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->h(LR2/l3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->j:LR2/G2;

    .line 7
    .line 8
    return-object v0
.end method

.method public final j()LR2/Y1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->i:LR2/Y1;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->h(LR2/l3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->i:LR2/Y1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final k(Lcom/google/android/gms/internal/measurement/H0;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LR2/N2;->g:LR2/g;

    sget-object v1, LR2/K;->M0:LR2/P1;

    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object v0

    invoke-virtual {v0}, LR2/S5;->V0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v2, LR2/X5;

    iget-object v3, v0, LR2/m3;->a:LR2/N2;

    invoke-direct {v2, v3}, LR2/X5;-><init>(LR2/N2;)V

    invoke-virtual {v0}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v2, v1, v4}, Lx/a;->h(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v1, "Registered app receiver"

    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    invoke-virtual {v0}, LR2/l2;->J()LR2/q3;

    move-result-object v0

    invoke-virtual {v0}, LR2/q3;->b()I

    move-result v1

    iget-object v2, p0, LR2/N2;->g:LR2/g;

    const-string v3, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v2, v3}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, p0, LR2/N2;->g:LR2/g;

    const-string v4, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v3, v4}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, -0xa

    const/4 v5, 0x0

    const/16 v6, 0x1e

    if-nez v2, :cond_1

    if-eqz v3, :cond_2

    :cond_1
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v7

    invoke-virtual {v7, v4}, LR2/l2;->x(I)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v1, LR2/q3;

    invoke-direct {v1, v2, v3, v4}, LR2/q3;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v2

    invoke-virtual {v2}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    if-eqz v1, :cond_3

    if-eq v1, v6, :cond_3

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    if-eq v1, v6, :cond_3

    if-eq v1, v6, :cond_3

    const/16 v2, 0x28

    if-ne v1, v2, :cond_4

    :cond_3
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v1

    new-instance v2, LR2/q3;

    invoke-direct {v2, v5, v5, v4}, LR2/q3;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    iget-wide v7, p0, LR2/N2;->H:J

    invoke-virtual {v1, v2, v7, v8}, LR2/C3;->H(LR2/q3;J)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v1

    invoke-virtual {v1}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    if-eqz p1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v1

    invoke-virtual {v1, v6}, LR2/l2;->x(I)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    invoke-static {v1, v6}, LR2/q3;->d(Landroid/os/Bundle;I)LR2/q3;

    move-result-object v1

    invoke-virtual {v1}, LR2/q3;->z()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    move-object v1, v5

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v0

    iget-wide v2, p0, LR2/N2;->H:J

    invoke-virtual {v0, v1, v2, v3}, LR2/C3;->H(LR2/q3;J)V

    move-object v0, v1

    :cond_6
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v1

    invoke-virtual {v1, v0}, LR2/C3;->G(LR2/q3;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    iget-object v0, p0, LR2/N2;->g:LR2/g;

    sget-object v2, LR2/K;->S0:LR2/P1;

    invoke-virtual {v0, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    invoke-virtual {v0}, LR2/l2;->I()LR2/z;

    move-result-object v0

    invoke-virtual {v0}, LR2/z;->a()I

    move-result v0

    iget-object v2, p0, LR2/N2;->g:LR2/g;

    const-string v3, "google_analytics_default_allow_ad_user_data"

    invoke-virtual {v2, v3}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v4, v0}, LR2/q3;->k(II)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object p1

    new-instance v0, LR2/z;

    invoke-direct {v0, v2, v4}, LR2/z;-><init>(Ljava/lang/Boolean;I)V

    :goto_2
    invoke-virtual {p1, v0}, LR2/C3;->F(LR2/z;)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v2

    invoke-virtual {v2}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    if-eqz v0, :cond_8

    if-ne v0, v6, :cond_9

    :cond_8
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object p1

    new-instance v0, LR2/z;

    invoke-direct {v0, v5, v4}, LR2/z;-><init>(Ljava/lang/Boolean;I)V

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v2

    invoke-virtual {v2}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    if-eqz p1, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    if-eqz v2, :cond_a

    invoke-static {v6, v0}, LR2/q3;->k(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    invoke-static {v0, v6}, LR2/z;->b(Landroid/os/Bundle;I)LR2/z;

    move-result-object v0

    invoke-virtual {v0}, LR2/z;->j()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v2

    invoke-virtual {v2, v0}, LR2/C3;->F(LR2/z;)V

    :cond_a
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v0

    invoke-virtual {v0}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz p1, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    iget-object v0, v0, LR2/l2;->m:LR2/r2;

    invoke-virtual {v0}, LR2/r2;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/H0;->u:Landroid/os/Bundle;

    invoke-static {v0}, LR2/z;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/H0;->s:Ljava/lang/String;

    const-string v3, "allow_personalized_ads"

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v3, v0, v1}, LR2/C3;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_b
    :goto_3
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->e:LR2/q2;

    invoke-virtual {p1}, LR2/q2;->a()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long p1, v2, v6

    if-nez p1, :cond_c

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    iget-wide v2, p0, LR2/N2;->H:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "Persisting first open"

    invoke-virtual {p1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->e:LR2/q2;

    iget-wide v2, p0, LR2/N2;->H:J

    invoke-virtual {p1, v2, v3}, LR2/q2;->b(J)V

    :cond_c
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object p1

    iget-object p1, p1, LR2/C3;->n:LR2/c6;

    invoke-virtual {p1}, LR2/c6;->c()V

    invoke-virtual {p0}, LR2/N2;->s()Z

    move-result p1

    if-nez p1, :cond_11

    invoke-virtual {p0}, LR2/N2;->p()Z

    move-result p1

    if-eqz p1, :cond_1a

    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object p1

    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, LR2/S5;->E0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_d

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "App is missing INTERNET permission"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object p1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, LR2/S5;->E0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_e
    iget-object p1, p0, LR2/N2;->a:Landroid/content/Context;

    invoke-static {p1}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    move-result-object p1

    invoke-virtual {p1}, LG2/c;->f()Z

    move-result p1

    if-nez p1, :cond_10

    iget-object p1, p0, LR2/N2;->g:LR2/g;

    invoke-virtual {p1}, LR2/g;->S()Z

    move-result p1

    if-nez p1, :cond_10

    iget-object p1, p0, LR2/N2;->a:Landroid/content/Context;

    invoke-static {p1}, LR2/S5;->c0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_f

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_f
    iget-object p1, p0, LR2/N2;->a:Landroid/content/Context;

    invoke-static {p1, v1}, LR2/S5;->d0(Landroid/content/Context;Z)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "AppMeasurementService not registered/enabled"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_10
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "Uploading is not possible. App measurement disabled"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_11
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object p1

    invoke-virtual {p1}, LR2/S1;->G()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object p1

    invoke-virtual {p1}, LR2/S1;->E()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_14

    :cond_12
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object p1

    invoke-virtual {p1}, LR2/S1;->G()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    invoke-virtual {v0}, LR2/l2;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v1

    invoke-virtual {v1}, LR2/S1;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v2

    invoke-virtual {v2}, LR2/l2;->O()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LR2/S5;->l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    move-result-object p1

    const-string v0, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    invoke-virtual {p1}, LR2/l2;->Q()V

    invoke-virtual {p0}, LR2/N2;->C()LR2/V1;

    move-result-object p1

    invoke-virtual {p1}, LR2/V1;->H()V

    iget-object p1, p0, LR2/N2;->u:LR2/D4;

    invoke-virtual {p1}, LR2/D4;->Z()V

    iget-object p1, p0, LR2/N2;->u:LR2/D4;

    invoke-virtual {p1}, LR2/D4;->Y()V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->e:LR2/q2;

    iget-wide v0, p0, LR2/N2;->H:J

    invoke-virtual {p1, v0, v1}, LR2/q2;->b(J)V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->g:LR2/r2;

    invoke-virtual {p1, v5}, LR2/r2;->b(Ljava/lang/String;)V

    :cond_13
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v0

    invoke-virtual {v0}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LR2/l2;->G(Ljava/lang/String;)V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object v0

    invoke-virtual {v0}, LR2/S1;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LR2/l2;->D(Ljava/lang/String;)V

    :cond_14
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    invoke-virtual {p1}, LR2/l2;->J()LR2/q3;

    move-result-object p1

    sget-object v0, LR2/q3$a;->q:LR2/q3$a;

    invoke-virtual {p1, v0}, LR2/q3;->l(LR2/q3$a;)Z

    move-result p1

    if-nez p1, :cond_15

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->g:LR2/r2;

    invoke-virtual {p1, v5}, LR2/r2;->b(Ljava/lang/String;)V

    :cond_15
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object p1

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    iget-object v0, v0, LR2/l2;->g:LR2/r2;

    invoke-virtual {v0}, LR2/r2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LR2/C3;->T(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/t6;->a()Z

    move-result p1

    if-eqz p1, :cond_16

    iget-object p1, p0, LR2/N2;->g:LR2/g;

    sget-object v0, LR2/K;->p0:LR2/P1;

    invoke-virtual {p1, v0}, LR2/g;->s(LR2/P1;)Z

    move-result p1

    if-eqz p1, :cond_16

    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object p1

    invoke-virtual {p1}, LR2/S5;->W0()Z

    move-result p1

    if-nez p1, :cond_16

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->v:LR2/r2;

    invoke-virtual {p1}, LR2/r2;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_16

    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    move-result-object p1

    const-string v0, "Remote config removed with active feature rollouts"

    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->v:LR2/r2;

    invoke-virtual {p1, v5}, LR2/r2;->b(Ljava/lang/String;)V

    :cond_16
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object p1

    invoke-virtual {p1}, LR2/S1;->G()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    move-result-object p1

    invoke-virtual {p1}, LR2/S1;->E()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1a

    :cond_17
    invoke-virtual {p0}, LR2/N2;->p()Z

    move-result p1

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    invoke-virtual {v0}, LR2/l2;->B()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, p0, LR2/N2;->g:LR2/g;

    invoke-virtual {v0}, LR2/g;->R()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, LR2/l2;->E(Z)V

    :cond_18
    if-eqz p1, :cond_19

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object p1

    invoke-virtual {p1}, LR2/C3;->n0()V

    :cond_19
    invoke-virtual {p0}, LR2/N2;->K()LR2/l5;

    move-result-object p1

    iget-object p1, p1, LR2/l5;->e:LR2/t5;

    invoke-virtual {p1}, LR2/t5;->a()V

    invoke-virtual {p0}, LR2/N2;->J()LR2/D4;

    move-result-object p1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, v0}, LR2/D4;->Q(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p0}, LR2/N2;->J()LR2/D4;

    move-result-object p1

    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object v0

    iget-object v0, v0, LR2/l2;->y:LR2/n2;

    invoke-virtual {v0}, LR2/n2;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, LR2/D4;->K(Landroid/os/Bundle;)V

    :cond_1a
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result p1

    if-eqz p1, :cond_1b

    iget-object p1, p0, LR2/N2;->g:LR2/g;

    sget-object v0, LR2/K;->M0:LR2/P1;

    invoke-virtual {p1, v0}, LR2/g;->s(LR2/P1;)Z

    move-result p1

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    move-result-object p1

    invoke-virtual {p1}, LR2/S5;->V0()Z

    move-result p1

    if-eqz p1, :cond_1b

    new-instance p1, Ljava/lang/Thread;

    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LR2/M2;

    invoke-direct {v1, v0}, LR2/M2;-><init>(LR2/C3;)V

    invoke-direct {p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_1b
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    move-result-object p1

    iget-object p1, p1, LR2/l2;->o:LR2/o2;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LR2/o2;->a(Z)V

    return-void
.end method

.method public final synthetic l(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 5

    .line 1
    const-string p1, "gbraid"

    .line 2
    .line 3
    const-string p5, "gclid"

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    const/16 v1, 0xc8

    .line 8
    .line 9
    if-eq p2, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0xcc

    .line 12
    .line 13
    if-eq p2, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x130

    .line 16
    .line 17
    if-ne p2, v1, :cond_8

    .line 18
    .line 19
    :cond_0
    if-nez p3, :cond_8

    .line 20
    .line 21
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p2, p2, LR2/l2;->t:LR2/o2;

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    invoke-virtual {p2, p3}, LR2/o2;->a(Z)V

    .line 29
    .line 30
    .line 31
    if-eqz p4, :cond_7

    .line 32
    .line 33
    array-length p2, p4

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_1
    new-instance p2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {p2, p4}, Ljava/lang/String;-><init>([B)V

    .line 41
    .line 42
    .line 43
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    .line 44
    .line 45
    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string p2, "deeplink"

    .line 49
    .line 50
    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p3, p5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-virtual {p3, p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "timestamp"

    .line 63
    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    invoke-virtual {p3, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "Deferred Deep Link is empty."

    .line 85
    .line 86
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catch_0
    move-exception p1

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_2
    new-instance p3, Landroid/os/Bundle;

    .line 94
    .line 95
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    iget-object v3, p0, LR2/N2;->g:LR2/g;

    .line 105
    .line 106
    sget-object v4, LR2/K;->Z0:LR2/P1;

    .line 107
    .line 108
    invoke-virtual {v3, v4}, LR2/g;->s(LR2/P1;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3, p2}, LR2/S5;->K0(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    const-string p3, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    .line 133
    .line 134
    invoke-virtual {p1, p3, p4, v0, p2}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    invoke-virtual {p3, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, p2}, LR2/S5;->K0(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string p3, "Deferred Deep Link validation failed. gclid, deep link"

    .line 161
    .line 162
    invoke-virtual {p1, p3, p4, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_5
    :goto_0
    invoke-virtual {p3, p5, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string p1, "_cis"

    .line 170
    .line 171
    const-string p4, "ddp"

    .line 172
    .line 173
    invoke-virtual {p3, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, LR2/N2;->p:LR2/C3;

    .line 177
    .line 178
    const-string p4, "auto"

    .line 179
    .line 180
    const-string p5, "_cmp"

    .line 181
    .line 182
    invoke-virtual {p1, p4, p5, p3}, LR2/C3;->z0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-nez p3, :cond_6

    .line 194
    .line 195
    invoke-virtual {p1, p2, v1, v2}, LR2/S5;->h0(Ljava/lang/String;D)Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_6

    .line 200
    .line 201
    new-instance p2, Landroid/content/Intent;

    .line 202
    .line 203
    const-string p3, "android.google.analytics.action.DEEPLINK_ACTION"

    .line 204
    .line 205
    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, LR2/m3;->a()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    .line 215
    :cond_6
    return-void

    .line 216
    :goto_1
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    const-string p3, "Failed to parse the Deferred Deep Link response. exception"

    .line 225
    .line 226
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_7
    :goto_2
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    const-string p2, "Deferred Deep Link response empty."

    .line 239
    .line 240
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_8
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    const-string p4, "Network Request for Deferred Deep Link failed. response, exception"

    .line 257
    .line 258
    invoke-virtual {p1, p4, p2, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-void
.end method

.method public final m(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LR2/N2;->A:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget v0, p0, LR2/N2;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LR2/N2;->E:I

    .line 6
    .line 7
    return-void
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->A:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LR2/N2;->A:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/N2;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LR2/N2;->D:Z

    .line 9
    .line 10
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final s()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LR2/N2;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LR2/N2;->y:Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-wide v1, p0, LR2/N2;->z:J

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_5

    .line 31
    .line 32
    iget-object v0, p0, LR2/N2;->n:LE2/e;

    .line 33
    .line 34
    invoke-interface {v0}, LE2/e;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iget-wide v2, p0, LR2/N2;->z:J

    .line 39
    .line 40
    sub-long/2addr v0, v2

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide/16 v2, 0x3e8

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-lez v0, :cond_5

    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, LR2/N2;->n:LE2/e;

    .line 52
    .line 53
    invoke-interface {v0}, LE2/e;->b()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iput-wide v0, p0, LR2/N2;->z:J

    .line 58
    .line 59
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "android.permission.INTERNET"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, LR2/S5;->E0(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x1

    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    .line 78
    .line 79
    invoke-virtual {v0, v3}, LR2/S5;->E0(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iget-object v0, p0, LR2/N2;->a:Landroid/content/Context;

    .line 86
    .line 87
    invoke-static {v0}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LG2/c;->f()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    iget-object v0, p0, LR2/N2;->g:LR2/g;

    .line 98
    .line 99
    invoke-virtual {v0}, LR2/g;->S()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    iget-object v0, p0, LR2/N2;->a:Landroid/content/Context;

    .line 106
    .line 107
    invoke-static {v0}, LR2/S5;->c0(Landroid/content/Context;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    iget-object v0, p0, LR2/N2;->a:Landroid/content/Context;

    .line 114
    .line 115
    invoke-static {v0, v2}, LR2/S5;->d0(Landroid/content/Context;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    :cond_1
    move v0, v1

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    move v0, v2

    .line 124
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, LR2/N2;->y:Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, LR2/S1;->G()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, LR2/S1;->E()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v0, v3, v4}, LR2/S5;->j0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_4

    .line 161
    .line 162
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, LR2/S1;->E()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_3

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    move v1, v2

    .line 178
    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iput-object v0, p0, LR2/N2;->y:Ljava/lang/Boolean;

    .line 183
    .line 184
    :cond_5
    iget-object v0, p0, LR2/N2;->y:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    return v0

    .line 191
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    const-string v1, "AppMeasurement is not initialized"

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LR2/N2;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u()Z
    .locals 12

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/N2;->v()LR2/q4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LR2/N2;->h(LR2/l3;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LR2/S1;->F()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, LR2/l2;->u(Ljava/lang/String;)Landroid/util/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, LR2/N2;->g:LR2/g;

    .line 32
    .line 33
    invoke-virtual {v2}, LR2/g;->P()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v9, 0x0

    .line 38
    if-eqz v2, :cond_b

    .line 39
    .line 40
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_b

    .line 49
    .line 50
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/lang/CharSequence;

    .line 53
    .line 54
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_0
    invoke-virtual {p0}, LR2/N2;->v()LR2/q4;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, LR2/q4;->w()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v9

    .line 86
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_9

    .line 96
    .line 97
    iget-object v3, p0, LR2/N2;->g:LR2/g;

    .line 98
    .line 99
    sget-object v4, LR2/K;->U0:LR2/P1;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, LR2/g;->s(LR2/P1;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_9

    .line 106
    .line 107
    invoke-virtual {p0}, LR2/N2;->H()LR2/C3;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, LR2/m3;->n()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, LR2/G1;->t()LR2/D4;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3}, LR2/D4;->V()LR2/n;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    iget-object v3, v3, LR2/n;->o:Landroid/os/Bundle;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    const/4 v3, 0x0

    .line 128
    :goto_0
    const/4 v4, 0x1

    .line 129
    if-nez v3, :cond_5

    .line 130
    .line 131
    iget v0, p0, LR2/N2;->F:I

    .line 132
    .line 133
    add-int/lit8 v1, v0, 0x1

    .line 134
    .line 135
    iput v1, p0, LR2/N2;->F:I

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    if-ge v0, v1, :cond_3

    .line 140
    .line 141
    move v9, v4

    .line 142
    :cond_3
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v9, :cond_4

    .line 151
    .line 152
    const-string v1, "Retrying."

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    const-string v1, "Skipping."

    .line 156
    .line 157
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v3, "Failed to retrieve DMA consent from the service, "

    .line 160
    .line 161
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, " retryCount"

    .line 168
    .line 169
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget v2, p0, LR2/N2;->F:I

    .line 177
    .line 178
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return v9

    .line 186
    :cond_5
    const/16 v5, 0x64

    .line 187
    .line 188
    invoke-static {v3, v5}, LR2/q3;->d(Landroid/os/Bundle;I)LR2/q3;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    const-string v7, "&gcs="

    .line 193
    .line 194
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6}, LR2/q3;->w()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v5}, LR2/z;->b(Landroid/os/Bundle;I)LR2/z;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    const-string v6, "&dma="

    .line 209
    .line 210
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, LR2/z;->g()Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 218
    .line 219
    if-ne v6, v7, :cond_6

    .line 220
    .line 221
    move v6, v9

    .line 222
    goto :goto_2

    .line 223
    :cond_6
    move v6, v4

    .line 224
    :goto_2
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5}, LR2/z;->h()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-nez v6, :cond_7

    .line 236
    .line 237
    const-string v6, "&dma_cps="

    .line 238
    .line 239
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5}, LR2/z;->h()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    :cond_7
    invoke-static {v3}, LR2/z;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 254
    .line 255
    if-ne v3, v5, :cond_8

    .line 256
    .line 257
    move v4, v9

    .line 258
    :cond_8
    const-string v3, "&npa="

    .line 259
    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v4, "Consent query parameters to Bow"

    .line 275
    .line 276
    invoke-virtual {v3, v4, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_9
    invoke-virtual {p0}, LR2/N2;->L()LR2/S5;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {p0}, LR2/N2;->B()LR2/S1;

    .line 284
    .line 285
    .line 286
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 287
    .line 288
    move-object v5, v1

    .line 289
    check-cast v5, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    iget-object v1, v1, LR2/l2;->u:LR2/q2;

    .line 296
    .line 297
    invoke-virtual {v1}, LR2/q2;->a()J

    .line 298
    .line 299
    .line 300
    move-result-wide v6

    .line 301
    const-wide/16 v10, 0x1

    .line 302
    .line 303
    sub-long/2addr v6, v10

    .line 304
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    const-wide/32 v10, 0x14051

    .line 309
    .line 310
    .line 311
    move-object v1, v3

    .line 312
    move-wide v2, v10

    .line 313
    move-object v4, v0

    .line 314
    invoke-virtual/range {v1 .. v8}, LR2/S5;->J(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/net/URL;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    if-eqz v4, :cond_a

    .line 319
    .line 320
    invoke-virtual {p0}, LR2/N2;->v()LR2/q4;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    new-instance v7, LR2/P2;

    .line 325
    .line 326
    invoke-direct {v7, p0}, LR2/P2;-><init>(LR2/N2;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, LR2/l3;->o()V

    .line 333
    .line 334
    .line 335
    invoke-static {v4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, LR2/m3;->e()LR2/G2;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    new-instance v10, LR2/s4;

    .line 346
    .line 347
    const/4 v5, 0x0

    .line 348
    const/4 v6, 0x0

    .line 349
    move-object v1, v10

    .line 350
    move-object v3, v0

    .line 351
    invoke-direct/range {v1 .. v7}, LR2/s4;-><init>(LR2/q4;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;LR2/p4;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8, v10}, LR2/G2;->z(Ljava/lang/Runnable;)V

    .line 355
    .line 356
    .line 357
    :cond_a
    return v9

    .line 358
    :cond_b
    :goto_3
    invoke-virtual {p0}, LR2/N2;->j()LR2/Y1;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    .line 367
    .line 368
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return v9
.end method

.method public final v()LR2/q4;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->r:LR2/q4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/N2;->h(LR2/l3;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/N2;->r:LR2/q4;

    .line 7
    .line 8
    return-object v0
.end method

.method public final w(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, LR2/N2;->D:Z

    .line 9
    .line 10
    return-void
.end method

.method public final x()I
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/N2;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/N2;->g:LR2/g;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/g;->R()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    iget-object v0, p0, LR2/N2;->C:Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    return v0

    .line 30
    :cond_1
    invoke-virtual {p0}, LR2/N2;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    return v0

    .line 39
    :cond_2
    invoke-virtual {p0}, LR2/N2;->F()LR2/l2;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, LR2/l2;->M()Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    return v1

    .line 57
    :cond_3
    const/4 v0, 0x3

    .line 58
    return v0

    .line 59
    :cond_4
    iget-object v0, p0, LR2/N2;->g:LR2/g;

    .line 60
    .line 61
    const-string v2, "firebase_analytics_collection_enabled"

    .line 62
    .line 63
    invoke-virtual {v0, v2}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    return v1

    .line 76
    :cond_5
    const/4 v0, 0x4

    .line 77
    return v0

    .line 78
    :cond_6
    iget-object v0, p0, LR2/N2;->B:Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v0, :cond_8

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_7

    .line 87
    .line 88
    return v1

    .line 89
    :cond_7
    const/4 v0, 0x5

    .line 90
    return v0

    .line 91
    :cond_8
    iget-object v0, p0, LR2/N2;->A:Ljava/lang/Boolean;

    .line 92
    .line 93
    if-eqz v0, :cond_a

    .line 94
    .line 95
    iget-object v0, p0, LR2/N2;->A:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_9

    .line 102
    .line 103
    return v1

    .line 104
    :cond_9
    const/4 v0, 0x7

    .line 105
    return v0

    .line 106
    :cond_a
    return v1
.end method

.method public final y()LR2/B;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/N2;->q:LR2/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Component not created"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final z()LR2/g;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/N2;->g:LR2/g;

    .line 2
    .line 3
    return-object v0
.end method
