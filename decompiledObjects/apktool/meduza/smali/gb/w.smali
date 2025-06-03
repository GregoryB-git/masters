.class public final Lgb/w;
.super Lgb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/w$f;,
        Lgb/w$g;
    }
.end annotation


# static fields
.field public static final e:Lgb/w$a;

.field public static final f:Lgb/w$b;

.field public static final o:Lgb/w$c;

.field public static final p:Lgb/w$d;

.field public static final q:Lgb/w$e;


# instance fields
.field public final a:Ljava/util/ArrayDeque;

.field public b:Ljava/util/ArrayDeque;

.field public c:I

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb/w$a;

    invoke-direct {v0}, Lgb/w$a;-><init>()V

    sput-object v0, Lgb/w;->e:Lgb/w$a;

    new-instance v0, Lgb/w$b;

    invoke-direct {v0}, Lgb/w$b;-><init>()V

    sput-object v0, Lgb/w;->f:Lgb/w$b;

    new-instance v0, Lgb/w$c;

    invoke-direct {v0}, Lgb/w$c;-><init>()V

    sput-object v0, Lgb/w;->o:Lgb/w$c;

    new-instance v0, Lgb/w$d;

    invoke-direct {v0}, Lgb/w$d;-><init>()V

    sput-object v0, Lgb/w;->p:Lgb/w$d;

    new-instance v0, Lgb/w$e;

    invoke-direct {v0}, Lgb/w$e;-><init>()V

    sput-object v0, Lgb/w;->q:Lgb/w$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lgb/b;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lgb/b;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    iget-boolean v0, p0, Lgb/w;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    iget-object v1, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/u2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lgb/u2;->Z()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final H()V
    .locals 1

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lgb/w;->C()V

    :cond_0
    return-void
.end method

