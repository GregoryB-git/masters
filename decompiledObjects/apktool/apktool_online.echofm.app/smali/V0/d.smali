.class public final LV0/d;
.super LV0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV0/d$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV0/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:I

.field public final o:J

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:J

.field public final u:J

.field public final v:Ljava/util/List;

.field public final w:Z

.field public final x:J

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV0/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LV0/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(JZZZZJJLjava/util/List;ZJIII)V
    .locals 3

    .line 1
    move-object v0, p0

    invoke-direct {p0}, LV0/b;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, LV0/d;->o:J

    move v1, p3

    iput-boolean v1, v0, LV0/d;->p:Z

    move v1, p4

    iput-boolean v1, v0, LV0/d;->q:Z

    move v1, p5

    iput-boolean v1, v0, LV0/d;->r:Z

    move v1, p6

    iput-boolean v1, v0, LV0/d;->s:Z

    move-wide v1, p7

    iput-wide v1, v0, LV0/d;->t:J

    move-wide v1, p9

    iput-wide v1, v0, LV0/d;->u:J

    invoke-static {p11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, LV0/d;->v:Ljava/util/List;

    move v1, p12

    iput-boolean v1, v0, LV0/d;->w:Z

    move-wide/from16 v1, p13

    iput-wide v1, v0, LV0/d;->x:J

    move/from16 v1, p15

    iput v1, v0, LV0/d;->y:I

    move/from16 v1, p16

    iput v1, v0, LV0/d;->z:I

    move/from16 v1, p17

    iput v1, v0, LV0/d;->A:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .line 2
    invoke-direct {p0}, LV0/b;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, LV0/d;->o:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LV0/d;->p:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, LV0/d;->q:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, LV0/d;->r:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, LV0/d;->s:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, LV0/d;->t:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, LV0/d;->u:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v1

    :goto_4
    if-ge v4, v0, :cond_4

    invoke-static {p1}, LV0/d$b;->a(Landroid/os/Parcel;)LV0/d$b;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LV0/d;->v:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_5

    move v1, v2

    :cond_5
    iput-boolean v1, p0, LV0/d;->w:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, LV0/d;->x:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LV0/d;->y:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LV0/d;->z:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, LV0/d;->A:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;LV0/d$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LV0/d;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static a(Lg0/z;JLg0/E;)LV0/d;
    .locals 27

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    and-int/lit16 v1, v1, 0x80

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v6, 0x0

    .line 18
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v6, :cond_b

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    and-int/lit16 v10, v9, 0x80

    .line 29
    .line 30
    if-eqz v10, :cond_1

    .line 31
    .line 32
    const/4 v10, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v10, 0x0

    .line 35
    :goto_1
    and-int/lit8 v11, v9, 0x40

    .line 36
    .line 37
    if-eqz v11, :cond_2

    .line 38
    .line 39
    const/4 v11, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/4 v11, 0x0

    .line 42
    :goto_2
    and-int/lit8 v12, v9, 0x20

    .line 43
    .line 44
    if-eqz v12, :cond_3

    .line 45
    .line 46
    const/4 v12, 0x1

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    const/4 v12, 0x0

    .line 49
    :goto_3
    and-int/lit8 v9, v9, 0x10

    .line 50
    .line 51
    if-eqz v9, :cond_4

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    const/4 v9, 0x0

    .line 56
    :goto_4
    if-eqz v11, :cond_5

    .line 57
    .line 58
    if-nez v9, :cond_5

    .line 59
    .line 60
    invoke-static/range {p0 .. p2}, LV0/g;->b(Lg0/z;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v13

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    :goto_5
    if-nez v11, :cond_8

    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    new-instance v15, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    :goto_6
    if-ge v4, v1, :cond_7

    .line 83
    .line 84
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 85
    .line 86
    .line 87
    move-result v18

    .line 88
    if-nez v9, :cond_6

    .line 89
    .line 90
    invoke-static/range {p0 .. p2}, LV0/g;->b(Lg0/z;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v19

    .line 94
    move-wide/from16 v7, v19

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_6
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    :goto_7
    new-instance v5, LV0/d$b;

    .line 103
    .line 104
    invoke-virtual {v0, v7, v8}, Lg0/E;->b(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v21

    .line 108
    const/16 v23, 0x0

    .line 109
    .line 110
    move-object/from16 v17, v5

    .line 111
    .line 112
    move-wide/from16 v19, v7

    .line 113
    .line 114
    invoke-direct/range {v17 .. v23}, LV0/d$b;-><init>(IJJLV0/d$a;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    move-object v1, v15

    .line 124
    :cond_8
    if-eqz v12, :cond_a

    .line 125
    .line 126
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    int-to-long v4, v4

    .line 131
    const-wide/16 v7, 0x80

    .line 132
    .line 133
    and-long/2addr v7, v4

    .line 134
    const-wide/16 v17, 0x0

    .line 135
    .line 136
    cmp-long v7, v7, v17

    .line 137
    .line 138
    if-eqz v7, :cond_9

    .line 139
    .line 140
    const/16 v16, 0x1

    .line 141
    .line 142
    goto :goto_8

    .line 143
    :cond_9
    const/16 v16, 0x0

    .line 144
    .line 145
    :goto_8
    const-wide/16 v7, 0x1

    .line 146
    .line 147
    and-long/2addr v4, v7

    .line 148
    const/16 v7, 0x20

    .line 149
    .line 150
    shl-long/2addr v4, v7

    .line 151
    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    .line 152
    .line 153
    .line 154
    move-result-wide v7

    .line 155
    or-long/2addr v4, v7

    .line 156
    const-wide/16 v7, 0x3e8

    .line 157
    .line 158
    mul-long/2addr v4, v7

    .line 159
    const-wide/16 v7, 0x5a

    .line 160
    .line 161
    div-long v7, v4, v7

    .line 162
    .line 163
    move/from16 v5, v16

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_a
    const/4 v5, 0x0

    .line 167
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    move/from16 v16, v4

    .line 185
    .line 186
    move/from16 v24, v11

    .line 187
    .line 188
    move/from16 v17, v12

    .line 189
    .line 190
    move/from16 v18, v15

    .line 191
    .line 192
    move-object v12, v1

    .line 193
    move-wide/from16 v25, v13

    .line 194
    .line 195
    move v13, v5

    .line 196
    move-wide v14, v7

    .line 197
    move v7, v9

    .line 198
    move v5, v10

    .line 199
    move-wide/from16 v8, v25

    .line 200
    .line 201
    goto :goto_a

    .line 202
    :cond_b
    move-object v12, v1

    .line 203
    const/4 v5, 0x0

    .line 204
    const/4 v7, 0x0

    .line 205
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const/16 v24, 0x0

    .line 223
    .line 224
    :goto_a
    new-instance v19, LV0/d;

    .line 225
    .line 226
    move-object/from16 v1, v19

    .line 227
    .line 228
    invoke-virtual {v0, v8, v9}, Lg0/E;->b(J)J

    .line 229
    .line 230
    .line 231
    move-result-wide v10

    .line 232
    move v4, v6

    .line 233
    move/from16 v6, v24

    .line 234
    .line 235
    invoke-direct/range {v1 .. v18}, LV0/d;-><init>(JZZZZJJLjava/util/List;ZJIII)V

    .line 236
    .line 237
    .line 238
    return-object v19
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SCTE-35 SpliceInsertCommand { programSplicePts="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, LV0/d;->t:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", programSplicePlaybackPositionUs= "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, LV0/d;->u:J

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " }"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, LV0/d;->o:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, LV0/d;->p:Z

    .line 7
    .line 8
    int-to-byte p2, p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 10
    .line 11
    .line 12
    iget-boolean p2, p0, LV0/d;->q:Z

    .line 13
    .line 14
    int-to-byte p2, p2

    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 16
    .line 17
    .line 18
    iget-boolean p2, p0, LV0/d;->r:Z

    .line 19
    .line 20
    int-to-byte p2, p2

    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 22
    .line 23
    .line 24
    iget-boolean p2, p0, LV0/d;->s:Z

    .line 25
    .line 26
    int-to-byte p2, p2

    .line 27
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, LV0/d;->t:J

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 33
    .line 34
    .line 35
    iget-wide v0, p0, LV0/d;->u:J

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, LV0/d;->v:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    :goto_0
    if-ge v0, p2, :cond_0

    .line 51
    .line 52
    iget-object v1, p0, LV0/d;->v:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, LV0/d$b;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, LV0/d$b;->b(Landroid/os/Parcel;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-boolean p2, p0, LV0/d;->w:Z

    .line 67
    .line 68
    int-to-byte p2, p2

    .line 69
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 70
    .line 71
    .line 72
    iget-wide v0, p0, LV0/d;->x:J

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 75
    .line 76
    .line 77
    iget p2, p0, LV0/d;->y:I

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    iget p2, p0, LV0/d;->z:I

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    iget p2, p0, LV0/d;->A:I

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
