.class public final Lt5/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k;


# instance fields
.field public final a:Lt5/k;

.field public final b:Lt5/j;

.field public c:Z

.field public d:J


# direct methods
.method public constructor <init>(Lt5/k;Lu5/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lt5/k0;->a:Lt5/k;

    .line 8
    .line 9
    iput-object p2, p0, Lt5/k0;->b:Lt5/j;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 8

    iget-object v0, p0, Lt5/k0;->a:Lt5/k;

    invoke-interface {v0, p1}, Lt5/k;->a(Lt5/n;)J

    move-result-wide v0

    iput-wide v0, p0, Lt5/k0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v4, p1, Lt5/n;->g:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    cmp-long v4, v0, v6

    if-eqz v4, :cond_1

    invoke-virtual {p1, v2, v3, v0, v1}, Lt5/n;->b(JJ)Lt5/n;

    move-result-object p1

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lt5/k0;->c:Z

    iget-object v0, p0, Lt5/k0;->b:Lt5/j;

    invoke-interface {v0, p1}, Lt5/j;->a(Lt5/n;)V

    iget-wide v0, p0, Lt5/k0;->d:J

    return-wide v0
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lt5/k0;->a:Lt5/k;

    invoke-interface {v1}, Lt5/k;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lt5/k0;->c:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lt5/k0;->c:Z

    iget-object v0, p0, Lt5/k0;->b:Lt5/j;

    invoke-interface {v0}, Lt5/j;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lt5/k0;->c:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lt5/k0;->c:Z

    iget-object v0, p0, Lt5/k0;->b:Lt5/j;

    invoke-interface {v0}, Lt5/j;->close()V

    :cond_1
    throw v1
.end method

.method public final f(Lt5/l0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt5/k0;->a:Lt5/k;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lt5/k;->f(Lt5/l0;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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

.method public final h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt5/k0;->a:Lt5/k;

    invoke-interface {v0}, Lt5/k;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/k0;->a:Lt5/k;

    invoke-interface {v0}, Lt5/k;->l()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final read([BII)I
    .locals 4

    iget-wide v0, p0, Lt5/k0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lt5/k0;->a:Lt5/k;

    invoke-interface {v0, p1, p2, p3}, Lt5/h;->read([BII)I

    move-result p3

    if-lez p3, :cond_1

    iget-object v0, p0, Lt5/k0;->b:Lt5/j;

    invoke-interface {v0, p1, p2, p3}, Lt5/j;->write([BII)V

    iget-wide p1, p0, Lt5/k0;->d:J

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_1

    int-to-long v0, p3

    sub-long/2addr p1, v0

    iput-wide p1, p0, Lt5/k0;->d:J

    :cond_1
    return p3
.end method
