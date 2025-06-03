.class public final Li5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/a$a$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/lang/StringBuilder;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li5/a$a;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Li5/a$a;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iput p1, p0, Li5/a$a;->g:I

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    iput v0, p0, Li5/a$a;->d:I

    .line 40
    .line 41
    iput p1, p0, Li5/a$a;->e:I

    .line 42
    .line 43
    iput p1, p0, Li5/a$a;->f:I

    .line 44
    .line 45
    iput p2, p0, Li5/a$a;->h:I

    .line 46
    .line 47
    return-void
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
.end method


# virtual methods
.method public final a(C)V
    .locals 2

    iget-object v0, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li5/a$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    iget-object v2, p0, Li5/a$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li5/a$a$a;

    iget v3, v2, Li5/a$a$a;->c:I

    if-ne v3, v0, :cond_0

    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Li5/a$a$a;->c:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(I)Lh5/a;
    .locals 8

    .line 1
    iget v0, p0, Li5/a$a;->e:I

    .line 2
    .line 3
    iget v1, p0, Li5/a$a;->f:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    rsub-int/lit8 v1, v0, 0x20

    .line 7
    .line 8
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget-object v5, p0, Li5/a$a;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ge v4, v5, :cond_1

    .line 22
    .line 23
    iget-object v5, p0, Li5/a$a;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ljava/lang/CharSequence;

    .line 30
    .line 31
    sget v6, Lv5/e0;->a:I

    .line 32
    .line 33
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-gt v6, v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-interface {v5, v3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_1
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v5, 0xa

    .line 48
    .line 49
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Li5/a$a;->d()Landroid/text/SpannableString;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget v5, Lv5/e0;->a:I

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/text/SpannableString;->length()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-gt v5, v1, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v4, v3, v1}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :goto_2
    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    return-object p1

    .line 83
    :cond_3
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    sub-int/2addr v1, v4

    .line 88
    sub-int v4, v0, v1

    .line 89
    .line 90
    const/high16 v5, -0x80000000

    .line 91
    .line 92
    const/4 v6, 0x2

    .line 93
    const/4 v7, 0x1

    .line 94
    if-eq p1, v5, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    iget p1, p0, Li5/a$a;->g:I

    .line 98
    .line 99
    if-ne p1, v6, :cond_6

    .line 100
    .line 101
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/4 v5, 0x3

    .line 106
    if-lt p1, v5, :cond_5

    .line 107
    .line 108
    if-gez v1, :cond_6

    .line 109
    .line 110
    :cond_5
    move p1, v7

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    iget p1, p0, Li5/a$a;->g:I

    .line 113
    .line 114
    if-ne p1, v6, :cond_7

    .line 115
    .line 116
    if-lez v4, :cond_7

    .line 117
    .line 118
    move p1, v6

    .line 119
    goto :goto_3

    .line 120
    :cond_7
    move p1, v3

    .line 121
    :goto_3
    if-eq p1, v7, :cond_9

    .line 122
    .line 123
    const v3, 0x3dcccccd    # 0.1f

    .line 124
    .line 125
    .line 126
    const v4, 0x3f4ccccd    # 0.8f

    .line 127
    .line 128
    .line 129
    const/high16 v5, 0x42000000    # 32.0f

    .line 130
    .line 131
    if-eq p1, v6, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    rsub-int/lit8 v0, v1, 0x20

    .line 135
    .line 136
    :goto_4
    int-to-float v0, v0

    .line 137
    div-float/2addr v0, v5

    .line 138
    mul-float/2addr v0, v4

    .line 139
    add-float/2addr v0, v3

    .line 140
    goto :goto_5

    .line 141
    :cond_9
    const/high16 v0, 0x3f000000    # 0.5f

    .line 142
    .line 143
    :goto_5
    iget v1, p0, Li5/a$a;->d:I

    .line 144
    .line 145
    const/4 v3, 0x7

    .line 146
    if-le v1, v3, :cond_a

    .line 147
    .line 148
    add-int/lit8 v1, v1, -0xf

    .line 149
    .line 150
    add-int/lit8 v1, v1, -0x2

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_a
    iget v3, p0, Li5/a$a;->g:I

    .line 154
    .line 155
    if-ne v3, v7, :cond_b

    .line 156
    .line 157
    iget v3, p0, Li5/a$a;->h:I

    .line 158
    .line 159
    sub-int/2addr v3, v7

    .line 160
    sub-int/2addr v1, v3

    .line 161
    :cond_b
    :goto_6
    new-instance v3, Lh5/a$a;

    .line 162
    .line 163
    invoke-direct {v3}, Lh5/a$a;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-object v2, v3, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 167
    .line 168
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 169
    .line 170
    iput-object v2, v3, Lh5/a$a;->c:Landroid/text/Layout$Alignment;

    .line 171
    .line 172
    int-to-float v1, v1

    .line 173
    iput v1, v3, Lh5/a$a;->e:F

    .line 174
    .line 175
    iput v7, v3, Lh5/a$a;->f:I

    .line 176
    .line 177
    iput v0, v3, Lh5/a$a;->h:F

    .line 178
    .line 179
    iput p1, v3, Lh5/a$a;->i:I

    .line 180
    .line 181
    invoke-virtual {v3}, Lh5/a$a;->a()Lh5/a;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1
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

