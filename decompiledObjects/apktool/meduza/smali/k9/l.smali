.class public final Lk9/l;
.super Lk9/f;
.source "SourceFile"


# instance fields
.field public final d:Lj9/n;

.field public final e:Lk9/d;


# direct methods
.method public constructor <init>(Lj9/i;Lj9/n;Lk9/d;Lk9/m;)V
    .locals 6

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lk9/l;-><init>(Lj9/i;Lj9/n;Lk9/d;Lk9/m;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lj9/i;Lj9/n;Lk9/d;Lk9/m;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/i;",
            "Lj9/n;",
            "Lk9/d;",
            "Lk9/m;",
            "Ljava/util/List<",
            "Lk9/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p4, p5}, Lk9/f;-><init>(Lj9/i;Lk9/m;Ljava/util/List;)V

    iput-object p2, p0, Lk9/l;->d:Lj9/n;

    iput-object p3, p0, Lk9/l;->e:Lk9/d;

    return-void
.end method


# virtual methods
.method public final a(Lj9/m;Lk9/d;Lu7/m;)Lk9/d;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lk9/f;->j(Lj9/m;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk9/f;->b:Lk9/m;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lk9/m;->b(Lj9/m;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object p2

    .line 13
    :cond_0
    invoke-virtual {p0, p3, p1}, Lk9/f;->h(Lu7/m;Lj9/m;)Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p0}, Lk9/l;->k()Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p1, Lj9/m;->f:Lj9/n;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lj9/n;->g(Ljava/util/HashMap;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p3}, Lj9/n;->g(Ljava/util/HashMap;)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p1, Lj9/m;->d:Lj9/q;

    .line 30
    .line 31
    iget-object v0, p1, Lj9/m;->f:Lj9/n;

    .line 32
    .line 33
    invoke-virtual {p1, p3, v0}, Lj9/m;->k(Lj9/q;Lj9/n;)V

    .line 34
    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    iput p3, p1, Lj9/m;->g:I

    .line 38
    .line 39
    sget-object p3, Lj9/q;->b:Lj9/q;

    .line 40
    .line 41
    iput-object p3, p1, Lj9/m;->d:Lj9/q;

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_1
    new-instance p1, Ljava/util/HashSet;

    .line 48
    .line 49
    iget-object p2, p2, Lk9/d;->a:Ljava/util/Set;

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lk9/l;->e:Lk9/d;

    .line 55
    .line 56
    iget-object p2, p2, Lk9/d;->a:Ljava/util/Set;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    new-instance p2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lk9/f;->c:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lk9/e;

    .line 83
    .line 84
    iget-object v0, v0, Lk9/e;->a:Lj9/l;

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    new-instance p2, Lk9/d;

    .line 94
    .line 95
    invoke-direct {p2, p1}, Lk9/d;-><init>(Ljava/util/Set;)V

    .line 96
    .line 97
    .line 98
    return-object p2
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final b(Lj9/m;Lk9/i;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lk9/f;->j(Lj9/m;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk9/f;->b:Lk9/m;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lk9/m;->b(Lj9/m;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Lk9/i;->a:Lj9/q;

    .line 14
    .line 15
    iput-object p2, p1, Lj9/m;->d:Lj9/q;

    .line 16
    .line 17
    const/4 p2, 0x4

    .line 18
    iput p2, p1, Lj9/m;->c:I

    .line 19
    .line 20
    new-instance p2, Lj9/n;

    .line 21
    .line 22
    invoke-direct {p2}, Lj9/n;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p1, Lj9/m;->f:Lj9/n;

    .line 26
    .line 27
    iput v1, p1, Lj9/m;->g:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v0, p2, Lk9/i;->b:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, Lk9/f;->i(Lj9/m;Ljava/util/List;)Ljava/util/HashMap;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p1, Lj9/m;->f:Lj9/n;

    .line 37
    .line 38
    invoke-virtual {p0}, Lk9/l;->k()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Lj9/n;->g(Ljava/util/HashMap;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0}, Lj9/n;->g(Ljava/util/HashMap;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p2, Lk9/i;->a:Lj9/q;

    .line 49
    .line 50
    iget-object v0, p1, Lj9/m;->f:Lj9/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2, v0}, Lj9/m;->k(Lj9/q;Lj9/n;)V

    .line 53
    .line 54
    .line 55
    iput v1, p1, Lj9/m;->g:I

    .line 56
    .line 57
    return-void
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

.method public final d()Lk9/d;
    .locals 1

    iget-object v0, p0, Lk9/l;->e:Lk9/d;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lk9/l;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lk9/l;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lk9/f;->e(Lk9/f;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lk9/l;->d:Lj9/n;

    .line 26
    .line 27
    iget-object v3, p1, Lk9/l;->d:Lj9/n;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lj9/n;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lk9/f;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object p1, p1, Lk9/f;->c:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v0, v1

    .line 47
    :goto_0
    return v0

    .line 48
    :cond_3
    :goto_1
    return v1
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

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lk9/f;->f()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk9/l;->d:Lj9/n;

    invoke-virtual {v1}, Lj9/n;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final k()Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lk9/l;->e:Lk9/d;

    .line 7
    .line 8
    iget-object v1, v1, Lk9/d;->a:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lj9/l;

    .line 25
    .line 26
    invoke-virtual {v2}, Lj9/e;->o()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lk9/l;->d:Lj9/n;

    .line 33
    .line 34
    invoke-virtual {v3}, Lj9/n;->b()Lka/d0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3}, Lj9/n;->d(Lj9/l;Lka/d0;)Lka/d0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "PatchMutation{"

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lk9/f;->g()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", mask="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lk9/l;->e:Lk9/d;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", value="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lk9/l;->d:Lj9/n;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
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
