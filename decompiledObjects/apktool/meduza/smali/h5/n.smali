.class public final Lh5/n;
.super Lv3/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:Z

.field public B:I

.field public C:Lv3/i0;

.field public D:Lh5/h;

.field public E:Lh5/k;

.field public F:Lh5/l;

.field public G:Lh5/l;

.field public H:I

.field public I:J

.field public J:J

.field public K:J

.field public final u:Landroid/os/Handler;

.field public final v:Lh5/m;

.field public final w:Lh5/j;

.field public final x:Ll3/l;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lv3/d0$b;Landroid/os/Looper;)V
    .locals 2

    .line 1
    sget-object v0, Lh5/j;->a:Lh5/j$a;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {p0, v1}, Lv3/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh5/n;->v:Lh5/m;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p1, Lv5/e0;->a:I

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p1, p0, Lh5/n;->u:Landroid/os/Handler;

    .line 21
    .line 22
    iput-object v0, p0, Lh5/n;->w:Lh5/j;

    .line 23
    .line 24
    new-instance p1, Ll3/l;

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-direct {p1, p2}, Ll3/l;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lh5/n;->x:Ll3/l;

    .line 31
    .line 32
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide p1, p0, Lh5/n;->I:J

    .line 38
    .line 39
    iput-wide p1, p0, Lh5/n;->J:J

    .line 40
    .line 41
    iput-wide p1, p0, Lh5/n;->K:J

    .line 42
    .line 43
    return-void
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
.method public final B()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lh5/n;->C:Lv3/i0;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lh5/n;->I:J

    .line 10
    .line 11
    invoke-virtual {p0}, Lh5/n;->J()V

    .line 12
    .line 13
    .line 14
    iput-wide v1, p0, Lh5/n;->J:J

    .line 15
    .line 16
    iput-wide v1, p0, Lh5/n;->K:J

    .line 17
    .line 18
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lh5/n;->D:Lh5/h;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lz3/d;->release()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lh5/n;->D:Lh5/h;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lh5/n;->B:I

    .line 33
    .line 34
    return-void
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
.end method

