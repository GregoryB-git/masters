.class public final Lg9/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg9/f0;

.field public final b:Lg9/k$a;

.field public final c:Ld9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld9/l<",
            "Lg9/s0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Lg9/d0;

.field public f:Lg9/s0;


# direct methods
.method public constructor <init>(Lg9/f0;Lg9/k$a;Lg9/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg9/g0;->d:Z

    sget-object v0, Lg9/d0;->a:Lg9/d0;

    iput-object v0, p0, Lg9/g0;->e:Lg9/d0;

    iput-object p1, p0, Lg9/g0;->a:Lg9/f0;

    iput-object p3, p0, Lg9/g0;->c:Ld9/l;

    iput-object p2, p0, Lg9/g0;->b:Lg9/k$a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, Lg9/g0;->b:Lg9/k$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg9/k$a;->d:Ld9/a0;

    sget-object v2, Ld9/a0;->b:Ld9/a0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    return v0

    :cond_0
    return v1
.end method

.method public final b(Lg9/s0;)Z
    .locals 13

    .line 1
    iget-object v0, p1, Lg9/s0;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p1, Lg9/s0;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v1

    .line 19
    :goto_1
    new-array v3, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v4, "We got a new snapshot with no changes?"

    .line 22
    .line 23
    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lg9/g0;->b:Lg9/k$a;

    .line 27
    .line 28
    iget-boolean v0, v0, Lg9/k$a;->a:Z

    .line 29
    .line 30
    if-nez v0, :cond_4

    .line 31
    .line 32
    new-instance v7, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, Lg9/s0;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lg9/i;

    .line 54
    .line 55
    iget-object v4, v3, Lg9/i;->a:Lg9/i$a;

    .line 56
    .line 57
    sget-object v5, Lg9/i$a;->d:Lg9/i$a;

    .line 58
    .line 59
    if-eq v4, v5, :cond_2

    .line 60
    .line 61
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance v0, Lg9/s0;

    .line 66
    .line 67
    iget-object v4, p1, Lg9/s0;->a:Lg9/f0;

    .line 68
    .line 69
    iget-object v5, p1, Lg9/s0;->b:Lj9/j;

    .line 70
    .line 71
    iget-object v6, p1, Lg9/s0;->c:Lj9/j;

    .line 72
    .line 73
    iget-boolean v8, p1, Lg9/s0;->e:Z

    .line 74
    .line 75
    iget-object v9, p1, Lg9/s0;->f:Lt8/e;

    .line 76
    .line 77
    iget-boolean v10, p1, Lg9/s0;->g:Z

    .line 78
    .line 79
    const/4 v11, 0x1

    .line 80
    iget-boolean v12, p1, Lg9/s0;->i:Z

    .line 81
    .line 82
    move-object v3, v0

    .line 83
    invoke-direct/range {v3 .. v12}, Lg9/s0;-><init>(Lg9/f0;Lj9/j;Lj9/j;Ljava/util/ArrayList;ZLt8/e;ZZZ)V

    .line 84
    .line 85
    .line 86
    move-object p1, v0

    .line 87
    :cond_4
    iget-boolean v0, p0, Lg9/g0;->d:Z

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-object v0, p0, Lg9/g0;->e:Lg9/d0;

    .line 92
    .line 93
    invoke-virtual {p0, p1, v0}, Lg9/g0;->d(Lg9/s0;Lg9/d0;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_a

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lg9/g0;->c(Lg9/s0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_5
    iget-object v0, p1, Lg9/s0;->d:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_6

    .line 110
    .line 111
    move v0, v1

    .line 112
    goto :goto_5

    .line 113
    :cond_6
    iget-object v0, p0, Lg9/g0;->f:Lg9/s0;

    .line 114
    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    iget-object v0, v0, Lg9/s0;->f:Lt8/e;

    .line 118
    .line 119
    iget-object v0, v0, Lt8/e;->a:Lt8/c;

    .line 120
    .line 121
    invoke-virtual {v0}, Lt8/c;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    xor-int/2addr v0, v1

    .line 126
    iget-object v3, p1, Lg9/s0;->f:Lt8/e;

    .line 127
    .line 128
    iget-object v3, v3, Lt8/e;->a:Lt8/c;

    .line 129
    .line 130
    invoke-virtual {v3}, Lt8/c;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    xor-int/2addr v3, v1

    .line 135
    if-eq v0, v3, :cond_7

    .line 136
    .line 137
    move v0, v1

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move v0, v2

    .line 140
    :goto_3
    iget-boolean v3, p1, Lg9/s0;->g:Z

    .line 141
    .line 142
    if-nez v3, :cond_9

    .line 143
    .line 144
    if-eqz v0, :cond_8

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_8
    move v0, v2

    .line 148
    goto :goto_5

    .line 149
    :cond_9
    :goto_4
    iget-object v0, p0, Lg9/g0;->b:Lg9/k$a;

    .line 150
    .line 151
    iget-boolean v0, v0, Lg9/k$a;->b:Z

    .line 152
    .line 153
    :goto_5
    if-eqz v0, :cond_a

    .line 154
    .line 155
    iget-object v0, p0, Lg9/g0;->c:Ld9/l;

    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    invoke-interface {v0, p1, v2}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_a
    move v1, v2

    .line 163
    :goto_6
    iput-object p1, p0, Lg9/g0;->f:Lg9/s0;

    .line 164
    .line 165
    return v1
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

.method public final c(Lg9/s0;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lg9/g0;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "Trying to raise initial event for second time"

    .line 9
    .line 10
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v5, p1, Lg9/s0;->a:Lg9/f0;

    .line 14
    .line 15
    iget-object v6, p1, Lg9/s0;->b:Lj9/j;

    .line 16
    .line 17
    iget-object v10, p1, Lg9/s0;->f:Lt8/e;

    .line 18
    .line 19
    iget-boolean v9, p1, Lg9/s0;->e:Z

    .line 20
    .line 21
    iget-boolean v12, p1, Lg9/s0;->h:Z

    .line 22
    .line 23
    iget-boolean v13, p1, Lg9/s0;->i:Z

    .line 24
    .line 25
    new-instance v8, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6}, Lj9/j;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, Lt8/e$a;

    .line 36
    .line 37
    invoke-virtual {v0}, Lt8/e$a;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lj9/g;

    .line 48
    .line 49
    sget-object v2, Lg9/i$a;->b:Lg9/i$a;

    .line 50
    .line 51
    new-instance v3, Lg9/i;

    .line 52
    .line 53
    invoke-direct {v3, v2, v0}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance p1, Lg9/s0;

    .line 61
    .line 62
    invoke-virtual {v5}, Lg9/f0;->a()Lg9/f0$a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v2, Lo4/o;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lo4/o;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    new-instance v7, Lj9/j;

    .line 72
    .line 73
    sget-object v0, Lj9/h;->a:Lt8/b;

    .line 74
    .line 75
    new-instance v3, Lt8/e;

    .line 76
    .line 77
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-direct {v3, v4, v2}, Lt8/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, v0, v3}, Lj9/j;-><init>(Lt8/c;Lt8/e;)V

    .line 85
    .line 86
    .line 87
    const/4 v11, 0x1

    .line 88
    move-object v4, p1

    .line 89
    invoke-direct/range {v4 .. v13}, Lg9/s0;-><init>(Lg9/f0;Lj9/j;Lj9/j;Ljava/util/ArrayList;ZLt8/e;ZZZ)V

    .line 90
    .line 91
    .line 92
    iput-boolean v1, p0, Lg9/g0;->d:Z

    .line 93
    .line 94
    iget-object v0, p0, Lg9/g0;->c:Ld9/l;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-interface {v0, p1, v1}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 98
    .line 99
    .line 100
    return-void
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

.method public final d(Lg9/s0;Lg9/d0;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lg9/g0;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "Determining whether to raise first event but already had first event."

    .line 9
    .line 10
    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p1, Lg9/s0;->e:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lg9/g0;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    sget-object v0, Lg9/d0;->c:Lg9/d0;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    xor-int/2addr v3, v1

    .line 32
    iget-object v4, p0, Lg9/g0;->b:Lg9/k$a;

    .line 33
    .line 34
    iget-boolean v4, v4, Lg9/k$a;->c:Z

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-boolean p1, p1, Lg9/s0;->e:Z

    .line 41
    .line 42
    new-array p2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v0, "Waiting for sync, but snapshot is not from cache"

    .line 45
    .line 46
    invoke-static {v0, p1, p2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :cond_2
    iget-object v3, p1, Lg9/s0;->b:Lj9/j;

    .line 51
    .line 52
    iget-object v3, v3, Lj9/j;->a:Lt8/c;

    .line 53
    .line 54
    invoke-virtual {v3}, Lt8/c;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    iget-boolean p1, p1, Lg9/s0;->i:Z

    .line 61
    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    move v1, v2

    .line 72
    :cond_4
    :goto_0
    return v1
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
