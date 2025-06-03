.class public final Li5/b;
.super Li5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/b$a;,
        Li5/b$b;,
        Li5/b$c;
    }
.end annotation


# instance fields
.field public final g:Lv5/u;

.field public final h:Lv5/t;

.field public i:I

.field public final j:I

.field public final k:[Li5/b$b;

.field public l:Li5/b$b;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field

.field public o:Li5/b$c;

.field public p:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Li5/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv5/u;

    .line 5
    .line 6
    invoke-direct {v0}, Lv5/u;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li5/b;->g:Lv5/u;

    .line 10
    .line 11
    new-instance v0, Lv5/t;

    .line 12
    .line 13
    invoke-direct {v0}, Lv5/t;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Li5/b;->h:Lv5/t;

    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    iput v0, p0, Li5/b;->i:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    :cond_0
    iput p1, p0, Li5/b;->j:I

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, [B

    .line 41
    .line 42
    array-length v0, v0

    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, [B

    .line 50
    .line 51
    aget-byte p2, p2, p1

    .line 52
    .line 53
    if-ne p2, v1, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v1, p1

    .line 57
    :cond_2
    :goto_0
    const/16 p2, 0x8

    .line 58
    .line 59
    new-array v0, p2, [Li5/b$b;

    .line 60
    .line 61
    iput-object v0, p0, Li5/b;->k:[Li5/b$b;

    .line 62
    .line 63
    move v0, p1

    .line 64
    :goto_1
    if-ge v0, p2, :cond_3

    .line 65
    .line 66
    iget-object v1, p0, Li5/b;->k:[Li5/b$b;

    .line 67
    .line 68
    new-instance v2, Li5/b$b;

    .line 69
    .line 70
    invoke-direct {v2}, Li5/b$b;-><init>()V

    .line 71
    .line 72
    .line 73
    aput-object v2, v1, v0

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object p2, p0, Li5/b;->k:[Li5/b$b;

    .line 79
    .line 80
    aget-object p1, p2, p1

    .line 81
    .line 82
    iput-object p1, p0, Li5/b;->l:Li5/b$b;

    .line 83
    .line 84
    return-void
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
.method public final e()Li5/d;
    .locals 2

    .line 1
    iget-object v0, p0, Li5/b;->m:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Li5/b;->n:Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Li5/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Li5/d;-><init>(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-object v1
    .line 14
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
.end method

.method public final f(Li5/c$a;)V
    .locals 8

    .line 1
    iget-object p1, p1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Li5/b;->g:Lv5/u;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v1, v0, p1}, Lv5/u;->E([BI)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    iget-object p1, p0, Li5/b;->g:Lv5/u;

    .line 20
    .line 21
    iget v0, p1, Lv5/u;->c:I

    .line 22
    .line 23
    iget v1, p1, Lv5/u;->b:I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    const/4 v1, 0x3

    .line 27
    if-lt v0, v1, :cond_9

    .line 28
    .line 29
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    and-int/lit8 p1, p1, 0x7

    .line 34
    .line 35
    and-int/lit8 v0, p1, 0x3

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    and-int/2addr p1, v2

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-ne p1, v2, :cond_1

    .line 42
    .line 43
    move p1, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move p1, v3

    .line 46
    :goto_1
    iget-object v5, p0, Li5/b;->g:Lv5/u;

    .line 47
    .line 48
    invoke-virtual {v5}, Lv5/u;->v()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    int-to-byte v5, v5

    .line 53
    iget-object v6, p0, Li5/b;->g:Lv5/u;

    .line 54
    .line 55
    invoke-virtual {v6}, Lv5/u;->v()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    int-to-byte v6, v6

    .line 60
    const/4 v7, 0x2

    .line 61
    if-eq v0, v7, :cond_2

    .line 62
    .line 63
    if-eq v0, v1, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const-string p1, "Cea708Decoder"

    .line 70
    .line 71
    if-ne v0, v1, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, Li5/b;->i()V

    .line 74
    .line 75
    .line 76
    and-int/lit16 v0, v5, 0xc0

    .line 77
    .line 78
    shr-int/lit8 v0, v0, 0x6

    .line 79
    .line 80
    iget v1, p0, Li5/b;->i:I

    .line 81
    .line 82
    const/4 v3, -0x1

    .line 83
    if-eq v1, v3, :cond_4

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    rem-int/2addr v1, v2

    .line 88
    if-eq v0, v1, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Li5/b;->k()V

    .line 91
    .line 92
    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v2, "Sequence number discontinuity. previous="

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget v2, p0, Li5/b;->i:I

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v2, " current="

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {p1, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    iput v0, p0, Li5/b;->i:I

    .line 124
    .line 125
    and-int/lit8 p1, v5, 0x3f

    .line 126
    .line 127
    if-nez p1, :cond_5

    .line 128
    .line 129
    const/16 p1, 0x40

    .line 130
    .line 131
    :cond_5
    new-instance v1, Li5/b$c;

    .line 132
    .line 133
    invoke-direct {v1, v0, p1}, Li5/b$c;-><init>(II)V

    .line 134
    .line 135
    .line 136
    iput-object v1, p0, Li5/b;->o:Li5/b$c;

    .line 137
    .line 138
    iget-object p1, v1, Li5/b$c;->c:[B

    .line 139
    .line 140
    iget v0, v1, Li5/b$c;->d:I

    .line 141
    .line 142
    add-int/lit8 v2, v0, 0x1

    .line 143
    .line 144
    iput v2, v1, Li5/b$c;->d:I

    .line 145
    .line 146
    aput-byte v6, p1, v0

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    if-ne v0, v7, :cond_7

    .line 150
    .line 151
    move v3, v4

    .line 152
    :cond_7
    invoke-static {v3}, Lx6/b;->q(Z)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Li5/b;->o:Li5/b$c;

    .line 156
    .line 157
    if-nez v0, :cond_8

    .line 158
    .line 159
    const-string v0, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"

    .line 160
    .line 161
    invoke-static {p1, v0}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_8
    iget-object p1, v0, Li5/b$c;->c:[B

    .line 167
    .line 168
    iget v1, v0, Li5/b$c;->d:I

    .line 169
    .line 170
    add-int/lit8 v2, v1, 0x1

    .line 171
    .line 172
    aput-byte v5, p1, v1

    .line 173
    .line 174
    add-int/lit8 v1, v2, 0x1

    .line 175
    .line 176
    iput v1, v0, Li5/b$c;->d:I

    .line 177
    .line 178
    aput-byte v6, p1, v2

    .line 179
    .line 180
    :goto_2
    iget-object p1, p0, Li5/b;->o:Li5/b$c;

    .line 181
    .line 182
    iget v0, p1, Li5/b$c;->d:I

    .line 183
    .line 184
    iget p1, p1, Li5/b$c;->b:I

    .line 185
    .line 186
    mul-int/2addr p1, v7

    .line 187
    sub-int/2addr p1, v4

    .line 188
    if-ne v0, p1, :cond_0

    .line 189
    .line 190
    invoke-virtual {p0}, Li5/b;->i()V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_9
    return-void
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

.method public final flush()V
    .locals 3

    invoke-super {p0}, Li5/c;->flush()V

    const/4 v0, 0x0

    iput-object v0, p0, Li5/b;->m:Ljava/util/List;

    iput-object v0, p0, Li5/b;->n:Ljava/util/List;

    const/4 v1, 0x0

    iput v1, p0, Li5/b;->p:I

    iget-object v2, p0, Li5/b;->k:[Li5/b$b;

    aget-object v1, v2, v1

    iput-object v1, p0, Li5/b;->l:Li5/b$b;

    invoke-virtual {p0}, Li5/b;->k()V

    iput-object v0, p0, Li5/b;->o:Li5/b$c;

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Li5/b;->m:Ljava/util/List;

    iget-object v1, p0, Li5/b;->n:Ljava/util/List;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li5/b;->o:Li5/b$c;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v2, v1, Li5/b$c;->d:I

    .line 9
    .line 10
    iget v1, v1, Li5/b$c;->b:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    mul-int/2addr v1, v3

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    const-string v4, "Cea708Decoder"

    .line 17
    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    const-string v1, "DtvCcPacket ended prematurely; size is "

    .line 21
    .line 22
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, Li5/b;->o:Li5/b$c;

    .line 27
    .line 28
    iget v2, v2, Li5/b$c;->b:I

    .line 29
    .line 30
    mul-int/2addr v2, v3

    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ", but current index is "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Li5/b;->o:Li5/b$c;

    .line 42
    .line 43
    iget v2, v2, Li5/b$c;->d:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " (sequence number "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, Li5/b;->o:Li5/b$c;

    .line 54
    .line 55
    iget v2, v2, Li5/b$c;->a:I

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ");"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v4, v1}, Lv5/m;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 73
    .line 74
    iget-object v2, v0, Li5/b;->o:Li5/b$c;

    .line 75
    .line 76
    iget-object v5, v2, Li5/b$c;->c:[B

    .line 77
    .line 78
    iget v2, v2, Li5/b$c;->d:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v2}, Lv5/t;->j([BI)V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    :cond_2
    :goto_0
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 85
    .line 86
    invoke-virtual {v2}, Lv5/t;->b()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-lez v2, :cond_39

    .line 91
    .line 92
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 93
    .line 94
    const/4 v5, 0x3

    .line 95
    invoke-virtual {v2, v5}, Lv5/t;->g(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    iget-object v6, v0, Li5/b;->h:Lv5/t;

    .line 100
    .line 101
    const/4 v7, 0x5

    .line 102
    invoke-virtual {v6, v7}, Lv5/t;->g(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    const/4 v7, 0x7

    .line 107
    const/4 v8, 0x6

    .line 108
    if-ne v2, v7, :cond_3

    .line 109
    .line 110
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Lv5/t;->m(I)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 116
    .line 117
    invoke-virtual {v2, v8}, Lv5/t;->g(I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ge v2, v7, :cond_3

    .line 122
    .line 123
    const-string v9, "Invalid extended service number: "

    .line 124
    .line 125
    invoke-static {v9, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    if-nez v6, :cond_4

    .line 129
    .line 130
    if-eqz v2, :cond_39

    .line 131
    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v5, "serviceNumber is non-zero ("

    .line 138
    .line 139
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v2, ") when blockSize is 0"

    .line 146
    .line 147
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v4, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_18

    .line 158
    .line 159
    :cond_4
    iget v9, v0, Li5/b;->j:I

    .line 160
    .line 161
    if-eq v2, v9, :cond_5

    .line 162
    .line 163
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 164
    .line 165
    invoke-virtual {v2, v6}, Lv5/t;->n(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_5
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 170
    .line 171
    invoke-virtual {v2}, Lv5/t;->e()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    mul-int/lit8 v6, v6, 0x8

    .line 176
    .line 177
    add-int/2addr v6, v2

    .line 178
    :cond_6
    :goto_1
    :pswitch_0
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 179
    .line 180
    invoke-virtual {v2}, Lv5/t;->e()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-ge v2, v6, :cond_2

    .line 185
    .line 186
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 187
    .line 188
    const/16 v9, 0x8

    .line 189
    .line 190
    invoke-virtual {v2, v9}, Lv5/t;->g(I)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    const/16 v10, 0x17

    .line 195
    .line 196
    const/16 v11, 0x9f

    .line 197
    .line 198
    const/16 v12, 0x18

    .line 199
    .line 200
    const/16 v13, 0x7f

    .line 201
    .line 202
    const/16 v14, 0x1f

    .line 203
    .line 204
    const/16 v15, 0x10

    .line 205
    .line 206
    if-eq v2, v15, :cond_22

    .line 207
    .line 208
    const/16 v15, 0xa

    .line 209
    .line 210
    if-gt v2, v14, :cond_b

    .line 211
    .line 212
    if-eqz v2, :cond_6

    .line 213
    .line 214
    if-eq v2, v5, :cond_a

    .line 215
    .line 216
    if-eq v2, v9, :cond_9

    .line 217
    .line 218
    packed-switch v2, :pswitch_data_0

    .line 219
    .line 220
    .line 221
    const/16 v11, 0x11

    .line 222
    .line 223
    if-lt v2, v11, :cond_7

    .line 224
    .line 225
    if-gt v2, v10, :cond_7

    .line 226
    .line 227
    const-string v10, "Currently unsupported COMMAND_EXT1 Command: "

    .line 228
    .line 229
    invoke-static {v10, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :pswitch_1
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 236
    .line 237
    invoke-virtual {v2, v15}, Li5/b$b;->a(C)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :pswitch_2
    invoke-virtual/range {p0 .. p0}, Li5/b;->k()V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_7
    if-lt v2, v12, :cond_8

    .line 246
    .line 247
    if-gt v2, v14, :cond_8

    .line 248
    .line 249
    const-string v9, "Currently unsupported COMMAND_P16 Command: "

    .line 250
    .line 251
    invoke-static {v9, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 255
    .line 256
    const/16 v9, 0x10

    .line 257
    .line 258
    :goto_2
    invoke-virtual {v2, v9}, Lv5/t;->m(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_8
    const-string v9, "Invalid C0 command: "

    .line 263
    .line 264
    invoke-static {v9, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_9
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 269
    .line 270
    iget-object v9, v2, Li5/b$b;->b:Landroid/text/SpannableStringBuilder;

    .line 271
    .line 272
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-lez v9, :cond_6

    .line 277
    .line 278
    iget-object v2, v2, Li5/b$b;->b:Landroid/text/SpannableStringBuilder;

    .line 279
    .line 280
    add-int/lit8 v10, v9, -0x1

    .line 281
    .line 282
    invoke-virtual {v2, v10, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_a
    invoke-virtual/range {p0 .. p0}, Li5/b;->j()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    iput-object v2, v0, Li5/b;->m:Ljava/util/List;

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_b
    if-gt v2, v13, :cond_d

    .line 294
    .line 295
    if-ne v2, v13, :cond_c

    .line 296
    .line 297
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 298
    .line 299
    const/16 v2, 0x266b

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_c
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 303
    .line 304
    and-int/lit16 v2, v2, 0xff

    .line 305
    .line 306
    int-to-char v2, v2

    .line 307
    :goto_3
    invoke-virtual {v1, v2}, Li5/b$b;->a(C)V

    .line 308
    .line 309
    .line 310
    const/4 v1, 0x1

    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :cond_d
    if-gt v2, v11, :cond_1f

    .line 314
    .line 315
    const/4 v1, 0x4

    .line 316
    packed-switch v2, :pswitch_data_1

    .line 317
    .line 318
    .line 319
    :pswitch_3
    const/4 v1, 0x1

    .line 320
    const-string v3, "Invalid C1 command: "

    .line 321
    .line 322
    invoke-static {v3, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_f

    .line 326
    .line 327
    :pswitch_4
    add-int/lit16 v2, v2, -0x98

    .line 328
    .line 329
    iget-object v10, v0, Li5/b;->k:[Li5/b$b;

    .line 330
    .line 331
    aget-object v10, v10, v2

    .line 332
    .line 333
    iget-object v11, v0, Li5/b;->h:Lv5/t;

    .line 334
    .line 335
    invoke-virtual {v11, v3}, Lv5/t;->m(I)V

    .line 336
    .line 337
    .line 338
    iget-object v11, v0, Li5/b;->h:Lv5/t;

    .line 339
    .line 340
    invoke-virtual {v11}, Lv5/t;->f()Z

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    iget-object v12, v0, Li5/b;->h:Lv5/t;

    .line 345
    .line 346
    invoke-virtual {v12}, Lv5/t;->f()Z

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    iget-object v13, v0, Li5/b;->h:Lv5/t;

    .line 351
    .line 352
    invoke-virtual {v13}, Lv5/t;->f()Z

    .line 353
    .line 354
    .line 355
    iget-object v13, v0, Li5/b;->h:Lv5/t;

    .line 356
    .line 357
    invoke-virtual {v13, v5}, Lv5/t;->g(I)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    iget-object v13, v0, Li5/b;->h:Lv5/t;

    .line 362
    .line 363
    invoke-virtual {v13}, Lv5/t;->f()Z

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    iget-object v14, v0, Li5/b;->h:Lv5/t;

    .line 368
    .line 369
    invoke-virtual {v14, v7}, Lv5/t;->g(I)I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    iget-object v14, v0, Li5/b;->h:Lv5/t;

    .line 374
    .line 375
    invoke-virtual {v14, v9}, Lv5/t;->g(I)I

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    iget-object v14, v0, Li5/b;->h:Lv5/t;

    .line 380
    .line 381
    invoke-virtual {v14, v1}, Lv5/t;->g(I)I

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    iget-object v15, v0, Li5/b;->h:Lv5/t;

    .line 386
    .line 387
    invoke-virtual {v15, v1}, Lv5/t;->g(I)I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    iget-object v15, v0, Li5/b;->h:Lv5/t;

    .line 392
    .line 393
    invoke-virtual {v15, v3}, Lv5/t;->m(I)V

    .line 394
    .line 395
    .line 396
    iget-object v15, v0, Li5/b;->h:Lv5/t;

    .line 397
    .line 398
    invoke-virtual {v15, v8}, Lv5/t;->g(I)I

    .line 399
    .line 400
    .line 401
    iget-object v8, v0, Li5/b;->h:Lv5/t;

    .line 402
    .line 403
    invoke-virtual {v8, v3}, Lv5/t;->m(I)V

    .line 404
    .line 405
    .line 406
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 407
    .line 408
    const/4 v8, 0x3

    .line 409
    invoke-virtual {v3, v8}, Lv5/t;->g(I)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    iget-object v15, v0, Li5/b;->h:Lv5/t;

    .line 414
    .line 415
    invoke-virtual {v15, v8}, Lv5/t;->g(I)I

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    const/4 v15, 0x1

    .line 420
    iput-boolean v15, v10, Li5/b$b;->c:Z

    .line 421
    .line 422
    iput-boolean v11, v10, Li5/b$b;->d:Z

    .line 423
    .line 424
    iput-boolean v12, v10, Li5/b$b;->k:Z

    .line 425
    .line 426
    iput v5, v10, Li5/b$b;->e:I

    .line 427
    .line 428
    iput-boolean v13, v10, Li5/b$b;->f:Z

    .line 429
    .line 430
    iput v7, v10, Li5/b$b;->g:I

    .line 431
    .line 432
    iput v9, v10, Li5/b$b;->h:I

    .line 433
    .line 434
    iput v14, v10, Li5/b$b;->i:I

    .line 435
    .line 436
    iget v5, v10, Li5/b$b;->j:I

    .line 437
    .line 438
    add-int/2addr v1, v15

    .line 439
    if-eq v5, v1, :cond_10

    .line 440
    .line 441
    iput v1, v10, Li5/b$b;->j:I

    .line 442
    .line 443
    :goto_4
    if-eqz v12, :cond_e

    .line 444
    .line 445
    iget-object v1, v10, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    iget v5, v10, Li5/b$b;->j:I

    .line 452
    .line 453
    if-ge v1, v5, :cond_f

    .line 454
    .line 455
    :cond_e
    iget-object v1, v10, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    const/16 v5, 0xf

    .line 462
    .line 463
    if-lt v1, v5, :cond_10

    .line 464
    .line 465
    :cond_f
    iget-object v1, v10, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 466
    .line 467
    const/4 v5, 0x0

    .line 468
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    goto :goto_4

    .line 472
    :cond_10
    if-eqz v3, :cond_11

    .line 473
    .line 474
    iget v1, v10, Li5/b$b;->m:I

    .line 475
    .line 476
    if-eq v1, v3, :cond_11

    .line 477
    .line 478
    iput v3, v10, Li5/b$b;->m:I

    .line 479
    .line 480
    add-int/lit8 v3, v3, -0x1

    .line 481
    .line 482
    sget-object v1, Li5/b$b;->C:[I

    .line 483
    .line 484
    aget v1, v1, v3

    .line 485
    .line 486
    sget-object v5, Li5/b$b;->B:[Z

    .line 487
    .line 488
    aget-boolean v5, v5, v3

    .line 489
    .line 490
    sget-object v5, Li5/b$b;->z:[I

    .line 491
    .line 492
    aget v5, v5, v3

    .line 493
    .line 494
    sget-object v5, Li5/b$b;->A:[I

    .line 495
    .line 496
    aget v5, v5, v3

    .line 497
    .line 498
    sget-object v5, Li5/b$b;->y:[I

    .line 499
    .line 500
    aget v3, v5, v3

    .line 501
    .line 502
    iput v1, v10, Li5/b$b;->o:I

    .line 503
    .line 504
    iput v3, v10, Li5/b$b;->l:I

    .line 505
    .line 506
    :cond_11
    if-eqz v8, :cond_12

    .line 507
    .line 508
    iget v1, v10, Li5/b$b;->n:I

    .line 509
    .line 510
    if-eq v1, v8, :cond_12

    .line 511
    .line 512
    iput v8, v10, Li5/b$b;->n:I

    .line 513
    .line 514
    add-int/lit8 v8, v8, -0x1

    .line 515
    .line 516
    sget-object v1, Li5/b$b;->E:[I

    .line 517
    .line 518
    aget v1, v1, v8

    .line 519
    .line 520
    sget-object v1, Li5/b$b;->D:[I

    .line 521
    .line 522
    aget v1, v1, v8

    .line 523
    .line 524
    const/4 v1, 0x0

    .line 525
    invoke-virtual {v10, v1, v1}, Li5/b$b;->e(ZZ)V

    .line 526
    .line 527
    .line 528
    sget v1, Li5/b$b;->w:I

    .line 529
    .line 530
    sget-object v3, Li5/b$b;->F:[I

    .line 531
    .line 532
    aget v3, v3, v8

    .line 533
    .line 534
    invoke-virtual {v10, v1, v3}, Li5/b$b;->f(II)V

    .line 535
    .line 536
    .line 537
    :cond_12
    iget v1, v0, Li5/b;->p:I

    .line 538
    .line 539
    if-eq v1, v2, :cond_17

    .line 540
    .line 541
    iput v2, v0, Li5/b;->p:I

    .line 542
    .line 543
    iget-object v1, v0, Li5/b;->k:[Li5/b$b;

    .line 544
    .line 545
    aget-object v1, v1, v2

    .line 546
    .line 547
    const/4 v2, 0x1

    .line 548
    const/4 v5, 0x3

    .line 549
    goto/16 :goto_e

    .line 550
    .line 551
    :pswitch_5
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 552
    .line 553
    iget-boolean v1, v1, Li5/b$b;->c:Z

    .line 554
    .line 555
    if-nez v1, :cond_13

    .line 556
    .line 557
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 558
    .line 559
    const/16 v12, 0x20

    .line 560
    .line 561
    goto/16 :goto_6

    .line 562
    .line 563
    :cond_13
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 564
    .line 565
    const/4 v2, 0x2

    .line 566
    invoke-virtual {v1, v2}, Lv5/t;->g(I)I

    .line 567
    .line 568
    .line 569
    move-result v1

    .line 570
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 571
    .line 572
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 577
    .line 578
    invoke-virtual {v5, v2}, Lv5/t;->g(I)I

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    iget-object v7, v0, Li5/b;->h:Lv5/t;

    .line 583
    .line 584
    invoke-virtual {v7, v2}, Lv5/t;->g(I)I

    .line 585
    .line 586
    .line 587
    move-result v7

    .line 588
    invoke-static {v3, v5, v7, v1}, Li5/b$b;->c(IIII)I

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 593
    .line 594
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 595
    .line 596
    .line 597
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 598
    .line 599
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 604
    .line 605
    invoke-virtual {v5, v2}, Lv5/t;->g(I)I

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    iget-object v7, v0, Li5/b;->h:Lv5/t;

    .line 610
    .line 611
    invoke-virtual {v7, v2}, Lv5/t;->g(I)I

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    const/4 v8, 0x0

    .line 616
    invoke-static {v3, v5, v7, v8}, Li5/b$b;->c(IIII)I

    .line 617
    .line 618
    .line 619
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 620
    .line 621
    invoke-virtual {v3}, Lv5/t;->f()Z

    .line 622
    .line 623
    .line 624
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 625
    .line 626
    invoke-virtual {v3}, Lv5/t;->f()Z

    .line 627
    .line 628
    .line 629
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 630
    .line 631
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 632
    .line 633
    .line 634
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 635
    .line 636
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 637
    .line 638
    .line 639
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 640
    .line 641
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 646
    .line 647
    invoke-virtual {v3, v9}, Lv5/t;->m(I)V

    .line 648
    .line 649
    .line 650
    iget-object v3, v0, Li5/b;->l:Li5/b$b;

    .line 651
    .line 652
    iput v1, v3, Li5/b$b;->o:I

    .line 653
    .line 654
    iput v2, v3, Li5/b$b;->l:I

    .line 655
    .line 656
    goto/16 :goto_7

    .line 657
    .line 658
    :pswitch_6
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 659
    .line 660
    iget-boolean v2, v2, Li5/b$b;->c:Z

    .line 661
    .line 662
    if-nez v2, :cond_14

    .line 663
    .line 664
    goto/16 :goto_5

    .line 665
    .line 666
    :cond_14
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 667
    .line 668
    invoke-virtual {v2, v1}, Lv5/t;->m(I)V

    .line 669
    .line 670
    .line 671
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 672
    .line 673
    invoke-virtual {v2, v1}, Lv5/t;->g(I)I

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 678
    .line 679
    const/4 v3, 0x2

    .line 680
    invoke-virtual {v2, v3}, Lv5/t;->m(I)V

    .line 681
    .line 682
    .line 683
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 684
    .line 685
    const/4 v3, 0x6

    .line 686
    invoke-virtual {v2, v3}, Lv5/t;->g(I)I

    .line 687
    .line 688
    .line 689
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 690
    .line 691
    iget v3, v2, Li5/b$b;->v:I

    .line 692
    .line 693
    if-eq v3, v1, :cond_15

    .line 694
    .line 695
    invoke-virtual {v2, v15}, Li5/b$b;->a(C)V

    .line 696
    .line 697
    .line 698
    :cond_15
    iput v1, v2, Li5/b$b;->v:I

    .line 699
    .line 700
    goto :goto_7

    .line 701
    :pswitch_7
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 702
    .line 703
    iget-boolean v1, v1, Li5/b$b;->c:Z

    .line 704
    .line 705
    if-nez v1, :cond_16

    .line 706
    .line 707
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 708
    .line 709
    goto :goto_6

    .line 710
    :cond_16
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 711
    .line 712
    const/4 v2, 0x2

    .line 713
    invoke-virtual {v1, v2}, Lv5/t;->g(I)I

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 718
    .line 719
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 724
    .line 725
    invoke-virtual {v5, v2}, Lv5/t;->g(I)I

    .line 726
    .line 727
    .line 728
    move-result v5

    .line 729
    iget-object v7, v0, Li5/b;->h:Lv5/t;

    .line 730
    .line 731
    invoke-virtual {v7, v2}, Lv5/t;->g(I)I

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    invoke-static {v3, v5, v7, v1}, Li5/b$b;->c(IIII)I

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 740
    .line 741
    invoke-virtual {v3, v2}, Lv5/t;->g(I)I

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 746
    .line 747
    invoke-virtual {v5, v2}, Lv5/t;->g(I)I

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    iget-object v7, v0, Li5/b;->h:Lv5/t;

    .line 752
    .line 753
    invoke-virtual {v7, v2}, Lv5/t;->g(I)I

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    iget-object v8, v0, Li5/b;->h:Lv5/t;

    .line 758
    .line 759
    invoke-virtual {v8, v2}, Lv5/t;->g(I)I

    .line 760
    .line 761
    .line 762
    move-result v8

    .line 763
    invoke-static {v5, v7, v8, v3}, Li5/b$b;->c(IIII)I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 768
    .line 769
    invoke-virtual {v5, v2}, Lv5/t;->m(I)V

    .line 770
    .line 771
    .line 772
    iget-object v5, v0, Li5/b;->h:Lv5/t;

    .line 773
    .line 774
    invoke-virtual {v5, v2}, Lv5/t;->g(I)I

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    iget-object v7, v0, Li5/b;->h:Lv5/t;

    .line 779
    .line 780
    invoke-virtual {v7, v2}, Lv5/t;->g(I)I

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    iget-object v8, v0, Li5/b;->h:Lv5/t;

    .line 785
    .line 786
    invoke-virtual {v8, v2}, Lv5/t;->g(I)I

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    const/4 v8, 0x0

    .line 791
    invoke-static {v5, v7, v2, v8}, Li5/b$b;->c(IIII)I

    .line 792
    .line 793
    .line 794
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 795
    .line 796
    invoke-virtual {v2, v1, v3}, Li5/b$b;->f(II)V

    .line 797
    .line 798
    .line 799
    goto :goto_7

    .line 800
    :pswitch_8
    iget-object v2, v0, Li5/b;->l:Li5/b$b;

    .line 801
    .line 802
    iget-boolean v2, v2, Li5/b$b;->c:Z

    .line 803
    .line 804
    if-nez v2, :cond_18

    .line 805
    .line 806
    :goto_5
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 807
    .line 808
    const/16 v12, 0x10

    .line 809
    .line 810
    :goto_6
    invoke-virtual {v1, v12}, Lv5/t;->m(I)V

    .line 811
    .line 812
    .line 813
    :cond_17
    :goto_7
    const/4 v1, 0x3

    .line 814
    move v5, v1

    .line 815
    goto/16 :goto_c

    .line 816
    .line 817
    :cond_18
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 818
    .line 819
    invoke-virtual {v2, v1}, Lv5/t;->g(I)I

    .line 820
    .line 821
    .line 822
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 823
    .line 824
    const/4 v2, 0x2

    .line 825
    invoke-virtual {v1, v2}, Lv5/t;->g(I)I

    .line 826
    .line 827
    .line 828
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 829
    .line 830
    invoke-virtual {v1, v2}, Lv5/t;->g(I)I

    .line 831
    .line 832
    .line 833
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 834
    .line 835
    invoke-virtual {v1}, Lv5/t;->f()Z

    .line 836
    .line 837
    .line 838
    move-result v1

    .line 839
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 840
    .line 841
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 846
    .line 847
    const/4 v5, 0x3

    .line 848
    invoke-virtual {v3, v5}, Lv5/t;->g(I)I

    .line 849
    .line 850
    .line 851
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 852
    .line 853
    invoke-virtual {v3, v5}, Lv5/t;->g(I)I

    .line 854
    .line 855
    .line 856
    iget-object v3, v0, Li5/b;->l:Li5/b$b;

    .line 857
    .line 858
    invoke-virtual {v3, v1, v2}, Li5/b$b;->e(ZZ)V

    .line 859
    .line 860
    .line 861
    goto/16 :goto_c

    .line 862
    .line 863
    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Li5/b;->k()V

    .line 864
    .line 865
    .line 866
    goto :goto_c

    .line 867
    :pswitch_a
    iget-object v1, v0, Li5/b;->h:Lv5/t;

    .line 868
    .line 869
    invoke-virtual {v1, v9}, Lv5/t;->m(I)V

    .line 870
    .line 871
    .line 872
    goto :goto_c

    .line 873
    :pswitch_b
    const/4 v1, 0x1

    .line 874
    :goto_8
    if-gt v1, v9, :cond_1d

    .line 875
    .line 876
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 877
    .line 878
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    if-eqz v2, :cond_19

    .line 883
    .line 884
    iget-object v2, v0, Li5/b;->k:[Li5/b$b;

    .line 885
    .line 886
    rsub-int/lit8 v3, v1, 0x8

    .line 887
    .line 888
    aget-object v2, v2, v3

    .line 889
    .line 890
    invoke-virtual {v2}, Li5/b$b;->d()V

    .line 891
    .line 892
    .line 893
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 894
    .line 895
    goto :goto_8

    .line 896
    :pswitch_c
    const/4 v1, 0x1

    .line 897
    :goto_9
    if-gt v1, v9, :cond_1d

    .line 898
    .line 899
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 900
    .line 901
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    if-eqz v2, :cond_1a

    .line 906
    .line 907
    iget-object v2, v0, Li5/b;->k:[Li5/b$b;

    .line 908
    .line 909
    rsub-int/lit8 v3, v1, 0x8

    .line 910
    .line 911
    aget-object v2, v2, v3

    .line 912
    .line 913
    iget-boolean v3, v2, Li5/b$b;->d:Z

    .line 914
    .line 915
    xor-int/lit8 v3, v3, 0x1

    .line 916
    .line 917
    iput-boolean v3, v2, Li5/b$b;->d:Z

    .line 918
    .line 919
    :cond_1a
    add-int/lit8 v1, v1, 0x1

    .line 920
    .line 921
    goto :goto_9

    .line 922
    :pswitch_d
    const/4 v1, 0x1

    .line 923
    :goto_a
    if-gt v1, v9, :cond_1d

    .line 924
    .line 925
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 926
    .line 927
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 928
    .line 929
    .line 930
    move-result v2

    .line 931
    if-eqz v2, :cond_1b

    .line 932
    .line 933
    iget-object v2, v0, Li5/b;->k:[Li5/b$b;

    .line 934
    .line 935
    rsub-int/lit8 v3, v1, 0x8

    .line 936
    .line 937
    aget-object v2, v2, v3

    .line 938
    .line 939
    const/4 v3, 0x0

    .line 940
    iput-boolean v3, v2, Li5/b$b;->d:Z

    .line 941
    .line 942
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 943
    .line 944
    goto :goto_a

    .line 945
    :pswitch_e
    const/4 v1, 0x1

    .line 946
    :goto_b
    if-gt v1, v9, :cond_1d

    .line 947
    .line 948
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 949
    .line 950
    invoke-virtual {v2}, Lv5/t;->f()Z

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    if-eqz v2, :cond_1c

    .line 955
    .line 956
    iget-object v2, v0, Li5/b;->k:[Li5/b$b;

    .line 957
    .line 958
    rsub-int/lit8 v3, v1, 0x8

    .line 959
    .line 960
    aget-object v2, v2, v3

    .line 961
    .line 962
    const/4 v3, 0x1

    .line 963
    iput-boolean v3, v2, Li5/b$b;->d:Z

    .line 964
    .line 965
    :cond_1c
    add-int/lit8 v1, v1, 0x1

    .line 966
    .line 967
    goto :goto_b

    .line 968
    :cond_1d
    :goto_c
    :pswitch_f
    const/4 v1, 0x1

    .line 969
    goto :goto_f

    .line 970
    :pswitch_10
    const/4 v1, 0x1

    .line 971
    move v2, v1

    .line 972
    :goto_d
    if-gt v2, v9, :cond_21

    .line 973
    .line 974
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 975
    .line 976
    invoke-virtual {v3}, Lv5/t;->f()Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-eqz v3, :cond_1e

    .line 981
    .line 982
    iget-object v3, v0, Li5/b;->k:[Li5/b$b;

    .line 983
    .line 984
    rsub-int/lit8 v7, v2, 0x8

    .line 985
    .line 986
    aget-object v3, v3, v7

    .line 987
    .line 988
    iget-object v7, v3, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 989
    .line 990
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 991
    .line 992
    .line 993
    iget-object v7, v3, Li5/b$b;->b:Landroid/text/SpannableStringBuilder;

    .line 994
    .line 995
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 996
    .line 997
    .line 998
    const/4 v7, -0x1

    .line 999
    iput v7, v3, Li5/b$b;->p:I

    .line 1000
    .line 1001
    iput v7, v3, Li5/b$b;->q:I

    .line 1002
    .line 1003
    iput v7, v3, Li5/b$b;->r:I

    .line 1004
    .line 1005
    iput v7, v3, Li5/b$b;->t:I

    .line 1006
    .line 1007
    const/4 v7, 0x0

    .line 1008
    iput v7, v3, Li5/b$b;->v:I

    .line 1009
    .line 1010
    :cond_1e
    add-int/lit8 v2, v2, 0x1

    .line 1011
    .line 1012
    goto :goto_d

    .line 1013
    :pswitch_11
    const/4 v1, 0x1

    .line 1014
    add-int/lit8 v2, v2, -0x80

    .line 1015
    .line 1016
    iget v3, v0, Li5/b;->p:I

    .line 1017
    .line 1018
    if-eq v3, v2, :cond_21

    .line 1019
    .line 1020
    iput v2, v0, Li5/b;->p:I

    .line 1021
    .line 1022
    iget-object v3, v0, Li5/b;->k:[Li5/b$b;

    .line 1023
    .line 1024
    aget-object v2, v3, v2

    .line 1025
    .line 1026
    move-object/from16 v16, v2

    .line 1027
    .line 1028
    move v2, v1

    .line 1029
    move-object/from16 v1, v16

    .line 1030
    .line 1031
    :goto_e
    iput-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1032
    .line 1033
    move v1, v2

    .line 1034
    goto :goto_f

    .line 1035
    :cond_1f
    const/16 v3, 0xff

    .line 1036
    .line 1037
    const/4 v7, 0x1

    .line 1038
    if-gt v2, v3, :cond_20

    .line 1039
    .line 1040
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1041
    .line 1042
    and-int/lit16 v2, v2, 0xff

    .line 1043
    .line 1044
    int-to-char v2, v2

    .line 1045
    invoke-virtual {v1, v2}, Li5/b$b;->a(C)V

    .line 1046
    .line 1047
    .line 1048
    move v1, v7

    .line 1049
    goto :goto_f

    .line 1050
    :cond_20
    const-string v3, "Invalid base command: "

    .line 1051
    .line 1052
    invoke-static {v3, v2, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    :cond_21
    :goto_f
    const/4 v2, 0x7

    .line 1056
    goto/16 :goto_15

    .line 1057
    .line 1058
    :cond_22
    const/4 v2, 0x1

    .line 1059
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 1060
    .line 1061
    invoke-virtual {v3, v9}, Lv5/t;->g(I)I

    .line 1062
    .line 1063
    .line 1064
    move-result v3

    .line 1065
    if-gt v3, v14, :cond_26

    .line 1066
    .line 1067
    const/4 v2, 0x7

    .line 1068
    if-gt v3, v2, :cond_23

    .line 1069
    .line 1070
    goto/16 :goto_15

    .line 1071
    .line 1072
    :cond_23
    const/16 v7, 0xf

    .line 1073
    .line 1074
    if-gt v3, v7, :cond_24

    .line 1075
    .line 1076
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 1077
    .line 1078
    goto :goto_10

    .line 1079
    :cond_24
    if-gt v3, v10, :cond_25

    .line 1080
    .line 1081
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 1082
    .line 1083
    const/16 v9, 0x10

    .line 1084
    .line 1085
    goto :goto_10

    .line 1086
    :cond_25
    if-gt v3, v14, :cond_35

    .line 1087
    .line 1088
    iget-object v3, v0, Li5/b;->h:Lv5/t;

    .line 1089
    .line 1090
    move v9, v12

    .line 1091
    :goto_10
    invoke-virtual {v3, v9}, Lv5/t;->m(I)V

    .line 1092
    .line 1093
    .line 1094
    goto/16 :goto_15

    .line 1095
    .line 1096
    :cond_26
    const/4 v7, 0x7

    .line 1097
    const/16 v8, 0xa0

    .line 1098
    .line 1099
    if-gt v3, v13, :cond_31

    .line 1100
    .line 1101
    const/16 v1, 0x20

    .line 1102
    .line 1103
    if-eq v3, v1, :cond_30

    .line 1104
    .line 1105
    const/16 v1, 0x21

    .line 1106
    .line 1107
    if-eq v3, v1, :cond_2f

    .line 1108
    .line 1109
    const/16 v1, 0x25

    .line 1110
    .line 1111
    if-eq v3, v1, :cond_2e

    .line 1112
    .line 1113
    const/16 v1, 0x2a

    .line 1114
    .line 1115
    if-eq v3, v1, :cond_2d

    .line 1116
    .line 1117
    const/16 v1, 0x2c

    .line 1118
    .line 1119
    if-eq v3, v1, :cond_2c

    .line 1120
    .line 1121
    const/16 v1, 0x3f

    .line 1122
    .line 1123
    if-eq v3, v1, :cond_2b

    .line 1124
    .line 1125
    const/16 v1, 0x39

    .line 1126
    .line 1127
    if-eq v3, v1, :cond_2a

    .line 1128
    .line 1129
    const/16 v1, 0x3a

    .line 1130
    .line 1131
    if-eq v3, v1, :cond_29

    .line 1132
    .line 1133
    const/16 v1, 0x3c

    .line 1134
    .line 1135
    if-eq v3, v1, :cond_28

    .line 1136
    .line 1137
    const/16 v1, 0x3d

    .line 1138
    .line 1139
    if-eq v3, v1, :cond_27

    .line 1140
    .line 1141
    packed-switch v3, :pswitch_data_2

    .line 1142
    .line 1143
    .line 1144
    packed-switch v3, :pswitch_data_3

    .line 1145
    .line 1146
    .line 1147
    const-string v1, "Invalid G2 character: "

    .line 1148
    .line 1149
    invoke-static {v1, v3, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    goto/16 :goto_12

    .line 1153
    .line 1154
    :pswitch_12
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1155
    .line 1156
    const/16 v8, 0x2022

    .line 1157
    .line 1158
    goto/16 :goto_11

    .line 1159
    .line 1160
    :pswitch_13
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1161
    .line 1162
    const/16 v8, 0x201d

    .line 1163
    .line 1164
    goto/16 :goto_11

    .line 1165
    .line 1166
    :pswitch_14
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1167
    .line 1168
    const/16 v8, 0x201c

    .line 1169
    .line 1170
    goto/16 :goto_11

    .line 1171
    .line 1172
    :pswitch_15
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1173
    .line 1174
    const/16 v8, 0x2019

    .line 1175
    .line 1176
    goto/16 :goto_11

    .line 1177
    .line 1178
    :pswitch_16
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1179
    .line 1180
    const/16 v8, 0x2018

    .line 1181
    .line 1182
    goto/16 :goto_11

    .line 1183
    .line 1184
    :pswitch_17
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1185
    .line 1186
    const/16 v8, 0x2588

    .line 1187
    .line 1188
    goto/16 :goto_11

    .line 1189
    .line 1190
    :pswitch_18
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1191
    .line 1192
    const/16 v8, 0x250c

    .line 1193
    .line 1194
    goto/16 :goto_11

    .line 1195
    .line 1196
    :pswitch_19
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1197
    .line 1198
    const/16 v8, 0x2518

    .line 1199
    .line 1200
    goto/16 :goto_11

    .line 1201
    .line 1202
    :pswitch_1a
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1203
    .line 1204
    const/16 v8, 0x2500

    .line 1205
    .line 1206
    goto :goto_11

    .line 1207
    :pswitch_1b
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1208
    .line 1209
    const/16 v8, 0x2514

    .line 1210
    .line 1211
    goto :goto_11

    .line 1212
    :pswitch_1c
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1213
    .line 1214
    const/16 v8, 0x2510

    .line 1215
    .line 1216
    goto :goto_11

    .line 1217
    :pswitch_1d
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1218
    .line 1219
    const/16 v8, 0x2502

    .line 1220
    .line 1221
    goto :goto_11

    .line 1222
    :pswitch_1e
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1223
    .line 1224
    const/16 v8, 0x215e

    .line 1225
    .line 1226
    goto :goto_11

    .line 1227
    :pswitch_1f
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1228
    .line 1229
    const/16 v8, 0x215d

    .line 1230
    .line 1231
    goto :goto_11

    .line 1232
    :pswitch_20
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1233
    .line 1234
    const/16 v8, 0x215c

    .line 1235
    .line 1236
    goto :goto_11

    .line 1237
    :pswitch_21
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1238
    .line 1239
    const/16 v8, 0x215b

    .line 1240
    .line 1241
    goto :goto_11

    .line 1242
    :cond_27
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1243
    .line 1244
    const/16 v8, 0x2120

    .line 1245
    .line 1246
    goto :goto_11

    .line 1247
    :cond_28
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1248
    .line 1249
    const/16 v8, 0x153

    .line 1250
    .line 1251
    goto :goto_11

    .line 1252
    :cond_29
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1253
    .line 1254
    const/16 v8, 0x161

    .line 1255
    .line 1256
    goto :goto_11

    .line 1257
    :cond_2a
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1258
    .line 1259
    const/16 v8, 0x2122

    .line 1260
    .line 1261
    goto :goto_11

    .line 1262
    :cond_2b
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1263
    .line 1264
    const/16 v8, 0x178

    .line 1265
    .line 1266
    goto :goto_11

    .line 1267
    :cond_2c
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1268
    .line 1269
    const/16 v8, 0x152

    .line 1270
    .line 1271
    goto :goto_11

    .line 1272
    :cond_2d
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1273
    .line 1274
    const/16 v8, 0x160

    .line 1275
    .line 1276
    goto :goto_11

    .line 1277
    :cond_2e
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1278
    .line 1279
    const/16 v8, 0x2026

    .line 1280
    .line 1281
    goto :goto_11

    .line 1282
    :cond_2f
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1283
    .line 1284
    goto :goto_11

    .line 1285
    :cond_30
    iget-object v3, v0, Li5/b;->l:Li5/b$b;

    .line 1286
    .line 1287
    move v8, v1

    .line 1288
    move-object v1, v3

    .line 1289
    :goto_11
    invoke-virtual {v1, v8}, Li5/b$b;->a(C)V

    .line 1290
    .line 1291
    .line 1292
    :goto_12
    move v1, v2

    .line 1293
    goto :goto_14

    .line 1294
    :cond_31
    const/16 v10, 0x20

    .line 1295
    .line 1296
    if-gt v3, v11, :cond_36

    .line 1297
    .line 1298
    const/16 v2, 0x87

    .line 1299
    .line 1300
    if-gt v3, v2, :cond_32

    .line 1301
    .line 1302
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 1303
    .line 1304
    goto :goto_13

    .line 1305
    :cond_32
    const/16 v2, 0x8f

    .line 1306
    .line 1307
    if-gt v3, v2, :cond_33

    .line 1308
    .line 1309
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 1310
    .line 1311
    const/16 v10, 0x28

    .line 1312
    .line 1313
    :goto_13
    invoke-virtual {v2, v10}, Lv5/t;->m(I)V

    .line 1314
    .line 1315
    .line 1316
    goto :goto_14

    .line 1317
    :cond_33
    if-gt v3, v11, :cond_34

    .line 1318
    .line 1319
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 1320
    .line 1321
    const/4 v3, 0x2

    .line 1322
    invoke-virtual {v2, v3}, Lv5/t;->m(I)V

    .line 1323
    .line 1324
    .line 1325
    iget-object v2, v0, Li5/b;->h:Lv5/t;

    .line 1326
    .line 1327
    const/4 v8, 0x6

    .line 1328
    invoke-virtual {v2, v8}, Lv5/t;->g(I)I

    .line 1329
    .line 1330
    .line 1331
    move-result v2

    .line 1332
    iget-object v10, v0, Li5/b;->h:Lv5/t;

    .line 1333
    .line 1334
    mul-int/2addr v2, v9

    .line 1335
    invoke-virtual {v10, v2}, Lv5/t;->m(I)V

    .line 1336
    .line 1337
    .line 1338
    goto/16 :goto_1

    .line 1339
    .line 1340
    :cond_34
    :goto_14
    move v2, v7

    .line 1341
    :cond_35
    :goto_15
    const/4 v3, 0x2

    .line 1342
    const/4 v7, 0x6

    .line 1343
    move v8, v7

    .line 1344
    move v7, v2

    .line 1345
    goto/16 :goto_1

    .line 1346
    .line 1347
    :cond_36
    const/4 v9, 0x2

    .line 1348
    const/16 v10, 0xff

    .line 1349
    .line 1350
    const/4 v11, 0x6

    .line 1351
    if-gt v3, v10, :cond_38

    .line 1352
    .line 1353
    if-ne v3, v8, :cond_37

    .line 1354
    .line 1355
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1356
    .line 1357
    const/16 v3, 0x33c4

    .line 1358
    .line 1359
    goto :goto_16

    .line 1360
    :cond_37
    const-string v1, "Invalid G3 character: "

    .line 1361
    .line 1362
    invoke-static {v1, v3, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v1, v0, Li5/b;->l:Li5/b$b;

    .line 1366
    .line 1367
    const/16 v3, 0x5f

    .line 1368
    .line 1369
    :goto_16
    invoke-virtual {v1, v3}, Li5/b$b;->a(C)V

    .line 1370
    .line 1371
    .line 1372
    move v1, v2

    .line 1373
    goto :goto_17

    .line 1374
    :cond_38
    const-string v2, "Invalid extended command: "

    .line 1375
    .line 1376
    invoke-static {v2, v3, v4}, Lf;->p(Ljava/lang/String;ILjava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    :goto_17
    move v3, v9

    .line 1380
    move v8, v11

    .line 1381
    goto/16 :goto_1

    .line 1382
    .line 1383
    :cond_39
    :goto_18
    if-eqz v1, :cond_3a

    .line 1384
    .line 1385
    invoke-virtual/range {p0 .. p0}, Li5/b;->j()Ljava/util/List;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    iput-object v1, v0, Li5/b;->m:Ljava/util/List;

    .line 1390
    .line 1391
    :cond_3a
    const/4 v1, 0x0

    .line 1392
    iput-object v1, v0, Li5/b;->o:Li5/b$c;

    .line 1393
    .line 1394
    return-void

    .line 1395
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_f
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    :pswitch_data_3
    .packed-switch 0x76
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
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
.end method

.method public final j()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    const/16 v4, 0x8

    .line 11
    .line 12
    if-ge v3, v4, :cond_11

    .line 13
    .line 14
    iget-object v4, v0, Li5/b;->k:[Li5/b$b;

    .line 15
    .line 16
    aget-object v4, v4, v3

    .line 17
    .line 18
    iget-boolean v5, v4, Li5/b$b;->c:Z

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    iget-object v5, v4, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    iget-object v4, v4, Li5/b$b;->b:Landroid/text/SpannableStringBuilder;

    .line 32
    .line 33
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v4, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    move v4, v6

    .line 43
    :goto_2
    if-nez v4, :cond_10

    .line 44
    .line 45
    iget-object v4, v0, Li5/b;->k:[Li5/b$b;

    .line 46
    .line 47
    aget-object v4, v4, v3

    .line 48
    .line 49
    iget-boolean v5, v4, Li5/b$b;->d:Z

    .line 50
    .line 51
    if-eqz v5, :cond_10

    .line 52
    .line 53
    iget-boolean v5, v4, Li5/b$b;->c:Z

    .line 54
    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    iget-object v5, v4, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    iget-object v5, v4, Li5/b$b;->b:Landroid/text/SpannableStringBuilder;

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    move v5, v2

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    :goto_3
    move v5, v6

    .line 77
    :goto_4
    if-eqz v5, :cond_4

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    goto/16 :goto_c

    .line 81
    .line 82
    :cond_4
    new-instance v7, Landroid/text/SpannableStringBuilder;

    .line 83
    .line 84
    invoke-direct {v7}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    move v5, v2

    .line 88
    :goto_5
    iget-object v8, v4, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-ge v5, v8, :cond_5

    .line 95
    .line 96
    iget-object v8, v4, Li5/b$b;->a:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, Ljava/lang/CharSequence;

    .line 103
    .line 104
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 105
    .line 106
    .line 107
    const/16 v8, 0xa

    .line 108
    .line 109
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 110
    .line 111
    .line 112
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    invoke-virtual {v4}, Li5/b$b;->b()Landroid/text/SpannableString;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v7, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 120
    .line 121
    .line 122
    iget v5, v4, Li5/b$b;->l:I

    .line 123
    .line 124
    const/4 v8, 0x2

    .line 125
    if-eqz v5, :cond_9

    .line 126
    .line 127
    if-eq v5, v6, :cond_8

    .line 128
    .line 129
    if-eq v5, v8, :cond_7

    .line 130
    .line 131
    const/4 v9, 0x3

    .line 132
    if-ne v5, v9, :cond_6

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    const-string v2, "Unexpected justification value: "

    .line 138
    .line 139
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget v3, v4, Li5/b$b;->l:I

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v1

    .line 156
    :cond_7
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_8
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_9
    :goto_6
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 163
    .line 164
    :goto_7
    move-object v9, v5

    .line 165
    iget-boolean v5, v4, Li5/b$b;->f:Z

    .line 166
    .line 167
    if-eqz v5, :cond_a

    .line 168
    .line 169
    iget v5, v4, Li5/b$b;->h:I

    .line 170
    .line 171
    int-to-float v5, v5

    .line 172
    const/high16 v10, 0x42c60000    # 99.0f

    .line 173
    .line 174
    div-float/2addr v5, v10

    .line 175
    iget v11, v4, Li5/b$b;->g:I

    .line 176
    .line 177
    int-to-float v11, v11

    .line 178
    div-float/2addr v11, v10

    .line 179
    goto :goto_8

    .line 180
    :cond_a
    iget v5, v4, Li5/b$b;->h:I

    .line 181
    .line 182
    int-to-float v5, v5

    .line 183
    const/high16 v10, 0x43510000    # 209.0f

    .line 184
    .line 185
    div-float/2addr v5, v10

    .line 186
    iget v10, v4, Li5/b$b;->g:I

    .line 187
    .line 188
    int-to-float v10, v10

    .line 189
    const/high16 v11, 0x42940000    # 74.0f

    .line 190
    .line 191
    div-float v11, v10, v11

    .line 192
    .line 193
    :goto_8
    const v10, 0x3f666666    # 0.9f

    .line 194
    .line 195
    .line 196
    mul-float/2addr v5, v10

    .line 197
    const v12, 0x3d4ccccd    # 0.05f

    .line 198
    .line 199
    .line 200
    add-float v13, v5, v12

    .line 201
    .line 202
    mul-float/2addr v11, v10

    .line 203
    add-float v10, v11, v12

    .line 204
    .line 205
    iget v5, v4, Li5/b$b;->i:I

    .line 206
    .line 207
    div-int/lit8 v11, v5, 0x3

    .line 208
    .line 209
    if-nez v11, :cond_b

    .line 210
    .line 211
    move v11, v2

    .line 212
    goto :goto_9

    .line 213
    :cond_b
    if-ne v11, v6, :cond_c

    .line 214
    .line 215
    move v11, v6

    .line 216
    goto :goto_9

    .line 217
    :cond_c
    move v11, v8

    .line 218
    :goto_9
    rem-int/lit8 v5, v5, 0x3

    .line 219
    .line 220
    if-nez v5, :cond_d

    .line 221
    .line 222
    move v12, v2

    .line 223
    goto :goto_a

    .line 224
    :cond_d
    if-ne v5, v6, :cond_e

    .line 225
    .line 226
    move v12, v6

    .line 227
    goto :goto_a

    .line 228
    :cond_e
    move v12, v8

    .line 229
    :goto_a
    iget v14, v4, Li5/b$b;->o:I

    .line 230
    .line 231
    sget v5, Li5/b$b;->x:I

    .line 232
    .line 233
    if-eq v14, v5, :cond_f

    .line 234
    .line 235
    move v15, v6

    .line 236
    goto :goto_b

    .line 237
    :cond_f
    move v15, v2

    .line 238
    :goto_b
    new-instance v16, Li5/b$a;

    .line 239
    .line 240
    iget v4, v4, Li5/b$b;->e:I

    .line 241
    .line 242
    move-object/from16 v5, v16

    .line 243
    .line 244
    move-object v6, v7

    .line 245
    move-object v7, v9

    .line 246
    move v8, v10

    .line 247
    move v9, v11

    .line 248
    move v10, v13

    .line 249
    move v11, v12

    .line 250
    move v12, v15

    .line 251
    move v13, v14

    .line 252
    move v14, v4

    .line 253
    invoke-direct/range {v5 .. v14}, Li5/b$a;-><init>(Landroid/text/SpannableStringBuilder;Landroid/text/Layout$Alignment;FIFIZII)V

    .line 254
    .line 255
    .line 256
    move-object/from16 v4, v16

    .line 257
    .line 258
    :goto_c
    if-eqz v4, :cond_10

    .line 259
    .line 260
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_11
    sget-object v3, Li5/b$a;->c:Lb0/d;

    .line 268
    .line 269
    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 270
    .line 271
    .line 272
    new-instance v3, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    .line 280
    .line 281
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-ge v2, v4, :cond_12

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    check-cast v4, Li5/b$a;

    .line 292
    .line 293
    iget-object v4, v4, Li5/b$a;->a:Lh5/a;

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    add-int/lit8 v2, v2, 0x1

    .line 299
    .line 300
    goto :goto_d

    .line 301
    :cond_12
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    return-object v1
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
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
.end method

.method public final k()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Li5/b;->k:[Li5/b$b;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Li5/b$b;->d()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
