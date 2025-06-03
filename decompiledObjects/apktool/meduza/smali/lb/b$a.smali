.class public final Llb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/t0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lma/s0;",
        ">",
        "Ljava/lang/Object;",
        "Leb/t0$b;"
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/ref/Reference<",
            "[B>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lma/b1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lma/s0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Llb/b$a;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Lma/w;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultInstance cannot be null"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Llb/b$a;->b:Lma/s0;

    invoke-virtual {p1}, Lma/w;->v()Lma/b1;

    move-result-object p1

    iput-object p1, p0, Llb/b$a;->a:Lma/b1;

    const/4 p1, -0x1

    iput p1, p0, Llb/b$a;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)Lma/s0;
    .locals 6

    .line 1
    instance-of v0, p1, Llb/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llb/a;

    .line 7
    .line 8
    iget-object v0, v0, Llb/a;->b:Lma/b1;

    .line 9
    .line 10
    iget-object v1, p0, Llb/b$a;->a:Lma/b1;

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    :try_start_0
    move-object v0, p1

    .line 15
    check-cast v0, Llb/a;

    .line 16
    .line 17
    iget-object v0, v0, Llb/a;->a:Lma/s0;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "message not available"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 32
    :try_start_1
    instance-of v1, p1, Leb/j0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_8

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_7

    .line 42
    .line 43
    const/high16 v3, 0x400000

    .line 44
    .line 45
    if-gt v1, v3, :cond_7

    .line 46
    .line 47
    sget-object v0, Llb/b$a;->d:Ljava/lang/ThreadLocal;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/ref/Reference;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, [B

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    array-length v4, v3

    .line 66
    if-ge v4, v1, :cond_3

    .line 67
    .line 68
    :cond_2
    new-array v3, v1, [B

    .line 69
    .line 70
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    invoke-direct {v4, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    move v0, v1

    .line 79
    :goto_0
    if-lez v0, :cond_5

    .line 80
    .line 81
    sub-int v4, v1, v0

    .line 82
    .line 83
    invoke-virtual {p1, v3, v4, v0}, Ljava/io/InputStream;->read([BII)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/4 v5, -0x1

    .line 88
    if-ne v4, v5, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    sub-int/2addr v0, v4

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    :goto_1
    if-nez v0, :cond_6

    .line 94
    .line 95
    invoke-static {v3, v2, v1, v2}, Lma/i;->f([BIIZ)Lma/i$a;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_6
    sub-int p1, v1, v0

    .line 101
    .line 102
    new-instance v0, Ljava/lang/RuntimeException;

    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v3, "size inaccurate: "

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " != "

    .line 118
    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_7
    if-nez v1, :cond_8

    .line 134
    .line 135
    iget-object v0, p0, Llb/b$a;->b:Lma/s0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    :goto_2
    if-nez v0, :cond_9

    .line 139
    .line 140
    new-instance v0, Lma/i$c;

    .line 141
    .line 142
    invoke-direct {v0, p1}, Lma/i$c;-><init>(Ljava/io/InputStream;)V

    .line 143
    .line 144
    .line 145
    :cond_9
    const p1, 0x7fffffff

    .line 146
    .line 147
    .line 148
    iput p1, v0, Lma/i;->c:I

    .line 149
    .line 150
    iget p1, p0, Llb/b$a;->c:I

    .line 151
    .line 152
    if-ltz p1, :cond_b

    .line 153
    .line 154
    if-ltz p1, :cond_a

    .line 155
    .line 156
    iput p1, v0, Lma/i;->b:I

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    const-string v1, "Recursion limit cannot be negative: "

    .line 162
    .line 163
    invoke-static {v1, p1}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_b
    :goto_3
    :try_start_2
    iget-object p1, p0, Llb/b$a;->a:Lma/b1;

    .line 172
    .line 173
    sget-object v1, Llb/b;->a:Lma/o;

    .line 174
    .line 175
    invoke-interface {p1, v0, v1}, Lma/b1;->a(Lma/i;Lma/o;)Lma/s0;

    .line 176
    .line 177
    .line 178
    move-result-object p1
    :try_end_2
    .catch Lma/b0; {:try_start_2 .. :try_end_2} :catch_2

    .line 179
    :try_start_3
    invoke-virtual {v0, v2}, Lma/i;->a(I)V
    :try_end_3
    .catch Lma/b0; {:try_start_3 .. :try_end_3} :catch_1

    .line 180
    .line 181
    .line 182
    move-object v0, p1

    .line 183
    :goto_4
    return-object v0

    .line 184
    :catch_1
    move-exception v0

    .line 185
    :try_start_4
    iput-object p1, v0, Lma/b0;->a:Lma/s0;

    .line 186
    .line 187
    throw v0
    :try_end_4
    .catch Lma/b0; {:try_start_4 .. :try_end_4} :catch_2

    .line 188
    :catch_2
    move-exception p1

    .line 189
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 190
    .line 191
    const-string v1, "Invalid protobuf byte sequence"

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    new-instance v0, Leb/g1;

    .line 202
    .line 203
    invoke-direct {v0, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :catch_3
    move-exception p1

    .line 208
    new-instance v0, Ljava/lang/RuntimeException;

    .line 209
    .line 210
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    throw v0
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

.method public final b(Ljava/lang/Object;)Llb/a;
    .locals 2

    check-cast p1, Lma/s0;

    new-instance v0, Llb/a;

    iget-object v1, p0, Llb/b$a;->a:Lma/b1;

    invoke-direct {v0, p1, v1}, Llb/a;-><init>(Lma/s0;Lma/b1;)V

    return-object v0
.end method
