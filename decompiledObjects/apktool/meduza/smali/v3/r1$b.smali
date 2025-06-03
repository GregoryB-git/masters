.class public final Lv3/r1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field public o:La5/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/r1$b;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/r1$b;->q:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/r1$b;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/r1$b;->s:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/r1$b;->t:Ljava/lang/String;

    new-instance v0, Lw3/v;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lw3/v;-><init>(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La5/a;->o:La5/a;

    iput-object v0, p0, Lv3/r1$b;->o:La5/a;

    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 2

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0, p1}, La5/a;->a(I)La5/a$a;

    move-result-object p1

    iget v0, p1, La5/a$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, La5/a$a;->f:[J

    aget-wide v0, p1, p2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public final b(J)I
    .locals 9

    .line 1
    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    .line 2
    .line 3
    iget-wide v1, p0, Lv3/r1$b;->d:J

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/high16 v3, -0x8000000000000000L

    .line 9
    .line 10
    cmp-long v5, p1, v3

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    if-eqz v5, :cond_6

    .line 14
    .line 15
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v5, v1, v7

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    cmp-long v1, p1, v1

    .line 25
    .line 26
    if-ltz v1, :cond_0

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_0
    iget v1, v0, La5/a;->e:I

    .line 30
    .line 31
    :goto_0
    iget v2, v0, La5/a;->b:I

    .line 32
    .line 33
    if-ge v1, v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La5/a;->a(I)La5/a$a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-wide v7, v2, La5/a$a;->a:J

    .line 40
    .line 41
    cmp-long v2, v7, v3

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, v1}, La5/a;->a(I)La5/a$a;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-wide v7, v2, La5/a$a;->a:J

    .line 50
    .line 51
    cmp-long v2, v7, p1

    .line 52
    .line 53
    if-lez v2, :cond_4

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0, v1}, La5/a;->a(I)La5/a$a;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget v5, v2, La5/a$a;->b:I

    .line 60
    .line 61
    if-eq v5, v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2, v6}, La5/a$a;->a(I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget v2, v2, La5/a$a;->b:I

    .line 68
    .line 69
    if-ge v5, v2, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v2, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    const/4 v2, 0x1

    .line 75
    :goto_2
    if-nez v2, :cond_5

    .line 76
    .line 77
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    iget p1, v0, La5/a;->b:I

    .line 81
    .line 82
    if-ge v1, p1, :cond_6

    .line 83
    .line 84
    move v6, v1

    .line 85
    :cond_6
    :goto_3
    return v6
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

.method public final c(J)I
    .locals 10

    .line 1
    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    .line 2
    .line 3
    iget-wide v1, p0, Lv3/r1$b;->d:J

    .line 4
    .line 5
    iget v3, v0, La5/a;->b:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    sub-int/2addr v3, v4

    .line 9
    :goto_0
    const/4 v5, 0x0

    .line 10
    if-ltz v3, :cond_4

    .line 11
    .line 12
    const-wide/high16 v6, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long v8, p1, v6

    .line 15
    .line 16
    if-nez v8, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-virtual {v0, v3}, La5/a;->a(I)La5/a$a;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-wide v8, v8, La5/a$a;->a:J

    .line 24
    .line 25
    cmp-long v6, v8, v6

    .line 26
    .line 27
    if-nez v6, :cond_1

    .line 28
    .line 29
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v6, v1, v6

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    cmp-long v6, p1, v1

    .line 39
    .line 40
    if-gez v6, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    cmp-long v6, p1, v8

    .line 44
    .line 45
    if-gez v6, :cond_3

    .line 46
    .line 47
    :cond_2
    :goto_1
    move v6, v4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    :goto_2
    move v6, v5

    .line 50
    :goto_3
    if-eqz v6, :cond_4

    .line 51
    .line 52
    add-int/lit8 v3, v3, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    const/4 p1, -0x1

    .line 56
    if-ltz v3, :cond_9

    .line 57
    .line 58
    invoke-virtual {v0, v3}, La5/a;->a(I)La5/a$a;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget v0, p2, La5/a$a;->b:I

    .line 63
    .line 64
    if-ne v0, p1, :cond_5

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_5
    move v0, v5

    .line 68
    :goto_4
    iget v1, p2, La5/a$a;->b:I

    .line 69
    .line 70
    if-ge v0, v1, :cond_7

    .line 71
    .line 72
    iget-object v1, p2, La5/a$a;->e:[I

    .line 73
    .line 74
    aget v1, v1, v0

    .line 75
    .line 76
    if-eqz v1, :cond_8

    .line 77
    .line 78
    if-ne v1, v4, :cond_6

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    move v4, v5

    .line 85
    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_9
    move v3, p1

    .line 89
    :goto_6
    return v3
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

.method public final d(I)J
    .locals 2

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0, p1}, La5/a;->a(I)La5/a$a;

    move-result-object p1

    iget-wide v0, p1, La5/a$a;->a:J

    return-wide v0
.end method

.method public final e(II)I
    .locals 2

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0, p1}, La5/a;->a(I)La5/a$a;

    move-result-object p1

    iget v0, p1, La5/a$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, La5/a$a;->e:[I

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lv3/r1$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv3/r1$b;

    iget-object v2, p0, Lv3/r1$b;->a:Ljava/lang/Object;

    iget-object v3, p1, Lv3/r1$b;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/r1$b;->b:Ljava/lang/Object;

    iget-object v3, p1, Lv3/r1$b;->b:Ljava/lang/Object;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lv3/r1$b;->c:I

    iget v3, p1, Lv3/r1$b;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lv3/r1$b;->d:J

    iget-wide v4, p1, Lv3/r1$b;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv3/r1$b;->e:J

    iget-wide v4, p1, Lv3/r1$b;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lv3/r1$b;->f:Z

    iget-boolean v3, p1, Lv3/r1$b;->f:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lv3/r1$b;->o:La5/a;

    iget-object p1, p1, Lv3/r1$b;->o:La5/a;

    invoke-static {v2, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final f(I)I
    .locals 1

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0, p1}, La5/a;->a(I)La5/a$a;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, La5/a$a;->a(I)I

    move-result p1

    return p1
.end method

.method public final g(I)Z
    .locals 1

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0, p1}, La5/a;->a(I)La5/a$a;

    move-result-object p1

    iget-boolean p1, p1, La5/a$a;->p:Z

    return p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;IJJLa5/a;Z)V
    .locals 0

    iput-object p1, p0, Lv3/r1$b;->a:Ljava/lang/Object;

    iput-object p2, p0, Lv3/r1$b;->b:Ljava/lang/Object;

    iput p3, p0, Lv3/r1$b;->c:I

    iput-wide p4, p0, Lv3/r1$b;->d:J

    iput-wide p6, p0, Lv3/r1$b;->e:J

    iput-object p8, p0, Lv3/r1$b;->o:La5/a;

    iput-boolean p9, p0, Lv3/r1$b;->f:Z

    return-void
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lv3/r1$b;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0xd9

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lv3/r1$b;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lv3/r1$b;->c:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lv3/r1$b;->d:J

    const/16 v3, 0x20

    ushr-long v4, v0, v3

    xor-long/2addr v0, v4

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lv3/r1$b;->e:J

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Lv3/r1$b;->f:Z

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lv3/r1$b;->o:La5/a;

    invoke-virtual {v0}, La5/a;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
