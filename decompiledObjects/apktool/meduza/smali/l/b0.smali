.class public final Ll/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/b0$f;,
        Ll/b0$c;,
        Ll/b0$b;,
        Ll/b0$d;,
        Ll/b0$e;
    }
.end annotation


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ll/x0;

.field public c:Ll/x0;

.field public d:Ll/x0;

.field public e:Ll/x0;

.field public f:Ll/x0;

.field public g:Ll/x0;

.field public h:Ll/x0;

.field public final i:Ll/e0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll/b0;->j:I

    const/4 v0, -0x1

    iput v0, p0, Ll/b0;->k:I

    iput-object p1, p0, Ll/b0;->a:Landroid/widget/TextView;

    new-instance v0, Ll/e0;

    invoke-direct {v0, p1}, Ll/e0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/b0;->i:Ll/e0;

    return-void
.end method

.method public static c(Landroid/content/Context;Ll/j;I)Ll/x0;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Ll/j;->a:Ll/q0;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Ll/q0;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Ll/x0;

    .line 12
    .line 13
    invoke-direct {p1}, Ll/x0;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Ll/x0;->d:Z

    .line 18
    .line 19
    iput-object p0, p1, Ll/x0;->a:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit p1

    .line 26
    throw p0
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
    .line 84
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

