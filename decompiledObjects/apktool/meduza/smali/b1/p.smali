.class public final Lb1/p;
.super Lb1/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/p$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public b:Ln/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln/a<",
            "Lb1/n;",
            "Lb1/p$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lb1/k$b;

.field public final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lb1/o;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb1/k$b;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lqc/t;


# direct methods
.method public constructor <init>(Lb1/o;)V
    .locals 2

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lb1/k;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lb1/p;->a:Z

    .line 11
    .line 12
    new-instance v0, Ln/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ln/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lb1/p;->b:Ln/a;

    .line 18
    .line 19
    sget-object v0, Lb1/k$b;->b:Lb1/k$b;

    .line 20
    .line 21
    iput-object v0, p0, Lb1/p;->c:Lb1/k$b;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lb1/p;->d:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    new-instance p1, Lqc/t;

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lqc/t;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lb1/p;->i:Lqc/t;

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


# virtual methods
.method public final a(Lb1/n;)V
    .locals 6

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "addObserver"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lb1/p;->e(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb1/p;->c:Lb1/k$b;

    .line 12
    .line 13
    sget-object v1, Lb1/k$b;->a:Lb1/k$b;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Lb1/k$b;->b:Lb1/k$b;

    .line 19
    .line 20
    :goto_0
    new-instance v0, Lb1/p$a;

    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, Lb1/p$a;-><init>(Lb1/n;Lb1/k$b;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lb1/p;->b:Ln/a;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Ln/a;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lb1/p$a;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v1, p0, Lb1/p;->d:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lb1/o;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    iget v2, p0, Lb1/p;->e:I

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    iget-boolean v2, p0, Lb1/p;->f:Z

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 v2, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_1
    move v2, v3

    .line 60
    :goto_2
    invoke-virtual {p0, p1}, Lb1/p;->d(Lb1/n;)Lb1/k$b;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget v5, p0, Lb1/p;->e:I

    .line 65
    .line 66
    add-int/2addr v5, v3

    .line 67
    iput v5, p0, Lb1/p;->e:I

    .line 68
    .line 69
    :goto_3
    iget-object v3, v0, Lb1/p$a;->a:Lb1/k$b;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-gez v3, :cond_6

    .line 76
    .line 77
    iget-object v3, p0, Lb1/p;->b:Ln/a;

    .line 78
    .line 79
    iget-object v3, v3, Ln/a;->e:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v3, v0, Lb1/p$a;->a:Lb1/k$b;

    .line 88
    .line 89
    iget-object v4, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sget-object v3, Lb1/k$a;->Companion:Lb1/k$a$a;

    .line 95
    .line 96
    iget-object v4, v0, Lb1/p$a;->a:Lb1/k$b;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v4}, Lb1/k$a$a;->b(Lb1/k$b;)Lb1/k$a;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0, v1, v3}, Lb1/p$a;->a(Lb1/o;Lb1/k$a;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    add-int/lit8 v4, v4, -0x1

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lb1/p;->d(Lb1/n;)Lb1/k$b;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string v1, "no event up from "

    .line 129
    .line 130
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v0, v0, Lb1/p$a;->a:Lb1/k$b;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_6
    if-nez v2, :cond_7

    .line 148
    .line 149
    invoke-virtual {p0}, Lb1/p;->i()V

    .line 150
    .line 151
    .line 152
    :cond_7
    iget p1, p0, Lb1/p;->e:I

    .line 153
    .line 154
    add-int/lit8 p1, p1, -0x1

    .line 155
    .line 156
    iput p1, p0, Lb1/p;->e:I

    .line 157
    .line 158
    return-void
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

.method public final b()Lb1/k$b;
    .locals 1

    iget-object v0, p0, Lb1/p;->c:Lb1/k$b;

    return-object v0
.end method

.method public final c(Lb1/n;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Lb1/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lb1/p;->b:Ln/a;

    invoke-virtual {v0, p1}, Ln/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Lb1/n;)Lb1/k$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lb1/p;->b:Ln/a;

    .line 2
    .line 3
    iget-object v1, v0, Ln/a;->e:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ln/a;->e:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ln/b$c;

    .line 19
    .line 20
    iget-object p1, p1, Ln/b$c;->d:Ln/b$c;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v2

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, Ln/b$c;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lb1/p$a;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Lb1/p$a;->a:Lb1/k$b;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object p1, v2

    .line 36
    :goto_1
    iget-object v0, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    xor-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/lit8 v1, v1, -0x1

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v2, v0

    .line 59
    check-cast v2, Lb1/k$b;

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Lb1/p;->c:Lb1/k$b;

    .line 62
    .line 63
    const-string v1, "state1"

    .line 64
    .line 65
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-gez v1, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object p1, v0

    .line 78
    :goto_2
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-gez v0, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    move-object v2, p1

    .line 88
    :goto_3
    return-object v2
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

.method public final e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lb1/p;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lm/c;->v()Lm/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lm/c;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "Method "

    .line 17
    .line 18
    const-string v1, " must be called on the main thread"

    .line 19
    .line 20
    invoke-static {v0, p1, v1}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
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
.end method

.method public final f(Lb1/k$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Lb1/p;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb1/k$a;->f()Lb1/k$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb1/p;->g(Lb1/k$b;)V

    return-void
.end method

.method public final g(Lb1/k$b;)V
    .locals 5

    .line 1
    sget-object v0, Lb1/k$b;->a:Lb1/k$b;

    .line 2
    .line 3
    iget-object v1, p0, Lb1/p;->c:Lb1/k$b;

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v2, Lb1/k$b;->b:Lb1/k$b;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v1, v2, :cond_2

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v1, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_2
    :goto_0
    move v1, v4

    .line 20
    :goto_1
    if-eqz v1, :cond_6

    .line 21
    .line 22
    iput-object p1, p0, Lb1/p;->c:Lb1/k$b;

    .line 23
    .line 24
    iget-boolean p1, p0, Lb1/p;->f:Z

    .line 25
    .line 26
    if-nez p1, :cond_5

    .line 27
    .line 28
    iget p1, p0, Lb1/p;->e:I

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    iput-boolean v4, p0, Lb1/p;->f:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Lb1/p;->i()V

    .line 36
    .line 37
    .line 38
    iput-boolean v3, p0, Lb1/p;->f:Z

    .line 39
    .line 40
    iget-object p1, p0, Lb1/p;->c:Lb1/k$b;

    .line 41
    .line 42
    if-ne p1, v0, :cond_4

    .line 43
    .line 44
    new-instance p1, Ln/a;

    .line 45
    .line 46
    invoke-direct {p1}, Ln/a;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lb1/p;->b:Ln/a;

    .line 50
    .line 51
    :cond_4
    return-void

    .line 52
    :cond_5
    :goto_2
    iput-boolean v4, p0, Lb1/p;->g:Z

    .line 53
    .line 54
    return-void

    .line 55
    :cond_6
    const-string p1, "no event down from "

    .line 56
    .line 57
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p0, Lb1/p;->c:Lb1/k$b;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, " in component "

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lb1/p;->d:Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
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

.method public final h(Lb1/k$b;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, Lb1/p;->e(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lb1/p;->g(Lb1/k$b;)V

    return-void
.end method

.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, Lb1/p;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb1/o;

    .line 8
    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lb1/p;->b:Ln/a;

    .line 12
    .line 13
    iget v2, v1, Ln/b;->d:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v1, v1, Ln/b;->a:Ln/b$c;

    .line 21
    .line 22
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Ln/b$c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lb1/p$a;

    .line 28
    .line 29
    iget-object v1, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 30
    .line 31
    iget-object v2, p0, Lb1/p;->b:Ln/a;

    .line 32
    .line 33
    iget-object v2, v2, Ln/b;->b:Ln/b$c;

    .line 34
    .line 35
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v2, Ln/b$c;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lb1/p$a;

    .line 41
    .line 42
    iget-object v2, v2, Lb1/p$a;->a:Lb1/k$b;

    .line 43
    .line 44
    if-ne v1, v2, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lb1/p;->c:Lb1/k$b;

    .line 47
    .line 48
    if-ne v1, v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v3, v4

    .line 52
    :goto_0
    iput-boolean v4, p0, Lb1/p;->g:Z

    .line 53
    .line 54
    if-nez v3, :cond_8

    .line 55
    .line 56
    iget-object v1, p0, Lb1/p;->c:Lb1/k$b;

    .line 57
    .line 58
    iget-object v2, p0, Lb1/p;->b:Ln/a;

    .line 59
    .line 60
    iget-object v2, v2, Ln/b;->a:Ln/b$c;

    .line 61
    .line 62
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v2, Ln/b$c;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lb1/p$a;

    .line 68
    .line 69
    iget-object v2, v2, Lb1/p$a;->a:Lb1/k$b;

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-gez v1, :cond_5

    .line 76
    .line 77
    iget-object v1, p0, Lb1/p;->b:Ln/a;

    .line 78
    .line 79
    new-instance v2, Ln/b$b;

    .line 80
    .line 81
    iget-object v3, v1, Ln/b;->b:Ln/b$c;

    .line 82
    .line 83
    iget-object v4, v1, Ln/b;->a:Ln/b$c;

    .line 84
    .line 85
    invoke-direct {v2, v3, v4}, Ln/b$b;-><init>(Ln/b$c;Ln/b$c;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v1, Ln/b;->c:Ljava/util/WeakHashMap;

    .line 89
    .line 90
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {v2}, Ln/b$e;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-boolean v1, p0, Lb1/p;->g:Z

    .line 102
    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2}, Ln/b$e;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/util/Map$Entry;

    .line 110
    .line 111
    const-string v3, "next()"

    .line 112
    .line 113
    invoke-static {v1, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Lb1/n;

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lb1/p$a;

    .line 127
    .line 128
    :goto_1
    iget-object v4, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 129
    .line 130
    iget-object v5, p0, Lb1/p;->c:Lb1/k$b;

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-lez v4, :cond_3

    .line 137
    .line 138
    iget-boolean v4, p0, Lb1/p;->g:Z

    .line 139
    .line 140
    if-nez v4, :cond_3

    .line 141
    .line 142
    iget-object v4, p0, Lb1/p;->b:Ln/a;

    .line 143
    .line 144
    iget-object v4, v4, Ln/a;->e:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_3

    .line 151
    .line 152
    sget-object v4, Lb1/k$a;->Companion:Lb1/k$a$a;

    .line 153
    .line 154
    iget-object v5, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v5}, Lb1/k$a$a;->a(Lb1/k$b;)Lb1/k$a;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_4

    .line 164
    .line 165
    invoke-virtual {v4}, Lb1/k$a;->f()Lb1/k$b;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-object v6, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v0, v4}, Lb1/p$a;->a(Lb1/o;Lb1/k$a;)V

    .line 175
    .line 176
    .line 177
    iget-object v4, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    add-int/lit8 v5, v5, -0x1

    .line 184
    .line 185
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 190
    .line 191
    const-string v2, "no event down from "

    .line 192
    .line 193
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget-object v1, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_5
    iget-object v1, p0, Lb1/p;->b:Ln/a;

    .line 211
    .line 212
    iget-object v1, v1, Ln/b;->b:Ln/b$c;

    .line 213
    .line 214
    iget-boolean v2, p0, Lb1/p;->g:Z

    .line 215
    .line 216
    if-nez v2, :cond_0

    .line 217
    .line 218
    if-eqz v1, :cond_0

    .line 219
    .line 220
    iget-object v2, p0, Lb1/p;->c:Lb1/k$b;

    .line 221
    .line 222
    iget-object v1, v1, Ln/b$c;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Lb1/p$a;

    .line 225
    .line 226
    iget-object v1, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 227
    .line 228
    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-lez v1, :cond_0

    .line 233
    .line 234
    iget-object v1, p0, Lb1/p;->b:Ln/a;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance v2, Ln/b$d;

    .line 240
    .line 241
    invoke-direct {v2, v1}, Ln/b$d;-><init>(Ln/b;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, Ln/b;->c:Ljava/util/WeakHashMap;

    .line 245
    .line 246
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_6
    invoke-virtual {v2}, Ln/b$d;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_0

    .line 256
    .line 257
    iget-boolean v1, p0, Lb1/p;->g:Z

    .line 258
    .line 259
    if-nez v1, :cond_0

    .line 260
    .line 261
    invoke-virtual {v2}, Ln/b$d;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Ljava/util/Map$Entry;

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    check-cast v3, Lb1/n;

    .line 272
    .line 273
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, Lb1/p$a;

    .line 278
    .line 279
    :goto_2
    iget-object v4, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 280
    .line 281
    iget-object v5, p0, Lb1/p;->c:Lb1/k$b;

    .line 282
    .line 283
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    if-gez v4, :cond_6

    .line 288
    .line 289
    iget-boolean v4, p0, Lb1/p;->g:Z

    .line 290
    .line 291
    if-nez v4, :cond_6

    .line 292
    .line 293
    iget-object v4, p0, Lb1/p;->b:Ln/a;

    .line 294
    .line 295
    iget-object v4, v4, Ln/a;->e:Ljava/util/HashMap;

    .line 296
    .line 297
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_6

    .line 302
    .line 303
    iget-object v4, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 304
    .line 305
    iget-object v5, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    sget-object v4, Lb1/k$a;->Companion:Lb1/k$a$a;

    .line 311
    .line 312
    iget-object v5, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 313
    .line 314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v5}, Lb1/k$a$a;->b(Lb1/k$b;)Lb1/k$a;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    if-eqz v4, :cond_7

    .line 322
    .line 323
    invoke-virtual {v1, v0, v4}, Lb1/p$a;->a(Lb1/o;Lb1/k$a;)V

    .line 324
    .line 325
    .line 326
    iget-object v4, p0, Lb1/p;->h:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    add-int/lit8 v5, v5, -0x1

    .line 333
    .line 334
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    goto :goto_2

    .line 338
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 339
    .line 340
    const-string v2, "no event up from "

    .line 341
    .line 342
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    iget-object v1, v1, Lb1/p$a;->a:Lb1/k$b;

    .line 347
    .line 348
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0

    .line 359
    :cond_8
    iget-object v0, p0, Lb1/p;->i:Lqc/t;

    .line 360
    .line 361
    iget-object v1, p0, Lb1/p;->c:Lb1/k$b;

    .line 362
    .line 363
    invoke-virtual {v0, v1}, Lqc/t;->setValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 368
    .line 369
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 370
    .line 371
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v0
.end method
