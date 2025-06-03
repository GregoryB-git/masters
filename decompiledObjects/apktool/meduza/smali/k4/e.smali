.class public final Lk4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/e$b;,
        Lk4/e$a;
    }
.end annotation


# static fields
.field public static final I:[B

.field public static final J:Lv3/i0;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:Z

.field public E:Lc4/j;

.field public F:[Lc4/v;

.field public G:[Lc4/v;

.field public H:Z

.field public final a:I

.field public final b:Lk4/j;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lk4/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lv5/u;

.field public final f:Lv5/u;

.field public final g:Lv5/u;

.field public final h:[B

.field public final i:Lv5/u;

.field public final j:Lv5/c0;

.field public final k:Lr4/c;

.field public final l:Lv5/u;

.field public final m:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lk4/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lk4/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lc4/v;

.field public p:I

.field public q:I

.field public r:J

.field public s:I

.field public t:Lv5/u;

.field public u:J

.field public v:I

.field public w:J

.field public x:J

.field public y:J

.field public z:Lk4/e$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lk4/e;->I:[B

    .line 9
    .line 10
    new-instance v0, Lv3/i0$a;

    .line 11
    .line 12
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    iput-object v1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv3/i0$a;->a()Lv3/i0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lk4/e;->J:Lv3/i0;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v2, v0}, Lk4/e;-><init>(ILv5/c0;Lk4/j;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILv5/c0;Lk4/j;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv5/c0;",
            "Lk4/j;",
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lk4/e;-><init>(ILv5/c0;Lk4/j;Ljava/util/List;Lc4/v;)V

    return-void
.end method

.method public constructor <init>(ILv5/c0;Lk4/j;Ljava/util/List;Lc4/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv5/c0;",
            "Lk4/j;",
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;",
            "Lc4/v;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk4/e;->a:I

    iput-object p2, p0, Lk4/e;->j:Lv5/c0;

    iput-object p3, p0, Lk4/e;->b:Lk4/j;

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk4/e;->c:Ljava/util/List;

    iput-object p5, p0, Lk4/e;->o:Lc4/v;

    new-instance p1, Lr4/c;

    invoke-direct {p1}, Lr4/c;-><init>()V

    iput-object p1, p0, Lk4/e;->k:Lr4/c;

    new-instance p1, Lv5/u;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lv5/u;-><init>(I)V

    iput-object p1, p0, Lk4/e;->l:Lv5/u;

    new-instance p1, Lv5/u;

    sget-object p3, Lv5/q;->a:[B

    invoke-direct {p1, p3}, Lv5/u;-><init>([B)V

    iput-object p1, p0, Lk4/e;->e:Lv5/u;

    new-instance p1, Lv5/u;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lv5/u;-><init>(I)V

    iput-object p1, p0, Lk4/e;->f:Lv5/u;

    new-instance p1, Lv5/u;

    invoke-direct {p1}, Lv5/u;-><init>()V

    iput-object p1, p0, Lk4/e;->g:Lv5/u;

    new-array p1, p2, [B

    iput-object p1, p0, Lk4/e;->h:[B

    new-instance p2, Lv5/u;

    invoke-direct {p2, p1}, Lv5/u;-><init>([B)V

    iput-object p2, p0, Lk4/e;->i:Lv5/u;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lk4/e;->m:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lk4/e;->n:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lk4/e;->d:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk4/e;->x:J

    iput-wide p1, p0, Lk4/e;->w:J

    iput-wide p1, p0, Lk4/e;->y:J

    sget-object p1, Lc4/j;->i:Lc4/j$a;

    iput-object p1, p0, Lk4/e;->E:Lc4/j;

    const/4 p1, 0x0

    new-array p2, p1, [Lc4/v;

    iput-object p2, p0, Lk4/e;->F:[Lc4/v;

    new-array p1, p1, [Lc4/v;

    iput-object p1, p0, Lk4/e;->G:[Lc4/v;

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)La4/d;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Lk4/a$b;

    .line 16
    .line 17
    iget v6, v5, Lk4/a;->a:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, Lk4/a$b;->b:Lv5/u;

    .line 32
    .line 33
    iget-object v5, v5, Lv5/u;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, Lk4/h;->b([B)Lk4/h$a;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v6, v6, Lk4/h$a;->a:Ljava/util/UUID;

    .line 44
    .line 45
    :goto_1
    if-nez v6, :cond_2

    .line 46
    .line 47
    const-string v5, "FragmentedMp4Extractor"

    .line 48
    .line 49
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 50
    .line 51
    invoke-static {v5, v6}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    new-instance v7, La4/d$b;

    .line 56
    .line 57
    const-string v8, "video/mp4"

    .line 58
    .line 59
    invoke-direct {v7, v6, v1, v8, v5}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    if-nez v4, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    new-instance p0, La4/d;

    .line 72
    .line 73
    new-array v0, v2, [La4/d$b;

    .line 74
    .line 75
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, [La4/d$b;

    .line 80
    .line 81
    invoke-direct {p0, v1, v2, v0}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    .line 82
    .line 83
    .line 84
    move-object v1, p0

    .line 85
    :goto_3
    return-object v1
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

.method public static c(Lv5/u;ILk4/l;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv5/u;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lv5/u;->f()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const v0, 0xffffff

    .line 11
    .line 12
    .line 13
    and-int/2addr p1, v0

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
    const/4 v1, 0x1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    invoke-virtual {p0}, Lv5/u;->y()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iget-object p0, p2, Lk4/l;->l:[Z

    .line 34
    .line 35
    iget p1, p2, Lk4/l;->e:I

    .line 36
    .line 37
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget v3, p2, Lk4/l;->e:I

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, Lk4/l;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lv5/u;->c:I

    .line 51
    .line 52
    iget v2, p0, Lv5/u;->b:I

    .line 53
    .line 54
    sub-int/2addr p1, v2

    .line 55
    iget-object v2, p2, Lk4/l;->n:Lv5/u;

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Lv5/u;->D(I)V

    .line 58
    .line 59
    .line 60
    iput-boolean v1, p2, Lk4/l;->k:Z

    .line 61
    .line 62
    iput-boolean v1, p2, Lk4/l;->o:Z

    .line 63
    .line 64
    iget-object p1, p2, Lk4/l;->n:Lv5/u;

    .line 65
    .line 66
    iget-object v1, p1, Lv5/u;->a:[B

    .line 67
    .line 68
    iget p1, p1, Lv5/u;->c:I

    .line 69
    .line 70
    invoke-virtual {p0, v1, v0, p1}, Lv5/u;->d([BII)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p2, Lk4/l;->n:Lv5/u;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lv5/u;->G(I)V

    .line 76
    .line 77
    .line 78
    iput-boolean v0, p2, Lk4/l;->o:Z

    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const-string p0, "Senc sample count "

    .line 82
    .line 83
    const-string p1, " is different from fragment sample count"

    .line 84
    .line 85
    invoke-static {p0, v2, p1}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget p1, p2, Lk4/l;->e:I

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-static {p0, p1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0

    .line 104
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 105
    .line 106
    invoke-static {p0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    throw p0
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
.method public final b(Lc4/j;)V
    .locals 12

    .line 1
    iput-object p1, p0, Lk4/e;->E:Lc4/j;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lk4/e;->p:I

    .line 5
    .line 6
    iput v0, p0, Lk4/e;->s:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Lc4/v;

    .line 10
    .line 11
    iput-object v1, p0, Lk4/e;->F:[Lc4/v;

    .line 12
    .line 13
    iget-object v2, p0, Lk4/e;->o:Lc4/v;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    aput-object v2, v1, v0

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    iget v3, p0, Lk4/e;->a:I

    .line 23
    .line 24
    and-int/lit8 v3, v3, 0x4

    .line 25
    .line 26
    const/16 v4, 0x64

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    const/16 v5, 0x65

    .line 33
    .line 34
    const/4 v6, 0x5

    .line 35
    invoke-interface {p1, v4, v6}, Lc4/j;->r(II)Lc4/v;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    aput-object v4, v1, v2

    .line 40
    .line 41
    move v2, v3

    .line 42
    move v4, v5

    .line 43
    :cond_1
    iget-object v1, p0, Lk4/e;->F:[Lc4/v;

    .line 44
    .line 45
    invoke-static {v2, v1}, Lv5/e0;->K(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, [Lc4/v;

    .line 50
    .line 51
    iput-object v1, p0, Lk4/e;->F:[Lc4/v;

    .line 52
    .line 53
    array-length v2, v1

    .line 54
    move v3, v0

    .line 55
    :goto_1
    if-ge v3, v2, :cond_2

    .line 56
    .line 57
    aget-object v5, v1, v3

    .line 58
    .line 59
    sget-object v6, Lk4/e;->J:Lv3/i0;

    .line 60
    .line 61
    invoke-interface {v5, v6}, Lc4/v;->d(Lv3/i0;)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    iget-object v1, p0, Lk4/e;->c:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    new-array v1, v1, [Lc4/v;

    .line 74
    .line 75
    iput-object v1, p0, Lk4/e;->G:[Lc4/v;

    .line 76
    .line 77
    move v1, v0

    .line 78
    :goto_2
    iget-object v2, p0, Lk4/e;->G:[Lc4/v;

    .line 79
    .line 80
    array-length v2, v2

    .line 81
    if-ge v1, v2, :cond_3

    .line 82
    .line 83
    iget-object v2, p0, Lk4/e;->E:Lc4/j;

    .line 84
    .line 85
    add-int/lit8 v3, v4, 0x1

    .line 86
    .line 87
    const/4 v5, 0x3

    .line 88
    invoke-interface {v2, v4, v5}, Lc4/j;->r(II)Lc4/v;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v4, p0, Lk4/e;->c:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Lv3/i0;

    .line 99
    .line 100
    invoke-interface {v2, v4}, Lc4/v;->d(Lv3/i0;)V

    .line 101
    .line 102
    .line 103
    iget-object v4, p0, Lk4/e;->G:[Lc4/v;

    .line 104
    .line 105
    aput-object v2, v4, v1

    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    move v4, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    iget-object v1, p0, Lk4/e;->b:Lk4/j;

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    new-instance v2, Lk4/e$b;

    .line 116
    .line 117
    iget v1, v1, Lk4/j;->b:I

    .line 118
    .line 119
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v1, Lk4/m;

    .line 124
    .line 125
    iget-object v4, p0, Lk4/e;->b:Lk4/j;

    .line 126
    .line 127
    new-array v5, v0, [J

    .line 128
    .line 129
    new-array v6, v0, [I

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    new-array v8, v0, [J

    .line 133
    .line 134
    new-array v9, v0, [I

    .line 135
    .line 136
    const-wide/16 v10, 0x0

    .line 137
    .line 138
    move-object v3, v1

    .line 139
    invoke-direct/range {v3 .. v11}, Lk4/m;-><init>(Lk4/j;[J[II[J[IJ)V

    .line 140
    .line 141
    .line 142
    new-instance v3, Lk4/c;

    .line 143
    .line 144
    invoke-direct {v3, v0, v0, v0, v0}, Lk4/c;-><init>(IIII)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v2, p1, v1, v3}, Lk4/e$b;-><init>(Lc4/v;Lk4/m;Lk4/c;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lk4/e;->d:Landroid/util/SparseArray;

    .line 151
    .line 152
    invoke-virtual {p1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lk4/e;->E:Lc4/j;

    .line 156
    .line 157
    invoke-interface {p1}, Lc4/j;->m()V

    .line 158
    .line 159
    .line 160
    :cond_4
    return-void
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

.method public final d(Lc4/i;Lc4/s;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    iget v2, v0, Lk4/e;->p:I

    .line 6
    .line 7
    const v3, 0x656d7367

    .line 8
    .line 9
    .line 10
    const v4, 0x73696478

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    if-eqz v2, :cond_3e

    .line 18
    .line 19
    const-string v9, "FragmentedMp4Extractor"

    .line 20
    .line 21
    if-eq v2, v7, :cond_2e

    .line 22
    .line 23
    const-wide v3, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v7, 0x3

    .line 29
    if-eq v2, v6, :cond_28

    .line 30
    .line 31
    iget-object v2, v0, Lk4/e;->z:Lk4/e$b;

    .line 32
    .line 33
    if-nez v2, :cond_9

    .line 34
    .line 35
    iget-object v2, v0, Lk4/e;->d:Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    move-wide v10, v3

    .line 42
    move-object v3, v5

    .line 43
    move v4, v8

    .line 44
    :goto_1
    if-ge v4, v6, :cond_4

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    check-cast v12, Lk4/e$b;

    .line 51
    .line 52
    iget-boolean v13, v12, Lk4/e$b;->l:Z

    .line 53
    .line 54
    if-nez v13, :cond_0

    .line 55
    .line 56
    iget v14, v12, Lk4/e$b;->f:I

    .line 57
    .line 58
    iget-object v15, v12, Lk4/e$b;->d:Lk4/m;

    .line 59
    .line 60
    iget v15, v15, Lk4/m;->b:I

    .line 61
    .line 62
    if-eq v14, v15, :cond_3

    .line 63
    .line 64
    :cond_0
    if-eqz v13, :cond_1

    .line 65
    .line 66
    iget v14, v12, Lk4/e$b;->h:I

    .line 67
    .line 68
    iget-object v15, v12, Lk4/e$b;->b:Lk4/l;

    .line 69
    .line 70
    iget v15, v15, Lk4/l;->d:I

    .line 71
    .line 72
    if-ne v14, v15, :cond_1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_1
    if-nez v13, :cond_2

    .line 76
    .line 77
    iget-object v13, v12, Lk4/e$b;->d:Lk4/m;

    .line 78
    .line 79
    iget-object v13, v13, Lk4/m;->c:[J

    .line 80
    .line 81
    iget v14, v12, Lk4/e$b;->f:I

    .line 82
    .line 83
    aget-wide v14, v13, v14

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    iget-object v13, v12, Lk4/e$b;->b:Lk4/l;

    .line 87
    .line 88
    iget-object v13, v13, Lk4/l;->f:[J

    .line 89
    .line 90
    iget v14, v12, Lk4/e$b;->h:I

    .line 91
    .line 92
    aget-wide v14, v13, v14

    .line 93
    .line 94
    :goto_2
    cmp-long v13, v14, v10

    .line 95
    .line 96
    if-gez v13, :cond_3

    .line 97
    .line 98
    move-object v3, v12

    .line 99
    move-wide v10, v14

    .line 100
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    if-nez v3, :cond_6

    .line 104
    .line 105
    iget-wide v2, v0, Lk4/e;->u:J

    .line 106
    .line 107
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    sub-long/2addr v2, v6

    .line 112
    long-to-int v2, v2

    .line 113
    if-ltz v2, :cond_5

    .line 114
    .line 115
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 116
    .line 117
    .line 118
    iput v8, v0, Lk4/e;->p:I

    .line 119
    .line 120
    iput v8, v0, Lk4/e;->s:I

    .line 121
    .line 122
    goto/16 :goto_13

    .line 123
    .line 124
    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    .line 125
    .line 126
    invoke-static {v1, v5}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    throw v1

    .line 131
    :cond_6
    iget-boolean v2, v3, Lk4/e$b;->l:Z

    .line 132
    .line 133
    if-nez v2, :cond_7

    .line 134
    .line 135
    iget-object v2, v3, Lk4/e$b;->d:Lk4/m;

    .line 136
    .line 137
    iget-object v2, v2, Lk4/m;->c:[J

    .line 138
    .line 139
    iget v4, v3, Lk4/e$b;->f:I

    .line 140
    .line 141
    aget-wide v10, v2, v4

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    iget-object v2, v3, Lk4/e$b;->b:Lk4/l;

    .line 145
    .line 146
    iget-object v2, v2, Lk4/l;->f:[J

    .line 147
    .line 148
    iget v4, v3, Lk4/e$b;->h:I

    .line 149
    .line 150
    aget-wide v10, v2, v4

    .line 151
    .line 152
    :goto_4
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 153
    .line 154
    .line 155
    move-result-wide v12

    .line 156
    sub-long/2addr v10, v12

    .line 157
    long-to-int v2, v10

    .line 158
    if-gez v2, :cond_8

    .line 159
    .line 160
    const-string v2, "Ignoring negative offset to sample data."

    .line 161
    .line 162
    invoke-static {v9, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    move v2, v8

    .line 166
    :cond_8
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 167
    .line 168
    .line 169
    iput-object v3, v0, Lk4/e;->z:Lk4/e$b;

    .line 170
    .line 171
    move-object v2, v3

    .line 172
    :cond_9
    iget v3, v0, Lk4/e;->p:I

    .line 173
    .line 174
    const/4 v4, 0x6

    .line 175
    if-ne v3, v7, :cond_13

    .line 176
    .line 177
    iget-boolean v3, v2, Lk4/e$b;->l:Z

    .line 178
    .line 179
    if-nez v3, :cond_a

    .line 180
    .line 181
    iget-object v3, v2, Lk4/e$b;->d:Lk4/m;

    .line 182
    .line 183
    iget-object v3, v3, Lk4/m;->d:[I

    .line 184
    .line 185
    iget v6, v2, Lk4/e$b;->f:I

    .line 186
    .line 187
    aget v3, v3, v6

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_a
    iget-object v3, v2, Lk4/e$b;->b:Lk4/l;

    .line 191
    .line 192
    iget-object v3, v3, Lk4/l;->h:[I

    .line 193
    .line 194
    iget v6, v2, Lk4/e$b;->f:I

    .line 195
    .line 196
    aget v3, v3, v6

    .line 197
    .line 198
    :goto_5
    iput v3, v0, Lk4/e;->A:I

    .line 199
    .line 200
    iget v6, v2, Lk4/e$b;->f:I

    .line 201
    .line 202
    iget v9, v2, Lk4/e$b;->i:I

    .line 203
    .line 204
    if-ge v6, v9, :cond_10

    .line 205
    .line 206
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lk4/e$b;->a()Lk4/k;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-nez v3, :cond_b

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_b
    iget-object v6, v2, Lk4/e$b;->b:Lk4/l;

    .line 217
    .line 218
    iget-object v6, v6, Lk4/l;->n:Lv5/u;

    .line 219
    .line 220
    iget v3, v3, Lk4/k;->d:I

    .line 221
    .line 222
    if-eqz v3, :cond_c

    .line 223
    .line 224
    invoke-virtual {v6, v3}, Lv5/u;->H(I)V

    .line 225
    .line 226
    .line 227
    :cond_c
    iget-object v3, v2, Lk4/e$b;->b:Lk4/l;

    .line 228
    .line 229
    iget v9, v2, Lk4/e$b;->f:I

    .line 230
    .line 231
    iget-boolean v10, v3, Lk4/l;->k:Z

    .line 232
    .line 233
    if-eqz v10, :cond_d

    .line 234
    .line 235
    iget-object v3, v3, Lk4/l;->l:[Z

    .line 236
    .line 237
    aget-boolean v3, v3, v9

    .line 238
    .line 239
    if-eqz v3, :cond_d

    .line 240
    .line 241
    const/4 v8, 0x1

    .line 242
    :cond_d
    if-eqz v8, :cond_e

    .line 243
    .line 244
    invoke-virtual {v6}, Lv5/u;->A()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    mul-int/2addr v3, v4

    .line 249
    invoke-virtual {v6, v3}, Lv5/u;->H(I)V

    .line 250
    .line 251
    .line 252
    :cond_e
    :goto_6
    invoke-virtual {v2}, Lk4/e$b;->b()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-nez v2, :cond_f

    .line 257
    .line 258
    iput-object v5, v0, Lk4/e;->z:Lk4/e$b;

    .line 259
    .line 260
    :cond_f
    iput v7, v0, Lk4/e;->p:I

    .line 261
    .line 262
    goto/16 :goto_12

    .line 263
    .line 264
    :cond_10
    iget-object v6, v2, Lk4/e$b;->d:Lk4/m;

    .line 265
    .line 266
    iget-object v6, v6, Lk4/m;->a:Lk4/j;

    .line 267
    .line 268
    iget v6, v6, Lk4/j;->g:I

    .line 269
    .line 270
    const/4 v7, 0x1

    .line 271
    if-ne v6, v7, :cond_11

    .line 272
    .line 273
    add-int/lit8 v3, v3, -0x8

    .line 274
    .line 275
    iput v3, v0, Lk4/e;->A:I

    .line 276
    .line 277
    const/16 v3, 0x8

    .line 278
    .line 279
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 280
    .line 281
    .line 282
    :cond_11
    iget-object v3, v2, Lk4/e$b;->d:Lk4/m;

    .line 283
    .line 284
    iget-object v3, v3, Lk4/m;->a:Lk4/j;

    .line 285
    .line 286
    iget-object v3, v3, Lk4/j;->f:Lv3/i0;

    .line 287
    .line 288
    iget-object v3, v3, Lv3/i0;->t:Ljava/lang/String;

    .line 289
    .line 290
    const-string v6, "audio/ac4"

    .line 291
    .line 292
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_12

    .line 297
    .line 298
    iget v3, v0, Lk4/e;->A:I

    .line 299
    .line 300
    const/4 v6, 0x7

    .line 301
    invoke-virtual {v2, v3, v6}, Lk4/e$b;->c(II)I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    iput v3, v0, Lk4/e;->B:I

    .line 306
    .line 307
    iget v3, v0, Lk4/e;->A:I

    .line 308
    .line 309
    iget-object v7, v0, Lk4/e;->i:Lv5/u;

    .line 310
    .line 311
    invoke-static {v3, v7}, Lx3/c;->a(ILv5/u;)V

    .line 312
    .line 313
    .line 314
    iget-object v3, v2, Lk4/e$b;->a:Lc4/v;

    .line 315
    .line 316
    iget-object v7, v0, Lk4/e;->i:Lv5/u;

    .line 317
    .line 318
    invoke-interface {v3, v6, v7}, Lc4/v;->b(ILv5/u;)V

    .line 319
    .line 320
    .line 321
    iget v3, v0, Lk4/e;->B:I

    .line 322
    .line 323
    add-int/2addr v3, v6

    .line 324
    goto :goto_7

    .line 325
    :cond_12
    iget v3, v0, Lk4/e;->A:I

    .line 326
    .line 327
    invoke-virtual {v2, v3, v8}, Lk4/e$b;->c(II)I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    :goto_7
    iput v3, v0, Lk4/e;->B:I

    .line 332
    .line 333
    iget v6, v0, Lk4/e;->A:I

    .line 334
    .line 335
    add-int/2addr v6, v3

    .line 336
    iput v6, v0, Lk4/e;->A:I

    .line 337
    .line 338
    const/4 v3, 0x4

    .line 339
    iput v3, v0, Lk4/e;->p:I

    .line 340
    .line 341
    iput v8, v0, Lk4/e;->C:I

    .line 342
    .line 343
    :cond_13
    iget-object v3, v2, Lk4/e$b;->d:Lk4/m;

    .line 344
    .line 345
    iget-object v6, v3, Lk4/m;->a:Lk4/j;

    .line 346
    .line 347
    iget-object v9, v2, Lk4/e$b;->a:Lc4/v;

    .line 348
    .line 349
    iget-boolean v7, v2, Lk4/e$b;->l:Z

    .line 350
    .line 351
    if-nez v7, :cond_14

    .line 352
    .line 353
    iget-object v3, v3, Lk4/m;->f:[J

    .line 354
    .line 355
    iget v7, v2, Lk4/e$b;->f:I

    .line 356
    .line 357
    aget-wide v10, v3, v7

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_14
    iget-object v3, v2, Lk4/e$b;->b:Lk4/l;

    .line 361
    .line 362
    iget v7, v2, Lk4/e$b;->f:I

    .line 363
    .line 364
    iget-object v3, v3, Lk4/l;->i:[J

    .line 365
    .line 366
    aget-wide v10, v3, v7

    .line 367
    .line 368
    :goto_8
    iget-object v3, v0, Lk4/e;->j:Lv5/c0;

    .line 369
    .line 370
    if-eqz v3, :cond_15

    .line 371
    .line 372
    invoke-virtual {v3, v10, v11}, Lv5/c0;->a(J)J

    .line 373
    .line 374
    .line 375
    move-result-wide v10

    .line 376
    :cond_15
    move-wide v14, v10

    .line 377
    iget v3, v6, Lk4/j;->j:I

    .line 378
    .line 379
    if-eqz v3, :cond_1d

    .line 380
    .line 381
    iget-object v7, v0, Lk4/e;->f:Lv5/u;

    .line 382
    .line 383
    iget-object v7, v7, Lv5/u;->a:[B

    .line 384
    .line 385
    aput-byte v8, v7, v8

    .line 386
    .line 387
    const/4 v10, 0x1

    .line 388
    aput-byte v8, v7, v10

    .line 389
    .line 390
    const/4 v10, 0x2

    .line 391
    aput-byte v8, v7, v10

    .line 392
    .line 393
    add-int/lit8 v10, v3, 0x1

    .line 394
    .line 395
    rsub-int/lit8 v3, v3, 0x4

    .line 396
    .line 397
    :goto_9
    iget v11, v0, Lk4/e;->B:I

    .line 398
    .line 399
    iget v12, v0, Lk4/e;->A:I

    .line 400
    .line 401
    if-ge v11, v12, :cond_1e

    .line 402
    .line 403
    iget v11, v0, Lk4/e;->C:I

    .line 404
    .line 405
    const-string v12, "video/hevc"

    .line 406
    .line 407
    if-nez v11, :cond_1b

    .line 408
    .line 409
    invoke-interface {v1, v7, v3, v10}, Lc4/i;->readFully([BII)V

    .line 410
    .line 411
    .line 412
    iget-object v11, v0, Lk4/e;->f:Lv5/u;

    .line 413
    .line 414
    invoke-virtual {v11, v8}, Lv5/u;->G(I)V

    .line 415
    .line 416
    .line 417
    iget-object v11, v0, Lk4/e;->f:Lv5/u;

    .line 418
    .line 419
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 420
    .line 421
    .line 422
    move-result v11

    .line 423
    const/4 v13, 0x1

    .line 424
    if-lt v11, v13, :cond_1a

    .line 425
    .line 426
    add-int/lit8 v11, v11, -0x1

    .line 427
    .line 428
    iput v11, v0, Lk4/e;->C:I

    .line 429
    .line 430
    iget-object v11, v0, Lk4/e;->e:Lv5/u;

    .line 431
    .line 432
    invoke-virtual {v11, v8}, Lv5/u;->G(I)V

    .line 433
    .line 434
    .line 435
    iget-object v8, v0, Lk4/e;->e:Lv5/u;

    .line 436
    .line 437
    const/4 v11, 0x4

    .line 438
    invoke-interface {v9, v11, v8}, Lc4/v;->b(ILv5/u;)V

    .line 439
    .line 440
    .line 441
    iget-object v8, v0, Lk4/e;->f:Lv5/u;

    .line 442
    .line 443
    invoke-interface {v9, v13, v8}, Lc4/v;->b(ILv5/u;)V

    .line 444
    .line 445
    .line 446
    iget-object v8, v0, Lk4/e;->G:[Lc4/v;

    .line 447
    .line 448
    array-length v8, v8

    .line 449
    if-lez v8, :cond_19

    .line 450
    .line 451
    iget-object v8, v6, Lk4/j;->f:Lv3/i0;

    .line 452
    .line 453
    iget-object v8, v8, Lv3/i0;->t:Ljava/lang/String;

    .line 454
    .line 455
    aget-byte v11, v7, v11

    .line 456
    .line 457
    sget-object v13, Lv5/q;->a:[B

    .line 458
    .line 459
    const-string v13, "video/avc"

    .line 460
    .line 461
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v13

    .line 465
    if-eqz v13, :cond_16

    .line 466
    .line 467
    and-int/lit8 v13, v11, 0x1f

    .line 468
    .line 469
    if-eq v13, v4, :cond_17

    .line 470
    .line 471
    :cond_16
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-eqz v4, :cond_18

    .line 476
    .line 477
    and-int/lit8 v4, v11, 0x7e

    .line 478
    .line 479
    shr-int/lit8 v4, v4, 0x1

    .line 480
    .line 481
    const/16 v8, 0x27

    .line 482
    .line 483
    if-ne v4, v8, :cond_18

    .line 484
    .line 485
    :cond_17
    const/4 v4, 0x1

    .line 486
    goto :goto_a

    .line 487
    :cond_18
    const/4 v4, 0x0

    .line 488
    :goto_a
    if-eqz v4, :cond_19

    .line 489
    .line 490
    const/4 v4, 0x1

    .line 491
    goto :goto_b

    .line 492
    :cond_19
    const/4 v4, 0x0

    .line 493
    :goto_b
    iput-boolean v4, v0, Lk4/e;->D:Z

    .line 494
    .line 495
    iget v4, v0, Lk4/e;->B:I

    .line 496
    .line 497
    add-int/lit8 v4, v4, 0x5

    .line 498
    .line 499
    iput v4, v0, Lk4/e;->B:I

    .line 500
    .line 501
    iget v4, v0, Lk4/e;->A:I

    .line 502
    .line 503
    add-int/2addr v4, v3

    .line 504
    iput v4, v0, Lk4/e;->A:I

    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_1a
    const-string v1, "Invalid NAL length"

    .line 508
    .line 509
    invoke-static {v1, v5}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    throw v1

    .line 514
    :cond_1b
    iget-boolean v4, v0, Lk4/e;->D:Z

    .line 515
    .line 516
    if-eqz v4, :cond_1c

    .line 517
    .line 518
    iget-object v4, v0, Lk4/e;->g:Lv5/u;

    .line 519
    .line 520
    invoke-virtual {v4, v11}, Lv5/u;->D(I)V

    .line 521
    .line 522
    .line 523
    iget-object v4, v0, Lk4/e;->g:Lv5/u;

    .line 524
    .line 525
    iget-object v4, v4, Lv5/u;->a:[B

    .line 526
    .line 527
    iget v8, v0, Lk4/e;->C:I

    .line 528
    .line 529
    const/4 v11, 0x0

    .line 530
    invoke-interface {v1, v4, v11, v8}, Lc4/i;->readFully([BII)V

    .line 531
    .line 532
    .line 533
    iget-object v4, v0, Lk4/e;->g:Lv5/u;

    .line 534
    .line 535
    iget v8, v0, Lk4/e;->C:I

    .line 536
    .line 537
    invoke-interface {v9, v8, v4}, Lc4/v;->b(ILv5/u;)V

    .line 538
    .line 539
    .line 540
    iget v4, v0, Lk4/e;->C:I

    .line 541
    .line 542
    iget-object v8, v0, Lk4/e;->g:Lv5/u;

    .line 543
    .line 544
    iget-object v11, v8, Lv5/u;->a:[B

    .line 545
    .line 546
    iget v8, v8, Lv5/u;->c:I

    .line 547
    .line 548
    invoke-static {v11, v8}, Lv5/q;->e([BI)I

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    iget-object v11, v0, Lk4/e;->g:Lv5/u;

    .line 553
    .line 554
    iget-object v13, v6, Lk4/j;->f:Lv3/i0;

    .line 555
    .line 556
    iget-object v13, v13, Lv3/i0;->t:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v12

    .line 562
    invoke-virtual {v11, v12}, Lv5/u;->G(I)V

    .line 563
    .line 564
    .line 565
    iget-object v11, v0, Lk4/e;->g:Lv5/u;

    .line 566
    .line 567
    invoke-virtual {v11, v8}, Lv5/u;->F(I)V

    .line 568
    .line 569
    .line 570
    iget-object v8, v0, Lk4/e;->g:Lv5/u;

    .line 571
    .line 572
    iget-object v11, v0, Lk4/e;->G:[Lc4/v;

    .line 573
    .line 574
    invoke-static {v14, v15, v8, v11}, Lc4/b;->a(JLv5/u;[Lc4/v;)V

    .line 575
    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_1c
    const/4 v4, 0x0

    .line 579
    invoke-interface {v9, v1, v11, v4}, Lc4/v;->e(Lt5/h;IZ)I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    :goto_c
    iget v8, v0, Lk4/e;->B:I

    .line 584
    .line 585
    add-int/2addr v8, v4

    .line 586
    iput v8, v0, Lk4/e;->B:I

    .line 587
    .line 588
    iget v8, v0, Lk4/e;->C:I

    .line 589
    .line 590
    sub-int/2addr v8, v4

    .line 591
    iput v8, v0, Lk4/e;->C:I

    .line 592
    .line 593
    :goto_d
    const/4 v4, 0x6

    .line 594
    const/4 v8, 0x0

    .line 595
    goto/16 :goto_9

    .line 596
    .line 597
    :cond_1d
    :goto_e
    iget v3, v0, Lk4/e;->B:I

    .line 598
    .line 599
    iget v4, v0, Lk4/e;->A:I

    .line 600
    .line 601
    if-ge v3, v4, :cond_1e

    .line 602
    .line 603
    sub-int/2addr v4, v3

    .line 604
    const/4 v3, 0x0

    .line 605
    invoke-interface {v9, v1, v4, v3}, Lc4/v;->e(Lt5/h;IZ)I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    iget v4, v0, Lk4/e;->B:I

    .line 610
    .line 611
    add-int/2addr v4, v3

    .line 612
    iput v4, v0, Lk4/e;->B:I

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_1e
    iget-boolean v3, v2, Lk4/e$b;->l:Z

    .line 616
    .line 617
    if-nez v3, :cond_1f

    .line 618
    .line 619
    iget-object v3, v2, Lk4/e$b;->d:Lk4/m;

    .line 620
    .line 621
    iget-object v3, v3, Lk4/m;->g:[I

    .line 622
    .line 623
    iget v4, v2, Lk4/e$b;->f:I

    .line 624
    .line 625
    aget v3, v3, v4

    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_1f
    iget-object v3, v2, Lk4/e$b;->b:Lk4/l;

    .line 629
    .line 630
    iget-object v3, v3, Lk4/l;->j:[Z

    .line 631
    .line 632
    iget v4, v2, Lk4/e$b;->f:I

    .line 633
    .line 634
    aget-boolean v3, v3, v4

    .line 635
    .line 636
    if-eqz v3, :cond_20

    .line 637
    .line 638
    const/4 v3, 0x1

    .line 639
    goto :goto_f

    .line 640
    :cond_20
    const/4 v3, 0x0

    .line 641
    :goto_f
    invoke-virtual {v2}, Lk4/e$b;->a()Lk4/k;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    if-eqz v4, :cond_21

    .line 646
    .line 647
    const/high16 v4, 0x40000000    # 2.0f

    .line 648
    .line 649
    or-int/2addr v3, v4

    .line 650
    :cond_21
    move v12, v3

    .line 651
    invoke-virtual {v2}, Lk4/e$b;->a()Lk4/k;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    if-eqz v3, :cond_22

    .line 656
    .line 657
    iget-object v3, v3, Lk4/k;->c:Lc4/v$a;

    .line 658
    .line 659
    goto :goto_10

    .line 660
    :cond_22
    move-object v3, v5

    .line 661
    :goto_10
    iget v13, v0, Lk4/e;->A:I

    .line 662
    .line 663
    const/4 v4, 0x0

    .line 664
    move-wide v10, v14

    .line 665
    move-wide v6, v14

    .line 666
    move v14, v4

    .line 667
    move-object v15, v3

    .line 668
    invoke-interface/range {v9 .. v15}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 669
    .line 670
    .line 671
    :cond_23
    iget-object v3, v0, Lk4/e;->n:Ljava/util/ArrayDeque;

    .line 672
    .line 673
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    if-nez v3, :cond_26

    .line 678
    .line 679
    iget-object v3, v0, Lk4/e;->n:Ljava/util/ArrayDeque;

    .line 680
    .line 681
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    check-cast v3, Lk4/e$a;

    .line 686
    .line 687
    iget v4, v0, Lk4/e;->v:I

    .line 688
    .line 689
    iget v8, v3, Lk4/e$a;->c:I

    .line 690
    .line 691
    sub-int/2addr v4, v8

    .line 692
    iput v4, v0, Lk4/e;->v:I

    .line 693
    .line 694
    iget-wide v8, v3, Lk4/e$a;->a:J

    .line 695
    .line 696
    iget-boolean v4, v3, Lk4/e$a;->b:Z

    .line 697
    .line 698
    if-eqz v4, :cond_24

    .line 699
    .line 700
    add-long/2addr v8, v6

    .line 701
    :cond_24
    iget-object v4, v0, Lk4/e;->j:Lv5/c0;

    .line 702
    .line 703
    if-eqz v4, :cond_25

    .line 704
    .line 705
    invoke-virtual {v4, v8, v9}, Lv5/c0;->a(J)J

    .line 706
    .line 707
    .line 708
    move-result-wide v8

    .line 709
    :cond_25
    iget-object v4, v0, Lk4/e;->F:[Lc4/v;

    .line 710
    .line 711
    array-length v15, v4

    .line 712
    const/4 v10, 0x0

    .line 713
    move v14, v10

    .line 714
    :goto_11
    if-ge v14, v15, :cond_23

    .line 715
    .line 716
    aget-object v10, v4, v14

    .line 717
    .line 718
    const/4 v13, 0x1

    .line 719
    iget v11, v3, Lk4/e$a;->c:I

    .line 720
    .line 721
    iget v12, v0, Lk4/e;->v:I

    .line 722
    .line 723
    const/16 v16, 0x0

    .line 724
    .line 725
    move/from16 v17, v11

    .line 726
    .line 727
    move/from16 v18, v12

    .line 728
    .line 729
    move-wide v11, v8

    .line 730
    move/from16 v19, v14

    .line 731
    .line 732
    move/from16 v14, v17

    .line 733
    .line 734
    move/from16 v17, v15

    .line 735
    .line 736
    move/from16 v15, v18

    .line 737
    .line 738
    invoke-interface/range {v10 .. v16}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 739
    .line 740
    .line 741
    add-int/lit8 v14, v19, 0x1

    .line 742
    .line 743
    move/from16 v15, v17

    .line 744
    .line 745
    goto :goto_11

    .line 746
    :cond_26
    invoke-virtual {v2}, Lk4/e$b;->b()Z

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    if-nez v2, :cond_27

    .line 751
    .line 752
    iput-object v5, v0, Lk4/e;->z:Lk4/e$b;

    .line 753
    .line 754
    :cond_27
    const/4 v2, 0x3

    .line 755
    iput v2, v0, Lk4/e;->p:I

    .line 756
    .line 757
    :goto_12
    const/4 v8, 0x1

    .line 758
    :goto_13
    if-eqz v8, :cond_2b

    .line 759
    .line 760
    const/4 v1, 0x0

    .line 761
    return v1

    .line 762
    :cond_28
    iget-object v2, v0, Lk4/e;->d:Landroid/util/SparseArray;

    .line 763
    .line 764
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    const/4 v6, 0x0

    .line 769
    move-object v7, v5

    .line 770
    :goto_14
    if-ge v6, v2, :cond_2a

    .line 771
    .line 772
    iget-object v8, v0, Lk4/e;->d:Landroid/util/SparseArray;

    .line 773
    .line 774
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v8

    .line 778
    check-cast v8, Lk4/e$b;

    .line 779
    .line 780
    iget-object v8, v8, Lk4/e$b;->b:Lk4/l;

    .line 781
    .line 782
    iget-boolean v9, v8, Lk4/l;->o:Z

    .line 783
    .line 784
    if-eqz v9, :cond_29

    .line 785
    .line 786
    iget-wide v8, v8, Lk4/l;->c:J

    .line 787
    .line 788
    cmp-long v10, v8, v3

    .line 789
    .line 790
    if-gez v10, :cond_29

    .line 791
    .line 792
    iget-object v3, v0, Lk4/e;->d:Landroid/util/SparseArray;

    .line 793
    .line 794
    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    move-object v7, v3

    .line 799
    check-cast v7, Lk4/e$b;

    .line 800
    .line 801
    move-wide v3, v8

    .line 802
    :cond_29
    add-int/lit8 v6, v6, 0x1

    .line 803
    .line 804
    goto :goto_14

    .line 805
    :cond_2a
    if-nez v7, :cond_2c

    .line 806
    .line 807
    const/4 v2, 0x3

    .line 808
    iput v2, v0, Lk4/e;->p:I

    .line 809
    .line 810
    :cond_2b
    :goto_15
    move-object v7, v0

    .line 811
    goto/16 :goto_29

    .line 812
    .line 813
    :cond_2c
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 814
    .line 815
    .line 816
    move-result-wide v8

    .line 817
    sub-long/2addr v3, v8

    .line 818
    long-to-int v2, v3

    .line 819
    if-ltz v2, :cond_2d

    .line 820
    .line 821
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 822
    .line 823
    .line 824
    iget-object v2, v7, Lk4/e$b;->b:Lk4/l;

    .line 825
    .line 826
    iget-object v3, v2, Lk4/l;->n:Lv5/u;

    .line 827
    .line 828
    iget-object v4, v3, Lv5/u;->a:[B

    .line 829
    .line 830
    iget v3, v3, Lv5/u;->c:I

    .line 831
    .line 832
    const/4 v5, 0x0

    .line 833
    invoke-interface {v1, v4, v5, v3}, Lc4/i;->readFully([BII)V

    .line 834
    .line 835
    .line 836
    iget-object v3, v2, Lk4/l;->n:Lv5/u;

    .line 837
    .line 838
    invoke-virtual {v3, v5}, Lv5/u;->G(I)V

    .line 839
    .line 840
    .line 841
    iput-boolean v5, v2, Lk4/l;->o:Z

    .line 842
    .line 843
    goto :goto_15

    .line 844
    :cond_2d
    const-string v1, "Offset to encryption data was negative."

    .line 845
    .line 846
    invoke-static {v1, v5}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    throw v1

    .line 851
    :cond_2e
    iget-wide v5, v0, Lk4/e;->r:J

    .line 852
    .line 853
    long-to-int v2, v5

    .line 854
    iget v5, v0, Lk4/e;->s:I

    .line 855
    .line 856
    sub-int/2addr v2, v5

    .line 857
    iget-object v5, v0, Lk4/e;->t:Lv5/u;

    .line 858
    .line 859
    if-eqz v5, :cond_3d

    .line 860
    .line 861
    iget-object v6, v5, Lv5/u;->a:[B

    .line 862
    .line 863
    const/16 v7, 0x8

    .line 864
    .line 865
    invoke-interface {v1, v6, v7, v2}, Lc4/i;->readFully([BII)V

    .line 866
    .line 867
    .line 868
    new-instance v2, Lk4/a$b;

    .line 869
    .line 870
    iget v6, v0, Lk4/e;->q:I

    .line 871
    .line 872
    invoke-direct {v2, v6, v5}, Lk4/a$b;-><init>(ILv5/u;)V

    .line 873
    .line 874
    .line 875
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 876
    .line 877
    .line 878
    move-result-wide v7

    .line 879
    iget-object v10, v0, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 880
    .line 881
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 882
    .line 883
    .line 884
    move-result v10

    .line 885
    if-nez v10, :cond_2f

    .line 886
    .line 887
    iget-object v3, v0, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 888
    .line 889
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    check-cast v3, Lk4/a$a;

    .line 894
    .line 895
    iget-object v3, v3, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 896
    .line 897
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-object v7, v0

    .line 901
    goto/16 :goto_1e

    .line 902
    .line 903
    :cond_2f
    if-ne v6, v4, :cond_33

    .line 904
    .line 905
    const/16 v1, 0x8

    .line 906
    .line 907
    invoke-virtual {v5, v1}, Lv5/u;->G(I)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v5}, Lv5/u;->f()I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    shr-int/lit8 v1, v1, 0x18

    .line 915
    .line 916
    and-int/lit16 v1, v1, 0xff

    .line 917
    .line 918
    const/4 v2, 0x4

    .line 919
    invoke-virtual {v5, v2}, Lv5/u;->H(I)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 923
    .line 924
    .line 925
    move-result-wide v2

    .line 926
    if-nez v1, :cond_30

    .line 927
    .line 928
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 929
    .line 930
    .line 931
    move-result-wide v9

    .line 932
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 933
    .line 934
    .line 935
    move-result-wide v11

    .line 936
    goto :goto_16

    .line 937
    :cond_30
    invoke-virtual {v5}, Lv5/u;->z()J

    .line 938
    .line 939
    .line 940
    move-result-wide v9

    .line 941
    invoke-virtual {v5}, Lv5/u;->z()J

    .line 942
    .line 943
    .line 944
    move-result-wide v11

    .line 945
    :goto_16
    move-wide v15, v9

    .line 946
    add-long v6, v11, v7

    .line 947
    .line 948
    const-wide/32 v11, 0xf4240

    .line 949
    .line 950
    .line 951
    move-wide v9, v15

    .line 952
    move-wide v13, v2

    .line 953
    invoke-static/range {v9 .. v14}, Lv5/e0;->O(JJJ)J

    .line 954
    .line 955
    .line 956
    move-result-wide v17

    .line 957
    const/4 v1, 0x2

    .line 958
    invoke-virtual {v5, v1}, Lv5/u;->H(I)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v5}, Lv5/u;->A()I

    .line 962
    .line 963
    .line 964
    move-result v1

    .line 965
    new-array v4, v1, [I

    .line 966
    .line 967
    new-array v8, v1, [J

    .line 968
    .line 969
    new-array v13, v1, [J

    .line 970
    .line 971
    new-array v14, v1, [J

    .line 972
    .line 973
    const/4 v9, 0x0

    .line 974
    move-wide/from16 v11, v17

    .line 975
    .line 976
    move-wide/from16 v26, v15

    .line 977
    .line 978
    move v15, v9

    .line 979
    move-wide/from16 v9, v26

    .line 980
    .line 981
    :goto_17
    if-ge v15, v1, :cond_32

    .line 982
    .line 983
    invoke-virtual {v5}, Lv5/u;->f()I

    .line 984
    .line 985
    .line 986
    move-result v16

    .line 987
    const/high16 v19, -0x80000000

    .line 988
    .line 989
    and-int v19, v16, v19

    .line 990
    .line 991
    if-nez v19, :cond_31

    .line 992
    .line 993
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 994
    .line 995
    .line 996
    move-result-wide v19

    .line 997
    const v21, 0x7fffffff

    .line 998
    .line 999
    .line 1000
    and-int v16, v16, v21

    .line 1001
    .line 1002
    aput v16, v4, v15

    .line 1003
    .line 1004
    aput-wide v6, v8, v15

    .line 1005
    .line 1006
    aput-wide v11, v14, v15

    .line 1007
    .line 1008
    add-long v19, v9, v19

    .line 1009
    .line 1010
    const-wide/32 v11, 0xf4240

    .line 1011
    .line 1012
    .line 1013
    move-wide/from16 v9, v19

    .line 1014
    .line 1015
    move/from16 p2, v1

    .line 1016
    .line 1017
    move-object v1, v13

    .line 1018
    move-object v0, v14

    .line 1019
    move-wide v13, v2

    .line 1020
    invoke-static/range {v9 .. v14}, Lv5/e0;->O(JJJ)J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v11

    .line 1024
    aget-wide v9, v0, v15

    .line 1025
    .line 1026
    sub-long v9, v11, v9

    .line 1027
    .line 1028
    aput-wide v9, v1, v15

    .line 1029
    .line 1030
    const/4 v9, 0x4

    .line 1031
    invoke-virtual {v5, v9}, Lv5/u;->H(I)V

    .line 1032
    .line 1033
    .line 1034
    aget v9, v4, v15

    .line 1035
    .line 1036
    int-to-long v9, v9

    .line 1037
    add-long/2addr v6, v9

    .line 1038
    add-int/lit8 v15, v15, 0x1

    .line 1039
    .line 1040
    move-object v14, v0

    .line 1041
    move-object v13, v1

    .line 1042
    move-wide/from16 v9, v19

    .line 1043
    .line 1044
    move-object/from16 v0, p0

    .line 1045
    .line 1046
    move/from16 v1, p2

    .line 1047
    .line 1048
    goto :goto_17

    .line 1049
    :cond_31
    const-string v0, "Unhandled indirect reference"

    .line 1050
    .line 1051
    const/4 v1, 0x0

    .line 1052
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    throw v0

    .line 1057
    :cond_32
    move-object v1, v13

    .line 1058
    move-object v0, v14

    .line 1059
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    new-instance v3, Lc4/c;

    .line 1064
    .line 1065
    invoke-direct {v3, v4, v8, v1, v0}, Lc4/c;-><init>([I[J[J[J)V

    .line 1066
    .line 1067
    .line 1068
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v1, Ljava/lang/Long;

    .line 1075
    .line 1076
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1077
    .line 1078
    .line 1079
    move-result-wide v1

    .line 1080
    move-object/from16 v7, p0

    .line 1081
    .line 1082
    iput-wide v1, v7, Lk4/e;->y:J

    .line 1083
    .line 1084
    iget-object v1, v7, Lk4/e;->E:Lc4/j;

    .line 1085
    .line 1086
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v0, Lc4/t;

    .line 1089
    .line 1090
    invoke-interface {v1, v0}, Lc4/j;->t(Lc4/t;)V

    .line 1091
    .line 1092
    .line 1093
    const/4 v0, 0x1

    .line 1094
    iput-boolean v0, v7, Lk4/e;->H:Z

    .line 1095
    .line 1096
    goto/16 :goto_1d

    .line 1097
    .line 1098
    :cond_33
    move-object v7, v0

    .line 1099
    if-ne v6, v3, :cond_3c

    .line 1100
    .line 1101
    iget-object v0, v7, Lk4/e;->F:[Lc4/v;

    .line 1102
    .line 1103
    array-length v0, v0

    .line 1104
    if-nez v0, :cond_34

    .line 1105
    .line 1106
    goto/16 :goto_1d

    .line 1107
    .line 1108
    :cond_34
    const/16 v0, 0x8

    .line 1109
    .line 1110
    invoke-virtual {v5, v0}, Lv5/u;->G(I)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v5}, Lv5/u;->f()I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    shr-int/lit8 v0, v0, 0x18

    .line 1118
    .line 1119
    and-int/lit16 v0, v0, 0xff

    .line 1120
    .line 1121
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    if-eqz v0, :cond_36

    .line 1127
    .line 1128
    const/4 v3, 0x1

    .line 1129
    if-eq v0, v3, :cond_35

    .line 1130
    .line 1131
    const-string v1, "Skipping unsupported emsg version: "

    .line 1132
    .line 1133
    invoke-static {v1, v0, v9}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    goto/16 :goto_1d

    .line 1137
    .line 1138
    :cond_35
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v3

    .line 1142
    invoke-virtual {v5}, Lv5/u;->z()J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v10

    .line 1146
    const-wide/32 v12, 0xf4240

    .line 1147
    .line 1148
    .line 1149
    move-wide v14, v3

    .line 1150
    invoke-static/range {v10 .. v15}, Lv5/e0;->O(JJJ)J

    .line 1151
    .line 1152
    .line 1153
    move-result-wide v8

    .line 1154
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1155
    .line 1156
    .line 1157
    move-result-wide v10

    .line 1158
    const-wide/16 v12, 0x3e8

    .line 1159
    .line 1160
    invoke-static/range {v10 .. v15}, Lv5/e0;->O(JJJ)J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v3

    .line 1164
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1165
    .line 1166
    .line 1167
    move-result-wide v10

    .line 1168
    invoke-virtual {v5}, Lv5/u;->p()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v5}, Lv5/u;->p()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v6

    .line 1179
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    move-object/from16 v19, v0

    .line 1183
    .line 1184
    move-wide v14, v1

    .line 1185
    move-wide/from16 v21, v3

    .line 1186
    .line 1187
    move-object/from16 v20, v6

    .line 1188
    .line 1189
    move-wide/from16 v23, v10

    .line 1190
    .line 1191
    goto :goto_19

    .line 1192
    :cond_36
    invoke-virtual {v5}, Lv5/u;->p()Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v5}, Lv5/u;->p()Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v6

    .line 1203
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1207
    .line 1208
    .line 1209
    move-result-wide v3

    .line 1210
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1211
    .line 1212
    .line 1213
    move-result-wide v8

    .line 1214
    const-wide/32 v10, 0xf4240

    .line 1215
    .line 1216
    .line 1217
    move-wide v12, v3

    .line 1218
    invoke-static/range {v8 .. v13}, Lv5/e0;->O(JJJ)J

    .line 1219
    .line 1220
    .line 1221
    move-result-wide v14

    .line 1222
    iget-wide v8, v7, Lk4/e;->y:J

    .line 1223
    .line 1224
    cmp-long v10, v8, v1

    .line 1225
    .line 1226
    if-eqz v10, :cond_37

    .line 1227
    .line 1228
    add-long/2addr v8, v14

    .line 1229
    move-wide/from16 v16, v8

    .line 1230
    .line 1231
    goto :goto_18

    .line 1232
    :cond_37
    move-wide/from16 v16, v1

    .line 1233
    .line 1234
    :goto_18
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v8

    .line 1238
    const-wide/16 v10, 0x3e8

    .line 1239
    .line 1240
    move-wide v12, v3

    .line 1241
    invoke-static/range {v8 .. v13}, Lv5/e0;->O(JJJ)J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v3

    .line 1245
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 1246
    .line 1247
    .line 1248
    move-result-wide v10

    .line 1249
    move-object/from16 v19, v0

    .line 1250
    .line 1251
    move-wide/from16 v21, v3

    .line 1252
    .line 1253
    move-object/from16 v20, v6

    .line 1254
    .line 1255
    move-wide/from16 v23, v10

    .line 1256
    .line 1257
    move-wide/from16 v8, v16

    .line 1258
    .line 1259
    :goto_19
    iget v0, v5, Lv5/u;->c:I

    .line 1260
    .line 1261
    iget v3, v5, Lv5/u;->b:I

    .line 1262
    .line 1263
    sub-int/2addr v0, v3

    .line 1264
    new-array v3, v0, [B

    .line 1265
    .line 1266
    const/4 v4, 0x0

    .line 1267
    invoke-virtual {v5, v3, v4, v0}, Lv5/u;->d([BII)V

    .line 1268
    .line 1269
    .line 1270
    new-instance v0, Lr4/a;

    .line 1271
    .line 1272
    move-object/from16 v18, v0

    .line 1273
    .line 1274
    move-object/from16 v25, v3

    .line 1275
    .line 1276
    invoke-direct/range {v18 .. v25}, Lr4/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 1277
    .line 1278
    .line 1279
    new-instance v3, Lv5/u;

    .line 1280
    .line 1281
    iget-object v4, v7, Lk4/e;->k:Lr4/c;

    .line 1282
    .line 1283
    invoke-virtual {v4, v0}, Lr4/c;->e(Lr4/a;)[B

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-direct {v3, v0}, Lv5/u;-><init>([B)V

    .line 1288
    .line 1289
    .line 1290
    iget v0, v3, Lv5/u;->c:I

    .line 1291
    .line 1292
    iget v4, v3, Lv5/u;->b:I

    .line 1293
    .line 1294
    sub-int/2addr v0, v4

    .line 1295
    iget-object v4, v7, Lk4/e;->F:[Lc4/v;

    .line 1296
    .line 1297
    array-length v5, v4

    .line 1298
    const/4 v6, 0x0

    .line 1299
    :goto_1a
    if-ge v6, v5, :cond_38

    .line 1300
    .line 1301
    aget-object v10, v4, v6

    .line 1302
    .line 1303
    const/4 v11, 0x0

    .line 1304
    invoke-virtual {v3, v11}, Lv5/u;->G(I)V

    .line 1305
    .line 1306
    .line 1307
    invoke-interface {v10, v0, v3}, Lc4/v;->b(ILv5/u;)V

    .line 1308
    .line 1309
    .line 1310
    add-int/lit8 v6, v6, 0x1

    .line 1311
    .line 1312
    goto :goto_1a

    .line 1313
    :cond_38
    cmp-long v1, v8, v1

    .line 1314
    .line 1315
    if-nez v1, :cond_39

    .line 1316
    .line 1317
    iget-object v1, v7, Lk4/e;->n:Ljava/util/ArrayDeque;

    .line 1318
    .line 1319
    new-instance v2, Lk4/e$a;

    .line 1320
    .line 1321
    const/4 v3, 0x1

    .line 1322
    invoke-direct {v2, v0, v14, v15, v3}, Lk4/e$a;-><init>(IJZ)V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_1b

    .line 1326
    :cond_39
    iget-object v1, v7, Lk4/e;->n:Ljava/util/ArrayDeque;

    .line 1327
    .line 1328
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1329
    .line 1330
    .line 1331
    move-result v1

    .line 1332
    if-nez v1, :cond_3a

    .line 1333
    .line 1334
    iget-object v1, v7, Lk4/e;->n:Ljava/util/ArrayDeque;

    .line 1335
    .line 1336
    new-instance v2, Lk4/e$a;

    .line 1337
    .line 1338
    const/4 v3, 0x0

    .line 1339
    invoke-direct {v2, v0, v8, v9, v3}, Lk4/e$a;-><init>(IJZ)V

    .line 1340
    .line 1341
    .line 1342
    :goto_1b
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    iget v1, v7, Lk4/e;->v:I

    .line 1346
    .line 1347
    add-int/2addr v1, v0

    .line 1348
    iput v1, v7, Lk4/e;->v:I

    .line 1349
    .line 1350
    goto :goto_1d

    .line 1351
    :cond_3a
    iget-object v1, v7, Lk4/e;->j:Lv5/c0;

    .line 1352
    .line 1353
    if-eqz v1, :cond_3b

    .line 1354
    .line 1355
    invoke-virtual {v1, v8, v9}, Lv5/c0;->a(J)J

    .line 1356
    .line 1357
    .line 1358
    move-result-wide v8

    .line 1359
    :cond_3b
    iget-object v1, v7, Lk4/e;->F:[Lc4/v;

    .line 1360
    .line 1361
    array-length v2, v1

    .line 1362
    const/4 v3, 0x0

    .line 1363
    :goto_1c
    if-ge v3, v2, :cond_3c

    .line 1364
    .line 1365
    aget-object v16, v1, v3

    .line 1366
    .line 1367
    const/16 v19, 0x1

    .line 1368
    .line 1369
    const/16 v21, 0x0

    .line 1370
    .line 1371
    const/16 v22, 0x0

    .line 1372
    .line 1373
    move-wide/from16 v17, v8

    .line 1374
    .line 1375
    move/from16 v20, v0

    .line 1376
    .line 1377
    invoke-interface/range {v16 .. v22}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 1378
    .line 1379
    .line 1380
    add-int/lit8 v3, v3, 0x1

    .line 1381
    .line 1382
    goto :goto_1c

    .line 1383
    :cond_3c
    :goto_1d
    move-object/from16 v1, p1

    .line 1384
    .line 1385
    goto :goto_1e

    .line 1386
    :cond_3d
    move-object v7, v0

    .line 1387
    invoke-interface {v1, v2}, Lc4/i;->j(I)V

    .line 1388
    .line 1389
    .line 1390
    :goto_1e
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 1391
    .line 1392
    .line 1393
    move-result-wide v2

    .line 1394
    invoke-virtual {v7, v2, v3}, Lk4/e;->e(J)V

    .line 1395
    .line 1396
    .line 1397
    goto/16 :goto_29

    .line 1398
    .line 1399
    :cond_3e
    move-object v7, v0

    .line 1400
    iget v0, v7, Lk4/e;->s:I

    .line 1401
    .line 1402
    if-nez v0, :cond_40

    .line 1403
    .line 1404
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1405
    .line 1406
    iget-object v0, v0, Lv5/u;->a:[B

    .line 1407
    .line 1408
    const/16 v2, 0x8

    .line 1409
    .line 1410
    const/4 v5, 0x1

    .line 1411
    const/4 v6, 0x0

    .line 1412
    invoke-interface {v1, v0, v6, v2, v5}, Lc4/i;->b([BIIZ)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-nez v0, :cond_3f

    .line 1417
    .line 1418
    goto/16 :goto_28

    .line 1419
    .line 1420
    :cond_3f
    iput v2, v7, Lk4/e;->s:I

    .line 1421
    .line 1422
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1423
    .line 1424
    invoke-virtual {v0, v6}, Lv5/u;->G(I)V

    .line 1425
    .line 1426
    .line 1427
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1428
    .line 1429
    invoke-virtual {v0}, Lv5/u;->w()J

    .line 1430
    .line 1431
    .line 1432
    move-result-wide v5

    .line 1433
    iput-wide v5, v7, Lk4/e;->r:J

    .line 1434
    .line 1435
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1436
    .line 1437
    invoke-virtual {v0}, Lv5/u;->f()I

    .line 1438
    .line 1439
    .line 1440
    move-result v0

    .line 1441
    iput v0, v7, Lk4/e;->q:I

    .line 1442
    .line 1443
    :cond_40
    iget-wide v5, v7, Lk4/e;->r:J

    .line 1444
    .line 1445
    const-wide/16 v8, 0x1

    .line 1446
    .line 1447
    cmp-long v0, v5, v8

    .line 1448
    .line 1449
    if-nez v0, :cond_41

    .line 1450
    .line 1451
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1452
    .line 1453
    iget-object v0, v0, Lv5/u;->a:[B

    .line 1454
    .line 1455
    const/16 v2, 0x8

    .line 1456
    .line 1457
    invoke-interface {v1, v0, v2, v2}, Lc4/i;->readFully([BII)V

    .line 1458
    .line 1459
    .line 1460
    iget v0, v7, Lk4/e;->s:I

    .line 1461
    .line 1462
    add-int/2addr v0, v2

    .line 1463
    iput v0, v7, Lk4/e;->s:I

    .line 1464
    .line 1465
    iget-object v0, v7, Lk4/e;->l:Lv5/u;

    .line 1466
    .line 1467
    invoke-virtual {v0}, Lv5/u;->z()J

    .line 1468
    .line 1469
    .line 1470
    move-result-wide v5

    .line 1471
    goto :goto_1f

    .line 1472
    :cond_41
    const-wide/16 v8, 0x0

    .line 1473
    .line 1474
    cmp-long v0, v5, v8

    .line 1475
    .line 1476
    if-nez v0, :cond_43

    .line 1477
    .line 1478
    invoke-interface/range {p1 .. p1}, Lc4/i;->getLength()J

    .line 1479
    .line 1480
    .line 1481
    move-result-wide v5

    .line 1482
    const-wide/16 v8, -0x1

    .line 1483
    .line 1484
    cmp-long v0, v5, v8

    .line 1485
    .line 1486
    if-nez v0, :cond_42

    .line 1487
    .line 1488
    iget-object v0, v7, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 1489
    .line 1490
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1491
    .line 1492
    .line 1493
    move-result v0

    .line 1494
    if-nez v0, :cond_42

    .line 1495
    .line 1496
    iget-object v0, v7, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 1497
    .line 1498
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    check-cast v0, Lk4/a$a;

    .line 1503
    .line 1504
    iget-wide v5, v0, Lk4/a$a;->b:J

    .line 1505
    .line 1506
    :cond_42
    cmp-long v0, v5, v8

    .line 1507
    .line 1508
    if-eqz v0, :cond_43

    .line 1509
    .line 1510
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 1511
    .line 1512
    .line 1513
    move-result-wide v8

    .line 1514
    sub-long/2addr v5, v8

    .line 1515
    iget v0, v7, Lk4/e;->s:I

    .line 1516
    .line 1517
    int-to-long v8, v0

    .line 1518
    add-long/2addr v5, v8

    .line 1519
    :goto_1f
    iput-wide v5, v7, Lk4/e;->r:J

    .line 1520
    .line 1521
    :cond_43
    iget-wide v5, v7, Lk4/e;->r:J

    .line 1522
    .line 1523
    iget v0, v7, Lk4/e;->s:I

    .line 1524
    .line 1525
    int-to-long v8, v0

    .line 1526
    cmp-long v0, v5, v8

    .line 1527
    .line 1528
    if-ltz v0, :cond_53

    .line 1529
    .line 1530
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 1531
    .line 1532
    .line 1533
    move-result-wide v5

    .line 1534
    iget v0, v7, Lk4/e;->s:I

    .line 1535
    .line 1536
    int-to-long v8, v0

    .line 1537
    sub-long/2addr v5, v8

    .line 1538
    iget v0, v7, Lk4/e;->q:I

    .line 1539
    .line 1540
    const v2, 0x6d646174

    .line 1541
    .line 1542
    .line 1543
    const v8, 0x6d6f6f66

    .line 1544
    .line 1545
    .line 1546
    if-eq v0, v8, :cond_44

    .line 1547
    .line 1548
    if-ne v0, v2, :cond_45

    .line 1549
    .line 1550
    :cond_44
    iget-boolean v0, v7, Lk4/e;->H:Z

    .line 1551
    .line 1552
    if-nez v0, :cond_45

    .line 1553
    .line 1554
    iget-object v0, v7, Lk4/e;->E:Lc4/j;

    .line 1555
    .line 1556
    new-instance v9, Lc4/t$b;

    .line 1557
    .line 1558
    iget-wide v10, v7, Lk4/e;->x:J

    .line 1559
    .line 1560
    invoke-direct {v9, v10, v11, v5, v6}, Lc4/t$b;-><init>(JJ)V

    .line 1561
    .line 1562
    .line 1563
    invoke-interface {v0, v9}, Lc4/j;->t(Lc4/t;)V

    .line 1564
    .line 1565
    .line 1566
    const/4 v0, 0x1

    .line 1567
    iput-boolean v0, v7, Lk4/e;->H:Z

    .line 1568
    .line 1569
    :cond_45
    iget v0, v7, Lk4/e;->q:I

    .line 1570
    .line 1571
    if-ne v0, v8, :cond_46

    .line 1572
    .line 1573
    iget-object v0, v7, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1574
    .line 1575
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v0

    .line 1579
    const/4 v9, 0x0

    .line 1580
    :goto_20
    if-ge v9, v0, :cond_46

    .line 1581
    .line 1582
    iget-object v10, v7, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1583
    .line 1584
    invoke-virtual {v10, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v10

    .line 1588
    check-cast v10, Lk4/e$b;

    .line 1589
    .line 1590
    iget-object v10, v10, Lk4/e$b;->b:Lk4/l;

    .line 1591
    .line 1592
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1593
    .line 1594
    .line 1595
    iput-wide v5, v10, Lk4/l;->c:J

    .line 1596
    .line 1597
    iput-wide v5, v10, Lk4/l;->b:J

    .line 1598
    .line 1599
    add-int/lit8 v9, v9, 0x1

    .line 1600
    .line 1601
    goto :goto_20

    .line 1602
    :cond_46
    iget v0, v7, Lk4/e;->q:I

    .line 1603
    .line 1604
    if-ne v0, v2, :cond_47

    .line 1605
    .line 1606
    const/4 v0, 0x0

    .line 1607
    iput-object v0, v7, Lk4/e;->z:Lk4/e$b;

    .line 1608
    .line 1609
    iget-wide v2, v7, Lk4/e;->r:J

    .line 1610
    .line 1611
    add-long/2addr v5, v2

    .line 1612
    iput-wide v5, v7, Lk4/e;->u:J

    .line 1613
    .line 1614
    const/4 v0, 0x2

    .line 1615
    iput v0, v7, Lk4/e;->p:I

    .line 1616
    .line 1617
    const/4 v6, 0x1

    .line 1618
    goto/16 :goto_28

    .line 1619
    .line 1620
    :cond_47
    const/4 v2, 0x0

    .line 1621
    const v5, 0x6d6f6f76

    .line 1622
    .line 1623
    .line 1624
    if-eq v0, v5, :cond_49

    .line 1625
    .line 1626
    const v5, 0x7472616b

    .line 1627
    .line 1628
    .line 1629
    if-eq v0, v5, :cond_49

    .line 1630
    .line 1631
    const v5, 0x6d646961

    .line 1632
    .line 1633
    .line 1634
    if-eq v0, v5, :cond_49

    .line 1635
    .line 1636
    const v5, 0x6d696e66

    .line 1637
    .line 1638
    .line 1639
    if-eq v0, v5, :cond_49

    .line 1640
    .line 1641
    const v5, 0x7374626c

    .line 1642
    .line 1643
    .line 1644
    if-eq v0, v5, :cond_49

    .line 1645
    .line 1646
    if-eq v0, v8, :cond_49

    .line 1647
    .line 1648
    const v5, 0x74726166

    .line 1649
    .line 1650
    .line 1651
    if-eq v0, v5, :cond_49

    .line 1652
    .line 1653
    const v5, 0x6d766578

    .line 1654
    .line 1655
    .line 1656
    if-eq v0, v5, :cond_49

    .line 1657
    .line 1658
    const v5, 0x65647473

    .line 1659
    .line 1660
    .line 1661
    if-ne v0, v5, :cond_48

    .line 1662
    .line 1663
    goto :goto_21

    .line 1664
    :cond_48
    const/4 v5, 0x0

    .line 1665
    goto :goto_22

    .line 1666
    :cond_49
    :goto_21
    const/4 v5, 0x1

    .line 1667
    :goto_22
    if-eqz v5, :cond_4b

    .line 1668
    .line 1669
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 1670
    .line 1671
    .line 1672
    move-result-wide v2

    .line 1673
    iget-wide v4, v7, Lk4/e;->r:J

    .line 1674
    .line 1675
    add-long/2addr v2, v4

    .line 1676
    const-wide/16 v4, 0x8

    .line 1677
    .line 1678
    sub-long/2addr v2, v4

    .line 1679
    iget-object v0, v7, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 1680
    .line 1681
    new-instance v4, Lk4/a$a;

    .line 1682
    .line 1683
    iget v5, v7, Lk4/e;->q:I

    .line 1684
    .line 1685
    invoke-direct {v4, v5, v2, v3}, Lk4/a$a;-><init>(IJ)V

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1689
    .line 1690
    .line 1691
    iget-wide v4, v7, Lk4/e;->r:J

    .line 1692
    .line 1693
    iget v0, v7, Lk4/e;->s:I

    .line 1694
    .line 1695
    int-to-long v8, v0

    .line 1696
    cmp-long v0, v4, v8

    .line 1697
    .line 1698
    if-nez v0, :cond_4a

    .line 1699
    .line 1700
    invoke-virtual {v7, v2, v3}, Lk4/e;->e(J)V

    .line 1701
    .line 1702
    .line 1703
    goto :goto_23

    .line 1704
    :cond_4a
    const/4 v0, 0x0

    .line 1705
    iput v0, v7, Lk4/e;->p:I

    .line 1706
    .line 1707
    iput v0, v7, Lk4/e;->s:I

    .line 1708
    .line 1709
    :goto_23
    const/4 v0, 0x1

    .line 1710
    :goto_24
    move v6, v0

    .line 1711
    goto/16 :goto_28

    .line 1712
    .line 1713
    :cond_4b
    const v5, 0x68646c72    # 4.3148E24f

    .line 1714
    .line 1715
    .line 1716
    if-eq v0, v5, :cond_4d

    .line 1717
    .line 1718
    const v5, 0x6d646864

    .line 1719
    .line 1720
    .line 1721
    if-eq v0, v5, :cond_4d

    .line 1722
    .line 1723
    const v5, 0x6d766864

    .line 1724
    .line 1725
    .line 1726
    if-eq v0, v5, :cond_4d

    .line 1727
    .line 1728
    if-eq v0, v4, :cond_4d

    .line 1729
    .line 1730
    const v4, 0x73747364

    .line 1731
    .line 1732
    .line 1733
    if-eq v0, v4, :cond_4d

    .line 1734
    .line 1735
    const v4, 0x73747473

    .line 1736
    .line 1737
    .line 1738
    if-eq v0, v4, :cond_4d

    .line 1739
    .line 1740
    const v4, 0x63747473

    .line 1741
    .line 1742
    .line 1743
    if-eq v0, v4, :cond_4d

    .line 1744
    .line 1745
    const v4, 0x73747363

    .line 1746
    .line 1747
    .line 1748
    if-eq v0, v4, :cond_4d

    .line 1749
    .line 1750
    const v4, 0x7374737a

    .line 1751
    .line 1752
    .line 1753
    if-eq v0, v4, :cond_4d

    .line 1754
    .line 1755
    const v4, 0x73747a32

    .line 1756
    .line 1757
    .line 1758
    if-eq v0, v4, :cond_4d

    .line 1759
    .line 1760
    const v4, 0x7374636f

    .line 1761
    .line 1762
    .line 1763
    if-eq v0, v4, :cond_4d

    .line 1764
    .line 1765
    const v4, 0x636f3634

    .line 1766
    .line 1767
    .line 1768
    if-eq v0, v4, :cond_4d

    .line 1769
    .line 1770
    const v4, 0x73747373

    .line 1771
    .line 1772
    .line 1773
    if-eq v0, v4, :cond_4d

    .line 1774
    .line 1775
    const v4, 0x74666474

    .line 1776
    .line 1777
    .line 1778
    if-eq v0, v4, :cond_4d

    .line 1779
    .line 1780
    const v4, 0x74666864

    .line 1781
    .line 1782
    .line 1783
    if-eq v0, v4, :cond_4d

    .line 1784
    .line 1785
    const v4, 0x746b6864

    .line 1786
    .line 1787
    .line 1788
    if-eq v0, v4, :cond_4d

    .line 1789
    .line 1790
    const v4, 0x74726578

    .line 1791
    .line 1792
    .line 1793
    if-eq v0, v4, :cond_4d

    .line 1794
    .line 1795
    const v4, 0x7472756e

    .line 1796
    .line 1797
    .line 1798
    if-eq v0, v4, :cond_4d

    .line 1799
    .line 1800
    const v4, 0x70737368    # 3.013775E29f

    .line 1801
    .line 1802
    .line 1803
    if-eq v0, v4, :cond_4d

    .line 1804
    .line 1805
    const v4, 0x7361697a

    .line 1806
    .line 1807
    .line 1808
    if-eq v0, v4, :cond_4d

    .line 1809
    .line 1810
    const v4, 0x7361696f

    .line 1811
    .line 1812
    .line 1813
    if-eq v0, v4, :cond_4d

    .line 1814
    .line 1815
    const v4, 0x73656e63

    .line 1816
    .line 1817
    .line 1818
    if-eq v0, v4, :cond_4d

    .line 1819
    .line 1820
    const v4, 0x75756964

    .line 1821
    .line 1822
    .line 1823
    if-eq v0, v4, :cond_4d

    .line 1824
    .line 1825
    const v4, 0x73626770

    .line 1826
    .line 1827
    .line 1828
    if-eq v0, v4, :cond_4d

    .line 1829
    .line 1830
    const v4, 0x73677064

    .line 1831
    .line 1832
    .line 1833
    if-eq v0, v4, :cond_4d

    .line 1834
    .line 1835
    const v4, 0x656c7374

    .line 1836
    .line 1837
    .line 1838
    if-eq v0, v4, :cond_4d

    .line 1839
    .line 1840
    const v4, 0x6d656864

    .line 1841
    .line 1842
    .line 1843
    if-eq v0, v4, :cond_4d

    .line 1844
    .line 1845
    if-ne v0, v3, :cond_4c

    .line 1846
    .line 1847
    goto :goto_25

    .line 1848
    :cond_4c
    const/4 v0, 0x0

    .line 1849
    goto :goto_26

    .line 1850
    :cond_4d
    :goto_25
    const/4 v0, 0x1

    .line 1851
    :goto_26
    const-wide/32 v3, 0x7fffffff

    .line 1852
    .line 1853
    .line 1854
    if-eqz v0, :cond_50

    .line 1855
    .line 1856
    iget v0, v7, Lk4/e;->s:I

    .line 1857
    .line 1858
    const/16 v2, 0x8

    .line 1859
    .line 1860
    if-ne v0, v2, :cond_4f

    .line 1861
    .line 1862
    iget-wide v5, v7, Lk4/e;->r:J

    .line 1863
    .line 1864
    cmp-long v0, v5, v3

    .line 1865
    .line 1866
    if-gtz v0, :cond_4e

    .line 1867
    .line 1868
    new-instance v0, Lv5/u;

    .line 1869
    .line 1870
    iget-wide v3, v7, Lk4/e;->r:J

    .line 1871
    .line 1872
    long-to-int v3, v3

    .line 1873
    invoke-direct {v0, v3}, Lv5/u;-><init>(I)V

    .line 1874
    .line 1875
    .line 1876
    iget-object v3, v7, Lk4/e;->l:Lv5/u;

    .line 1877
    .line 1878
    iget-object v3, v3, Lv5/u;->a:[B

    .line 1879
    .line 1880
    iget-object v4, v0, Lv5/u;->a:[B

    .line 1881
    .line 1882
    const/4 v5, 0x0

    .line 1883
    invoke-static {v3, v5, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1884
    .line 1885
    .line 1886
    move-object v2, v0

    .line 1887
    goto :goto_27

    .line 1888
    :cond_4e
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    .line 1889
    .line 1890
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v0

    .line 1894
    throw v0

    .line 1895
    :cond_4f
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    .line 1896
    .line 1897
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v0

    .line 1901
    throw v0

    .line 1902
    :cond_50
    iget-wide v5, v7, Lk4/e;->r:J

    .line 1903
    .line 1904
    cmp-long v0, v5, v3

    .line 1905
    .line 1906
    if-gtz v0, :cond_52

    .line 1907
    .line 1908
    :goto_27
    iput-object v2, v7, Lk4/e;->t:Lv5/u;

    .line 1909
    .line 1910
    const/4 v0, 0x1

    .line 1911
    iput v0, v7, Lk4/e;->p:I

    .line 1912
    .line 1913
    goto/16 :goto_24

    .line 1914
    .line 1915
    :goto_28
    if-nez v6, :cond_51

    .line 1916
    .line 1917
    const/4 v0, -0x1

    .line 1918
    return v0

    .line 1919
    :cond_51
    :goto_29
    move-object v0, v7

    .line 1920
    goto/16 :goto_0

    .line 1921
    .line 1922
    :cond_52
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    .line 1923
    .line 1924
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    throw v0

    .line 1929
    :cond_53
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1930
    .line 1931
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    throw v0
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public final e(J)V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    move-object v2, v1

    .line 5
    :goto_0
    iget-object v3, v1, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_62

    .line 12
    .line 13
    iget-object v3, v1, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lk4/a$a;

    .line 20
    .line 21
    iget-wide v3, v3, Lk4/a$a;->b:J

    .line 22
    .line 23
    cmp-long v3, v3, p1

    .line 24
    .line 25
    if-nez v3, :cond_62

    .line 26
    .line 27
    iget-object v3, v1, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, Lk4/a$a;

    .line 35
    .line 36
    iget v3, v4, Lk4/a;->a:I

    .line 37
    .line 38
    const v5, 0x6d6f6f76

    .line 39
    .line 40
    .line 41
    const/16 v6, 0xc

    .line 42
    .line 43
    if-ne v3, v5, :cond_d

    .line 44
    .line 45
    iget-object v3, v1, Lk4/e;->b:Lk4/j;

    .line 46
    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-eqz v3, :cond_c

    .line 53
    .line 54
    iget-object v3, v4, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {v3}, Lk4/e;->a(Ljava/util/ArrayList;)La4/d;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    const v3, 0x6d766578

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v3}, Lk4/a$a;->b(I)Lk4/a$a;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v12, Landroid/util/SparseArray;

    .line 71
    .line 72
    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v5, v3, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    :goto_2
    if-ge v7, v5, :cond_4

    .line 88
    .line 89
    iget-object v11, v3, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    check-cast v11, Lk4/a$b;

    .line 96
    .line 97
    iget v13, v11, Lk4/a;->a:I

    .line 98
    .line 99
    const v14, 0x74726578

    .line 100
    .line 101
    .line 102
    if-ne v13, v14, :cond_1

    .line 103
    .line 104
    iget-object v11, v11, Lk4/a$b;->b:Lv5/u;

    .line 105
    .line 106
    invoke-virtual {v11, v6}, Lv5/u;->G(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    add-int/lit8 v13, v13, -0x1

    .line 118
    .line 119
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    invoke-virtual {v11}, Lv5/u;->f()I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    move-object/from16 v16, v3

    .line 136
    .line 137
    new-instance v3, Lk4/c;

    .line 138
    .line 139
    invoke-direct {v3, v13, v14, v15, v11}, Lk4/c;-><init>(IIII)V

    .line 140
    .line 141
    .line 142
    invoke-static {v6, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v6, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Lk4/c;

    .line 157
    .line 158
    invoke-virtual {v12, v6, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_1
    move-object/from16 v16, v3

    .line 163
    .line 164
    const v3, 0x6d656864

    .line 165
    .line 166
    .line 167
    if-ne v13, v3, :cond_3

    .line 168
    .line 169
    iget-object v3, v11, Lk4/a$b;->b:Lv5/u;

    .line 170
    .line 171
    const/16 v6, 0x8

    .line 172
    .line 173
    invoke-virtual {v3, v6}, Lv5/u;->G(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Lv5/u;->f()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    shr-int/lit8 v6, v6, 0x18

    .line 181
    .line 182
    and-int/lit16 v6, v6, 0xff

    .line 183
    .line 184
    if-nez v6, :cond_2

    .line 185
    .line 186
    invoke-virtual {v3}, Lv5/u;->w()J

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    goto :goto_3

    .line 191
    :cond_2
    invoke-virtual {v3}, Lv5/u;->z()J

    .line 192
    .line 193
    .line 194
    move-result-wide v9

    .line 195
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 196
    .line 197
    const/16 v6, 0xc

    .line 198
    .line 199
    move-object/from16 v3, v16

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_4
    new-instance v5, Lc4/p;

    .line 203
    .line 204
    invoke-direct {v5}, Lc4/p;-><init>()V

    .line 205
    .line 206
    .line 207
    iget v3, v1, Lk4/e;->a:I

    .line 208
    .line 209
    and-int/lit8 v3, v3, 0x10

    .line 210
    .line 211
    if-eqz v3, :cond_5

    .line 212
    .line 213
    const/4 v3, 0x1

    .line 214
    goto :goto_4

    .line 215
    :cond_5
    const/4 v3, 0x0

    .line 216
    :goto_4
    const/4 v11, 0x0

    .line 217
    new-instance v13, Lk4/d;

    .line 218
    .line 219
    invoke-direct {v13, v1}, Lk4/d;-><init>(Lk4/e;)V

    .line 220
    .line 221
    .line 222
    move-wide v6, v9

    .line 223
    move v9, v3

    .line 224
    move v10, v11

    .line 225
    move-object v11, v13

    .line 226
    invoke-static/range {v4 .. v11}, Lk4/b;->e(Lk4/a$a;Lc4/p;JLa4/d;ZZLn7/e;)Ljava/util/ArrayList;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    iget-object v5, v1, Lk4/e;->d:Landroid/util/SparseArray;

    .line 235
    .line 236
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_8

    .line 241
    .line 242
    const/4 v5, 0x0

    .line 243
    :goto_5
    if-ge v5, v4, :cond_7

    .line 244
    .line 245
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, Lk4/m;

    .line 250
    .line 251
    iget-object v7, v6, Lk4/m;->a:Lk4/j;

    .line 252
    .line 253
    new-instance v8, Lk4/e$b;

    .line 254
    .line 255
    iget-object v9, v1, Lk4/e;->E:Lc4/j;

    .line 256
    .line 257
    iget v10, v7, Lk4/j;->b:I

    .line 258
    .line 259
    invoke-interface {v9, v5, v10}, Lc4/j;->r(II)Lc4/v;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    iget v10, v7, Lk4/j;->a:I

    .line 264
    .line 265
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    const/4 v13, 0x1

    .line 270
    if-ne v11, v13, :cond_6

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    invoke-virtual {v12, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    check-cast v10, Lk4/c;

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_6
    invoke-virtual {v12, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    check-cast v10, Lk4/c;

    .line 285
    .line 286
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    :goto_6
    invoke-direct {v8, v9, v6, v10}, Lk4/e$b;-><init>(Lc4/v;Lk4/m;Lk4/c;)V

    .line 290
    .line 291
    .line 292
    iget-object v6, v1, Lk4/e;->d:Landroid/util/SparseArray;

    .line 293
    .line 294
    iget v9, v7, Lk4/j;->a:I

    .line 295
    .line 296
    invoke-virtual {v6, v9, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-wide v8, v1, Lk4/e;->x:J

    .line 300
    .line 301
    iget-wide v6, v7, Lk4/j;->e:J

    .line 302
    .line 303
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    iput-wide v6, v1, Lk4/e;->x:J

    .line 308
    .line 309
    add-int/lit8 v5, v5, 0x1

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_7
    iget-object v3, v1, Lk4/e;->E:Lc4/j;

    .line 313
    .line 314
    invoke-interface {v3}, Lc4/j;->m()V

    .line 315
    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_8
    iget-object v5, v1, Lk4/e;->d:Landroid/util/SparseArray;

    .line 319
    .line 320
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-ne v5, v4, :cond_9

    .line 325
    .line 326
    const/4 v5, 0x1

    .line 327
    goto :goto_7

    .line 328
    :cond_9
    const/4 v5, 0x0

    .line 329
    :goto_7
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 330
    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    :goto_8
    if-ge v5, v4, :cond_b

    .line 334
    .line 335
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    check-cast v6, Lk4/m;

    .line 340
    .line 341
    iget-object v7, v6, Lk4/m;->a:Lk4/j;

    .line 342
    .line 343
    iget-object v8, v1, Lk4/e;->d:Landroid/util/SparseArray;

    .line 344
    .line 345
    iget v9, v7, Lk4/j;->a:I

    .line 346
    .line 347
    invoke-virtual {v8, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    check-cast v8, Lk4/e$b;

    .line 352
    .line 353
    iget v7, v7, Lk4/j;->a:I

    .line 354
    .line 355
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    const/4 v10, 0x1

    .line 360
    if-ne v9, v10, :cond_a

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    invoke-virtual {v12, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    check-cast v7, Lk4/c;

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_a
    invoke-virtual {v12, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    check-cast v7, Lk4/c;

    .line 375
    .line 376
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    :goto_9
    iput-object v6, v8, Lk4/e$b;->d:Lk4/m;

    .line 380
    .line 381
    iput-object v7, v8, Lk4/e$b;->e:Lk4/c;

    .line 382
    .line 383
    iget-object v7, v8, Lk4/e$b;->a:Lc4/v;

    .line 384
    .line 385
    iget-object v6, v6, Lk4/m;->a:Lk4/j;

    .line 386
    .line 387
    iget-object v6, v6, Lk4/j;->f:Lv3/i0;

    .line 388
    .line 389
    invoke-interface {v7, v6}, Lc4/v;->d(Lv3/i0;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v8}, Lk4/e$b;->d()V

    .line 393
    .line 394
    .line 395
    add-int/lit8 v5, v5, 0x1

    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_b
    :goto_a
    move-object v4, v0

    .line 399
    goto/16 :goto_42

    .line 400
    .line 401
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 402
    .line 403
    const-string v2, "Unexpected moov box."

    .line 404
    .line 405
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v1

    .line 409
    :cond_d
    const v5, 0x6d6f6f66

    .line 410
    .line 411
    .line 412
    if-ne v3, v5, :cond_60

    .line 413
    .line 414
    iget-object v2, v1, Lk4/e;->d:Landroid/util/SparseArray;

    .line 415
    .line 416
    iget-object v3, v1, Lk4/e;->b:Lk4/j;

    .line 417
    .line 418
    if-eqz v3, :cond_e

    .line 419
    .line 420
    const/4 v3, 0x1

    .line 421
    goto :goto_b

    .line 422
    :cond_e
    const/4 v3, 0x0

    .line 423
    :goto_b
    iget v5, v1, Lk4/e;->a:I

    .line 424
    .line 425
    iget-object v1, v1, Lk4/e;->h:[B

    .line 426
    .line 427
    iget-object v6, v4, Lk4/a$a;->d:Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    const/4 v7, 0x0

    .line 434
    :goto_c
    if-ge v7, v6, :cond_58

    .line 435
    .line 436
    iget-object v8, v4, Lk4/a$a;->d:Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    check-cast v8, Lk4/a$a;

    .line 443
    .line 444
    iget v9, v8, Lk4/a;->a:I

    .line 445
    .line 446
    const v10, 0x74726166

    .line 447
    .line 448
    .line 449
    if-ne v9, v10, :cond_57

    .line 450
    .line 451
    const v9, 0x74666864

    .line 452
    .line 453
    .line 454
    invoke-virtual {v8, v9}, Lk4/a$a;->c(I)Lk4/a$b;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget-object v9, v9, Lk4/a$b;->b:Lv5/u;

    .line 462
    .line 463
    const/16 v10, 0x8

    .line 464
    .line 465
    invoke-virtual {v9, v10}, Lv5/u;->G(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    const v11, 0xffffff

    .line 473
    .line 474
    .line 475
    and-int/2addr v10, v11

    .line 476
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    if-eqz v3, :cond_f

    .line 481
    .line 482
    const/4 v11, 0x0

    .line 483
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v11

    .line 487
    goto :goto_d

    .line 488
    :cond_f
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    :goto_d
    check-cast v11, Lk4/e$b;

    .line 493
    .line 494
    if-nez v11, :cond_10

    .line 495
    .line 496
    const/4 v11, 0x0

    .line 497
    goto :goto_12

    .line 498
    :cond_10
    and-int/lit8 v12, v10, 0x1

    .line 499
    .line 500
    if-eqz v12, :cond_11

    .line 501
    .line 502
    invoke-virtual {v9}, Lv5/u;->z()J

    .line 503
    .line 504
    .line 505
    move-result-wide v12

    .line 506
    iget-object v14, v11, Lk4/e$b;->b:Lk4/l;

    .line 507
    .line 508
    iput-wide v12, v14, Lk4/l;->b:J

    .line 509
    .line 510
    iput-wide v12, v14, Lk4/l;->c:J

    .line 511
    .line 512
    :cond_11
    iget-object v12, v11, Lk4/e$b;->e:Lk4/c;

    .line 513
    .line 514
    and-int/lit8 v13, v10, 0x2

    .line 515
    .line 516
    if-eqz v13, :cond_12

    .line 517
    .line 518
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 519
    .line 520
    .line 521
    move-result v13

    .line 522
    add-int/lit8 v13, v13, -0x1

    .line 523
    .line 524
    goto :goto_e

    .line 525
    :cond_12
    iget v13, v12, Lk4/c;->a:I

    .line 526
    .line 527
    :goto_e
    and-int/lit8 v14, v10, 0x8

    .line 528
    .line 529
    if-eqz v14, :cond_13

    .line 530
    .line 531
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 532
    .line 533
    .line 534
    move-result v14

    .line 535
    goto :goto_f

    .line 536
    :cond_13
    iget v14, v12, Lk4/c;->b:I

    .line 537
    .line 538
    :goto_f
    and-int/lit8 v15, v10, 0x10

    .line 539
    .line 540
    if-eqz v15, :cond_14

    .line 541
    .line 542
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 543
    .line 544
    .line 545
    move-result v15

    .line 546
    goto :goto_10

    .line 547
    :cond_14
    iget v15, v12, Lk4/c;->c:I

    .line 548
    .line 549
    :goto_10
    and-int/lit8 v10, v10, 0x20

    .line 550
    .line 551
    if-eqz v10, :cond_15

    .line 552
    .line 553
    invoke-virtual {v9}, Lv5/u;->f()I

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    goto :goto_11

    .line 558
    :cond_15
    iget v9, v12, Lk4/c;->d:I

    .line 559
    .line 560
    :goto_11
    iget-object v10, v11, Lk4/e$b;->b:Lk4/l;

    .line 561
    .line 562
    new-instance v12, Lk4/c;

    .line 563
    .line 564
    invoke-direct {v12, v13, v14, v15, v9}, Lk4/c;-><init>(IIII)V

    .line 565
    .line 566
    .line 567
    iput-object v12, v10, Lk4/l;->a:Lk4/c;

    .line 568
    .line 569
    :goto_12
    if-nez v11, :cond_16

    .line 570
    .line 571
    goto/16 :goto_3b

    .line 572
    .line 573
    :cond_16
    iget-object v9, v11, Lk4/e$b;->b:Lk4/l;

    .line 574
    .line 575
    iget-wide v12, v9, Lk4/l;->p:J

    .line 576
    .line 577
    iget-boolean v10, v9, Lk4/l;->q:Z

    .line 578
    .line 579
    invoke-virtual {v11}, Lk4/e$b;->d()V

    .line 580
    .line 581
    .line 582
    const/4 v14, 0x1

    .line 583
    iput-boolean v14, v11, Lk4/e$b;->l:Z

    .line 584
    .line 585
    const v14, 0x74666474

    .line 586
    .line 587
    .line 588
    invoke-virtual {v8, v14}, Lk4/a$a;->c(I)Lk4/a$b;

    .line 589
    .line 590
    .line 591
    move-result-object v14

    .line 592
    if-eqz v14, :cond_18

    .line 593
    .line 594
    and-int/lit8 v15, v5, 0x2

    .line 595
    .line 596
    if-nez v15, :cond_18

    .line 597
    .line 598
    iget-object v10, v14, Lk4/a$b;->b:Lv5/u;

    .line 599
    .line 600
    const/16 v12, 0x8

    .line 601
    .line 602
    invoke-virtual {v10, v12}, Lv5/u;->G(I)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v10}, Lv5/u;->f()I

    .line 606
    .line 607
    .line 608
    move-result v12

    .line 609
    shr-int/lit8 v12, v12, 0x18

    .line 610
    .line 611
    and-int/lit16 v12, v12, 0xff

    .line 612
    .line 613
    const/4 v13, 0x1

    .line 614
    if-ne v12, v13, :cond_17

    .line 615
    .line 616
    invoke-virtual {v10}, Lv5/u;->z()J

    .line 617
    .line 618
    .line 619
    move-result-wide v14

    .line 620
    goto :goto_13

    .line 621
    :cond_17
    invoke-virtual {v10}, Lv5/u;->w()J

    .line 622
    .line 623
    .line 624
    move-result-wide v14

    .line 625
    :goto_13
    iput-wide v14, v9, Lk4/l;->p:J

    .line 626
    .line 627
    iput-boolean v13, v9, Lk4/l;->q:Z

    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_18
    iput-wide v12, v9, Lk4/l;->p:J

    .line 631
    .line 632
    iput-boolean v10, v9, Lk4/l;->q:Z

    .line 633
    .line 634
    :goto_14
    iget-object v10, v8, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 637
    .line 638
    .line 639
    move-result v12

    .line 640
    const/4 v13, 0x0

    .line 641
    const/4 v14, 0x0

    .line 642
    const/4 v15, 0x0

    .line 643
    move-object/from16 v16, v2

    .line 644
    .line 645
    :goto_15
    const v2, 0x7472756e

    .line 646
    .line 647
    .line 648
    if-ge v13, v12, :cond_1a

    .line 649
    .line 650
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v17

    .line 654
    move/from16 v18, v3

    .line 655
    .line 656
    move-object/from16 v3, v17

    .line 657
    .line 658
    check-cast v3, Lk4/a$b;

    .line 659
    .line 660
    move/from16 v17, v6

    .line 661
    .line 662
    iget v6, v3, Lk4/a;->a:I

    .line 663
    .line 664
    if-ne v6, v2, :cond_19

    .line 665
    .line 666
    iget-object v2, v3, Lk4/a$b;->b:Lv5/u;

    .line 667
    .line 668
    const/16 v3, 0xc

    .line 669
    .line 670
    invoke-virtual {v2, v3}, Lv5/u;->G(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    if-lez v2, :cond_19

    .line 678
    .line 679
    add-int/2addr v15, v2

    .line 680
    add-int/lit8 v14, v14, 0x1

    .line 681
    .line 682
    :cond_19
    add-int/lit8 v13, v13, 0x1

    .line 683
    .line 684
    move/from16 v6, v17

    .line 685
    .line 686
    move/from16 v3, v18

    .line 687
    .line 688
    goto :goto_15

    .line 689
    :cond_1a
    move/from16 v18, v3

    .line 690
    .line 691
    move/from16 v17, v6

    .line 692
    .line 693
    const/4 v3, 0x0

    .line 694
    iput v3, v11, Lk4/e$b;->h:I

    .line 695
    .line 696
    iput v3, v11, Lk4/e$b;->g:I

    .line 697
    .line 698
    iput v3, v11, Lk4/e$b;->f:I

    .line 699
    .line 700
    iget-object v3, v11, Lk4/e$b;->b:Lk4/l;

    .line 701
    .line 702
    iput v14, v3, Lk4/l;->d:I

    .line 703
    .line 704
    iput v15, v3, Lk4/l;->e:I

    .line 705
    .line 706
    iget-object v6, v3, Lk4/l;->g:[I

    .line 707
    .line 708
    array-length v6, v6

    .line 709
    if-ge v6, v14, :cond_1b

    .line 710
    .line 711
    new-array v6, v14, [J

    .line 712
    .line 713
    iput-object v6, v3, Lk4/l;->f:[J

    .line 714
    .line 715
    new-array v6, v14, [I

    .line 716
    .line 717
    iput-object v6, v3, Lk4/l;->g:[I

    .line 718
    .line 719
    :cond_1b
    iget-object v6, v3, Lk4/l;->h:[I

    .line 720
    .line 721
    array-length v6, v6

    .line 722
    if-ge v6, v15, :cond_1c

    .line 723
    .line 724
    mul-int/lit8 v15, v15, 0x7d

    .line 725
    .line 726
    div-int/lit8 v15, v15, 0x64

    .line 727
    .line 728
    new-array v6, v15, [I

    .line 729
    .line 730
    iput-object v6, v3, Lk4/l;->h:[I

    .line 731
    .line 732
    new-array v6, v15, [J

    .line 733
    .line 734
    iput-object v6, v3, Lk4/l;->i:[J

    .line 735
    .line 736
    new-array v6, v15, [Z

    .line 737
    .line 738
    iput-object v6, v3, Lk4/l;->j:[Z

    .line 739
    .line 740
    new-array v6, v15, [Z

    .line 741
    .line 742
    iput-object v6, v3, Lk4/l;->l:[Z

    .line 743
    .line 744
    :cond_1c
    const/4 v3, 0x0

    .line 745
    const/4 v6, 0x0

    .line 746
    const/4 v13, 0x0

    .line 747
    :goto_16
    if-ge v3, v12, :cond_37

    .line 748
    .line 749
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v19

    .line 753
    move-object/from16 v14, v19

    .line 754
    .line 755
    check-cast v14, Lk4/a$b;

    .line 756
    .line 757
    iget v15, v14, Lk4/a;->a:I

    .line 758
    .line 759
    if-ne v15, v2, :cond_36

    .line 760
    .line 761
    add-int/lit8 v2, v6, 0x1

    .line 762
    .line 763
    iget-object v14, v14, Lk4/a$b;->b:Lv5/u;

    .line 764
    .line 765
    const/16 v15, 0x8

    .line 766
    .line 767
    invoke-virtual {v14, v15}, Lv5/u;->G(I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 771
    .line 772
    .line 773
    move-result v15

    .line 774
    const v19, 0xffffff

    .line 775
    .line 776
    .line 777
    and-int v15, v15, v19

    .line 778
    .line 779
    move/from16 v19, v2

    .line 780
    .line 781
    iget-object v2, v11, Lk4/e$b;->d:Lk4/m;

    .line 782
    .line 783
    iget-object v2, v2, Lk4/m;->a:Lk4/j;

    .line 784
    .line 785
    move-object/from16 v22, v10

    .line 786
    .line 787
    iget-object v10, v11, Lk4/e$b;->b:Lk4/l;

    .line 788
    .line 789
    move/from16 v23, v12

    .line 790
    .line 791
    iget-object v12, v10, Lk4/l;->a:Lk4/c;

    .line 792
    .line 793
    sget v24, Lv5/e0;->a:I

    .line 794
    .line 795
    iget-object v0, v10, Lk4/l;->g:[I

    .line 796
    .line 797
    invoke-virtual {v14}, Lv5/u;->y()I

    .line 798
    .line 799
    .line 800
    move-result v24

    .line 801
    aput v24, v0, v6

    .line 802
    .line 803
    iget-object v0, v10, Lk4/l;->f:[J

    .line 804
    .line 805
    move/from16 v24, v7

    .line 806
    .line 807
    move-object/from16 v25, v8

    .line 808
    .line 809
    iget-wide v7, v10, Lk4/l;->b:J

    .line 810
    .line 811
    aput-wide v7, v0, v6

    .line 812
    .line 813
    and-int/lit8 v26, v15, 0x1

    .line 814
    .line 815
    if-eqz v26, :cond_1d

    .line 816
    .line 817
    move-object/from16 v26, v4

    .line 818
    .line 819
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    move/from16 v27, v3

    .line 824
    .line 825
    int-to-long v3, v4

    .line 826
    add-long/2addr v7, v3

    .line 827
    aput-wide v7, v0, v6

    .line 828
    .line 829
    goto :goto_17

    .line 830
    :cond_1d
    move/from16 v27, v3

    .line 831
    .line 832
    move-object/from16 v26, v4

    .line 833
    .line 834
    :goto_17
    and-int/lit8 v0, v15, 0x4

    .line 835
    .line 836
    if-eqz v0, :cond_1e

    .line 837
    .line 838
    const/4 v0, 0x1

    .line 839
    goto :goto_18

    .line 840
    :cond_1e
    const/4 v0, 0x0

    .line 841
    :goto_18
    iget v3, v12, Lk4/c;->d:I

    .line 842
    .line 843
    if-eqz v0, :cond_1f

    .line 844
    .line 845
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    :cond_1f
    and-int/lit16 v4, v15, 0x100

    .line 850
    .line 851
    if-eqz v4, :cond_20

    .line 852
    .line 853
    const/4 v4, 0x1

    .line 854
    goto :goto_19

    .line 855
    :cond_20
    const/4 v4, 0x0

    .line 856
    :goto_19
    and-int/lit16 v7, v15, 0x200

    .line 857
    .line 858
    if-eqz v7, :cond_21

    .line 859
    .line 860
    const/4 v7, 0x1

    .line 861
    goto :goto_1a

    .line 862
    :cond_21
    const/4 v7, 0x0

    .line 863
    :goto_1a
    and-int/lit16 v8, v15, 0x400

    .line 864
    .line 865
    if-eqz v8, :cond_22

    .line 866
    .line 867
    const/4 v8, 0x1

    .line 868
    goto :goto_1b

    .line 869
    :cond_22
    const/4 v8, 0x0

    .line 870
    :goto_1b
    and-int/lit16 v15, v15, 0x800

    .line 871
    .line 872
    if-eqz v15, :cond_23

    .line 873
    .line 874
    const/4 v15, 0x1

    .line 875
    goto :goto_1c

    .line 876
    :cond_23
    const/4 v15, 0x0

    .line 877
    :goto_1c
    move/from16 v28, v3

    .line 878
    .line 879
    iget-object v3, v2, Lk4/j;->h:[J

    .line 880
    .line 881
    if-eqz v3, :cond_27

    .line 882
    .line 883
    move-object/from16 v29, v1

    .line 884
    .line 885
    array-length v1, v3

    .line 886
    move-object/from16 v30, v9

    .line 887
    .line 888
    const/4 v9, 0x1

    .line 889
    if-ne v1, v9, :cond_26

    .line 890
    .line 891
    iget-object v1, v2, Lk4/j;->i:[J

    .line 892
    .line 893
    if-nez v1, :cond_24

    .line 894
    .line 895
    goto :goto_1e

    .line 896
    :cond_24
    const/4 v9, 0x0

    .line 897
    aget-wide v31, v3, v9

    .line 898
    .line 899
    const-wide/16 v20, 0x0

    .line 900
    .line 901
    cmp-long v3, v31, v20

    .line 902
    .line 903
    if-nez v3, :cond_25

    .line 904
    .line 905
    move v3, v0

    .line 906
    move/from16 v31, v8

    .line 907
    .line 908
    goto :goto_1d

    .line 909
    :cond_25
    aget-wide v33, v1, v9

    .line 910
    .line 911
    add-long v35, v31, v33

    .line 912
    .line 913
    const-wide/32 v37, 0xf4240

    .line 914
    .line 915
    .line 916
    move v3, v0

    .line 917
    iget-wide v0, v2, Lk4/j;->d:J

    .line 918
    .line 919
    move-wide/from16 v39, v0

    .line 920
    .line 921
    invoke-static/range {v35 .. v40}, Lv5/e0;->O(JJJ)J

    .line 922
    .line 923
    .line 924
    move-result-wide v0

    .line 925
    move/from16 v31, v8

    .line 926
    .line 927
    iget-wide v8, v2, Lk4/j;->e:J

    .line 928
    .line 929
    cmp-long v0, v0, v8

    .line 930
    .line 931
    if-ltz v0, :cond_28

    .line 932
    .line 933
    :goto_1d
    const/4 v0, 0x1

    .line 934
    goto :goto_20

    .line 935
    :cond_26
    :goto_1e
    move v3, v0

    .line 936
    move/from16 v31, v8

    .line 937
    .line 938
    goto :goto_1f

    .line 939
    :cond_27
    move v3, v0

    .line 940
    move-object/from16 v29, v1

    .line 941
    .line 942
    move/from16 v31, v8

    .line 943
    .line 944
    move-object/from16 v30, v9

    .line 945
    .line 946
    :cond_28
    :goto_1f
    const/4 v0, 0x0

    .line 947
    :goto_20
    if-eqz v0, :cond_29

    .line 948
    .line 949
    iget-object v0, v2, Lk4/j;->i:[J

    .line 950
    .line 951
    const/4 v1, 0x0

    .line 952
    aget-wide v8, v0, v1

    .line 953
    .line 954
    move-wide/from16 v20, v8

    .line 955
    .line 956
    goto :goto_21

    .line 957
    :cond_29
    const-wide/16 v20, 0x0

    .line 958
    .line 959
    :goto_21
    iget-object v0, v10, Lk4/l;->h:[I

    .line 960
    .line 961
    iget-object v1, v10, Lk4/l;->i:[J

    .line 962
    .line 963
    iget-object v8, v10, Lk4/l;->j:[Z

    .line 964
    .line 965
    iget v9, v2, Lk4/j;->b:I

    .line 966
    .line 967
    move-object/from16 v32, v8

    .line 968
    .line 969
    const/4 v8, 0x2

    .line 970
    if-ne v9, v8, :cond_2a

    .line 971
    .line 972
    and-int/lit8 v8, v5, 0x1

    .line 973
    .line 974
    if-eqz v8, :cond_2a

    .line 975
    .line 976
    const/4 v8, 0x1

    .line 977
    goto :goto_22

    .line 978
    :cond_2a
    const/4 v8, 0x0

    .line 979
    :goto_22
    iget-object v9, v10, Lk4/l;->g:[I

    .line 980
    .line 981
    aget v6, v9, v6

    .line 982
    .line 983
    add-int/2addr v6, v13

    .line 984
    move/from16 v39, v8

    .line 985
    .line 986
    iget-wide v8, v2, Lk4/j;->c:J

    .line 987
    .line 988
    move-object v2, v0

    .line 989
    move-object/from16 v40, v1

    .line 990
    .line 991
    iget-wide v0, v10, Lk4/l;->p:J

    .line 992
    .line 993
    :goto_23
    if-ge v13, v6, :cond_35

    .line 994
    .line 995
    if-eqz v4, :cond_2b

    .line 996
    .line 997
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 998
    .line 999
    .line 1000
    move-result v33

    .line 1001
    move/from16 v41, v4

    .line 1002
    .line 1003
    move/from16 v42, v5

    .line 1004
    .line 1005
    move/from16 v4, v33

    .line 1006
    .line 1007
    goto :goto_24

    .line 1008
    :cond_2b
    move/from16 v41, v4

    .line 1009
    .line 1010
    iget v4, v12, Lk4/c;->b:I

    .line 1011
    .line 1012
    move/from16 v42, v5

    .line 1013
    .line 1014
    :goto_24
    const-string v5, "Unexpected negative value: "

    .line 1015
    .line 1016
    if-ltz v4, :cond_34

    .line 1017
    .line 1018
    if-eqz v7, :cond_2c

    .line 1019
    .line 1020
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 1021
    .line 1022
    .line 1023
    move-result v33

    .line 1024
    move/from16 v43, v6

    .line 1025
    .line 1026
    move/from16 v6, v33

    .line 1027
    .line 1028
    goto :goto_25

    .line 1029
    :cond_2c
    move/from16 v43, v6

    .line 1030
    .line 1031
    iget v6, v12, Lk4/c;->c:I

    .line 1032
    .line 1033
    :goto_25
    if-ltz v6, :cond_33

    .line 1034
    .line 1035
    if-eqz v31, :cond_2d

    .line 1036
    .line 1037
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 1038
    .line 1039
    .line 1040
    move-result v5

    .line 1041
    goto :goto_26

    .line 1042
    :cond_2d
    if-nez v13, :cond_2e

    .line 1043
    .line 1044
    if-eqz v3, :cond_2e

    .line 1045
    .line 1046
    move/from16 v5, v28

    .line 1047
    .line 1048
    goto :goto_26

    .line 1049
    :cond_2e
    iget v5, v12, Lk4/c;->d:I

    .line 1050
    .line 1051
    :goto_26
    if-eqz v15, :cond_2f

    .line 1052
    .line 1053
    invoke-virtual {v14}, Lv5/u;->f()I

    .line 1054
    .line 1055
    .line 1056
    move-result v33

    .line 1057
    goto :goto_27

    .line 1058
    :cond_2f
    const/16 v33, 0x0

    .line 1059
    .line 1060
    :goto_27
    move/from16 v44, v3

    .line 1061
    .line 1062
    move-object/from16 v45, v14

    .line 1063
    .line 1064
    move/from16 v46, v15

    .line 1065
    .line 1066
    move/from16 v3, v33

    .line 1067
    .line 1068
    int-to-long v14, v3

    .line 1069
    add-long/2addr v14, v0

    .line 1070
    sub-long v33, v14, v20

    .line 1071
    .line 1072
    const-wide/32 v35, 0xf4240

    .line 1073
    .line 1074
    .line 1075
    move-wide/from16 v37, v8

    .line 1076
    .line 1077
    invoke-static/range {v33 .. v38}, Lv5/e0;->O(JJJ)J

    .line 1078
    .line 1079
    .line 1080
    move-result-wide v14

    .line 1081
    aput-wide v14, v40, v13

    .line 1082
    .line 1083
    iget-boolean v3, v10, Lk4/l;->q:Z

    .line 1084
    .line 1085
    if-nez v3, :cond_30

    .line 1086
    .line 1087
    iget-object v3, v11, Lk4/e$b;->d:Lk4/m;

    .line 1088
    .line 1089
    move/from16 v33, v7

    .line 1090
    .line 1091
    move-wide/from16 v34, v8

    .line 1092
    .line 1093
    iget-wide v7, v3, Lk4/m;->h:J

    .line 1094
    .line 1095
    add-long/2addr v14, v7

    .line 1096
    aput-wide v14, v40, v13

    .line 1097
    .line 1098
    goto :goto_28

    .line 1099
    :cond_30
    move/from16 v33, v7

    .line 1100
    .line 1101
    move-wide/from16 v34, v8

    .line 1102
    .line 1103
    :goto_28
    aput v6, v2, v13

    .line 1104
    .line 1105
    shr-int/lit8 v3, v5, 0x10

    .line 1106
    .line 1107
    and-int/lit8 v3, v3, 0x1

    .line 1108
    .line 1109
    if-nez v3, :cond_32

    .line 1110
    .line 1111
    if-eqz v39, :cond_31

    .line 1112
    .line 1113
    if-nez v13, :cond_32

    .line 1114
    .line 1115
    :cond_31
    const/4 v3, 0x1

    .line 1116
    goto :goto_29

    .line 1117
    :cond_32
    const/4 v3, 0x0

    .line 1118
    :goto_29
    aput-boolean v3, v32, v13

    .line 1119
    .line 1120
    int-to-long v3, v4

    .line 1121
    add-long/2addr v0, v3

    .line 1122
    add-int/lit8 v13, v13, 0x1

    .line 1123
    .line 1124
    move/from16 v7, v33

    .line 1125
    .line 1126
    move-wide/from16 v8, v34

    .line 1127
    .line 1128
    move/from16 v4, v41

    .line 1129
    .line 1130
    move/from16 v5, v42

    .line 1131
    .line 1132
    move/from16 v6, v43

    .line 1133
    .line 1134
    move/from16 v3, v44

    .line 1135
    .line 1136
    move-object/from16 v14, v45

    .line 1137
    .line 1138
    move/from16 v15, v46

    .line 1139
    .line 1140
    goto/16 :goto_23

    .line 1141
    .line 1142
    :cond_33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    const/4 v1, 0x0

    .line 1158
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    throw v0

    .line 1163
    :cond_34
    const/4 v0, 0x0

    .line 1164
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    throw v0

    .line 1184
    :cond_35
    move/from16 v42, v5

    .line 1185
    .line 1186
    move/from16 v43, v6

    .line 1187
    .line 1188
    iput-wide v0, v10, Lk4/l;->p:J

    .line 1189
    .line 1190
    move/from16 v6, v19

    .line 1191
    .line 1192
    move/from16 v13, v43

    .line 1193
    .line 1194
    goto :goto_2a

    .line 1195
    :cond_36
    move-object/from16 v29, v1

    .line 1196
    .line 1197
    move/from16 v27, v3

    .line 1198
    .line 1199
    move-object/from16 v26, v4

    .line 1200
    .line 1201
    move/from16 v42, v5

    .line 1202
    .line 1203
    move/from16 v24, v7

    .line 1204
    .line 1205
    move-object/from16 v25, v8

    .line 1206
    .line 1207
    move-object/from16 v30, v9

    .line 1208
    .line 1209
    move-object/from16 v22, v10

    .line 1210
    .line 1211
    move/from16 v23, v12

    .line 1212
    .line 1213
    :goto_2a
    add-int/lit8 v3, v27, 0x1

    .line 1214
    .line 1215
    const v2, 0x7472756e

    .line 1216
    .line 1217
    .line 1218
    move-object/from16 v0, p0

    .line 1219
    .line 1220
    move-object/from16 v10, v22

    .line 1221
    .line 1222
    move/from16 v12, v23

    .line 1223
    .line 1224
    move/from16 v7, v24

    .line 1225
    .line 1226
    move-object/from16 v8, v25

    .line 1227
    .line 1228
    move-object/from16 v4, v26

    .line 1229
    .line 1230
    move-object/from16 v1, v29

    .line 1231
    .line 1232
    move-object/from16 v9, v30

    .line 1233
    .line 1234
    move/from16 v5, v42

    .line 1235
    .line 1236
    goto/16 :goto_16

    .line 1237
    .line 1238
    :cond_37
    move-object/from16 v29, v1

    .line 1239
    .line 1240
    move-object/from16 v26, v4

    .line 1241
    .line 1242
    move/from16 v42, v5

    .line 1243
    .line 1244
    move/from16 v24, v7

    .line 1245
    .line 1246
    move-object/from16 v25, v8

    .line 1247
    .line 1248
    move-object/from16 v30, v9

    .line 1249
    .line 1250
    iget-object v0, v11, Lk4/e$b;->d:Lk4/m;

    .line 1251
    .line 1252
    iget-object v0, v0, Lk4/m;->a:Lk4/j;

    .line 1253
    .line 1254
    move-object/from16 v1, v30

    .line 1255
    .line 1256
    iget-object v2, v1, Lk4/l;->a:Lk4/c;

    .line 1257
    .line 1258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    iget v2, v2, Lk4/c;->a:I

    .line 1262
    .line 1263
    iget-object v0, v0, Lk4/j;->k:[Lk4/k;

    .line 1264
    .line 1265
    if-nez v0, :cond_38

    .line 1266
    .line 1267
    const/4 v0, 0x0

    .line 1268
    goto :goto_2b

    .line 1269
    :cond_38
    aget-object v0, v0, v2

    .line 1270
    .line 1271
    :goto_2b
    const v2, 0x7361697a

    .line 1272
    .line 1273
    .line 1274
    move-object/from16 v8, v25

    .line 1275
    .line 1276
    invoke-virtual {v8, v2}, Lk4/a$a;->c(I)Lk4/a$b;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    if-eqz v2, :cond_3f

    .line 1281
    .line 1282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1283
    .line 1284
    .line 1285
    iget-object v2, v2, Lk4/a$b;->b:Lv5/u;

    .line 1286
    .line 1287
    iget v3, v0, Lk4/k;->d:I

    .line 1288
    .line 1289
    const/16 v4, 0x8

    .line 1290
    .line 1291
    invoke-virtual {v2, v4}, Lv5/u;->G(I)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 1295
    .line 1296
    .line 1297
    move-result v5

    .line 1298
    const v6, 0xffffff

    .line 1299
    .line 1300
    .line 1301
    and-int/2addr v5, v6

    .line 1302
    const/4 v6, 0x1

    .line 1303
    and-int/2addr v5, v6

    .line 1304
    if-ne v5, v6, :cond_39

    .line 1305
    .line 1306
    invoke-virtual {v2, v4}, Lv5/u;->H(I)V

    .line 1307
    .line 1308
    .line 1309
    :cond_39
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 1310
    .line 1311
    .line 1312
    move-result v4

    .line 1313
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 1314
    .line 1315
    .line 1316
    move-result v5

    .line 1317
    iget v6, v1, Lk4/l;->e:I

    .line 1318
    .line 1319
    if-gt v5, v6, :cond_3e

    .line 1320
    .line 1321
    if-nez v4, :cond_3c

    .line 1322
    .line 1323
    iget-object v4, v1, Lk4/l;->l:[Z

    .line 1324
    .line 1325
    const/4 v6, 0x0

    .line 1326
    const/4 v7, 0x0

    .line 1327
    :goto_2c
    if-ge v6, v5, :cond_3b

    .line 1328
    .line 1329
    invoke-virtual {v2}, Lv5/u;->v()I

    .line 1330
    .line 1331
    .line 1332
    move-result v9

    .line 1333
    add-int/2addr v7, v9

    .line 1334
    if-le v9, v3, :cond_3a

    .line 1335
    .line 1336
    const/4 v9, 0x1

    .line 1337
    goto :goto_2d

    .line 1338
    :cond_3a
    const/4 v9, 0x0

    .line 1339
    :goto_2d
    aput-boolean v9, v4, v6

    .line 1340
    .line 1341
    add-int/lit8 v6, v6, 0x1

    .line 1342
    .line 1343
    goto :goto_2c

    .line 1344
    :cond_3b
    const/4 v2, 0x0

    .line 1345
    goto :goto_2f

    .line 1346
    :cond_3c
    if-le v4, v3, :cond_3d

    .line 1347
    .line 1348
    const/4 v2, 0x1

    .line 1349
    goto :goto_2e

    .line 1350
    :cond_3d
    const/4 v2, 0x0

    .line 1351
    :goto_2e
    mul-int/2addr v4, v5

    .line 1352
    const/4 v3, 0x0

    .line 1353
    add-int/lit8 v7, v4, 0x0

    .line 1354
    .line 1355
    iget-object v4, v1, Lk4/l;->l:[Z

    .line 1356
    .line 1357
    invoke-static {v4, v3, v5, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1358
    .line 1359
    .line 1360
    move v2, v3

    .line 1361
    :goto_2f
    iget-object v3, v1, Lk4/l;->l:[Z

    .line 1362
    .line 1363
    iget v4, v1, Lk4/l;->e:I

    .line 1364
    .line 1365
    invoke-static {v3, v5, v4, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1366
    .line 1367
    .line 1368
    if-lez v7, :cond_3f

    .line 1369
    .line 1370
    iget-object v2, v1, Lk4/l;->n:Lv5/u;

    .line 1371
    .line 1372
    invoke-virtual {v2, v7}, Lv5/u;->D(I)V

    .line 1373
    .line 1374
    .line 1375
    const/4 v2, 0x1

    .line 1376
    iput-boolean v2, v1, Lk4/l;->k:Z

    .line 1377
    .line 1378
    iput-boolean v2, v1, Lk4/l;->o:Z

    .line 1379
    .line 1380
    goto :goto_30

    .line 1381
    :cond_3e
    const-string v0, "Saiz sample count "

    .line 1382
    .line 1383
    const-string v2, " is greater than fragment sample count"

    .line 1384
    .line 1385
    invoke-static {v0, v5, v2}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    iget v1, v1, Lk4/l;->e:I

    .line 1390
    .line 1391
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    const/4 v1, 0x0

    .line 1399
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    throw v0

    .line 1404
    :cond_3f
    :goto_30
    const v2, 0x7361696f

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v8, v2}, Lk4/a$a;->c(I)Lk4/a$b;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    if-eqz v2, :cond_43

    .line 1412
    .line 1413
    iget-object v2, v2, Lk4/a$b;->b:Lv5/u;

    .line 1414
    .line 1415
    const/16 v3, 0x8

    .line 1416
    .line 1417
    invoke-virtual {v2, v3}, Lv5/u;->G(I)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v2}, Lv5/u;->f()I

    .line 1421
    .line 1422
    .line 1423
    move-result v4

    .line 1424
    const v5, 0xffffff

    .line 1425
    .line 1426
    .line 1427
    and-int/2addr v5, v4

    .line 1428
    const/4 v6, 0x1

    .line 1429
    and-int/2addr v5, v6

    .line 1430
    if-ne v5, v6, :cond_40

    .line 1431
    .line 1432
    invoke-virtual {v2, v3}, Lv5/u;->H(I)V

    .line 1433
    .line 1434
    .line 1435
    :cond_40
    invoke-virtual {v2}, Lv5/u;->y()I

    .line 1436
    .line 1437
    .line 1438
    move-result v3

    .line 1439
    if-ne v3, v6, :cond_42

    .line 1440
    .line 1441
    shr-int/lit8 v3, v4, 0x18

    .line 1442
    .line 1443
    and-int/lit16 v3, v3, 0xff

    .line 1444
    .line 1445
    iget-wide v4, v1, Lk4/l;->c:J

    .line 1446
    .line 1447
    if-nez v3, :cond_41

    .line 1448
    .line 1449
    invoke-virtual {v2}, Lv5/u;->w()J

    .line 1450
    .line 1451
    .line 1452
    move-result-wide v2

    .line 1453
    goto :goto_31

    .line 1454
    :cond_41
    invoke-virtual {v2}, Lv5/u;->z()J

    .line 1455
    .line 1456
    .line 1457
    move-result-wide v2

    .line 1458
    :goto_31
    add-long/2addr v4, v2

    .line 1459
    iput-wide v4, v1, Lk4/l;->c:J

    .line 1460
    .line 1461
    goto :goto_32

    .line 1462
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1463
    .line 1464
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1465
    .line 1466
    .line 1467
    const-string v1, "Unexpected saio entry count: "

    .line 1468
    .line 1469
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    const/4 v1, 0x0

    .line 1480
    invoke-static {v0, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v0

    .line 1484
    throw v0

    .line 1485
    :cond_43
    :goto_32
    const/4 v2, 0x0

    .line 1486
    const v3, 0x73656e63

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v8, v3}, Lk4/a$a;->c(I)Lk4/a$b;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    if-eqz v3, :cond_44

    .line 1494
    .line 1495
    iget-object v3, v3, Lk4/a$b;->b:Lv5/u;

    .line 1496
    .line 1497
    const/4 v4, 0x0

    .line 1498
    invoke-static {v3, v4, v1}, Lk4/e;->c(Lv5/u;ILk4/l;)V

    .line 1499
    .line 1500
    .line 1501
    :cond_44
    if-eqz v0, :cond_45

    .line 1502
    .line 1503
    iget-object v0, v0, Lk4/k;->b:Ljava/lang/String;

    .line 1504
    .line 1505
    move-object/from16 v32, v0

    .line 1506
    .line 1507
    goto :goto_33

    .line 1508
    :cond_45
    move-object/from16 v32, v2

    .line 1509
    .line 1510
    :goto_33
    const/4 v0, 0x0

    .line 1511
    move-object v3, v2

    .line 1512
    move-object v4, v3

    .line 1513
    :goto_34
    iget-object v5, v8, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 1514
    .line 1515
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1516
    .line 1517
    .line 1518
    move-result v5

    .line 1519
    if-ge v0, v5, :cond_48

    .line 1520
    .line 1521
    iget-object v5, v8, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 1522
    .line 1523
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v5

    .line 1527
    check-cast v5, Lk4/a$b;

    .line 1528
    .line 1529
    iget-object v6, v5, Lk4/a$b;->b:Lv5/u;

    .line 1530
    .line 1531
    iget v5, v5, Lk4/a;->a:I

    .line 1532
    .line 1533
    const v7, 0x73626770

    .line 1534
    .line 1535
    .line 1536
    const v9, 0x73656967

    .line 1537
    .line 1538
    .line 1539
    if-ne v5, v7, :cond_46

    .line 1540
    .line 1541
    const/16 v5, 0xc

    .line 1542
    .line 1543
    invoke-virtual {v6, v5}, Lv5/u;->G(I)V

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v6}, Lv5/u;->f()I

    .line 1547
    .line 1548
    .line 1549
    move-result v5

    .line 1550
    if-ne v5, v9, :cond_47

    .line 1551
    .line 1552
    move-object v3, v6

    .line 1553
    goto :goto_35

    .line 1554
    :cond_46
    const/16 v7, 0xc

    .line 1555
    .line 1556
    const v10, 0x73677064

    .line 1557
    .line 1558
    .line 1559
    if-ne v5, v10, :cond_47

    .line 1560
    .line 1561
    invoke-virtual {v6, v7}, Lv5/u;->G(I)V

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v6}, Lv5/u;->f()I

    .line 1565
    .line 1566
    .line 1567
    move-result v5

    .line 1568
    if-ne v5, v9, :cond_47

    .line 1569
    .line 1570
    move-object v4, v6

    .line 1571
    :cond_47
    :goto_35
    add-int/lit8 v0, v0, 0x1

    .line 1572
    .line 1573
    goto :goto_34

    .line 1574
    :cond_48
    if-eqz v3, :cond_53

    .line 1575
    .line 1576
    if-nez v4, :cond_49

    .line 1577
    .line 1578
    goto/16 :goto_38

    .line 1579
    .line 1580
    :cond_49
    const/16 v0, 0x8

    .line 1581
    .line 1582
    invoke-virtual {v3, v0}, Lv5/u;->G(I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v3}, Lv5/u;->f()I

    .line 1586
    .line 1587
    .line 1588
    move-result v0

    .line 1589
    shr-int/lit8 v0, v0, 0x18

    .line 1590
    .line 1591
    and-int/lit16 v0, v0, 0xff

    .line 1592
    .line 1593
    const/4 v5, 0x4

    .line 1594
    invoke-virtual {v3, v5}, Lv5/u;->H(I)V

    .line 1595
    .line 1596
    .line 1597
    const/4 v6, 0x1

    .line 1598
    if-ne v0, v6, :cond_4a

    .line 1599
    .line 1600
    invoke-virtual {v3, v5}, Lv5/u;->H(I)V

    .line 1601
    .line 1602
    .line 1603
    :cond_4a
    invoke-virtual {v3}, Lv5/u;->f()I

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    if-ne v0, v6, :cond_52

    .line 1608
    .line 1609
    const/16 v0, 0x8

    .line 1610
    .line 1611
    invoke-virtual {v4, v0}, Lv5/u;->G(I)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v4}, Lv5/u;->f()I

    .line 1615
    .line 1616
    .line 1617
    move-result v0

    .line 1618
    shr-int/lit8 v0, v0, 0x18

    .line 1619
    .line 1620
    and-int/lit16 v0, v0, 0xff

    .line 1621
    .line 1622
    invoke-virtual {v4, v5}, Lv5/u;->H(I)V

    .line 1623
    .line 1624
    .line 1625
    if-ne v0, v6, :cond_4c

    .line 1626
    .line 1627
    invoke-virtual {v4}, Lv5/u;->w()J

    .line 1628
    .line 1629
    .line 1630
    move-result-wide v5

    .line 1631
    const-wide/16 v9, 0x0

    .line 1632
    .line 1633
    cmp-long v0, v5, v9

    .line 1634
    .line 1635
    if-eqz v0, :cond_4b

    .line 1636
    .line 1637
    goto :goto_36

    .line 1638
    :cond_4b
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 1639
    .line 1640
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v0

    .line 1644
    throw v0

    .line 1645
    :cond_4c
    const/4 v3, 0x2

    .line 1646
    if-lt v0, v3, :cond_4d

    .line 1647
    .line 1648
    invoke-virtual {v4, v5}, Lv5/u;->H(I)V

    .line 1649
    .line 1650
    .line 1651
    :cond_4d
    :goto_36
    invoke-virtual {v4}, Lv5/u;->w()J

    .line 1652
    .line 1653
    .line 1654
    move-result-wide v5

    .line 1655
    const-wide/16 v9, 0x1

    .line 1656
    .line 1657
    cmp-long v0, v5, v9

    .line 1658
    .line 1659
    if-nez v0, :cond_51

    .line 1660
    .line 1661
    const/4 v0, 0x1

    .line 1662
    invoke-virtual {v4, v0}, Lv5/u;->H(I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 1666
    .line 1667
    .line 1668
    move-result v3

    .line 1669
    and-int/lit16 v5, v3, 0xf0

    .line 1670
    .line 1671
    shr-int/lit8 v35, v5, 0x4

    .line 1672
    .line 1673
    and-int/lit8 v36, v3, 0xf

    .line 1674
    .line 1675
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 1676
    .line 1677
    .line 1678
    move-result v3

    .line 1679
    if-ne v3, v0, :cond_4e

    .line 1680
    .line 1681
    const/4 v0, 0x1

    .line 1682
    goto :goto_37

    .line 1683
    :cond_4e
    const/4 v0, 0x0

    .line 1684
    :goto_37
    move/from16 v31, v0

    .line 1685
    .line 1686
    if-nez v31, :cond_4f

    .line 1687
    .line 1688
    goto :goto_38

    .line 1689
    :cond_4f
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 1690
    .line 1691
    .line 1692
    move-result v33

    .line 1693
    const/16 v0, 0x10

    .line 1694
    .line 1695
    new-array v3, v0, [B

    .line 1696
    .line 1697
    const/4 v5, 0x0

    .line 1698
    invoke-virtual {v4, v3, v5, v0}, Lv5/u;->d([BII)V

    .line 1699
    .line 1700
    .line 1701
    if-nez v33, :cond_50

    .line 1702
    .line 1703
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 1704
    .line 1705
    .line 1706
    move-result v0

    .line 1707
    new-array v2, v0, [B

    .line 1708
    .line 1709
    invoke-virtual {v4, v2, v5, v0}, Lv5/u;->d([BII)V

    .line 1710
    .line 1711
    .line 1712
    :cond_50
    move-object/from16 v37, v2

    .line 1713
    .line 1714
    const/4 v0, 0x1

    .line 1715
    iput-boolean v0, v1, Lk4/l;->k:Z

    .line 1716
    .line 1717
    new-instance v0, Lk4/k;

    .line 1718
    .line 1719
    move-object/from16 v30, v0

    .line 1720
    .line 1721
    move-object/from16 v34, v3

    .line 1722
    .line 1723
    invoke-direct/range {v30 .. v37}, Lk4/k;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1724
    .line 1725
    .line 1726
    iput-object v0, v1, Lk4/l;->m:Lk4/k;

    .line 1727
    .line 1728
    goto :goto_38

    .line 1729
    :cond_51
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 1730
    .line 1731
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v0

    .line 1735
    throw v0

    .line 1736
    :cond_52
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 1737
    .line 1738
    invoke-static {v0}, Lv3/a1;->c(Ljava/lang/String;)Lv3/a1;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    throw v0

    .line 1743
    :cond_53
    :goto_38
    iget-object v0, v8, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 1744
    .line 1745
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1746
    .line 1747
    .line 1748
    move-result v0

    .line 1749
    const/4 v2, 0x0

    .line 1750
    :goto_39
    if-ge v2, v0, :cond_56

    .line 1751
    .line 1752
    iget-object v3, v8, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 1753
    .line 1754
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v3

    .line 1758
    check-cast v3, Lk4/a$b;

    .line 1759
    .line 1760
    iget v4, v3, Lk4/a;->a:I

    .line 1761
    .line 1762
    const v5, 0x75756964

    .line 1763
    .line 1764
    .line 1765
    if-ne v4, v5, :cond_55

    .line 1766
    .line 1767
    iget-object v3, v3, Lk4/a$b;->b:Lv5/u;

    .line 1768
    .line 1769
    const/16 v4, 0x8

    .line 1770
    .line 1771
    invoke-virtual {v3, v4}, Lv5/u;->G(I)V

    .line 1772
    .line 1773
    .line 1774
    const/16 v4, 0x10

    .line 1775
    .line 1776
    const/4 v5, 0x0

    .line 1777
    move-object/from16 v6, v29

    .line 1778
    .line 1779
    invoke-virtual {v3, v6, v5, v4}, Lv5/u;->d([BII)V

    .line 1780
    .line 1781
    .line 1782
    sget-object v5, Lk4/e;->I:[B

    .line 1783
    .line 1784
    invoke-static {v6, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v5

    .line 1788
    if-nez v5, :cond_54

    .line 1789
    .line 1790
    goto :goto_3a

    .line 1791
    :cond_54
    invoke-static {v3, v4, v1}, Lk4/e;->c(Lv5/u;ILk4/l;)V

    .line 1792
    .line 1793
    .line 1794
    goto :goto_3a

    .line 1795
    :cond_55
    move-object/from16 v6, v29

    .line 1796
    .line 1797
    :goto_3a
    add-int/lit8 v2, v2, 0x1

    .line 1798
    .line 1799
    move-object/from16 v29, v6

    .line 1800
    .line 1801
    goto :goto_39

    .line 1802
    :cond_56
    move-object/from16 v6, v29

    .line 1803
    .line 1804
    goto :goto_3c

    .line 1805
    :cond_57
    :goto_3b
    move-object/from16 v16, v2

    .line 1806
    .line 1807
    move/from16 v18, v3

    .line 1808
    .line 1809
    move-object/from16 v26, v4

    .line 1810
    .line 1811
    move/from16 v42, v5

    .line 1812
    .line 1813
    move/from16 v17, v6

    .line 1814
    .line 1815
    move/from16 v24, v7

    .line 1816
    .line 1817
    move-object v6, v1

    .line 1818
    :goto_3c
    add-int/lit8 v7, v24, 0x1

    .line 1819
    .line 1820
    move-object/from16 v0, p0

    .line 1821
    .line 1822
    move-object v1, v6

    .line 1823
    move-object/from16 v2, v16

    .line 1824
    .line 1825
    move/from16 v6, v17

    .line 1826
    .line 1827
    move/from16 v3, v18

    .line 1828
    .line 1829
    move-object/from16 v4, v26

    .line 1830
    .line 1831
    move/from16 v5, v42

    .line 1832
    .line 1833
    goto/16 :goto_c

    .line 1834
    .line 1835
    :cond_58
    move-object/from16 v26, v4

    .line 1836
    .line 1837
    const/4 v0, 0x0

    .line 1838
    move-object/from16 v3, v26

    .line 1839
    .line 1840
    iget-object v1, v3, Lk4/a$a;->c:Ljava/util/ArrayList;

    .line 1841
    .line 1842
    invoke-static {v1}, Lk4/e;->a(Ljava/util/ArrayList;)La4/d;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v1

    .line 1846
    move-object/from16 v4, p0

    .line 1847
    .line 1848
    if-eqz v1, :cond_5b

    .line 1849
    .line 1850
    iget-object v2, v4, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1851
    .line 1852
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 1853
    .line 1854
    .line 1855
    move-result v2

    .line 1856
    const/4 v3, 0x0

    .line 1857
    :goto_3d
    if-ge v3, v2, :cond_5b

    .line 1858
    .line 1859
    iget-object v5, v4, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1860
    .line 1861
    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v5

    .line 1865
    check-cast v5, Lk4/e$b;

    .line 1866
    .line 1867
    iget-object v6, v5, Lk4/e$b;->d:Lk4/m;

    .line 1868
    .line 1869
    iget-object v6, v6, Lk4/m;->a:Lk4/j;

    .line 1870
    .line 1871
    iget-object v7, v5, Lk4/e$b;->b:Lk4/l;

    .line 1872
    .line 1873
    iget-object v7, v7, Lk4/l;->a:Lk4/c;

    .line 1874
    .line 1875
    sget v8, Lv5/e0;->a:I

    .line 1876
    .line 1877
    iget v7, v7, Lk4/c;->a:I

    .line 1878
    .line 1879
    iget-object v6, v6, Lk4/j;->k:[Lk4/k;

    .line 1880
    .line 1881
    if-nez v6, :cond_59

    .line 1882
    .line 1883
    move-object v6, v0

    .line 1884
    goto :goto_3e

    .line 1885
    :cond_59
    aget-object v6, v6, v7

    .line 1886
    .line 1887
    :goto_3e
    if-eqz v6, :cond_5a

    .line 1888
    .line 1889
    iget-object v6, v6, Lk4/k;->b:Ljava/lang/String;

    .line 1890
    .line 1891
    goto :goto_3f

    .line 1892
    :cond_5a
    move-object v6, v0

    .line 1893
    :goto_3f
    invoke-virtual {v1, v6}, La4/d;->a(Ljava/lang/String;)La4/d;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v6

    .line 1897
    iget-object v7, v5, Lk4/e$b;->d:Lk4/m;

    .line 1898
    .line 1899
    iget-object v7, v7, Lk4/m;->a:Lk4/j;

    .line 1900
    .line 1901
    iget-object v7, v7, Lk4/j;->f:Lv3/i0;

    .line 1902
    .line 1903
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1904
    .line 1905
    .line 1906
    new-instance v8, Lv3/i0$a;

    .line 1907
    .line 1908
    invoke-direct {v8, v7}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 1909
    .line 1910
    .line 1911
    iput-object v6, v8, Lv3/i0$a;->n:La4/d;

    .line 1912
    .line 1913
    new-instance v6, Lv3/i0;

    .line 1914
    .line 1915
    invoke-direct {v6, v8}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1916
    .line 1917
    .line 1918
    iget-object v5, v5, Lk4/e$b;->a:Lc4/v;

    .line 1919
    .line 1920
    invoke-interface {v5, v6}, Lc4/v;->d(Lv3/i0;)V

    .line 1921
    .line 1922
    .line 1923
    add-int/lit8 v3, v3, 0x1

    .line 1924
    .line 1925
    goto :goto_3d

    .line 1926
    :cond_5b
    iget-wide v0, v4, Lk4/e;->w:J

    .line 1927
    .line 1928
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    cmp-long v0, v0, v2

    .line 1934
    .line 1935
    if-eqz v0, :cond_5f

    .line 1936
    .line 1937
    iget-object v0, v4, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1938
    .line 1939
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 1940
    .line 1941
    .line 1942
    move-result v0

    .line 1943
    const/4 v1, 0x0

    .line 1944
    :goto_40
    if-ge v1, v0, :cond_5e

    .line 1945
    .line 1946
    iget-object v2, v4, Lk4/e;->d:Landroid/util/SparseArray;

    .line 1947
    .line 1948
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v2

    .line 1952
    check-cast v2, Lk4/e$b;

    .line 1953
    .line 1954
    iget-wide v5, v4, Lk4/e;->w:J

    .line 1955
    .line 1956
    iget v3, v2, Lk4/e$b;->f:I

    .line 1957
    .line 1958
    :goto_41
    iget-object v7, v2, Lk4/e$b;->b:Lk4/l;

    .line 1959
    .line 1960
    iget v8, v7, Lk4/l;->e:I

    .line 1961
    .line 1962
    if-ge v3, v8, :cond_5d

    .line 1963
    .line 1964
    iget-object v8, v7, Lk4/l;->i:[J

    .line 1965
    .line 1966
    aget-wide v9, v8, v3

    .line 1967
    .line 1968
    cmp-long v8, v9, v5

    .line 1969
    .line 1970
    if-gtz v8, :cond_5d

    .line 1971
    .line 1972
    iget-object v7, v7, Lk4/l;->j:[Z

    .line 1973
    .line 1974
    aget-boolean v7, v7, v3

    .line 1975
    .line 1976
    if-eqz v7, :cond_5c

    .line 1977
    .line 1978
    iput v3, v2, Lk4/e$b;->i:I

    .line 1979
    .line 1980
    :cond_5c
    add-int/lit8 v3, v3, 0x1

    .line 1981
    .line 1982
    goto :goto_41

    .line 1983
    :cond_5d
    add-int/lit8 v1, v1, 0x1

    .line 1984
    .line 1985
    goto :goto_40

    .line 1986
    :cond_5e
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    iput-wide v0, v4, Lk4/e;->w:J

    .line 1992
    .line 1993
    :cond_5f
    move-object v1, v4

    .line 1994
    move-object v2, v1

    .line 1995
    goto :goto_42

    .line 1996
    :cond_60
    move-object v3, v4

    .line 1997
    move-object v4, v0

    .line 1998
    iget-object v0, v1, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 1999
    .line 2000
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2001
    .line 2002
    .line 2003
    move-result v0

    .line 2004
    if-nez v0, :cond_61

    .line 2005
    .line 2006
    iget-object v0, v1, Lk4/e;->m:Ljava/util/ArrayDeque;

    .line 2007
    .line 2008
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v0

    .line 2012
    check-cast v0, Lk4/a$a;

    .line 2013
    .line 2014
    iget-object v0, v0, Lk4/a$a;->d:Ljava/util/ArrayList;

    .line 2015
    .line 2016
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2017
    .line 2018
    .line 2019
    :cond_61
    :goto_42
    move-object v0, v4

    .line 2020
    goto/16 :goto_0

    .line 2021
    .line 2022
    :cond_62
    move-object v4, v0

    .line 2023
    const/4 v0, 0x0

    .line 2024
    iput v0, v2, Lk4/e;->p:I

    .line 2025
    .line 2026
    iput v0, v2, Lk4/e;->s:I

    .line 2027
    .line 2028
    return-void
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public final f(JJ)V
    .locals 2

    iget-object p1, p0, Lk4/e;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lk4/e;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk4/e$b;

    invoke-virtual {v1}, Lk4/e$b;->d()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk4/e;->n:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lk4/e;->v:I

    iput-wide p3, p0, Lk4/e;->w:J

    iget-object p1, p0, Lk4/e;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lk4/e;->p:I

    iput p2, p0, Lk4/e;->s:I

    return-void
.end method

.method public final i(Lc4/i;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lb/a0;->L(Lc4/i;ZZ)Z

    move-result p1

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