.method public static h(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-ge v0, v1, :cond_e

    .line 6
    .line 7
    if-eqz p1, :cond_e

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p2, p0}, Le0/g0;->h(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    if-lt v0, v1, :cond_1

    .line 24
    .line 25
    invoke-static {p2, p0}, Le0/g0;->h(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_1
    iget p1, p2, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 31
    .line 32
    iget v0, p2, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 33
    .line 34
    if-le p1, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    add-int/lit8 v1, p1, 0x0

    .line 40
    .line 41
    :goto_0
    const/4 v2, 0x0

    .line 42
    if-le p1, v0, :cond_3

    .line 43
    .line 44
    sub-int/2addr p1, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    add-int/lit8 p1, v0, 0x0

    .line 47
    .line 48
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v3, 0x0

    .line 53
    if-ltz v1, :cond_d

    .line 54
    .line 55
    if-le p1, v0, :cond_4

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_4
    iget v4, p2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 60
    .line 61
    and-int/lit16 v4, v4, 0xfff

    .line 62
    .line 63
    const/16 v5, 0x81

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    if-eq v4, v5, :cond_6

    .line 67
    .line 68
    const/16 v5, 0xe1

    .line 69
    .line 70
    if-eq v4, v5, :cond_6

    .line 71
    .line 72
    const/16 v5, 0x12

    .line 73
    .line 74
    if-ne v4, v5, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move v4, v2

    .line 78
    goto :goto_3

    .line 79
    :cond_6
    :goto_2
    move v4, v6

    .line 80
    :goto_3
    if-eqz v4, :cond_7

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_7
    const/16 v3, 0x800

    .line 85
    .line 86
    if-gt v0, v3, :cond_8

    .line 87
    .line 88
    invoke-static {p2, p0, v1, p1}, Li0/a;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_8
    sub-int v0, p1, v1

    .line 94
    .line 95
    const/16 v3, 0x400

    .line 96
    .line 97
    if-le v0, v3, :cond_9

    .line 98
    .line 99
    move v3, v2

    .line 100
    goto :goto_4

    .line 101
    :cond_9
    move v3, v0

    .line 102
    :goto_4
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    sub-int/2addr v4, p1

    .line 107
    rsub-int v5, v3, 0x800

    .line 108
    .line 109
    const-wide v7, 0x3fe999999999999aL    # 0.8

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    int-to-double v9, v5

    .line 115
    mul-double/2addr v9, v7

    .line 116
    double-to-int v7, v9

    .line 117
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    sub-int v7, v5, v7

    .line 122
    .line 123
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    sub-int/2addr v5, v4

    .line 128
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    sub-int/2addr v1, v5

    .line 133
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_a

    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    add-int/lit8 v5, v5, -0x1

    .line 146
    .line 147
    :cond_a
    add-int v7, p1, v4

    .line 148
    .line 149
    sub-int/2addr v7, v6

    .line 150
    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-eqz v7, :cond_b

    .line 159
    .line 160
    add-int/lit8 v4, v4, -0x1

    .line 161
    .line 162
    :cond_b
    add-int v7, v5, v3

    .line 163
    .line 164
    add-int/2addr v7, v4

    .line 165
    if-eq v3, v0, :cond_c

    .line 166
    .line 167
    add-int v0, v1, v5

    .line 168
    .line 169
    invoke-interface {p0, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    add-int/2addr v4, p1

    .line 174
    invoke-interface {p0, p1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const/4 p1, 0x2

    .line 179
    new-array p1, p1, [Ljava/lang/CharSequence;

    .line 180
    .line 181
    aput-object v0, p1, v2

    .line 182
    .line 183
    aput-object p0, p1, v6

    .line 184
    .line 185
    invoke-static {p1}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    goto :goto_5

    .line 190
    :cond_c
    add-int/2addr v7, v1

    .line 191
    invoke-interface {p0, v1, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    :goto_5
    add-int/2addr v5, v2

    .line 196
    add-int/2addr v3, v5

    .line 197
    invoke-static {p2, p0, v5, v3}, Li0/a;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_d
    :goto_6
    invoke-static {p2, v3, v2, v2}, Li0/a;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 202
    .line 203
    .line 204
    :cond_e
    :goto_7
    return-void
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
.method public final a(Landroid/graphics/drawable/Drawable;Ll/x0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Ll/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/j;->d(Landroid/graphics/drawable/Drawable;Ll/x0;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Ll/b0;->b:Ll/x0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/b0;->c:Ll/x0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/b0;->d:Ll/x0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/b0;->e:Ll/x0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Ll/b0;->b:Ll/x0;

    invoke-virtual {p0, v3, v4}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Ll/b0;->c:Ll/x0;

    invoke-virtual {p0, v3, v4}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Ll/b0;->d:Ll/x0;

    invoke-virtual {p0, v3, v4}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Ll/b0;->e:Ll/x0;

    invoke-virtual {p0, v0, v3}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    :cond_1
    iget-object v0, p0, Ll/b0;->f:Ll/x0;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/b0;->g:Ll/x0;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Ll/b0;->a:Landroid/widget/TextView;

    invoke-static {v0}, Ll/b0$b;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Ll/b0;->f:Ll/x0;

    invoke-virtual {p0, v2, v3}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Ll/b0;->g:Ll/x0;

    invoke-virtual {p0, v0, v1}, Ll/b0;->a(Landroid/graphics/drawable/Drawable;Ll/x0;)V

    :cond_3
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/x0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    invoke-static {}, Ll/j;->a()Ll/j;

    .line 14
    .line 15
    .line 16
    move-result-object v10

    .line 17
    sget-object v3, Lb/a0;->u:[I

    .line 18
    .line 19
    invoke-static {v9, v7, v3, v8}, Ll/z0;->m(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z0;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v5, v11, Ll/z0;->b:Landroid/content/res/TypedArray;

    .line 30
    .line 31
    move-object/from16 v4, p1

    .line 32
    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    invoke-static/range {v1 .. v6}, Le0/d0;->g(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 36
    .line 37
    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, -0x1

    .line 40
    invoke-virtual {v11, v12, v13}, Ll/z0;->i(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v14, 0x3

    .line 45
    invoke-virtual {v11, v14}, Ll/z0;->l(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v11, v14, v12}, Ll/z0;->i(II)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v9, v10, v2}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iput-object v2, v0, Ll/b0;->b:Ll/x0;

    .line 60
    .line 61
    :cond_0
    const/4 v15, 0x1

    .line 62
    invoke-virtual {v11, v15}, Ll/z0;->l(I)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    invoke-virtual {v11, v15, v12}, Ll/z0;->i(II)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v9, v10, v2}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v0, Ll/b0;->c:Ll/x0;

    .line 77
    .line 78
    :cond_1
    const/4 v6, 0x4

    .line 79
    invoke-virtual {v11, v6}, Ll/z0;->l(I)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v11, v6, v12}, Ll/z0;->i(II)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-static {v9, v10, v2}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iput-object v2, v0, Ll/b0;->d:Ll/x0;

    .line 94
    .line 95
    :cond_2
    const/4 v5, 0x2

    .line 96
    invoke-virtual {v11, v5}, Ll/z0;->l(I)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {v11, v5, v12}, Ll/z0;->i(II)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-static {v9, v10, v2}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iput-object v2, v0, Ll/b0;->e:Ll/x0;

    .line 111
    .line 112
    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    const/4 v4, 0x5

    .line 115
    invoke-virtual {v11, v4}, Ll/z0;->l(I)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    invoke-virtual {v11, v4, v12}, Ll/z0;->i(II)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-static {v9, v10, v3}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iput-object v3, v0, Ll/b0;->f:Ll/x0;

    .line 130
    .line 131
    :cond_4
    const/4 v3, 0x6

    .line 132
    invoke-virtual {v11, v3}, Ll/z0;->l(I)Z

    .line 133
    .line 134
    .line 135
    move-result v16

    .line 136
    if-eqz v16, :cond_5

    .line 137
    .line 138
    invoke-virtual {v11, v3, v12}, Ll/z0;->i(II)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-static {v9, v10, v4}, Ll/b0;->c(Landroid/content/Context;Ll/j;I)Ll/x0;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    iput-object v4, v0, Ll/b0;->g:Ll/x0;

    .line 147
    .line 148
    :cond_5
    invoke-virtual {v11}, Ll/z0;->n()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v4}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    instance-of v4, v4, Landroid/text/method/PasswordTransformationMethod;

    .line 158
    .line 159
    const/16 v11, 0x1a

    .line 160
    .line 161
    const/16 v3, 0xe

    .line 162
    .line 163
    const/16 v14, 0xf

    .line 164
    .line 165
    if-eq v1, v13, :cond_9

    .line 166
    .line 167
    sget-object v5, Lb/a0;->J:[I

    .line 168
    .line 169
    new-instance v6, Ll/z0;

    .line 170
    .line 171
    invoke-virtual {v9, v1, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v6, v9, v1}, Ll/z0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 176
    .line 177
    .line 178
    if-nez v4, :cond_6

    .line 179
    .line 180
    invoke-virtual {v6, v3}, Ll/z0;->l(I)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_6

    .line 185
    .line 186
    invoke-virtual {v6, v3, v12}, Ll/z0;->a(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    const/4 v5, 0x1

    .line 191
    goto :goto_0

    .line 192
    :cond_6
    move v1, v12

    .line 193
    move v5, v1

    .line 194
    :goto_0
    invoke-virtual {v0, v9, v6}, Ll/b0;->n(Landroid/content/Context;Ll/z0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v14}, Ll/z0;->l(I)Z

    .line 198
    .line 199
    .line 200
    move-result v19

    .line 201
    if-eqz v19, :cond_7

    .line 202
    .line 203
    invoke-virtual {v6, v14}, Ll/z0;->j(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v19

    .line 207
    goto :goto_1

    .line 208
    :cond_7
    const/16 v19, 0x0

    .line 209
    .line 210
    :goto_1
    if-lt v2, v11, :cond_8

    .line 211
    .line 212
    const/16 v15, 0xd

    .line 213
    .line 214
    invoke-virtual {v6, v15}, Ll/z0;->l(I)Z

    .line 215
    .line 216
    .line 217
    move-result v17

    .line 218
    if-eqz v17, :cond_8

    .line 219
    .line 220
    invoke-virtual {v6, v15}, Ll/z0;->j(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v20

    .line 224
    goto :goto_2

    .line 225
    :cond_8
    const/16 v20, 0x0

    .line 226
    .line 227
    :goto_2
    invoke-virtual {v6}, Ll/z0;->n()V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_9
    move v1, v12

    .line 232
    move v5, v1

    .line 233
    const/16 v19, 0x0

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    :goto_3
    sget-object v6, Lb/a0;->J:[I

    .line 238
    .line 239
    new-instance v15, Ll/z0;

    .line 240
    .line 241
    invoke-virtual {v9, v7, v6, v8, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-direct {v15, v9, v6}, Ll/z0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 246
    .line 247
    .line 248
    if-nez v4, :cond_a

    .line 249
    .line 250
    invoke-virtual {v15, v3}, Ll/z0;->l(I)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_a

    .line 255
    .line 256
    invoke-virtual {v15, v3, v12}, Ll/z0;->a(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    const/4 v5, 0x1

    .line 261
    :cond_a
    invoke-virtual {v15, v14}, Ll/z0;->l(I)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_b

    .line 266
    .line 267
    invoke-virtual {v15, v14}, Ll/z0;->j(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v19

    .line 271
    :cond_b
    move-object/from16 v3, v19

    .line 272
    .line 273
    if-lt v2, v11, :cond_c

    .line 274
    .line 275
    const/16 v6, 0xd

    .line 276
    .line 277
    invoke-virtual {v15, v6}, Ll/z0;->l(I)Z

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    if-eqz v11, :cond_c

    .line 282
    .line 283
    invoke-virtual {v15, v6}, Ll/z0;->j(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v20

    .line 287
    :cond_c
    move-object/from16 v6, v20

    .line 288
    .line 289
    const/16 v11, 0x1c

    .line 290
    .line 291
    if-lt v2, v11, :cond_d

    .line 292
    .line 293
    invoke-virtual {v15, v12}, Ll/z0;->l(I)Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    if-eqz v11, :cond_d

    .line 298
    .line 299
    invoke-virtual {v15, v12, v13}, Ll/z0;->d(II)I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    if-nez v11, :cond_d

    .line 304
    .line 305
    iget-object v11, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    invoke-virtual {v11, v12, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 309
    .line 310
    .line 311
    :cond_d
    invoke-virtual {v0, v9, v15}, Ll/b0;->n(Landroid/content/Context;Ll/z0;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v15}, Ll/z0;->n()V

    .line 315
    .line 316
    .line 317
    if-nez v4, :cond_e

    .line 318
    .line 319
    if-eqz v5, :cond_e

    .line 320
    .line 321
    iget-object v4, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 322
    .line 323
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 324
    .line 325
    .line 326
    :cond_e
    iget-object v1, v0, Ll/b0;->l:Landroid/graphics/Typeface;

    .line 327
    .line 328
    if-eqz v1, :cond_10

    .line 329
    .line 330
    iget v4, v0, Ll/b0;->k:I

    .line 331
    .line 332
    if-ne v4, v13, :cond_f

    .line 333
    .line 334
    iget-object v4, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 335
    .line 336
    iget v5, v0, Ll/b0;->j:I

    .line 337
    .line 338
    invoke-virtual {v4, v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_f
    iget-object v4, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 343
    .line 344
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 345
    .line 346
    .line 347
    :cond_10
    :goto_4
    if-eqz v6, :cond_11

    .line 348
    .line 349
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-static {v1, v6}, Ll/b0$e;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 352
    .line 353
    .line 354
    :cond_11
    const/16 v11, 0x18

    .line 355
    .line 356
    if-eqz v3, :cond_13

    .line 357
    .line 358
    if-lt v2, v11, :cond_12

    .line 359
    .line 360
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 361
    .line 362
    invoke-static {v3}, Ll/b0$d;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v1, v2}, Ll/b0$d;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 367
    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_12
    const-string v1, ","

    .line 371
    .line 372
    invoke-virtual {v3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    aget-object v1, v1, v12

    .line 377
    .line 378
    iget-object v2, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 379
    .line 380
    invoke-static {v1}, Ll/b0$c;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {v2, v1}, Ll/b0$b;->c(Landroid/widget/TextView;Ljava/util/Locale;)V

    .line 385
    .line 386
    .line 387
    :cond_13
    :goto_5
    iget-object v14, v0, Ll/b0;->i:Ll/e0;

    .line 388
    .line 389
    iget-object v1, v14, Ll/e0;->j:Landroid/content/Context;

    .line 390
    .line 391
    sget-object v3, Lb/a0;->v:[I

    .line 392
    .line 393
    invoke-virtual {v1, v7, v3, v8, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 394
    .line 395
    .line 396
    move-result-object v15

    .line 397
    iget-object v1, v14, Ll/e0;->i:Landroid/widget/TextView;

    .line 398
    .line 399
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    const/4 v6, 0x6

    .line 404
    const/4 v5, 0x5

    .line 405
    move-object/from16 v4, p1

    .line 406
    .line 407
    move v11, v5

    .line 408
    const/4 v13, 0x2

    .line 409
    move-object v5, v15

    .line 410
    const/4 v13, 0x4

    .line 411
    move/from16 v6, p2

    .line 412
    .line 413
    invoke-static/range {v1 .. v6}, Le0/d0;->g(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v15, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    if-eqz v1, :cond_14

    .line 421
    .line 422
    invoke-virtual {v15, v11, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    iput v1, v14, Ll/e0;->a:I

    .line 427
    .line 428
    :cond_14
    invoke-virtual {v15, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    const/high16 v2, -0x40800000    # -1.0f

    .line 433
    .line 434
    if-eqz v1, :cond_15

    .line 435
    .line 436
    invoke-virtual {v15, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    goto :goto_6

    .line 441
    :cond_15
    move v1, v2

    .line 442
    :goto_6
    const/4 v3, 0x2

    .line 443
    invoke-virtual {v15, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    if-eqz v4, :cond_16

    .line 448
    .line 449
    invoke-virtual {v15, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    goto :goto_7

    .line 454
    :cond_16
    move v4, v2

    .line 455
    :goto_7
    const/4 v3, 0x1

    .line 456
    invoke-virtual {v15, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-eqz v5, :cond_17

    .line 461
    .line 462
    invoke-virtual {v15, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    goto :goto_8

    .line 467
    :cond_17
    move v5, v2

    .line 468
    :goto_8
    const/4 v3, 0x3

    .line 469
    invoke-virtual {v15, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-eqz v6, :cond_1a

    .line 474
    .line 475
    invoke-virtual {v15, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-lez v6, :cond_1a

    .line 480
    .line 481
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    new-array v8, v6, [I

    .line 494
    .line 495
    if-lez v6, :cond_19

    .line 496
    .line 497
    move v11, v12

    .line 498
    :goto_9
    if-ge v11, v6, :cond_18

    .line 499
    .line 500
    const/4 v13, -0x1

    .line 501
    invoke-virtual {v3, v11, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 502
    .line 503
    .line 504
    move-result v18

    .line 505
    aput v18, v8, v11

    .line 506
    .line 507
    add-int/lit8 v11, v11, 0x1

    .line 508
    .line 509
    goto :goto_9

    .line 510
    :cond_18
    invoke-static {v8}, Ll/e0;->b([I)[I

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    iput-object v6, v14, Ll/e0;->f:[I

    .line 515
    .line 516
    invoke-virtual {v14}, Ll/e0;->h()Z

    .line 517
    .line 518
    .line 519
    :cond_19
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 520
    .line 521
    .line 522
    :cond_1a
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->recycle()V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v14}, Ll/e0;->i()Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    if-eqz v3, :cond_1f

    .line 532
    .line 533
    iget v3, v14, Ll/e0;->a:I

    .line 534
    .line 535
    const/4 v8, 0x1

    .line 536
    if-ne v3, v8, :cond_20

    .line 537
    .line 538
    iget-boolean v3, v14, Ll/e0;->g:Z

    .line 539
    .line 540
    if-nez v3, :cond_1e

    .line 541
    .line 542
    iget-object v3, v14, Ll/e0;->j:Landroid/content/Context;

    .line 543
    .line 544
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    cmpl-float v8, v4, v2

    .line 553
    .line 554
    if-nez v8, :cond_1b

    .line 555
    .line 556
    const/high16 v4, 0x41400000    # 12.0f

    .line 557
    .line 558
    const/4 v8, 0x2

    .line 559
    invoke-static {v8, v4, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    goto :goto_a

    .line 564
    :cond_1b
    const/4 v8, 0x2

    .line 565
    :goto_a
    cmpl-float v11, v5, v2

    .line 566
    .line 567
    if-nez v11, :cond_1c

    .line 568
    .line 569
    const/high16 v5, 0x42e00000    # 112.0f

    .line 570
    .line 571
    invoke-static {v8, v5, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    :cond_1c
    cmpl-float v3, v1, v2

    .line 576
    .line 577
    if-nez v3, :cond_1d

    .line 578
    .line 579
    move v1, v6

    .line 580
    :cond_1d
    invoke-virtual {v14, v4, v5, v1}, Ll/e0;->j(FFF)V

    .line 581
    .line 582
    .line 583
    :cond_1e
    invoke-virtual {v14}, Ll/e0;->g()Z

    .line 584
    .line 585
    .line 586
    goto :goto_b

    .line 587
    :cond_1f
    iput v12, v14, Ll/e0;->a:I

    .line 588
    .line 589
    :cond_20
    :goto_b
    sget-boolean v1, Ll/f1;->b:Z

    .line 590
    .line 591
    if-eqz v1, :cond_22

    .line 592
    .line 593
    iget-object v1, v0, Ll/b0;->i:Ll/e0;

    .line 594
    .line 595
    iget v3, v1, Ll/e0;->a:I

    .line 596
    .line 597
    if-eqz v3, :cond_22

    .line 598
    .line 599
    iget-object v1, v1, Ll/e0;->f:[I

    .line 600
    .line 601
    array-length v3, v1

    .line 602
    if-lez v3, :cond_22

    .line 603
    .line 604
    iget-object v3, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 605
    .line 606
    invoke-static {v3}, Ll/b0$e;->a(Landroid/widget/TextView;)I

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    int-to-float v3, v3

    .line 611
    cmpl-float v2, v3, v2

    .line 612
    .line 613
    if-eqz v2, :cond_21

    .line 614
    .line 615
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 616
    .line 617
    iget-object v2, v0, Ll/b0;->i:Ll/e0;

    .line 618
    .line 619
    iget v2, v2, Ll/e0;->d:F

    .line 620
    .line 621
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    iget-object v3, v0, Ll/b0;->i:Ll/e0;

    .line 626
    .line 627
    iget v3, v3, Ll/e0;->e:F

    .line 628
    .line 629
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    iget-object v4, v0, Ll/b0;->i:Ll/e0;

    .line 634
    .line 635
    iget v4, v4, Ll/e0;->c:F

    .line 636
    .line 637
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    invoke-static {v1, v2, v3, v4, v12}, Ll/b0$e;->b(Landroid/widget/TextView;IIII)V

    .line 642
    .line 643
    .line 644
    goto :goto_c

    .line 645
    :cond_21
    iget-object v2, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 646
    .line 647
    invoke-static {v2, v1, v12}, Ll/b0$e;->c(Landroid/widget/TextView;[II)V

    .line 648
    .line 649
    .line 650
    :cond_22
    :goto_c
    sget-object v1, Lb/a0;->v:[I

    .line 651
    .line 652
    new-instance v2, Ll/z0;

    .line 653
    .line 654
    invoke-virtual {v9, v7, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    invoke-direct {v2, v9, v1}, Ll/z0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 659
    .line 660
    .line 661
    const/16 v1, 0x8

    .line 662
    .line 663
    const/4 v3, -0x1

    .line 664
    invoke-virtual {v2, v1, v3}, Ll/z0;->i(II)I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-eq v1, v3, :cond_23

    .line 669
    .line 670
    invoke-virtual {v10, v9, v1}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    goto :goto_d

    .line 675
    :cond_23
    const/4 v1, 0x0

    .line 676
    :goto_d
    const/16 v4, 0xd

    .line 677
    .line 678
    invoke-virtual {v2, v4, v3}, Ll/z0;->i(II)I

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    if-eq v4, v3, :cond_24

    .line 683
    .line 684
    invoke-virtual {v10, v9, v4}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    goto :goto_e

    .line 689
    :cond_24
    const/4 v4, 0x0

    .line 690
    :goto_e
    const/16 v5, 0x9

    .line 691
    .line 692
    invoke-virtual {v2, v5, v3}, Ll/z0;->i(II)I

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    if-eq v5, v3, :cond_25

    .line 697
    .line 698
    invoke-virtual {v10, v9, v5}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 699
    .line 700
    .line 701
    move-result-object v5

    .line 702
    goto :goto_f

    .line 703
    :cond_25
    const/4 v5, 0x0

    .line 704
    :goto_f
    const/4 v7, 0x6

    .line 705
    invoke-virtual {v2, v7, v3}, Ll/z0;->i(II)I

    .line 706
    .line 707
    .line 708
    move-result v7

    .line 709
    if-eq v7, v3, :cond_26

    .line 710
    .line 711
    invoke-virtual {v10, v9, v7}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    goto :goto_10

    .line 716
    :cond_26
    const/4 v7, 0x0

    .line 717
    :goto_10
    const/16 v8, 0xa

    .line 718
    .line 719
    invoke-virtual {v2, v8, v3}, Ll/z0;->i(II)I

    .line 720
    .line 721
    .line 722
    move-result v8

    .line 723
    if-eq v8, v3, :cond_27

    .line 724
    .line 725
    invoke-virtual {v10, v9, v8}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 726
    .line 727
    .line 728
    move-result-object v8

    .line 729
    goto :goto_11

    .line 730
    :cond_27
    const/4 v8, 0x0

    .line 731
    :goto_11
    const/4 v11, 0x7

    .line 732
    invoke-virtual {v2, v11, v3}, Ll/z0;->i(II)I

    .line 733
    .line 734
    .line 735
    move-result v11

    .line 736
    if-eq v11, v3, :cond_28

    .line 737
    .line 738
    invoke-virtual {v10, v9, v11}, Ll/j;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    goto :goto_12

    .line 743
    :cond_28
    const/4 v3, 0x0

    .line 744
    :goto_12
    if-nez v8, :cond_33

    .line 745
    .line 746
    if-eqz v3, :cond_29

    .line 747
    .line 748
    goto :goto_1a

    .line 749
    :cond_29
    if-nez v1, :cond_2a

    .line 750
    .line 751
    if-nez v4, :cond_2a

    .line 752
    .line 753
    if-nez v5, :cond_2a

    .line 754
    .line 755
    if-eqz v7, :cond_38

    .line 756
    .line 757
    :cond_2a
    iget-object v3, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 758
    .line 759
    invoke-static {v3}, Ll/b0$b;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    aget-object v8, v3, v12

    .line 764
    .line 765
    if-nez v8, :cond_30

    .line 766
    .line 767
    const/4 v9, 0x2

    .line 768
    aget-object v10, v3, v9

    .line 769
    .line 770
    if-eqz v10, :cond_2b

    .line 771
    .line 772
    goto :goto_17

    .line 773
    :cond_2b
    iget-object v3, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 774
    .line 775
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    iget-object v8, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 780
    .line 781
    if-eqz v1, :cond_2c

    .line 782
    .line 783
    goto :goto_13

    .line 784
    :cond_2c
    aget-object v1, v3, v12

    .line 785
    .line 786
    :goto_13
    if-eqz v4, :cond_2d

    .line 787
    .line 788
    goto :goto_14

    .line 789
    :cond_2d
    const/4 v4, 0x1

    .line 790
    aget-object v4, v3, v4

    .line 791
    .line 792
    :goto_14
    if-eqz v5, :cond_2e

    .line 793
    .line 794
    goto :goto_15

    .line 795
    :cond_2e
    const/4 v5, 0x2

    .line 796
    aget-object v5, v3, v5

    .line 797
    .line 798
    :goto_15
    if-eqz v7, :cond_2f

    .line 799
    .line 800
    goto :goto_16

    .line 801
    :cond_2f
    const/4 v7, 0x3

    .line 802
    aget-object v7, v3, v7

    .line 803
    .line 804
    :goto_16
    invoke-virtual {v8, v1, v4, v5, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 805
    .line 806
    .line 807
    goto :goto_1f

    .line 808
    :cond_30
    :goto_17
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 809
    .line 810
    if-eqz v4, :cond_31

    .line 811
    .line 812
    goto :goto_18

    .line 813
    :cond_31
    const/4 v4, 0x1

    .line 814
    aget-object v4, v3, v4

    .line 815
    .line 816
    :goto_18
    const/4 v5, 0x2

    .line 817
    aget-object v5, v3, v5

    .line 818
    .line 819
    if-eqz v7, :cond_32

    .line 820
    .line 821
    goto :goto_19

    .line 822
    :cond_32
    const/4 v7, 0x3

    .line 823
    aget-object v7, v3, v7

    .line 824
    .line 825
    :goto_19
    invoke-static {v1, v8, v4, v5, v7}, Ll/b0$b;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 826
    .line 827
    .line 828
    goto :goto_1f

    .line 829
    :cond_33
    :goto_1a
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 830
    .line 831
    invoke-static {v1}, Ll/b0$b;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    iget-object v5, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 836
    .line 837
    if-eqz v8, :cond_34

    .line 838
    .line 839
    goto :goto_1b

    .line 840
    :cond_34
    aget-object v8, v1, v12

    .line 841
    .line 842
    :goto_1b
    if-eqz v4, :cond_35

    .line 843
    .line 844
    goto :goto_1c

    .line 845
    :cond_35
    const/4 v4, 0x1

    .line 846
    aget-object v4, v1, v4

    .line 847
    .line 848
    :goto_1c
    if-eqz v3, :cond_36

    .line 849
    .line 850
    goto :goto_1d

    .line 851
    :cond_36
    const/4 v3, 0x2

    .line 852
    aget-object v3, v1, v3

    .line 853
    .line 854
    :goto_1d
    if-eqz v7, :cond_37

    .line 855
    .line 856
    goto :goto_1e

    .line 857
    :cond_37
    const/4 v7, 0x3

    .line 858
    aget-object v7, v1, v7

    .line 859
    .line 860
    :goto_1e
    invoke-static {v5, v8, v4, v3, v7}, Ll/b0$b;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 861
    .line 862
    .line 863
    :cond_38
    :goto_1f
    const/16 v1, 0xb

    .line 864
    .line 865
    invoke-virtual {v2, v1}, Ll/z0;->l(I)Z

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    if-eqz v3, :cond_3a

    .line 870
    .line 871
    invoke-virtual {v2, v1}, Ll/z0;->b(I)Landroid/content/res/ColorStateList;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    iget-object v3, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 876
    .line 877
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 881
    .line 882
    const/16 v5, 0x18

    .line 883
    .line 884
    if-lt v4, v5, :cond_39

    .line 885
    .line 886
    invoke-static {v3, v1}, Lj0/h$a;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 887
    .line 888
    .line 889
    goto :goto_20

    .line 890
    :cond_39
    instance-of v4, v3, Lj0/j;

    .line 891
    .line 892
    if-eqz v4, :cond_3a

    .line 893
    .line 894
    check-cast v3, Lj0/j;

    .line 895
    .line 896
    invoke-interface {v3, v1}, Lj0/j;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    .line 897
    .line 898
    .line 899
    :cond_3a
    :goto_20
    const/16 v1, 0xc

    .line 900
    .line 901
    invoke-virtual {v2, v1}, Ll/z0;->l(I)Z

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    if-eqz v3, :cond_3c

    .line 906
    .line 907
    const/4 v3, -0x1

    .line 908
    invoke-virtual {v2, v1, v3}, Ll/z0;->h(II)I

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    const/4 v3, 0x0

    .line 913
    invoke-static {v1, v3}, Ll/i0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    iget-object v3, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 918
    .line 919
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 923
    .line 924
    const/16 v5, 0x18

    .line 925
    .line 926
    if-lt v4, v5, :cond_3b

    .line 927
    .line 928
    invoke-static {v3, v1}, Lj0/h$a;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 929
    .line 930
    .line 931
    goto :goto_21

    .line 932
    :cond_3b
    instance-of v4, v3, Lj0/j;

    .line 933
    .line 934
    if-eqz v4, :cond_3c

    .line 935
    .line 936
    check-cast v3, Lj0/j;

    .line 937
    .line 938
    invoke-interface {v3, v1}, Lj0/j;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 939
    .line 940
    .line 941
    :cond_3c
    :goto_21
    const/16 v1, 0xf

    .line 942
    .line 943
    const/4 v3, -0x1

    .line 944
    invoke-virtual {v2, v1, v3}, Ll/z0;->d(II)I

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    const/16 v4, 0x12

    .line 949
    .line 950
    invoke-virtual {v2, v4, v3}, Ll/z0;->d(II)I

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    const/16 v5, 0x13

    .line 955
    .line 956
    invoke-virtual {v2, v5, v3}, Ll/z0;->d(II)I

    .line 957
    .line 958
    .line 959
    move-result v5

    .line 960
    invoke-virtual {v2}, Ll/z0;->n()V

    .line 961
    .line 962
    .line 963
    if-eq v1, v3, :cond_3d

    .line 964
    .line 965
    iget-object v2, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 966
    .line 967
    invoke-static {v2, v1}, Lj0/h;->b(Landroid/widget/TextView;I)V

    .line 968
    .line 969
    .line 970
    :cond_3d
    if-eq v4, v3, :cond_3e

    .line 971
    .line 972
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 973
    .line 974
    invoke-static {v1, v4}, Lj0/h;->c(Landroid/widget/TextView;I)V

    .line 975
    .line 976
    .line 977
    :cond_3e
    if-eq v5, v3, :cond_40

    .line 978
    .line 979
    iget-object v1, v0, Ll/b0;->a:Landroid/widget/TextView;

    .line 980
    .line 981
    if-ltz v5, :cond_3f

    .line 982
    .line 983
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    const/4 v3, 0x0

    .line 988
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    if-eq v5, v2, :cond_40

    .line 993
    .line 994
    sub-int/2addr v5, v2

    .line 995
    int-to-float v2, v5

    .line 996
    invoke-virtual {v1, v2, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 997
    .line 998
    .line 999
    goto :goto_22

    .line 1000
    :cond_3f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1001
    .line 1002
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 1003
    .line 1004
    .line 1005
    throw v1

    .line 1006
    :cond_40
    :goto_22
    return-void
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
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

.method public final g(Landroid/content/Context;I)V
    .locals 4

    .line 1
    sget-object v0, Lb/a0;->J:[I

    .line 2
    .line 3
    new-instance v1, Ll/z0;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, Ll/z0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 p2, 0xe

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ll/z0;->l(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, p2, v2}, Ll/z0;->a(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget-object v0, p0, Ll/b0;->a:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ll/z0;->l(I)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    invoke-virtual {v1, v2, v0}, Ll/z0;->d(II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Ll/b0;->a:Landroid/widget/TextView;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0, p1, v1}, Ll/b0;->n(Landroid/content/Context;Ll/z0;)V

    .line 52
    .line 53
    .line 54
    const/16 p1, 0x1a

    .line 55
    .line 56
    if-lt p2, p1, :cond_2

    .line 57
    .line 58
    const/16 p1, 0xd

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ll/z0;->l(I)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ll/z0;->j(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p2, p0, Ll/b0;->a:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-static {p2, p1}, Ll/b0$e;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {v1}, Ll/z0;->n()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    iget-object p2, p0, Ll/b0;->a:Landroid/widget/TextView;

    .line 85
    .line 86
    iget v0, p0, Ll/b0;->j:I

    .line 87
    .line 88
    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 89
    .line 90
    .line 91
    :cond_3
    return-void
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

.method public final i(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll/b0;->i:Ll/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/e0;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Ll/e0;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ll/e0;->j(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ll/e0;->g()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Ll/e0;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
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
    .line 84
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final j([II)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/b0;->i:Ll/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/e0;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lez v1, :cond_3

    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v4, v0, Ll/e0;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    aget v5, p1, v2

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    aput v5, v3, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v3}, Ll/e0;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, v0, Ll/e0;->f:[I

    .line 55
    .line 56
    invoke-virtual {v0}, Ll/e0;->h()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string v0, "None of the preset sizes is valid: "

    .line 66
    .line 67
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p2

    .line 86
    :cond_3
    iput-boolean v2, v0, Ll/e0;->g:Z

    .line 87
    .line 88
    :goto_2
    invoke-virtual {v0}, Ll/e0;->g()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0}, Ll/e0;->a()V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void
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

.method public final k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll/b0;->i:Ll/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/e0;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Ll/e0;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v1, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/high16 v3, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v2, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, v2}, Ll/e0;->j(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ll/e0;->g()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Ll/e0;->a()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v1, "Unknown auto-size text type: "

    .line 55
    .line 56
    invoke-static {v1, p1}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    iput p1, v0, Ll/e0;->a:I

    .line 66
    .line 67
    const/high16 v1, -0x40800000    # -1.0f

    .line 68
    .line 69
    iput v1, v0, Ll/e0;->d:F

    .line 70
    .line 71
    iput v1, v0, Ll/e0;->e:F

    .line 72
    .line 73
    iput v1, v0, Ll/e0;->c:F

    .line 74
    .line 75
    new-array v1, p1, [I

    .line 76
    .line 77
    iput-object v1, v0, Ll/e0;->f:[I

    .line 78
    .line 79
    iput-boolean p1, v0, Ll/e0;->b:Z

    .line 80
    .line 81
    :cond_2
    :goto_0
    return-void
    .line 82
    .line 83
    .line 84
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

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    if-nez v0, :cond_0

    new-instance v0, Ll/x0;

    invoke-direct {v0}, Ll/x0;-><init>()V

    iput-object v0, p0, Ll/b0;->h:Ll/x0;

    :cond_0
    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    iput-object p1, v0, Ll/x0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ll/x0;->d:Z

    iput-object v0, p0, Ll/b0;->b:Ll/x0;

    iput-object v0, p0, Ll/b0;->c:Ll/x0;

    iput-object v0, p0, Ll/b0;->d:Ll/x0;

    iput-object v0, p0, Ll/b0;->e:Ll/x0;

    iput-object v0, p0, Ll/b0;->f:Ll/x0;

    iput-object v0, p0, Ll/b0;->g:Ll/x0;

    return-void
.end method

.method public final m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    if-nez v0, :cond_0

    new-instance v0, Ll/x0;

    invoke-direct {v0}, Ll/x0;-><init>()V

    iput-object v0, p0, Ll/b0;->h:Ll/x0;

    :cond_0
    iget-object v0, p0, Ll/b0;->h:Ll/x0;

    iput-object p1, v0, Ll/x0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ll/x0;->c:Z

    iput-object v0, p0, Ll/b0;->b:Ll/x0;

    iput-object v0, p0, Ll/b0;->c:Ll/x0;

    iput-object v0, p0, Ll/b0;->d:Ll/x0;

    iput-object v0, p0, Ll/b0;->e:Ll/x0;

    iput-object v0, p0, Ll/b0;->f:Ll/x0;

    iput-object v0, p0, Ll/b0;->g:Ll/x0;

    return-void
.end method

.method public final n(Landroid/content/Context;Ll/z0;)V
    .locals 10

    iget v0, p0, Ll/b0;->j:I

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Ll/z0;->h(II)I

    move-result v0

    iput v0, p0, Ll/b0;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lt v0, v2, :cond_0

    const/16 v5, 0xb

    invoke-virtual {p2, v5, v3}, Ll/z0;->h(II)I

    move-result v5

    iput v5, p0, Ll/b0;->k:I

    if-eq v5, v3, :cond_0

    iget v5, p0, Ll/b0;->j:I

    and-int/2addr v5, v1

    or-int/2addr v5, v4

    iput v5, p0, Ll/b0;->j:I

    :cond_0
    const/16 v5, 0xa

    invoke-virtual {p2, v5}, Ll/z0;->l(I)Z

    move-result v6

    const/16 v7, 0xc

    const/4 v8, 0x1

    if-nez v6, :cond_6

    invoke-virtual {p2, v7}, Ll/z0;->l(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v8}, Ll/z0;->l(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v4, p0, Ll/b0;->m:Z

    invoke-virtual {p2, v8, v8}, Ll/z0;->h(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v6, 0x0

    iput-object v6, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    invoke-virtual {p2, v7}, Ll/z0;->l(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move v5, v7

    :cond_7
    iget v6, p0, Ll/b0;->k:I

    iget v7, p0, Ll/b0;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Ll/b0;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Ll/b0$a;

    invoke-direct {v9, p0, v6, v7, p1}, Ll/b0$a;-><init>(Ll/b0;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Ll/b0;->j:I

    invoke-virtual {p2, v5, p1, v9}, Ll/z0;->g(IILl/b0$a;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v2, :cond_9

    iget v0, p0, Ll/b0;->k:I

    if-eq v0, v3, :cond_9

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Ll/b0;->k:I

    iget v6, p0, Ll/b0;->j:I

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    move v6, v8

    goto :goto_3

    :cond_8
    move v6, v4

    :goto_3
    invoke-static {p1, v0, v6}, Ll/b0$f;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_9
    iput-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    :cond_a
    iget-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v8

    goto :goto_4

    :cond_b
    move p1, v4

    :goto_4
    iput-boolean p1, p0, Ll/b0;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v5}, Ll/z0;->j(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_e

    iget p2, p0, Ll/b0;->k:I

    if-eq p2, v3, :cond_e

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ll/b0;->k:I

    iget v0, p0, Ll/b0;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move v4, v8

    :cond_d
    invoke-static {p1, p2, v4}, Ll/b0$f;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_5

    :cond_e
    iget p2, p0, Ll/b0;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_5
    iput-object p1, p0, Ll/b0;->l:Landroid/graphics/Typeface;

    :cond_f
    return-void
.end method
