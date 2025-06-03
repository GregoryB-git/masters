.class public final Lo5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:J

.field public final e:J

.field public final f:Lo5/f;

.field public final g:[Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Lo5/d;

.field public final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLo5/f;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo5/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo5/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo5/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p10, p0, Lo5/d;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p7, p0, Lo5/d;->f:Lo5/f;

    .line 11
    .line 12
    iput-object p8, p0, Lo5/d;->g:[Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    iput-boolean p1, p0, Lo5/d;->c:Z

    .line 20
    .line 21
    iput-wide p3, p0, Lo5/d;->d:J

    .line 22
    .line 23
    iput-wide p5, p0, Lo5/d;->e:J

    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p9, p0, Lo5/d;->h:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p11, p0, Lo5/d;->j:Lo5/d;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lo5/d;->k:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lo5/d;->l:Ljava/util/HashMap;

    .line 45
    .line 46
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
.end method

.method public static a(Ljava/lang/String;)Lo5/d;
    .locals 13

    .line 1
    new-instance v12, Lo5/d;

    .line 2
    .line 3
    const-string v0, "\n"

    .line 4
    .line 5
    const-string v1, "\r\n"

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, " *\n *"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, " "

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v0, "[ \t\\x0B\u000c\r]+"

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v1, 0x0

    .line 44
    const-string v9, ""

    .line 45
    .line 46
    move-object v0, v12

    .line 47
    invoke-direct/range {v0 .. v11}, Lo5/d;-><init>(Ljava/lang/String;Ljava/lang/String;JJLo5/f;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo5/d;)V

    .line 48
    .line 49
    .line 50
    return-object v12
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
.end method

.method public static e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lh5/a$a;

    .line 8
    .line 9
    invoke-direct {v0}, Lh5/a$a;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {p1, p0, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lh5/a$a;

    .line 27
    .line 28
    iget-object p0, p0, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p0, Landroid/text/SpannableStringBuilder;

    .line 34
    .line 35
    return-object p0
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
.end method


# virtual methods
.method public final b(I)Lo5/d;
    .locals 1

    iget-object v0, p0, Lo5/d;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/d;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lo5/d;->m:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final d(Ljava/util/TreeSet;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeSet<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lo5/d;->a:Ljava/lang/String;

    const-string v1, "p"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lo5/d;->a:Ljava/lang/String;

    const-string v2, "div"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez p2, :cond_0

    if-nez v0, :cond_0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lo5/d;->i:Ljava/lang/String;

    if-eqz v1, :cond_2

    :cond_0
    iget-wide v1, p0, Lo5/d;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-wide v1, p0, Lo5/d;->e:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lo5/d;->m:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lo5/d;->m:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    iget-object v3, p0, Lo5/d;->m:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo5/d;

    if-nez p2, :cond_5

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v4, 0x1

    :goto_2
    invoke-virtual {v3, p1, v4}, Lo5/d;->d(Ljava/util/TreeSet;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final f(J)Z
    .locals 6

    iget-wide v0, p0, Lo5/d;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v4, p0, Lo5/d;->e:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_3

    :cond_0
    cmp-long v4, v0, p1

    if-gtz v4, :cond_1

    iget-wide v4, p0, Lo5/d;->e:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_3

    :cond_1
    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    iget-wide v2, p0, Lo5/d;->e:J

    cmp-long v2, p1, v2

    if-ltz v2, :cond_3

    :cond_2
    cmp-long v0, v0, p1

    if-gtz v0, :cond_4

    iget-wide v0, p0, Lo5/d;->e:J

    cmp-long p1, p1, v0

    if-gez p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(JLjava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Lo5/d;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lo5/d;->h:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lo5/d;->f(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo5/d;->a:Ljava/lang/String;

    const-string v1, "div"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo5/d;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance p1, Landroid/util/Pair;

    iget-object p2, p0, Lo5/d;->i:Ljava/lang/String;

    invoke-direct {p1, p3, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lo5/d;->c()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Lo5/d;->b(I)Lo5/d;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Lo5/d;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final h(JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/TreeMap;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p2}, Lo5/d;->f(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, v0, Lo5/d;->h:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object/from16 v9, p5

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v1, v0, Lo5/d;->h:Ljava/lang/String;

    .line 26
    .line 27
    move-object v9, v1

    .line 28
    :goto_0
    iget-object v1, v0, Lo5/d;->l:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_30

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v5, v0, Lo5/d;->k:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    iget-object v5, v0, Lo5/d;->k:Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/4 v5, 0x0

    .line 78
    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eq v5, v2, :cond_2d

    .line 89
    .line 90
    move-object/from16 v10, p6

    .line 91
    .line 92
    invoke-virtual {v10, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Lh5/a$a;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object/from16 v11, p4

    .line 102
    .line 103
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Lo5/e;

    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget v6, v6, Lo5/e;->j:I

    .line 113
    .line 114
    iget-object v7, v0, Lo5/d;->f:Lo5/f;

    .line 115
    .line 116
    iget-object v12, v0, Lo5/d;->g:[Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v7, v12, v8}, Lb/a0;->B(Lo5/f;[Ljava/lang/String;Ljava/util/Map;)Lo5/f;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v12, v4, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 123
    .line 124
    check-cast v12, Landroid/text/SpannableStringBuilder;

    .line 125
    .line 126
    if-nez v12, :cond_3

    .line 127
    .line 128
    new-instance v12, Landroid/text/SpannableStringBuilder;

    .line 129
    .line 130
    invoke-direct {v12}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object v12, v4, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 134
    .line 135
    :cond_3
    if-eqz v7, :cond_2e

    .line 136
    .line 137
    iget-object v13, v0, Lo5/d;->j:Lo5/d;

    .line 138
    .line 139
    iget v14, v7, Lo5/f;->h:I

    .line 140
    .line 141
    const/4 v3, -0x1

    .line 142
    if-ne v14, v3, :cond_4

    .line 143
    .line 144
    iget v15, v7, Lo5/f;->i:I

    .line 145
    .line 146
    if-ne v15, v3, :cond_4

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_4
    const/4 v15, 0x1

    .line 150
    if-ne v14, v15, :cond_5

    .line 151
    .line 152
    move v14, v15

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    const/4 v14, 0x0

    .line 155
    :goto_3
    iget v3, v7, Lo5/f;->i:I

    .line 156
    .line 157
    if-ne v3, v15, :cond_6

    .line 158
    .line 159
    const/4 v3, 0x2

    .line 160
    goto :goto_4

    .line 161
    :cond_6
    const/4 v3, 0x0

    .line 162
    :goto_4
    or-int/2addr v3, v14

    .line 163
    :goto_5
    const/4 v15, -0x1

    .line 164
    if-eq v3, v15, :cond_a

    .line 165
    .line 166
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 167
    .line 168
    iget v14, v7, Lo5/f;->h:I

    .line 169
    .line 170
    move-object/from16 v17, v1

    .line 171
    .line 172
    if-ne v14, v15, :cond_7

    .line 173
    .line 174
    iget v1, v7, Lo5/f;->i:I

    .line 175
    .line 176
    if-ne v1, v15, :cond_7

    .line 177
    .line 178
    const/4 v1, -0x1

    .line 179
    goto :goto_8

    .line 180
    :cond_7
    const/4 v1, 0x1

    .line 181
    if-ne v14, v1, :cond_8

    .line 182
    .line 183
    move v14, v1

    .line 184
    goto :goto_6

    .line 185
    :cond_8
    const/4 v14, 0x0

    .line 186
    :goto_6
    iget v15, v7, Lo5/f;->i:I

    .line 187
    .line 188
    if-ne v15, v1, :cond_9

    .line 189
    .line 190
    const/4 v1, 0x2

    .line 191
    goto :goto_7

    .line 192
    :cond_9
    const/4 v1, 0x0

    .line 193
    :goto_7
    or-int/2addr v1, v14

    .line 194
    :goto_8
    invoke-direct {v3, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 195
    .line 196
    .line 197
    const/16 v1, 0x21

    .line 198
    .line 199
    invoke-interface {v12, v3, v5, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 200
    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_a
    move-object/from16 v17, v1

    .line 204
    .line 205
    const/16 v1, 0x21

    .line 206
    .line 207
    :goto_9
    iget v3, v7, Lo5/f;->f:I

    .line 208
    .line 209
    const/4 v14, 0x1

    .line 210
    if-ne v3, v14, :cond_b

    .line 211
    .line 212
    move/from16 v16, v14

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_b
    const/16 v16, 0x0

    .line 216
    .line 217
    :goto_a
    if-eqz v16, :cond_c

    .line 218
    .line 219
    new-instance v3, Landroid/text/style/StrikethroughSpan;

    .line 220
    .line 221
    invoke-direct {v3}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v12, v3, v5, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 225
    .line 226
    .line 227
    :cond_c
    iget v3, v7, Lo5/f;->g:I

    .line 228
    .line 229
    if-ne v3, v14, :cond_d

    .line 230
    .line 231
    const/4 v3, 0x1

    .line 232
    goto :goto_b

    .line 233
    :cond_d
    const/4 v3, 0x0

    .line 234
    :goto_b
    if-eqz v3, :cond_e

    .line 235
    .line 236
    new-instance v3, Landroid/text/style/UnderlineSpan;

    .line 237
    .line 238
    invoke-direct {v3}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-interface {v12, v3, v5, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 242
    .line 243
    .line 244
    :cond_e
    iget-boolean v1, v7, Lo5/f;->c:Z

    .line 245
    .line 246
    if-eqz v1, :cond_10

    .line 247
    .line 248
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    .line 249
    .line 250
    iget-boolean v3, v7, Lo5/f;->c:Z

    .line 251
    .line 252
    if-eqz v3, :cond_f

    .line 253
    .line 254
    iget v3, v7, Lo5/f;->b:I

    .line 255
    .line 256
    invoke-direct {v1, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-static {v12, v1, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 260
    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 264
    .line 265
    const-string v2, "Font color has not been defined."

    .line 266
    .line 267
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v1

    .line 271
    :cond_10
    :goto_c
    iget-boolean v1, v7, Lo5/f;->e:Z

    .line 272
    .line 273
    if-eqz v1, :cond_12

    .line 274
    .line 275
    new-instance v1, Landroid/text/style/BackgroundColorSpan;

    .line 276
    .line 277
    iget-boolean v3, v7, Lo5/f;->e:Z

    .line 278
    .line 279
    if-eqz v3, :cond_11

    .line 280
    .line 281
    iget v3, v7, Lo5/f;->d:I

    .line 282
    .line 283
    invoke-direct {v1, v3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-static {v12, v1, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 287
    .line 288
    .line 289
    goto :goto_d

    .line 290
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 291
    .line 292
    const-string v2, "Background color has not been defined."

    .line 293
    .line 294
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v1

    .line 298
    :cond_12
    :goto_d
    iget-object v1, v7, Lo5/f;->a:Ljava/lang/String;

    .line 299
    .line 300
    if-eqz v1, :cond_13

    .line 301
    .line 302
    new-instance v1, Landroid/text/style/TypefaceSpan;

    .line 303
    .line 304
    iget-object v3, v7, Lo5/f;->a:Ljava/lang/String;

    .line 305
    .line 306
    invoke-direct {v1, v3}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v12, v1, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 310
    .line 311
    .line 312
    :cond_13
    iget-object v1, v7, Lo5/f;->r:Lo5/b;

    .line 313
    .line 314
    const/4 v3, 0x3

    .line 315
    if-eqz v1, :cond_18

    .line 316
    .line 317
    iget v14, v1, Lo5/b;->a:I

    .line 318
    .line 319
    const/4 v15, -0x1

    .line 320
    if-ne v14, v15, :cond_16

    .line 321
    .line 322
    const/4 v15, 0x2

    .line 323
    if-eq v6, v15, :cond_15

    .line 324
    .line 325
    const/4 v14, 0x1

    .line 326
    if-ne v6, v14, :cond_14

    .line 327
    .line 328
    goto :goto_e

    .line 329
    :cond_14
    const/4 v6, 0x1

    .line 330
    goto :goto_f

    .line 331
    :cond_15
    :goto_e
    move v6, v3

    .line 332
    :goto_f
    move v14, v6

    .line 333
    const/4 v6, 0x1

    .line 334
    goto :goto_10

    .line 335
    :cond_16
    iget v6, v1, Lo5/b;->b:I

    .line 336
    .line 337
    :goto_10
    iget v1, v1, Lo5/b;->c:I

    .line 338
    .line 339
    const/4 v15, -0x2

    .line 340
    if-ne v1, v15, :cond_17

    .line 341
    .line 342
    const/4 v1, 0x1

    .line 343
    :cond_17
    new-instance v15, Ll5/d;

    .line 344
    .line 345
    invoke-direct {v15, v14, v6, v1}, Ll5/d;-><init>(III)V

    .line 346
    .line 347
    .line 348
    invoke-static {v12, v15, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 349
    .line 350
    .line 351
    :cond_18
    iget v1, v7, Lo5/f;->m:I

    .line 352
    .line 353
    const/4 v6, 0x2

    .line 354
    if-eq v1, v6, :cond_1a

    .line 355
    .line 356
    if-eq v1, v3, :cond_19

    .line 357
    .line 358
    const/4 v6, 0x4

    .line 359
    if-eq v1, v6, :cond_19

    .line 360
    .line 361
    goto :goto_15

    .line 362
    :cond_19
    new-instance v1, Lo5/a;

    .line 363
    .line 364
    invoke-direct {v1}, Lo5/a;-><init>()V

    .line 365
    .line 366
    .line 367
    const/4 v6, 0x0

    .line 368
    goto/16 :goto_17

    .line 369
    .line 370
    :cond_1a
    :goto_11
    if-eqz v13, :cond_1c

    .line 371
    .line 372
    iget-object v6, v13, Lo5/d;->f:Lo5/f;

    .line 373
    .line 374
    iget-object v14, v13, Lo5/d;->g:[Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v6, v14, v8}, Lb/a0;->B(Lo5/f;[Ljava/lang/String;Ljava/util/Map;)Lo5/f;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    if-eqz v6, :cond_1b

    .line 381
    .line 382
    iget v6, v6, Lo5/f;->m:I

    .line 383
    .line 384
    const/4 v14, 0x1

    .line 385
    if-ne v6, v14, :cond_1b

    .line 386
    .line 387
    goto :goto_12

    .line 388
    :cond_1b
    iget-object v13, v13, Lo5/d;->j:Lo5/d;

    .line 389
    .line 390
    goto :goto_11

    .line 391
    :cond_1c
    const/4 v13, 0x0

    .line 392
    :goto_12
    if-nez v13, :cond_1d

    .line 393
    .line 394
    goto :goto_15

    .line 395
    :cond_1d
    new-instance v6, Ljava/util/ArrayDeque;

    .line 396
    .line 397
    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v6, v13}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_1e
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v14

    .line 407
    if-nez v14, :cond_20

    .line 408
    .line 409
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v14

    .line 413
    check-cast v14, Lo5/d;

    .line 414
    .line 415
    iget-object v15, v14, Lo5/d;->f:Lo5/f;

    .line 416
    .line 417
    iget-object v1, v14, Lo5/d;->g:[Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v15, v1, v8}, Lb/a0;->B(Lo5/f;[Ljava/lang/String;Ljava/util/Map;)Lo5/f;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-eqz v1, :cond_1f

    .line 424
    .line 425
    iget v1, v1, Lo5/f;->m:I

    .line 426
    .line 427
    if-ne v1, v3, :cond_1f

    .line 428
    .line 429
    move-object v1, v14

    .line 430
    goto :goto_14

    .line 431
    :cond_1f
    invoke-virtual {v14}, Lo5/d;->c()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    const/4 v15, -0x1

    .line 436
    add-int/2addr v1, v15

    .line 437
    :goto_13
    if-ltz v1, :cond_1e

    .line 438
    .line 439
    invoke-virtual {v14, v1}, Lo5/d;->b(I)Lo5/d;

    .line 440
    .line 441
    .line 442
    move-result-object v15

    .line 443
    invoke-virtual {v6, v15}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    add-int/lit8 v1, v1, -0x1

    .line 447
    .line 448
    goto :goto_13

    .line 449
    :cond_20
    const/4 v1, 0x0

    .line 450
    :goto_14
    if-nez v1, :cond_21

    .line 451
    .line 452
    :goto_15
    const/4 v6, 0x0

    .line 453
    goto :goto_18

    .line 454
    :cond_21
    invoke-virtual {v1}, Lo5/d;->c()I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    const/4 v14, 0x1

    .line 459
    if-ne v6, v14, :cond_24

    .line 460
    .line 461
    const/4 v6, 0x0

    .line 462
    invoke-virtual {v1, v6}, Lo5/d;->b(I)Lo5/d;

    .line 463
    .line 464
    .line 465
    move-result-object v14

    .line 466
    iget-object v14, v14, Lo5/d;->b:Ljava/lang/String;

    .line 467
    .line 468
    if-eqz v14, :cond_25

    .line 469
    .line 470
    invoke-virtual {v1, v6}, Lo5/d;->b(I)Lo5/d;

    .line 471
    .line 472
    .line 473
    move-result-object v14

    .line 474
    iget-object v14, v14, Lo5/d;->b:Ljava/lang/String;

    .line 475
    .line 476
    sget v15, Lv5/e0;->a:I

    .line 477
    .line 478
    iget-object v15, v1, Lo5/d;->f:Lo5/f;

    .line 479
    .line 480
    iget-object v1, v1, Lo5/d;->g:[Ljava/lang/String;

    .line 481
    .line 482
    invoke-static {v15, v1, v8}, Lb/a0;->B(Lo5/f;[Ljava/lang/String;Ljava/util/Map;)Lo5/f;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    if-eqz v1, :cond_22

    .line 487
    .line 488
    iget v15, v1, Lo5/f;->n:I

    .line 489
    .line 490
    const/4 v1, -0x1

    .line 491
    goto :goto_16

    .line 492
    :cond_22
    const/4 v1, -0x1

    .line 493
    const/4 v15, -0x1

    .line 494
    :goto_16
    if-ne v15, v1, :cond_23

    .line 495
    .line 496
    iget-object v1, v13, Lo5/d;->f:Lo5/f;

    .line 497
    .line 498
    iget-object v13, v13, Lo5/d;->g:[Ljava/lang/String;

    .line 499
    .line 500
    invoke-static {v1, v13, v8}, Lb/a0;->B(Lo5/f;[Ljava/lang/String;Ljava/util/Map;)Lo5/f;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    if-eqz v1, :cond_23

    .line 505
    .line 506
    iget v15, v1, Lo5/f;->n:I

    .line 507
    .line 508
    :cond_23
    new-instance v1, Ll5/c;

    .line 509
    .line 510
    invoke-direct {v1, v14, v15}, Ll5/c;-><init>(Ljava/lang/String;I)V

    .line 511
    .line 512
    .line 513
    :goto_17
    const/16 v13, 0x21

    .line 514
    .line 515
    invoke-interface {v12, v1, v5, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 516
    .line 517
    .line 518
    goto :goto_18

    .line 519
    :cond_24
    const/4 v6, 0x0

    .line 520
    :cond_25
    const-string v1, "TtmlRenderUtil"

    .line 521
    .line 522
    const-string v13, "Skipping rubyText node without exactly one text child."

    .line 523
    .line 524
    invoke-static {v1, v13}, Lv5/m;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    :goto_18
    iget v1, v7, Lo5/f;->q:I

    .line 528
    .line 529
    const/4 v13, 0x1

    .line 530
    if-ne v1, v13, :cond_26

    .line 531
    .line 532
    move v6, v13

    .line 533
    :cond_26
    if-eqz v6, :cond_27

    .line 534
    .line 535
    new-instance v1, Ll5/a;

    .line 536
    .line 537
    invoke-direct {v1}, Ll5/a;-><init>()V

    .line 538
    .line 539
    .line 540
    invoke-static {v12, v1, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 541
    .line 542
    .line 543
    :cond_27
    iget v1, v7, Lo5/f;->j:I

    .line 544
    .line 545
    const/high16 v6, 0x42c80000    # 100.0f

    .line 546
    .line 547
    if-eq v1, v13, :cond_2a

    .line 548
    .line 549
    const/4 v13, 0x2

    .line 550
    if-eq v1, v13, :cond_29

    .line 551
    .line 552
    if-eq v1, v3, :cond_28

    .line 553
    .line 554
    goto :goto_1a

    .line 555
    :cond_28
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    .line 556
    .line 557
    iget v3, v7, Lo5/f;->k:F

    .line 558
    .line 559
    div-float/2addr v3, v6

    .line 560
    invoke-direct {v1, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 561
    .line 562
    .line 563
    goto :goto_19

    .line 564
    :cond_29
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    .line 565
    .line 566
    iget v3, v7, Lo5/f;->k:F

    .line 567
    .line 568
    invoke-direct {v1, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 569
    .line 570
    .line 571
    goto :goto_19

    .line 572
    :cond_2a
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 573
    .line 574
    iget v3, v7, Lo5/f;->k:F

    .line 575
    .line 576
    float-to-int v3, v3

    .line 577
    const/4 v13, 0x1

    .line 578
    invoke-direct {v1, v3, v13}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 579
    .line 580
    .line 581
    :goto_19
    invoke-static {v12, v1, v5, v2}, Lx6/b;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 582
    .line 583
    .line 584
    :goto_1a
    iget-object v1, v0, Lo5/d;->a:Ljava/lang/String;

    .line 585
    .line 586
    const-string v2, "p"

    .line 587
    .line 588
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-eqz v1, :cond_2f

    .line 593
    .line 594
    iget v1, v7, Lo5/f;->s:F

    .line 595
    .line 596
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 597
    .line 598
    .line 599
    cmpl-float v2, v1, v2

    .line 600
    .line 601
    if-eqz v2, :cond_2b

    .line 602
    .line 603
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 604
    .line 605
    mul-float/2addr v1, v2

    .line 606
    div-float/2addr v1, v6

    .line 607
    iput v1, v4, Lh5/a$a;->q:F

    .line 608
    .line 609
    :cond_2b
    iget-object v1, v7, Lo5/f;->o:Landroid/text/Layout$Alignment;

    .line 610
    .line 611
    if-eqz v1, :cond_2c

    .line 612
    .line 613
    iput-object v1, v4, Lh5/a$a;->c:Landroid/text/Layout$Alignment;

    .line 614
    .line 615
    :cond_2c
    iget-object v1, v7, Lo5/f;->p:Landroid/text/Layout$Alignment;

    .line 616
    .line 617
    if-eqz v1, :cond_2f

    .line 618
    .line 619
    iput-object v1, v4, Lh5/a$a;->d:Landroid/text/Layout$Alignment;

    .line 620
    .line 621
    goto :goto_1b

    .line 622
    :cond_2d
    move-object/from16 v11, p4

    .line 623
    .line 624
    move-object/from16 v10, p6

    .line 625
    .line 626
    :cond_2e
    move-object/from16 v17, v1

    .line 627
    .line 628
    :cond_2f
    :goto_1b
    move-object/from16 v1, v17

    .line 629
    .line 630
    goto/16 :goto_1

    .line 631
    .line 632
    :cond_30
    move-object/from16 v11, p4

    .line 633
    .line 634
    move-object/from16 v10, p6

    .line 635
    .line 636
    const/4 v6, 0x0

    .line 637
    move v12, v6

    .line 638
    :goto_1c
    invoke-virtual/range {p0 .. p0}, Lo5/d;->c()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    if-ge v12, v1, :cond_31

    .line 643
    .line 644
    invoke-virtual {v0, v12}, Lo5/d;->b(I)Lo5/d;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    move-wide/from16 v2, p1

    .line 649
    .line 650
    move-object/from16 v4, p3

    .line 651
    .line 652
    move-object/from16 v5, p4

    .line 653
    .line 654
    move-object v6, v9

    .line 655
    move-object/from16 v7, p6

    .line 656
    .line 657
    invoke-virtual/range {v1 .. v7}, Lo5/d;->h(JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 658
    .line 659
    .line 660
    add-int/lit8 v12, v12, 0x1

    .line 661
    .line 662
    goto :goto_1c

    .line 663
    :cond_31
    return-void
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
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
.end method

.method public final i(JZLjava/lang/String;Ljava/util/TreeMap;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lo5/d;->k:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo5/d;->l:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lo5/d;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "metadata"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lo5/d;->h:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, ""

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p4, p0, Lo5/d;->h:Ljava/lang/String;

    .line 34
    .line 35
    :goto_0
    iget-boolean v0, p0, Lo5/d;->c:Z

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-static {p4, p5}, Lo5/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p2, p0, Lo5/d;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 51
    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Lo5/d;->a:Ljava/lang/String;

    .line 56
    .line 57
    const-string v1, "br"

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/16 v6, 0xa

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    invoke-static {p4, p5}, Lo5/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v6}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 74
    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_3
    invoke-virtual {p0, p1, p2}, Lo5/d;->f(J)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_a

    .line 83
    .line 84
    invoke-virtual {p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/util/Map$Entry;

    .line 103
    .line 104
    iget-object v2, p0, Lo5/d;->k:Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ljava/lang/String;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lh5/a$a;

    .line 117
    .line 118
    iget-object v1, v1, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    iget-object v0, p0, Lo5/d;->a:Ljava/lang/String;

    .line 136
    .line 137
    const-string v1, "p"

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    const/4 v8, 0x0

    .line 144
    move v9, v8

    .line 145
    :goto_2
    invoke-virtual {p0}, Lo5/d;->c()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-ge v9, v0, :cond_7

    .line 150
    .line 151
    invoke-virtual {p0, v9}, Lo5/d;->b(I)Lo5/d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-nez p3, :cond_6

    .line 156
    .line 157
    if-eqz v7, :cond_5

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    move v3, v8

    .line 161
    goto :goto_4

    .line 162
    :cond_6
    :goto_3
    const/4 v1, 0x1

    .line 163
    move v3, v1

    .line 164
    :goto_4
    move-wide v1, p1

    .line 165
    move-object v4, p4

    .line 166
    move-object v5, p5

    .line 167
    invoke-virtual/range {v0 .. v5}, Lo5/d;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v9, v9, 0x1

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    if-eqz v7, :cond_9

    .line 174
    .line 175
    invoke-static {p4, p5}, Lo5/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    :goto_5
    add-int/lit8 p2, p2, -0x1

    .line 184
    .line 185
    if-ltz p2, :cond_8

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 188
    .line 189
    .line 190
    move-result p3

    .line 191
    const/16 p4, 0x20

    .line 192
    .line 193
    if-ne p3, p4, :cond_8

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_8
    if-ltz p2, :cond_9

    .line 197
    .line 198
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eq p2, v6, :cond_9

    .line 203
    .line 204
    invoke-virtual {p1, v6}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_9
    invoke-virtual {p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    if-eqz p2, :cond_a

    .line 220
    .line 221
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    check-cast p2, Ljava/util/Map$Entry;

    .line 226
    .line 227
    iget-object p3, p0, Lo5/d;->l:Ljava/util/HashMap;

    .line 228
    .line 229
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p4

    .line 233
    check-cast p4, Ljava/lang/String;

    .line 234
    .line 235
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    check-cast p2, Lh5/a$a;

    .line 240
    .line 241
    iget-object p2, p2, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-virtual {p3, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_a
    :goto_7
    return-void
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