.method public final D(JZ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh5/n;->K:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lh5/n;->J()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lh5/n;->y:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lh5/n;->z:Z

    .line 10
    .line 11
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p2, p0, Lh5/n;->I:J

    .line 17
    .line 18
    iget p2, p0, Lh5/n;->B:I

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lh5/n;->D:Lh5/h;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Lz3/d;->release()V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    iput-object p2, p0, Lh5/n;->D:Lh5/h;

    .line 35
    .line 36
    iput p1, p0, Lh5/n;->B:I

    .line 37
    .line 38
    invoke-virtual {p0}, Lh5/n;->N()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lh5/n;->D:Lh5/h;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Lz3/d;->flush()V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
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

.method public final H([Lv3/i0;JJ)V
    .locals 0

    iput-wide p4, p0, Lh5/n;->J:J

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Lh5/n;->C:Lv3/i0;

    iget-object p1, p0, Lh5/n;->D:Lh5/h;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lh5/n;->B:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh5/n;->N()V

    :goto_0
    return-void
.end method

.method public final J()V
    .locals 4

    .line 1
    new-instance v0, Lh5/c;

    .line 2
    .line 3
    sget-object v1, Lo7/l0;->e:Lo7/l0;

    .line 4
    .line 5
    iget-wide v2, p0, Lh5/n;->K:J

    .line 6
    .line 7
    invoke-virtual {p0, v2, v3}, Lh5/n;->L(J)J

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lh5/c;-><init>(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lh5/n;->u:Landroid/os/Handler;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Lh5/n;->v:Lh5/m;

    .line 27
    .line 28
    iget-object v2, v0, Lh5/c;->a:Lo7/t;

    .line 29
    .line 30
    invoke-interface {v1, v2}, Lh5/m;->r(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lh5/n;->v:Lh5/m;

    .line 34
    .line 35
    invoke-interface {v1, v0}, Lh5/m;->j(Lh5/c;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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
.end method

.method public final K()J
    .locals 4

    .line 1
    iget v0, p0, Lh5/n;->H:I

    .line 2
    .line 3
    const-wide v1, 0x7fffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, -0x1

    .line 9
    if-ne v0, v3, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    iget-object v0, p0, Lh5/n;->F:Lh5/l;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lh5/n;->H:I

    .line 18
    .line 19
    iget-object v3, p0, Lh5/n;->F:Lh5/l;

    .line 20
    .line 21
    invoke-virtual {v3}, Lh5/l;->i()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-lt v0, v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lh5/n;->F:Lh5/l;

    .line 29
    .line 30
    iget v1, p0, Lh5/n;->H:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lh5/l;->g(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    :goto_0
    return-wide v1
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
.end method

.method public final L(J)J
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Lx6/b;->H(Z)V

    iget-wide v5, p0, Lh5/n;->J:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lx6/b;->H(Z)V

    iget-wide v0, p0, Lh5/n;->J:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final M(Lh5/i;)V
    .locals 2

    .line 1
    const-string v0, "Subtitle decoding failed. streamFormat="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lh5/n;->C:Lv3/i0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "TextRenderer"

    .line 17
    .line 18
    invoke-static {v1, v0, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lh5/n;->J()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lh5/n;->D:Lh5/h;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lz3/d;->release()V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lh5/n;->D:Lh5/h;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput p1, p0, Lh5/n;->B:I

    .line 40
    .line 41
    invoke-virtual {p0}, Lh5/n;->N()V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final N()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh5/n;->A:Z

    .line 3
    .line 4
    iget-object v0, p0, Lh5/n;->w:Lh5/j;

    .line 5
    .line 6
    iget-object v1, p0, Lh5/n;->C:Lv3/i0;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast v0, Lh5/j$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Lv3/i0;->t:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_c

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sparse-switch v3, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_0
    const-string v3, "application/ttml+xml"

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    const/16 v2, 0xb

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :sswitch_1
    const-string v3, "application/x-subrip"

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_1
    const/16 v2, 0xa

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :sswitch_2
    const-string v3, "application/cea-708"

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_2
    const/16 v2, 0x9

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :sswitch_3
    const-string v3, "application/cea-608"

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_3

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_3
    const/16 v2, 0x8

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :sswitch_4
    const-string v3, "text/x-exoplayer-cues"

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    const/4 v2, 0x7

    .line 99
    goto :goto_0

    .line 100
    :sswitch_5
    const-string v3, "application/x-mp4-cea-608"

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    const/4 v2, 0x6

    .line 110
    goto :goto_0

    .line 111
    :sswitch_6
    const-string v3, "text/x-ssa"

    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_6

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    const/4 v2, 0x5

    .line 121
    goto :goto_0

    .line 122
    :sswitch_7
    const-string v3, "application/x-quicktime-tx3g"

    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_7

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    const/4 v2, 0x4

    .line 132
    goto :goto_0

    .line 133
    :sswitch_8
    const-string v3, "text/vtt"

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_8

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_8
    const/4 v2, 0x3

    .line 143
    goto :goto_0

    .line 144
    :sswitch_9
    const-string v3, "application/x-mp4-vtt"

    .line 145
    .line 146
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_9

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_9
    const/4 v2, 0x2

    .line 154
    goto :goto_0

    .line 155
    :sswitch_a
    const-string v3, "application/pgs"

    .line 156
    .line 157
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-nez v3, :cond_a

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_a
    const/4 v2, 0x1

    .line 165
    goto :goto_0

    .line 166
    :sswitch_b
    const-string v3, "application/dvbsubs"

    .line 167
    .line 168
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-nez v3, :cond_b

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_b
    const/4 v2, 0x0

    .line 176
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :pswitch_0
    new-instance v0, Lo5/c;

    .line 181
    .line 182
    invoke-direct {v0}, Lo5/c;-><init>()V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :pswitch_1
    new-instance v0, Ln5/a;

    .line 187
    .line 188
    invoke-direct {v0}, Ln5/a;-><init>()V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :pswitch_2
    new-instance v0, Li5/b;

    .line 193
    .line 194
    iget v2, v1, Lv3/i0;->L:I

    .line 195
    .line 196
    iget-object v1, v1, Lv3/i0;->v:Ljava/util/List;

    .line 197
    .line 198
    invoke-direct {v0, v2, v1}, Li5/b;-><init>(ILjava/util/List;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :pswitch_3
    new-instance v0, Lh5/d;

    .line 203
    .line 204
    invoke-direct {v0}, Lh5/d;-><init>()V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :pswitch_4
    new-instance v2, Li5/a;

    .line 209
    .line 210
    iget v1, v1, Lv3/i0;->L:I

    .line 211
    .line 212
    invoke-direct {v2, v0, v1}, Li5/a;-><init>(Ljava/lang/String;I)V

    .line 213
    .line 214
    .line 215
    move-object v0, v2

    .line 216
    goto :goto_1

    .line 217
    :pswitch_5
    new-instance v0, Lm5/a;

    .line 218
    .line 219
    iget-object v1, v1, Lv3/i0;->v:Ljava/util/List;

    .line 220
    .line 221
    invoke-direct {v0, v1}, Lm5/a;-><init>(Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_6
    new-instance v0, Lp5/a;

    .line 226
    .line 227
    iget-object v1, v1, Lv3/i0;->v:Ljava/util/List;

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lp5/a;-><init>(Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :pswitch_7
    new-instance v0, Lq5/g;

    .line 234
    .line 235
    invoke-direct {v0}, Lq5/g;-><init>()V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :pswitch_8
    new-instance v0, Lq5/a;

    .line 240
    .line 241
    invoke-direct {v0}, Lq5/a;-><init>()V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :pswitch_9
    new-instance v0, Lk5/a;

    .line 246
    .line 247
    invoke-direct {v0}, Lk5/a;-><init>()V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :pswitch_a
    new-instance v0, Lj5/a;

    .line 252
    .line 253
    iget-object v1, v1, Lv3/i0;->v:Ljava/util/List;

    .line 254
    .line 255
    invoke-direct {v0, v1}, Lj5/a;-><init>(Ljava/util/List;)V

    .line 256
    .line 257
    .line 258
    :goto_1
    iput-object v0, p0, Lh5/n;->D:Lh5/h;

    .line 259
    .line 260
    return-void

    .line 261
    :cond_c
    :goto_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 262
    .line 263
    const-string v2, "Attempted to create decoder for unsupported MIME type: "

    .line 264
    .line 265
    invoke-static {v2, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v1

    .line 273
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final O()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lh5/n;->E:Lh5/k;

    const/4 v1, -0x1

    iput v1, p0, Lh5/n;->H:I

    iget-object v1, p0, Lh5/n;->F:Lh5/l;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz3/h;->o()V

    iput-object v0, p0, Lh5/n;->F:Lh5/l;

    :cond_0
    iget-object v1, p0, Lh5/n;->G:Lh5/l;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lz3/h;->o()V

    iput-object v0, p0, Lh5/n;->G:Lh5/l;

    :cond_1
    return-void
.end method

.method public final a(Lv3/i0;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lh5/n;->w:Lh5/j;

    .line 2
    .line 3
    check-cast v0, Lh5/j$a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "text/vtt"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const-string v1, "text/x-ssa"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const-string v1, "application/ttml+xml"

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    const-string v1, "application/x-mp4-vtt"

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    const-string v1, "application/x-subrip"

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    const-string v1, "application/x-quicktime-tx3g"

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    const-string v1, "application/cea-608"

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    const-string v1, "application/x-mp4-cea-608"

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    const-string v1, "application/cea-708"

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    const-string v1, "application/dvbsubs"

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    const-string v1, "application/pgs"

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_1

    .line 99
    .line 100
    const-string v1, "text/x-exoplayer-cues"

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    move v0, v3

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    :goto_0
    move v0, v2

    .line 112
    :goto_1
    if-eqz v0, :cond_3

    .line 113
    .line 114
    iget p1, p1, Lv3/i0;->O:I

    .line 115
    .line 116
    if-nez p1, :cond_2

    .line 117
    .line 118
    const/4 p1, 0x4

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    const/4 p1, 0x2

    .line 121
    :goto_2
    invoke-static {p1, v3, v3}, La0/j;->b(III)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :cond_3
    iget-object p1, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p1}, Lv5/p;->l(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    invoke-static {v2, v3, v3}, La0/j;->b(III)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    return p1

    .line 139
    :cond_4
    invoke-static {v3, v3, v3}, La0/j;->b(III)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    return p1
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lh5/n;->z:Z

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lh5/c;

    .line 8
    .line 9
    iget-object v0, p0, Lh5/n;->v:Lh5/m;

    .line 10
    .line 11
    iget-object v1, p1, Lh5/c;->a:Lo7/t;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lh5/m;->r(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lh5/n;->v:Lh5/m;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lh5/m;->j(Lh5/c;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public final p(JJ)V
    .locals 9

    .line 1
    iput-wide p1, p0, Lh5/n;->K:J

    .line 2
    .line 3
    iget-boolean p3, p0, Lv3/f;->s:Z

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iget-wide v0, p0, Lh5/n;->I:J

    .line 9
    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long p3, v0, v2

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    cmp-long p3, p1, v0

    .line 20
    .line 21
    if-ltz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 24
    .line 25
    .line 26
    iput-boolean p4, p0, Lh5/n;->z:Z

    .line 27
    .line 28
    :cond_0
    iget-boolean p3, p0, Lh5/n;->z:Z

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p3, p0, Lh5/n;->G:Lh5/l;

    .line 34
    .line 35
    if-nez p3, :cond_2

    .line 36
    .line 37
    iget-object p3, p0, Lh5/n;->D:Lh5/h;

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p3, p1, p2}, Lh5/h;->a(J)V

    .line 43
    .line 44
    .line 45
    :try_start_0
    iget-object p3, p0, Lh5/n;->D:Lh5/h;

    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-interface {p3}, Lz3/d;->b()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    check-cast p3, Lh5/l;

    .line 55
    .line 56
    iput-object p3, p0, Lh5/n;->G:Lh5/l;
    :try_end_0
    .catch Lh5/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p0, p1}, Lh5/n;->M(Lh5/i;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget p3, p0, Lv3/f;->f:I

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    if-eq p3, v0, :cond_3

    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    if-eqz p3, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0}, Lh5/n;->K()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    move p3, v1

    .line 80
    :goto_1
    cmp-long v2, v2, p1

    .line 81
    .line 82
    if-gtz v2, :cond_5

    .line 83
    .line 84
    iget p3, p0, Lh5/n;->H:I

    .line 85
    .line 86
    add-int/2addr p3, p4

    .line 87
    iput p3, p0, Lh5/n;->H:I

    .line 88
    .line 89
    invoke-virtual {p0}, Lh5/n;->K()J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    move p3, p4

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move p3, v1

    .line 96
    :cond_5
    iget-object v2, p0, Lh5/n;->G:Lh5/l;

    .line 97
    .line 98
    const/4 v3, 0x4

    .line 99
    const/4 v4, 0x0

    .line 100
    if-eqz v2, :cond_9

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Lz3/a;->m(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_7

    .line 107
    .line 108
    if-nez p3, :cond_9

    .line 109
    .line 110
    invoke-virtual {p0}, Lh5/n;->K()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    const-wide v7, 0x7fffffffffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    cmp-long v2, v5, v7

    .line 120
    .line 121
    if-nez v2, :cond_9

    .line 122
    .line 123
    iget v2, p0, Lh5/n;->B:I

    .line 124
    .line 125
    if-ne v2, v0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 128
    .line 129
    .line 130
    iget-object v2, p0, Lh5/n;->D:Lh5/h;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-interface {v2}, Lz3/d;->release()V

    .line 136
    .line 137
    .line 138
    iput-object v4, p0, Lh5/n;->D:Lh5/h;

    .line 139
    .line 140
    iput v1, p0, Lh5/n;->B:I

    .line 141
    .line 142
    invoke-virtual {p0}, Lh5/n;->N()V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    invoke-virtual {p0}, Lh5/n;->O()V

    .line 147
    .line 148
    .line 149
    iput-boolean p4, p0, Lh5/n;->z:Z

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_7
    iget-wide v5, v2, Lz3/h;->b:J

    .line 153
    .line 154
    cmp-long v5, v5, p1

    .line 155
    .line 156
    if-gtz v5, :cond_9

    .line 157
    .line 158
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 159
    .line 160
    if-eqz p3, :cond_8

    .line 161
    .line 162
    invoke-virtual {p3}, Lz3/h;->o()V

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {v2, p1, p2}, Lh5/l;->f(J)I

    .line 166
    .line 167
    .line 168
    move-result p3

    .line 169
    iput p3, p0, Lh5/n;->H:I

    .line 170
    .line 171
    iput-object v2, p0, Lh5/n;->F:Lh5/l;

    .line 172
    .line 173
    iput-object v4, p0, Lh5/n;->G:Lh5/l;

    .line 174
    .line 175
    move p3, p4

    .line 176
    :cond_9
    :goto_2
    if-eqz p3, :cond_e

    .line 177
    .line 178
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 184
    .line 185
    invoke-virtual {p3, p1, p2}, Lh5/l;->f(J)I

    .line 186
    .line 187
    .line 188
    move-result p3

    .line 189
    if-eqz p3, :cond_c

    .line 190
    .line 191
    iget-object v2, p0, Lh5/n;->F:Lh5/l;

    .line 192
    .line 193
    invoke-virtual {v2}, Lh5/l;->i()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-nez v2, :cond_a

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_a
    const/4 v2, -0x1

    .line 201
    if-ne p3, v2, :cond_b

    .line 202
    .line 203
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 204
    .line 205
    invoke-virtual {p3}, Lh5/l;->i()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    add-int/2addr v5, v2

    .line 210
    invoke-virtual {p3, v5}, Lh5/l;->g(I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    goto :goto_4

    .line 215
    :cond_b
    iget-object v5, p0, Lh5/n;->F:Lh5/l;

    .line 216
    .line 217
    add-int/2addr p3, v2

    .line 218
    invoke-virtual {v5, p3}, Lh5/l;->g(I)J

    .line 219
    .line 220
    .line 221
    move-result-wide v5

    .line 222
    goto :goto_4

    .line 223
    :cond_c
    :goto_3
    iget-object p3, p0, Lh5/n;->F:Lh5/l;

    .line 224
    .line 225
    iget-wide v5, p3, Lz3/h;->b:J

    .line 226
    .line 227
    :goto_4
    invoke-virtual {p0, v5, v6}, Lh5/n;->L(J)J

    .line 228
    .line 229
    .line 230
    new-instance p3, Lh5/c;

    .line 231
    .line 232
    iget-object v2, p0, Lh5/n;->F:Lh5/l;

    .line 233
    .line 234
    invoke-virtual {v2, p1, p2}, Lh5/l;->h(J)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-direct {p3, p1}, Lh5/c;-><init>(Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    iget-object p1, p0, Lh5/n;->u:Landroid/os/Handler;

    .line 242
    .line 243
    if-eqz p1, :cond_d

    .line 244
    .line 245
    invoke-virtual {p1, v1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    iget-object p1, p0, Lh5/n;->v:Lh5/m;

    .line 254
    .line 255
    iget-object p2, p3, Lh5/c;->a:Lo7/t;

    .line 256
    .line 257
    invoke-interface {p1, p2}, Lh5/m;->r(Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lh5/n;->v:Lh5/m;

    .line 261
    .line 262
    invoke-interface {p1, p3}, Lh5/m;->j(Lh5/c;)V

    .line 263
    .line 264
    .line 265
    :cond_e
    :goto_5
    iget p1, p0, Lh5/n;->B:I

    .line 266
    .line 267
    if-ne p1, v0, :cond_f

    .line 268
    .line 269
    return-void

    .line 270
    :cond_f
    :goto_6
    :try_start_1
    iget-boolean p1, p0, Lh5/n;->y:Z

    .line 271
    .line 272
    if-nez p1, :cond_17

    .line 273
    .line 274
    iget-object p1, p0, Lh5/n;->E:Lh5/k;

    .line 275
    .line 276
    if-nez p1, :cond_11

    .line 277
    .line 278
    iget-object p1, p0, Lh5/n;->D:Lh5/h;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-interface {p1}, Lz3/d;->c()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, Lh5/k;

    .line 288
    .line 289
    if-nez p1, :cond_10

    .line 290
    .line 291
    return-void

    .line 292
    :cond_10
    iput-object p1, p0, Lh5/n;->E:Lh5/k;

    .line 293
    .line 294
    :cond_11
    iget p2, p0, Lh5/n;->B:I

    .line 295
    .line 296
    if-ne p2, p4, :cond_12

    .line 297
    .line 298
    iput v3, p1, Lz3/a;->a:I

    .line 299
    .line 300
    iget-object p2, p0, Lh5/n;->D:Lh5/h;

    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-interface {p2, p1}, Lz3/d;->d(Lh5/k;)V

    .line 306
    .line 307
    .line 308
    iput-object v4, p0, Lh5/n;->E:Lh5/k;

    .line 309
    .line 310
    iput v0, p0, Lh5/n;->B:I

    .line 311
    .line 312
    return-void

    .line 313
    :cond_12
    iget-object p2, p0, Lh5/n;->x:Ll3/l;

    .line 314
    .line 315
    invoke-virtual {p0, p2, p1, v1}, Lv3/f;->I(Ll3/l;Lz3/g;I)I

    .line 316
    .line 317
    .line 318
    move-result p2

    .line 319
    const/4 p3, -0x4

    .line 320
    if-ne p2, p3, :cond_16

    .line 321
    .line 322
    invoke-virtual {p1, v3}, Lz3/a;->m(I)Z

    .line 323
    .line 324
    .line 325
    move-result p2

    .line 326
    if-eqz p2, :cond_13

    .line 327
    .line 328
    iput-boolean p4, p0, Lh5/n;->y:Z

    .line 329
    .line 330
    iput-boolean v1, p0, Lh5/n;->A:Z

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_13
    iget-object p2, p0, Lh5/n;->x:Ll3/l;

    .line 334
    .line 335
    iget-object p2, p2, Ll3/l;->b:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p2, Lv3/i0;

    .line 338
    .line 339
    if-nez p2, :cond_14

    .line 340
    .line 341
    return-void

    .line 342
    :cond_14
    iget-wide p2, p2, Lv3/i0;->x:J

    .line 343
    .line 344
    iput-wide p2, p1, Lh5/k;->q:J

    .line 345
    .line 346
    invoke-virtual {p1}, Lz3/g;->r()V

    .line 347
    .line 348
    .line 349
    iget-boolean p2, p0, Lh5/n;->A:Z

    .line 350
    .line 351
    invoke-virtual {p1, p4}, Lz3/a;->m(I)Z

    .line 352
    .line 353
    .line 354
    move-result p3

    .line 355
    if-nez p3, :cond_15

    .line 356
    .line 357
    move p3, p4

    .line 358
    goto :goto_7

    .line 359
    :cond_15
    move p3, v1

    .line 360
    :goto_7
    and-int/2addr p2, p3

    .line 361
    iput-boolean p2, p0, Lh5/n;->A:Z

    .line 362
    .line 363
    :goto_8
    iget-boolean p2, p0, Lh5/n;->A:Z

    .line 364
    .line 365
    if-nez p2, :cond_f

    .line 366
    .line 367
    iget-object p2, p0, Lh5/n;->D:Lh5/h;

    .line 368
    .line 369
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-interface {p2, p1}, Lz3/d;->d(Lh5/k;)V

    .line 373
    .line 374
    .line 375
    iput-object v4, p0, Lh5/n;->E:Lh5/k;
    :try_end_1
    .catch Lh5/i; {:try_start_1 .. :try_end_1} :catch_1

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_16
    const/4 p1, -0x3

    .line 379
    if-ne p2, p1, :cond_f

    .line 380
    .line 381
    return-void

    .line 382
    :catch_1
    move-exception p1

    .line 383
    invoke-virtual {p0, p1}, Lh5/n;->M(Lh5/i;)V

    .line 384
    .line 385
    .line 386
    :cond_17
    return-void
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method
