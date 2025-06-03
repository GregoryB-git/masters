.class public final Lvn/hunghd/flutterdownloader/DownloadWorker;
.super Landroidx/work/Worker;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn/hunghd/flutterdownloader/DownloadWorker$a;
    }
.end annotation


# static fields
.field public static final H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final I:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static J:Lio/flutter/embedding/engine/FlutterEngine;

.field public static final K:Lad/c;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:J

.field public F:I

.field public G:Z

.field public final f:Ljava/util/regex/Pattern;

.field public final o:Ljava/util/regex/Pattern;

.field public final p:Ljava/util/regex/Pattern;

.field public q:Lio/flutter/plugin/common/MethodChannel;

.field public r:Ld5/n;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:I

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    invoke-direct {v0}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:Ljava/util/ArrayDeque;

    new-instance v0, Lad/c;

    invoke-direct {v0}, Lad/c;-><init>()V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Lad/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p2, "(?i)\\bcharset=\\s*\"?([^\\s;\"]*)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->f:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename\\*=([^\']+)\'([^\']*)\'\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->o:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename=\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->p:Ljava/util/regex/Pattern;

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lio/flutter/plugins/firebase/messaging/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lio/flutter/plugins/firebase/messaging/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static q(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    const-string v0, ";"

    .line 4
    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    aget-object v2, v0, v1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v1

    .line 22
    :goto_0
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-static {v1, p0, v2, v1}, Llc/k;->y0(ILjava/lang/CharSequence;Ljava/lang/String;Z)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    invoke-static {v1}, Llc/k;->x0(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lsb/j;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, Llc/b;

    .line 37
    .line 38
    new-instance v3, Llc/i;

    .line 39
    .line 40
    invoke-direct {v3, v0, v1}, Llc/i;-><init>(Ljava/util/List;Z)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, p0, v1, v1, v3}, Llc/b;-><init>(Ljava/lang/CharSequence;IILdc/p;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lkc/h;

    .line 47
    .line 48
    invoke-direct {v0, v2}, Lkc/h;-><init>(Llc/b;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v0}, Lsb/m;->j(Ljava/lang/Iterable;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lkc/h;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lic/f;

    .line 75
    .line 76
    const-string v5, "range"

    .line 77
    .line 78
    invoke-static {v3, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget v5, v3, Lic/d;->a:I

    .line 82
    .line 83
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    iget v3, v3, Lic/d;->b:I

    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    add-int/2addr v3, v4

    .line 102
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object p0, v2

    .line 115
    :goto_2
    new-array v0, v1, [Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, [Ljava/lang/String;

    .line 122
    .line 123
    if-eqz p0, :cond_9

    .line 124
    .line 125
    aget-object p0, p0, v1

    .line 126
    .line 127
    if-eqz p0, :cond_9

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    sub-int/2addr v0, v4

    .line 134
    move v2, v1

    .line 135
    move v3, v2

    .line 136
    :goto_3
    if-gt v2, v0, :cond_8

    .line 137
    .line 138
    if-nez v3, :cond_3

    .line 139
    .line 140
    move v5, v2

    .line 141
    goto :goto_4

    .line 142
    :cond_3
    move v5, v0

    .line 143
    :goto_4
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    const/16 v6, 0x20

    .line 148
    .line 149
    invoke-static {v5, v6}, Lec/i;->f(II)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-gtz v5, :cond_4

    .line 154
    .line 155
    move v5, v4

    .line 156
    goto :goto_5

    .line 157
    :cond_4
    move v5, v1

    .line 158
    :goto_5
    if-nez v3, :cond_6

    .line 159
    .line 160
    if-nez v5, :cond_5

    .line 161
    .line 162
    move v3, v4

    .line 163
    goto :goto_3

    .line 164
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    if-nez v5, :cond_7

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    add-int/lit8 v0, v0, -0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    :goto_6
    add-int/2addr v0, v4

    .line 174
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    goto :goto_7

    .line 183
    :cond_9
    const/4 p0, 0x0

    .line 184
    :goto_7
    return-object p0
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

.method public static u(Ljava/lang/String;)Z
    .locals 2

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    const-string v1, "getExternalStorageDirectory(...)"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static v(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "image/"

    invoke-static {p0, v0}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "video"

    invoke-static {p0, v0}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static x(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    :goto_0
    const-string p1, "openConnection(...)"

    invoke-static {p0, p1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 7
    .line 8
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 9
    .line 10
    const-string v2, "callback_handle"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroidx/work/c;->c(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "toString(...)"

    .line 32
    .line 33
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    sget-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    monitor-enter v1

    .line 60
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    sget-object v2, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v2, Landroid/os/Handler;

    .line 73
    .line 74
    iget-object v3, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lx0/q0;

    .line 84
    .line 85
    const/16 v4, 0x16

    .line 86
    .line 87
    invoke-direct {v3, v4, p0, v0}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :goto_0
    monitor-exit v1

    .line 94
    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->s:Z

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    new-instance v0, Lu/q;

    .line 99
    .line 100
    const-string v1, "FLUTTER_DOWNLOADER_NOTIFICATION"

    .line 101
    .line 102
    invoke-direct {v0, p1, v1}, Lu/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p2}, Lu/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v0, Lu/q;->e:Ljava/lang/CharSequence;

    .line 110
    .line 111
    iput-object p5, v0, Lu/q;->g:Landroid/app/PendingIntent;

    .line 112
    .line 113
    const/16 p5, 0x8

    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    invoke-virtual {v0, p5, v1}, Lu/q;->d(IZ)V

    .line 117
    .line 118
    .line 119
    const/16 p5, 0x10

    .line 120
    .line 121
    invoke-virtual {v0, p5, v1}, Lu/q;->d(IZ)V

    .line 122
    .line 123
    .line 124
    const/4 p5, -0x1

    .line 125
    iput p5, v0, Lu/q;->j:I

    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 128
    .line 129
    .line 130
    move-result p5

    .line 131
    const v2, 0x1080082

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x2

    .line 135
    const/4 v4, 0x0

    .line 136
    if-eq p5, v3, :cond_4

    .line 137
    .line 138
    const/4 v1, 0x3

    .line 139
    if-eq p5, v1, :cond_6

    .line 140
    .line 141
    const/4 v1, 0x4

    .line 142
    if-eq p5, v1, :cond_3

    .line 143
    .line 144
    const/4 v1, 0x5

    .line 145
    if-eq p5, v1, :cond_2

    .line 146
    .line 147
    const/4 v1, 0x6

    .line 148
    if-eq p5, v1, :cond_1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    iget-object p5, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Ljava/lang/String;

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_2
    iget-object p5, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:Ljava/lang/String;

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_3
    iget-object p5, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:Ljava/lang/String;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    if-gtz p4, :cond_5

    .line 161
    .line 162
    iget-object p5, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, p5}, Lu/q;->c(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-virtual {v0, v4, v4}, Lu/q;->f(II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v3, v4}, Lu/q;->d(IZ)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->t()I

    .line 174
    .line 175
    .line 176
    move-result p5

    .line 177
    goto :goto_2

    .line 178
    :cond_5
    const/16 p5, 0x64

    .line 179
    .line 180
    if-ge p4, p5, :cond_6

    .line 181
    .line 182
    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Lu/q;->c(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p5, p4}, Lu/q;->f(II)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v3, v1}, Lu/q;->d(IZ)V

    .line 191
    .line 192
    .line 193
    const p5, 0x1080081

    .line 194
    .line 195
    .line 196
    :goto_2
    iget-object v1, v0, Lu/q;->B:Landroid/app/Notification;

    .line 197
    .line 198
    iput p5, v1, Landroid/app/Notification;->icon:I

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    iget-object p5, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:Ljava/lang/String;

    .line 202
    .line 203
    :goto_3
    invoke-virtual {v0, p5}, Lu/q;->c(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v4, v4}, Lu/q;->f(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v3, v4}, Lu/q;->d(IZ)V

    .line 210
    .line 211
    .line 212
    iget-object p5, v0, Lu/q;->B:Landroid/app/Notification;

    .line 213
    .line 214
    iput v2, p5, Landroid/app/Notification;->icon:I

    .line 215
    .line 216
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 217
    .line 218
    .line 219
    move-result-wide v1

    .line 220
    iget-wide v3, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:J

    .line 221
    .line 222
    sub-long/2addr v1, v3

    .line 223
    const-wide/16 v3, 0x3e8

    .line 224
    .line 225
    cmp-long p5, v1, v3

    .line 226
    .line 227
    if-gez p5, :cond_8

    .line 228
    .line 229
    if-eqz p6, :cond_7

    .line 230
    .line 231
    const-string p5, "Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed"

    .line 232
    .line 233
    invoke-virtual {p0, p5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :catch_0
    move-exception p5

    .line 241
    invoke-virtual {p5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_7
    const-string p1, "Update too frequently!!!!, this should be dropped"

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_8
    :goto_5
    const-string p5, "Update notification: {notificationId: "

    .line 252
    .line 253
    invoke-static {p5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object p5

    .line 257
    iget p6, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:I

    .line 258
    .line 259
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string p6, ", title: "

    .line 263
    .line 264
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string p2, ", status: "

    .line 271
    .line 272
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string p2, ", progress: "

    .line 279
    .line 280
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const/16 p2, 0x7d

    .line 287
    .line 288
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {p0, p2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    new-instance p2, Lu/u;

    .line 299
    .line 300
    invoke-direct {p2, p1}, Lu/u;-><init>(Landroid/content/Context;)V

    .line 301
    .line 302
    .line 303
    iget p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:I

    .line 304
    .line 305
    invoke-virtual {v0}, Lu/q;->a()Landroid/app/Notification;

    .line 306
    .line 307
    .line 308
    move-result-object p3

    .line 309
    invoke-virtual {p2, p1, p3}, Lu/u;->b(ILandroid/app/Notification;)V

    .line 310
    .line 311
    .line 312
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 313
    .line 314
    .line 315
    move-result-wide p1

    .line 316
    iput-wide p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:J

    .line 317
    .line 318
    :cond_9
    return-void

    .line 319
    :catchall_0
    move-exception p1

    .line 320
    monitor-exit v1

    .line 321
    throw p1
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
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
.end method

.method public final g()V
    .locals 9

    .line 1
    iget-object v1, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "getApplicationContext(...)"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lvn/hunghd/flutterdownloader/c;->a:Lvn/hunghd/flutterdownloader/c;

    .line 9
    .line 10
    invoke-static {v1}, Lvn/hunghd/flutterdownloader/c$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, Ld5/n;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Ld5/n;-><init>(Lvn/hunghd/flutterdownloader/c;)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 22
    .line 23
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 24
    .line 25
    const-string v2, "url"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 32
    .line 33
    iget-object v2, v2, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 34
    .line 35
    const-string v3, "file_name"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 42
    .line 43
    const-string v7, "toString(...)"

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    iget-object v4, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 48
    .line 49
    iget-object v4, v4, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v3, 0x0

    .line 64
    :goto_0
    if-eqz v3, :cond_2

    .line 65
    .line 66
    iget-object v3, v3, Lad/b;->c:Lad/a;

    .line 67
    .line 68
    sget-object v4, Lad/a;->a:Lad/a;

    .line 69
    .line 70
    if-ne v3, v4, :cond_2

    .line 71
    .line 72
    if-nez v2, :cond_1

    .line 73
    .line 74
    move-object v2, v0

    .line 75
    :cond_1
    sget-object v8, Lad/a;->e:Lad/a;

    .line 76
    .line 77
    const/4 v4, -0x1

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x1

    .line 80
    move-object v0, p0

    .line 81
    move-object v3, v8

    .line 82
    invoke-virtual/range {v0 .. v6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 90
    .line 91
    iget-object v1, v1, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    .line 101
    .line 102
    invoke-virtual {v0, v1, v8, v2}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void
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
.end method

.method public final j()Landroidx/work/d$a;
    .locals 19

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    sget-object v0, Lvn/hunghd/flutterdownloader/c;->a:Lvn/hunghd/flutterdownloader/c;

    .line 4
    .line 5
    iget-object v0, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, Lvn/hunghd/flutterdownloader/c$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ld5/n;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ld5/n;-><init>(Lvn/hunghd/flutterdownloader/c;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 17
    .line 18
    iget-object v0, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 21
    .line 22
    const-string v1, "url"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v10

    .line 28
    if-eqz v10, :cond_11

    .line 29
    .line 30
    iget-object v0, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 31
    .line 32
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 33
    .line 34
    const-string v1, "file_name"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    iget-object v0, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 43
    .line 44
    const-string v1, "saved_file"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_10

    .line 51
    .line 52
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 53
    .line 54
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 55
    .line 56
    const-string v2, "headers"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    if-eqz v8, :cond_f

    .line 63
    .line 64
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 65
    .line 66
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 67
    .line 68
    const-string v2, "is_resume"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 75
    .line 76
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 77
    .line 78
    const/16 v2, 0x3a98

    .line 79
    .line 80
    iget-object v1, v1, Landroidx/work/c;->a:Ljava/util/HashMap;

    .line 81
    .line 82
    const-string v3, "timeout"

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    instance-of v3, v1, Ljava/lang/Integer;

    .line 89
    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    check-cast v1, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    move v13, v1

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v13, v2

    .line 101
    :goto_0
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 102
    .line 103
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 104
    .line 105
    const-string v2, "debug"

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    .line 112
    .line 113
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 114
    .line 115
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 116
    .line 117
    const/16 v2, 0xa

    .line 118
    .line 119
    iget-object v1, v1, Landroidx/work/c;->a:Ljava/util/HashMap;

    .line 120
    .line 121
    const-string v3, "step"

    .line 122
    .line 123
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    instance-of v3, v1, Ljava/lang/Integer;

    .line 128
    .line 129
    if-eqz v3, :cond_1

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :cond_1
    iput v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:I

    .line 138
    .line 139
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 140
    .line 141
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 142
    .line 143
    const-string v2, "ignoreSsl"

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Z

    .line 150
    .line 151
    iget-object v1, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 152
    .line 153
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const v2, 0x7f120084

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Ljava/lang/String;

    .line 165
    .line 166
    const v2, 0x7f120082

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Ljava/lang/String;

    .line 174
    .line 175
    const v2, 0x7f12007d

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:Ljava/lang/String;

    .line 183
    .line 184
    const v2, 0x7f120081

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:Ljava/lang/String;

    .line 192
    .line 193
    const v2, 0x7f120083

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Ljava/lang/String;

    .line 201
    .line 202
    const v2, 0x7f120080

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 212
    .line 213
    const-string v14, "toString(...)"

    .line 214
    .line 215
    if-eqz v1, :cond_2

    .line 216
    .line 217
    iget-object v2, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 218
    .line 219
    iget-object v2, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-static {v2, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    goto :goto_1

    .line 233
    :cond_2
    const/4 v1, 0x0

    .line 234
    :goto_1
    move-object v15, v1

    .line 235
    new-instance v1, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v2, "DownloadWorker{url="

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v2, ",filename="

    .line 249
    .line 250
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v2, ",savedDir="

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v2, ",header="

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v2, ",isResume="

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v2, ",status="

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    if-eqz v15, :cond_3

    .line 286
    .line 287
    iget-object v2, v15, Lad/b;->c:Lad/a;

    .line 288
    .line 289
    if-nez v2, :cond_4

    .line 290
    .line 291
    :cond_3
    const-string v2, "GONE"

    .line 292
    .line 293
    :cond_4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    if-eqz v15, :cond_e

    .line 304
    .line 305
    iget-object v1, v15, Lad/b;->c:Lad/a;

    .line 306
    .line 307
    sget-object v2, Lad/a;->e:Lad/a;

    .line 308
    .line 309
    if-ne v1, v2, :cond_5

    .line 310
    .line 311
    goto/16 :goto_8

    .line 312
    .line 313
    :cond_5
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 314
    .line 315
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 316
    .line 317
    const-string v2, "show_notification"

    .line 318
    .line 319
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->s:Z

    .line 324
    .line 325
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 326
    .line 327
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 328
    .line 329
    const-string v2, "open_file_from_notification"

    .line 330
    .line 331
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Z

    .line 336
    .line 337
    iget-object v1, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 338
    .line 339
    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    .line 340
    .line 341
    const-string v2, "save_in_public_storage"

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Landroidx/work/c;->b(Ljava/lang/String;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Z

    .line 348
    .line 349
    iget v1, v15, Lad/b;->a:I

    .line 350
    .line 351
    iput v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:I

    .line 352
    .line 353
    iget-object v1, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 354
    .line 355
    const-string v7, "getApplicationContext(...)"

    .line 356
    .line 357
    invoke-static {v1, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    iget-boolean v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->s:Z

    .line 361
    .line 362
    if-nez v2, :cond_6

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 366
    .line 367
    const/16 v3, 0x1a

    .line 368
    .line 369
    if-lt v2, v3, :cond_7

    .line 370
    .line 371
    iget-object v3, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 372
    .line 373
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const v4, 0x7f12007f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    const-string v5, "getString(...)"

    .line 385
    .line 386
    invoke-static {v4, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    const v6, 0x7f12007e

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-static {v3, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    const/4 v5, 0x2

    .line 400
    new-instance v6, Landroid/app/NotificationChannel;

    .line 401
    .line 402
    move/from16 v16, v12

    .line 403
    .line 404
    const-string v12, "FLUTTER_DOWNLOADER_NOTIFICATION"

    .line 405
    .line 406
    invoke-direct {v6, v12, v4, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    const/4 v3, 0x0

    .line 413
    invoke-virtual {v6, v3, v3}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 414
    .line 415
    .line 416
    new-instance v3, Lu/u;

    .line 417
    .line 418
    invoke-direct {v3, v1}, Lu/u;-><init>(Landroid/content/Context;)V

    .line 419
    .line 420
    .line 421
    const/16 v1, 0x1a

    .line 422
    .line 423
    if-lt v2, v1, :cond_8

    .line 424
    .line 425
    iget-object v1, v3, Lu/u;->b:Landroid/app/NotificationManager;

    .line 426
    .line 427
    invoke-static {v1, v6}, Lu/u$b;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 428
    .line 429
    .line 430
    goto :goto_3

    .line 431
    :cond_7
    :goto_2
    move/from16 v16, v12

    .line 432
    .line 433
    :cond_8
    :goto_3
    iget-object v2, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 434
    .line 435
    invoke-static {v2, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    if-nez v11, :cond_9

    .line 439
    .line 440
    move-object v3, v10

    .line 441
    goto :goto_4

    .line 442
    :cond_9
    move-object v3, v11

    .line 443
    :goto_4
    sget-object v12, Lad/a;->b:Lad/a;

    .line 444
    .line 445
    iget v5, v15, Lad/b;->d:I

    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    move-object/from16 v1, p0

    .line 451
    .line 452
    move-object v4, v12

    .line 453
    move/from16 v18, v13

    .line 454
    .line 455
    move-object v13, v7

    .line 456
    move/from16 v7, v17

    .line 457
    .line 458
    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    .line 459
    .line 460
    .line 461
    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 462
    .line 463
    if-eqz v1, :cond_a

    .line 464
    .line 465
    iget-object v2, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 466
    .line 467
    iget-object v2, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 468
    .line 469
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {v2, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    iget v3, v15, Lad/b;->d:I

    .line 477
    .line 478
    invoke-virtual {v1, v2, v12, v3}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    .line 479
    .line 480
    .line 481
    :cond_a
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 486
    .line 487
    invoke-static {v1, v2, v11}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    new-instance v2, Ljava/io/File;

    .line 492
    .line 493
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-eqz v1, :cond_b

    .line 501
    .line 502
    const/4 v1, 0x1

    .line 503
    new-instance v2, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 506
    .line 507
    .line 508
    const-string v3, "exists file for "

    .line 509
    .line 510
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    const-string v3, "automatic resuming..."

    .line 517
    .line 518
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-virtual {v9, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    move v7, v1

    .line 529
    goto :goto_5

    .line 530
    :cond_b
    move/from16 v7, v16

    .line 531
    .line 532
    :goto_5
    :try_start_0
    iget-object v2, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 533
    .line 534
    invoke-static {v2, v13}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    move-object/from16 v1, p0

    .line 538
    .line 539
    move-object v3, v10

    .line 540
    move-object v4, v0

    .line 541
    move-object v5, v11

    .line 542
    move-object v6, v8

    .line 543
    move/from16 v8, v18

    .line 544
    .line 545
    invoke-virtual/range {v1 .. v8}, Lvn/hunghd/flutterdownloader/DownloadWorker;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->l()V

    .line 549
    .line 550
    .line 551
    const/4 v0, 0x0

    .line 552
    iput-object v0, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 553
    .line 554
    new-instance v0, Landroidx/work/d$a$c;

    .line 555
    .line 556
    invoke-direct {v0}, Landroidx/work/d$a$c;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 557
    .line 558
    .line 559
    goto :goto_7

    .line 560
    :catch_0
    move-exception v0

    .line 561
    iget-object v2, v9, Landroidx/work/d;->a:Landroid/content/Context;

    .line 562
    .line 563
    invoke-static {v2, v13}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    if-nez v11, :cond_c

    .line 567
    .line 568
    move-object v3, v10

    .line 569
    goto :goto_6

    .line 570
    :cond_c
    move-object v3, v11

    .line 571
    :goto_6
    sget-object v8, Lad/a;->d:Lad/a;

    .line 572
    .line 573
    const/4 v5, -0x1

    .line 574
    const/4 v6, 0x0

    .line 575
    const/4 v7, 0x1

    .line 576
    move-object/from16 v1, p0

    .line 577
    .line 578
    move-object v4, v8

    .line 579
    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    .line 580
    .line 581
    .line 582
    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 583
    .line 584
    if-eqz v1, :cond_d

    .line 585
    .line 586
    iget-object v2, v9, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 587
    .line 588
    iget-object v2, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 589
    .line 590
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-static {v2, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    iget v3, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    .line 598
    .line 599
    invoke-virtual {v1, v2, v8, v3}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    .line 600
    .line 601
    .line 602
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 603
    .line 604
    .line 605
    const/4 v0, 0x0

    .line 606
    iput-object v0, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 607
    .line 608
    new-instance v0, Landroidx/work/d$a$a;

    .line 609
    .line 610
    invoke-direct {v0}, Landroidx/work/d$a$a;-><init>()V

    .line 611
    .line 612
    .line 613
    :goto_7
    return-object v0

    .line 614
    :cond_e
    :goto_8
    new-instance v0, Landroidx/work/d$a$c;

    .line 615
    .line 616
    invoke-direct {v0}, Landroidx/work/d$a$c;-><init>()V

    .line 617
    .line 618
    .line 619
    return-object v0

    .line 620
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 621
    .line 622
    const-string v1, "Argument \'headers\' should not be null"

    .line 623
    .line 624
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    throw v0

    .line 628
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 629
    .line 630
    const-string v1, "Argument \'saved_file\' should not be null"

    .line 631
    .line 632
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 637
    .line 638
    const-string v1, "Argument \'url\' should not be null"

    .line 639
    .line 640
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v0
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
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
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const-string v0, "image/"

    .line 8
    .line 9
    invoke-static {p3, v0}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, " to MediaStore"

    .line 14
    .line 15
    const-string v2, "insert "

    .line 16
    .line 17
    const-string v3, "_data"

    .line 18
    .line 19
    const-string v4, "datetaken"

    .line 20
    .line 21
    const-string v5, "date_added"

    .line 22
    .line 23
    const-string v6, "mime_type"

    .line 24
    .line 25
    const-string v7, ""

    .line 26
    .line 27
    const-string v8, "description"

    .line 28
    .line 29
    const-string v9, "_display_name"

    .line 30
    .line 31
    const-string v10, "title"

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v0, Landroid/content/ContentValues;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v10, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v9, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v6, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, v5, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    const-string v0, "video"

    .line 108
    .line 109
    invoke-static {p3, v0}, Llc/h;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    new-instance v0, Landroid/content/ContentValues;

    .line 116
    .line 117
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v10, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v9, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v6, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v0, v5, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {v0, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    sget-object p2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 185
    .line 186
    :goto_0
    invoke-virtual {p1, p2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    :cond_1
    return-void
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

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    .line 2
    .line 3
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 7
    .line 8
    iget-object v1, v1, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "toString(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lad/b;->c:Lad/a;

    .line 26
    .line 27
    sget-object v2, Lad/a;->c:Lad/a;

    .line 28
    .line 29
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v0, Lad/b;->j:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v1, v0, Lad/b;->f:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    iget-object v1, v0, Lad/b;->e:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x6

    .line 42
    const-string v3, "/"

    .line 43
    .line 44
    invoke-static {v1, v3, v2}, Llc/k;->u0(Ljava/lang/String;Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    iget-object v3, v0, Lad/b;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "substring(...)"

    .line 61
    .line 62
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object v0, v0, Lad/b;->g:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2, v0, v1}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void
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
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    const-string v0, "DownloadWorker"

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const-string p1, "It looks like you are trying to save file in public storage but not setting \'saveInPublicStorage\' to \'true\'"

    .line 16
    .line 17
    iget-boolean p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const-string p1, "Create a file using java.io API failed "

    .line 34
    .line 35
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 39
    return-object p1
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

.method public final n(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    sget-object v0, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 2
    .line 3
    const-string v1, "EXTERNAL_CONTENT_URI"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/content/ContentValues;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "_display_name"

    .line 14
    .line 15
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "mime_type"

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 24
    .line 25
    const-string p2, "relative_path"

    .line 26
    .line 27
    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-object p1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    iget-boolean p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    const-string p1, "DownloadWorker"

    .line 50
    .line 51
    const-string p2, "Create a file using MediaStore API failed."

    .line 52
    .line 53
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    const/4 p1, 0x0

    .line 57
    return-object p1
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

.method public final o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 26

    move-object/from16 v8, p0

    move-object/from16 v1, p3

    move-object/from16 v9, p4

    move/from16 v2, p7

    const-string v10, "toString(...)"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    iget-object v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    if-eqz v4, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lad/b;->a()I

    move-result v4

    iput v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->e()Landroidx/work/c;

    move-result-object v4

    const-string v5, "proxy"

    invoke-virtual {v4, v5}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    move v6, v5

    :goto_2
    if-nez v6, :cond_4

    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/net/Proxy;

    sget-object v7, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v13, Ljava/net/InetSocketAddress;

    invoke-virtual {v6}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Ljava/net/URL;->getPort()I

    move-result v6

    invoke-direct {v13, v14, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v4, v7, v13}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_13
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    const-wide/16 v6, 0x0

    move-object/from16 v13, p2

    const/4 v14, 0x0

    :goto_4
    :try_start_1
    invoke-virtual {v3, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v3, v13, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v15, v5

    goto :goto_5

    :cond_5
    invoke-virtual {v3, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lec/i;->b(Ljava/lang/Object;)V

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    add-int/2addr v15, v5

    :goto_5
    const/4 v11, 0x3

    if-gt v15, v11, :cond_2b

    new-instance v11, Ljava/net/URL;

    invoke-direct {v11, v13}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iget-boolean v15, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_12
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    const-string v5, "https"

    const-string v12, "toLowerCase(...)"

    move-object/from16 v18, v3

    const-string v3, "US"

    move-wide/from16 v19, v6

    const-string v6, "getProtocol(...)"

    if-eqz v15, :cond_7

    :try_start_2
    invoke-static {}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;->a()V

    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v11, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->x(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v5, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Lad/c;

    invoke-virtual {v3, v5}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    goto :goto_7

    :cond_6
    invoke-static {v11, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->x(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v3

    goto :goto_6

    :cond_7
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v11, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->x(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_7

    :goto_6
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_12
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    :goto_7
    move-object v14, v3

    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Open connection to "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v14, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v3, 0x0

    invoke-virtual {v14, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v3, "User-Agent"

    const-string v5, "Mozilla/5.0..."

    invoke-virtual {v14, v3, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, p5

    invoke-virtual {v8, v14, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->y(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_11
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    if-eqz p6, :cond_8

    :try_start_4
    invoke-virtual {v8, v14, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->z(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-wide/from16 v19, v5

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v11, v14

    goto/16 :goto_34

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_11

    :cond_8
    :goto_8
    :try_start_5
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_11
    .catchall {:try_start_5 .. :try_end_5} :catchall_b

    const/16 v5, 0x133

    if-eq v11, v5, :cond_2a

    const/16 v5, 0x134

    if-eq v11, v5, :cond_2a

    packed-switch v11, :pswitch_data_0

    :try_start_6
    invoke-virtual {v14}, Ljava/net/URLConnection;->connect()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_e
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    const/16 v2, 0xc8

    const-string v12, "Download canceled"

    if-eq v11, v2, :cond_a

    if-eqz p6, :cond_9

    const/16 v2, 0xce

    if-ne v11, v2, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 p5, v12

    move-object/from16 v17, v14

    goto/16 :goto_2a

    :cond_a
    :goto_9
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {v14}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v11

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_e
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    const/16 v3, 0x18

    if-lt v2, v3, :cond_b

    :try_start_8
    invoke-static {v14}, La0/d;->c(Ljava/net/HttpURLConnection;)J

    move-result-wide v2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_a

    :cond_b
    :try_start_9
    invoke-virtual {v14}, Ljava/net/URLConnection;->getContentLength()I

    move-result v2

    int-to-long v2, v2

    :goto_a
    move-wide v6, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Content-Type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Content-Length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Lvn/hunghd/flutterdownloader/DownloadWorker;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Charset = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_e
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    if-nez p6, :cond_11

    if-nez v9, :cond_11

    :try_start_a
    const-string v3, "Content-Disposition"

    invoke-virtual {v14, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Content-Disposition = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_c

    goto :goto_b

    :cond_c
    const/4 v4, 0x0

    goto :goto_c

    :cond_d
    :goto_b
    const/4 v4, 0x1

    :goto_c
    if-nez v4, :cond_e

    invoke-virtual {v8, v3, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    :cond_e
    if-eqz v9, :cond_10

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_f

    goto :goto_d

    :cond_f
    const/4 v2, 0x0

    goto :goto_e

    :cond_10
    :goto_d
    const/4 v2, 0x1

    :goto_e
    if-eqz v2, :cond_11

    const-string v2, "/"

    const/4 v3, 0x6

    invoke-static {v13, v2, v3}, Llc/k;->u0(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v13, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_f

    :catch_1
    move-exception v0

    move-object v1, v0

    goto :goto_10

    :catch_2
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :goto_f
    move-object v9, v2

    goto :goto_12

    :goto_10
    move-object v9, v2

    :goto_11
    move-object v11, v14

    goto/16 :goto_36

    :cond_11
    :goto_12
    :try_start_d
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    iget-object v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_e
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-eqz v2, :cond_12

    :try_start_e
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v9, v11}, Ld5/n;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lrb/h;->a:Lrb/h;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :cond_12
    :try_start_f
    invoke-virtual {v14}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v13
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_e
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    const/16 v15, 0x1d

    if-eqz p6, :cond_13

    :try_start_10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/FileOutputStream;

    const/4 v5, 0x1

    invoke-direct {v2, v1, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    move-object v5, v1

    move-object v4, v2

    goto :goto_15

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_13

    :catch_3
    move-exception v0

    move-object v1, v0

    goto :goto_14

    :cond_13
    :try_start_11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_a
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    if-lt v2, v15, :cond_14

    :try_start_12
    iget-boolean v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Z

    if-eqz v2, :cond_14

    invoke-virtual {v8, v9, v11}, Lvn/hunghd/flutterdownloader/DownloadWorker;->n(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->s(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "w"

    invoke-virtual {v3, v1, v4}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    move-object v4, v1

    move-object v5, v2

    goto :goto_15

    :goto_13
    move-object/from16 p7, v13

    move-object/from16 v17, v14

    goto/16 :goto_28

    :goto_14
    move-object/from16 p7, v13

    move-object/from16 v17, v14

    goto/16 :goto_29

    :cond_14
    :try_start_13
    invoke-static {v9}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v8, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/FileOutputStream;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_a
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    move-object v5, v2

    move-object v4, v3

    :goto_15
    const/16 v1, 0x1000

    :try_start_14
    new-array v3, v1, [B

    move-wide/from16 v1, v19

    :goto_16
    invoke-virtual {v13, v3}, Ljava/io/InputStream;->read([B)I

    move-result v15

    move-object/from16 p3, v5

    const/4 v5, -0x1

    move-object/from16 p5, v12

    const/16 v12, 0x64

    if-eq v15, v5, :cond_18

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v5
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    if-nez v5, :cond_18

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    int-to-long v13, v15

    add-long/2addr v13, v1

    int-to-long v1, v12

    mul-long/2addr v1, v13

    add-long v21, v6, v19

    :try_start_15
    div-long v1, v1, v21
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_5
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    long-to-int v5, v1

    if-eqz v4, :cond_15

    const/4 v1, 0x0

    :try_start_16
    invoke-virtual {v4, v3, v1, v15}, Ljava/io/OutputStream;->write([BII)V

    sget-object v1, Lrb/h;->a:Lrb/h;
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_4
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    goto :goto_17

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_18

    :catch_4
    move-exception v0

    move-object v1, v0

    goto :goto_19

    :cond_15
    :goto_17
    :try_start_17
    iget v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_5
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    if-eqz v1, :cond_16

    :try_start_18
    iget v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:I
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_4
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    add-int/2addr v2, v1

    if-gt v5, v2, :cond_16

    if-ne v5, v12, :cond_17

    goto :goto_1a

    :goto_18
    move-object/from16 v16, p7

    move-object v11, v4

    move-object/from16 v14, v17

    goto/16 :goto_3e

    :goto_19
    move-object/from16 v16, p7

    move-object v11, v4

    move-object/from16 v14, v17

    goto/16 :goto_39

    :cond_16
    :goto_1a
    if-eq v5, v1, :cond_17

    :try_start_19
    iput v5, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lad/a;->b:Lad/a;

    invoke-virtual {v1, v2, v12, v5}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_5
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    const/4 v15, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v21, v3

    move-object v3, v9

    move-object/from16 v22, v4

    move-object v4, v12

    move-object/from16 v12, p3

    move-wide/from16 v23, v6

    move-object v6, v15

    move/from16 v7, v18

    :try_start_1a
    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    goto :goto_1b

    :cond_17
    move-object/from16 v12, p3

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-wide/from16 v23, v6

    :goto_1b
    move-object v5, v12

    move-wide v1, v13

    move-object/from16 v14, v17

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    move-wide/from16 v6, v23

    move-object/from16 v12, p5

    move-object/from16 v13, p7

    goto/16 :goto_16

    :catchall_3
    move-exception v0

    move-object/from16 v22, v4

    :goto_1c
    move-object v1, v0

    goto/16 :goto_26

    :catch_5
    move-exception v0

    move-object/from16 v22, v4

    :goto_1d
    move-object v1, v0

    goto/16 :goto_27

    :cond_18
    move-object/from16 v2, p3

    move-object/from16 v22, v4

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    if-eqz v1, :cond_19

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    move-result-object v1

    goto :goto_1e

    :cond_19
    const/4 v1, 0x0

    :goto_1e
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lad/b;->b()Z

    move-result v3

    if-eqz v3, :cond_1a

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    move v5, v3

    goto :goto_1f

    :cond_1a
    move v5, v12

    :goto_1f
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lad/b;->b()Z

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v1, Lad/a;->f:Lad/a;

    goto :goto_20

    :cond_1b
    sget-object v1, Lad/a;->e:Lad/a;

    goto :goto_20

    :cond_1c
    sget-object v1, Lad/a;->c:Lad/a;

    :goto_20
    move-object v4, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->a()Landroid/content/Context;

    move-result-object v1

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v1, v3}, Lv/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    sget-object v3, Lad/a;->c:Lad/a;

    if-ne v4, v3, :cond_22

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-ge v3, v6, :cond_1d

    invoke-static {v11}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-static {v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->u(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-static {v11}, Lvn/hunghd/flutterdownloader/DownloadWorker;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v9, v2, v6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1d
    iget-boolean v6, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Z
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_8
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    if-eqz v6, :cond_22

    const/16 v6, 0x1d

    if-ge v3, v6, :cond_1f

    if-eqz v1, :cond_1f

    if-eqz v22, :cond_1e

    invoke-virtual/range {v22 .. v22}, Ljava/io/OutputStream;->flush()V

    :try_start_1b
    invoke-virtual/range {v22 .. v22}, Ljava/io/OutputStream;->close()V
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_6

    goto :goto_21

    :catch_6
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1e
    :goto_21
    :try_start_1c
    invoke-virtual/range {p7 .. p7}, Ljava/io/InputStream;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_7

    goto :goto_22

    :catch_7
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_22
    invoke-virtual/range {v17 .. v17}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object v1, Lrb/h;->a:Lrb/h;

    return-void

    :cond_1f
    :try_start_1d
    sget-object v1, Lad/d;->a:Lad/d;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->a()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getApplicationContext(...)"

    invoke-static {v6, v7}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v6, v2, v11}, Lad/d;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_21

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Setting an intent to open the file "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    const/16 v2, 0x1f

    if-lt v3, v2, :cond_20

    const/high16 v2, 0x14000000

    goto :goto_23

    :cond_20
    const/high16 v2, 0x10000000

    :goto_23
    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->a()Landroid/content/Context;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v6, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    move-object v6, v1

    goto :goto_24

    :cond_21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "There\'s no application that can open the file "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    :cond_22
    const/4 v6, 0x0

    :goto_24
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v4, v5}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v1

    if-eqz v1, :cond_23

    move-object/from16 v12, p5

    goto :goto_25

    :cond_23
    const-string v12, "File downloaded"

    :goto_25
    invoke-virtual {v8, v12}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_8
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    move-object/from16 v16, p7

    move-object/from16 v11, v22

    goto/16 :goto_2e

    :catchall_4
    move-exception v0

    goto/16 :goto_1c

    :catch_8
    move-exception v0

    goto/16 :goto_1d

    :catchall_5
    move-exception v0

    move-object/from16 v22, v4

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    goto/16 :goto_1c

    :goto_26
    move-object/from16 v16, p7

    move-object/from16 v14, v17

    move-object/from16 v11, v22

    goto/16 :goto_3e

    :catch_9
    move-exception v0

    move-object/from16 v22, v4

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    goto/16 :goto_1d

    :goto_27
    move-object/from16 v16, p7

    move-object/from16 v14, v17

    move-object/from16 v11, v22

    goto/16 :goto_39

    :catchall_6
    move-exception v0

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    move-object v1, v0

    :goto_28
    move-object/from16 v16, p7

    move-object/from16 v14, v17

    const/4 v11, 0x0

    goto/16 :goto_3e

    :catch_a
    move-exception v0

    move-object/from16 p7, v13

    move-object/from16 v17, v14

    move-object v1, v0

    :goto_29
    move-object/from16 v16, p7

    move-object/from16 v14, v17

    const/4 v11, 0x0

    goto/16 :goto_39

    :goto_2a
    :try_start_1e
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lad/b;->b()Z

    move-result v1

    if-eqz v1, :cond_24

    sget-object v1, Lad/a;->f:Lad/a;

    goto :goto_2b

    :cond_24
    sget-object v1, Lad/a;->e:Lad/a;

    goto :goto_2b

    :cond_25
    sget-object v1, Lad/a;->d:Lad/a;

    :goto_2b
    move-object v4, v1

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    invoke-virtual {v1, v2, v4, v3}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    if-nez v9, :cond_26

    move-object/from16 v3, p2

    goto :goto_2c

    :cond_26
    move-object v3, v9

    :goto_2c
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->f()Z

    move-result v1

    if-eqz v1, :cond_27

    move-object/from16 v12, p5

    goto :goto_2d

    :cond_27
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server replied HTTP code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :goto_2d
    invoke-virtual {v8, v12}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_d
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    const/4 v11, 0x0

    const/16 v16, 0x0

    :goto_2e
    if-eqz v11, :cond_28

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_1f
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_b

    goto :goto_2f

    :catch_b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_28
    :goto_2f
    if-eqz v16, :cond_29

    :try_start_20
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_c

    goto :goto_30

    :catch_c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_29
    :goto_30
    move-object/from16 v14, v17

    goto/16 :goto_3d

    :catchall_7
    move-exception v0

    goto :goto_31

    :catch_d
    move-exception v0

    goto :goto_32

    :catchall_8
    move-exception v0

    move-object/from16 v17, v14

    :goto_31
    move-object v1, v0

    move-object/from16 v11, v17

    goto/16 :goto_34

    :catch_e
    move-exception v0

    move-object/from16 v17, v14

    :goto_32
    move-object v1, v0

    move-object/from16 v11, v17

    goto/16 :goto_36

    :cond_2a
    :pswitch_0
    move-object/from16 v17, v14

    const/4 v5, 0x1

    const/4 v6, 0x0

    :try_start_21
    const-string v7, "Response with redirection code"

    invoke-virtual {v8, v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    const-string v7, "Location"
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_10
    .catchall {:try_start_21 .. :try_end_21} :catchall_a

    move-object/from16 v11, v17

    :try_start_22
    invoke-virtual {v11, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Location = "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    new-instance v12, Ljava/net/URL;

    invoke-direct {v12, v13}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v13, Ljava/net/URL;

    invoke-direct {v13, v12, v7}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v13}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v13

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "New url: "

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_f
    .catchall {:try_start_22 .. :try_end_22} :catchall_9

    move-object v14, v11

    move-object/from16 v3, v18

    move-wide/from16 v6, v19

    goto/16 :goto_4

    :catchall_9
    move-exception v0

    goto :goto_33

    :catch_f
    move-exception v0

    goto :goto_35

    :catchall_a
    move-exception v0

    move-object/from16 v11, v17

    goto :goto_33

    :catch_10
    move-exception v0

    move-object/from16 v11, v17

    goto :goto_35

    :catchall_b
    move-exception v0

    move-object v11, v14

    :goto_33
    move-object v1, v0

    :goto_34
    move-object v14, v11

    goto :goto_37

    :catch_11
    move-exception v0

    move-object v11, v14

    :goto_35
    move-object v1, v0

    :goto_36
    move-object v14, v11

    goto :goto_38

    :cond_2b
    :try_start_23
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Stuck in redirect loop"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_23
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_12
    .catchall {:try_start_23 .. :try_end_23} :catchall_c

    :catchall_c
    move-exception v0

    move-object v1, v0

    goto :goto_37

    :catch_12
    move-exception v0

    move-object v1, v0

    goto :goto_38

    :catchall_d
    move-exception v0

    move-object v1, v0

    const/4 v14, 0x0

    :goto_37
    const/4 v11, 0x0

    const/16 v16, 0x0

    goto :goto_3e

    :catch_13
    move-exception v0

    move-object v1, v0

    const/4 v14, 0x0

    :goto_38
    const/4 v11, 0x0

    const/16 v16, 0x0

    :goto_39
    move-object/from16 v25, v9

    move-object v9, v1

    move-object/from16 v1, v25

    :try_start_24
    iget-object v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ld5/n;

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/d;->c()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lad/a;->d:Lad/a;

    iget v5, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:I

    invoke-virtual {v2, v3, v4, v5}, Ld5/n;->g(Ljava/lang/String;Lad/a;I)V

    if-nez v1, :cond_2c

    move-object/from16 v3, p2

    goto :goto_3a

    :cond_2c
    move-object v3, v1

    :goto_3a
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual {v9}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_e

    if-eqz v11, :cond_2d

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_25
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_14

    goto :goto_3b

    :catch_14
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2d
    :goto_3b
    if-eqz v16, :cond_2e

    :try_start_26
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_15

    goto :goto_3c

    :catch_15
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2e
    :goto_3c
    if-eqz v14, :cond_2f

    :goto_3d
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object v1, Lrb/h;->a:Lrb/h;

    :cond_2f
    return-void

    :catchall_e
    move-exception v0

    move-object v1, v0

    :goto_3e
    if-eqz v11, :cond_30

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_27
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_27 .. :try_end_27} :catch_16

    goto :goto_3f

    :catch_16
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_30
    :goto_3f
    if-eqz v16, :cond_31

    :try_start_28
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_28} :catch_17

    goto :goto_40

    :catch_17
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_31
    :goto_40
    if-eqz v14, :cond_32

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object v2, Lrb/h;->a:Lrb/h;

    :cond_32
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v0, "didInitializeDispatcher"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter p1

    :cond_0
    :goto_0
    :try_start_0
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->q:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v1, :cond_0

    const-string v2, ""

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    sget-object p2, Lrb/h;->a:Lrb/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_1
    return-void
.end method

.method public final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-gt v4, v2, :cond_6

    if-nez v5, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x20

    invoke-static {v6, v7}, Lec/i;->f(II)I

    move-result v6

    if-gtz v6, :cond_2

    move v6, v1

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    if-nez v5, :cond_4

    if-nez v6, :cond_3

    move v5, v1

    goto :goto_0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_6
    :goto_3
    add-int/2addr v2, v1

    invoke-interface {p1, v4, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string p1, "toUpperCase(...)"

    invoke-static {v0, p1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    return-object v0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->p:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->o:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {p2, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toUpperCase(...)"

    invoke-static {p1, p2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    move-object p2, v0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    if-nez p2, :cond_5

    const-string p2, "ISO-8859-1"

    :cond_5
    invoke-static {v1, p2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final s(Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "_data"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    filled-new-array {v0}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v4, p1

    .line 18
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-static {p1, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    move-object v0, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    :goto_0
    :try_start_2
    invoke-static {p1, v1}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 50
    :catchall_1
    move-exception v2

    .line 51
    :try_start_4
    invoke-static {p1, v0}, Lx6/b;->L(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    iget-boolean p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    const-string p1, "DownloadWorker"

    .line 64
    .line 65
    const-string v0, "Get a path for a MediaStore failed"

    .line 66
    .line 67
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    :cond_2
    return-object v1
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final t()I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/work/d;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x80

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getApplicationInfo(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 25
    .line 26
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 27
    .line 28
    const-string v2, "vn.hunghd.flutterdownloader.NOTIFICATION_ICON"

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return v0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return v0
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
.end method

.method public final w(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Z

    if-eqz v0, :cond_0

    const-string v0, "DownloadWorker"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final y(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Headers = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    const-string v2, "keys(...)"

    invoke-static {p2, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method

.method public final z(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-static {p3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p3, v0, p2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    new-instance p3, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Resume download: Range: bytes="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x2d

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v0, "Accept-Encoding"

    .line 46
    .line 47
    const-string v2, "identity"

    .line 48
    .line 49
    invoke-virtual {p1, v0, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "bytes="

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "Range"

    .line 73
    .line 74
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 79
    .line 80
    .line 81
    return-wide p2
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
