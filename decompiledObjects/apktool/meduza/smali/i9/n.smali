.class public final Li9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/n$b;,
        Li9/n$a;
    }
.end annotation


# static fields
.field public static final n:J

.field public static final synthetic o:I


# instance fields
.field public final a:Le9/a;

.field public b:Li9/f;

.field public c:Li9/a0;

.field public d:Li9/b;

.field public final e:Li9/g0;

.field public f:Li9/h;

.field public final g:Li9/d0;

.field public final h:Ll3/l;

.field public final i:Li9/l1;

.field public final j:Li9/a;

.field public final k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Li9/m1;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/HashMap;

.field public final m:Lg9/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Li9/n;->n:J

    return-void
.end method

.method public constructor <init>(Le9/a;Li9/d0;Le9/e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Le9/a;->u()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v2, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v3, "LocalStore was passed an unstarted persistence implementation"

    .line 12
    .line 13
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Li9/n;->a:Le9/a;

    .line 17
    .line 18
    iput-object p2, p0, Li9/n;->g:Li9/d0;

    .line 19
    .line 20
    invoke-virtual {p1}, Le9/a;->l()Li9/d;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Le9/a;->r()Li9/l1;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Li9/n;->i:Li9/l1;

    .line 28
    .line 29
    invoke-virtual {p1}, Le9/a;->j()Li9/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Li9/n;->j:Li9/a;

    .line 34
    .line 35
    invoke-interface {p2}, Li9/l1;->d()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    new-instance v0, Lg9/l0;

    .line 40
    .line 41
    invoke-direct {v0, v1, p2}, Lg9/l0;-><init>(II)V

    .line 42
    .line 43
    .line 44
    iget p2, v0, Lg9/l0;->a:I

    .line 45
    .line 46
    add-int/lit8 p2, p2, 0x2

    .line 47
    .line 48
    iput p2, v0, Lg9/l0;->a:I

    .line 49
    .line 50
    iput-object v0, p0, Li9/n;->m:Lg9/l0;

    .line 51
    .line 52
    invoke-virtual {p1}, Le9/a;->q()Li9/g0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, p0, Li9/n;->e:Li9/g0;

    .line 57
    .line 58
    new-instance p2, Ll3/l;

    .line 59
    .line 60
    const/4 v0, 0x6

    .line 61
    invoke-direct {p2, v0}, Ll3/l;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Li9/n;->h:Ll3/l;

    .line 65
    .line 66
    new-instance v0, Landroid/util/SparseArray;

    .line 67
    .line 68
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Li9/n;->k:Landroid/util/SparseArray;

    .line 72
    .line 73
    new-instance v0, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Li9/n;->l:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {p1}, Le9/a;->p()Li9/f0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p1, p2}, Li9/f0;->m(Ll3/l;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p3}, Li9/n;->c(Le9/e;)V

    .line 88
    .line 89
    .line 90
    return-void
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

