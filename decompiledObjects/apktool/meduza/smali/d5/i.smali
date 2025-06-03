.class public final Ld5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public d:I


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p5, :cond_0

    const-string p5, ""

    :cond_0
    iput-object p5, p0, Ld5/i;->c:Ljava/lang/String;

    iput-wide p1, p0, Ld5/i;->a:J

    iput-wide p3, p0, Ld5/i;->b:J

    return-void
.end method


# virtual methods
.method public final a(Ld5/i;Ljava/lang/String;)Ld5/i;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Ld5/i;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3}, Lv5/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    iget-object v4, v1, Ld5/i;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v4}, Lv5/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-wide v4, v0, Ld5/i;->b:J

    .line 30
    .line 31
    const-wide/16 v6, -0x1

    .line 32
    .line 33
    cmp-long v2, v4, v6

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v10, v0, Ld5/i;->a:J

    .line 38
    .line 39
    add-long v12, v10, v4

    .line 40
    .line 41
    iget-wide v14, v1, Ld5/i;->a:J

    .line 42
    .line 43
    cmp-long v8, v12, v14

    .line 44
    .line 45
    if-nez v8, :cond_2

    .line 46
    .line 47
    new-instance v2, Ld5/i;

    .line 48
    .line 49
    iget-wide v12, v1, Ld5/i;->b:J

    .line 50
    .line 51
    cmp-long v1, v12, v6

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    move-wide v7, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    add-long/2addr v4, v12

    .line 58
    move-wide v7, v4

    .line 59
    :goto_0
    move-object v4, v2

    .line 60
    move-wide v5, v10

    .line 61
    invoke-direct/range {v4 .. v9}, Ld5/i;-><init>(JJLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_2
    iget-wide v10, v1, Ld5/i;->b:J

    .line 66
    .line 67
    cmp-long v8, v10, v6

    .line 68
    .line 69
    if-eqz v8, :cond_4

    .line 70
    .line 71
    iget-wide v12, v1, Ld5/i;->a:J

    .line 72
    .line 73
    add-long v14, v12, v10

    .line 74
    .line 75
    iget-wide v6, v0, Ld5/i;->a:J

    .line 76
    .line 77
    cmp-long v1, v14, v6

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    new-instance v1, Ld5/i;

    .line 82
    .line 83
    if-nez v2, :cond_3

    .line 84
    .line 85
    const-wide/16 v7, -0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    add-long/2addr v10, v4

    .line 89
    move-wide v7, v10

    .line 90
    :goto_1
    move-object v4, v1

    .line 91
    move-wide v5, v12

    .line 92
    invoke-direct/range {v4 .. v9}, Ld5/i;-><init>(JJLjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    :goto_2
    return-object v3
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ld5/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ld5/i;

    iget-wide v2, p0, Ld5/i;->a:J

    iget-wide v4, p1, Ld5/i;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ld5/i;->b:J

    iget-wide v4, p1, Ld5/i;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Ld5/i;->c:Ljava/lang/String;

    iget-object p1, p1, Ld5/i;->c:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Ld5/i;->d:I

    if-nez v0, :cond_0

    const/16 v0, 0x20f

    iget-wide v1, p0, Ld5/i;->a:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld5/i;->b:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ld5/i;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ld5/i;->d:I

    :cond_0
    iget v0, p0, Ld5/i;->d:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "RangedUri(referenceUri="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ld5/i;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", start="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-wide v1, p0, Ld5/i;->a:J

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", length="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, Ld5/i;->b:J

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ")"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
.end method
