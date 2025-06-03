.class public final Le7/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/Long;

.field public B:Ljava/lang/Long;

.field public C:J

.field public D:Ljava/lang/String;

.field public E:I

.field public F:I

.field public G:J

.field public H:Ljava/lang/String;

.field public I:[B

.field public J:I

.field public K:J

.field public L:J

.field public M:J

.field public N:J

.field public O:J

.field public P:J

.field public Q:Ljava/lang/String;

.field public R:Z

.field public S:J

.field public T:J

.field public final a:Le7/j2;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:J

.field public i:J

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Ljava/lang/String;

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/Boolean;

.field public s:J

.field public t:Ljava/util/ArrayList;

.field public u:Ljava/lang/String;

.field public v:Z

.field public w:J

.field public x:J

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Le7/j2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p1, p0, Le7/k1;->a:Le7/j2;

    iput-object p2, p0, Le7/k1;->b:Ljava/lang/String;

    invoke-virtual {p1}, Le7/j2;->zzl()Le7/e2;

    move-result-object p1

    invoke-virtual {p1}, Le7/e2;->l()V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->e:Ljava/lang/String;

    return-void
.end method

.method public final B(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->n:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->n:J

    return-void
.end method

.method public final C(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->s:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->s:J

    return-void
.end method

.method public final D(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->m:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->m:J

    return-void
.end method

.method public final E(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->G:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->G:J

    return-void
.end method

.method public final F(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->i:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->i:J

    return-void
.end method

.method public final G(J)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lm6/j;->b(Z)V

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v3, p0, Le7/k1;->g:J

    cmp-long v3, v3, p1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->g:J

    return-void
.end method

.method public final H(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->h:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->h:J

    return-void
.end method

.method public final a(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 8
    .line 9
    .line 10
    iget-wide v0, p0, Le7/k1;->g:J

    .line 11
    .line 12
    add-long/2addr v0, p1

    .line 13
    const-wide/32 v2, 0x7fffffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    const-wide/16 v5, 0x1

    .line 19
    .line 20
    if-lez v4, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    .line 23
    .line 24
    invoke-virtual {v0}, Le7/j2;->zzj()Le7/a1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 29
    .line 30
    iget-object v1, p0, Le7/k1;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v1}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v4, "Bundle index overflow. appId"

    .line 37
    .line 38
    invoke-virtual {v0, v4, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sub-long v0, p1, v5

    .line 42
    .line 43
    :cond_0
    iget-wide p1, p0, Le7/k1;->G:J

    .line 44
    .line 45
    add-long/2addr p1, v5

    .line 46
    cmp-long v2, p1, v2

    .line 47
    .line 48
    if-lez v2, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Le7/k1;->a:Le7/j2;

    .line 51
    .line 52
    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, Le7/a1;->r:Le7/b1;

    .line 57
    .line 58
    iget-object p2, p0, Le7/k1;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string v2, "Delivery index overflow. appId"

    .line 65
    .line 66
    invoke-virtual {p1, v2, p2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const-wide/16 p1, 0x0

    .line 70
    .line 71
    :cond_1
    const/4 v2, 0x1

    .line 72
    iput-boolean v2, p0, Le7/k1;->R:Z

    .line 73
    .line 74
    iput-wide v0, p0, Le7/k1;->g:J

    .line 75
    .line 76
    iput-wide p1, p0, Le7/k1;->G:J

    .line 77
    .line 78
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
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

.method public final b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->q:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->q:Ljava/lang/String;

    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->t:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le7/k1;->R:Z

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Le7/k1;->t:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->Q:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Le7/k1;->z(Ljava/lang/String;)V

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-object v0, p0, Le7/k1;->D:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->v:Z

    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget v0, p0, Le7/k1;->J:I

    return v0
.end method

.method public final n(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->k:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->k:J

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->c:Ljava/lang/String;

    return-void
.end method

.method public final p(Z)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-boolean v1, p0, Le7/k1;->o:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-boolean p1, p0, Le7/k1;->o:Z

    return-void
.end method

.method public final q(I)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget v1, p0, Le7/k1;->F:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput p1, p0, Le7/k1;->F:I

    return-void
.end method

.method public final r(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->C:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->C:J

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->l:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->l:Ljava/lang/String;

    return-void
.end method

.method public final t(I)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget v1, p0, Le7/k1;->E:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput p1, p0, Le7/k1;->E:I

    return-void
.end method

.method public final u(J)V
    .locals 3

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-wide v1, p0, Le7/k1;->S:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-wide p1, p0, Le7/k1;->S:J

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->j:Ljava/lang/String;

    return-void
.end method

.method public final w()J
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-wide v0, p0, Le7/k1;->k:J

    return-wide v0
.end method

.method public final x(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->f:Ljava/lang/String;

    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->d:Ljava/lang/String;

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le7/k1;->a:Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    iget-boolean v0, p0, Le7/k1;->R:Z

    iget-object v1, p0, Le7/k1;->Q:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Le7/k1;->R:Z

    iput-object p1, p0, Le7/k1;->Q:Ljava/lang/String;

    return-void
.end method