.method public final d()Landroid/text/SpannableString;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 4
    .line 5
    iget-object v2, v0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, -0x1

    .line 15
    move v6, v3

    .line 16
    move v7, v6

    .line 17
    move v9, v7

    .line 18
    move v11, v9

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    :cond_0
    :goto_0
    iget-object v12, v0, Li5/a$a;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v12

    .line 28
    const/16 v14, 0x21

    .line 29
    .line 30
    if-ge v5, v12, :cond_b

    .line 31
    .line 32
    iget-object v12, v0, Li5/a$a;->a:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, Li5/a$a$a;

    .line 39
    .line 40
    iget-boolean v15, v12, Li5/a$a$a;->b:Z

    .line 41
    .line 42
    iget v4, v12, Li5/a$a$a;->a:I

    .line 43
    .line 44
    const/16 v13, 0x8

    .line 45
    .line 46
    if-eq v4, v13, :cond_3

    .line 47
    .line 48
    const/4 v10, 0x7

    .line 49
    if-ne v4, v10, :cond_1

    .line 50
    .line 51
    const/4 v13, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v13, 0x0

    .line 54
    :goto_1
    if-ne v4, v10, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    sget-object v10, Li5/a;->A:[I

    .line 58
    .line 59
    aget v11, v10, v4

    .line 60
    .line 61
    :goto_2
    move v10, v13

    .line 62
    :cond_3
    iget v4, v12, Li5/a$a$a;->c:I

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    iget-object v12, v0, Li5/a$a;->a:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    if-ge v5, v12, :cond_4

    .line 73
    .line 74
    iget-object v12, v0, Li5/a$a;->a:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    check-cast v12, Li5/a$a$a;

    .line 81
    .line 82
    iget v12, v12, Li5/a$a$a;->c:I

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move v12, v2

    .line 86
    :goto_3
    if-ne v4, v12, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    if-eq v6, v3, :cond_6

    .line 90
    .line 91
    if-nez v15, :cond_6

    .line 92
    .line 93
    new-instance v12, Landroid/text/style/UnderlineSpan;

    .line 94
    .line 95
    invoke-direct {v12}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v12, v6, v4, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 99
    .line 100
    .line 101
    move v6, v3

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    if-ne v6, v3, :cond_7

    .line 104
    .line 105
    if-eqz v15, :cond_7

    .line 106
    .line 107
    move v6, v4

    .line 108
    :cond_7
    :goto_4
    if-eq v7, v3, :cond_8

    .line 109
    .line 110
    if-nez v10, :cond_8

    .line 111
    .line 112
    new-instance v12, Landroid/text/style/StyleSpan;

    .line 113
    .line 114
    const/4 v13, 0x2

    .line 115
    invoke-direct {v12, v13}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v12, v7, v4, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 119
    .line 120
    .line 121
    move v7, v3

    .line 122
    goto :goto_5

    .line 123
    :cond_8
    if-ne v7, v3, :cond_9

    .line 124
    .line 125
    if-eqz v10, :cond_9

    .line 126
    .line 127
    move v7, v4

    .line 128
    :cond_9
    :goto_5
    if-eq v11, v9, :cond_0

    .line 129
    .line 130
    if-ne v9, v3, :cond_a

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_a
    new-instance v12, Landroid/text/style/ForegroundColorSpan;

    .line 134
    .line 135
    invoke-direct {v12, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v12, v8, v4, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 139
    .line 140
    .line 141
    :goto_6
    move v8, v4

    .line 142
    move v9, v11

    .line 143
    goto :goto_0

    .line 144
    :cond_b
    if-eq v6, v3, :cond_c

    .line 145
    .line 146
    if-eq v6, v2, :cond_c

    .line 147
    .line 148
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 149
    .line 150
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v4, v6, v2, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 154
    .line 155
    .line 156
    :cond_c
    if-eq v7, v3, :cond_d

    .line 157
    .line 158
    if-eq v7, v2, :cond_d

    .line 159
    .line 160
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 161
    .line 162
    const/4 v5, 0x2

    .line 163
    invoke-direct {v4, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v4, v7, v2, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 167
    .line 168
    .line 169
    :cond_d
    if-eq v8, v2, :cond_f

    .line 170
    .line 171
    if-ne v9, v3, :cond_e

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_e
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 175
    .line 176
    invoke-direct {v3, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3, v8, v2, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 180
    .line 181
    .line 182
    :cond_f
    :goto_7
    new-instance v2, Landroid/text/SpannableString;

    .line 183
    .line 184
    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    return-object v2
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
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Li5/a$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li5/a$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li5/a$a;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
