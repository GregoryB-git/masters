.class public abstract Lcom/google/android/gms/internal/measurement/S2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/lang/Object;

.field public static volatile h:Lcom/google/android/gms/internal/measurement/Z2;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public static j:Lcom/google/android/gms/internal/measurement/d3;

.field public static final k:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/a3;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public volatile d:I

.field public volatile e:Ljava/lang/Object;

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/S2;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/S2;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/google/android/gms/internal/measurement/d3;

    sget-object v1, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/T2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;-><init>(Lcom/google/android/gms/internal/measurement/h3;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/S2;->j:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/S2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/S2;->d:I

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/a3;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass one of SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/S2;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/S2;->c:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/S2;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Object;ZLcom/google/android/gms/internal/measurement/c3;)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/S2;-><init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)LW2/l;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/O2$a;->a(Landroid/content/Context;)LW2/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/google/android/gms/internal/measurement/S2;
    .locals 1

    .line 1
    new-instance p3, Lcom/google/android/gms/internal/measurement/V2;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/V2;-><init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    return-object p3
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Double;Z)Lcom/google/android/gms/internal/measurement/S2;
    .locals 1

    .line 1
    new-instance p3, Lcom/google/android/gms/internal/measurement/Y2;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/Y2;-><init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Double;Z)V

    return-object p3
.end method

.method public static synthetic d(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Long;Z)Lcom/google/android/gms/internal/measurement/S2;
    .locals 1

    .line 1
    new-instance p3, Lcom/google/android/gms/internal/measurement/W2;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/W2;-><init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/Long;Z)V

    return-object p3
.end method

.method public static synthetic e(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;
    .locals 1

    .line 1
    new-instance p3, Lcom/google/android/gms/internal/measurement/X2;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/X2;-><init>(Lcom/google/android/gms/internal/measurement/a3;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object p3
.end method

.method public static l(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/S2;->h:Lcom/google/android/gms/internal/measurement/Z2;

    if-nez v0, :cond_5

    if-nez p0, :cond_0

    goto :goto_5

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/S2;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/S2;->h:Lcom/google/android/gms/internal/measurement/Z2;

    if-nez v1, :cond_4

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/S2;->h:Lcom/google/android/gms/internal/measurement/Z2;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v2

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_3

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/B2;->d()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/b3;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/J2;->b()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/U2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/U2;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, LW2/t;->a(LW2/s;)LW2/s;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/x2;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/measurement/x2;-><init>(Landroid/content/Context;LW2/s;)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/S2;->h:Lcom/google/android/gms/internal/measurement/Z2;

    sget-object p0, Lcom/google/android/gms/internal/measurement/S2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_3
    monitor-exit v0

    goto :goto_3

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_4
    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_5
    :goto_5
    return-void
.end method

.method public static m()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/S2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public static synthetic n()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/S2;->f:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/S2;->j:Lcom/google/android/gms/internal/measurement/d3;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/S2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->a(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."

    invoke-static {v0, v1}, LW2/m;->p(ZLjava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/S2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/S2;->d:I

    if-ge v1, v0, :cond_a

    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/measurement/S2;->d:I

    if-ge v1, v0, :cond_9

    sget-object v1, Lcom/google/android/gms/internal/measurement/S2;->h:Lcom/google/android/gms/internal/measurement/Z2;

    invoke-static {}, LW2/l;->a()LW2/l;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Z2;->b()LW2/s;

    move-result-object v2

    invoke-interface {v2}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW2/l;

    invoke-virtual {v2}, LW2/l;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, LW2/l;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/K2;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/a3;->a:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/a3;->d:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/S2;->b:Ljava/lang/String;

    invoke-interface {v3, v5, v6, v4, v7}, Lcom/google/android/gms/internal/measurement/K2;->a(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    const-string v5, "Must call PhenotypeFlagInitializer.maybeInit() first"

    invoke-static {v4, v5}, LW2/m;->p(ZLjava/lang/Object;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-boolean v4, v4, Lcom/google/android/gms/internal/measurement/a3;->f:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/S2;->g(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/S2;->j(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/S2;->j(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/S2;->g(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/S2;->c:Ljava/lang/Object;

    :goto_2
    invoke-virtual {v2}, LW2/l;->c()Z

    move-result v1

    if-eqz v1, :cond_8

    if-nez v3, :cond_7

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/S2;->c:Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :cond_8
    :goto_3
    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/S2;->e:Ljava/lang/Object;

    iput v0, p0, Lcom/google/android/gms/internal/measurement/S2;->d:I

    :cond_9
    monitor-exit p0

    goto :goto_5

    :goto_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/a3;->e:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->i:LW2/g;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, LW2/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/J2;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/J2;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/a3;->e:Z

    if-eqz v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/S2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/measurement/E2;->i(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2
.end method

.method public abstract h(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/S2;->b:Ljava/lang/String;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lcom/google/android/gms/internal/measurement/Z2;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/Q2;->b(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/measurement/a3;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/gms/internal/measurement/P2;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/P2;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/internal/measurement/R2;->o:Lcom/google/android/gms/internal/measurement/R2;

    invoke-static {v0, p1, v2}, Lcom/google/android/gms/internal/measurement/B2;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/B2;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->b:Landroid/net/Uri;

    sget-object v2, Lcom/google/android/gms/internal/measurement/R2;->o:Lcom/google/android/gms/internal/measurement/R2;

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/B2;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/B2;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Z2;->a()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->a:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/measurement/R2;->o:Lcom/google/android/gms/internal/measurement/R2;

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/b3;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/b3;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/S2;->k()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/measurement/E2;->i(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/S2;->a:Lcom/google/android/gms/internal/measurement/a3;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a3;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/S2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
