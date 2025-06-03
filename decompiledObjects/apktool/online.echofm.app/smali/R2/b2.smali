.class public final LR2/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:LR2/Y1;


# direct methods
.method public constructor <init>(LR2/Y1;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/b2;->t:LR2/Y1;

    .line 2
    .line 3
    iput p2, p0, LR2/b2;->o:I

    .line 4
    .line 5
    iput-object p3, p0, LR2/b2;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/b2;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p5, p0, LR2/b2;->r:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, LR2/b2;->s:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, LR2/b2;->t:LR2/Y1;

    .line 2
    .line 3
    iget-object v0, v0, LR2/m3;->a:LR2/N2;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/N2;->F()LR2/l2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LR2/l3;->r()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LR2/b2;->t:LR2/Y1;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    const-string v2, "Persisted config not initialized. Not logging error/warn"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, LR2/Y1;->y(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 25
    .line 26
    invoke-static {v1}, LR2/Y1;->u(LR2/Y1;)C

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 33
    .line 34
    invoke-virtual {v1}, LR2/m3;->f()LR2/g;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, LR2/g;->T()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 45
    .line 46
    const/16 v2, 0x43

    .line 47
    .line 48
    :goto_0
    invoke-static {v1, v2}, LR2/Y1;->A(LR2/Y1;C)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 53
    .line 54
    const/16 v2, 0x63

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 58
    .line 59
    invoke-static {v1}, LR2/Y1;->D(LR2/Y1;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const-wide/16 v3, 0x0

    .line 64
    .line 65
    cmp-long v1, v1, v3

    .line 66
    .line 67
    if-gez v1, :cond_3

    .line 68
    .line 69
    iget-object v1, p0, LR2/b2;->t:LR2/Y1;

    .line 70
    .line 71
    const-wide/32 v2, 0x14051

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v2, v3}, LR2/Y1;->B(LR2/Y1;J)V

    .line 75
    .line 76
    .line 77
    :cond_3
    const-string v1, "01VDIWEA?"

    .line 78
    .line 79
    iget v2, p0, LR2/b2;->o:I

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iget-object v2, p0, LR2/b2;->t:LR2/Y1;

    .line 86
    .line 87
    invoke-static {v2}, LR2/Y1;->u(LR2/Y1;)C

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iget-object v3, p0, LR2/b2;->t:LR2/Y1;

    .line 92
    .line 93
    invoke-static {v3}, LR2/Y1;->D(LR2/Y1;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    iget-object v5, p0, LR2/b2;->p:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v6, p0, LR2/b2;->q:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v7, p0, LR2/b2;->r:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v8, p0, LR2/b2;->s:Ljava/lang/Object;

    .line 104
    .line 105
    const/4 v9, 0x1

    .line 106
    invoke-static {v9, v5, v6, v7, v8}, LR2/Y1;->x(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v7, "2"

    .line 113
    .line 114
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ":"

    .line 127
    .line 128
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const/16 v3, 0x400

    .line 143
    .line 144
    if-le v2, v3, :cond_4

    .line 145
    .line 146
    iget-object v1, p0, LR2/b2;->p:Ljava/lang/String;

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    :cond_4
    iget-object v0, v0, LR2/l2;->d:LR2/p2;

    .line 154
    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    const-wide/16 v2, 0x1

    .line 158
    .line 159
    invoke-virtual {v0, v1, v2, v3}, LR2/p2;->b(Ljava/lang/String;J)V

    .line 160
    .line 161
    .line 162
    :cond_5
    return-void
.end method
