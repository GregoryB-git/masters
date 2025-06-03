.class public final Lt8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/k$a$a;,
        Lt8/k$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TA;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TB;TC;>;"
        }
    .end annotation
.end field

.field public final c:Lt8/c$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/c$a$a<",
            "TA;TB;>;"
        }
    .end annotation
.end field

.field public d:Lt8/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/j<",
            "TA;TC;>;"
        }
    .end annotation
.end field

.field public e:Lt8/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/j<",
            "TA;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 1

    sget-object v0, Lt8/c$a;->a:Le0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/k$a;->a:Ljava/util/List;

    iput-object p2, p0, Lt8/k$a;->b:Ljava/util/Map;

    iput-object v0, p0, Lt8/k$a;->c:Lt8/c$a$a;

    return-void
.end method

.method public static b(Ljava/util/List;Ljava/util/Map;Ljava/util/Comparator;)Lt8/k;
    .locals 10

    .line 1
    sget-object v0, Lt8/h$a;->b:Lt8/h$a;

    .line 2
    .line 3
    new-instance v1, Lt8/k$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lt8/k$a;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lt8/k$a$a;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {p1, v2}, Lt8/k$a$a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget v2, p1, Lt8/k$a$a;->b:I

    .line 21
    .line 22
    add-int/lit8 v2, v2, -0x1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    :goto_0
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-ltz v2, :cond_0

    .line 31
    .line 32
    move v5, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v5, v4

    .line 35
    :goto_1
    if-eqz v5, :cond_3

    .line 36
    .line 37
    iget-wide v5, p1, Lt8/k$a$a;->a:J

    .line 38
    .line 39
    shl-int v7, v3, v2

    .line 40
    .line 41
    int-to-long v7, v7

    .line 42
    and-long/2addr v5, v7

    .line 43
    new-instance v7, Lt8/k$a$b;

    .line 44
    .line 45
    invoke-direct {v7}, Lt8/k$a$b;-><init>()V

    .line 46
    .line 47
    .line 48
    const-wide/16 v8, 0x0

    .line 49
    .line 50
    cmp-long v5, v5, v8

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move v3, v4

    .line 56
    :goto_2
    iput-boolean v3, v7, Lt8/k$a$b;->a:Z

    .line 57
    .line 58
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 59
    .line 60
    int-to-double v5, v2

    .line 61
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    double-to-int v3, v3

    .line 66
    iput v3, v7, Lt8/k$a$b;->b:I

    .line 67
    .line 68
    add-int/lit8 v2, v2, -0x1

    .line 69
    .line 70
    sub-int/2addr p0, v3

    .line 71
    iget-boolean v4, v7, Lt8/k$a$b;->a:Z

    .line 72
    .line 73
    invoke-virtual {v1, v0, v3, p0}, Lt8/k$a;->c(Lt8/h$a;II)V

    .line 74
    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget v3, v7, Lt8/k$a$b;->b:I

    .line 80
    .line 81
    sub-int/2addr p0, v3

    .line 82
    sget-object v4, Lt8/h$a;->a:Lt8/h$a;

    .line 83
    .line 84
    invoke-virtual {v1, v4, v3, p0}, Lt8/k$a;->c(Lt8/h$a;II)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    new-instance p0, Lt8/k;

    .line 89
    .line 90
    iget-object p1, v1, Lt8/k$a;->d:Lt8/j;

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    sget-object p1, Lt8/g;->a:Lt8/g;

    .line 95
    .line 96
    :cond_4
    invoke-direct {p0, p1, p2}, Lt8/k;-><init>(Lt8/h;Ljava/util/Comparator;)V

    .line 97
    .line 98
    .line 99
    return-object p0
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


# virtual methods
.method public final a(II)Lt8/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lt8/h<",
            "TA;TC;>;"
        }
    .end annotation

    if-nez p2, :cond_0

    sget-object p1, Lt8/g;->a:Lt8/g;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lt8/k$a;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Lt8/f;

    invoke-virtual {p0, p1}, Lt8/k$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1, v1}, Lt8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt8/h;Lt8/h;)V

    return-object p2

    :cond_1
    div-int/lit8 p2, p2, 0x2

    add-int v0, p1, p2

    invoke-virtual {p0, p1, p2}, Lt8/k$a;->a(II)Lt8/h;

    move-result-object p1

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1, p2}, Lt8/k$a;->a(II)Lt8/h;

    move-result-object p2

    iget-object v1, p0, Lt8/k$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lt8/f;

    invoke-virtual {p0, v0}, Lt8/k$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v0, v2, p1, p2}, Lt8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt8/h;Lt8/h;)V

    return-object v1
.end method

.method public final c(Lt8/h$a;II)V
    .locals 2

    add-int/lit8 v0, p3, 0x1

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p0, v0, p2}, Lt8/k$a;->a(II)Lt8/h;

    move-result-object p2

    iget-object v0, p0, Lt8/k$a;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lt8/h$a;->a:Lt8/h$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    new-instance p1, Lt8/i;

    invoke-virtual {p0, p3}, Lt8/k$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, p3, v0, v1, p2}, Lt8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt8/h;Lt8/h;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lt8/f;

    invoke-virtual {p0, p3}, Lt8/k$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, p3, v0, v1, p2}, Lt8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt8/h;Lt8/h;)V

    :goto_0
    iget-object p2, p0, Lt8/k$a;->d:Lt8/j;

    if-nez p2, :cond_1

    iput-object p1, p0, Lt8/k$a;->d:Lt8/j;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lt8/k$a;->e:Lt8/j;

    invoke-virtual {p2, p1}, Lt8/j;->r(Lt8/j;)V

    :goto_1
    iput-object p1, p0, Lt8/k$a;->e:Lt8/j;

    return-void
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TC;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k$a;->b:Ljava/util/Map;

    iget-object v1, p0, Lt8/k$a;->c:Lt8/c$a$a;

    check-cast v1, Le0/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