.method public final I(Lgb/w$g;ILjava/lang/Object;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgb/w$g<",
            "TT;>;ITT;I)I"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lgb/b;->f(I)V

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_1

    :cond_0
    move-object v0, p0

    :goto_0
    if-lez p2, :cond_1

    iget-object v1, v0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/u2;

    invoke-interface {v1}, Lgb/u2;->b()I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-interface {p1, v1, v2, p3, p4}, Lgb/w$g;->a(Lgb/u2;ILjava/lang/Object;I)I

    move-result p4

    sub-int/2addr p2, v2

    iget v1, v0, Lgb/w;->c:I

    sub-int/2addr v1, v2

    iput v1, v0, Lgb/w;->c:I

    :goto_1
    invoke-virtual {v0}, Lgb/w;->H()V

    goto :goto_0

    :cond_1
    if-gtz p2, :cond_2

    return p4

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Failed executing read operation"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final M(Lgb/w$f;ILjava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgb/w$f<",
            "TT;>;ITT;I)I"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lgb/w;->I(Lgb/w$g;ILjava/lang/Object;I)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final U([BII)V
    .locals 1

    sget-object v0, Lgb/w;->o:Lgb/w$c;

    invoke-virtual {p0, v0, p3, p1, p2}, Lgb/w;->M(Lgb/w$f;ILjava/lang/Object;I)I

    return-void
.end method

.method public final Z()V
    .locals 3

    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    :cond_0
    :goto_0
    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lgb/w;->d:Z

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lgb/u2;->Z()V

    :cond_2
    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lgb/w;->c:I

    return v0
.end method

.method public final close()V
    .locals 1

    :goto_0
    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    if-eqz v0, :cond_1

    :goto_1
    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lgb/w;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final g(Lgb/u2;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgb/w;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    instance-of v2, p1, Lgb/w;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lgb/w;->c:I

    .line 27
    .line 28
    invoke-interface {p1}, Lgb/u2;->b()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    add-int/2addr p1, v1

    .line 33
    iput p1, p0, Lgb/w;->c:I

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    check-cast p1, Lgb/w;

    .line 37
    .line 38
    :goto_1
    iget-object v2, p1, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iget-object v2, p1, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lgb/u2;

    .line 53
    .line 54
    iget-object v3, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget v2, p0, Lgb/w;->c:I

    .line 61
    .line 62
    iget v3, p1, Lgb/w;->c:I

    .line 63
    .line 64
    add-int/2addr v2, v3

    .line 65
    iput v2, p0, Lgb/w;->c:I

    .line 66
    .line 67
    iput v1, p1, Lgb/w;->c:I

    .line 68
    .line 69
    invoke-virtual {p1}, Lgb/w;->close()V

    .line 70
    .line 71
    .line 72
    :goto_2
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object p1, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lgb/u2;

    .line 81
    .line 82
    invoke-interface {p1}, Lgb/u2;->Z()V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
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

.method public final m0(Ljava/io/OutputStream;I)V
    .locals 2

    sget-object v0, Lgb/w;->q:Lgb/w$e;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p2, p1, v1}, Lgb/w;->I(Lgb/w$g;ILjava/lang/Object;I)I

    return-void
.end method

.method public final markSupported()Z
    .locals 2

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/u2;

    invoke-interface {v1}, Lgb/u2;->markSupported()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final r(I)Lgb/u2;
    .locals 6

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lgb/v2;->a:Lgb/v2$b;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lgb/b;->f(I)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lgb/w;->c:I

    .line 10
    .line 11
    sub-int/2addr v0, p1

    .line 12
    iput v0, p0, Lgb/w;->c:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move-object v1, v0

    .line 16
    :goto_0
    iget-object v2, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lgb/u2;

    .line 23
    .line 24
    invoke-interface {v2}, Lgb/u2;->b()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-le v3, p1, :cond_1

    .line 29
    .line 30
    invoke-interface {v2, p1}, Lgb/u2;->r(I)Lgb/u2;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v2, 0x0

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    iget-boolean v4, p0, Lgb/w;->d:Z

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v2, v3}, Lgb/u2;->r(I)Lgb/u2;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0}, Lgb/w;->C()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v2, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lgb/u2;

    .line 55
    .line 56
    :goto_1
    sub-int/2addr p1, v3

    .line 57
    move-object v5, v2

    .line 58
    move v2, p1

    .line 59
    move-object p1, v5

    .line 60
    :goto_2
    if-nez v0, :cond_3

    .line 61
    .line 62
    move-object v0, p1

    .line 63
    goto :goto_4

    .line 64
    :cond_3
    if-nez v1, :cond_5

    .line 65
    .line 66
    new-instance v1, Lgb/w;

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    iget-object v4, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    add-int/2addr v4, v3

    .line 79
    const/16 v3, 0x10

    .line 80
    .line 81
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_3
    invoke-direct {v1, v3}, Lgb/w;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, Lgb/w;->g(Lgb/u2;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v1

    .line 92
    :cond_5
    invoke-virtual {v1, p1}, Lgb/w;->g(Lgb/u2;)V

    .line 93
    .line 94
    .line 95
    :goto_4
    if-gtz v2, :cond_6

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_6
    move p1, v2

    .line 99
    goto :goto_0
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

.method public final readUnsignedByte()I
    .locals 4

    sget-object v0, Lgb/w;->e:Lgb/w$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lgb/w;->M(Lgb/w$f;ILjava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final reset()V
    .locals 3

    iget-boolean v0, p0, Lgb/w;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/u2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v1

    invoke-interface {v0}, Lgb/u2;->reset()V

    iget v2, p0, Lgb/w;->c:I

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    sub-int/2addr v0, v1

    add-int/2addr v0, v2

    move v1, v0

    move-object v0, p0

    goto :goto_1

    :cond_0
    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lgb/w;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/u2;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lgb/u2;->reset()V

    iget-object v2, v0, Lgb/w;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    iget v2, v0, Lgb/w;->c:I

    invoke-interface {v1}, Lgb/u2;->b()I

    move-result v1

    add-int/2addr v1, v2

    :goto_1
    iput v1, v0, Lgb/w;->c:I

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/nio/InvalidMarkException;

    invoke-direct {v0}, Ljava/nio/InvalidMarkException;-><init>()V

    throw v0
.end method

.method public final skipBytes(I)V
    .locals 3

    sget-object v0, Lgb/w;->f:Lgb/w$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, p1, v1, v2}, Lgb/w;->M(Lgb/w$f;ILjava/lang/Object;I)I

    return-void
.end method

.method public final v0(Ljava/nio/ByteBuffer;)V
    .locals 3

    sget-object v0, Lgb/w;->p:Lgb/w$d;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, Lgb/w;->M(Lgb/w$f;ILjava/lang/Object;I)I

    return-void
.end method
