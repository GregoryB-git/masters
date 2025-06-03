.class public LZ0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ0/h$b;,
        LZ0/h$a;
    }
.end annotation


# static fields
.field public static final K:LF0/x;

.field public static final L:[B

.field public static final M:Ld0/q;


# instance fields
.field public A:J

.field public B:LZ0/h$b;

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:LF0/t;

.field public H:[LF0/T;

.field public I:[LF0/T;

.field public J:Z

.field public final a:Lc1/t$a;

.field public final b:I

.field public final c:LZ0/s;

.field public final d:Ljava/util/List;

.field public final e:Landroid/util/SparseArray;

.field public final f:Lg0/z;

.field public final g:Lg0/z;

.field public final h:Lg0/z;

.field public final i:[B

.field public final j:Lg0/z;

.field public final k:Lg0/E;

.field public final l:LQ0/c;

.field public final m:Lg0/z;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:Ljava/util/ArrayDeque;

.field public final p:LF0/T;

.field public q:LX2/v;

.field public r:I

.field public s:I

.field public t:J

.field public u:I

.field public v:Lg0/z;

.field public w:J

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ0/f;

    .line 2
    .line 3
    invoke-direct {v0}, LZ0/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ0/h;->K:LF0/x;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, LZ0/h;->L:[B

    .line 16
    .line 17
    new-instance v0, Ld0/q$b;

    .line 18
    .line 19
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "application/x-emsg"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, LZ0/h;->M:Ld0/q;

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Lc1/t$a;I)V
    .locals 7

    .line 1
    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, LZ0/h;-><init>(Lc1/t$a;ILg0/E;LZ0/s;Ljava/util/List;LF0/T;)V

    return-void
.end method

.method public constructor <init>(Lc1/t$a;ILg0/E;LZ0/s;Ljava/util/List;LF0/T;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ0/h;->a:Lc1/t$a;

    iput p2, p0, LZ0/h;->b:I

    iput-object p3, p0, LZ0/h;->k:Lg0/E;

    iput-object p4, p0, LZ0/h;->c:LZ0/s;

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LZ0/h;->d:Ljava/util/List;

    iput-object p6, p0, LZ0/h;->p:LF0/T;

    new-instance p1, LQ0/c;

    invoke-direct {p1}, LQ0/c;-><init>()V

    iput-object p1, p0, LZ0/h;->l:LQ0/c;

    new-instance p1, Lg0/z;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LZ0/h;->m:Lg0/z;

    new-instance p1, Lg0/z;

    sget-object p3, Lh0/d;->a:[B

    invoke-direct {p1, p3}, Lg0/z;-><init>([B)V

    iput-object p1, p0, LZ0/h;->f:Lg0/z;

    new-instance p1, Lg0/z;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LZ0/h;->g:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    iput-object p1, p0, LZ0/h;->h:Lg0/z;

    new-array p1, p2, [B

    iput-object p1, p0, LZ0/h;->i:[B

    new-instance p2, Lg0/z;

    invoke-direct {p2, p1}, Lg0/z;-><init>([B)V

    iput-object p2, p0, LZ0/h;->j:Lg0/z;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LZ0/h;->o:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LZ0/h;->e:Landroid/util/SparseArray;

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object p1

    iput-object p1, p0, LZ0/h;->q:LX2/v;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, LZ0/h;->z:J

    iput-wide p1, p0, LZ0/h;->y:J

    iput-wide p1, p0, LZ0/h;->A:J

    sget-object p1, LF0/t;->a:LF0/t;

    iput-object p1, p0, LZ0/h;->G:LF0/t;

    const/4 p1, 0x0

    new-array p2, p1, [LF0/T;

    iput-object p2, p0, LZ0/h;->H:[LF0/T;

    new-array p1, p1, [LF0/T;

    iput-object p1, p0, LZ0/h;->I:[LF0/T;

    return-void
.end method

.method public static A(LZ0/t;Lg0/z;LZ0/u;)V
    .locals 7

    .line 1
    iget p0, p0, LZ0/t;->d:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lg0/z;->p()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, LZ0/a;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    and-int/2addr v1, v2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lg0/z;->K()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v3, p2, LZ0/u;->f:I

    .line 32
    .line 33
    if-gt v1, v3, :cond_6

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p2, LZ0/u;->m:[Z

    .line 39
    .line 40
    move v4, v3

    .line 41
    move v5, v4

    .line 42
    :goto_0
    if-ge v4, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v5, v6

    .line 49
    if-le v6, p0, :cond_1

    .line 50
    .line 51
    move v6, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v6, v3

    .line 54
    :goto_1
    aput-boolean v6, v0, v4

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    if-le v0, p0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v2, v3

    .line 63
    :goto_2
    mul-int v5, v0, v1

    .line 64
    .line 65
    iget-object p0, p2, LZ0/u;->m:[Z

    .line 66
    .line 67
    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object p0, p2, LZ0/u;->m:[Z

    .line 71
    .line 72
    iget p1, p2, LZ0/u;->f:I

    .line 73
    .line 74
    invoke-static {p0, v1, p1, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 75
    .line 76
    .line 77
    if-lez v5, :cond_5

    .line 78
    .line 79
    invoke-virtual {p2, v5}, LZ0/u;->d(I)V

    .line 80
    .line 81
    .line 82
    :cond_5
    return-void

    .line 83
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string p1, "Saiz sample count "

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " is greater than fragment sample count"

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget p1, p2, LZ0/u;->f:I

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 p1, 0x0

    .line 111
    invoke-static {p0, p1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0
.end method

.method public static B(LZ0/a$a;Ljava/lang/String;LZ0/u;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v5, v2

    .line 8
    move-object v6, v5

    .line 9
    move v4, v3

    .line 10
    :goto_0
    iget-object v7, v0, LZ0/a$a;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    if-ge v4, v7, :cond_2

    .line 17
    .line 18
    iget-object v7, v0, LZ0/a$a;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, LZ0/a$b;

    .line 25
    .line 26
    iget-object v8, v7, LZ0/a$b;->b:Lg0/z;

    .line 27
    .line 28
    iget v7, v7, LZ0/a;->a:I

    .line 29
    .line 30
    const v9, 0x73626770

    .line 31
    .line 32
    .line 33
    const v10, 0x73656967

    .line 34
    .line 35
    .line 36
    const/16 v11, 0xc

    .line 37
    .line 38
    if-ne v7, v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v8, v11}, Lg0/z;->T(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Lg0/z;->p()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ne v7, v10, :cond_1

    .line 48
    .line 49
    move-object v5, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const v9, 0x73677064

    .line 52
    .line 53
    .line 54
    if-ne v7, v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Lg0/z;->T(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Lg0/z;->p()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-ne v7, v10, :cond_1

    .line 64
    .line 65
    move-object v6, v8

    .line 66
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-eqz v5, :cond_d

    .line 70
    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_3
    const/16 v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v5, v0}, Lg0/z;->T(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lg0/z;->p()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, LZ0/a;->c(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x4

    .line 89
    invoke-virtual {v5, v7}, Lg0/z;->U(I)V

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    if-ne v4, v8, :cond_4

    .line 94
    .line 95
    invoke-virtual {v5, v7}, Lg0/z;->U(I)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {v5}, Lg0/z;->p()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v8, :cond_c

    .line 103
    .line 104
    invoke-virtual {v6, v0}, Lg0/z;->T(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lg0/z;->p()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, LZ0/a;->c(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v6, v7}, Lg0/z;->U(I)V

    .line 116
    .line 117
    .line 118
    if-ne v0, v8, :cond_6

    .line 119
    .line 120
    invoke-virtual {v6}, Lg0/z;->I()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const-wide/16 v9, 0x0

    .line 125
    .line 126
    cmp-long v0, v4, v9

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 132
    .line 133
    invoke-static {v0}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_6
    const/4 v4, 0x2

    .line 139
    if-lt v0, v4, :cond_7

    .line 140
    .line 141
    invoke-virtual {v6, v7}, Lg0/z;->U(I)V

    .line 142
    .line 143
    .line 144
    :cond_7
    :goto_2
    invoke-virtual {v6}, Lg0/z;->I()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    const-wide/16 v9, 0x1

    .line 149
    .line 150
    cmp-long v0, v4, v9

    .line 151
    .line 152
    if-nez v0, :cond_b

    .line 153
    .line 154
    invoke-virtual {v6, v8}, Lg0/z;->U(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lg0/z;->G()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    and-int/lit16 v4, v0, 0xf0

    .line 162
    .line 163
    shr-int/lit8 v14, v4, 0x4

    .line 164
    .line 165
    and-int/lit8 v15, v0, 0xf

    .line 166
    .line 167
    invoke-virtual {v6}, Lg0/z;->G()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-ne v0, v8, :cond_8

    .line 172
    .line 173
    move v10, v8

    .line 174
    goto :goto_3

    .line 175
    :cond_8
    move v10, v3

    .line 176
    :goto_3
    if-nez v10, :cond_9

    .line 177
    .line 178
    return-void

    .line 179
    :cond_9
    invoke-virtual {v6}, Lg0/z;->G()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    const/16 v0, 0x10

    .line 184
    .line 185
    new-array v13, v0, [B

    .line 186
    .line 187
    invoke-virtual {v6, v13, v3, v0}, Lg0/z;->l([BII)V

    .line 188
    .line 189
    .line 190
    if-nez v12, :cond_a

    .line 191
    .line 192
    invoke-virtual {v6}, Lg0/z;->G()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    new-array v2, v0, [B

    .line 197
    .line 198
    invoke-virtual {v6, v2, v3, v0}, Lg0/z;->l([BII)V

    .line 199
    .line 200
    .line 201
    :cond_a
    move-object/from16 v16, v2

    .line 202
    .line 203
    iput-boolean v8, v1, LZ0/u;->l:Z

    .line 204
    .line 205
    new-instance v0, LZ0/t;

    .line 206
    .line 207
    move-object v9, v0

    .line 208
    move-object/from16 v11, p1

    .line 209
    .line 210
    invoke-direct/range {v9 .. v16}, LZ0/t;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 211
    .line 212
    .line 213
    iput-object v0, v1, LZ0/u;->n:LZ0/t;

    .line 214
    .line 215
    return-void

    .line 216
    :cond_b
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 217
    .line 218
    invoke-static {v0}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    throw v0

    .line 223
    :cond_c
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 224
    .line 225
    invoke-static {v0}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    throw v0

    .line 230
    :cond_d
    :goto_4
    return-void
.end method

.method public static C(Lg0/z;ILZ0/u;)V
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, LZ0/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    and-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    and-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, v0

    .line 26
    :goto_0
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object p0, p2, LZ0/u;->m:[Z

    .line 33
    .line 34
    iget p1, p2, LZ0/u;->f:I

    .line 35
    .line 36
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget v2, p2, LZ0/u;->f:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p2, LZ0/u;->m:[Z

    .line 45
    .line 46
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lg0/z;->a()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2, p1}, LZ0/u;->d(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, LZ0/u;->b(Lg0/z;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p1, "Senc sample count "

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " is different from fragment sample count"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p1, p2, LZ0/u;->f:I

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-static {p0, p1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 94
    .line 95
    invoke-static {p0}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    throw p0
.end method

.method public static D(Lg0/z;LZ0/u;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, LZ0/h;->C(Lg0/z;ILZ0/u;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static E(Lg0/z;J)Landroid/util/Pair;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, LZ0/a;->c(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lg0/z;->U(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 21
    .line 22
    .line 23
    move-result-wide v9

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, p1, v5

    .line 35
    .line 36
    move-wide v11, v3

    .line 37
    move-wide v13, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lg0/z;->L()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual/range {p0 .. p0}, Lg0/z;->L()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    goto :goto_0

    .line 48
    :goto_1
    const-wide/32 v5, 0xf4240

    .line 49
    .line 50
    .line 51
    move-wide v3, v11

    .line 52
    move-wide v7, v9

    .line 53
    invoke-static/range {v3 .. v8}, Lg0/M;->W0(JJJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v15

    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    new-array v7, v1, [I

    .line 66
    .line 67
    new-array v8, v1, [J

    .line 68
    .line 69
    new-array v5, v1, [J

    .line 70
    .line 71
    new-array v6, v1, [J

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    move-wide/from16 v17, v15

    .line 75
    .line 76
    move-wide/from16 v23, v11

    .line 77
    .line 78
    move v11, v3

    .line 79
    move-wide/from16 v3, v23

    .line 80
    .line 81
    :goto_2
    if-ge v11, v1, :cond_2

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    const/high16 v19, -0x80000000

    .line 88
    .line 89
    and-int v19, v12, v19

    .line 90
    .line 91
    if-nez v19, :cond_1

    .line 92
    .line 93
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 94
    .line 95
    .line 96
    move-result-wide v19

    .line 97
    const v21, 0x7fffffff

    .line 98
    .line 99
    .line 100
    and-int v12, v12, v21

    .line 101
    .line 102
    aput v12, v7, v11

    .line 103
    .line 104
    aput-wide v13, v8, v11

    .line 105
    .line 106
    aput-wide v17, v6, v11

    .line 107
    .line 108
    add-long v17, v3, v19

    .line 109
    .line 110
    const-wide/32 v19, 0xf4240

    .line 111
    .line 112
    .line 113
    move-wide/from16 v3, v17

    .line 114
    .line 115
    move-object v12, v5

    .line 116
    move-object v2, v6

    .line 117
    move-wide/from16 v5, v19

    .line 118
    .line 119
    move/from16 p1, v1

    .line 120
    .line 121
    move-object v1, v7

    .line 122
    move-object/from16 v22, v8

    .line 123
    .line 124
    move-wide v7, v9

    .line 125
    invoke-static/range {v3 .. v8}, Lg0/M;->W0(JJJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v3

    .line 129
    aget-wide v5, v2, v11

    .line 130
    .line 131
    sub-long v5, v3, v5

    .line 132
    .line 133
    aput-wide v5, v12, v11

    .line 134
    .line 135
    const/4 v5, 0x4

    .line 136
    invoke-virtual {v0, v5}, Lg0/z;->U(I)V

    .line 137
    .line 138
    .line 139
    aget v6, v1, v11

    .line 140
    .line 141
    int-to-long v6, v6

    .line 142
    add-long/2addr v13, v6

    .line 143
    add-int/lit8 v11, v11, 0x1

    .line 144
    .line 145
    move-object v7, v1

    .line 146
    move-object v6, v2

    .line 147
    move v2, v5

    .line 148
    move-object v5, v12

    .line 149
    move-object/from16 v8, v22

    .line 150
    .line 151
    move/from16 v1, p1

    .line 152
    .line 153
    move-wide/from16 v23, v3

    .line 154
    .line 155
    move-wide/from16 v3, v17

    .line 156
    .line 157
    move-wide/from16 v17, v23

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 161
    .line 162
    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    throw v0

    .line 168
    :cond_2
    move-object v12, v5

    .line 169
    move-object v2, v6

    .line 170
    move-object v1, v7

    .line 171
    move-object/from16 v22, v8

    .line 172
    .line 173
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-instance v3, LF0/h;

    .line 178
    .line 179
    move-object/from16 v4, v22

    .line 180
    .line 181
    invoke-direct {v3, v1, v4, v12, v2}, LF0/h;-><init>([I[J[J[J)V

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0
.end method

.method public static F(Lg0/z;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LZ0/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    :goto_0
    return-wide v0
.end method

.method public static G(Lg0/z;Landroid/util/SparseArray;Z)LZ0/h$b;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LZ0/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    check-cast p1, LZ0/h$b;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    and-int/lit8 p2, v0, 0x1

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object p2, p1, LZ0/h$b;->b:LZ0/u;

    .line 46
    .line 47
    iput-wide v1, p2, LZ0/u;->c:J

    .line 48
    .line 49
    iput-wide v1, p2, LZ0/u;->d:J

    .line 50
    .line 51
    :cond_2
    iget-object p2, p1, LZ0/h$b;->e:LZ0/d;

    .line 52
    .line 53
    and-int/lit8 v1, v0, 0x2

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget v1, p2, LZ0/d;->a:I

    .line 65
    .line 66
    :goto_2
    and-int/lit8 v2, v0, 0x8

    .line 67
    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget v2, p2, LZ0/d;->b:I

    .line 76
    .line 77
    :goto_3
    and-int/lit8 v3, v0, 0x10

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    goto :goto_4

    .line 86
    :cond_5
    iget v3, p2, LZ0/d;->c:I

    .line 87
    .line 88
    :goto_4
    and-int/lit8 v0, v0, 0x20

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    iget p0, p2, LZ0/d;->d:I

    .line 98
    .line 99
    :goto_5
    iget-object p2, p1, LZ0/h$b;->b:LZ0/u;

    .line 100
    .line 101
    new-instance v0, LZ0/d;

    .line 102
    .line 103
    invoke-direct {v0, v1, v2, v3, p0}, LZ0/d;-><init>(IIII)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p2, LZ0/u;->a:LZ0/d;

    .line 107
    .line 108
    return-object p1
.end method

.method public static H(LZ0/a$a;Landroid/util/SparseArray;ZI[B)V
    .locals 6

    .line 1
    const v0, 0x74666864

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LZ0/a$b;

    .line 13
    .line 14
    iget-object v0, v0, LZ0/a$b;->b:Lg0/z;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, LZ0/h;->G(Lg0/z;Landroid/util/SparseArray;Z)LZ0/h$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p2, p1, LZ0/h$b;->b:LZ0/u;

    .line 24
    .line 25
    iget-wide v0, p2, LZ0/u;->q:J

    .line 26
    .line 27
    iget-boolean v2, p2, LZ0/u;->r:Z

    .line 28
    .line 29
    invoke-virtual {p1}, LZ0/h$b;->k()V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {p1, v3}, LZ0/h$b;->b(LZ0/h$b;Z)Z

    .line 34
    .line 35
    .line 36
    const v4, 0x74666474

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v4}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    and-int/lit8 v5, p3, 0x2

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    iget-object v0, v4, LZ0/a$b;->b:Lg0/z;

    .line 50
    .line 51
    invoke-static {v0}, LZ0/h;->F(Lg0/z;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    iput-wide v0, p2, LZ0/u;->q:J

    .line 56
    .line 57
    iput-boolean v3, p2, LZ0/u;->r:Z

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iput-wide v0, p2, LZ0/u;->q:J

    .line 61
    .line 62
    iput-boolean v2, p2, LZ0/u;->r:Z

    .line 63
    .line 64
    :goto_0
    invoke-static {p0, p1, p3}, LZ0/h;->K(LZ0/a$a;LZ0/h$b;I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, LZ0/h$b;->d:LZ0/v;

    .line 68
    .line 69
    iget-object p1, p1, LZ0/v;->a:LZ0/s;

    .line 70
    .line 71
    iget-object p3, p2, LZ0/u;->a:LZ0/d;

    .line 72
    .line 73
    invoke-static {p3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, LZ0/d;

    .line 78
    .line 79
    iget p3, p3, LZ0/d;->a:I

    .line 80
    .line 81
    invoke-virtual {p1, p3}, LZ0/s;->a(I)LZ0/t;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const p3, 0x7361697a

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p3}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    if-eqz p3, :cond_2

    .line 93
    .line 94
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, LZ0/t;

    .line 99
    .line 100
    iget-object p3, p3, LZ0/a$b;->b:Lg0/z;

    .line 101
    .line 102
    invoke-static {v0, p3, p2}, LZ0/h;->A(LZ0/t;Lg0/z;LZ0/u;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    const p3, 0x7361696f

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p3}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    if-eqz p3, :cond_3

    .line 113
    .line 114
    iget-object p3, p3, LZ0/a$b;->b:Lg0/z;

    .line 115
    .line 116
    invoke-static {p3, p2}, LZ0/h;->z(Lg0/z;LZ0/u;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    const p3, 0x73656e63

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p3}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    if-eqz p3, :cond_4

    .line 127
    .line 128
    iget-object p3, p3, LZ0/a$b;->b:Lg0/z;

    .line 129
    .line 130
    invoke-static {p3, p2}, LZ0/h;->D(Lg0/z;LZ0/u;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    if-eqz p1, :cond_5

    .line 134
    .line 135
    iget-object p1, p1, LZ0/t;->b:Ljava/lang/String;

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    const/4 p1, 0x0

    .line 139
    :goto_1
    invoke-static {p0, p1, p2}, LZ0/h;->B(LZ0/a$a;Ljava/lang/String;LZ0/u;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, LZ0/a$a;->c:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    const/4 p3, 0x0

    .line 149
    :goto_2
    if-ge p3, p1, :cond_7

    .line 150
    .line 151
    iget-object v0, p0, LZ0/a$a;->c:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, LZ0/a$b;

    .line 158
    .line 159
    iget v1, v0, LZ0/a;->a:I

    .line 160
    .line 161
    const v2, 0x75756964

    .line 162
    .line 163
    .line 164
    if-ne v1, v2, :cond_6

    .line 165
    .line 166
    iget-object v0, v0, LZ0/a$b;->b:Lg0/z;

    .line 167
    .line 168
    invoke-static {v0, p2, p4}, LZ0/h;->L(Lg0/z;LZ0/u;[B)V

    .line 169
    .line 170
    .line 171
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    return-void
.end method

.method public static I(Lg0/z;)Landroid/util/Pair;
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, LZ0/d;

    .line 33
    .line 34
    invoke-direct {v4, v1, v2, v3, p0}, LZ0/d;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static J(LZ0/h$b;IILg0/z;I)I
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lg0/z;->T(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, LZ0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, v0, LZ0/h$b;->d:LZ0/v;

    .line 19
    .line 20
    iget-object v3, v3, LZ0/v;->a:LZ0/s;

    .line 21
    .line 22
    iget-object v4, v0, LZ0/h$b;->b:LZ0/u;

    .line 23
    .line 24
    iget-object v5, v4, LZ0/u;->a:LZ0/d;

    .line 25
    .line 26
    invoke-static {v5}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, LZ0/d;

    .line 31
    .line 32
    iget-object v6, v4, LZ0/u;->h:[I

    .line 33
    .line 34
    invoke-virtual/range {p3 .. p3}, Lg0/z;->K()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    aput v7, v6, p1

    .line 39
    .line 40
    iget-object v6, v4, LZ0/u;->g:[J

    .line 41
    .line 42
    iget-wide v7, v4, LZ0/u;->c:J

    .line 43
    .line 44
    aput-wide v7, v6, p1

    .line 45
    .line 46
    and-int/lit8 v9, v1, 0x1

    .line 47
    .line 48
    if-eqz v9, :cond_0

    .line 49
    .line 50
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    int-to-long v9, v9

    .line 55
    add-long/2addr v7, v9

    .line 56
    aput-wide v7, v6, p1

    .line 57
    .line 58
    :cond_0
    and-int/lit8 v6, v1, 0x4

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v6, v7

    .line 66
    :goto_0
    iget v9, v5, LZ0/d;->d:I

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    :cond_2
    and-int/lit16 v10, v1, 0x100

    .line 75
    .line 76
    if-eqz v10, :cond_3

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move v10, v7

    .line 81
    :goto_1
    and-int/lit16 v11, v1, 0x200

    .line 82
    .line 83
    if-eqz v11, :cond_4

    .line 84
    .line 85
    const/4 v11, 0x1

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v11, v7

    .line 88
    :goto_2
    and-int/lit16 v12, v1, 0x400

    .line 89
    .line 90
    if-eqz v12, :cond_5

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move v12, v7

    .line 95
    :goto_3
    and-int/lit16 v1, v1, 0x800

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move v1, v7

    .line 102
    :goto_4
    invoke-static {v3}, LZ0/h;->o(LZ0/s;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_7

    .line 107
    .line 108
    iget-object v13, v3, LZ0/s;->i:[J

    .line 109
    .line 110
    invoke-static {v13}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    check-cast v13, [J

    .line 115
    .line 116
    aget-wide v14, v13, v7

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    const-wide/16 v14, 0x0

    .line 120
    .line 121
    :goto_5
    iget-object v13, v4, LZ0/u;->i:[I

    .line 122
    .line 123
    iget-object v7, v4, LZ0/u;->j:[J

    .line 124
    .line 125
    iget-object v8, v4, LZ0/u;->k:[Z

    .line 126
    .line 127
    iget v2, v3, LZ0/s;->b:I

    .line 128
    .line 129
    move/from16 v16, v9

    .line 130
    .line 131
    const/4 v9, 0x2

    .line 132
    if-ne v2, v9, :cond_8

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    and-int/lit8 v9, p2, 0x1

    .line 136
    .line 137
    if-eqz v9, :cond_8

    .line 138
    .line 139
    const/4 v2, 0x1

    .line 140
    goto :goto_6

    .line 141
    :cond_8
    const/4 v2, 0x0

    .line 142
    :goto_6
    iget-object v9, v4, LZ0/u;->h:[I

    .line 143
    .line 144
    aget v9, v9, p1

    .line 145
    .line 146
    add-int v9, p4, v9

    .line 147
    .line 148
    move/from16 p2, v2

    .line 149
    .line 150
    iget-wide v2, v3, LZ0/s;->c:J

    .line 151
    .line 152
    move-object/from16 v23, v7

    .line 153
    .line 154
    move-object/from16 v24, v8

    .line 155
    .line 156
    iget-wide v7, v4, LZ0/u;->q:J

    .line 157
    .line 158
    move-wide/from16 v25, v2

    .line 159
    .line 160
    move-wide v2, v7

    .line 161
    move/from16 v7, p4

    .line 162
    .line 163
    :goto_7
    if-ge v7, v9, :cond_11

    .line 164
    .line 165
    if-eqz v10, :cond_9

    .line 166
    .line 167
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    goto :goto_8

    .line 172
    :cond_9
    iget v8, v5, LZ0/d;->b:I

    .line 173
    .line 174
    :goto_8
    invoke-static {v8}, LZ0/h;->f(I)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v11, :cond_a

    .line 179
    .line 180
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 181
    .line 182
    .line 183
    move-result v17

    .line 184
    move/from16 v27, v10

    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_a
    move/from16 v27, v10

    .line 188
    .line 189
    iget v10, v5, LZ0/d;->c:I

    .line 190
    .line 191
    move/from16 v17, v10

    .line 192
    .line 193
    :goto_9
    invoke-static/range {v17 .. v17}, LZ0/h;->f(I)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v12, :cond_b

    .line 198
    .line 199
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 200
    .line 201
    .line 202
    move-result v17

    .line 203
    move/from16 v28, v6

    .line 204
    .line 205
    move/from16 v6, v17

    .line 206
    .line 207
    goto :goto_a

    .line 208
    :cond_b
    if-nez v7, :cond_c

    .line 209
    .line 210
    if-eqz v6, :cond_c

    .line 211
    .line 212
    move/from16 v28, v6

    .line 213
    .line 214
    move/from16 v6, v16

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_c
    move/from16 v28, v6

    .line 218
    .line 219
    iget v6, v5, LZ0/d;->d:I

    .line 220
    .line 221
    :goto_a
    if-eqz v1, :cond_d

    .line 222
    .line 223
    invoke-virtual/range {p3 .. p3}, Lg0/z;->p()I

    .line 224
    .line 225
    .line 226
    move-result v17

    .line 227
    move/from16 v29, v1

    .line 228
    .line 229
    move/from16 v30, v11

    .line 230
    .line 231
    move/from16 v31, v12

    .line 232
    .line 233
    move/from16 v1, v17

    .line 234
    .line 235
    goto :goto_b

    .line 236
    :cond_d
    move/from16 v29, v1

    .line 237
    .line 238
    move/from16 v30, v11

    .line 239
    .line 240
    move/from16 v31, v12

    .line 241
    .line 242
    const/4 v1, 0x0

    .line 243
    :goto_b
    int-to-long v11, v1

    .line 244
    add-long/2addr v11, v2

    .line 245
    sub-long v17, v11, v14

    .line 246
    .line 247
    const-wide/32 v19, 0xf4240

    .line 248
    .line 249
    .line 250
    move-wide/from16 v21, v25

    .line 251
    .line 252
    invoke-static/range {v17 .. v22}, Lg0/M;->W0(JJJ)J

    .line 253
    .line 254
    .line 255
    move-result-wide v11

    .line 256
    aput-wide v11, v23, v7

    .line 257
    .line 258
    iget-boolean v1, v4, LZ0/u;->r:Z

    .line 259
    .line 260
    if-nez v1, :cond_e

    .line 261
    .line 262
    iget-object v1, v0, LZ0/h$b;->d:LZ0/v;

    .line 263
    .line 264
    iget-wide v0, v1, LZ0/v;->h:J

    .line 265
    .line 266
    add-long/2addr v11, v0

    .line 267
    aput-wide v11, v23, v7

    .line 268
    .line 269
    :cond_e
    aput v10, v13, v7

    .line 270
    .line 271
    shr-int/lit8 v0, v6, 0x10

    .line 272
    .line 273
    const/4 v1, 0x1

    .line 274
    and-int/2addr v0, v1

    .line 275
    if-nez v0, :cond_10

    .line 276
    .line 277
    if-eqz p2, :cond_f

    .line 278
    .line 279
    if-nez v7, :cond_10

    .line 280
    .line 281
    :cond_f
    move v0, v1

    .line 282
    goto :goto_c

    .line 283
    :cond_10
    const/4 v0, 0x0

    .line 284
    :goto_c
    aput-boolean v0, v24, v7

    .line 285
    .line 286
    int-to-long v10, v8

    .line 287
    add-long/2addr v2, v10

    .line 288
    add-int/lit8 v7, v7, 0x1

    .line 289
    .line 290
    move-object/from16 v0, p0

    .line 291
    .line 292
    move/from16 v10, v27

    .line 293
    .line 294
    move/from16 v6, v28

    .line 295
    .line 296
    move/from16 v1, v29

    .line 297
    .line 298
    move/from16 v11, v30

    .line 299
    .line 300
    move/from16 v12, v31

    .line 301
    .line 302
    goto/16 :goto_7

    .line 303
    .line 304
    :cond_11
    iput-wide v2, v4, LZ0/u;->q:J

    .line 305
    .line 306
    return v9
.end method

.method public static K(LZ0/a$a;LZ0/h$b;I)V
    .locals 8

    .line 1
    iget-object p0, p0, LZ0/a$a;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const v5, 0x7472756e

    .line 12
    .line 13
    .line 14
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, LZ0/a$b;

    .line 21
    .line 22
    iget v7, v6, LZ0/a;->a:I

    .line 23
    .line 24
    if-ne v7, v5, :cond_0

    .line 25
    .line 26
    iget-object v5, v6, LZ0/a$b;->b:Lg0/z;

    .line 27
    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lg0/z;->T(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Lg0/z;->K()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    add-int/2addr v4, v5

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput v1, p1, LZ0/h$b;->h:I

    .line 46
    .line 47
    iput v1, p1, LZ0/h$b;->g:I

    .line 48
    .line 49
    iput v1, p1, LZ0/h$b;->f:I

    .line 50
    .line 51
    iget-object v2, p1, LZ0/h$b;->b:LZ0/u;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, LZ0/u;->e(II)V

    .line 54
    .line 55
    .line 56
    move v2, v1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v1, v0, :cond_3

    .line 59
    .line 60
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, LZ0/a$b;

    .line 65
    .line 66
    iget v6, v4, LZ0/a;->a:I

    .line 67
    .line 68
    if-ne v6, v5, :cond_2

    .line 69
    .line 70
    add-int/lit8 v6, v2, 0x1

    .line 71
    .line 72
    iget-object v4, v4, LZ0/a$b;->b:Lg0/z;

    .line 73
    .line 74
    invoke-static {p1, v2, p2, v4, v3}, LZ0/h;->J(LZ0/h$b;IILg0/z;I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v3, v2

    .line 79
    move v2, v6

    .line 80
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    return-void
.end method

.method public static L(Lg0/z;LZ0/u;[B)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p0, p2, v0, v1}, Lg0/z;->l([BII)V

    .line 10
    .line 11
    .line 12
    sget-object v0, LZ0/h;->L:[B

    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p0, v1, p1}, LZ0/h;->C(Lg0/z;ILZ0/u;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private M(J)V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LZ0/a$a;

    .line 16
    .line 17
    iget-wide v0, v0, LZ0/a$a;->b:J

    .line 18
    .line 19
    cmp-long v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LZ0/a$a;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, LZ0/h;->r(LZ0/a$a;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0}, LZ0/h;->h()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private N(LF0/s;)Z
    .locals 11

    .line 1
    iget v0, p0, LZ0/h;->u:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v1, v3}, LF0/s;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iput v1, p0, LZ0/h;->u:I

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->I()J

    move-result-wide v4

    iput-wide v4, p0, LZ0/h;->t:J

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->p()I

    move-result v0

    iput v0, p0, LZ0/h;->s:I

    :cond_1
    iget-wide v4, p0, LZ0/h;->t:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v1}, LF0/s;->readFully([BII)V

    iget v0, p0, LZ0/h;->u:I

    add-int/2addr v0, v1

    iput v0, p0, LZ0/h;->u:I

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->L()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, LZ0/h;->t:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, LF0/s;->a()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ0/a$a;

    iget-wide v4, v0, LZ0/a$a;->b:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, LF0/s;->p()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, LZ0/h;->u:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, LZ0/h;->t:J

    iget v0, p0, LZ0/h;->u:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_f

    invoke-interface {p1}, LF0/s;->p()J

    move-result-wide v4

    iget v0, p0, LZ0/h;->u:I

    int-to-long v6, v0

    sub-long/2addr v4, v6

    iget v0, p0, LZ0/h;->s:I

    const v6, 0x6d646174

    const v7, 0x6d6f6f66

    if-eq v0, v7, :cond_5

    if-ne v0, v6, :cond_6

    :cond_5
    iget-boolean v0, p0, LZ0/h;->J:Z

    if-nez v0, :cond_6

    iget-object v0, p0, LZ0/h;->G:LF0/t;

    new-instance v8, LF0/M$b;

    iget-wide v9, p0, LZ0/h;->z:J

    invoke-direct {v8, v9, v10, v4, v5}, LF0/M$b;-><init>(JJ)V

    invoke-interface {v0, v8}, LF0/t;->e(LF0/M;)V

    iput-boolean v3, p0, LZ0/h;->J:Z

    :cond_6
    iget v0, p0, LZ0/h;->s:I

    if-ne v0, v7, :cond_7

    iget-object v0, p0, LZ0/h;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v7, v2

    :goto_2
    if-ge v7, v0, :cond_7

    iget-object v8, p0, LZ0/h;->e:Landroid/util/SparseArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LZ0/h$b;

    iget-object v8, v8, LZ0/h$b;->b:LZ0/u;

    iput-wide v4, v8, LZ0/u;->b:J

    iput-wide v4, v8, LZ0/u;->d:J

    iput-wide v4, v8, LZ0/u;->c:J

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    iget v0, p0, LZ0/h;->s:I

    const/4 v7, 0x0

    if-ne v0, v6, :cond_8

    iput-object v7, p0, LZ0/h;->B:LZ0/h$b;

    iget-wide v0, p0, LZ0/h;->t:J

    add-long/2addr v4, v0

    iput-wide v4, p0, LZ0/h;->w:J

    const/4 p1, 0x2

    iput p1, p0, LZ0/h;->r:I

    return v3

    :cond_8
    invoke-static {v0}, LZ0/h;->R(I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, LF0/s;->p()J

    move-result-wide v0

    iget-wide v4, p0, LZ0/h;->t:J

    add-long/2addr v0, v4

    const-wide/16 v4, 0x8

    sub-long/2addr v0, v4

    iget-object p1, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    new-instance v2, LZ0/a$a;

    iget v4, p0, LZ0/h;->s:I

    invoke-direct {v2, v4, v0, v1}, LZ0/a$a;-><init>(IJ)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, LZ0/h;->t:J

    iget p1, p0, LZ0/h;->u:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_9

    invoke-direct {p0, v0, v1}, LZ0/h;->M(J)V

    goto :goto_4

    :cond_9
    invoke-direct {p0}, LZ0/h;->h()V

    goto :goto_4

    :cond_a
    iget p1, p0, LZ0/h;->s:I

    invoke-static {p1}, LZ0/h;->S(I)Z

    move-result p1

    const-wide/32 v4, 0x7fffffff

    if-eqz p1, :cond_d

    iget p1, p0, LZ0/h;->u:I

    if-ne p1, v1, :cond_c

    iget-wide v6, p0, LZ0/h;->t:J

    cmp-long p1, v6, v4

    if-gtz p1, :cond_b

    new-instance p1, Lg0/z;

    iget-wide v4, p0, LZ0/h;->t:J

    long-to-int v0, v4

    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    iget-object v0, p0, LZ0/h;->m:Lg0/z;

    invoke-virtual {v0}, Lg0/z;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lg0/z;->e()[B

    move-result-object v4

    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, LZ0/h;->v:Lg0/z;

    :goto_3
    iput v3, p0, LZ0/h;->r:I

    goto :goto_4

    :cond_b
    const-string p1, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {p1}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_c
    const-string p1, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {p1}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_d
    iget-wide v0, p0, LZ0/h;->t:J

    cmp-long p1, v0, v4

    if-gtz p1, :cond_e

    iput-object v7, p0, LZ0/h;->v:Lg0/z;

    goto :goto_3

    :goto_4
    return v3

    :cond_e
    const-string p1, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {p1}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_f
    const-string p1, "Atom size less than header length (unsupported)."

    invoke-static {p1}, Ld0/A;->d(Ljava/lang/String;)Ld0/A;

    move-result-object p1

    throw p1
.end method

.method private static R(I)Z
    .locals 1

    .line 1
    const v0, 0x6d6f6f76

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x7472616b

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x6d646961

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x6d696e66

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const v0, 0x7374626c

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const v0, 0x6d6f6f66

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    const v0, 0x74726166

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_1

    .line 35
    .line 36
    const v0, 0x6d766578

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    const v0, 0x65647473

    .line 42
    .line 43
    .line 44
    if-ne p0, v0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 50
    :goto_1
    return p0
.end method

.method private static S(I)Z
    .locals 1

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x6d646864

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x6d766864

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x73696478

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const v0, 0x73747364

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const v0, 0x73747473

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    const v0, 0x63747473

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_1

    .line 35
    .line 36
    const v0, 0x73747363

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    const v0, 0x7374737a

    .line 42
    .line 43
    .line 44
    if-eq p0, v0, :cond_1

    .line 45
    .line 46
    const v0, 0x73747a32

    .line 47
    .line 48
    .line 49
    if-eq p0, v0, :cond_1

    .line 50
    .line 51
    const v0, 0x7374636f

    .line 52
    .line 53
    .line 54
    if-eq p0, v0, :cond_1

    .line 55
    .line 56
    const v0, 0x636f3634

    .line 57
    .line 58
    .line 59
    if-eq p0, v0, :cond_1

    .line 60
    .line 61
    const v0, 0x73747373

    .line 62
    .line 63
    .line 64
    if-eq p0, v0, :cond_1

    .line 65
    .line 66
    const v0, 0x74666474

    .line 67
    .line 68
    .line 69
    if-eq p0, v0, :cond_1

    .line 70
    .line 71
    const v0, 0x74666864

    .line 72
    .line 73
    .line 74
    if-eq p0, v0, :cond_1

    .line 75
    .line 76
    const v0, 0x746b6864

    .line 77
    .line 78
    .line 79
    if-eq p0, v0, :cond_1

    .line 80
    .line 81
    const v0, 0x74726578

    .line 82
    .line 83
    .line 84
    if-eq p0, v0, :cond_1

    .line 85
    .line 86
    const v0, 0x7472756e

    .line 87
    .line 88
    .line 89
    if-eq p0, v0, :cond_1

    .line 90
    .line 91
    const v0, 0x70737368    # 3.013775E29f

    .line 92
    .line 93
    .line 94
    if-eq p0, v0, :cond_1

    .line 95
    .line 96
    const v0, 0x7361697a

    .line 97
    .line 98
    .line 99
    if-eq p0, v0, :cond_1

    .line 100
    .line 101
    const v0, 0x7361696f

    .line 102
    .line 103
    .line 104
    if-eq p0, v0, :cond_1

    .line 105
    .line 106
    const v0, 0x73656e63

    .line 107
    .line 108
    .line 109
    if-eq p0, v0, :cond_1

    .line 110
    .line 111
    const v0, 0x75756964

    .line 112
    .line 113
    .line 114
    if-eq p0, v0, :cond_1

    .line 115
    .line 116
    const v0, 0x73626770

    .line 117
    .line 118
    .line 119
    if-eq p0, v0, :cond_1

    .line 120
    .line 121
    const v0, 0x73677064

    .line 122
    .line 123
    .line 124
    if-eq p0, v0, :cond_1

    .line 125
    .line 126
    const v0, 0x656c7374

    .line 127
    .line 128
    .line 129
    if-eq p0, v0, :cond_1

    .line 130
    .line 131
    const v0, 0x6d656864

    .line 132
    .line 133
    .line 134
    if-eq p0, v0, :cond_1

    .line 135
    .line 136
    const v0, 0x656d7367

    .line 137
    .line 138
    .line 139
    if-ne p0, v0, :cond_0

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_0
    const/4 p0, 0x0

    .line 143
    goto :goto_1

    .line 144
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 145
    :goto_1
    return p0
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, LZ0/h;->p()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static f(I)I
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "Unexpected negative value: "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0
.end method

.method private h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LZ0/h;->r:I

    .line 3
    .line 4
    iput v0, p0, LZ0/h;->u:I

    .line 5
    .line 6
    return-void
.end method

.method public static k(Ljava/util/List;)Ld0/m;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_3

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, LZ0/a$b;

    .line 15
    .line 16
    iget v5, v4, LZ0/a;->a:I

    .line 17
    .line 18
    const v6, 0x70737368    # 3.013775E29f

    .line 19
    .line 20
    .line 21
    if-ne v5, v6, :cond_2

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v4, v4, LZ0/a$b;->b:Lg0/z;

    .line 31
    .line 32
    invoke-virtual {v4}, Lg0/z;->e()[B

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, LZ0/o;->f([B)Ljava/util/UUID;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    const-string v4, "FragmentedMp4Extractor"

    .line 43
    .line 44
    const-string v5, "Skipped pssh atom (failed to extract uuid)"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v6, Ld0/m$b;

    .line 51
    .line 52
    const-string v7, "video/mp4"

    .line 53
    .line 54
    invoke-direct {v6, v5, v7, v4}, Ld0/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-nez v3, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    new-instance v1, Ld0/m;

    .line 67
    .line 68
    invoke-direct {v1, v3}, Ld0/m;-><init>(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    return-object v1
.end method

.method public static l(Landroid/util/SparseArray;)LZ0/h$b;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, LZ0/h$b;

    .line 19
    .line 20
    invoke-static {v5}, LZ0/h$b;->a(LZ0/h$b;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iget v6, v5, LZ0/h$b;->f:I

    .line 27
    .line 28
    iget-object v7, v5, LZ0/h$b;->d:LZ0/v;

    .line 29
    .line 30
    iget v7, v7, LZ0/v;->b:I

    .line 31
    .line 32
    if-eq v6, v7, :cond_2

    .line 33
    .line 34
    :cond_0
    invoke-static {v5}, LZ0/h$b;->a(LZ0/h$b;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget v6, v5, LZ0/h$b;->h:I

    .line 41
    .line 42
    iget-object v7, v5, LZ0/h$b;->b:LZ0/u;

    .line 43
    .line 44
    iget v7, v7, LZ0/u;->e:I

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v5}, LZ0/h$b;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v2

    .line 54
    .line 55
    if-gez v8, :cond_2

    .line 56
    .line 57
    move-object v1, v5

    .line 58
    move-wide v2, v6

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-object v1
.end method

.method public static o(LZ0/s;)Z
    .locals 14

    .line 1
    iget-object v0, p0, LZ0/s;->h:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v2, v3, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, LZ0/s;->i:[J

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget-wide v4, v0, v1

    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    cmp-long v0, v4, v6

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v3

    .line 24
    :cond_1
    aget-wide v6, v2, v1

    .line 25
    .line 26
    add-long v8, v4, v6

    .line 27
    .line 28
    const-wide/32 v10, 0xf4240

    .line 29
    .line 30
    .line 31
    iget-wide v12, p0, LZ0/s;->d:J

    .line 32
    .line 33
    invoke-static/range {v8 .. v13}, Lg0/M;->W0(JJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iget-wide v6, p0, LZ0/s;->e:J

    .line 38
    .line 39
    cmp-long p0, v4, v6

    .line 40
    .line 41
    if-ltz p0, :cond_2

    .line 42
    .line 43
    move v1, v3

    .line 44
    :cond_2
    :goto_0
    return v1
.end method

.method private static synthetic p()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, LZ0/h;

    .line 2
    .line 3
    sget-object v1, Lc1/t$a;->a:Lc1/t$a;

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LZ0/h;-><init>(Lc1/t$a;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v1, v1, [LF0/r;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    return-object v1
.end method

.method public static x(Lg0/z;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LZ0/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    return-wide v0
.end method

.method public static y(LZ0/a$a;Landroid/util/SparseArray;ZI[B)V
    .locals 5

    .line 1
    iget-object v0, p0, LZ0/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, LZ0/a$a;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, LZ0/a$a;

    .line 17
    .line 18
    iget v3, v2, LZ0/a;->a:I

    .line 19
    .line 20
    const v4, 0x74726166

    .line 21
    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    invoke-static {v2, p1, p2, p3, p4}, LZ0/h;->H(LZ0/a$a;Landroid/util/SparseArray;ZI[B)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public static z(Lg0/z;LZ0/u;)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, LZ0/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    and-int/2addr v2, v3

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, LZ0/a;->c(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v1, p1, LZ0/u;->d:J

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_0
    add-long/2addr v1, v3

    .line 45
    iput-wide v1, p1, LZ0/u;->d:J

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string p1, "Unexpected saio entry count: "

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p0, p1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    throw p0
.end method


# virtual methods
.method public final O(LF0/s;)V
    .locals 4

    .line 1
    iget-wide v0, p0, LZ0/h;->t:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    iget v1, p0, LZ0/h;->u:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    iget-object v1, p0, LZ0/h;->v:Lg0/z;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    invoke-interface {p1, v2, v3, v0}, LF0/s;->readFully([BII)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LZ0/a$b;

    .line 21
    .line 22
    iget v2, p0, LZ0/h;->s:I

    .line 23
    .line 24
    invoke-direct {v0, v2, v1}, LZ0/a$b;-><init>(ILg0/z;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, LF0/s;->p()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {p0, v0, v1, v2}, LZ0/h;->t(LZ0/a$b;J)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {p1}, LF0/s;->p()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-direct {p0, v0, v1}, LZ0/h;->M(J)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final P(LF0/s;)V
    .locals 9

    .line 1
    iget-object v0, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide v2, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v5, v1

    .line 15
    :goto_0
    if-ge v4, v0, :cond_1

    .line 16
    .line 17
    iget-object v6, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LZ0/h$b;

    .line 24
    .line 25
    iget-object v6, v6, LZ0/h$b;->b:LZ0/u;

    .line 26
    .line 27
    iget-boolean v7, v6, LZ0/u;->p:Z

    .line 28
    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    iget-wide v6, v6, LZ0/u;->d:J

    .line 32
    .line 33
    cmp-long v8, v6, v2

    .line 34
    .line 35
    if-gez v8, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v5, v2

    .line 44
    check-cast v5, LZ0/h$b;

    .line 45
    .line 46
    move-wide v2, v6

    .line 47
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-nez v5, :cond_2

    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    iput p1, p0, LZ0/h;->r:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    invoke-interface {p1}, LF0/s;->p()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    sub-long/2addr v2, v6

    .line 61
    long-to-int v0, v2

    .line 62
    if-ltz v0, :cond_3

    .line 63
    .line 64
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, LZ0/h$b;->b:LZ0/u;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, LZ0/u;->a(LF0/s;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    const-string p1, "Offset to encryption data was negative."

    .line 74
    .line 75
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    throw p1
.end method

.method public final Q(LF0/s;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LZ0/h;->B:LZ0/h$b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, v0, LZ0/h;->e:Landroid/util/SparseArray;

    invoke-static {v2}, LZ0/h;->l(Landroid/util/SparseArray;)LZ0/h$b;

    move-result-object v2

    if-nez v2, :cond_1

    iget-wide v5, v0, LZ0/h;->w:J

    invoke-interface/range {p1 .. p1}, LF0/s;->p()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-int v2, v5

    if-ltz v2, :cond_0

    invoke-interface {v1, v2}, LF0/s;->i(I)V

    invoke-direct/range {p0 .. p0}, LZ0/h;->h()V

    return v4

    :cond_0
    const-string v1, "Offset to end of mdat was negative."

    invoke-static {v1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object v1

    throw v1

    :cond_1
    invoke-virtual {v2}, LZ0/h$b;->d()J

    move-result-wide v5

    invoke-interface/range {p1 .. p1}, LF0/s;->p()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-int v5, v5

    if-gez v5, :cond_2

    const-string v5, "FragmentedMp4Extractor"

    const-string v6, "Ignoring negative offset to sample data."

    invoke-static {v5, v6}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    move v5, v4

    :cond_2
    invoke-interface {v1, v5}, LF0/s;->i(I)V

    iput-object v2, v0, LZ0/h;->B:LZ0/h$b;

    :cond_3
    iget v5, v0, LZ0/h;->r:I

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    if-ne v5, v6, :cond_8

    invoke-virtual {v2}, LZ0/h$b;->f()I

    move-result v5

    iput v5, v0, LZ0/h;->C:I

    iget v9, v2, LZ0/h$b;->f:I

    iget v10, v2, LZ0/h$b;->i:I

    if-ge v9, v10, :cond_5

    invoke-interface {v1, v5}, LF0/s;->i(I)V

    invoke-virtual {v2}, LZ0/h$b;->m()V

    invoke-virtual {v2}, LZ0/h$b;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v3, v0, LZ0/h;->B:LZ0/h$b;

    :cond_4
    iput v6, v0, LZ0/h;->r:I

    return v8

    :cond_5
    iget-object v9, v2, LZ0/h$b;->d:LZ0/v;

    iget-object v9, v9, LZ0/v;->a:LZ0/s;

    iget v9, v9, LZ0/s;->g:I

    if-ne v9, v8, :cond_6

    const/16 v9, 0x8

    sub-int/2addr v5, v9

    iput v5, v0, LZ0/h;->C:I

    invoke-interface {v1, v9}, LF0/s;->i(I)V

    :cond_6
    iget-object v5, v2, LZ0/h$b;->d:LZ0/v;

    iget-object v5, v5, LZ0/v;->a:LZ0/s;

    iget-object v5, v5, LZ0/s;->f:Ld0/q;

    iget-object v5, v5, Ld0/q;->n:Ljava/lang/String;

    const-string v9, "audio/ac4"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget v5, v0, LZ0/h;->C:I

    const/4 v9, 0x7

    invoke-virtual {v2, v5, v9}, LZ0/h$b;->i(II)I

    move-result v5

    iput v5, v0, LZ0/h;->D:I

    iget v5, v0, LZ0/h;->C:I

    iget-object v10, v0, LZ0/h;->j:Lg0/z;

    invoke-static {v5, v10}, LF0/c;->a(ILg0/z;)V

    iget-object v5, v2, LZ0/h$b;->a:LF0/T;

    iget-object v10, v0, LZ0/h;->j:Lg0/z;

    invoke-interface {v5, v10, v9}, LF0/T;->e(Lg0/z;I)V

    iget v5, v0, LZ0/h;->D:I

    add-int/2addr v5, v9

    :goto_0
    iput v5, v0, LZ0/h;->D:I

    goto :goto_1

    :cond_7
    iget v5, v0, LZ0/h;->C:I

    invoke-virtual {v2, v5, v4}, LZ0/h$b;->i(II)I

    move-result v5

    goto :goto_0

    :goto_1
    iget v5, v0, LZ0/h;->C:I

    iget v9, v0, LZ0/h;->D:I

    add-int/2addr v5, v9

    iput v5, v0, LZ0/h;->C:I

    iput v7, v0, LZ0/h;->r:I

    iput v4, v0, LZ0/h;->E:I

    :cond_8
    iget-object v5, v2, LZ0/h$b;->d:LZ0/v;

    iget-object v5, v5, LZ0/v;->a:LZ0/s;

    iget-object v9, v2, LZ0/h$b;->a:LF0/T;

    invoke-virtual {v2}, LZ0/h$b;->e()J

    move-result-wide v10

    iget-object v12, v0, LZ0/h;->k:Lg0/E;

    if-eqz v12, :cond_9

    invoke-virtual {v12, v10, v11}, Lg0/E;->a(J)J

    move-result-wide v10

    :cond_9
    move-wide v14, v10

    iget v10, v5, LZ0/s;->j:I

    if-eqz v10, :cond_e

    iget-object v10, v0, LZ0/h;->g:Lg0/z;

    invoke-virtual {v10}, Lg0/z;->e()[B

    move-result-object v10

    aput-byte v4, v10, v4

    aput-byte v4, v10, v8

    const/4 v11, 0x2

    aput-byte v4, v10, v11

    iget v11, v5, LZ0/s;->j:I

    add-int/lit8 v12, v11, 0x1

    rsub-int/lit8 v11, v11, 0x4

    :goto_2
    iget v13, v0, LZ0/h;->D:I

    iget v6, v0, LZ0/h;->C:I

    if-ge v13, v6, :cond_f

    iget v6, v0, LZ0/h;->E:I

    if-nez v6, :cond_c

    invoke-interface {v1, v10, v11, v12}, LF0/s;->readFully([BII)V

    iget-object v6, v0, LZ0/h;->g:Lg0/z;

    invoke-virtual {v6, v4}, Lg0/z;->T(I)V

    iget-object v6, v0, LZ0/h;->g:Lg0/z;

    invoke-virtual {v6}, Lg0/z;->p()I

    move-result v6

    if-lt v6, v8, :cond_b

    add-int/lit8 v6, v6, -0x1

    iput v6, v0, LZ0/h;->E:I

    iget-object v6, v0, LZ0/h;->f:Lg0/z;

    invoke-virtual {v6, v4}, Lg0/z;->T(I)V

    iget-object v6, v0, LZ0/h;->f:Lg0/z;

    invoke-interface {v9, v6, v7}, LF0/T;->e(Lg0/z;I)V

    iget-object v6, v0, LZ0/h;->g:Lg0/z;

    invoke-interface {v9, v6, v8}, LF0/T;->e(Lg0/z;I)V

    iget-object v6, v0, LZ0/h;->I:[LF0/T;

    array-length v6, v6

    if-lez v6, :cond_a

    iget-object v6, v5, LZ0/s;->f:Ld0/q;

    iget-object v6, v6, Ld0/q;->n:Ljava/lang/String;

    aget-byte v13, v10, v7

    invoke-static {v6, v13}, Lh0/d;->g(Ljava/lang/String;B)Z

    move-result v6

    if-eqz v6, :cond_a

    move v6, v8

    goto :goto_3

    :cond_a
    move v6, v4

    :goto_3
    iput-boolean v6, v0, LZ0/h;->F:Z

    iget v6, v0, LZ0/h;->D:I

    add-int/lit8 v6, v6, 0x5

    iput v6, v0, LZ0/h;->D:I

    iget v6, v0, LZ0/h;->C:I

    add-int/2addr v6, v11

    iput v6, v0, LZ0/h;->C:I

    const/4 v6, 0x3

    goto :goto_2

    :cond_b
    const-string v1, "Invalid NAL length"

    invoke-static {v1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object v1

    throw v1

    :cond_c
    iget-boolean v13, v0, LZ0/h;->F:Z

    if-eqz v13, :cond_d

    iget-object v13, v0, LZ0/h;->h:Lg0/z;

    invoke-virtual {v13, v6}, Lg0/z;->P(I)V

    iget-object v6, v0, LZ0/h;->h:Lg0/z;

    invoke-virtual {v6}, Lg0/z;->e()[B

    move-result-object v6

    iget v13, v0, LZ0/h;->E:I

    invoke-interface {v1, v6, v4, v13}, LF0/s;->readFully([BII)V

    iget-object v6, v0, LZ0/h;->h:Lg0/z;

    iget v13, v0, LZ0/h;->E:I

    invoke-interface {v9, v6, v13}, LF0/T;->e(Lg0/z;I)V

    iget v6, v0, LZ0/h;->E:I

    iget-object v13, v0, LZ0/h;->h:Lg0/z;

    invoke-virtual {v13}, Lg0/z;->e()[B

    move-result-object v13

    iget-object v7, v0, LZ0/h;->h:Lg0/z;

    invoke-virtual {v7}, Lg0/z;->g()I

    move-result v7

    invoke-static {v13, v7}, Lh0/d;->r([BI)I

    move-result v7

    iget-object v13, v0, LZ0/h;->h:Lg0/z;

    iget-object v8, v5, LZ0/s;->f:Ld0/q;

    iget-object v8, v8, Ld0/q;->n:Ljava/lang/String;

    const-string v3, "video/hevc"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v3}, Lg0/z;->T(I)V

    iget-object v3, v0, LZ0/h;->h:Lg0/z;

    invoke-virtual {v3, v7}, Lg0/z;->S(I)V

    iget-object v3, v0, LZ0/h;->h:Lg0/z;

    iget-object v7, v0, LZ0/h;->I:[LF0/T;

    invoke-static {v14, v15, v3, v7}, LF0/g;->a(JLg0/z;[LF0/T;)V

    goto :goto_4

    :cond_d
    invoke-interface {v9, v1, v6, v4}, LF0/T;->f(Ld0/i;IZ)I

    move-result v6

    :goto_4
    iget v3, v0, LZ0/h;->D:I

    add-int/2addr v3, v6

    iput v3, v0, LZ0/h;->D:I

    iget v3, v0, LZ0/h;->E:I

    sub-int/2addr v3, v6

    iput v3, v0, LZ0/h;->E:I

    const/4 v3, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_e
    :goto_5
    iget v3, v0, LZ0/h;->D:I

    iget v5, v0, LZ0/h;->C:I

    if-ge v3, v5, :cond_f

    sub-int/2addr v5, v3

    invoke-interface {v9, v1, v5, v4}, LF0/T;->f(Ld0/i;IZ)I

    move-result v3

    iget v5, v0, LZ0/h;->D:I

    add-int/2addr v5, v3

    iput v5, v0, LZ0/h;->D:I

    goto :goto_5

    :cond_f
    invoke-virtual {v2}, LZ0/h$b;->c()I

    move-result v12

    invoke-virtual {v2}, LZ0/h$b;->g()LZ0/t;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v1, v1, LZ0/t;->c:LF0/T$a;

    goto :goto_6

    :cond_10
    const/4 v1, 0x0

    :goto_6
    iget v13, v0, LZ0/h;->C:I

    const/4 v3, 0x0

    move-wide v10, v14

    move-wide v4, v14

    move v14, v3

    move-object v15, v1

    invoke-interface/range {v9 .. v15}, LF0/T;->b(JIIILF0/T$a;)V

    invoke-virtual {v0, v4, v5}, LZ0/h;->w(J)V

    invoke-virtual {v2}, LZ0/h$b;->h()Z

    move-result v1

    if-nez v1, :cond_11

    const/4 v1, 0x0

    iput-object v1, v0, LZ0/h;->B:LZ0/h$b;

    :cond_11
    const/4 v1, 0x3

    iput v1, v0, LZ0/h;->r:I

    const/4 v1, 0x1

    return v1
.end method

.method public a(JJ)V
    .locals 2

    .line 1
    iget-object p1, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    move v0, p2

    .line 9
    :goto_0
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LZ0/h$b;

    .line 18
    .line 19
    invoke-virtual {v1}, LZ0/h$b;->k()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, LZ0/h;->o:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 28
    .line 29
    .line 30
    iput p2, p0, LZ0/h;->x:I

    .line 31
    .line 32
    iput-wide p3, p0, LZ0/h;->y:J

    .line 33
    .line 34
    iget-object p1, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, LZ0/h;->h()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public b(LF0/t;)V
    .locals 12

    .line 1
    iget v0, p0, LZ0/h;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lc1/v;

    .line 8
    .line 9
    iget-object v1, p0, LZ0/h;->a:Lc1/t$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, p1

    .line 16
    :goto_0
    iput-object v0, p0, LZ0/h;->G:LF0/t;

    .line 17
    .line 18
    invoke-direct {p0}, LZ0/h;->h()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LZ0/h;->n()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LZ0/h;->c:LZ0/s;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v1, LZ0/h$b;

    .line 29
    .line 30
    iget v0, v0, LZ0/s;->b:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-interface {p1, v2, v0}, LF0/t;->a(II)LF0/T;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, LZ0/v;

    .line 38
    .line 39
    iget-object v4, p0, LZ0/h;->c:LZ0/s;

    .line 40
    .line 41
    new-array v5, v2, [J

    .line 42
    .line 43
    new-array v6, v2, [I

    .line 44
    .line 45
    new-array v8, v2, [J

    .line 46
    .line 47
    new-array v9, v2, [I

    .line 48
    .line 49
    const-wide/16 v10, 0x0

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v3, v0

    .line 53
    invoke-direct/range {v3 .. v11}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    .line 54
    .line 55
    .line 56
    new-instance v3, LZ0/d;

    .line 57
    .line 58
    invoke-direct {v3, v2, v2, v2, v2}, LZ0/d;-><init>(IIII)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, p1, v0, v3}, LZ0/h$b;-><init>(LF0/T;LZ0/v;LZ0/d;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p1, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, LZ0/h;->G:LF0/t;

    .line 70
    .line 71
    invoke-interface {p1}, LF0/t;->j()V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 1

    .line 1
    invoke-static {p1}, LZ0/r;->b(LF0/s;)LF0/Q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iput-object v0, p0, LZ0/h;->q:LX2/v;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_1
    return p1
.end method

.method public bridge synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ0/h;->m()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 1

    .line 1
    :cond_0
    :goto_0
    iget p2, p0, LZ0/h;->r:I

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p2, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, LZ0/h;->Q(LF0/s;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, LZ0/h;->P(LF0/s;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {p0, p1}, LZ0/h;->O(LF0/s;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    invoke-direct {p0, p1}, LZ0/h;->N(LF0/s;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    const/4 p1, -0x1

    .line 34
    return p1
.end method

.method public final j(Landroid/util/SparseArray;I)LZ0/d;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    check-cast p1, LZ0/d;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, LZ0/d;

    .line 21
    .line 22
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0
.end method

.method public m()LX2/v;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->q:LX2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LF0/T;

    .line 3
    .line 4
    iput-object v0, p0, LZ0/h;->H:[LF0/T;

    .line 5
    .line 6
    iget-object v1, p0, LZ0/h;->p:LF0/T;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v2

    .line 16
    :goto_0
    iget v3, p0, LZ0/h;->b:I

    .line 17
    .line 18
    and-int/lit8 v3, v3, 0x4

    .line 19
    .line 20
    const/16 v4, 0x64

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    iget-object v5, p0, LZ0/h;->G:LF0/t;

    .line 27
    .line 28
    const/4 v6, 0x5

    .line 29
    invoke-interface {v5, v4, v6}, LF0/t;->a(II)LF0/T;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v1

    .line 34
    .line 35
    const/16 v4, 0x65

    .line 36
    .line 37
    move v1, v3

    .line 38
    :cond_1
    iget-object v0, p0, LZ0/h;->H:[LF0/T;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lg0/M;->O0([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [LF0/T;

    .line 45
    .line 46
    iput-object v0, p0, LZ0/h;->H:[LF0/T;

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v1, :cond_2

    .line 51
    .line 52
    aget-object v5, v0, v3

    .line 53
    .line 54
    sget-object v6, LZ0/h;->M:Ld0/q;

    .line 55
    .line 56
    invoke-interface {v5, v6}, LF0/T;->d(Ld0/q;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v0, p0, LZ0/h;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-array v0, v0, [LF0/T;

    .line 69
    .line 70
    iput-object v0, p0, LZ0/h;->I:[LF0/T;

    .line 71
    .line 72
    :goto_2
    iget-object v0, p0, LZ0/h;->I:[LF0/T;

    .line 73
    .line 74
    array-length v0, v0

    .line 75
    if-ge v2, v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, LZ0/h;->G:LF0/t;

    .line 78
    .line 79
    add-int/lit8 v1, v4, 0x1

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    invoke-interface {v0, v4, v3}, LF0/t;->a(II)LF0/T;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, p0, LZ0/h;->d:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ld0/q;

    .line 93
    .line 94
    invoke-interface {v0, v3}, LF0/T;->d(Ld0/q;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, LZ0/h;->I:[LF0/T;

    .line 98
    .line 99
    aput-object v0, v3, v2

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    move v4, v1

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    return-void
.end method

.method public q(LZ0/s;)LZ0/s;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final r(LZ0/a$a;)V
    .locals 2

    .line 1
    iget v0, p1, LZ0/a;->a:I

    .line 2
    .line 3
    const v1, 0x6d6f6f76

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LZ0/h;->v(LZ0/a$a;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const v1, 0x6d6f6f66

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, LZ0/h;->u(LZ0/a$a;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LZ0/a$a;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, LZ0/a$a;->d(LZ0/a$a;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(Lg0/z;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LZ0/h;->H:[LF0/T;

    array-length v2, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lg0/z;->T(I)V

    invoke-virtual/range {p1 .. p1}, Lg0/z;->p()I

    move-result v2

    invoke-static {v2}, LZ0/a;->c(I)I

    move-result v2

    const/4 v3, 0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping unsupported emsg version: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentedMp4Extractor"

    invoke-static {v2, v1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lg0/z;->L()J

    move-result-wide v6

    const-wide/32 v8, 0xf4240

    move-wide v10, v12

    invoke-static/range {v6 .. v11}, Lg0/M;->W0(JJJ)J

    move-result-wide v14

    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    invoke-static/range {v6 .. v11}, Lg0/M;->W0(JJJ)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lg0/z;->A()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lg0/z;->A()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    move-object/from16 v20, v2

    move-wide/from16 v22, v6

    move-wide/from16 v24, v8

    move-object/from16 v21, v10

    move-wide v8, v4

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lg0/z;->A()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lg0/z;->A()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v11

    const-wide/32 v13, 0xf4240

    move-wide v15, v6

    invoke-static/range {v11 .. v16}, Lg0/M;->W0(JJJ)J

    move-result-wide v8

    iget-wide v11, v0, LZ0/h;->A:J

    cmp-long v13, v11, v4

    if-eqz v13, :cond_3

    add-long/2addr v11, v8

    move-wide/from16 v17, v11

    goto :goto_0

    :cond_3
    move-wide/from16 v17, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    move-wide v15, v6

    invoke-static/range {v11 .. v16}, Lg0/M;->W0(JJJ)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lg0/z;->I()J

    move-result-wide v11

    move-object/from16 v20, v2

    move-wide/from16 v22, v6

    move-object/from16 v21, v10

    move-wide/from16 v24, v11

    move-wide/from16 v14, v17

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v1, v2, v7, v6}, Lg0/z;->l([BII)V

    new-instance v1, LQ0/a;

    move-object/from16 v19, v1

    move-object/from16 v26, v2

    invoke-direct/range {v19 .. v26}, LQ0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    new-instance v2, Lg0/z;

    iget-object v6, v0, LZ0/h;->l:LQ0/c;

    invoke-virtual {v6, v1}, LQ0/c;->a(LQ0/a;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lg0/z;-><init>([B)V

    invoke-virtual {v2}, Lg0/z;->a()I

    move-result v1

    iget-object v6, v0, LZ0/h;->H:[LF0/T;

    array-length v10, v6

    move v11, v7

    :goto_2
    if-ge v11, v10, :cond_4

    aget-object v12, v6, v11

    invoke-virtual {v2, v7}, Lg0/z;->T(I)V

    invoke-interface {v12, v2, v1}, LF0/T;->e(Lg0/z;I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    cmp-long v2, v14, v4

    if-nez v2, :cond_5

    iget-object v2, v0, LZ0/h;->o:Ljava/util/ArrayDeque;

    new-instance v4, LZ0/h$a;

    invoke-direct {v4, v8, v9, v3, v1}, LZ0/h$a;-><init>(JZI)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :goto_3
    iget v2, v0, LZ0/h;->x:I

    add-int/2addr v2, v1

    iput v2, v0, LZ0/h;->x:I

    goto :goto_6

    :cond_5
    iget-object v2, v0, LZ0/h;->o:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, LZ0/h;->o:Ljava/util/ArrayDeque;

    new-instance v3, LZ0/h$a;

    invoke-direct {v3, v14, v15, v7, v1}, LZ0/h$a;-><init>(JZI)V

    :goto_4
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    iget-object v2, v0, LZ0/h;->k:Lg0/E;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lg0/E;->g()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, v0, LZ0/h;->o:Ljava/util/ArrayDeque;

    new-instance v3, LZ0/h$a;

    invoke-direct {v3, v14, v15, v7, v1}, LZ0/h$a;-><init>(JZI)V

    goto :goto_4

    :cond_7
    iget-object v2, v0, LZ0/h;->k:Lg0/E;

    if-eqz v2, :cond_8

    invoke-virtual {v2, v14, v15}, Lg0/E;->a(J)J

    move-result-wide v14

    :cond_8
    iget-object v2, v0, LZ0/h;->H:[LF0/T;

    array-length v3, v2

    :goto_5
    if-ge v7, v3, :cond_9

    aget-object v16, v2, v7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v19, 0x1

    move-wide/from16 v17, v14

    move/from16 v20, v1

    invoke-interface/range {v16 .. v22}, LF0/T;->b(JIIILF0/T$a;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    return-void
.end method

.method public final t(LZ0/a$b;J)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, LZ0/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, LZ0/a$a;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, LZ0/a$a;->e(LZ0/a$b;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, p1, LZ0/a;->a:I

    .line 22
    .line 23
    const v1, 0x73696478

    .line 24
    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, LZ0/a$b;->b:Lg0/z;

    .line 29
    .line 30
    invoke-static {p1, p2, p3}, LZ0/h;->E(Lg0/z;J)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    iput-wide p2, p0, LZ0/h;->A:J

    .line 43
    .line 44
    iget-object p2, p0, LZ0/h;->G:LF0/t;

    .line 45
    .line 46
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, LF0/M;

    .line 49
    .line 50
    invoke-interface {p2, p1}, LF0/t;->e(LF0/M;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, LZ0/h;->J:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const p2, 0x656d7367

    .line 58
    .line 59
    .line 60
    if-ne v0, p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p1, LZ0/a$b;->b:Lg0/z;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, LZ0/h;->s(Lg0/z;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return-void
.end method

.method public final u(LZ0/a$a;)V
    .locals 7

    .line 1
    iget-object v0, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object v1, p0, LZ0/h;->c:LZ0/s;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    iget v3, p0, LZ0/h;->b:I

    .line 12
    .line 13
    iget-object v4, p0, LZ0/h;->i:[B

    .line 14
    .line 15
    invoke-static {p1, v0, v1, v3, v4}, LZ0/h;->y(LZ0/a$a;Landroid/util/SparseArray;ZI[B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, LZ0/a$a;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1}, LZ0/h;->k(Ljava/util/List;)Ld0/m;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v1, v2

    .line 33
    :goto_1
    if-ge v1, v0, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, LZ0/h$b;

    .line 42
    .line 43
    invoke-virtual {v3, p1}, LZ0/h$b;->n(Ld0/m;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-wide v0, p0, LZ0/h;->y:J

    .line 50
    .line 51
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    cmp-long p1, v0, v3

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_2
    if-ge v2, p1, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, LZ0/h$b;

    .line 75
    .line 76
    iget-wide v5, p0, LZ0/h;->y:J

    .line 77
    .line 78
    invoke-virtual {v0, v5, v6}, LZ0/h$b;->l(J)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iput-wide v3, p0, LZ0/h;->y:J

    .line 85
    .line 86
    :cond_3
    return-void
.end method

.method public final v(LZ0/a$a;)V
    .locals 12

    .line 1
    iget-object v0, p0, LZ0/h;->c:LZ0/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const-string v3, "Unexpected moov box."

    .line 11
    .line 12
    invoke-static {v0, v3}, Lg0/a;->g(ZLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, LZ0/a$a;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0}, LZ0/h;->k(Ljava/util/List;)Ld0/m;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const v0, 0x6d766578

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LZ0/a$a;

    .line 33
    .line 34
    new-instance v11, Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, LZ0/a$a;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    move-wide v5, v4

    .line 51
    move v4, v1

    .line 52
    :goto_1
    if-ge v4, v3, :cond_3

    .line 53
    .line 54
    iget-object v8, v0, LZ0/a$a;->c:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, LZ0/a$b;

    .line 61
    .line 62
    iget v9, v8, LZ0/a;->a:I

    .line 63
    .line 64
    const v10, 0x74726578

    .line 65
    .line 66
    .line 67
    if-ne v9, v10, :cond_1

    .line 68
    .line 69
    iget-object v8, v8, LZ0/a$b;->b:Lg0/z;

    .line 70
    .line 71
    invoke-static {v8}, LZ0/h;->I(Lg0/z;)Landroid/util/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v8, LZ0/d;

    .line 86
    .line 87
    invoke-virtual {v11, v9, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    const v10, 0x6d656864

    .line 92
    .line 93
    .line 94
    if-ne v9, v10, :cond_2

    .line 95
    .line 96
    iget-object v5, v8, LZ0/a$b;->b:Lg0/z;

    .line 97
    .line 98
    invoke-static {v5}, LZ0/h;->x(Lg0/z;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    new-instance v4, LF0/E;

    .line 106
    .line 107
    invoke-direct {v4}, LF0/E;-><init>()V

    .line 108
    .line 109
    .line 110
    iget v0, p0, LZ0/h;->b:I

    .line 111
    .line 112
    and-int/lit8 v0, v0, 0x10

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    move v8, v2

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move v8, v1

    .line 119
    :goto_3
    new-instance v10, LZ0/g;

    .line 120
    .line 121
    invoke-direct {v10, p0}, LZ0/g;-><init>(LZ0/h;)V

    .line 122
    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    move-object v3, p1

    .line 126
    invoke-static/range {v3 .. v10}, LZ0/b;->B(LZ0/a$a;LF0/E;JLd0/m;ZZLW2/g;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget-object v3, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_6

    .line 141
    .line 142
    :goto_4
    if-ge v1, v0, :cond_5

    .line 143
    .line 144
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, LZ0/v;

    .line 149
    .line 150
    iget-object v3, v2, LZ0/v;->a:LZ0/s;

    .line 151
    .line 152
    new-instance v4, LZ0/h$b;

    .line 153
    .line 154
    iget-object v5, p0, LZ0/h;->G:LF0/t;

    .line 155
    .line 156
    iget v6, v3, LZ0/s;->b:I

    .line 157
    .line 158
    invoke-interface {v5, v1, v6}, LF0/t;->a(II)LF0/T;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget v6, v3, LZ0/s;->a:I

    .line 163
    .line 164
    invoke-virtual {p0, v11, v6}, LZ0/h;->j(Landroid/util/SparseArray;I)LZ0/d;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-direct {v4, v5, v2, v6}, LZ0/h$b;-><init>(LF0/T;LZ0/v;LZ0/d;)V

    .line 169
    .line 170
    .line 171
    iget-object v2, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 172
    .line 173
    iget v5, v3, LZ0/s;->a:I

    .line 174
    .line 175
    invoke-virtual {v2, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-wide v4, p0, LZ0/h;->z:J

    .line 179
    .line 180
    iget-wide v2, v3, LZ0/s;->e:J

    .line 181
    .line 182
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v2

    .line 186
    iput-wide v2, p0, LZ0/h;->z:J

    .line 187
    .line 188
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_5
    iget-object p1, p0, LZ0/h;->G:LF0/t;

    .line 192
    .line 193
    invoke-interface {p1}, LF0/t;->j()V

    .line 194
    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_6
    iget-object v3, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 198
    .line 199
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-ne v3, v0, :cond_7

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    move v2, v1

    .line 207
    :goto_5
    invoke-static {v2}, Lg0/a;->f(Z)V

    .line 208
    .line 209
    .line 210
    :goto_6
    if-ge v1, v0, :cond_8

    .line 211
    .line 212
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, LZ0/v;

    .line 217
    .line 218
    iget-object v3, v2, LZ0/v;->a:LZ0/s;

    .line 219
    .line 220
    iget-object v4, p0, LZ0/h;->e:Landroid/util/SparseArray;

    .line 221
    .line 222
    iget v5, v3, LZ0/s;->a:I

    .line 223
    .line 224
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, LZ0/h$b;

    .line 229
    .line 230
    iget v3, v3, LZ0/s;->a:I

    .line 231
    .line 232
    invoke-virtual {p0, v11, v3}, LZ0/h;->j(Landroid/util/SparseArray;I)LZ0/d;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v4, v2, v3}, LZ0/h$b;->j(LZ0/v;LZ0/d;)V

    .line 237
    .line 238
    .line 239
    add-int/lit8 v1, v1, 0x1

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_8
    :goto_7
    return-void
.end method

.method public final w(J)V
    .locals 13

    .line 1
    :cond_0
    iget-object v0, p0, LZ0/h;->o:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, LZ0/h;->o:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LZ0/h$a;

    .line 16
    .line 17
    iget v1, p0, LZ0/h;->x:I

    .line 18
    .line 19
    iget v2, v0, LZ0/h$a;->c:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, p0, LZ0/h;->x:I

    .line 23
    .line 24
    iget-wide v1, v0, LZ0/h$a;->a:J

    .line 25
    .line 26
    iget-boolean v3, v0, LZ0/h$a;->b:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-long/2addr v1, p1

    .line 31
    :cond_1
    iget-object v3, p0, LZ0/h;->k:Lg0/E;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, Lg0/E;->a(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    :cond_2
    iget-object v10, p0, LZ0/h;->H:[LF0/T;

    .line 40
    .line 41
    array-length v11, v10

    .line 42
    const/4 v3, 0x0

    .line 43
    move v12, v3

    .line 44
    :goto_0
    if-ge v12, v11, :cond_0

    .line 45
    .line 46
    aget-object v3, v10, v12

    .line 47
    .line 48
    iget v7, v0, LZ0/h$a;->c:I

    .line 49
    .line 50
    iget v8, p0, LZ0/h;->x:I

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v6, 0x1

    .line 54
    move-wide v4, v1

    .line 55
    invoke-interface/range {v3 .. v9}, LF0/T;->b(JIIILF0/T$a;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v12, v12, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return-void
.end method
