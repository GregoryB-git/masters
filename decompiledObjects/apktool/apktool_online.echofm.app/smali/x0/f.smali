.class public final Lx0/f;
.super Lx0/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/f$b;,
        Lx0/f$a;
    }
.end annotation


# instance fields
.field public final m:J

.field public final n:J

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Ljava/util/ArrayList;

.field public final s:Ld0/I$c;

.field public t:Lx0/f$a;

.field public u:Lx0/f$b;

.field public v:J

.field public w:J


# direct methods
.method public constructor <init>(Lx0/x;JJ)V
    .locals 9

    .line 1
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v8}, Lx0/f;-><init>(Lx0/x;JJZZZ)V

    return-void
.end method

.method public constructor <init>(Lx0/x;JJZZZ)V
    .locals 2

    .line 2
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/x;

    invoke-direct {p0, p1}, Lx0/b0;-><init>(Lx0/x;)V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lg0/a;->a(Z)V

    iput-wide p2, p0, Lx0/f;->m:J

    iput-wide p4, p0, Lx0/f;->n:J

    iput-boolean p6, p0, Lx0/f;->o:Z

    iput-boolean p7, p0, Lx0/f;->p:Z

    iput-boolean p8, p0, Lx0/f;->q:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx0/f;->r:Ljava/util/ArrayList;

    new-instance p1, Ld0/I$c;

    invoke-direct {p1}, Ld0/I$c;-><init>()V

    iput-object p1, p0, Lx0/f;->s:Ld0/I$c;

    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    .line 1
    invoke-super {p0}, Lx0/h;->B()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lx0/f;->u:Lx0/f$b;

    .line 6
    .line 7
    iput-object v0, p0, Lx0/f;->t:Lx0/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public S(Ld0/I;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/f;->u:Lx0/f$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lx0/f;->W(Ld0/I;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final W(Ld0/I;)V
    .locals 15

    .line 1
    move-object v1, p0

    .line 2
    iget-object v0, v1, Lx0/f;->s:Ld0/I$c;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move-object/from16 v4, p1

    .line 6
    .line 7
    invoke-virtual {v4, v2, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lx0/f;->s:Ld0/I$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ld0/I$c;->e()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    iget-object v0, v1, Lx0/f;->t:Lx0/f$a;

    .line 17
    .line 18
    const-wide/high16 v7, -0x8000000000000000L

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, v1, Lx0/f;->r:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-boolean v0, v1, Lx0/f;->p:Z

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-wide v9, v1, Lx0/f;->v:J

    .line 36
    .line 37
    sub-long/2addr v9, v5

    .line 38
    iget-wide v11, v1, Lx0/f;->n:J

    .line 39
    .line 40
    cmp-long v0, v11, v7

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-wide v7, v1, Lx0/f;->w:J

    .line 46
    .line 47
    sub-long/2addr v7, v5

    .line 48
    :goto_0
    move-wide v5, v9

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    :goto_1
    iget-wide v9, v1, Lx0/f;->m:J

    .line 51
    .line 52
    iget-wide v11, v1, Lx0/f;->n:J

    .line 53
    .line 54
    iget-boolean v0, v1, Lx0/f;->q:Z

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, v1, Lx0/f;->s:Ld0/I$c;

    .line 59
    .line 60
    invoke-virtual {v0}, Ld0/I$c;->c()J

    .line 61
    .line 62
    .line 63
    move-result-wide v13

    .line 64
    add-long/2addr v9, v13

    .line 65
    add-long/2addr v11, v13

    .line 66
    :cond_3
    add-long v13, v5, v9

    .line 67
    .line 68
    iput-wide v13, v1, Lx0/f;->v:J

    .line 69
    .line 70
    iget-wide v13, v1, Lx0/f;->n:J

    .line 71
    .line 72
    cmp-long v0, v13, v7

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-long v7, v5, v11

    .line 78
    .line 79
    :goto_2
    iput-wide v7, v1, Lx0/f;->w:J

    .line 80
    .line 81
    iget-object v0, v1, Lx0/f;->r:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    move v3, v2

    .line 88
    :goto_3
    if-ge v3, v0, :cond_5

    .line 89
    .line 90
    iget-object v5, v1, Lx0/f;->r:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Lx0/e;

    .line 97
    .line 98
    iget-wide v6, v1, Lx0/f;->v:J

    .line 99
    .line 100
    iget-wide v13, v1, Lx0/f;->w:J

    .line 101
    .line 102
    invoke-virtual {v5, v6, v7, v13, v14}, Lx0/e;->w(JJ)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    move-wide v5, v9

    .line 109
    move-wide v7, v11

    .line 110
    :goto_4
    :try_start_0
    new-instance v0, Lx0/f$a;

    .line 111
    .line 112
    move-object v3, v0

    .line 113
    move-object/from16 v4, p1

    .line 114
    .line 115
    invoke-direct/range {v3 .. v8}, Lx0/f$a;-><init>(Ld0/I;JJ)V

    .line 116
    .line 117
    .line 118
    iput-object v0, v1, Lx0/f;->t:Lx0/f$a;
    :try_end_0
    .catch Lx0/f$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lx0/a;->A(Ld0/I;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catch_0
    move-exception v0

    .line 125
    iput-object v0, v1, Lx0/f;->u:Lx0/f$b;

    .line 126
    .line 127
    :goto_5
    iget-object v0, v1, Lx0/f;->r:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-ge v2, v0, :cond_6

    .line 134
    .line 135
    iget-object v0, v1, Lx0/f;->r:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lx0/e;

    .line 142
    .line 143
    iget-object v3, v1, Lx0/f;->u:Lx0/f$b;

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Lx0/e;->t(Lx0/f$b;)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_6
    return-void
.end method

.method public e(Lx0/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/f;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 11
    .line 12
    check-cast p1, Lx0/e;

    .line 13
    .line 14
    iget-object p1, p1, Lx0/e;->o:Lx0/v;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lx0/x;->e(Lx0/v;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lx0/f;->r:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-boolean p1, p0, Lx0/f;->p:Z

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lx0/f;->t:Lx0/f$a;

    .line 32
    .line 33
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lx0/f$a;

    .line 38
    .line 39
    iget-object p1, p1, Lx0/p;->e:Ld0/I;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lx0/f;->W(Ld0/I;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public f(Lx0/x$b;LB0/b;J)Lx0/v;
    .locals 8

    .line 1
    new-instance v7, Lx0/e;

    .line 2
    .line 3
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3, p4}, Lx0/x;->f(Lx0/x$b;LB0/b;J)Lx0/v;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, p0, Lx0/f;->o:Z

    .line 10
    .line 11
    iget-wide v3, p0, Lx0/f;->v:J

    .line 12
    .line 13
    iget-wide v5, p0, Lx0/f;->w:J

    .line 14
    .line 15
    move-object v0, v7

    .line 16
    invoke-direct/range {v0 .. v6}, Lx0/e;-><init>(Lx0/v;ZJJ)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lx0/f;->r:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-object v7
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/f;->u:Lx0/f$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Lx0/h;->h()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    throw v0
.end method
