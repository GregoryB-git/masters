.class public Ll/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ll/V;

.field public c:Ll/V;

.field public d:Ll/V;

.field public e:Ll/V;

.field public f:Ll/V;

.field public g:Ll/V;

.field public h:Ll/V;

.field public final i:Ll/x;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll/v;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Ll/v;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Ll/x;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ll/x;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ll/v;->i:Ll/x;

    .line 18
    .line 19
    return-void
.end method

.method public static d(Landroid/content/Context;Ll/e;I)Ll/V;
    .locals 0

    .line 1
    invoke-virtual {p1, p0, p2}, Ll/e;->e(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p1, Ll/V;

    .line 8
    .line 9
    invoke-direct {p1}, Ll/V;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p1, Ll/V;->d:Z

    .line 14
    .line 15
    iput-object p0, p1, Ll/V;->a:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method


# virtual methods
.method public final A(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ll/x;->u(IF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B(Landroid/content/Context;Ll/X;)V
    .locals 10

    .line 1
    sget v0, Le/i;->c2:I

    .line 2
    .line 3
    iget v1, p0, Ll/v;->j:I

    .line 4
    .line 5
    invoke-virtual {p2, v0, v1}, Ll/X;->i(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Ll/v;->j:I

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, -0x1

    .line 15
    const/16 v3, 0x1c

    .line 16
    .line 17
    if-lt v0, v3, :cond_0

    .line 18
    .line 19
    sget v4, Le/i;->e2:I

    .line 20
    .line 21
    invoke-virtual {p2, v4, v2}, Ll/X;->i(II)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iput v4, p0, Ll/v;->k:I

    .line 26
    .line 27
    if-eq v4, v2, :cond_0

    .line 28
    .line 29
    iget v4, p0, Ll/v;->j:I

    .line 30
    .line 31
    and-int/2addr v4, v1

    .line 32
    iput v4, p0, Ll/v;->j:I

    .line 33
    .line 34
    :cond_0
    sget v4, Le/i;->d2:I

    .line 35
    .line 36
    invoke-virtual {p2, v4}, Ll/X;->p(I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x0

    .line 42
    if-nez v4, :cond_6

    .line 43
    .line 44
    sget v4, Le/i;->f2:I

    .line 45
    .line 46
    invoke-virtual {p2, v4}, Ll/X;->p(I)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    sget p1, Le/i;->b2:I

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Ll/X;->p(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iput-boolean v6, p0, Ll/v;->m:Z

    .line 62
    .line 63
    sget p1, Le/i;->b2:I

    .line 64
    .line 65
    invoke-virtual {p2, p1, v5}, Ll/X;->i(II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eq p1, v5, :cond_4

    .line 70
    .line 71
    if-eq p1, v1, :cond_3

    .line 72
    .line 73
    const/4 p2, 0x3

    .line 74
    if-eq p1, p2, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 78
    .line 79
    :goto_0
    iput-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    :goto_1
    return-void

    .line 89
    :cond_6
    :goto_2
    const/4 v4, 0x0

    .line 90
    iput-object v4, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 91
    .line 92
    sget v4, Le/i;->f2:I

    .line 93
    .line 94
    invoke-virtual {p2, v4}, Ll/X;->p(I)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_7

    .line 99
    .line 100
    sget v4, Le/i;->f2:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    sget v4, Le/i;->d2:I

    .line 104
    .line 105
    :goto_3
    iget v7, p0, Ll/v;->k:I

    .line 106
    .line 107
    iget v8, p0, Ll/v;->j:I

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_c

    .line 114
    .line 115
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    iget-object v9, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v9, Ll/v$a;

    .line 123
    .line 124
    invoke-direct {v9, p0, v7, v8, p1}, Ll/v$a;-><init>(Ll/v;IILjava/lang/ref/WeakReference;)V

    .line 125
    .line 126
    .line 127
    :try_start_0
    iget p1, p0, Ll/v;->j:I

    .line 128
    .line 129
    invoke-virtual {p2, v4, p1, v9}, Ll/X;->h(IILz/h$b;)Landroid/graphics/Typeface;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_a

    .line 134
    .line 135
    if-lt v0, v3, :cond_9

    .line 136
    .line 137
    iget v0, p0, Ll/v;->k:I

    .line 138
    .line 139
    if-eq v0, v2, :cond_9

    .line 140
    .line 141
    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget v0, p0, Ll/v;->k:I

    .line 146
    .line 147
    iget v7, p0, Ll/v;->j:I

    .line 148
    .line 149
    and-int/2addr v7, v1

    .line 150
    if-eqz v7, :cond_8

    .line 151
    .line 152
    move v7, v5

    .line 153
    goto :goto_4

    .line 154
    :cond_8
    move v7, v6

    .line 155
    :goto_4
    invoke-static {p1, v0, v7}, Ll/u;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :cond_9
    iput-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 160
    .line 161
    :cond_a
    iget-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 162
    .line 163
    if-nez p1, :cond_b

    .line 164
    .line 165
    move p1, v5

    .line 166
    goto :goto_5

    .line 167
    :cond_b
    move p1, v6

    .line 168
    :goto_5
    iput-boolean p1, p0, Ll/v;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    .line 170
    :catch_0
    :cond_c
    iget-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 171
    .line 172
    if-nez p1, :cond_f

    .line 173
    .line 174
    invoke-virtual {p2, v4}, Ll/X;->m(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-eqz p1, :cond_f

    .line 179
    .line 180
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 181
    .line 182
    if-lt p2, v3, :cond_e

    .line 183
    .line 184
    iget p2, p0, Ll/v;->k:I

    .line 185
    .line 186
    if-eq p2, v2, :cond_e

    .line 187
    .line 188
    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iget p2, p0, Ll/v;->k:I

    .line 193
    .line 194
    iget v0, p0, Ll/v;->j:I

    .line 195
    .line 196
    and-int/2addr v0, v1

    .line 197
    if-eqz v0, :cond_d

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_d
    move v5, v6

    .line 201
    :goto_6
    invoke-static {p1, p2, v5}, Ll/u;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    :goto_7
    iput-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_e
    iget p2, p0, Ll/v;->j:I

    .line 209
    .line 210
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    goto :goto_7

    .line 215
    :cond_f
    :goto_8
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;Ll/V;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Ll/e;->g(Landroid/graphics/drawable/Drawable;Ll/V;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll/v;->b:Ll/V;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ll/v;->c:Ll/V;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ll/v;->d:Ll/V;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ll/v;->e:Ll/V;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v3, v0, v2

    .line 26
    .line 27
    iget-object v4, p0, Ll/v;->b:Ll/V;

    .line 28
    .line 29
    invoke-virtual {p0, v3, v4}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    aget-object v3, v0, v3

    .line 34
    .line 35
    iget-object v4, p0, Ll/v;->c:Ll/V;

    .line 36
    .line 37
    invoke-virtual {p0, v3, v4}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 38
    .line 39
    .line 40
    aget-object v3, v0, v1

    .line 41
    .line 42
    iget-object v4, p0, Ll/v;->d:Ll/V;

    .line 43
    .line 44
    invoke-virtual {p0, v3, v4}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    aget-object v0, v0, v3

    .line 49
    .line 50
    iget-object v3, p0, Ll/v;->e:Ll/V;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v3}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Ll/v;->f:Ll/V;

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Ll/v;->g:Ll/V;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    :cond_2
    iget-object v0, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Ll/v;->f:Ll/V;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Ll/v;->g:Ll/V;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Ll/v;->a(Landroid/graphics/drawable/Drawable;Ll/V;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()[I
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->j()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ll/V;->a:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return-object v0
.end method

.method public k()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ll/V;->b:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/x;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public m(Landroid/util/AttributeSet;I)V
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p2

    .line 6
    .line 7
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v10

    .line 13
    invoke-static {}, Ll/e;->b()Ll/e;

    .line 14
    .line 15
    .line 16
    move-result-object v11

    .line 17
    sget-object v0, Le/i;->M:[I

    .line 18
    .line 19
    const/4 v12, 0x0

    .line 20
    invoke-static {v10, v8, v0, v9, v12}, Ll/X;->s(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/X;

    .line 21
    .line 22
    .line 23
    move-result-object v13

    .line 24
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Le/i;->M:[I

    .line 31
    .line 32
    invoke-virtual {v13}, Ll/X;->o()Landroid/content/res/TypedArray;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object/from16 v3, p1

    .line 38
    .line 39
    move/from16 v5, p2

    .line 40
    .line 41
    invoke-static/range {v0 .. v6}, LI/s;->B(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 42
    .line 43
    .line 44
    sget v0, Le/i;->N:I

    .line 45
    .line 46
    const/4 v14, -0x1

    .line 47
    invoke-virtual {v13, v0, v14}, Ll/X;->l(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sget v1, Le/i;->Q:I

    .line 52
    .line 53
    invoke-virtual {v13, v1}, Ll/X;->p(I)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    sget v1, Le/i;->Q:I

    .line 60
    .line 61
    invoke-virtual {v13, v1, v12}, Ll/X;->l(II)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v10, v11, v1}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, v7, Ll/v;->b:Ll/V;

    .line 70
    .line 71
    :cond_0
    sget v1, Le/i;->O:I

    .line 72
    .line 73
    invoke-virtual {v13, v1}, Ll/X;->p(I)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    sget v1, Le/i;->O:I

    .line 80
    .line 81
    invoke-virtual {v13, v1, v12}, Ll/X;->l(II)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v10, v11, v1}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v7, Ll/v;->c:Ll/V;

    .line 90
    .line 91
    :cond_1
    sget v1, Le/i;->R:I

    .line 92
    .line 93
    invoke-virtual {v13, v1}, Ll/X;->p(I)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    sget v1, Le/i;->R:I

    .line 100
    .line 101
    invoke-virtual {v13, v1, v12}, Ll/X;->l(II)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v10, v11, v1}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v7, Ll/v;->d:Ll/V;

    .line 110
    .line 111
    :cond_2
    sget v1, Le/i;->P:I

    .line 112
    .line 113
    invoke-virtual {v13, v1}, Ll/X;->p(I)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    sget v1, Le/i;->P:I

    .line 120
    .line 121
    invoke-virtual {v13, v1, v12}, Ll/X;->l(II)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-static {v10, v11, v1}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iput-object v1, v7, Ll/v;->e:Ll/V;

    .line 130
    .line 131
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    sget v2, Le/i;->S:I

    .line 134
    .line 135
    invoke-virtual {v13, v2}, Ll/X;->p(I)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    sget v2, Le/i;->S:I

    .line 142
    .line 143
    invoke-virtual {v13, v2, v12}, Ll/X;->l(II)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-static {v10, v11, v2}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iput-object v2, v7, Ll/v;->f:Ll/V;

    .line 152
    .line 153
    :cond_4
    sget v2, Le/i;->T:I

    .line 154
    .line 155
    invoke-virtual {v13, v2}, Ll/X;->p(I)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    sget v2, Le/i;->T:I

    .line 162
    .line 163
    invoke-virtual {v13, v2, v12}, Ll/X;->l(II)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {v10, v11, v2}, Ll/v;->d(Landroid/content/Context;Ll/e;I)Ll/V;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iput-object v2, v7, Ll/v;->g:Ll/V;

    .line 172
    .line 173
    :cond_5
    invoke-virtual {v13}, Ll/X;->t()V

    .line 174
    .line 175
    .line 176
    iget-object v2, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 177
    .line 178
    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 183
    .line 184
    const/16 v3, 0x1a

    .line 185
    .line 186
    if-eq v0, v14, :cond_9

    .line 187
    .line 188
    sget-object v5, Le/i;->Z1:[I

    .line 189
    .line 190
    invoke-static {v10, v0, v5}, Ll/X;->q(Landroid/content/Context;I[I)Ll/X;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-nez v2, :cond_6

    .line 195
    .line 196
    sget v5, Le/i;->h2:I

    .line 197
    .line 198
    invoke-virtual {v0, v5}, Ll/X;->p(I)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_6

    .line 203
    .line 204
    sget v5, Le/i;->h2:I

    .line 205
    .line 206
    invoke-virtual {v0, v5, v12}, Ll/X;->a(IZ)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    const/4 v6, 0x1

    .line 211
    goto :goto_0

    .line 212
    :cond_6
    move v5, v12

    .line 213
    move v6, v5

    .line 214
    :goto_0
    invoke-virtual {v7, v10, v0}, Ll/v;->B(Landroid/content/Context;Ll/X;)V

    .line 215
    .line 216
    .line 217
    sget v15, Le/i;->i2:I

    .line 218
    .line 219
    invoke-virtual {v0, v15}, Ll/X;->p(I)Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    if-eqz v15, :cond_7

    .line 224
    .line 225
    sget v15, Le/i;->i2:I

    .line 226
    .line 227
    invoke-virtual {v0, v15}, Ll/X;->m(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v15

    .line 231
    goto :goto_1

    .line 232
    :cond_7
    const/4 v15, 0x0

    .line 233
    :goto_1
    if-lt v1, v3, :cond_8

    .line 234
    .line 235
    sget v4, Le/i;->g2:I

    .line 236
    .line 237
    invoke-virtual {v0, v4}, Ll/X;->p(I)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_8

    .line 242
    .line 243
    sget v4, Le/i;->g2:I

    .line 244
    .line 245
    invoke-virtual {v0, v4}, Ll/X;->m(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    goto :goto_2

    .line 250
    :cond_8
    const/4 v4, 0x0

    .line 251
    :goto_2
    invoke-virtual {v0}, Ll/X;->t()V

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    move v5, v12

    .line 256
    move v6, v5

    .line 257
    const/4 v4, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    :goto_3
    sget-object v0, Le/i;->Z1:[I

    .line 260
    .line 261
    invoke-static {v10, v8, v0, v9, v12}, Ll/X;->s(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/X;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-nez v2, :cond_a

    .line 266
    .line 267
    sget v13, Le/i;->h2:I

    .line 268
    .line 269
    invoke-virtual {v0, v13}, Ll/X;->p(I)Z

    .line 270
    .line 271
    .line 272
    move-result v13

    .line 273
    if-eqz v13, :cond_a

    .line 274
    .line 275
    sget v5, Le/i;->h2:I

    .line 276
    .line 277
    invoke-virtual {v0, v5, v12}, Ll/X;->a(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    const/16 v16, 0x1

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_a
    move/from16 v16, v6

    .line 285
    .line 286
    :goto_4
    sget v6, Le/i;->i2:I

    .line 287
    .line 288
    invoke-virtual {v0, v6}, Ll/X;->p(I)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-eqz v6, :cond_b

    .line 293
    .line 294
    sget v6, Le/i;->i2:I

    .line 295
    .line 296
    invoke-virtual {v0, v6}, Ll/X;->m(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    :cond_b
    if-lt v1, v3, :cond_c

    .line 301
    .line 302
    sget v3, Le/i;->g2:I

    .line 303
    .line 304
    invoke-virtual {v0, v3}, Ll/X;->p(I)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    if-eqz v3, :cond_c

    .line 309
    .line 310
    sget v3, Le/i;->g2:I

    .line 311
    .line 312
    invoke-virtual {v0, v3}, Ll/X;->m(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    :cond_c
    const/16 v3, 0x1c

    .line 317
    .line 318
    if-lt v1, v3, :cond_d

    .line 319
    .line 320
    sget v3, Le/i;->a2:I

    .line 321
    .line 322
    invoke-virtual {v0, v3}, Ll/X;->p(I)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_d

    .line 327
    .line 328
    sget v3, Le/i;->a2:I

    .line 329
    .line 330
    invoke-virtual {v0, v3, v14}, Ll/X;->e(II)I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-nez v3, :cond_d

    .line 335
    .line 336
    iget-object v3, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 337
    .line 338
    const/4 v6, 0x0

    .line 339
    invoke-virtual {v3, v12, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 340
    .line 341
    .line 342
    :cond_d
    invoke-virtual {v7, v10, v0}, Ll/v;->B(Landroid/content/Context;Ll/X;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ll/X;->t()V

    .line 346
    .line 347
    .line 348
    if-nez v2, :cond_e

    .line 349
    .line 350
    if-eqz v16, :cond_e

    .line 351
    .line 352
    invoke-virtual {v7, v5}, Ll/v;->r(Z)V

    .line 353
    .line 354
    .line 355
    :cond_e
    iget-object v0, v7, Ll/v;->l:Landroid/graphics/Typeface;

    .line 356
    .line 357
    if-eqz v0, :cond_10

    .line 358
    .line 359
    iget v2, v7, Ll/v;->k:I

    .line 360
    .line 361
    if-ne v2, v14, :cond_f

    .line 362
    .line 363
    iget-object v2, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 364
    .line 365
    iget v3, v7, Ll/v;->j:I

    .line 366
    .line 367
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_f
    iget-object v2, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 372
    .line 373
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 374
    .line 375
    .line 376
    :cond_10
    :goto_5
    if-eqz v4, :cond_11

    .line 377
    .line 378
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 379
    .line 380
    invoke-static {v0, v4}, Ll/o;->a(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    :cond_11
    if-eqz v15, :cond_13

    .line 384
    .line 385
    const/16 v0, 0x18

    .line 386
    .line 387
    if-lt v1, v0, :cond_12

    .line 388
    .line 389
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 390
    .line 391
    invoke-static {v15}, Ll/p;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v0, v1}, Ll/q;->a(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 396
    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_12
    const/16 v0, 0x2c

    .line 400
    .line 401
    invoke-virtual {v15, v0}, Ljava/lang/String;->indexOf(I)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    invoke-virtual {v15, v12, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    iget-object v1, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 410
    .line 411
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    .line 416
    .line 417
    .line 418
    :cond_13
    :goto_6
    iget-object v0, v7, Ll/v;->i:Ll/x;

    .line 419
    .line 420
    invoke-virtual {v0, v8, v9}, Ll/x;->p(Landroid/util/AttributeSet;I)V

    .line 421
    .line 422
    .line 423
    sget-boolean v0, LL/b;->b:Z

    .line 424
    .line 425
    if-eqz v0, :cond_15

    .line 426
    .line 427
    iget-object v0, v7, Ll/v;->i:Ll/x;

    .line 428
    .line 429
    invoke-virtual {v0}, Ll/x;->k()I

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_15

    .line 434
    .line 435
    iget-object v0, v7, Ll/v;->i:Ll/x;

    .line 436
    .line 437
    invoke-virtual {v0}, Ll/x;->j()[I

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    array-length v1, v0

    .line 442
    if-lez v1, :cond_15

    .line 443
    .line 444
    iget-object v1, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 445
    .line 446
    invoke-static {v1}, Ll/r;->a(Landroid/widget/TextView;)I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    int-to-float v1, v1

    .line 451
    const/high16 v2, -0x40800000    # -1.0f

    .line 452
    .line 453
    cmpl-float v1, v1, v2

    .line 454
    .line 455
    if-eqz v1, :cond_14

    .line 456
    .line 457
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 458
    .line 459
    iget-object v1, v7, Ll/v;->i:Ll/x;

    .line 460
    .line 461
    invoke-virtual {v1}, Ll/x;->h()I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    iget-object v2, v7, Ll/v;->i:Ll/x;

    .line 466
    .line 467
    invoke-virtual {v2}, Ll/x;->g()I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    iget-object v3, v7, Ll/v;->i:Ll/x;

    .line 472
    .line 473
    invoke-virtual {v3}, Ll/x;->i()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    invoke-static {v0, v1, v2, v3, v12}, Ll/s;->a(Landroid/widget/TextView;IIII)V

    .line 478
    .line 479
    .line 480
    goto :goto_7

    .line 481
    :cond_14
    iget-object v1, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 482
    .line 483
    invoke-static {v1, v0, v12}, Ll/t;->a(Landroid/widget/TextView;[II)V

    .line 484
    .line 485
    .line 486
    :cond_15
    :goto_7
    sget-object v0, Le/i;->U:[I

    .line 487
    .line 488
    invoke-static {v10, v8, v0}, Ll/X;->r(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/X;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    sget v0, Le/i;->c0:I

    .line 493
    .line 494
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eq v0, v14, :cond_16

    .line 499
    .line 500
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    move-object v1, v0

    .line 505
    goto :goto_8

    .line 506
    :cond_16
    const/4 v1, 0x0

    .line 507
    :goto_8
    sget v0, Le/i;->h0:I

    .line 508
    .line 509
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eq v0, v14, :cond_17

    .line 514
    .line 515
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object v2, v0

    .line 520
    goto :goto_9

    .line 521
    :cond_17
    const/4 v2, 0x0

    .line 522
    :goto_9
    sget v0, Le/i;->d0:I

    .line 523
    .line 524
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-eq v0, v14, :cond_18

    .line 529
    .line 530
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    move-object v3, v0

    .line 535
    goto :goto_a

    .line 536
    :cond_18
    const/4 v3, 0x0

    .line 537
    :goto_a
    sget v0, Le/i;->a0:I

    .line 538
    .line 539
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eq v0, v14, :cond_19

    .line 544
    .line 545
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    move-object v4, v0

    .line 550
    goto :goto_b

    .line 551
    :cond_19
    const/4 v4, 0x0

    .line 552
    :goto_b
    sget v0, Le/i;->e0:I

    .line 553
    .line 554
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-eq v0, v14, :cond_1a

    .line 559
    .line 560
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    move-object v5, v0

    .line 565
    goto :goto_c

    .line 566
    :cond_1a
    const/4 v5, 0x0

    .line 567
    :goto_c
    sget v0, Le/i;->b0:I

    .line 568
    .line 569
    invoke-virtual {v8, v0, v14}, Ll/X;->l(II)I

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-eq v0, v14, :cond_1b

    .line 574
    .line 575
    invoke-virtual {v11, v10, v0}, Ll/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    move-object v6, v0

    .line 580
    goto :goto_d

    .line 581
    :cond_1b
    const/4 v6, 0x0

    .line 582
    :goto_d
    move-object/from16 v0, p0

    .line 583
    .line 584
    invoke-virtual/range {v0 .. v6}, Ll/v;->x(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 585
    .line 586
    .line 587
    sget v0, Le/i;->f0:I

    .line 588
    .line 589
    invoke-virtual {v8, v0}, Ll/X;->p(I)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_1c

    .line 594
    .line 595
    sget v0, Le/i;->f0:I

    .line 596
    .line 597
    invoke-virtual {v8, v0}, Ll/X;->c(I)Landroid/content/res/ColorStateList;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    iget-object v1, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 602
    .line 603
    invoke-static {v1, v0}, LL/h;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 604
    .line 605
    .line 606
    :cond_1c
    sget v0, Le/i;->g0:I

    .line 607
    .line 608
    invoke-virtual {v8, v0}, Ll/X;->p(I)Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_1d

    .line 613
    .line 614
    sget v0, Le/i;->g0:I

    .line 615
    .line 616
    invoke-virtual {v8, v0, v14}, Ll/X;->i(II)I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    const/4 v1, 0x0

    .line 621
    invoke-static {v0, v1}, Ll/B;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    iget-object v1, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 626
    .line 627
    invoke-static {v1, v0}, LL/h;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 628
    .line 629
    .line 630
    :cond_1d
    sget v0, Le/i;->i0:I

    .line 631
    .line 632
    invoke-virtual {v8, v0, v14}, Ll/X;->e(II)I

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    sget v1, Le/i;->j0:I

    .line 637
    .line 638
    invoke-virtual {v8, v1, v14}, Ll/X;->e(II)I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    sget v2, Le/i;->k0:I

    .line 643
    .line 644
    invoke-virtual {v8, v2, v14}, Ll/X;->e(II)I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    invoke-virtual {v8}, Ll/X;->t()V

    .line 649
    .line 650
    .line 651
    if-eq v0, v14, :cond_1e

    .line 652
    .line 653
    iget-object v3, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 654
    .line 655
    invoke-static {v3, v0}, LL/h;->h(Landroid/widget/TextView;I)V

    .line 656
    .line 657
    .line 658
    :cond_1e
    if-eq v1, v14, :cond_1f

    .line 659
    .line 660
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 661
    .line 662
    invoke-static {v0, v1}, LL/h;->i(Landroid/widget/TextView;I)V

    .line 663
    .line 664
    .line 665
    :cond_1f
    if-eq v2, v14, :cond_20

    .line 666
    .line 667
    iget-object v0, v7, Ll/v;->a:Landroid/widget/TextView;

    .line 668
    .line 669
    invoke-static {v0, v2}, LL/h;->j(Landroid/widget/TextView;I)V

    .line 670
    .line 671
    .line 672
    :cond_20
    return-void
.end method

.method public n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll/v;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p2, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget v0, p0, Ll/v;->j:I

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public o(ZIIII)V
    .locals 0

    .line 1
    sget-boolean p1, LL/b;->b:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ll/v;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ll/v;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public q(Landroid/content/Context;I)V
    .locals 4

    .line 1
    sget-object v0, Le/i;->Z1:[I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Ll/X;->q(Landroid/content/Context;I[I)Ll/X;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget v0, Le/i;->h2:I

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ll/X;->p(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget v0, Le/i;->h2:I

    .line 17
    .line 18
    invoke-virtual {p2, v0, v1}, Ll/X;->a(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, v0}, Ll/v;->r(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    sget v2, Le/i;->a2:I

    .line 28
    .line 29
    invoke-virtual {p2, v2}, Ll/X;->p(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    sget v2, Le/i;->a2:I

    .line 36
    .line 37
    const/4 v3, -0x1

    .line 38
    invoke-virtual {p2, v2, v3}, Ll/X;->e(II)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    iget-object v2, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v2, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0, p1, p2}, Ll/v;->B(Landroid/content/Context;Ll/X;)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x1a

    .line 54
    .line 55
    if-lt v0, p1, :cond_2

    .line 56
    .line 57
    sget p1, Le/i;->g2:I

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ll/X;->p(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    sget p1, Le/i;->g2:I

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ll/X;->m(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-static {v0, p1}, Ll/o;->a(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {p2}, Ll/X;->t()V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Ll/v;->l:Landroid/graphics/Typeface;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    iget-object p2, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 86
    .line 87
    iget v0, p0, Ll/v;->j:I

    .line 88
    .line 89
    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 90
    .line 91
    .line 92
    :cond_3
    return-void
.end method

.method public r(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/x;->q(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public t([II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ll/x;->r([II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->i:Ll/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll/x;->s(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ll/V;

    .line 6
    .line 7
    invoke-direct {v0}, Ll/V;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll/v;->h:Ll/V;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 13
    .line 14
    iput-object p1, v0, Ll/V;->a:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Ll/V;->d:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Ll/v;->y()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public w(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ll/V;

    .line 6
    .line 7
    invoke-direct {v0}, Ll/V;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll/v;->h:Ll/V;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 13
    .line 14
    iput-object p1, v0, Ll/V;->b:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Ll/V;->c:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Ll/v;->y()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final x(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x2

    .line 5
    if-nez p5, :cond_a

    .line 6
    .line 7
    if-eqz p6, :cond_0

    .line 8
    .line 9
    goto :goto_7

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    if-eqz p4, :cond_f

    .line 17
    .line 18
    :cond_1
    iget-object p5, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p5

    .line 24
    aget-object p6, p5, v2

    .line 25
    .line 26
    if-nez p6, :cond_7

    .line 27
    .line 28
    aget-object v4, p5, v3

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_2
    iget-object p5, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object p5

    .line 39
    iget-object p6, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    aget-object p1, p5, v2

    .line 45
    .line 46
    :goto_0
    if-eqz p2, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    aget-object p2, p5, v1

    .line 50
    .line 51
    :goto_1
    if-eqz p3, :cond_5

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    aget-object p3, p5, v3

    .line 55
    .line 56
    :goto_2
    if-eqz p4, :cond_6

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_6
    aget-object p4, p5, v0

    .line 60
    .line 61
    :goto_3
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_c

    .line 65
    :cond_7
    :goto_4
    iget-object p1, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 66
    .line 67
    if-eqz p2, :cond_8

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_8
    aget-object p2, p5, v1

    .line 71
    .line 72
    :goto_5
    aget-object p3, p5, v3

    .line 73
    .line 74
    if-eqz p4, :cond_9

    .line 75
    .line 76
    goto :goto_6

    .line 77
    :cond_9
    aget-object p4, p5, v0

    .line 78
    .line 79
    :goto_6
    invoke-virtual {p1, p6, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_a
    :goto_7
    iget-object p1, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p3, p0, Ll/v;->a:Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz p5, :cond_b

    .line 92
    .line 93
    goto :goto_8

    .line 94
    :cond_b
    aget-object p5, p1, v2

    .line 95
    .line 96
    :goto_8
    if-eqz p2, :cond_c

    .line 97
    .line 98
    goto :goto_9

    .line 99
    :cond_c
    aget-object p2, p1, v1

    .line 100
    .line 101
    :goto_9
    if-eqz p6, :cond_d

    .line 102
    .line 103
    goto :goto_a

    .line 104
    :cond_d
    aget-object p6, p1, v3

    .line 105
    .line 106
    :goto_a
    if-eqz p4, :cond_e

    .line 107
    .line 108
    goto :goto_b

    .line 109
    :cond_e
    aget-object p4, p1, v0

    .line 110
    .line 111
    :goto_b
    invoke-virtual {p3, p5, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 112
    .line 113
    .line 114
    :cond_f
    :goto_c
    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/v;->h:Ll/V;

    .line 2
    .line 3
    iput-object v0, p0, Ll/v;->b:Ll/V;

    .line 4
    .line 5
    iput-object v0, p0, Ll/v;->c:Ll/V;

    .line 6
    .line 7
    iput-object v0, p0, Ll/v;->d:Ll/V;

    .line 8
    .line 9
    iput-object v0, p0, Ll/v;->e:Ll/V;

    .line 10
    .line 11
    iput-object v0, p0, Ll/v;->f:Ll/V;

    .line 12
    .line 13
    iput-object v0, p0, Ll/v;->g:Ll/V;

    .line 14
    .line 15
    return-void
.end method

.method public z(IF)V
    .locals 1

    .line 1
    sget-boolean v0, LL/b;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ll/v;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Ll/v;->A(IF)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
