.class public Lma/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Lma/s0;

.field public volatile b:Lma/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lma/o;->a()Lma/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lma/s0;)Lma/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lma/f0;->a:Lma/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lma/f0;->a:Lma/s0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    :try_start_1
    iput-object p1, p0, Lma/f0;->a:Lma/s0;

    .line 13
    .line 14
    sget-object v0, Lma/h;->b:Lma/h$h;

    .line 15
    .line 16
    iput-object v0, p0, Lma/f0;->b:Lma/h;
    :try_end_1
    .catch Lma/b0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    :try_start_2
    iput-object p1, p0, Lma/f0;->a:Lma/s0;

    .line 20
    .line 21
    sget-object p1, Lma/h;->b:Lma/h$h;

    .line 22
    .line 23
    iput-object p1, p0, Lma/f0;->b:Lma/h;

    .line 24
    .line 25
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    :goto_1
    iget-object p1, p0, Lma/f0;->a:Lma/s0;

    .line 27
    .line 28
    return-object p1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b()Lma/h;
    .locals 1

    iget-object v0, p0, Lma/f0;->b:Lma/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lma/f0;->b:Lma/h;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lma/f0;->b:Lma/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lma/f0;->b:Lma/h;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Lma/f0;->a:Lma/s0;

    if-nez v0, :cond_2

    sget-object v0, Lma/h;->b:Lma/h$h;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lma/f0;->a:Lma/s0;

    invoke-interface {v0}, Lma/s0;->c()Lma/h$h;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lma/f0;->b:Lma/h;

    iget-object v0, p0, Lma/f0;->b:Lma/h;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lma/f0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lma/f0;

    iget-object v0, p0, Lma/f0;->a:Lma/s0;

    iget-object v1, p1, Lma/f0;->a:Lma/s0;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lma/f0;->b()Lma/h;

    move-result-object v0

    invoke-virtual {p1}, Lma/f0;->b()Lma/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lma/t0;->b()Lma/w;

    move-result-object v1

    invoke-virtual {p1, v1}, Lma/f0;->a(Lma/s0;)Lma/s0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lma/t0;->b()Lma/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lma/f0;->a(Lma/s0;)Lma/s0;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
