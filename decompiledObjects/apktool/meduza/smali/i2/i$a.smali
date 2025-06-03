.class public final Li2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Li2/i$a;

.field public static final b:Lrb/g;

.field public static c:Lx6/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/i$a;

    invoke-direct {v0}, Li2/i$a;-><init>()V

    sput-object v0, Li2/i$a;->a:Li2/i$a;

    const-class v0, Li2/i;

    invoke-static {v0}, Lec/t;->a(Ljava/lang/Class;)Lec/d;

    move-result-object v0

    invoke-virtual {v0}, Lec/d;->e()Ljava/lang/String;

    sget-object v0, Li2/i$a$a;->a:Li2/i$a$a;

    invoke-static {v0}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object v0

    sput-object v0, Li2/i$a;->b:Lrb/g;

    sget-object v0, Lx6/b;->d:Lx6/b;

    sput-object v0, Li2/i$a;->c:Lx6/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Li2/j;
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Li2/i$a;->b:Lrb/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lrb/g;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lj2/a;

    .line 13
    .line 14
    if-nez v0, :cond_6

    .line 15
    .line 16
    sget-object v0, Landroidx/window/layout/adapter/sidecar/b;->c:Landroidx/window/layout/adapter/sidecar/b;

    .line 17
    .line 18
    sget-object v0, Landroidx/window/layout/adapter/sidecar/b;->c:Landroidx/window/layout/adapter/sidecar/b;

    .line 19
    .line 20
    if-nez v0, :cond_5

    .line 21
    .line 22
    sget-object v0, Landroidx/window/layout/adapter/sidecar/b;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v1, Landroidx/window/layout/adapter/sidecar/b;->c:Landroidx/window/layout/adapter/sidecar/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    if-nez v1, :cond_4

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :try_start_1
    invoke-static {}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$a;->c()Lf2/i;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v4, Lf2/i;->f:Lf2/i;

    .line 41
    .line 42
    const-string v5, "other"

    .line 43
    .line 44
    invoke-static {v4, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v2, Lf2/i;->e:Lrb/g;

    .line 48
    .line 49
    invoke-virtual {v2}, Lrb/g;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v5, "<get-bigInteger>(...)"

    .line 54
    .line 55
    invoke-static {v2, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast v2, Ljava/math/BigInteger;

    .line 59
    .line 60
    iget-object v4, v4, Lf2/i;->e:Lrb/g;

    .line 61
    .line 62
    invoke-virtual {v4}, Lrb/g;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    check-cast v4, Ljava/math/BigInteger;

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ltz v2, :cond_1

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    :cond_1
    :goto_0
    if-eqz v3, :cond_3

    .line 79
    .line 80
    new-instance v2, Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    .line 81
    .line 82
    invoke-direct {v2, p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->j()Z

    .line 86
    .line 87
    .line 88
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    if-nez p0, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    move-object v1, v2

    .line 93
    :catchall_0
    :cond_3
    :goto_1
    :try_start_2
    new-instance p0, Landroidx/window/layout/adapter/sidecar/b;

    .line 94
    .line 95
    invoke-direct {p0, v1}, Landroidx/window/layout/adapter/sidecar/b;-><init>(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V

    .line 96
    .line 97
    .line 98
    sput-object p0, Landroidx/window/layout/adapter/sidecar/b;->c:Landroidx/window/layout/adapter/sidecar/b;

    .line 99
    .line 100
    :cond_4
    sget-object p0, Lrb/h;->a:Lrb/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_5
    :goto_2
    sget-object v0, Landroidx/window/layout/adapter/sidecar/b;->c:Landroidx/window/layout/adapter/sidecar/b;

    .line 112
    .line 113
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    new-instance p0, Li2/j;

    .line 117
    .line 118
    sget-object v1, Li2/o;->b:Li2/o;

    .line 119
    .line 120
    invoke-direct {p0, v1, v0}, Li2/j;-><init>(Li2/o;Lj2/a;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Li2/i$a;->c:Lx6/b;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    return-object p0
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
