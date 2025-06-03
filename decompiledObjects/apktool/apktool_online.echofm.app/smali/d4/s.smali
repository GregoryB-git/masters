.class public Ld4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/k;

.field public final b:LV3/k;

.field public final c:Ld4/n;


# direct methods
.method public constructor <init>(LT3/o;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LT3/o;->a()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v2, LV3/k;

    .line 12
    .line 13
    invoke-direct {v2, v0}, LV3/k;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    iput-object v2, p0, Ld4/s;->a:LV3/k;

    .line 19
    .line 20
    invoke-virtual {p1}, LT3/o;->b()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, LV3/k;

    .line 27
    .line 28
    invoke-direct {v1, v0}, LV3/k;-><init>(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v1, p0, Ld4/s;->b:LV3/k;

    .line 32
    .line 33
    invoke-virtual {p1}, LT3/o;->c()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Ld4/s;->c:Ld4/n;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a(Ld4/n;)Ld4/n;
    .locals 2

    .line 1
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ld4/s;->c:Ld4/n;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1, v1}, Ld4/s;->b(LV3/k;Ld4/n;Ld4/n;)Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final b(LV3/k;Ld4/n;Ld4/n;)Ld4/n;
    .locals 7

    .line 1
    iget-object v0, p0, Ld4/s;->a:LV3/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, v0}, LV3/k;->V(LV3/k;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    iget-object v2, p0, Ld4/s;->b:LV3/k;

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {p1, v2}, LV3/k;->V(LV3/k;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_1
    iget-object v3, p0, Ld4/s;->a:LV3/k;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1, v3}, LV3/k;->W(LV3/k;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    move v3, v1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v3, v4

    .line 36
    :goto_2
    iget-object v5, p0, Ld4/s;->b:LV3/k;

    .line 37
    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1, v5}, LV3/k;->W(LV3/k;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    move v5, v1

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move v5, v4

    .line 49
    :goto_3
    if-lez v0, :cond_4

    .line 50
    .line 51
    if-gez v2, :cond_4

    .line 52
    .line 53
    if-nez v5, :cond_4

    .line 54
    .line 55
    return-object p3

    .line 56
    :cond_4
    if-lez v0, :cond_5

    .line 57
    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    invoke-interface {p3}, Ld4/n;->B()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_5

    .line 65
    .line 66
    return-object p3

    .line 67
    :cond_5
    if-lez v0, :cond_7

    .line 68
    .line 69
    if-nez v2, :cond_7

    .line 70
    .line 71
    invoke-static {v5}, LY3/m;->f(Z)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p3}, Ld4/n;->B()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    xor-int/2addr p1, v1

    .line 79
    invoke-static {p1}, LY3/m;->f(Z)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2}, Ld4/n;->B()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_6
    return-object p2

    .line 94
    :cond_7
    if-nez v3, :cond_b

    .line 95
    .line 96
    if-eqz v5, :cond_8

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    if-gtz v2, :cond_a

    .line 100
    .line 101
    if-gtz v0, :cond_9

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_9
    move v1, v4

    .line 105
    :cond_a
    :goto_4
    invoke-static {v1}, LY3/m;->f(Z)V

    .line 106
    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_b
    :goto_5
    new-instance v0, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_c

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ld4/m;

    .line 129
    .line 130
    invoke-virtual {v3}, Ld4/m;->c()Ld4/b;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_c
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_d

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    check-cast v3, Ld4/m;

    .line 153
    .line 154
    invoke-virtual {v3}, Ld4/m;->c()Ld4/b;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_d
    new-instance v2, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    add-int/2addr v3, v1

    .line 169
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 173
    .line 174
    .line 175
    invoke-interface {p3}, Ld4/n;->t()Ld4/n;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_e

    .line 184
    .line 185
    invoke-interface {p2}, Ld4/n;->t()Ld4/n;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_f

    .line 194
    .line 195
    :cond_e
    invoke-static {}, Ld4/b;->o()Ld4/b;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :cond_f
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v1, p2

    .line 207
    :cond_10
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_11

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ld4/b;

    .line 218
    .line 219
    invoke-interface {p2, v2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {p1, v2}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-interface {p2, v2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-interface {p3, v2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-virtual {p0, v4, v5, v6}, Ld4/s;->b(LV3/k;Ld4/n;Ld4/n;)Ld4/n;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    if-eq v4, v3, :cond_10

    .line 240
    .line 241
    invoke-interface {v1, v2, v4}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    goto :goto_8

    .line 246
    :cond_11
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "RangeMerge{optExclusiveStart="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ld4/s;->a:LV3/k;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", optInclusiveEnd="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ld4/s;->b:LV3/k;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", snap="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ld4/s;->c:Ld4/n;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x7d

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
