.class public final Lv3/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/z0$a;,
        Lv3/z0$b;,
        Lv3/z0$c;,
        Lv3/z0$d;
    }
.end annotation


# instance fields
.field public final a:Lw3/a0;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lz4/r;",
            "Lv3/z0$c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/HashMap;

.field public final e:Lv3/z0$d;

.field public final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lv3/z0$c;",
            "Lv3/z0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/HashSet;

.field public final h:Lw3/a;

.field public final i:Lv5/k;

.field public j:Lz4/e0;

.field public k:Z

.field public l:Lt5/l0;


# direct methods
.method public constructor <init>(Lv3/z0$d;Lw3/a;Lv5/k;Lw3/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lv3/z0;->a:Lw3/a0;

    iput-object p1, p0, Lv3/z0;->e:Lv3/z0$d;

    new-instance p1, Lz4/e0$a;

    invoke-direct {p1}, Lz4/e0$a;-><init>()V

    iput-object p1, p0, Lv3/z0;->j:Lz4/e0;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lv3/z0;->c:Ljava/util/IdentityHashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lv3/z0;->d:Ljava/util/HashMap;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    iput-object p2, p0, Lv3/z0;->h:Lw3/a;

    iput-object p3, p0, Lv3/z0;->i:Lv5/k;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lv3/z0;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lv3/z0;->g:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final a(ILjava/util/List;Lz4/e0;)Lv3/r1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lv3/z0$c;",
            ">;",
            "Lz4/e0;",
            ")",
            "Lv3/r1;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iput-object p3, p0, Lv3/z0;->j:Lz4/e0;

    .line 8
    .line 9
    move p3, p1

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p1

    .line 15
    if-ge p3, v0, :cond_3

    .line 16
    .line 17
    sub-int v0, p3, p1

    .line 18
    .line 19
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lv3/z0$c;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    add-int/lit8 v3, p3, -0x1

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lv3/z0$c;

    .line 37
    .line 38
    iget-object v3, v2, Lv3/z0$c;->a:Lz4/p;

    .line 39
    .line 40
    iget-object v3, v3, Lz4/p;->w:Lz4/p$a;

    .line 41
    .line 42
    iget v2, v2, Lv3/z0$c;->d:I

    .line 43
    .line 44
    invoke-virtual {v3}, Lz4/l;->o()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    add-int/2addr v3, v2

    .line 49
    iput v3, v0, Lv3/z0$c;->d:I

    .line 50
    .line 51
    :goto_1
    iput-boolean v1, v0, Lv3/z0$c;->e:Z

    .line 52
    .line 53
    iget-object v1, v0, Lv3/z0$c;->c:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_0
    iput v1, v0, Lv3/z0$c;->d:I

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    iget-object v1, v0, Lv3/z0$c;->a:Lz4/p;

    .line 63
    .line 64
    iget-object v1, v1, Lz4/p;->w:Lz4/p$a;

    .line 65
    .line 66
    invoke-virtual {v1}, Lz4/l;->o()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p0, p3, v1}, Lv3/z0;->b(II)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lv3/z0;->d:Ljava/util/HashMap;

    .line 79
    .line 80
    iget-object v2, v0, Lv3/z0$c;->b:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-boolean v1, p0, Lv3/z0;->k:Z

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lv3/z0;->f(Lv3/z0$c;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lv3/z0;->c:Ljava/util/IdentityHashMap;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    iget-object v1, p0, Lv3/z0;->g:Ljava/util/HashSet;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_1
    iget-object v1, p0, Lv3/z0;->f:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lv3/z0$b;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    iget-object v1, v0, Lv3/z0$b;->a:Lz4/t;

    .line 117
    .line 118
    iget-object v0, v0, Lv3/z0$b;->b:Lz4/t$c;

    .line 119
    .line 120
    invoke-interface {v1, v0}, Lz4/t;->l(Lz4/t$c;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    invoke-virtual {p0}, Lv3/z0;->c()Lv3/r1;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
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

.method public final b(II)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv3/z0$c;

    iget v1, v0, Lv3/z0$c;->d:I

    add-int/2addr v1, p2

    iput v1, v0, Lv3/z0$c;->d:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()Lv3/r1;
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lv3/r1;->a:Lv3/r1$a;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget-object v2, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lv3/z0$c;

    .line 29
    .line 30
    iput v1, v2, Lv3/z0$c;->d:I

    .line 31
    .line 32
    iget-object v2, v2, Lv3/z0$c;->a:Lz4/p;

    .line 33
    .line 34
    iget-object v2, v2, Lz4/p;->w:Lz4/p$a;

    .line 35
    .line 36
    invoke-virtual {v2}, Lz4/l;->o()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v1, v2

    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Lv3/h1;

    .line 45
    .line 46
    iget-object v1, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v2, p0, Lv3/z0;->j:Lz4/e0;

    .line 49
    .line 50
    invoke-direct {v0, v1, v2}, Lv3/h1;-><init>(Ljava/util/List;Lz4/e0;)V

    .line 51
    .line 52
    .line 53
    return-object v0
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

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/z0;->g:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lv3/z0$c;

    .line 18
    .line 19
    iget-object v2, v1, Lv3/z0$c;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, Lv3/z0;->f:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lv3/z0$b;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v2, v1, Lv3/z0$b;->a:Lz4/t;

    .line 38
    .line 39
    iget-object v1, v1, Lv3/z0$b;->b:Lz4/t$c;

    .line 40
    .line 41
    invoke-interface {v2, v1}, Lz4/t;->l(Lz4/t$c;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-void
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

.method public final e(Lv3/z0$c;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lv3/z0$c;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lv3/z0$c;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lv3/z0;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lv3/z0$b;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lv3/z0$b;->a:Lz4/t;

    .line 25
    .line 26
    iget-object v2, v0, Lv3/z0$b;->b:Lz4/t$c;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Lz4/t;->a(Lz4/t$c;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lv3/z0$b;->a:Lz4/t;

    .line 32
    .line 33
    iget-object v2, v0, Lv3/z0$b;->c:Lv3/z0$a;

    .line 34
    .line 35
    invoke-interface {v1, v2}, Lz4/t;->m(Lz4/w;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lv3/z0$b;->a:Lz4/t;

    .line 39
    .line 40
    iget-object v0, v0, Lv3/z0$b;->c:Lv3/z0$a;

    .line 41
    .line 42
    invoke-interface {v1, v0}, Lz4/t;->c(La4/g;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lv3/z0;->g:Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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

.method public final f(Lv3/z0$c;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lv3/z0$c;->a:Lz4/p;

    .line 2
    .line 3
    new-instance v1, Lv3/u0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lv3/u0;-><init>(Lv3/z0;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lv3/z0$a;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, Lv3/z0$a;-><init>(Lv3/z0;Lv3/z0$c;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lv3/z0;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v4, Lv3/z0$b;

    .line 16
    .line 17
    invoke-direct {v4, v0, v1, v2}, Lv3/z0$b;-><init>(Lz4/p;Lv3/u0;Lv3/z0$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget p1, Lv5/e0;->a:I

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    new-instance v3, Landroid/os/Handler;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3, v2}, Lz4/a;->n(Landroid/os/Handler;Lz4/w;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 57
    .line 58
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3, v2}, Lz4/a;->d(Landroid/os/Handler;La4/g;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lv3/z0;->l:Lt5/l0;

    .line 65
    .line 66
    iget-object v2, p0, Lv3/z0;->a:Lw3/a0;

    .line 67
    .line 68
    invoke-virtual {v0, v1, p1, v2}, Lz4/a;->e(Lz4/t$c;Lt5/l0;Lw3/a0;)V

    .line 69
    .line 70
    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final g(II)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    sub-int/2addr p2, v0

    .line 3
    :goto_0
    if-lt p2, p1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lv3/z0$c;

    .line 12
    .line 13
    iget-object v2, p0, Lv3/z0;->d:Ljava/util/HashMap;

    .line 14
    .line 15
    iget-object v3, v1, Lv3/z0$c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lv3/z0$c;->a:Lz4/p;

    .line 21
    .line 22
    iget-object v2, v2, Lz4/p;->w:Lz4/p$a;

    .line 23
    .line 24
    invoke-virtual {v2}, Lz4/l;->o()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    neg-int v2, v2

    .line 29
    invoke-virtual {p0, p2, v2}, Lv3/z0;->b(II)V

    .line 30
    .line 31
    .line 32
    iput-boolean v0, v1, Lv3/z0$c;->e:Z

    .line 33
    .line 34
    iget-boolean v2, p0, Lv3/z0;->k:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lv3/z0;->e(Lv3/z0$c;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
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
