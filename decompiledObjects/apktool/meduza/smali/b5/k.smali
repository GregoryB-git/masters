.class public abstract Lb5/k;
.super Lb5/e;
.source "SourceFile"


# instance fields
.field public j:[B

.field public volatile k:Z


# direct methods
.method public constructor <init>(Lt5/k;Lt5/n;Lv3/i0;ILjava/lang/Object;[B)V
    .locals 11

    const/4 v3, 0x3

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lb5/e;-><init>(Lt5/k;Lt5/n;ILv3/i0;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_0

    sget-object v0, Lv5/e0;->f:[B

    move-object v1, p0

    goto :goto_0

    :cond_0
    move-object v1, p0

    move-object/from16 v0, p6

    :goto_0
    iput-object v0, v1, Lb5/k;->j:[B

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/e;->b:Lt5/n;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt5/j0;->a(Lt5/n;)J

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :cond_0
    :goto_0
    const/4 v2, -0x1

    .line 11
    if-eq v0, v2, :cond_2

    .line 12
    .line 13
    iget-boolean v0, p0, Lb5/k;->k:Z

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lb5/k;->j:[B

    .line 18
    .line 19
    array-length v3, v0

    .line 20
    add-int/lit16 v4, v1, 0x4000

    .line 21
    .line 22
    const/16 v5, 0x4000

    .line 23
    .line 24
    if-ge v3, v4, :cond_1

    .line 25
    .line 26
    array-length v3, v0

    .line 27
    add-int/2addr v3, v5

    .line 28
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lb5/k;->j:[B

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 35
    .line 36
    iget-object v3, p0, Lb5/k;->j:[B

    .line 37
    .line 38
    invoke-virtual {v0, v3, v1, v5}, Lt5/j0;->read([BII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eq v0, v2, :cond_0

    .line 43
    .line 44
    add-int/2addr v1, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-boolean v0, p0, Lb5/k;->k:Z

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p0, Lb5/k;->j:[B

    .line 51
    .line 52
    move-object v2, p0

    .line 53
    check-cast v2, Le5/g$a;

    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, v2, Le5/g$a;->l:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :cond_3
    iget-object v0, p0, Lb5/e;->i:Lt5/j0;

    .line 62
    .line 63
    invoke-static {v0}, Lb/z;->d(Lt5/k;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    iget-object v1, p0, Lb5/e;->i:Lt5/j0;

    .line 69
    .line 70
    invoke-static {v1}, Lb/z;->d(Lt5/k;)V

    .line 71
    .line 72
    .line 73
    throw v0
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
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb5/k;->k:Z

    return-void
.end method
