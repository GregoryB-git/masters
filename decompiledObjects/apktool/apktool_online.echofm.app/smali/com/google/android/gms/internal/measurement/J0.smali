.class public Lcom/google/android/gms/internal/measurement/J0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/J0$a;,
        Lcom/google/android/gms/internal/measurement/J0$b;,
        Lcom/google/android/gms/internal/measurement/J0$c;
    }
.end annotation


# static fields
.field public static volatile j:Lcom/google/android/gms/internal/measurement/J0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LE2/e;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:LQ2/a;

.field public final e:Ljava/util/List;

.field public f:I

.field public g:Z

.field public h:Ljava/lang/String;

.field public volatile i:Lcom/google/android/gms/internal/measurement/x0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    invoke-virtual {p0, p3, p4}, Lcom/google/android/gms/internal/measurement/J0;->J(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    goto :goto_2

    :cond_1
    :goto_1
    const-string p2, "FA"

    goto :goto_0

    :goto_2
    invoke-static {}, LE2/h;->d()LE2/e;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->b:LE2/e;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/l0;->a()Lcom/google/android/gms/internal/measurement/m0;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/measurement/U0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/U0;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    sget v1, Lcom/google/android/gms/internal/measurement/u0;->a:I

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/measurement/m0;->a(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, LQ2/a;

    invoke-direct {p2, p0}, LQ2/a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->d:LQ2/a;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->e:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/J0;->E(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/J0;->S()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->h:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/J0;->g:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    const-string p2, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    :goto_3
    invoke-virtual {p0, p3, p4}, Lcom/google/android/gms/internal/measurement/J0;->J(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_7

    const-string p2, "fa"

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->h:Ljava/lang/String;

    if-eqz p3, :cond_4

    if-eqz p4, :cond_4

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    const-string v0, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics"

    invoke-static {p2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_4
    const/4 p2, 0x0

    if-nez p3, :cond_5

    move v1, v0

    goto :goto_4

    :cond_5
    move v1, p2

    :goto_4
    if-nez p4, :cond_6

    goto :goto_5

    :cond_6
    move v0, p2

    :goto_5
    xor-int p2, v1, v0

    if-eqz p2, :cond_8

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    const-string v0, "Specified origin or custom app id is null. Both parameters will be ignored."

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_7
    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/J0;->h:Ljava/lang/String;

    :cond_8
    :goto_6
    new-instance p2, Lcom/google/android/gms/internal/measurement/M0;

    move-object v1, p2

    move-object v2, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/M0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    const-string p2, "Unable to register lifecycle notifications. Application null."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_9
    new-instance p2, Lcom/google/android/gms/internal/measurement/J0$c;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/J0$c;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static bridge synthetic A(Lcom/google/android/gms/internal/measurement/J0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static E(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, LR2/H2;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "google_app_id"

    new-instance v3, LR2/H2;

    invoke-direct {v3, p0, v1}, LR2/H2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, LR2/H2;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    return v0
.end method

.method public static bridge synthetic I(Lcom/google/android/gms/internal/measurement/J0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/measurement/J0;->g:Z

    return p0
.end method

.method public static bridge synthetic d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/J0;->i:Lcom/google/android/gms/internal/measurement/x0;

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/J0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p0, v0, v0, v0, v0}, Lcom/google/android/gms/internal/measurement/J0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/J0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/J0;
    .locals 8

    .line 1
    invoke-static {p0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/J0;->j:Lcom/google/android/gms/internal/measurement/J0;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/measurement/J0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/J0;->j:Lcom/google/android/gms/internal/measurement/J0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/measurement/J0;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/J0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/J0;->j:Lcom/google/android/gms/internal/measurement/J0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/J0;->j:Lcom/google/android/gms/internal/measurement/J0;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/x0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->i:Lcom/google/android/gms/internal/measurement/x0;

    return-void
.end method

.method public static bridge synthetic p(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public static bridge synthetic q(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/Exception;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/J0;->s(Ljava/lang/Exception;ZZ)V

    return-void
.end method

.method public static synthetic y(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/J0;->J(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final B(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/X0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/X0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/J0;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/J0;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final F()Ljava/lang/Long;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/h1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/h1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->Z0(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final G(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/T0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/T0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final H(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/W0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/W0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final J(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/J0;->S()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final K(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/l1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/l1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/Q0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/Q0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final M()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/i1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/i1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->a1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final N()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/Y0;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/Y0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->a1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final O()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/e1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->a1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/a1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/a1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->a1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/Z0;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/Z0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->a1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final R()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/S0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/S0;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final S()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method

.method public final a(Ljava/lang/String;)I
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/g1;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/g1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->o(J)Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Ljava/lang/Integer;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v0;->v(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/16 p1, 0x19

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final b()J
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/b1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/b1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v0;->Z0(J)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/J0;->b:LE2/e;

    invoke-interface {v3}, LE2/e;->a()J

    move-result-wide v3

    xor-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    iget v2, p0, Lcom/google/android/gms/internal/measurement/J0;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/measurement/J0;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Landroid/content/Context;Z)Lcom/google/android/gms/internal/measurement/x0;
    .locals 1

    .line 1
    :try_start_0
    sget-object p2, Lcom/google/android/gms/dynamite/DynamiteModule;->e:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v0, "com.google.android.gms.measurement.dynamite"

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    const-string p2, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/w0;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/J0;->s(Ljava/lang/Exception;ZZ)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/N0;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/N0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/v0;->o(J)Landroid/os/Bundle;

    move-result-object p1

    const-class p2, Ljava/util/List;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/v0;->v(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 8

    .line 1
    new-instance v6, Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/measurement/v0;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/measurement/c1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/c1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/v0;)V

    invoke-virtual {p0, v7}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v6, p1, p2}, Lcom/google/android/gms/internal/measurement/v0;->o(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    :cond_2
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final i(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/measurement/f1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x5

    move-object v0, p1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/f1;-><init>(Lcom/google/android/gms/internal/measurement/J0;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final j(J)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/V0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/V0;-><init>(Lcom/google/android/gms/internal/measurement/J0;J)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final k(LR2/u3;)V
    .locals 4

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0;->e:Ljava/util/List;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/J0;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/J0;->e:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/util/Pair;

    .line 23
    .line 24
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "OnEventListener already registered."

    .line 35
    .line 36
    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/measurement/J0$b;

    .line 47
    .line 48
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/measurement/J0$b;-><init>(LR2/u3;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/J0;->e:Ljava/util/List;

    .line 52
    .line 53
    new-instance v3, Landroid/util/Pair;

    .line 54
    .line 55
    invoke-direct {v3, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->i:Lcom/google/android/gms/internal/measurement/x0;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->i:Lcom/google/android/gms/internal/measurement/x0;

    .line 67
    .line 68
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/measurement/x0;->registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/E0;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    .line 73
    .line 74
    const-string v0, "Failed to register event listener on calling thread. Trying again on the dynamite thread."

    .line 75
    .line 76
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/k1;

    .line 80
    .line 81
    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/measurement/k1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Lcom/google/android/gms/internal/measurement/J0$b;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    throw p1
.end method

.method public final l(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/P0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/P0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/L0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/L0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/measurement/J0$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/R0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/R0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final s(Ljava/lang/Exception;ZZ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/J0;->g:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/J0;->g:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    const-string p3, "Data collection startup failed. No data will be collected."

    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_0
    const-string p2, "Error with data collection. Data lost."

    if-eqz p3, :cond_1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x5

    move-object v0, p0

    move-object v2, p2

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/J0;->i(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/J0;->a:Ljava/lang/String;

    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final t(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/J0;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/O0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/O0;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/google/android/gms/internal/measurement/m1;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/m1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V

    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/gms/internal/measurement/n1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final x(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/j1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/j1;-><init>(Lcom/google/android/gms/internal/measurement/J0;Z)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/J0;->n(Lcom/google/android/gms/internal/measurement/J0$a;)V

    return-void
.end method

.method public final z()LQ2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0;->d:LQ2/a;

    .line 2
    .line 3
    return-object v0
.end method
