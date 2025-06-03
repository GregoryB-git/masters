.class public Lsc/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lsc/y;",
        ":",
        "Ljava/lang/Comparable<",
        "-TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _size:I

.field public a:[Lsc/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lsc/x;

    const-string v1, "_size"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lsc/x;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnc/y0$c;)V
    .locals 4

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lnc/y0$d;

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lnc/y0$c;->f(Lnc/y0$d;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lsc/x;->a:[Lsc/y;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    new-array v0, v0, [Lsc/y;

    .line 13
    .line 14
    iput-object v0, p0, Lsc/x;->a:[Lsc/y;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    array-length v2, v0

    .line 22
    if-lt v1, v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    mul-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "copyOf(this, newSize)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v0, [Lsc/y;

    .line 40
    .line 41
    iput-object v0, p0, Lsc/x;->a:[Lsc/y;

    .line 42
    .line 43
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 v2, v1, 0x1

    .line 48
    .line 49
    sget-object v3, Lsc/x;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 50
    .line 51
    invoke-virtual {v3, p0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    aput-object p1, v0, v1

    .line 55
    .line 56
    iput v1, p1, Lnc/y0$c;->b:I

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lsc/x;->d(I)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public final b()I
    .locals 1

    sget-object v0, Lsc/x;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final c(I)Lsc/y;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lsc/x;->a:[Lsc/y;

    .line 2
    .line 3
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    add-int/2addr v1, v2

    .line 12
    sget-object v3, Lsc/x;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 13
    .line 14
    invoke-virtual {v3, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge p1, v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0, p1, v1}, Lsc/x;->e(II)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, p1, -0x1

    .line 31
    .line 32
    div-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    aget-object v3, v0, p1

    .line 37
    .line 38
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast v3, Ljava/lang/Comparable;

    .line 42
    .line 43
    aget-object v4, v0, v1

    .line 44
    .line 45
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-gez v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0, p1, v1}, Lsc/x;->e(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lsc/x;->d(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :goto_0
    mul-int/lit8 v1, p1, 0x2

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-lt v1, v3, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget-object v3, p0, Lsc/x;->a:[Lsc/y;

    .line 73
    .line 74
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v4, v1, 0x1

    .line 78
    .line 79
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-ge v4, v5, :cond_2

    .line 84
    .line 85
    aget-object v5, v3, v4

    .line 86
    .line 87
    invoke-static {v5}, Lec/i;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    check-cast v5, Ljava/lang/Comparable;

    .line 91
    .line 92
    aget-object v6, v3, v1

    .line 93
    .line 94
    invoke-static {v6}, Lec/i;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v5, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-gez v5, :cond_2

    .line 102
    .line 103
    move v1, v4

    .line 104
    :cond_2
    aget-object v4, v3, p1

    .line 105
    .line 106
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    check-cast v4, Ljava/lang/Comparable;

    .line 110
    .line 111
    aget-object v3, v3, v1

    .line 112
    .line 113
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v4, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-gtz v3, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {p0, p1, v1}, Lsc/x;->e(II)V

    .line 124
    .line 125
    .line 126
    move p1, v1

    .line 127
    goto :goto_0

    .line 128
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    aget-object p1, v0, p1

    .line 133
    .line 134
    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-interface {p1, v1}, Lsc/y;->f(Lnc/y0$d;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, v2}, Lsc/y;->setIndex(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Lsc/x;->b()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    aput-object v1, v0, v2

    .line 149
    .line 150
    return-object p1
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

.method public final d(I)V
    .locals 3

    :goto_0
    if-gtz p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsc/x;->a:[Lsc/y;

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x2

    aget-object v2, v0, v1

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v0, v0, p1

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, v1}, Lsc/x;->e(II)V

    move p1, v1

    goto :goto_0
.end method

.method public final e(II)V
    .locals 3

    iget-object v0, p0, Lsc/x;->a:[Lsc/y;

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    aget-object v1, v0, p2

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    aget-object v2, v0, p1

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    aput-object v1, v0, p1

    aput-object v2, v0, p2

    invoke-interface {v1, p1}, Lsc/y;->setIndex(I)V

    invoke-interface {v2, p2}, Lsc/y;->setIndex(I)V

    return-void
.end method
