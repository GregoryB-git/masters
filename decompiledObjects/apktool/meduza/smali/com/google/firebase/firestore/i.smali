.class public Lcom/google/firebase/firestore/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg9/f0;

.field public final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method public constructor <init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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

.method public static i(Ljava/lang/Object;Lg9/l$a;)V
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Invalid Query. A non-empty array is required for \'"

    .line 17
    .line 18
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p1, p1, Lg9/l$a;->a:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "\' filters."

    .line 25
    .line 26
    invoke-static {v0, p1, v1}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
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
.method public final a(Ljava/lang/String;Z[Ljava/lang/Object;)Lg9/e;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lg9/f0;->a:Ljava/util/List;

    .line 4
    .line 5
    array-length v1, p3

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-gt v1, v2, :cond_7

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    array-length v4, p3

    .line 20
    if-ge v3, v4, :cond_6

    .line 21
    .line 22
    aget-object v4, p3, v3

    .line 23
    .line 24
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lg9/e0;

    .line 29
    .line 30
    iget-object v5, v5, Lg9/e0;->b:Lj9/l;

    .line 31
    .line 32
    sget-object v6, Lj9/l;->b:Lj9/l;

    .line 33
    .line 34
    invoke-virtual {v5, v6}, Lj9/e;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_5

    .line 39
    .line 40
    instance-of v5, v4, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    check-cast v4, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 47
    .line 48
    iget-object v5, v5, Lg9/f0;->g:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    move v5, v2

    .line 55
    :goto_1
    if-nez v5, :cond_2

    .line 56
    .line 57
    const-string v5, "/"

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    new-instance p3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v0, "Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to "

    .line 74
    .line 75
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, "() must be a plain document ID, but \'"

    .line 82
    .line 83
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, "\' contains a slash."

    .line 90
    .line 91
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p2

    .line 102
    :cond_2
    :goto_2
    iget-object v5, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 103
    .line 104
    iget-object v5, v5, Lg9/f0;->f:Lj9/o;

    .line 105
    .line 106
    invoke-static {v4}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v5, v4}, Lj9/e;->f(Lj9/e;)Lj9/e;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Lj9/o;

    .line 115
    .line 116
    invoke-static {v4}, Lj9/i;->l(Lj9/o;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_3

    .line 121
    .line 122
    new-instance v5, Lj9/i;

    .line 123
    .line 124
    invoke-direct {v5, v4}, Lj9/i;-><init>(Lj9/o;)V

    .line 125
    .line 126
    .line 127
    iget-object v4, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 128
    .line 129
    iget-object v4, v4, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Lj9/f;

    .line 130
    .line 131
    invoke-static {v4, v5}, Lj9/s;->m(Lj9/f;Lj9/i;)Lka/d0;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 137
    .line 138
    new-instance p3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v0, "Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to "

    .line 144
    .line 145
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string p1, "() must result in a valid document path, but \'"

    .line 152
    .line 153
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string p1, "\' is not because it contains an odd number of segments."

    .line 160
    .line 161
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p2

    .line 172
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    new-instance p3, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v0, "Invalid query. Expected a string for document ID in "

    .line 180
    .line 181
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string p1, "(), but got "

    .line 188
    .line 189
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string p1, "."

    .line 196
    .line 197
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p2

    .line 208
    :cond_5
    iget-object v5, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 209
    .line 210
    iget-object v5, v5, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Ld9/y0;

    .line 211
    .line 212
    invoke-virtual {v5, v4, v2}, Ld9/y0;->e(Ljava/lang/Object;Z)Lka/d0;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    :goto_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    add-int/lit8 v3, v3, 0x1

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_6
    new-instance p1, Lg9/e;

    .line 224
    .line 225
    invoke-direct {p1, v1, p2}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 226
    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 230
    .line 231
    const-string p3, "Too many arguments provided to "

    .line 232
    .line 233
    const-string v0, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."

    .line 234
    .line 235
    invoke-static {p3, p1, v0}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw p2
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

.method public final b(Ld9/v0;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld9/v0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/firestore/k;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/firestore/i;->j()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld9/v0;->c:Ld9/v0;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 9
    .line 10
    new-instance v0, Ld9/s;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, v1}, Ld9/s;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->a(Ln9/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    sget-object v0, Ln9/f;->b:Lm/a;

    .line 23
    .line 24
    new-instance v1, Le;

    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, Le;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 42
    .line 43
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lg9/k$a;

    .line 47
    .line 48
    invoke-direct {v2}, Lg9/k$a;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    iput-boolean v3, v2, Lg9/k$a;->a:Z

    .line 53
    .line 54
    iput-boolean v3, v2, Lg9/k$a;->b:Z

    .line 55
    .line 56
    iput-boolean v3, v2, Lg9/k$a;->c:Z

    .line 57
    .line 58
    sget-object v3, Ln9/f;->b:Lm/a;

    .line 59
    .line 60
    new-instance v4, Ld9/n0;

    .line 61
    .line 62
    invoke-direct {v4, v0, v1, p1}, Ld9/n0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ld9/v0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/google/firebase/firestore/i;->j()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Ld9/o0;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {p1, v5, p0, v4}, Ld9/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Lg9/d;

    .line 75
    .line 76
    invoke-direct {v4, v3, p1}, Lg9/d;-><init>(Ljava/util/concurrent/Executor;Ld9/l;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 80
    .line 81
    new-instance v3, Ld9/p0;

    .line 82
    .line 83
    invoke-direct {v3, p0, v2, v4}, Ld9/p0;-><init>(Lcom/google/firebase/firestore/i;Lg9/k$a;Lg9/d;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->a(Ln9/i;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ld9/b0;

    .line 91
    .line 92
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
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

.method public final c(J)Lcom/google/firebase/firestore/i;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/i;

    iget-object v1, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    invoke-virtual {v1, p1, p2}, Lg9/f0;->f(J)Lg9/f0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. Query limit ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is invalid. Limit must be positive."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(J)Lcom/google/firebase/firestore/i;
    .locals 13

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/google/firebase/firestore/i;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 10
    .line 11
    new-instance v12, Lg9/f0;

    .line 12
    .line 13
    iget-object v3, v1, Lg9/f0;->f:Lj9/o;

    .line 14
    .line 15
    iget-object v4, v1, Lg9/f0;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v5, v1, Lg9/f0;->e:Ljava/util/List;

    .line 18
    .line 19
    iget-object v6, v1, Lg9/f0;->a:Ljava/util/List;

    .line 20
    .line 21
    const/4 v9, 0x2

    .line 22
    iget-object v10, v1, Lg9/f0;->j:Lg9/e;

    .line 23
    .line 24
    iget-object v11, v1, Lg9/f0;->k:Lg9/e;

    .line 25
    .line 26
    move-object v2, v12

    .line 27
    move-wide v7, p1

    .line 28
    invoke-direct/range {v2 .. v11}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 32
    .line 33
    invoke-direct {v0, v12, p1}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Invalid Query. Query limitToLast ("

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ") is invalid. Limit must be positive."

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
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

.method public final e(Ld9/n;I)Lcom/google/firebase/firestore/i;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v1, v1, Ld9/n;->a:Lj9/l;

    .line 10
    .line 11
    const-string v3, "Provided direction must not be null."

    .line 12
    .line 13
    invoke-static {v2, v3}, Lf;->o(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 17
    .line 18
    iget-object v4, v3, Lg9/f0;->j:Lg9/e;

    .line 19
    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    iget-object v4, v3, Lg9/f0;->k:Lg9/e;

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-ne v2, v4, :cond_0

    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    new-instance v5, Lcom/google/firebase/firestore/i;

    .line 33
    .line 34
    new-instance v6, Lg9/e0;

    .line 35
    .line 36
    invoke-direct {v6, v2, v1}, Lg9/e0;-><init>(ILj9/l;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lg9/f0;->e()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    xor-int/2addr v1, v4

    .line 44
    const/4 v2, 0x0

    .line 45
    new-array v2, v2, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v4, "No ordering is allowed for document query"

    .line 48
    .line 49
    invoke-static {v4, v1, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v11, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v1, v3, Lg9/f0;->a:Ljava/util/List;

    .line 55
    .line 56
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    new-instance v1, Lg9/f0;

    .line 63
    .line 64
    iget-object v8, v3, Lg9/f0;->f:Lj9/o;

    .line 65
    .line 66
    iget-object v9, v3, Lg9/f0;->g:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v10, v3, Lg9/f0;->e:Ljava/util/List;

    .line 69
    .line 70
    iget-wide v12, v3, Lg9/f0;->h:J

    .line 71
    .line 72
    iget v14, v3, Lg9/f0;->i:I

    .line 73
    .line 74
    iget-object v15, v3, Lg9/f0;->j:Lg9/e;

    .line 75
    .line 76
    iget-object v2, v3, Lg9/f0;->k:Lg9/e;

    .line 77
    .line 78
    move-object v7, v1

    .line 79
    move-object/from16 v16, v2

    .line 80
    .line 81
    invoke-direct/range {v7 .. v16}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 85
    .line 86
    invoke-direct {v5, v1, v2}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 87
    .line 88
    .line 89
    return-object v5

    .line 90
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    const-string v2, "Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy()."

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string v2, "Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy()."

    .line 101
    .line 102
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    new-instance v1, Ljava/lang/NullPointerException;

    .line 107
    .line 108
    const-string v2, "Provided field path must not be null."

    .line 109
    .line 110
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1
    .line 114
    .line 115
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/firestore/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/i;

    iget-object v1, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    iget-object v3, p1, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    invoke-virtual {v1, v3}, Lg9/f0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object p1, p1, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f(Lcom/google/firebase/firestore/e$a;)Lg9/m;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/google/firebase/firestore/e$a;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/google/firebase/firestore/e;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lcom/google/firebase/firestore/i;->h(Lcom/google/firebase/firestore/e;)Lg9/m;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lg9/m;->b()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x1

    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lg9/m;

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_2
    new-instance v1, Lg9/g;

    .line 58
    .line 59
    iget p1, p1, Lcom/google/firebase/firestore/e$a;->b:I

    .line 60
    .line 61
    invoke-direct {v1, v0, p1}, Lg9/g;-><init>(Ljava/util/List;I)V

    .line 62
    .line 63
    .line 64
    return-object v1
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

.method public final g(Ljava/lang/Object;)Lka/d0;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 14
    .line 15
    iget-object v0, v0, Lg9/f0;->g:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "/"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v1, "Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but \'"

    .line 36
    .line 37
    const-string v2, "\' contains a \'/\' character."

    .line 38
    .line 39
    invoke-static {v1, p1, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 48
    .line 49
    iget-object v0, v0, Lg9/f0;->f:Lj9/o;

    .line 50
    .line 51
    invoke-static {p1}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lj9/e;->f(Lj9/e;)Lj9/e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lj9/o;

    .line 60
    .line 61
    invoke-static {p1}, Lj9/i;->l(Lj9/o;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Lj9/f;

    .line 70
    .line 71
    new-instance v1, Lj9/i;

    .line 72
    .line 73
    invoke-direct {v1, p1}, Lj9/i;-><init>(Lj9/o;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lj9/s;->m(Lj9/f;Lj9/i;)Lka/d0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v2, "Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but \'"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v2, "\' is not because it has an odd number of segments ("

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lj9/e;->q()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ")."

    .line 109
    .line 110
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    const-string v0, "Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string."

    .line 124
    .line 125
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_5
    instance-of v0, p1, Lcom/google/firebase/firestore/c;

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    check-cast p1, Lcom/google/firebase/firestore/c;

    .line 134
    .line 135
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Lj9/f;

    .line 138
    .line 139
    iget-object p1, p1, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    .line 140
    .line 141
    invoke-static {v0, p1}, Lj9/s;->m(Lj9/f;Lj9/i;)Lka/d0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    const-string v1, "Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: "

    .line 149
    .line 150
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {p1}, Ln9/o;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0
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

.method public final h(Lcom/google/firebase/firestore/e;)Lg9/m;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/google/firebase/firestore/e$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    instance-of v3, p1, Lcom/google/firebase/firestore/e$a;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move v3, v1

    .line 15
    :goto_1
    new-array v4, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v5, "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter."

    .line 18
    .line 19
    invoke-static {v5, v3, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_b

    .line 23
    .line 24
    check-cast p1, Lcom/google/firebase/firestore/e$b;

    .line 25
    .line 26
    sget-object v0, Lg9/l$a;->q:Lg9/l$a;

    .line 27
    .line 28
    sget-object v3, Lg9/l$a;->r:Lg9/l$a;

    .line 29
    .line 30
    sget-object v4, Lg9/l$a;->s:Lg9/l$a;

    .line 31
    .line 32
    iget-object v5, p1, Lcom/google/firebase/firestore/e$b;->a:Ld9/n;

    .line 33
    .line 34
    iget-object v6, p1, Lcom/google/firebase/firestore/e$b;->b:Lg9/l$a;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/google/firebase/firestore/e$b;->c:Ljava/lang/Object;

    .line 37
    .line 38
    const-string v7, "Provided field path must not be null."

    .line 39
    .line 40
    invoke-static {v5, v7}, Lx6/b;->B(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v7, "Provided op must not be null."

    .line 44
    .line 45
    invoke-static {v6, v7}, Lx6/b;->B(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v5, Ld9/n;->a:Lj9/l;

    .line 49
    .line 50
    invoke-virtual {v7}, Lj9/l;->u()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_6

    .line 55
    .line 56
    sget-object v1, Lg9/l$a;->p:Lg9/l$a;

    .line 57
    .line 58
    if-eq v6, v1, :cond_5

    .line 59
    .line 60
    if-eq v6, v0, :cond_5

    .line 61
    .line 62
    if-eq v6, v3, :cond_3

    .line 63
    .line 64
    if-ne v6, v4, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/i;->g(Ljava/lang/Object;)Lka/d0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_5

    .line 72
    :cond_3
    :goto_2
    invoke-static {p1, v6}, Lcom/google/firebase/firestore/i;->i(Ljava/lang/Object;Lg9/l$a;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lka/b;->M()Lka/b$a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast p1, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p0, v1}, Lcom/google/firebase/firestore/i;->g(Ljava/lang/Object;)Lka/d0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 103
    .line 104
    check-cast v2, Lka/b;

    .line 105
    .line 106
    invoke-static {v2, v1}, Lka/b;->G(Lka/b;Lka/d0;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1, v0}, Lka/d0$a;->p(Lka/b$a;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lma/w$a;->k()Lma/w;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Lka/d0;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    const-string v0, "Invalid query. You can\'t perform \'"

    .line 127
    .line 128
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, v6, Lg9/l$a;->a:Ljava/lang/String;

    .line 133
    .line 134
    const-string v2, "\' queries on FieldPath.documentId()."

    .line 135
    .line 136
    invoke-static {v0, v1, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_6
    if-eq v6, v3, :cond_7

    .line 145
    .line 146
    if-eq v6, v4, :cond_7

    .line 147
    .line 148
    if-ne v6, v0, :cond_8

    .line 149
    .line 150
    :cond_7
    invoke-static {p1, v6}, Lcom/google/firebase/firestore/i;->i(Ljava/lang/Object;Lg9/l$a;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 154
    .line 155
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Ld9/y0;

    .line 156
    .line 157
    if-eq v6, v3, :cond_a

    .line 158
    .line 159
    if-ne v6, v4, :cond_9

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    move v1, v2

    .line 163
    :cond_a
    :goto_4
    invoke-virtual {v0, p1, v1}, Ld9/y0;->e(Ljava/lang/Object;Z)Lka/d0;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    :goto_5
    iget-object v0, v5, Ld9/n;->a:Lj9/l;

    .line 168
    .line 169
    invoke-static {v0, v6, p1}, Lg9/l;->e(Lj9/l;Lg9/l$a;Lka/d0;)Lg9/l;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    return-object p1

    .line 174
    :cond_b
    check-cast p1, Lcom/google/firebase/firestore/e$a;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/i;->f(Lcom/google/firebase/firestore/e$a;)Lg9/m;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1
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

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    invoke-virtual {v0}, Lg9/f0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 2
    .line 3
    iget v0, v0, Lg9/f0;->i:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 13
    .line 14
    iget-object v0, v0, Lg9/f0;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "limitToLast() queries require specifying at least one orderBy() clause"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    :goto_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final k(Lcom/google/firebase/firestore/e;)Lcom/google/firebase/firestore/i;
    .locals 13

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/i;->h(Lcom/google/firebase/firestore/e;)Lg9/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lg9/m;->b()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 17
    .line 18
    invoke-virtual {p1}, Lg9/m;->c()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_9

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lg9/l;

    .line 37
    .line 38
    iget-object v3, v2, Lg9/l;->a:Lg9/l$a;

    .line 39
    .line 40
    iget-object v4, v0, Lg9/f0;->e:Ljava/util/List;

    .line 41
    .line 42
    sget-object v5, Lg9/l$a;->e:Lg9/l$a;

    .line 43
    .line 44
    sget-object v6, Lg9/l$a;->s:Lg9/l$a;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x2

    .line 51
    const/4 v9, 0x3

    .line 52
    const/4 v10, 0x1

    .line 53
    const/4 v11, 0x0

    .line 54
    if-eq v7, v9, :cond_3

    .line 55
    .line 56
    const/4 v12, 0x7

    .line 57
    if-eq v7, v12, :cond_2

    .line 58
    .line 59
    const/16 v12, 0x8

    .line 60
    .line 61
    if-eq v7, v12, :cond_2

    .line 62
    .line 63
    const/16 v12, 0x9

    .line 64
    .line 65
    if-eq v7, v12, :cond_1

    .line 66
    .line 67
    new-instance v5, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 v7, 0x4

    .line 74
    new-array v7, v7, [Lg9/l$a;

    .line 75
    .line 76
    sget-object v12, Lg9/l$a;->q:Lg9/l$a;

    .line 77
    .line 78
    aput-object v12, v7, v11

    .line 79
    .line 80
    sget-object v11, Lg9/l$a;->r:Lg9/l$a;

    .line 81
    .line 82
    aput-object v11, v7, v10

    .line 83
    .line 84
    aput-object v6, v7, v8

    .line 85
    .line 86
    aput-object v5, v7, v9

    .line 87
    .line 88
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-array v5, v10, [Lg9/l$a;

    .line 94
    .line 95
    aput-object v6, v5, v11

    .line 96
    .line 97
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    new-array v7, v8, [Lg9/l$a;

    .line 103
    .line 104
    aput-object v5, v7, v11

    .line 105
    .line 106
    aput-object v6, v7, v10

    .line 107
    .line 108
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_6

    .line 121
    .line 122
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Lg9/m;

    .line 127
    .line 128
    invoke-virtual {v6}, Lg9/m;->c()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_4

    .line 141
    .line 142
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, Lg9/l;

    .line 147
    .line 148
    iget-object v8, v7, Lg9/l;->a:Lg9/l$a;

    .line 149
    .line 150
    invoke-interface {v5, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_5

    .line 155
    .line 156
    iget-object v4, v7, Lg9/l;->a:Lg9/l$a;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    const/4 v4, 0x0

    .line 160
    :goto_2
    if-eqz v4, :cond_8

    .line 161
    .line 162
    if-ne v4, v3, :cond_7

    .line 163
    .line 164
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    const-string v0, "Invalid Query. You cannot use more than one \'"

    .line 167
    .line 168
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v1, v3, Lg9/l$a;->a:Ljava/lang/String;

    .line 173
    .line 174
    const-string v2, "\' filter."

    .line 175
    .line 176
    invoke-static {v0, v1, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 185
    .line 186
    const-string v0, "Invalid Query. You cannot use \'"

    .line 187
    .line 188
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget-object v1, v3, Lg9/l$a;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v1, "\' filters with \'"

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget-object v1, v4, Lg9/l$a;->a:Ljava/lang/String;

    .line 203
    .line 204
    const-string v2, "\' filters."

    .line 205
    .line 206
    invoke-static {v0, v1, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1

    .line 214
    :cond_8
    invoke-virtual {v0, v2}, Lg9/f0;->b(Lg9/m;)Lg9/f0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_9
    new-instance v0, Lcom/google/firebase/firestore/i;

    .line 221
    .line 222
    iget-object v1, p0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 223
    .line 224
    invoke-virtual {v1, p1}, Lg9/f0;->b(Lg9/m;)Lg9/f0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object v1, p0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 229
    .line 230
    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 231
    .line 232
    .line 233
    return-object v0
.end method