.method public static e(Li9/m1;Li9/m1;Lm9/k0;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Li9/m1;->g:Lma/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lma/h;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p1, Li9/m1;->e:Lj9/q;

    .line 12
    .line 13
    iget-object v0, v0, Lj9/q;->a:Lu7/m;

    .line 14
    .line 15
    iget-wide v2, v0, Lu7/m;->a:J

    .line 16
    .line 17
    iget-object v0, p0, Li9/m1;->e:Lj9/q;

    .line 18
    .line 19
    iget-object v0, v0, Lj9/q;->a:Lu7/m;

    .line 20
    .line 21
    iget-wide v4, v0, Lu7/m;->a:J

    .line 22
    .line 23
    sub-long/2addr v2, v4

    .line 24
    sget-wide v4, Li9/n;->n:J

    .line 25
    .line 26
    cmp-long v0, v2, v4

    .line 27
    .line 28
    if-ltz v0, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    iget-object p1, p1, Li9/m1;->f:Lj9/q;

    .line 32
    .line 33
    iget-object p1, p1, Lj9/q;->a:Lu7/m;

    .line 34
    .line 35
    iget-wide v2, p1, Lu7/m;->a:J

    .line 36
    .line 37
    iget-object p0, p0, Li9/m1;->f:Lj9/q;

    .line 38
    .line 39
    iget-object p0, p0, Lj9/q;->a:Lu7/m;

    .line 40
    .line 41
    iget-wide p0, p0, Lu7/m;->a:J

    .line 42
    .line 43
    sub-long/2addr v2, p0

    .line 44
    cmp-long p0, v2, v4

    .line 45
    .line 46
    if-ltz p0, :cond_2

    .line 47
    .line 48
    return v1

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    return p0

    .line 53
    :cond_3
    iget-object p1, p2, Lm9/k0;->c:Lt8/e;

    .line 54
    .line 55
    invoke-virtual {p1}, Lt8/e;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object v0, p2, Lm9/k0;->d:Lt8/e;

    .line 60
    .line 61
    invoke-virtual {v0}, Lt8/e;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/2addr v0, p1

    .line 66
    iget-object p1, p2, Lm9/k0;->e:Lt8/e;

    .line 67
    .line 68
    invoke-virtual {p1}, Lt8/e;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/2addr p1, v0

    .line 73
    if-lez p1, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move v1, p0

    .line 77
    :goto_0
    return v1
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


# virtual methods
.method public final a(Lg9/k0;)Li9/m1;
    .locals 4

    .line 1
    iget-object v0, p0, Li9/n;->i:Li9/l1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li9/l1;->a(Lg9/k0;)Li9/m1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, v0, Li9/m1;->b:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Li9/n$a;

    .line 13
    .line 14
    invoke-direct {v0}, Li9/n$a;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Li9/n;->a:Le9/a;

    .line 18
    .line 19
    new-instance v2, Lx0/g;

    .line 20
    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    invoke-direct {v2, p0, v0, p1, v3}, Lx0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    const-string v3, "Allocate target"

    .line 27
    .line 28
    invoke-virtual {v1, v3, v2}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    iget v1, v0, Li9/n$a;->b:I

    .line 32
    .line 33
    iget-object v0, v0, Li9/n$a;->a:Li9/m1;

    .line 34
    .line 35
    :goto_0
    iget-object v2, p0, Li9/n;->k:Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-object v2, p0, Li9/n;->k:Landroid/util/SparseArray;

    .line 44
    .line 45
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Li9/n;->l:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_1
    return-object v0
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

.method public final b(Lg9/f0;Z)Lr4/c;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->i()Lg9/k0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v0, Li9/n;->l:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Li9/n;->k:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Li9/m1;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v3, v0, Li9/n;->i:Li9/l1;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Li9/l1;->a(Lg9/k0;)Li9/m1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    sget-object v3, Lj9/q;->b:Lj9/q;

    .line 39
    .line 40
    sget-object v4, Lj9/i;->c:Lt8/e;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget-object v4, v2, Li9/m1;->f:Lj9/q;

    .line 45
    .line 46
    iget-object v5, v0, Li9/n;->i:Li9/l1;

    .line 47
    .line 48
    iget v2, v2, Li9/m1;->b:I

    .line 49
    .line 50
    invoke-interface {v5, v2}, Li9/l1;->f(I)Lt8/e;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v2, v4

    .line 56
    move-object v4, v3

    .line 57
    :goto_1
    iget-object v5, v0, Li9/n;->g:Li9/d0;

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v4, v3

    .line 63
    :goto_2
    iget-boolean v6, v5, Li9/d0;->c:Z

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    new-array v8, v7, [Ljava/lang/Object;

    .line 67
    .line 68
    const-string v9, "initialize() not called"

    .line 69
    .line 70
    invoke-static {v9, v6, v8}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v1}, Li9/d0;->d(Lg9/f0;)Lt8/c;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->h()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x2

    .line 87
    const-string v10, "QueryEngine"

    .line 88
    .line 89
    const/4 v11, 0x1

    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-virtual {v4, v3}, Lj9/q;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    iget-object v3, v5, Li9/d0;->a:Li9/h;

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Li9/h;->b(Ljava/lang/Iterable;)Lt8/c;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v1, v3}, Li9/d0;->b(Lg9/f0;Lt8/c;)Lt8/e;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2}, Lt8/e;->size()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-static {v1, v6, v3, v4}, Li9/d0;->c(Lg9/f0;ILt8/e;Lj9/q;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_6

    .line 119
    .line 120
    :goto_3
    move-object v6, v8

    .line 121
    goto :goto_5

    .line 122
    :cond_6
    invoke-static {}, Lp2/m0;->S()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_7

    .line 127
    .line 128
    new-array v6, v9, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v4}, Lj9/q;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    aput-object v8, v6, v7

    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    aput-object v8, v6, v11

    .line 141
    .line 142
    const-string v8, "Re-using previous result from %s to execute query: %s"

    .line 143
    .line 144
    invoke-static {v11, v10, v8, v6}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    const/4 v6, -0x1

    .line 148
    sget-object v8, Lj9/k$a;->a:Lj9/b;

    .line 149
    .line 150
    iget-object v4, v4, Lj9/q;->a:Lu7/m;

    .line 151
    .line 152
    iget-wide v12, v4, Lu7/m;->a:J

    .line 153
    .line 154
    iget v4, v4, Lu7/m;->b:I

    .line 155
    .line 156
    add-int/2addr v4, v11

    .line 157
    new-instance v8, Lj9/q;

    .line 158
    .line 159
    int-to-double v14, v4

    .line 160
    const-wide v16, 0x41cdcd6500000000L    # 1.0E9

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    cmpl-double v14, v14, v16

    .line 166
    .line 167
    if-nez v14, :cond_8

    .line 168
    .line 169
    new-instance v4, Lu7/m;

    .line 170
    .line 171
    const-wide/16 v14, 0x1

    .line 172
    .line 173
    add-long/2addr v12, v14

    .line 174
    invoke-direct {v4, v7, v12, v13}, Lu7/m;-><init>(IJ)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    new-instance v14, Lu7/m;

    .line 179
    .line 180
    invoke-direct {v14, v4, v12, v13}, Lu7/m;-><init>(IJ)V

    .line 181
    .line 182
    .line 183
    move-object v4, v14

    .line 184
    :goto_4
    invoke-direct {v8, v4}, Lj9/q;-><init>(Lu7/m;)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lj9/i;->g()Lj9/i;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    new-instance v12, Lj9/b;

    .line 192
    .line 193
    invoke-direct {v12, v8, v4, v6}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v3, v1, v12}, Li9/d0;->a(Lt8/e;Lg9/f0;Lj9/k$a;)Lt8/c;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    move-object v6, v3

    .line 201
    :goto_5
    if-eqz v6, :cond_9

    .line 202
    .line 203
    goto/16 :goto_6

    .line 204
    .line 205
    :cond_9
    new-instance v3, La/a;

    .line 206
    .line 207
    invoke-direct {v3}, La/a;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Lp2/m0;->S()Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_a

    .line 215
    .line 216
    new-array v4, v11, [Ljava/lang/Object;

    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    aput-object v6, v4, v7

    .line 223
    .line 224
    const-string v6, "Using full collection scan to execute query: %s"

    .line 225
    .line 226
    invoke-static {v11, v10, v6, v4}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_a
    iget-object v4, v5, Li9/d0;->a:Li9/h;

    .line 230
    .line 231
    sget-object v6, Lj9/k$a;->a:Lj9/b;

    .line 232
    .line 233
    invoke-virtual {v4, v1, v6, v3}, Li9/h;->d(Lg9/f0;Lj9/k$a;La/a;)Lt8/c;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    if-eqz v6, :cond_c

    .line 238
    .line 239
    iget-boolean v4, v5, Li9/d0;->d:Z

    .line 240
    .line 241
    if-eqz v4, :cond_c

    .line 242
    .line 243
    invoke-virtual {v6}, Lt8/c;->size()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    iget v8, v3, La/a;->a:I

    .line 248
    .line 249
    const/16 v12, 0x64

    .line 250
    .line 251
    if-ge v8, v12, :cond_b

    .line 252
    .line 253
    new-array v3, v9, [Ljava/lang/Object;

    .line 254
    .line 255
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    aput-object v1, v3, v7

    .line 260
    .line 261
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    aput-object v1, v3, v11

    .line 266
    .line 267
    const-string v1, "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents."

    .line 268
    .line 269
    invoke-static {v11, v10, v1, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_b
    const/4 v8, 0x3

    .line 274
    new-array v8, v8, [Ljava/lang/Object;

    .line 275
    .line 276
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    aput-object v12, v8, v7

    .line 281
    .line 282
    iget v12, v3, La/a;->a:I

    .line 283
    .line 284
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    aput-object v12, v8, v11

    .line 289
    .line 290
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    aput-object v12, v8, v9

    .line 295
    .line 296
    const-string v9, "Query: %s, scans %s local documents and returns %s documents as results."

    .line 297
    .line 298
    invoke-static {v11, v10, v9, v8}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iget v3, v3, La/a;->a:I

    .line 302
    .line 303
    int-to-double v8, v3

    .line 304
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 305
    .line 306
    int-to-double v3, v4

    .line 307
    mul-double/2addr v3, v12

    .line 308
    cmpl-double v3, v8, v3

    .line 309
    .line 310
    if-lez v3, :cond_c

    .line 311
    .line 312
    iget-object v3, v5, Li9/d0;->b:Li9/f;

    .line 313
    .line 314
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->i()Lg9/k0;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-interface {v3, v4}, Li9/f;->m(Lg9/k0;)V

    .line 319
    .line 320
    .line 321
    new-array v3, v11, [Ljava/lang/Object;

    .line 322
    .line 323
    invoke-virtual/range {p1 .. p1}, Lg9/f0;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    aput-object v1, v3, v7

    .line 328
    .line 329
    const-string v1, "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance."

    .line 330
    .line 331
    invoke-static {v11, v10, v1, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_c
    :goto_6
    new-instance v1, Lr4/c;

    .line 335
    .line 336
    const/4 v3, 0x6

    .line 337
    invoke-direct {v1, v3, v6, v2}, Lr4/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-object v1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
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

.method public final c(Le9/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li9/n;->a:Le9/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le9/a;->m(Le9/e;)Li9/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Li9/n;->b:Li9/f;

    .line 8
    .line 9
    iget-object v1, p0, Li9/n;->a:Le9/a;

    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, Le9/a;->n(Le9/e;Li9/f;)Li9/a0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li9/n;->c:Li9/a0;

    .line 16
    .line 17
    iget-object v0, p0, Li9/n;->a:Le9/a;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Le9/a;->k(Le9/e;)Li9/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Li9/n;->d:Li9/b;

    .line 24
    .line 25
    new-instance v0, Li9/h;

    .line 26
    .line 27
    iget-object v1, p0, Li9/n;->e:Li9/g0;

    .line 28
    .line 29
    iget-object v2, p0, Li9/n;->c:Li9/a0;

    .line 30
    .line 31
    iget-object v3, p0, Li9/n;->b:Li9/f;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, p1, v3}, Li9/h;-><init>(Li9/g0;Li9/a0;Li9/b;Li9/f;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Li9/n;->f:Li9/h;

    .line 37
    .line 38
    invoke-interface {v1, v3}, Li9/g0;->e(Li9/f;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Li9/n;->g:Li9/d0;

    .line 42
    .line 43
    iget-object v0, p0, Li9/n;->f:Li9/h;

    .line 44
    .line 45
    iget-object v1, p0, Li9/n;->b:Li9/f;

    .line 46
    .line 47
    iput-object v0, p1, Li9/d0;->a:Li9/h;

    .line 48
    .line 49
    iput-object v1, p1, Li9/d0;->b:Li9/f;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p1, Li9/d0;->c:Z

    .line 53
    .line 54
    return-void
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

.method public final d(Ljava/util/Map;)Li9/n$b;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj9/i;",
            "Lj9/m;",
            ">;)",
            "Li9/n$b;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Li9/n;->e:Li9/g0;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-interface {v3, v4}, Li9/g0;->a(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Lj9/i;

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lj9/m;

    .line 57
    .line 58
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Lj9/m;

    .line 63
    .line 64
    invoke-virtual {v4}, Lj9/m;->b()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v6}, Lj9/m;->b()Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eq v7, v8, :cond_0

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {v4}, Lj9/m;->h()Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    iget-object v7, v4, Lj9/m;->d:Lj9/q;

    .line 84
    .line 85
    sget-object v8, Lj9/q;->b:Lj9/q;

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Lj9/q;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    iget-object v6, v4, Lj9/m;->b:Lj9/i;

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    iget v7, v6, Lj9/m;->c:I

    .line 100
    .line 101
    const/4 v8, 0x1

    .line 102
    invoke-static {v7, v8}, Lq0/g;->b(II)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    xor-int/2addr v7, v8

    .line 107
    const/4 v9, 0x0

    .line 108
    if-eqz v7, :cond_3

    .line 109
    .line 110
    iget-object v7, v4, Lj9/m;->d:Lj9/q;

    .line 111
    .line 112
    iget-object v10, v6, Lj9/m;->d:Lj9/q;

    .line 113
    .line 114
    invoke-virtual {v7, v10}, Lj9/q;->f(Lj9/q;)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-gtz v7, :cond_3

    .line 119
    .line 120
    iget-object v7, v4, Lj9/m;->d:Lj9/q;

    .line 121
    .line 122
    iget-object v10, v6, Lj9/m;->d:Lj9/q;

    .line 123
    .line 124
    invoke-virtual {v7, v10}, Lj9/q;->f(Lj9/q;)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_2

    .line 129
    .line 130
    invoke-virtual {v6}, Lj9/m;->e()Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_2

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    const/4 v7, 0x3

    .line 138
    new-array v7, v7, [Ljava/lang/Object;

    .line 139
    .line 140
    aput-object v5, v7, v9

    .line 141
    .line 142
    iget-object v5, v6, Lj9/m;->d:Lj9/q;

    .line 143
    .line 144
    aput-object v5, v7, v8

    .line 145
    .line 146
    const/4 v5, 0x2

    .line 147
    iget-object v4, v4, Lj9/m;->d:Lj9/q;

    .line 148
    .line 149
    aput-object v4, v7, v5

    .line 150
    .line 151
    const-string v4, "LocalStore"

    .line 152
    .line 153
    const-string v5, "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s"

    .line 154
    .line 155
    invoke-static {v8, v4, v5, v7}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_3
    :goto_1
    sget-object v6, Lj9/q;->b:Lj9/q;

    .line 160
    .line 161
    iget-object v7, v4, Lj9/m;->e:Lj9/q;

    .line 162
    .line 163
    invoke-virtual {v6, v7}, Lj9/q;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    xor-int/2addr v6, v8

    .line 168
    new-array v7, v9, [Ljava/lang/Object;

    .line 169
    .line 170
    const-string v8, "Cannot add a document when the remote version is zero"

    .line 171
    .line 172
    invoke-static {v8, v6, v7}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v6, p0, Li9/n;->e:Li9/g0;

    .line 176
    .line 177
    iget-object v7, v4, Lj9/m;->e:Lj9/q;

    .line 178
    .line 179
    invoke-interface {v6, v4, v7}, Li9/g0;->d(Lj9/m;Lj9/q;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_4
    iget-object p1, p0, Li9/n;->e:Li9/g0;

    .line 188
    .line 189
    invoke-interface {p1, v1}, Li9/g0;->b(Ljava/util/ArrayList;)V

    .line 190
    .line 191
    .line 192
    new-instance p1, Li9/n$b;

    .line 193
    .line 194
    invoke-direct {p1, v0, v2}, Li9/n$b;-><init>(Ljava/util/HashMap;Ljava/util/HashSet;)V

    .line 195
    .line 196
    .line 197
    return-object p1
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
