.class public abstract Lh/b$c;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Landroid/graphics/ColorFilter;

.field public E:Z

.field public F:Landroid/content/res/ColorStateList;

.field public G:Landroid/graphics/PorterDuff$Mode;

.field public H:Z

.field public I:Z

.field public final a:Lh/b;

.field public b:Landroid/content/res/Resources;

.field public c:I

.field public d:I

.field public e:I

.field public f:Landroid/util/SparseArray;

.field public g:[Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/graphics/Rect;

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Lh/b$c;Lh/b;Landroid/content/res/Resources;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa0

    .line 5
    .line 6
    iput v0, p0, Lh/b$c;->c:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lh/b$c;->i:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lh/b$c;->l:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lh/b$c;->x:Z

    .line 15
    .line 16
    iput v0, p0, Lh/b$c;->A:I

    .line 17
    .line 18
    iput v0, p0, Lh/b$c;->B:I

    .line 19
    .line 20
    iput-object p2, p0, Lh/b$c;->a:Lh/b;

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    move-object p2, p3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p2, 0x0

    .line 32
    :goto_0
    iput-object p2, p0, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget p2, p1, Lh/b$c;->c:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move p2, v0

    .line 40
    :goto_1
    invoke-static {p3, p2}, Lh/b;->f(Landroid/content/res/Resources;I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lh/b$c;->c:I

    .line 45
    .line 46
    if-eqz p1, :cond_a

    .line 47
    .line 48
    iget p3, p1, Lh/b$c;->d:I

    .line 49
    .line 50
    iput p3, p0, Lh/b$c;->d:I

    .line 51
    .line 52
    iget p3, p1, Lh/b$c;->e:I

    .line 53
    .line 54
    iput p3, p0, Lh/b$c;->e:I

    .line 55
    .line 56
    iput-boolean v1, p0, Lh/b$c;->v:Z

    .line 57
    .line 58
    iput-boolean v1, p0, Lh/b$c;->w:Z

    .line 59
    .line 60
    iget-boolean p3, p1, Lh/b$c;->i:Z

    .line 61
    .line 62
    iput-boolean p3, p0, Lh/b$c;->i:Z

    .line 63
    .line 64
    iget-boolean p3, p1, Lh/b$c;->l:Z

    .line 65
    .line 66
    iput-boolean p3, p0, Lh/b$c;->l:Z

    .line 67
    .line 68
    iget-boolean p3, p1, Lh/b$c;->x:Z

    .line 69
    .line 70
    iput-boolean p3, p0, Lh/b$c;->x:Z

    .line 71
    .line 72
    iget-boolean p3, p1, Lh/b$c;->y:Z

    .line 73
    .line 74
    iput-boolean p3, p0, Lh/b$c;->y:Z

    .line 75
    .line 76
    iget p3, p1, Lh/b$c;->z:I

    .line 77
    .line 78
    iput p3, p0, Lh/b$c;->z:I

    .line 79
    .line 80
    iget p3, p1, Lh/b$c;->A:I

    .line 81
    .line 82
    iput p3, p0, Lh/b$c;->A:I

    .line 83
    .line 84
    iget p3, p1, Lh/b$c;->B:I

    .line 85
    .line 86
    iput p3, p0, Lh/b$c;->B:I

    .line 87
    .line 88
    iget-boolean p3, p1, Lh/b$c;->C:Z

    .line 89
    .line 90
    iput-boolean p3, p0, Lh/b$c;->C:Z

    .line 91
    .line 92
    iget-object p3, p1, Lh/b$c;->D:Landroid/graphics/ColorFilter;

    .line 93
    .line 94
    iput-object p3, p0, Lh/b$c;->D:Landroid/graphics/ColorFilter;

    .line 95
    .line 96
    iget-boolean p3, p1, Lh/b$c;->E:Z

    .line 97
    .line 98
    iput-boolean p3, p0, Lh/b$c;->E:Z

    .line 99
    .line 100
    iget-object p3, p1, Lh/b$c;->F:Landroid/content/res/ColorStateList;

    .line 101
    .line 102
    iput-object p3, p0, Lh/b$c;->F:Landroid/content/res/ColorStateList;

    .line 103
    .line 104
    iget-object p3, p1, Lh/b$c;->G:Landroid/graphics/PorterDuff$Mode;

    .line 105
    .line 106
    iput-object p3, p0, Lh/b$c;->G:Landroid/graphics/PorterDuff$Mode;

    .line 107
    .line 108
    iget-boolean p3, p1, Lh/b$c;->H:Z

    .line 109
    .line 110
    iput-boolean p3, p0, Lh/b$c;->H:Z

    .line 111
    .line 112
    iget-boolean p3, p1, Lh/b$c;->I:Z

    .line 113
    .line 114
    iput-boolean p3, p0, Lh/b$c;->I:Z

    .line 115
    .line 116
    iget p3, p1, Lh/b$c;->c:I

    .line 117
    .line 118
    if-ne p3, p2, :cond_4

    .line 119
    .line 120
    iget-boolean p2, p1, Lh/b$c;->j:Z

    .line 121
    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    new-instance p2, Landroid/graphics/Rect;

    .line 125
    .line 126
    iget-object p3, p1, Lh/b$c;->k:Landroid/graphics/Rect;

    .line 127
    .line 128
    invoke-direct {p2, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 129
    .line 130
    .line 131
    iput-object p2, p0, Lh/b$c;->k:Landroid/graphics/Rect;

    .line 132
    .line 133
    iput-boolean v1, p0, Lh/b$c;->j:Z

    .line 134
    .line 135
    :cond_3
    iget-boolean p2, p1, Lh/b$c;->m:Z

    .line 136
    .line 137
    if-eqz p2, :cond_4

    .line 138
    .line 139
    iget p2, p1, Lh/b$c;->n:I

    .line 140
    .line 141
    iput p2, p0, Lh/b$c;->n:I

    .line 142
    .line 143
    iget p2, p1, Lh/b$c;->o:I

    .line 144
    .line 145
    iput p2, p0, Lh/b$c;->o:I

    .line 146
    .line 147
    iget p2, p1, Lh/b$c;->p:I

    .line 148
    .line 149
    iput p2, p0, Lh/b$c;->p:I

    .line 150
    .line 151
    iget p2, p1, Lh/b$c;->q:I

    .line 152
    .line 153
    iput p2, p0, Lh/b$c;->q:I

    .line 154
    .line 155
    iput-boolean v1, p0, Lh/b$c;->m:Z

    .line 156
    .line 157
    :cond_4
    iget-boolean p2, p1, Lh/b$c;->r:Z

    .line 158
    .line 159
    if-eqz p2, :cond_5

    .line 160
    .line 161
    iget p2, p1, Lh/b$c;->s:I

    .line 162
    .line 163
    iput p2, p0, Lh/b$c;->s:I

    .line 164
    .line 165
    iput-boolean v1, p0, Lh/b$c;->r:Z

    .line 166
    .line 167
    :cond_5
    iget-boolean p2, p1, Lh/b$c;->t:Z

    .line 168
    .line 169
    if-eqz p2, :cond_6

    .line 170
    .line 171
    iget-boolean p2, p1, Lh/b$c;->u:Z

    .line 172
    .line 173
    iput-boolean p2, p0, Lh/b$c;->u:Z

    .line 174
    .line 175
    iput-boolean v1, p0, Lh/b$c;->t:Z

    .line 176
    .line 177
    :cond_6
    iget-object p2, p1, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    array-length p3, p2

    .line 180
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    .line 181
    .line 182
    iput-object p3, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 183
    .line 184
    iget p3, p1, Lh/b$c;->h:I

    .line 185
    .line 186
    iput p3, p0, Lh/b$c;->h:I

    .line 187
    .line 188
    iget-object p1, p1, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 189
    .line 190
    if-eqz p1, :cond_7

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :goto_2
    iput-object p1, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    new-instance p1, Landroid/util/SparseArray;

    .line 200
    .line 201
    iget p3, p0, Lh/b$c;->h:I

    .line 202
    .line 203
    invoke-direct {p1, p3}, Landroid/util/SparseArray;-><init>(I)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :goto_3
    iget p1, p0, Lh/b$c;->h:I

    .line 208
    .line 209
    :goto_4
    if-ge v0, p1, :cond_b

    .line 210
    .line 211
    aget-object p3, p2, v0

    .line 212
    .line 213
    if-eqz p3, :cond_9

    .line 214
    .line 215
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    if-eqz p3, :cond_8

    .line 220
    .line 221
    iget-object v1, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 222
    .line 223
    invoke-virtual {v1, v0, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_8
    iget-object p3, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 228
    .line 229
    aget-object v1, p2, v0

    .line 230
    .line 231
    aput-object v1, p3, v0

    .line 232
    .line 233
    :cond_9
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_a
    const/16 p1, 0xa

    .line 237
    .line 238
    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    .line 239
    .line 240
    iput-object p1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 241
    .line 242
    iput v0, p0, Lh/b$c;->h:I

    .line 243
    .line 244
    :cond_b
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)I
    .locals 4

    .line 1
    iget v0, p0, Lh/b$c;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0xa

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lh/b$c;->o(II)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lh/b$c;->a:Lh/b;

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    iget v3, p0, Lh/b$c;->h:I

    .line 31
    .line 32
    add-int/2addr v3, v2

    .line 33
    iput v3, p0, Lh/b$c;->h:I

    .line 34
    .line 35
    iget v2, p0, Lh/b$c;->e:I

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    or-int/2addr p1, v2

    .line 42
    iput p1, p0, Lh/b$c;->e:I

    .line 43
    .line 44
    invoke-virtual {p0}, Lh/b$c;->p()V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Lh/b$c;->k:Landroid/graphics/Rect;

    .line 49
    .line 50
    iput-boolean v1, p0, Lh/b$c;->j:Z

    .line 51
    .line 52
    iput-boolean v1, p0, Lh/b$c;->m:Z

    .line 53
    .line 54
    iput-boolean v1, p0, Lh/b$c;->v:Z

    .line 55
    .line 56
    return v0
.end method

.method public final b(Landroid/content/res/Resources$Theme;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/b$c;->e()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh/b$c;->h:I

    .line 7
    .line 8
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    aget-object v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    .line 26
    .line 27
    .line 28
    iget v3, p0, Lh/b$c;->e:I

    .line 29
    .line 30
    aget-object v4, v1, v2

    .line 31
    .line 32
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    or-int/2addr v3, v4

    .line 37
    iput v3, p0, Lh/b$c;->e:I

    .line 38
    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lh/b$c;->y(Landroid/content/res/Resources;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public declared-synchronized c()Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh/b$c;->v:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lh/b$c;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lh/b$c;->e()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lh/b$c;->v:Z

    .line 17
    .line 18
    iget v1, p0, Lh/b$c;->h:I

    .line 19
    .line 20
    iget-object v2, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    if-ge v4, v1, :cond_2

    .line 25
    .line 26
    aget-object v5, v2, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    iput-boolean v3, p0, Lh/b$c;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return v3

    .line 38
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :try_start_2
    iput-boolean v0, p0, Lh/b$c;->w:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return v0

    .line 45
    :goto_1
    monitor-exit p0

    .line 46
    throw v0
.end method

.method public canApplyTheme()Z
    .locals 6

    .line 1
    iget v0, p0, Lh/b$c;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_2

    .line 8
    .line 9
    aget-object v4, v1, v3

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    return v5

    .line 21
    :cond_0
    iget-object v4, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    return v5

    .line 38
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v2
.end method

.method public d()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh/b$c;->m:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lh/b$c;->e()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lh/b$c;->h:I

    .line 8
    .line 9
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, p0, Lh/b$c;->o:I

    .line 13
    .line 14
    iput v2, p0, Lh/b$c;->n:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, p0, Lh/b$c;->q:I

    .line 18
    .line 19
    iput v2, p0, Lh/b$c;->p:I

    .line 20
    .line 21
    :goto_0
    if-ge v2, v0, :cond_4

    .line 22
    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, p0, Lh/b$c;->n:I

    .line 30
    .line 31
    if-le v4, v5, :cond_0

    .line 32
    .line 33
    iput v4, p0, Lh/b$c;->n:I

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget v5, p0, Lh/b$c;->o:I

    .line 40
    .line 41
    if-le v4, v5, :cond_1

    .line 42
    .line 43
    iput v4, p0, Lh/b$c;->o:I

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v5, p0, Lh/b$c;->p:I

    .line 50
    .line 51
    if-le v4, v5, :cond_2

    .line 52
    .line 53
    iput v4, p0, Lh/b$c;->p:I

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget v4, p0, Lh/b$c;->q:I

    .line 60
    .line 61
    if-le v3, v4, :cond_3

    .line 62
    .line 63
    iput v3, p0, Lh/b$c;->q:I

    .line 64
    .line 65
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 25
    .line 26
    iget-object v4, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    iget-object v5, p0, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {p0, v3}, Lh/b$c;->s(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    aput-object v3, v4, v2

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final g(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 26
    .line 27
    iget-object v3, p0, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0, v2}, Lh/b$c;->s(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    aput-object v2, v3, p1

    .line 40
    .line 41
    iget-object p1, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    iput-object v1, p0, Lh/b$c;->f:Landroid/util/SparseArray;

    .line 55
    .line 56
    :cond_1
    return-object v2

    .line 57
    :cond_2
    return-object v1
.end method

.method public getChangingConfigurations()I
    .locals 2

    .line 1
    iget v0, p0, Lh/b$c;->d:I

    .line 2
    .line 3
    iget v1, p0, Lh/b$c;->e:I

    .line 4
    .line 5
    or-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lh/b$c;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh/b$c;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lh/b$c;->o:I

    .line 9
    .line 10
    return v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh/b$c;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lh/b$c;->q:I

    .line 9
    .line 10
    return v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh/b$c;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lh/b$c;->p:I

    .line 9
    .line 10
    return v0
.end method

.method public final l()Landroid/graphics/Rect;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lh/b$c;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Lh/b$c;->k:Landroid/graphics/Rect;

    .line 8
    .line 9
    if-nez v0, :cond_8

    .line 10
    .line 11
    iget-boolean v2, p0, Lh/b$c;->j:Z

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {p0}, Lh/b$c;->e()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lh/b$c;->h:I

    .line 25
    .line 26
    iget-object v3, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-ge v5, v2, :cond_7

    .line 31
    .line 32
    aget-object v6, v3, v5

    .line 33
    .line 34
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_6

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v6, v0, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    iget v7, v1, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    if-le v6, v7, :cond_3

    .line 52
    .line 53
    iput v6, v1, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    :cond_3
    iget v6, v0, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v7, v1, Landroid/graphics/Rect;->top:I

    .line 58
    .line 59
    if-le v6, v7, :cond_4

    .line 60
    .line 61
    iput v6, v1, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    :cond_4
    iget v6, v0, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 66
    .line 67
    if-le v6, v7, :cond_5

    .line 68
    .line 69
    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    :cond_5
    iget v6, v0, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    iget v7, v1, Landroid/graphics/Rect;->bottom:I

    .line 74
    .line 75
    if-le v6, v7, :cond_6

    .line 76
    .line 77
    iput v6, v1, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lh/b$c;->j:Z

    .line 84
    .line 85
    iput-object v1, p0, Lh/b$c;->k:Landroid/graphics/Rect;

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_8
    :goto_1
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh/b$c;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lh/b$c;->n:I

    .line 9
    .line 10
    return v0
.end method

.method public final n()I
    .locals 6

    .line 1
    iget-boolean v0, p0, Lh/b$c;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lh/b$c;->s:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lh/b$c;->e()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lh/b$c;->h:I

    .line 12
    .line 13
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aget-object v2, v1, v2

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v2, -0x2

    .line 26
    :goto_0
    const/4 v3, 0x1

    .line 27
    move v4, v3

    .line 28
    :goto_1
    if-ge v4, v0, :cond_2

    .line 29
    .line 30
    aget-object v5, v1, v4

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-static {v2, v5}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput v2, p0, Lh/b$c;->s:I

    .line 44
    .line 45
    iput-boolean v3, p0, Lh/b$c;->r:Z

    .line 46
    .line 47
    return v2
.end method

.method public o(II)V
    .locals 2

    .line 1
    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    return-void
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lh/b$c;->r:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lh/b$c;->t:Z

    .line 5
    .line 6
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract r()V
.end method

.method public final s(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget v0, p0, Lh/b$c;->z:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lh/b$c;->a:Lh/b;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public final t(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh/b$c;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public final u(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh/b$c;->A:I

    .line 2
    .line 3
    return-void
.end method

.method public final v(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh/b$c;->B:I

    .line 2
    .line 3
    return-void
.end method

.method public final w(II)Z
    .locals 5

    .line 1
    iget v0, p0, Lh/b$c;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lh/b$c;->g:[Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    aget-object v4, v1, v2

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ne v2, p2, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput p1, p0, Lh/b$c;->z:I

    .line 24
    .line 25
    return v3
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh/b$c;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final y(Landroid/content/res/Resources;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lh/b$c;->b:Landroid/content/res/Resources;

    .line 4
    .line 5
    iget v0, p0, Lh/b$c;->c:I

    .line 6
    .line 7
    invoke-static {p1, v0}, Lh/b;->f(Landroid/content/res/Resources;I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lh/b$c;->c:I

    .line 12
    .line 13
    iput p1, p0, Lh/b$c;->c:I

    .line 14
    .line 15
    if-eq v0, p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lh/b$c;->m:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lh/b$c;->j:Z

    .line 21
    .line 22
    :cond_0
    return-void
.end method
