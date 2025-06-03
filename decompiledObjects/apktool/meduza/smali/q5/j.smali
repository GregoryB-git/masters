.class public final Lq5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/g;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:[J

.field public final c:[J


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lq5/j;->a:Ljava/util/List;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Lq5/j;->b:[J

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq5/e;

    mul-int/lit8 v2, v0, 0x2

    iget-object v3, p0, Lq5/j;->b:[J

    iget-wide v4, v1, Lq5/e;->b:J

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    iget-wide v4, v1, Lq5/e;->c:J

    aput-wide v4, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lq5/j;->b:[J

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lq5/j;->c:[J

    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    return-void
.end method


# virtual methods
.method public final f(J)I
    .locals 2

    iget-object v0, p0, Lq5/j;->c:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lv5/e0;->b([JJZ)I

    move-result p1

    iget-object p2, p0, Lq5/j;->c:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final g(I)J
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Lx6/b;->q(Z)V

    iget-object v2, p0, Lq5/j;->c:[J

    array-length v2, v2

    if-ge p1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Lx6/b;->q(Z)V

    iget-object v0, p0, Lq5/j;->c:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final h(J)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
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
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget-object v5, v0, Lq5/j;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ge v4, v5, :cond_2

    .line 22
    .line 23
    iget-object v5, v0, Lq5/j;->b:[J

    .line 24
    .line 25
    mul-int/lit8 v6, v4, 0x2

    .line 26
    .line 27
    aget-wide v7, v5, v6

    .line 28
    .line 29
    cmp-long v7, v7, p1

    .line 30
    .line 31
    if-gtz v7, :cond_1

    .line 32
    .line 33
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    aget-wide v6, v5, v6

    .line 36
    .line 37
    cmp-long v5, p1, v6

    .line 38
    .line 39
    if-gez v5, :cond_1

    .line 40
    .line 41
    iget-object v5, v0, Lq5/j;->a:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lq5/e;

    .line 48
    .line 49
    iget-object v6, v5, Lq5/e;->a:Lh5/a;

    .line 50
    .line 51
    iget v7, v6, Lh5/a;->e:F

    .line 52
    .line 53
    const v8, -0x800001

    .line 54
    .line 55
    .line 56
    cmpl-float v7, v7, v8

    .line 57
    .line 58
    if-nez v7, :cond_0

    .line 59
    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance v4, Lq5/i;

    .line 71
    .line 72
    invoke-direct {v4, v3}, Lq5/i;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-ge v3, v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lq5/e;

    .line 89
    .line 90
    iget-object v4, v4, Lq5/e;->a:Lh5/a;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v6, v4, Lh5/a;->a:Ljava/lang/CharSequence;

    .line 96
    .line 97
    iget-object v9, v4, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 98
    .line 99
    iget-object v7, v4, Lh5/a;->b:Landroid/text/Layout$Alignment;

    .line 100
    .line 101
    iget-object v8, v4, Lh5/a;->c:Landroid/text/Layout$Alignment;

    .line 102
    .line 103
    iget v12, v4, Lh5/a;->o:I

    .line 104
    .line 105
    iget v13, v4, Lh5/a;->p:F

    .line 106
    .line 107
    iget v14, v4, Lh5/a;->q:I

    .line 108
    .line 109
    iget v15, v4, Lh5/a;->v:I

    .line 110
    .line 111
    iget v11, v4, Lh5/a;->w:F

    .line 112
    .line 113
    iget v10, v4, Lh5/a;->r:F

    .line 114
    .line 115
    iget v5, v4, Lh5/a;->s:F

    .line 116
    .line 117
    move/from16 v16, v11

    .line 118
    .line 119
    iget-boolean v11, v4, Lh5/a;->t:Z

    .line 120
    .line 121
    move/from16 v17, v11

    .line 122
    .line 123
    iget v11, v4, Lh5/a;->u:I

    .line 124
    .line 125
    move/from16 v18, v11

    .line 126
    .line 127
    iget v11, v4, Lh5/a;->x:I

    .line 128
    .line 129
    iget v4, v4, Lh5/a;->y:F

    .line 130
    .line 131
    rsub-int/lit8 v0, v3, -0x1

    .line 132
    .line 133
    int-to-float v0, v0

    .line 134
    const/16 v19, 0x1

    .line 135
    .line 136
    move/from16 v20, v11

    .line 137
    .line 138
    new-instance v11, Lh5/a;

    .line 139
    .line 140
    move/from16 v21, v5

    .line 141
    .line 142
    move-object v5, v11

    .line 143
    move/from16 v22, v10

    .line 144
    .line 145
    move v10, v0

    .line 146
    move-object v0, v11

    .line 147
    move/from16 v23, v18

    .line 148
    .line 149
    move/from16 v24, v20

    .line 150
    .line 151
    move/from16 v20, v17

    .line 152
    .line 153
    move/from16 v11, v19

    .line 154
    .line 155
    move/from16 v17, v22

    .line 156
    .line 157
    move/from16 v18, v21

    .line 158
    .line 159
    move/from16 v19, v20

    .line 160
    .line 161
    move/from16 v20, v23

    .line 162
    .line 163
    move/from16 v21, v24

    .line 164
    .line 165
    move/from16 v22, v4

    .line 166
    .line 167
    invoke-direct/range {v5 .. v22}, Lh5/a;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    move-object/from16 v0, p0

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    return-object v1
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

.method public final i()I
    .locals 1

    iget-object v0, p0, Lq5/j;->c:[J

    array-length v0, v0

    return v0
.end method
