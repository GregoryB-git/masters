.class public final Lx0/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/v;
.implements LF0/t;
.implements LB0/n$b;
.implements LB0/n$f;
.implements Lx0/P$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/K$c;,
        Lx0/K$e;,
        Lx0/K$f;,
        Lx0/K$d;,
        Lx0/K$b;
    }
.end annotation


# static fields
.field public static final c0:Ljava/util/Map;

.field public static final d0:Ld0/q;


# instance fields
.field public final A:Lx0/F;

.field public final B:Lg0/f;

.field public final C:Ljava/lang/Runnable;

.field public final D:Ljava/lang/Runnable;

.field public final E:Landroid/os/Handler;

.field public F:Lx0/v$a;

.field public G:LS0/b;

.field public H:[Lx0/P;

.field public I:[Lx0/K$e;

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Lx0/K$f;

.field public O:LF0/M;

.field public P:J

.field public Q:Z

.field public R:I

.field public S:Z

.field public T:Z

.field public U:I

.field public V:Z

.field public W:J

.field public X:J

.field public Y:Z

.field public Z:I

.field public a0:Z

.field public b0:Z

.field public final o:Landroid/net/Uri;

.field public final p:Li0/g;

.field public final q:Lp0/x;

.field public final r:LB0/m;

.field public final s:Lx0/E$a;

.field public final t:Lp0/v$a;

.field public final u:Lx0/K$c;

.field public final v:LB0/b;

.field public final w:Ljava/lang/String;

.field public final x:J

.field public final y:J

.field public final z:LB0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lx0/K;->M()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lx0/K;->c0:Ljava/util/Map;

    .line 6
    .line 7
    new-instance v0, Ld0/q$b;

    .line 8
    .line 9
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "icy"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "application/x-icy"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lx0/K;->d0:Ld0/q;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Li0/g;Lx0/F;Lp0/x;Lp0/v$a;LB0/m;Lx0/E$a;Lx0/K$c;LB0/b;Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/K;->o:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/K;->p:Li0/g;

    .line 7
    .line 8
    iput-object p4, p0, Lx0/K;->q:Lp0/x;

    .line 9
    .line 10
    iput-object p5, p0, Lx0/K;->t:Lp0/v$a;

    .line 11
    .line 12
    iput-object p6, p0, Lx0/K;->r:LB0/m;

    .line 13
    .line 14
    iput-object p7, p0, Lx0/K;->s:Lx0/E$a;

    .line 15
    .line 16
    iput-object p8, p0, Lx0/K;->u:Lx0/K$c;

    .line 17
    .line 18
    iput-object p9, p0, Lx0/K;->v:LB0/b;

    .line 19
    .line 20
    iput-object p10, p0, Lx0/K;->w:Ljava/lang/String;

    .line 21
    .line 22
    int-to-long p1, p11

    .line 23
    iput-wide p1, p0, Lx0/K;->x:J

    .line 24
    .line 25
    new-instance p1, LB0/n;

    .line 26
    .line 27
    const-string p2, "ProgressiveMediaPeriod"

    .line 28
    .line 29
    invoke-direct {p1, p2}, LB0/n;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lx0/K;->z:LB0/n;

    .line 33
    .line 34
    iput-object p3, p0, Lx0/K;->A:Lx0/F;

    .line 35
    .line 36
    iput-wide p12, p0, Lx0/K;->y:J

    .line 37
    .line 38
    new-instance p1, Lg0/f;

    .line 39
    .line 40
    invoke-direct {p1}, Lg0/f;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lx0/K;->B:Lg0/f;

    .line 44
    .line 45
    new-instance p1, Lx0/G;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lx0/G;-><init>(Lx0/K;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lx0/K;->C:Ljava/lang/Runnable;

    .line 51
    .line 52
    new-instance p1, Lx0/H;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lx0/H;-><init>(Lx0/K;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lx0/K;->D:Ljava/lang/Runnable;

    .line 58
    .line 59
    invoke-static {}, Lg0/M;->A()Landroid/os/Handler;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    new-array p2, p1, [Lx0/K$e;

    .line 67
    .line 68
    iput-object p2, p0, Lx0/K;->I:[Lx0/K$e;

    .line 69
    .line 70
    new-array p1, p1, [Lx0/P;

    .line 71
    .line 72
    iput-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 73
    .line 74
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    iput-wide p1, p0, Lx0/K;->X:J

    .line 80
    .line 81
    const/4 p1, 0x1

    .line 82
    iput p1, p0, Lx0/K;->R:I

    .line 83
    .line 84
    return-void
.end method

.method public static synthetic A(Lx0/K;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K;->D:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic B(Lx0/K;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic C(Lx0/K;Z)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx0/K;->O(Z)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic D()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lx0/K;->c0:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic E(Lx0/K;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K;->w:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic F(Lx0/K;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/K;->P:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic G(Lx0/K;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx0/K;->a0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic H(Lx0/K;)LS0/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K;->G:LS0/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic I(Lx0/K;LS0/b;)LS0/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/K;->G:LS0/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic J()Ld0/q;
    .locals 1

    .line 1
    sget-object v0, Lx0/K;->d0:Ld0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static M()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method private Q()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lx0/K;->X:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0
.end method

.method private V()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lx0/K;->b0:Z

    .line 4
    .line 5
    if-nez v2, :cond_c

    .line 6
    .line 7
    iget-boolean v2, p0, Lx0/K;->K:Z

    .line 8
    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    iget-boolean v2, p0, Lx0/K;->J:Z

    .line 12
    .line 13
    if-eqz v2, :cond_c

    .line 14
    .line 15
    iget-object v2, p0, Lx0/K;->O:LF0/M;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Lx0/K;->H:[Lx0/P;

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    move v4, v0

    .line 25
    :goto_0
    if-ge v4, v3, :cond_2

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Lx0/P;->G()Ld0/q;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    add-int/2addr v4, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v2, p0, Lx0/K;->B:Lg0/f;

    .line 39
    .line 40
    invoke-virtual {v2}, Lg0/f;->c()Z

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lx0/K;->H:[Lx0/P;

    .line 44
    .line 45
    array-length v2, v2

    .line 46
    new-array v3, v2, [Ld0/J;

    .line 47
    .line 48
    new-array v4, v2, [Z

    .line 49
    .line 50
    move v5, v0

    .line 51
    :goto_1
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-ge v5, v2, :cond_a

    .line 57
    .line 58
    iget-object v8, p0, Lx0/K;->H:[Lx0/P;

    .line 59
    .line 60
    aget-object v8, v8, v5

    .line 61
    .line 62
    invoke-virtual {v8}, Lx0/P;->G()Ld0/q;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {v8}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Ld0/q;

    .line 71
    .line 72
    iget-object v9, v8, Ld0/q;->n:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v9}, Ld0/z;->o(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-nez v10, :cond_4

    .line 79
    .line 80
    invoke-static {v9}, Ld0/z;->s(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move v11, v0

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    :goto_2
    move v11, v1

    .line 90
    :goto_3
    aput-boolean v11, v4, v5

    .line 91
    .line 92
    iget-boolean v12, p0, Lx0/K;->L:Z

    .line 93
    .line 94
    or-int/2addr v11, v12

    .line 95
    iput-boolean v11, p0, Lx0/K;->L:Z

    .line 96
    .line 97
    invoke-static {v9}, Ld0/z;->p(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    iget-wide v11, p0, Lx0/K;->y:J

    .line 102
    .line 103
    cmp-long v6, v11, v6

    .line 104
    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    if-ne v2, v1, :cond_5

    .line 108
    .line 109
    if-eqz v9, :cond_5

    .line 110
    .line 111
    move v6, v1

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    move v6, v0

    .line 114
    :goto_4
    iput-boolean v6, p0, Lx0/K;->M:Z

    .line 115
    .line 116
    iget-object v6, p0, Lx0/K;->G:LS0/b;

    .line 117
    .line 118
    if-eqz v6, :cond_9

    .line 119
    .line 120
    if-nez v10, :cond_6

    .line 121
    .line 122
    iget-object v7, p0, Lx0/K;->I:[Lx0/K$e;

    .line 123
    .line 124
    aget-object v7, v7, v5

    .line 125
    .line 126
    iget-boolean v7, v7, Lx0/K$e;->b:Z

    .line 127
    .line 128
    if-eqz v7, :cond_8

    .line 129
    .line 130
    :cond_6
    iget-object v7, v8, Ld0/q;->k:Ld0/x;

    .line 131
    .line 132
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Ld0/x;

    .line 135
    .line 136
    new-array v9, v1, [Ld0/x$b;

    .line 137
    .line 138
    aput-object v6, v9, v0

    .line 139
    .line 140
    invoke-direct {v7, v9}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_7
    new-array v9, v1, [Ld0/x$b;

    .line 145
    .line 146
    aput-object v6, v9, v0

    .line 147
    .line 148
    invoke-virtual {v7, v9}, Ld0/x;->a([Ld0/x$b;)Ld0/x;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    :goto_5
    invoke-virtual {v8}, Ld0/q;->a()Ld0/q$b;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-virtual {v8, v7}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7}, Ld0/q$b;->K()Ld0/q;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    :cond_8
    if-eqz v10, :cond_9

    .line 165
    .line 166
    iget v7, v8, Ld0/q;->g:I

    .line 167
    .line 168
    const/4 v9, -0x1

    .line 169
    if-ne v7, v9, :cond_9

    .line 170
    .line 171
    iget v7, v8, Ld0/q;->h:I

    .line 172
    .line 173
    if-ne v7, v9, :cond_9

    .line 174
    .line 175
    iget v7, v6, LS0/b;->o:I

    .line 176
    .line 177
    if-eq v7, v9, :cond_9

    .line 178
    .line 179
    invoke-virtual {v8}, Ld0/q;->a()Ld0/q$b;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    iget v6, v6, LS0/b;->o:I

    .line 184
    .line 185
    invoke-virtual {v7, v6}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v6}, Ld0/q$b;->K()Ld0/q;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    :cond_9
    iget-object v6, p0, Lx0/K;->q:Lp0/x;

    .line 194
    .line 195
    invoke-interface {v6, v8}, Lp0/x;->b(Ld0/q;)I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-virtual {v8, v6}, Ld0/q;->b(I)Ld0/q;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    new-instance v7, Ld0/J;

    .line 204
    .line 205
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    new-array v9, v1, [Ld0/q;

    .line 210
    .line 211
    aput-object v6, v9, v0

    .line 212
    .line 213
    invoke-direct {v7, v8, v9}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 214
    .line 215
    .line 216
    aput-object v7, v3, v5

    .line 217
    .line 218
    add-int/2addr v5, v1

    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :cond_a
    new-instance v0, Lx0/K$f;

    .line 222
    .line 223
    new-instance v2, Lx0/Z;

    .line 224
    .line 225
    invoke-direct {v2, v3}, Lx0/Z;-><init>([Ld0/J;)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v0, v2, v4}, Lx0/K$f;-><init>(Lx0/Z;[Z)V

    .line 229
    .line 230
    .line 231
    iput-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 232
    .line 233
    iget-boolean v0, p0, Lx0/K;->M:Z

    .line 234
    .line 235
    if-eqz v0, :cond_b

    .line 236
    .line 237
    iget-wide v2, p0, Lx0/K;->P:J

    .line 238
    .line 239
    cmp-long v0, v2, v6

    .line 240
    .line 241
    if-nez v0, :cond_b

    .line 242
    .line 243
    iget-wide v2, p0, Lx0/K;->y:J

    .line 244
    .line 245
    iput-wide v2, p0, Lx0/K;->P:J

    .line 246
    .line 247
    new-instance v0, Lx0/K$a;

    .line 248
    .line 249
    iget-object v2, p0, Lx0/K;->O:LF0/M;

    .line 250
    .line 251
    invoke-direct {v0, p0, v2}, Lx0/K$a;-><init>(Lx0/K;LF0/M;)V

    .line 252
    .line 253
    .line 254
    iput-object v0, p0, Lx0/K;->O:LF0/M;

    .line 255
    .line 256
    :cond_b
    iget-object v0, p0, Lx0/K;->u:Lx0/K$c;

    .line 257
    .line 258
    iget-wide v2, p0, Lx0/K;->P:J

    .line 259
    .line 260
    iget-object v4, p0, Lx0/K;->O:LF0/M;

    .line 261
    .line 262
    invoke-interface {v4}, LF0/M;->h()Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    iget-boolean v5, p0, Lx0/K;->Q:Z

    .line 267
    .line 268
    invoke-interface {v0, v2, v3, v4, v5}, Lx0/K$c;->q(JZZ)V

    .line 269
    .line 270
    .line 271
    iput-boolean v1, p0, Lx0/K;->K:Z

    .line 272
    .line 273
    iget-object v0, p0, Lx0/K;->F:Lx0/v$a;

    .line 274
    .line 275
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Lx0/v$a;

    .line 280
    .line 281
    invoke-interface {v0, p0}, Lx0/v$a;->k(Lx0/v;)V

    .line 282
    .line 283
    .line 284
    :cond_c
    :goto_6
    return-void
.end method

.method public static synthetic v(Lx0/K;LF0/M;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx0/K;->U(LF0/M;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Lx0/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx0/K;->V()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Lx0/K;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx0/K;->S()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Lx0/K;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx0/K;->T()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Lx0/K;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/K;->x:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public final K()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/K;->K:Z

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lx0/K;->O:LF0/M;

    .line 12
    .line 13
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final L(Lx0/K$b;I)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lx0/K;->V:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lx0/K;->O:LF0/M;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, LF0/M;->l()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-boolean p2, p0, Lx0/K;->K:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lx0/K;->l0()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Lx0/K;->Y:Z

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    iget-boolean p2, p0, Lx0/K;->K:Z

    .line 39
    .line 40
    iput-boolean p2, p0, Lx0/K;->T:Z

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    iput-wide v2, p0, Lx0/K;->W:J

    .line 45
    .line 46
    iput v0, p0, Lx0/K;->Z:I

    .line 47
    .line 48
    iget-object p2, p0, Lx0/K;->H:[Lx0/P;

    .line 49
    .line 50
    array-length v4, p2

    .line 51
    :goto_0
    if-ge v0, v4, :cond_2

    .line 52
    .line 53
    aget-object v5, p2, v0

    .line 54
    .line 55
    invoke-virtual {v5}, Lx0/P;->W()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {p1, v2, v3, v2, v3}, Lx0/K$b;->h(Lx0/K$b;JJ)V

    .line 62
    .line 63
    .line 64
    return v1

    .line 65
    :cond_3
    :goto_1
    iput p2, p0, Lx0/K;->Z:I

    .line 66
    .line 67
    return v1
.end method

.method public final N()I
    .locals 5

    .line 1
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    invoke-virtual {v4}, Lx0/P;->H()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    add-int/2addr v3, v4

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return v3
.end method

.method public final O(Z)J
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lx0/K;->H:[Lx0/P;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lx0/K;->N:Lx0/K$f;

    .line 12
    .line 13
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lx0/K$f;

    .line 18
    .line 19
    iget-object v3, v3, Lx0/K$f;->c:[Z

    .line 20
    .line 21
    aget-boolean v3, v3, v2

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v3, p0, Lx0/K;->H:[Lx0/P;

    .line 26
    .line 27
    aget-object v3, v3, v2

    .line 28
    .line 29
    invoke-virtual {v3}, Lx0/P;->A()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-wide v0
.end method

.method public P()LF0/T;
    .locals 3

    .line 1
    new-instance v0, Lx0/K$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2}, Lx0/K$e;-><init>(IZ)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lx0/K;->e0(Lx0/K$e;)LF0/T;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public R(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/K;->l0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    iget-boolean v0, p0, Lx0/K;->a0:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lx0/P;->L(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
.end method

.method public final synthetic S()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/K;->b0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx0/K;->F:Lx0/v$a;

    .line 6
    .line 7
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx0/v$a;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final synthetic T()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx0/K;->V:Z

    .line 3
    .line 4
    return-void
.end method

.method public final synthetic U(LF0/M;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx0/K;->i0(LF0/M;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final W(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 5
    .line 6
    iget-object v1, v0, Lx0/K$f;->d:[Z

    .line 7
    .line 8
    aget-boolean v2, v1, p1

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lx0/K$f;->a:Lx0/Z;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lx0/Z;->b(I)Ld0/J;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2}, Ld0/J;->a(I)Ld0/q;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-object v3, p0, Lx0/K;->s:Lx0/E$a;

    .line 24
    .line 25
    iget-object v0, v5, Ld0/q;->n:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Ld0/z;->k(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v7, 0x0

    .line 32
    iget-wide v8, p0, Lx0/K;->W:J

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-virtual/range {v3 .. v9}, Lx0/E$a;->h(ILd0/q;ILjava/lang/Object;J)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    aput-boolean v0, v1, p1

    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final X(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 5
    .line 6
    iget-object v0, v0, Lx0/K$f;->b:[Z

    .line 7
    .line 8
    iget-boolean v1, p0, Lx0/K;->Y:Z

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    aget-boolean v0, v0, p1

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 17
    .line 18
    aget-object p1, v0, p1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lx0/P;->L(Z)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-wide/16 v1, 0x0

    .line 29
    .line 30
    iput-wide v1, p0, Lx0/K;->X:J

    .line 31
    .line 32
    iput-boolean v0, p0, Lx0/K;->Y:Z

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lx0/K;->T:Z

    .line 36
    .line 37
    iput-wide v1, p0, Lx0/K;->W:J

    .line 38
    .line 39
    iput v0, p0, Lx0/K;->Z:I

    .line 40
    .line 41
    iget-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 42
    .line 43
    array-length v1, p1

    .line 44
    :goto_0
    if-ge v0, v1, :cond_1

    .line 45
    .line 46
    aget-object v2, p1, v0

    .line 47
    .line 48
    invoke-virtual {v2}, Lx0/P;->W()V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p1, p0, Lx0/K;->F:Lx0/v$a;

    .line 55
    .line 56
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lx0/v$a;

    .line 61
    .line 62
    invoke-interface {p1, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    return-void
.end method

.method public Y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/K;->r:LB0/m;

    .line 4
    .line 5
    iget v2, p0, Lx0/K;->R:I

    .line 6
    .line 7
    invoke-interface {v1, v2}, LB0/m;->d(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, LB0/n;->k(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public Z(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p1}, Lx0/P;->O()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lx0/K;->Y()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public a(II)LF0/T;
    .locals 1

    .line 1
    new-instance p2, Lx0/K$e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, Lx0/K$e;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lx0/K;->e0(Lx0/K$e;)LF0/T;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final a0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lx0/I;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lx0/I;-><init>(Lx0/K;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/n;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lx0/K;->B:Lg0/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/f;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
.end method

.method public b0(Lx0/K$b;JJZ)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    invoke-static/range {p1 .. p1}, Lx0/K$b;->d(Lx0/K$b;)Li0/x;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-instance v14, Lx0/r;

    .line 7
    .line 8
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    invoke-static/range {p1 .. p1}, Lx0/K$b;->f(Lx0/K$b;)Li0/k;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v1}, Li0/x;->r()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-virtual {v1}, Li0/x;->s()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    invoke-virtual {v1}, Li0/x;->q()J

    .line 25
    .line 26
    .line 27
    move-result-wide v12

    .line 28
    move-object v2, v14

    .line 29
    move-wide/from16 v8, p2

    .line 30
    .line 31
    move-wide/from16 v10, p4

    .line 32
    .line 33
    invoke-direct/range {v2 .. v13}, Lx0/r;-><init>(JLi0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lx0/K;->r:LB0/m;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-interface {v1, v2, v3}, LB0/m;->a(J)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, Lx0/K;->s:Lx0/E$a;

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, Lx0/K$b;->g(Lx0/K$b;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    iget-wide v11, v0, Lx0/K;->P:J

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    const/4 v5, -0x1

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v3, v14

    .line 59
    invoke-virtual/range {v2 .. v12}, Lx0/E$a;->q(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 60
    .line 61
    .line 62
    if-nez p6, :cond_1

    .line 63
    .line 64
    iget-object v1, v0, Lx0/K;->H:[Lx0/P;

    .line 65
    .line 66
    array-length v2, v1

    .line 67
    const/4 v3, 0x0

    .line 68
    :goto_0
    if-ge v3, v2, :cond_0

    .line 69
    .line 70
    aget-object v4, v1, v3

    .line 71
    .line 72
    invoke-virtual {v4}, Lx0/P;->W()V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget v1, v0, Lx0/K;->U:I

    .line 79
    .line 80
    if-lez v1, :cond_1

    .line 81
    .line 82
    iget-object v1, v0, Lx0/K;->F:Lx0/v$a;

    .line 83
    .line 84
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lx0/v$a;

    .line 89
    .line 90
    invoke-interface {v1, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx0/K;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public c0(Lx0/K$b;JJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lx0/K;->P:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, v0, Lx0/K;->O:LF0/M;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, LF0/M;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v2}, Lx0/K;->O(Z)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/high16 v5, -0x8000000000000000L

    .line 28
    .line 29
    cmp-long v5, v3, v5

    .line 30
    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-wide/16 v5, 0x2710

    .line 37
    .line 38
    add-long/2addr v3, v5

    .line 39
    :goto_0
    iput-wide v3, v0, Lx0/K;->P:J

    .line 40
    .line 41
    iget-object v5, v0, Lx0/K;->u:Lx0/K$c;

    .line 42
    .line 43
    iget-boolean v6, v0, Lx0/K;->Q:Z

    .line 44
    .line 45
    invoke-interface {v5, v3, v4, v1, v6}, Lx0/K$c;->q(JZZ)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, Lx0/K$b;->d(Lx0/K$b;)Li0/x;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v15, Lx0/r;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-static/range {p1 .. p1}, Lx0/K$b;->f(Lx0/K$b;)Li0/k;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v1}, Li0/x;->r()Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v1}, Li0/x;->s()Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v1}, Li0/x;->q()J

    .line 71
    .line 72
    .line 73
    move-result-wide v13

    .line 74
    move-object v3, v15

    .line 75
    move-wide/from16 v9, p2

    .line 76
    .line 77
    move-wide/from16 v11, p4

    .line 78
    .line 79
    invoke-direct/range {v3 .. v14}, Lx0/r;-><init>(JLi0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v0, Lx0/K;->r:LB0/m;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    invoke-interface {v1, v3, v4}, LB0/m;->a(J)V

    .line 89
    .line 90
    .line 91
    iget-object v3, v0, Lx0/K;->s:Lx0/E$a;

    .line 92
    .line 93
    invoke-static/range {p1 .. p1}, Lx0/K$b;->g(Lx0/K$b;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v10

    .line 97
    iget-wide v12, v0, Lx0/K;->P:J

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    const/4 v6, -0x1

    .line 101
    const/4 v7, 0x0

    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    move-object v4, v15

    .line 105
    invoke-virtual/range {v3 .. v13}, Lx0/E$a;->t(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 106
    .line 107
    .line 108
    iput-boolean v2, v0, Lx0/K;->a0:Z

    .line 109
    .line 110
    iget-object v1, v0, Lx0/K;->F:Lx0/v$a;

    .line 111
    .line 112
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lx0/v$a;

    .line 117
    .line 118
    invoke-interface {v1, v0}, Lx0/S$a;->e(Lx0/S;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public d(JLk0/d1;)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->O:LF0/M;

    .line 5
    .line 6
    invoke-interface {v0}, LF0/M;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_0
    iget-object v0, p0, Lx0/K;->O:LF0/M;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, LF0/M;->j(J)LF0/M$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, v0, LF0/M$a;->a:LF0/N;

    .line 22
    .line 23
    iget-wide v5, v1, LF0/N;->a:J

    .line 24
    .line 25
    iget-object v0, v0, LF0/M$a;->b:LF0/N;

    .line 26
    .line 27
    iget-wide v7, v0, LF0/N;->a:J

    .line 28
    .line 29
    move-object v2, p3

    .line 30
    move-wide v3, p1

    .line 31
    invoke-virtual/range {v2 .. v8}, Lk0/d1;->a(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    return-wide p1
.end method

.method public d0(Lx0/K$b;JJLjava/io/IOException;I)LB0/n$c;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lx0/K$b;->d(Lx0/K$b;)Li0/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v14, Lx0/r;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static/range {p1 .. p1}, Lx0/K$b;->f(Lx0/K$b;)Li0/k;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v1}, Li0/x;->r()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {v1}, Li0/x;->s()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v1}, Li0/x;->q()J

    .line 26
    .line 27
    .line 28
    move-result-wide v12

    .line 29
    move-object v2, v14

    .line 30
    move-wide/from16 v8, p2

    .line 31
    .line 32
    move-wide/from16 v10, p4

    .line 33
    .line 34
    invoke-direct/range {v2 .. v13}, Lx0/r;-><init>(JLi0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lx0/u;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lx0/K$b;->g(Lx0/K$b;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-static {v2, v3}, Lg0/M;->i1(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v21

    .line 47
    iget-wide v2, v0, Lx0/K;->P:J

    .line 48
    .line 49
    invoke-static {v2, v3}, Lg0/M;->i1(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v23

    .line 53
    const/16 v16, 0x1

    .line 54
    .line 55
    const/16 v17, -0x1

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const/16 v19, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    move-object v15, v1

    .line 64
    invoke-direct/range {v15 .. v24}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, Lx0/K;->r:LB0/m;

    .line 68
    .line 69
    new-instance v3, LB0/m$c;

    .line 70
    .line 71
    move-object/from16 v13, p6

    .line 72
    .line 73
    move/from16 v4, p7

    .line 74
    .line 75
    invoke-direct {v3, v14, v1, v13, v4}, LB0/m$c;-><init>(Lx0/r;Lx0/u;Ljava/io/IOException;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2, v3}, LB0/m;->c(LB0/m$c;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    cmp-long v3, v1, v3

    .line 88
    .line 89
    const/4 v4, 0x1

    .line 90
    if-nez v3, :cond_0

    .line 91
    .line 92
    sget-object v1, LB0/n;->g:LB0/n$c;

    .line 93
    .line 94
    move-object/from16 v15, p1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lx0/K;->N()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget v5, v0, Lx0/K;->Z:I

    .line 102
    .line 103
    if-le v3, v5, :cond_1

    .line 104
    .line 105
    move-object/from16 v15, p1

    .line 106
    .line 107
    move v5, v4

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    const/4 v5, 0x0

    .line 110
    move-object/from16 v15, p1

    .line 111
    .line 112
    :goto_0
    invoke-virtual {v0, v15, v3}, Lx0/K;->L(Lx0/K$b;I)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    invoke-static {v5, v1, v2}, LB0/n;->h(ZJ)LB0/n$c;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    sget-object v1, LB0/n;->f:LB0/n$c;

    .line 124
    .line 125
    :goto_1
    invoke-virtual {v1}, LB0/n$c;->c()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    xor-int/lit8 v16, v2, 0x1

    .line 130
    .line 131
    iget-object v2, v0, Lx0/K;->s:Lx0/E$a;

    .line 132
    .line 133
    invoke-static/range {p1 .. p1}, Lx0/K$b;->g(Lx0/K$b;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v9

    .line 137
    iget-wide v11, v0, Lx0/K;->P:J

    .line 138
    .line 139
    const/4 v4, 0x1

    .line 140
    const/4 v5, -0x1

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v7, 0x0

    .line 143
    const/4 v8, 0x0

    .line 144
    move-object v3, v14

    .line 145
    move-object/from16 v13, p6

    .line 146
    .line 147
    move/from16 v14, v16

    .line 148
    .line 149
    invoke-virtual/range {v2 .. v14}, Lx0/E$a;->v(Lx0/r;IILd0/q;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 150
    .line 151
    .line 152
    if-eqz v16, :cond_3

    .line 153
    .line 154
    iget-object v2, v0, Lx0/K;->r:LB0/m;

    .line 155
    .line 156
    invoke-static/range {p1 .. p1}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    invoke-interface {v2, v3, v4}, LB0/m;->a(J)V

    .line 161
    .line 162
    .line 163
    :cond_3
    return-object v1
.end method

.method public e(LF0/M;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lx0/J;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lx0/J;-><init>(Lx0/K;LF0/M;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e0(Lx0/K$e;)LF0/T;
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lx0/K;->I:[Lx0/K$e;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lx0/K$e;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lx0/K;->J:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "Extractor added new track (id="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget p1, p1, Lx0/K$e;->a:I

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ") after finishing tracks."

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "ProgressiveMediaPeriod"

    .line 54
    .line 55
    invoke-static {v0, p1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, LF0/n;

    .line 59
    .line 60
    invoke-direct {p1}, LF0/n;-><init>()V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_2
    iget-object v1, p0, Lx0/K;->v:LB0/b;

    .line 65
    .line 66
    iget-object v2, p0, Lx0/K;->q:Lp0/x;

    .line 67
    .line 68
    iget-object v3, p0, Lx0/K;->t:Lp0/v$a;

    .line 69
    .line 70
    invoke-static {v1, v2, v3}, Lx0/P;->k(LB0/b;Lp0/x;Lp0/v$a;)Lx0/P;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, p0}, Lx0/P;->e0(Lx0/P$d;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lx0/K;->I:[Lx0/K$e;

    .line 78
    .line 79
    add-int/lit8 v3, v0, 0x1

    .line 80
    .line 81
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, [Lx0/K$e;

    .line 86
    .line 87
    aput-object p1, v2, v0

    .line 88
    .line 89
    invoke-static {v2}, Lg0/M;->j([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, [Lx0/K$e;

    .line 94
    .line 95
    iput-object p1, p0, Lx0/K;->I:[Lx0/K$e;

    .line 96
    .line 97
    iget-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 98
    .line 99
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, [Lx0/P;

    .line 104
    .line 105
    aput-object v1, p1, v0

    .line 106
    .line 107
    invoke-static {p1}, Lg0/M;->j([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, [Lx0/P;

    .line 112
    .line 113
    iput-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 114
    .line 115
    return-object v1
.end method

.method public f()J
    .locals 11

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lx0/K;->a0:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lx0/K;->U:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-direct {p0}, Lx0/K;->Q()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lx0/K;->X:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lx0/K;->L:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lx0/K;->N:Lx0/K$f;

    .line 42
    .line 43
    iget-object v10, v9, Lx0/K$f;->b:[Z

    .line 44
    .line 45
    aget-boolean v10, v10, v6

    .line 46
    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    iget-object v9, v9, Lx0/K$f;->c:[Z

    .line 50
    .line 51
    aget-boolean v9, v9, v6

    .line 52
    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    iget-object v9, p0, Lx0/K;->H:[Lx0/P;

    .line 56
    .line 57
    aget-object v9, v9, v6

    .line 58
    .line 59
    invoke-virtual {v9}, Lx0/P;->K()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_2

    .line 64
    .line 65
    iget-object v9, p0, Lx0/K;->H:[Lx0/P;

    .line 66
    .line 67
    aget-object v9, v9, v6

    .line 68
    .line 69
    invoke-virtual {v9}, Lx0/P;->A()J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-wide v7, v4

    .line 81
    :cond_4
    cmp-long v0, v7, v4

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0, v3}, Lx0/K;->O(Z)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    :cond_5
    cmp-long v0, v7, v1

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    iget-wide v7, p0, Lx0/K;->W:J

    .line 94
    .line 95
    :cond_6
    return-wide v7

    .line 96
    :cond_7
    :goto_1
    return-wide v1
.end method

.method public f0(ILk0/v0;Lj0/i;I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx0/K;->l0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x3

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lx0/K;->W(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 13
    .line 14
    aget-object v0, v0, p1

    .line 15
    .line 16
    iget-boolean v2, p0, Lx0/K;->a0:Z

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3, p4, v2}, Lx0/P;->T(Lk0/v0;Lj0/i;IZ)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-ne p2, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lx0/K;->X(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return p2
.end method

.method public g(Lk0/y0;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, Lx0/K;->a0:Z

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Lx0/K;->z:LB0/n;

    .line 6
    .line 7
    invoke-virtual {p1}, LB0/n;->i()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    iget-boolean p1, p0, Lx0/K;->Y:Z

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    iget-boolean p1, p0, Lx0/K;->K:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget p1, p0, Lx0/K;->U:I

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lx0/K;->B:Lg0/f;

    .line 27
    .line 28
    invoke-virtual {p1}, Lg0/f;->e()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 33
    .line 34
    invoke-virtual {v0}, LB0/n;->j()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lx0/K;->k0()V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    :cond_1
    return p1

    .line 45
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public g0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx0/K;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Lx0/P;->S()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, LB0/n;->m(LB0/n$f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lx0/K;->F:Lx0/v$a;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lx0/K;->b0:Z

    .line 34
    .line 35
    return-void
.end method

.method public h(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h0([ZJ)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_3

    .line 7
    .line 8
    iget-object v3, p0, Lx0/K;->H:[Lx0/P;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    iget-boolean v4, p0, Lx0/K;->M:Z

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Lx0/P;->y()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v3, v4}, Lx0/P;->Z(I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v3, p2, p3, v1}, Lx0/P;->a0(JZ)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_1
    if-nez v3, :cond_2

    .line 30
    .line 31
    aget-boolean v3, p1, v2

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    iget-boolean v3, p0, Lx0/K;->L:Z

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    :cond_1
    return v1

    .line 40
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const/4 p1, 0x1

    .line 44
    return p1
.end method

.method public i([LA0/y;[Z[Lx0/Q;[ZJ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 5
    .line 6
    iget-object v1, v0, Lx0/K$f;->a:Lx0/Z;

    .line 7
    .line 8
    iget-object v0, v0, Lx0/K$f;->c:[Z

    .line 9
    .line 10
    iget v2, p0, Lx0/K;->U:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    array-length v5, p1

    .line 15
    const/4 v6, 0x1

    .line 16
    if-ge v4, v5, :cond_2

    .line 17
    .line 18
    aget-object v5, p3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    aget-object v7, p1, v4

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    aget-boolean v7, p2, v4

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    :cond_0
    check-cast v5, Lx0/K$d;

    .line 31
    .line 32
    invoke-static {v5}, Lx0/K$d;->b(Lx0/K$d;)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    aget-boolean v7, v0, v5

    .line 37
    .line 38
    invoke-static {v7}, Lg0/a;->f(Z)V

    .line 39
    .line 40
    .line 41
    iget v7, p0, Lx0/K;->U:I

    .line 42
    .line 43
    sub-int/2addr v7, v6

    .line 44
    iput v7, p0, Lx0/K;->U:I

    .line 45
    .line 46
    aput-boolean v3, v0, v5

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    aput-object v5, p3, v4

    .line 50
    .line 51
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget-boolean p2, p0, Lx0/K;->S:Z

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    :goto_1
    move p2, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move p2, v3

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    cmp-long p2, p5, v4

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    iget-boolean p2, p0, Lx0/K;->M:Z

    .line 71
    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :goto_2
    move v2, v3

    .line 76
    :goto_3
    array-length v4, p1

    .line 77
    if-ge v2, v4, :cond_9

    .line 78
    .line 79
    aget-object v4, p3, v2

    .line 80
    .line 81
    if-nez v4, :cond_8

    .line 82
    .line 83
    aget-object v4, p1, v2

    .line 84
    .line 85
    if-eqz v4, :cond_8

    .line 86
    .line 87
    invoke-interface {v4}, LA0/B;->length()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-ne v5, v6, :cond_5

    .line 92
    .line 93
    move v5, v6

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move v5, v3

    .line 96
    :goto_4
    invoke-static {v5}, Lg0/a;->f(Z)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v4, v3}, LA0/B;->c(I)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-nez v5, :cond_6

    .line 104
    .line 105
    move v5, v6

    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move v5, v3

    .line 108
    :goto_5
    invoke-static {v5}, Lg0/a;->f(Z)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v4}, LA0/B;->d()Ld0/J;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v1, v4}, Lx0/Z;->d(Ld0/J;)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    aget-boolean v5, v0, v4

    .line 120
    .line 121
    xor-int/2addr v5, v6

    .line 122
    invoke-static {v5}, Lg0/a;->f(Z)V

    .line 123
    .line 124
    .line 125
    iget v5, p0, Lx0/K;->U:I

    .line 126
    .line 127
    add-int/2addr v5, v6

    .line 128
    iput v5, p0, Lx0/K;->U:I

    .line 129
    .line 130
    aput-boolean v6, v0, v4

    .line 131
    .line 132
    new-instance v5, Lx0/K$d;

    .line 133
    .line 134
    invoke-direct {v5, p0, v4}, Lx0/K$d;-><init>(Lx0/K;I)V

    .line 135
    .line 136
    .line 137
    aput-object v5, p3, v2

    .line 138
    .line 139
    aput-boolean v6, p4, v2

    .line 140
    .line 141
    if-nez p2, :cond_8

    .line 142
    .line 143
    iget-object p2, p0, Lx0/K;->H:[Lx0/P;

    .line 144
    .line 145
    aget-object p2, p2, v4

    .line 146
    .line 147
    invoke-virtual {p2}, Lx0/P;->D()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    invoke-virtual {p2, p5, p6, v6}, Lx0/P;->a0(JZ)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-nez p2, :cond_7

    .line 158
    .line 159
    move p2, v6

    .line 160
    goto :goto_6

    .line 161
    :cond_7
    move p2, v3

    .line 162
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_9
    iget p1, p0, Lx0/K;->U:I

    .line 166
    .line 167
    if-nez p1, :cond_c

    .line 168
    .line 169
    iput-boolean v3, p0, Lx0/K;->Y:Z

    .line 170
    .line 171
    iput-boolean v3, p0, Lx0/K;->T:Z

    .line 172
    .line 173
    iget-object p1, p0, Lx0/K;->z:LB0/n;

    .line 174
    .line 175
    invoke-virtual {p1}, LB0/n;->j()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_b

    .line 180
    .line 181
    iget-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 182
    .line 183
    array-length p2, p1

    .line 184
    :goto_7
    if-ge v3, p2, :cond_a

    .line 185
    .line 186
    aget-object p3, p1, v3

    .line 187
    .line 188
    invoke-virtual {p3}, Lx0/P;->r()V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v3, v3, 0x1

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_a
    iget-object p1, p0, Lx0/K;->z:LB0/n;

    .line 195
    .line 196
    invoke-virtual {p1}, LB0/n;->f()V

    .line 197
    .line 198
    .line 199
    goto :goto_a

    .line 200
    :cond_b
    iput-boolean v3, p0, Lx0/K;->a0:Z

    .line 201
    .line 202
    iget-object p1, p0, Lx0/K;->H:[Lx0/P;

    .line 203
    .line 204
    array-length p2, p1

    .line 205
    :goto_8
    if-ge v3, p2, :cond_e

    .line 206
    .line 207
    aget-object p3, p1, v3

    .line 208
    .line 209
    invoke-virtual {p3}, Lx0/P;->W()V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v3, v3, 0x1

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_c
    if-eqz p2, :cond_e

    .line 216
    .line 217
    invoke-virtual {p0, p5, p6}, Lx0/K;->s(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide p5

    .line 221
    :goto_9
    array-length p1, p3

    .line 222
    if-ge v3, p1, :cond_e

    .line 223
    .line 224
    aget-object p1, p3, v3

    .line 225
    .line 226
    if-eqz p1, :cond_d

    .line 227
    .line 228
    aput-boolean v6, p4, v3

    .line 229
    .line 230
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_e
    :goto_a
    iput-boolean v6, p0, Lx0/K;->S:Z

    .line 234
    .line 235
    return-wide p5
.end method

.method public final i0(LF0/M;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lx0/K;->G:LS0/b;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, LF0/M$b;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LF0/M$b;-><init>(J)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, Lx0/K;->O:LF0/M;

    .line 18
    .line 19
    invoke-interface {p1}, LF0/M;->l()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, Lx0/K;->P:J

    .line 24
    .line 25
    iget-boolean v0, p0, Lx0/K;->V:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, LF0/M;->l()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v0, v4, v1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    iput-boolean v0, p0, Lx0/K;->Q:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x7

    .line 46
    :cond_2
    iput v3, p0, Lx0/K;->R:I

    .line 47
    .line 48
    iget-boolean v0, p0, Lx0/K;->K:Z

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lx0/K;->u:Lx0/K$c;

    .line 53
    .line 54
    iget-wide v1, p0, Lx0/K;->P:J

    .line 55
    .line 56
    invoke-interface {p1}, LF0/M;->h()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-boolean v3, p0, Lx0/K;->Q:Z

    .line 61
    .line 62
    invoke-interface {v0, v1, v2, p1, v3}, Lx0/K$c;->q(JZZ)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-direct {p0}, Lx0/K;->V()V

    .line 67
    .line 68
    .line 69
    :goto_2
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx0/K;->J:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lx0/K;->C:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public j0(IJ)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx0/K;->l0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lx0/K;->W(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 13
    .line 14
    aget-object v0, v0, p1

    .line 15
    .line 16
    iget-boolean v1, p0, Lx0/K;->a0:Z

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3, v1}, Lx0/P;->F(JZ)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {v0, p2}, Lx0/P;->f0(I)V

    .line 23
    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lx0/K;->X(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return p2
.end method

.method public k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lx0/P;->U()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lx0/K;->A:Lx0/F;

    .line 16
    .line 17
    invoke-interface {v0}, Lx0/F;->release()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final k0()V
    .locals 26

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    new-instance v8, Lx0/K$b;

    .line 4
    .line 5
    iget-object v2, v7, Lx0/K;->o:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, v7, Lx0/K;->p:Li0/g;

    .line 8
    .line 9
    iget-object v4, v7, Lx0/K;->A:Lx0/F;

    .line 10
    .line 11
    iget-object v6, v7, Lx0/K;->B:Lg0/f;

    .line 12
    .line 13
    move-object v0, v8

    .line 14
    move-object/from16 v1, p0

    .line 15
    .line 16
    move-object/from16 v5, p0

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lx0/K$b;-><init>(Lx0/K;Landroid/net/Uri;Li0/g;Lx0/F;LF0/t;Lg0/f;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, v7, Lx0/K;->K:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-direct/range {p0 .. p0}, Lx0/K;->Q()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 30
    .line 31
    .line 32
    iget-wide v0, v7, Lx0/K;->P:J

    .line 33
    .line 34
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmp-long v4, v0, v2

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    iget-wide v4, v7, Lx0/K;->X:J

    .line 44
    .line 45
    cmp-long v0, v4, v0

    .line 46
    .line 47
    if-lez v0, :cond_0

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, v7, Lx0/K;->a0:Z

    .line 51
    .line 52
    iput-wide v2, v7, Lx0/K;->X:J

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    iget-object v0, v7, Lx0/K;->O:LF0/M;

    .line 56
    .line 57
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, LF0/M;

    .line 62
    .line 63
    iget-wide v4, v7, Lx0/K;->X:J

    .line 64
    .line 65
    invoke-interface {v0, v4, v5}, LF0/M;->j(J)LF0/M$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, LF0/M$a;->a:LF0/N;

    .line 70
    .line 71
    iget-wide v0, v0, LF0/N;->b:J

    .line 72
    .line 73
    iget-wide v4, v7, Lx0/K;->X:J

    .line 74
    .line 75
    invoke-static {v8, v0, v1, v4, v5}, Lx0/K$b;->h(Lx0/K$b;JJ)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v7, Lx0/K;->H:[Lx0/P;

    .line 79
    .line 80
    array-length v1, v0

    .line 81
    const/4 v4, 0x0

    .line 82
    :goto_0
    if-ge v4, v1, :cond_1

    .line 83
    .line 84
    aget-object v5, v0, v4

    .line 85
    .line 86
    iget-wide v9, v7, Lx0/K;->X:J

    .line 87
    .line 88
    invoke-virtual {v5, v9, v10}, Lx0/P;->c0(J)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iput-wide v2, v7, Lx0/K;->X:J

    .line 95
    .line 96
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lx0/K;->N()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, v7, Lx0/K;->Z:I

    .line 101
    .line 102
    iget-object v0, v7, Lx0/K;->z:LB0/n;

    .line 103
    .line 104
    iget-object v1, v7, Lx0/K;->r:LB0/m;

    .line 105
    .line 106
    iget v2, v7, Lx0/K;->R:I

    .line 107
    .line 108
    invoke-interface {v1, v2}, LB0/m;->d(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v0, v8, v7, v1}, LB0/n;->n(LB0/n$e;LB0/n$b;I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    invoke-static {v8}, Lx0/K$b;->f(Lx0/K$b;)Li0/k;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    iget-object v15, v7, Lx0/K;->s:Lx0/E$a;

    .line 121
    .line 122
    new-instance v16, Lx0/r;

    .line 123
    .line 124
    invoke-static {v8}, Lx0/K$b;->e(Lx0/K$b;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    move-object/from16 v9, v16

    .line 129
    .line 130
    invoke-direct/range {v9 .. v14}, Lx0/r;-><init>(JLi0/k;J)V

    .line 131
    .line 132
    .line 133
    invoke-static {v8}, Lx0/K$b;->g(Lx0/K$b;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v22

    .line 137
    iget-wide v0, v7, Lx0/K;->P:J

    .line 138
    .line 139
    const/16 v17, 0x1

    .line 140
    .line 141
    const/16 v18, -0x1

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    move-wide/from16 v24, v0

    .line 150
    .line 151
    invoke-virtual/range {v15 .. v25}, Lx0/E$a;->z(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public l()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/K;->T:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lx0/K;->a0:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lx0/K;->N()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lx0/K;->Z:I

    .line 14
    .line 15
    if-le v0, v1, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lx0/K;->T:Z

    .line 19
    .line 20
    iget-wide v0, p0, Lx0/K;->W:J

    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    return-wide v0
.end method

.method public final l0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/K;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lx0/K;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    return v0
.end method

.method public m(Ld0/q;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lx0/K;->E:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Lx0/K;->C:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n()Lx0/Z;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 5
    .line 6
    iget-object v0, v0, Lx0/K$f;->a:Lx0/Z;

    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic o(LB0/n$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lx0/K$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lx0/K;->c0(Lx0/K$b;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx0/K;->Y()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lx0/K;->a0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lx0/K;->K:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public q(JZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx0/K;->M:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lx0/K;->Q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 17
    .line 18
    iget-object v0, v0, Lx0/K$f;->c:[Z

    .line 19
    .line 20
    iget-object v1, p0, Lx0/K;->H:[Lx0/P;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_2

    .line 25
    .line 26
    iget-object v3, p0, Lx0/K;->H:[Lx0/P;

    .line 27
    .line 28
    aget-object v3, v3, v2

    .line 29
    .line 30
    aget-boolean v4, v0, v2

    .line 31
    .line 32
    invoke-virtual {v3, p1, p2, p3, v4}, Lx0/P;->q(JZZ)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public bridge synthetic r(LB0/n$e;JJLjava/io/IOException;I)LB0/n$c;
    .locals 0

    .line 1
    check-cast p1, Lx0/K$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Lx0/K;->d0(Lx0/K$b;JJLjava/io/IOException;I)LB0/n$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public s(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lx0/K;->K()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/K;->N:Lx0/K$f;

    .line 5
    .line 6
    iget-object v0, v0, Lx0/K$f;->b:[Z

    .line 7
    .line 8
    iget-object v1, p0, Lx0/K;->O:LF0/M;

    .line 9
    .line 10
    invoke-interface {v1}, LF0/M;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 p1, 0x0

    .line 18
    .line 19
    :goto_0
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, Lx0/K;->T:Z

    .line 21
    .line 22
    iput-wide p1, p0, Lx0/K;->W:J

    .line 23
    .line 24
    invoke-direct {p0}, Lx0/K;->Q()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iput-wide p1, p0, Lx0/K;->X:J

    .line 31
    .line 32
    return-wide p1

    .line 33
    :cond_1
    iget v2, p0, Lx0/K;->R:I

    .line 34
    .line 35
    const/4 v3, 0x7

    .line 36
    if-eq v2, v3, :cond_3

    .line 37
    .line 38
    iget-boolean v2, p0, Lx0/K;->a0:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-object v2, p0, Lx0/K;->z:LB0/n;

    .line 43
    .line 44
    invoke-virtual {v2}, LB0/n;->j()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0, v0, p1, p2}, Lx0/K;->h0([ZJ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    return-wide p1

    .line 57
    :cond_3
    iput-boolean v1, p0, Lx0/K;->Y:Z

    .line 58
    .line 59
    iput-wide p1, p0, Lx0/K;->X:J

    .line 60
    .line 61
    iput-boolean v1, p0, Lx0/K;->a0:Z

    .line 62
    .line 63
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 64
    .line 65
    invoke-virtual {v0}, LB0/n;->j()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 72
    .line 73
    array-length v2, v0

    .line 74
    :goto_1
    if-ge v1, v2, :cond_4

    .line 75
    .line 76
    aget-object v3, v0, v1

    .line 77
    .line 78
    invoke-virtual {v3}, Lx0/P;->r()V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 85
    .line 86
    invoke-virtual {v0}, LB0/n;->f()V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    iget-object v0, p0, Lx0/K;->z:LB0/n;

    .line 91
    .line 92
    invoke-virtual {v0}, LB0/n;->g()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lx0/K;->H:[Lx0/P;

    .line 96
    .line 97
    array-length v2, v0

    .line 98
    :goto_2
    if-ge v1, v2, :cond_6

    .line 99
    .line 100
    aget-object v3, v0, v1

    .line 101
    .line 102
    invoke-virtual {v3}, Lx0/P;->W()V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    :goto_3
    return-wide p1
.end method

.method public bridge synthetic t(LB0/n$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lx0/K$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lx0/K;->b0(Lx0/K$b;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(Lx0/v$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/K;->F:Lx0/v$a;

    .line 2
    .line 3
    iget-object p1, p0, Lx0/K;->B:Lg0/f;

    .line 4
    .line 5
    invoke-virtual {p1}, Lg0/f;->e()Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lx0/K;->k0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
