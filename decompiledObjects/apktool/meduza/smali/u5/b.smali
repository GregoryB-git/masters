.class public final Lu5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu5/b$a;
    }
.end annotation


# instance fields
.field public final a:Lu5/a;

.field public final b:J

.field public final c:I

.field public d:Lt5/n;

.field public e:J

.field public f:Ljava/io/File;

.field public g:Ljava/io/OutputStream;

.field public h:J

.field public i:J

.field public j:Lu5/o;


# direct methods
.method public constructor <init>(Lu5/q;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p2, v0

    .line 7
    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    if-gtz v0, :cond_1

    .line 11
    .line 12
    cmp-long v0, p2, v1

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    :goto_1
    if-eqz v0, :cond_4

    .line 21
    .line 22
    cmp-long v0, p2, v1

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const-wide/32 v1, 0x200000

    .line 27
    .line 28
    .line 29
    cmp-long v1, p2, v1

    .line 30
    .line 31
    if-gez v1, :cond_2

    .line 32
    .line 33
    const-string v1, "CacheDataSink"

    .line 34
    .line 35
    const-string v2, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance."

    .line 36
    .line 37
    invoke-static {v1, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iput-object p1, p0, Lu5/b;->a:Lu5/a;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    const-wide p2, 0x7fffffffffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    :cond_3
    iput-wide p2, p0, Lu5/b;->b:J

    .line 50
    .line 51
    const/16 p1, 0x5000

    .line 52
    .line 53
    iput p1, p0, Lu5/b;->c:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "fragmentSize must be positive or C.LENGTH_UNSET."

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
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
.method public final a(Lt5/n;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lt5/n;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v0, p1, Lt5/n;->g:J

    .line 7
    .line 8
    const-wide/16 v2, -0x1

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    iget v3, p1, Lt5/n;->i:I

    .line 18
    .line 19
    and-int/2addr v3, v0

    .line 20
    if-ne v3, v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lu5/b;->d:Lt5/n;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iput-object p1, p0, Lu5/b;->d:Lt5/n;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    iget v3, p1, Lt5/n;->i:I

    .line 35
    .line 36
    and-int/2addr v3, v0

    .line 37
    if-ne v3, v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v2

    .line 41
    :goto_1
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-wide v0, p0, Lu5/b;->b:J

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    const-wide v0, 0x7fffffffffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :goto_2
    iput-wide v0, p0, Lu5/b;->e:J

    .line 52
    .line 53
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    iput-wide v0, p0, Lu5/b;->i:J

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p0, p1}, Lu5/b;->c(Lt5/n;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    move-exception p1

    .line 62
    new-instance v0, Lu5/b$a;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lu5/b$a;-><init>(Ljava/io/IOException;)V

    .line 65
    .line 66
    .line 67
    throw v0
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

.method public final b()V
    .locals 4

    iget-object v0, p0, Lu5/b;->g:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lu5/b;->g:Ljava/io/OutputStream;

    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    iput-object v1, p0, Lu5/b;->g:Ljava/io/OutputStream;

    iget-object v0, p0, Lu5/b;->f:Ljava/io/File;

    iput-object v1, p0, Lu5/b;->f:Ljava/io/File;

    iget-object v1, p0, Lu5/b;->a:Lu5/a;

    iget-wide v2, p0, Lu5/b;->h:J

    invoke-interface {v1, v0, v2, v3}, Lu5/a;->h(Ljava/io/File;J)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lu5/b;->g:Ljava/io/OutputStream;

    invoke-static {v2}, Lv5/e0;->g(Ljava/io/Closeable;)V

    iput-object v1, p0, Lu5/b;->g:Ljava/io/OutputStream;

    iget-object v2, p0, Lu5/b;->f:Ljava/io/File;

    iput-object v1, p0, Lu5/b;->f:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    throw v0
.end method

.method public final c(Lt5/n;)V
    .locals 10

    iget-wide v0, p1, Lt5/n;->g:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lu5/b;->i:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lu5/b;->e:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :goto_0
    move-wide v7, v2

    iget-object v4, p0, Lu5/b;->a:Lu5/a;

    iget-object v9, p1, Lt5/n;->h:Ljava/lang/String;

    sget v0, Lv5/e0;->a:I

    iget-wide v0, p1, Lt5/n;->f:J

    iget-wide v2, p0, Lu5/b;->i:J

    add-long v5, v0, v2

    invoke-interface/range {v4 .. v9}, Lu5/a;->e(JJLjava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lu5/b;->f:Ljava/io/File;

    new-instance p1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lu5/b;->f:Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget v0, p0, Lu5/b;->c:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lu5/b;->j:Lu5/o;

    if-nez v0, :cond_1

    new-instance v0, Lu5/o;

    iget v1, p0, Lu5/b;->c:I

    invoke-direct {v0, p1, v1}, Lu5/o;-><init>(Ljava/io/FileOutputStream;I)V

    iput-object v0, p0, Lu5/b;->j:Lu5/o;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, Lu5/o;->f(Ljava/io/OutputStream;)V

    :goto_1
    iget-object p1, p0, Lu5/b;->j:Lu5/o;

    :cond_2
    iput-object p1, p0, Lu5/b;->g:Ljava/io/OutputStream;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu5/b;->h:J

    return-void
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lu5/b;->d:Lt5/n;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lu5/b;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lu5/b$a;

    invoke-direct {v1, v0}, Lu5/b$a;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final write([BII)V
    .locals 8

    iget-object v0, p0, Lu5/b;->d:Lt5/n;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_2

    :try_start_0
    iget-wide v2, p0, Lu5/b;->h:J

    iget-wide v4, p0, Lu5/b;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lu5/b;->b()V

    invoke-virtual {p0, v0}, Lu5/b;->c(Lt5/n;)V

    :cond_1
    sub-int v2, p3, v1

    int-to-long v2, v2

    iget-wide v4, p0, Lu5/b;->e:J

    iget-wide v6, p0, Lu5/b;->h:J

    sub-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    iget-object v3, p0, Lu5/b;->g:Ljava/io/OutputStream;

    sget v4, Lv5/e0;->a:I

    add-int v4, p2, v1

    invoke-virtual {v3, p1, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v1, v2

    iget-wide v3, p0, Lu5/b;->h:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lu5/b;->h:J

    iget-wide v2, p0, Lu5/b;->i:J

    add-long/2addr v2, v5

    iput-wide v2, p0, Lu5/b;->i:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lu5/b$a;

    invoke-direct {p2, p1}, Lu5/b$a;-><init>(Ljava/io/IOException;)V

    throw p2

    :cond_2
    return-void
.end method
