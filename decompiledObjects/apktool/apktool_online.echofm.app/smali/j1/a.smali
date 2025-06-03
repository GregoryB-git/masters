.class public final Lj1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/t;


# instance fields
.field public final a:Lg0/z;

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:F

.field public final g:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/z;

    .line 5
    .line 6
    invoke-direct {v0}, Lg0/z;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj1/a;->a:Lg0/z;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0x3f59999a    # 0.85f

    .line 16
    .line 17
    .line 18
    const-string v2, "sans-serif"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v0, v4, :cond_4

    .line 23
    .line 24
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    const/16 v5, 0x30

    .line 32
    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    const/16 v5, 0x35

    .line 43
    .line 44
    if-ne v0, v5, :cond_4

    .line 45
    .line 46
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [B

    .line 51
    .line 52
    const/16 v0, 0x18

    .line 53
    .line 54
    aget-byte v5, p1, v0

    .line 55
    .line 56
    iput v5, p0, Lj1/a;->c:I

    .line 57
    .line 58
    const/16 v5, 0x1a

    .line 59
    .line 60
    aget-byte v5, p1, v5

    .line 61
    .line 62
    and-int/lit16 v5, v5, 0xff

    .line 63
    .line 64
    shl-int/lit8 v0, v5, 0x18

    .line 65
    .line 66
    const/16 v5, 0x1b

    .line 67
    .line 68
    aget-byte v5, p1, v5

    .line 69
    .line 70
    and-int/lit16 v5, v5, 0xff

    .line 71
    .line 72
    shl-int/lit8 v5, v5, 0x10

    .line 73
    .line 74
    or-int/2addr v0, v5

    .line 75
    const/16 v5, 0x1c

    .line 76
    .line 77
    aget-byte v5, p1, v5

    .line 78
    .line 79
    and-int/lit16 v5, v5, 0xff

    .line 80
    .line 81
    shl-int/lit8 v5, v5, 0x8

    .line 82
    .line 83
    or-int/2addr v0, v5

    .line 84
    const/16 v5, 0x1d

    .line 85
    .line 86
    aget-byte v5, p1, v5

    .line 87
    .line 88
    and-int/lit16 v5, v5, 0xff

    .line 89
    .line 90
    or-int/2addr v0, v5

    .line 91
    iput v0, p0, Lj1/a;->d:I

    .line 92
    .line 93
    array-length v0, p1

    .line 94
    const/16 v5, 0x2b

    .line 95
    .line 96
    sub-int/2addr v0, v5

    .line 97
    invoke-static {p1, v5, v0}, Lg0/M;->I([BII)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v5, "Serif"

    .line 102
    .line 103
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    const-string v2, "serif"

    .line 110
    .line 111
    :cond_1
    iput-object v2, p0, Lj1/a;->e:Ljava/lang/String;

    .line 112
    .line 113
    const/16 v0, 0x19

    .line 114
    .line 115
    aget-byte v0, p1, v0

    .line 116
    .line 117
    mul-int/lit8 v0, v0, 0x14

    .line 118
    .line 119
    iput v0, p0, Lj1/a;->g:I

    .line 120
    .line 121
    aget-byte v2, p1, v3

    .line 122
    .line 123
    and-int/lit8 v2, v2, 0x20

    .line 124
    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    move v3, v4

    .line 128
    :cond_2
    iput-boolean v3, p0, Lj1/a;->b:Z

    .line 129
    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    const/16 v1, 0xa

    .line 133
    .line 134
    aget-byte v1, p1, v1

    .line 135
    .line 136
    and-int/lit16 v1, v1, 0xff

    .line 137
    .line 138
    shl-int/lit8 v1, v1, 0x8

    .line 139
    .line 140
    const/16 v2, 0xb

    .line 141
    .line 142
    aget-byte p1, p1, v2

    .line 143
    .line 144
    and-int/lit16 p1, p1, 0xff

    .line 145
    .line 146
    or-int/2addr p1, v1

    .line 147
    int-to-float p1, p1

    .line 148
    int-to-float v0, v0

    .line 149
    div-float/2addr p1, v0

    .line 150
    const/4 v0, 0x0

    .line 151
    const v1, 0x3f733333    # 0.95f

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v0, v1}, Lg0/M;->o(FFF)F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput p1, p0, Lj1/a;->f:F

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_3
    iput v1, p0, Lj1/a;->f:F

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_4
    iput v3, p0, Lj1/a;->c:I

    .line 165
    .line 166
    const/4 p1, -0x1

    .line 167
    iput p1, p0, Lj1/a;->d:I

    .line 168
    .line 169
    iput-object v2, p0, Lj1/a;->e:Ljava/lang/String;

    .line 170
    .line 171
    iput-boolean v3, p0, Lj1/a;->b:Z

    .line 172
    .line 173
    iput v1, p0, Lj1/a;->f:F

    .line 174
    .line 175
    iput p1, p0, Lj1/a;->g:I

    .line 176
    .line 177
    :goto_0
    return-void
.end method

.method public static f(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 0

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    and-int/lit16 p2, p1, 0xff

    .line 4
    .line 5
    shl-int/lit8 p2, p2, 0x18

    .line 6
    .line 7
    ushr-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    or-int/2addr p1, p2

    .line 10
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 13
    .line 14
    .line 15
    or-int/lit8 p1, p5, 0x21

    .line 16
    .line 17
    invoke-virtual {p0, p2, p3, p4, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static g(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 5

    .line 1
    if-eq p1, p2, :cond_7

    .line 2
    .line 3
    or-int/lit8 p2, p5, 0x21

    .line 4
    .line 5
    and-int/lit8 p5, p1, 0x1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    move p5, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p5, v0

    .line 14
    :goto_0
    and-int/lit8 v2, p1, 0x2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v2, v0

    .line 21
    :goto_1
    if-eqz p5, :cond_3

    .line 22
    .line 23
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_2
    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    invoke-direct {v3, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    if-eqz v2, :cond_4

    .line 40
    .line 41
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    :goto_3
    and-int/lit8 p1, p1, 0x4

    .line 49
    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_5
    move v1, v0

    .line 54
    :goto_4
    if-eqz v1, :cond_6

    .line 55
    .line 56
    new-instance p1, Landroid/text/style/UnderlineSpan;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 62
    .line 63
    .line 64
    :cond_6
    if-nez v1, :cond_7

    .line 65
    .line 66
    if-nez p5, :cond_7

    .line 67
    .line 68
    if-nez v2, :cond_7

    .line 69
    .line 70
    new-instance p1, Landroid/text/style/StyleSpan;

    .line 71
    .line 72
    invoke-direct {p1, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 76
    .line 77
    .line 78
    :cond_7
    return-void
.end method

.method public static h(Landroid/text/SpannableStringBuilder;Ljava/lang/String;II)V
    .locals 1

    .line 1
    const-string v0, "sans-serif"

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/text/style/TypefaceSpan;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const p1, 0xff0021

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p2, p3, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static i(Lg0/z;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lg0/z;->M()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string p0, ""

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0}, Lg0/z;->O()Ljava/nio/charset/Charset;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v3, v1

    .line 36
    sub-int/2addr v0, v3

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    sget-object v2, LW2/e;->c:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0, v0, v2}, Lg0/z;->E(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public synthetic a([BII)Lc1/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lc1/s;->a(Lc1/t;[BII)Lc1/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public synthetic b()V
    .locals 0

    .line 1
    invoke-static {p0}, Lc1/s;->b(Lc1/t;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c([BIILc1/t$b;Lg0/g;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    iget-object v3, v0, Lj1/a;->a:Lg0/z;

    .line 8
    .line 9
    add-int v4, v1, p3

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-virtual {v3, v5, v4}, Lg0/z;->R([BI)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lj1/a;->a:Lg0/z;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, Lg0/z;->T(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lj1/a;->a:Lg0/z;

    .line 22
    .line 23
    invoke-static {v1}, Lj1/a;->i(Lg0/z;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    new-instance v1, Lc1/e;

    .line 34
    .line 35
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v4, v1

    .line 50
    invoke-direct/range {v4 .. v9}, Lc1/e;-><init>(Ljava/util/List;JJ)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v1}, Lg0/g;->accept(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget v11, v0, Lj1/a;->c:I

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    const/high16 v15, 0xff0000

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v13, 0x0

    .line 72
    move-object v10, v3

    .line 73
    invoke-static/range {v10 .. v15}, Lj1/a;->g(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 74
    .line 75
    .line 76
    iget v11, v0, Lj1/a;->d:I

    .line 77
    .line 78
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    const/4 v12, -0x1

    .line 83
    invoke-static/range {v10 .. v15}, Lj1/a;->f(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lj1/a;->e:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    const/4 v5, 0x0

    .line 93
    invoke-static {v3, v1, v5, v4}, Lj1/a;->h(Landroid/text/SpannableStringBuilder;Ljava/lang/String;II)V

    .line 94
    .line 95
    .line 96
    iget v1, v0, Lj1/a;->f:F

    .line 97
    .line 98
    :goto_0
    iget-object v4, v0, Lj1/a;->a:Lg0/z;

    .line 99
    .line 100
    invoke-virtual {v4}, Lg0/z;->a()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    const/16 v6, 0x8

    .line 105
    .line 106
    if-lt v4, v6, :cond_5

    .line 107
    .line 108
    iget-object v4, v0, Lj1/a;->a:Lg0/z;

    .line 109
    .line 110
    invoke-virtual {v4}, Lg0/z;->f()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    iget-object v6, v0, Lj1/a;->a:Lg0/z;

    .line 115
    .line 116
    invoke-virtual {v6}, Lg0/z;->p()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    iget-object v7, v0, Lj1/a;->a:Lg0/z;

    .line 121
    .line 122
    invoke-virtual {v7}, Lg0/z;->p()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    const v8, 0x7374796c

    .line 127
    .line 128
    .line 129
    const/4 v9, 0x2

    .line 130
    const/4 v10, 0x1

    .line 131
    if-ne v7, v8, :cond_2

    .line 132
    .line 133
    iget-object v7, v0, Lj1/a;->a:Lg0/z;

    .line 134
    .line 135
    invoke-virtual {v7}, Lg0/z;->a()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-lt v7, v9, :cond_1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    move v10, v5

    .line 143
    :goto_1
    invoke-static {v10}, Lg0/a;->a(Z)V

    .line 144
    .line 145
    .line 146
    iget-object v7, v0, Lj1/a;->a:Lg0/z;

    .line 147
    .line 148
    invoke-virtual {v7}, Lg0/z;->M()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    move v8, v5

    .line 153
    :goto_2
    if-ge v8, v7, :cond_4

    .line 154
    .line 155
    iget-object v9, v0, Lj1/a;->a:Lg0/z;

    .line 156
    .line 157
    invoke-virtual {v0, v9, v3}, Lj1/a;->e(Lg0/z;Landroid/text/SpannableStringBuilder;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_2
    const v8, 0x74626f78

    .line 164
    .line 165
    .line 166
    if-ne v7, v8, :cond_4

    .line 167
    .line 168
    iget-boolean v7, v0, Lj1/a;->b:Z

    .line 169
    .line 170
    if-eqz v7, :cond_4

    .line 171
    .line 172
    iget-object v1, v0, Lj1/a;->a:Lg0/z;

    .line 173
    .line 174
    invoke-virtual {v1}, Lg0/z;->a()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-lt v1, v9, :cond_3

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_3
    move v10, v5

    .line 182
    :goto_3
    invoke-static {v10}, Lg0/a;->a(Z)V

    .line 183
    .line 184
    .line 185
    iget-object v1, v0, Lj1/a;->a:Lg0/z;

    .line 186
    .line 187
    invoke-virtual {v1}, Lg0/z;->M()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    int-to-float v1, v1

    .line 192
    iget v7, v0, Lj1/a;->g:I

    .line 193
    .line 194
    int-to-float v7, v7

    .line 195
    div-float/2addr v1, v7

    .line 196
    const/4 v7, 0x0

    .line 197
    const v8, 0x3f733333    # 0.95f

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v7, v8}, Lg0/M;->o(FFF)F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    :cond_4
    iget-object v7, v0, Lj1/a;->a:Lg0/z;

    .line 205
    .line 206
    add-int/2addr v4, v6

    .line 207
    invoke-virtual {v7, v4}, Lg0/z;->T(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_5
    new-instance v4, Lf0/a$b;

    .line 212
    .line 213
    invoke-direct {v4}, Lf0/a$b;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v3}, Lf0/a$b;->o(Ljava/lang/CharSequence;)Lf0/a$b;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v3, v1, v5}, Lf0/a$b;->h(FI)Lf0/a$b;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v1, v5}, Lf0/a$b;->i(I)Lf0/a$b;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Lf0/a$b;->a()Lf0/a;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v9, Lc1/e;

    .line 233
    .line 234
    invoke-static {v1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    move-object v3, v9

    .line 249
    invoke-direct/range {v3 .. v8}, Lc1/e;-><init>(Ljava/util/List;JJ)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v2, v9}, Lg0/g;->accept(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final e(Lg0/z;Landroid/text/SpannableStringBuilder;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-virtual {p1, v3}, Lg0/z;->U(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p1, v2}, Lg0/z;->U(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lg0/z;->p()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const-string v3, ")."

    .line 44
    .line 45
    const-string v5, "Tx3gParser"

    .line 46
    .line 47
    if-le v1, v2, :cond_1

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v6, "Truncating styl end ("

    .line 55
    .line 56
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ") to cueText.length() ("

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v5, v1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :cond_1
    if-lt v0, v1, :cond_2

    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string p2, "Ignoring styl with start ("

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p2, ") >= end ("

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v5, p1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget v5, p0, Lj1/a;->c:I

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    move-object v3, p2

    .line 126
    move v6, v0

    .line 127
    move v7, v1

    .line 128
    invoke-static/range {v3 .. v8}, Lj1/a;->g(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 129
    .line 130
    .line 131
    iget v5, p0, Lj1/a;->d:I

    .line 132
    .line 133
    move v4, p1

    .line 134
    invoke-static/range {v3 .. v8}, Lj1/a;->f(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 135
    .line 136
    .line 137
    return-void
.end method
