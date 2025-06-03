.class public final Lx0/U;
.super Lx0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/U$c;,
        Lx0/U$d;,
        Lx0/U$b;
    }
.end annotation


# static fields
.field public static final j:Ld0/q;

.field public static final k:Ld0/u;

.field public static final l:[B


# instance fields
.field public final h:J

.field public i:Ld0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ld0/q$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {v0, v1}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v2, 0xac44

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Ld0/q$b;->i0(I)Ld0/q$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lx0/U;->j:Ld0/q;

    .line 33
    .line 34
    new-instance v2, Ld0/u$c;

    .line 35
    .line 36
    invoke-direct {v2}, Ld0/u$c;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "SilenceMediaSource"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ld0/u$c;->b(Ljava/lang/String;)Ld0/u$c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ld0/u$c;->e(Landroid/net/Uri;)Ld0/u$c;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v0, v0, Ld0/q;->n:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ld0/u$c;->c(Ljava/lang/String;)Ld0/u$c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ld0/u$c;->a()Ld0/u;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lx0/U;->k:Ld0/u;

    .line 62
    .line 63
    invoke-static {v1, v1}, Lg0/M;->g0(II)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    mul-int/lit16 v0, v0, 0x400

    .line 68
    .line 69
    new-array v0, v0, [B

    .line 70
    .line 71
    sput-object v0, Lx0/U;->l:[B

    .line 72
    .line 73
    return-void
.end method

.method public constructor <init>(JLd0/u;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx0/a;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    iput-wide p1, p0, Lx0/U;->h:J

    iput-object p3, p0, Lx0/U;->i:Ld0/u;

    return-void
.end method

.method public synthetic constructor <init>(JLd0/u;Lx0/U$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lx0/U;-><init>(JLd0/u;)V

    return-void
.end method

.method public static synthetic C()Ld0/u;
    .locals 1

    .line 1
    sget-object v0, Lx0/U;->k:Ld0/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic D()Ld0/q;
    .locals 1

    .line 1
    sget-object v0, Lx0/U;->j:Ld0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic E(J)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx0/U;->H(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic F(J)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx0/U;->I(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic G()[B
    .locals 1

    .line 1
    sget-object v0, Lx0/U;->l:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static H(J)J
    .locals 2

    .line 1
    const-wide/32 v0, 0xac44

    .line 2
    .line 3
    .line 4
    mul-long/2addr p0, v0

    .line 5
    const-wide/32 v0, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long/2addr p0, v0

    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-static {v0, v0}, Lg0/M;->g0(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-long v0, v0

    .line 15
    mul-long/2addr v0, p0

    .line 16
    return-wide v0
.end method

.method public static I(J)J
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0, v0}, Lg0/M;->g0(II)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    int-to-long v0, v0

    .line 7
    div-long/2addr p0, v0

    .line 8
    const-wide/32 v0, 0xf4240

    .line 9
    .line 10
    .line 11
    mul-long/2addr p0, v0

    .line 12
    const-wide/32 v0, 0xac44

    .line 13
    .line 14
    .line 15
    div-long/2addr p0, v0

    .line 16
    return-wide p0
.end method


# virtual methods
.method public B()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized a()Ld0/u;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx0/U;->i:Ld0/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
.end method

.method public e(Lx0/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lx0/x$b;LB0/b;J)Lx0/v;
    .locals 0

    .line 1
    new-instance p1, Lx0/U$c;

    .line 2
    .line 3
    iget-wide p2, p0, Lx0/U;->h:J

    .line 4
    .line 5
    invoke-direct {p1, p2, p3}, Lx0/U$c;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized l(Ld0/u;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lx0/U;->i:Ld0/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

.method public z(Li0/y;)V
    .locals 8

    .line 1
    new-instance p1, Lx0/V;

    .line 2
    .line 3
    iget-wide v1, p0, Lx0/U;->h:J

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-virtual {p0}, Lx0/U;->a()Ld0/u;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v0, p1

    .line 14
    invoke-direct/range {v0 .. v7}, Lx0/V;-><init>(JZZZLjava/lang/Object;Ld0/u;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lx0/a;->A(Ld0/I;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
