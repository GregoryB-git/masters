.class public Lg1/c$e$a;
.super Landroid/service/media/MediaBrowserService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lg1/c$e;


# direct methods
.method public constructor <init>(Lg1/c$e;Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$e$a;->a:Lg1/c$e;

    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    invoke-virtual {p0, p2}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .locals 11

    .line 1
    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg1/c$e$a;->a:Lg1/c$e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p3, -0x1

    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "extra_client_version"

    .line 24
    .line 25
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Landroid/os/Messenger;

    .line 35
    .line 36
    iget-object v4, v0, Lg1/c$e;->d:Lg1/c;

    .line 37
    .line 38
    iget-object v4, v4, Lg1/c;->e:Lg1/c$n;

    .line 39
    .line 40
    invoke-direct {v3, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 41
    .line 42
    .line 43
    iput-object v3, v0, Lg1/c$e;->c:Landroid/os/Messenger;

    .line 44
    .line 45
    new-instance v3, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    const-string v5, "extra_service_version"

    .line 52
    .line 53
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v0, Lg1/c$e;->c:Landroid/os/Messenger;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "extra_messenger"

    .line 63
    .line 64
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 65
    .line 66
    .line 67
    iget-object v4, v0, Lg1/c$e;->d:Lg1/c;

    .line 68
    .line 69
    iget-object v4, v4, Lg1/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/IMediaSession;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v4, :cond_1

    .line 78
    .line 79
    move-object v4, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-interface {v4}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    :goto_1
    const-string v5, "extra_session_binder"

    .line 86
    .line 87
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iget-object v4, v0, Lg1/c$e;->a:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_2
    const-string v4, "extra_calling_pid"

    .line 97
    .line 98
    invoke-virtual {v2, v4, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move v8, p3

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    move v8, p3

    .line 108
    move-object v3, v1

    .line 109
    :goto_3
    new-instance p3, Lg1/c$c;

    .line 110
    .line 111
    iget-object v6, v0, Lg1/c$e;->d:Lg1/c;

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    move-object v5, p3

    .line 115
    move-object v7, p1

    .line 116
    move v9, p2

    .line 117
    invoke-direct/range {v5 .. v10}, Lg1/c$c;-><init>(Lg1/c;Ljava/lang/String;IILg1/c$l;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v0, Lg1/c$e;->d:Lg1/c;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object p1, v0, Lg1/c$e;->d:Lg1/c;

    .line 126
    .line 127
    invoke-virtual {p1, v2}, Lg1/c;->b(Landroid/os/Bundle;)Lg1/c$b;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p2, v0, Lg1/c$e;->d:Lg1/c;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    if-nez p1, :cond_4

    .line 137
    .line 138
    move-object p2, v1

    .line 139
    goto :goto_5

    .line 140
    :cond_4
    iget-object p2, v0, Lg1/c$e;->c:Landroid/os/Messenger;

    .line 141
    .line 142
    if-eqz p2, :cond_5

    .line 143
    .line 144
    iget-object p2, v0, Lg1/c$e;->d:Lg1/c;

    .line 145
    .line 146
    iget-object p2, p2, Lg1/c;->c:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    if-nez v3, :cond_6

    .line 152
    .line 153
    iget-object v3, p1, Lg1/c$b;->b:Landroid/os/Bundle;

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    iget-object p2, p1, Lg1/c$b;->b:Landroid/os/Bundle;

    .line 157
    .line 158
    if-eqz p2, :cond_7

    .line 159
    .line 160
    invoke-virtual {v3, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    :goto_4
    new-instance p2, Lg1/c$b;

    .line 164
    .line 165
    iget-object p1, p1, Lg1/c$b;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-direct {p2, v3, p1}, Lg1/c$b;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :goto_5
    if-nez p2, :cond_8

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    new-instance v1, Landroid/service/media/MediaBrowserService$BrowserRoot;

    .line 174
    .line 175
    iget-object p1, p2, Lg1/c$b;->a:Ljava/lang/String;

    .line 176
    .line 177
    iget-object p2, p2, Lg1/c$b;->b:Landroid/os/Bundle;

    .line 178
    .line 179
    invoke-direct {v1, p1, p2}, Landroid/service/media/MediaBrowserService$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 180
    .line 181
    .line 182
    :goto_6
    return-object v1
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

.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lg1/c$e$a;->a:Lg1/c$e;

    new-instance v1, Lg1/c$j;

    invoke-direct {v1, p2}, Lg1/c$j;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lg1/g;

    invoke-direct {p2, p1, v1}, Lg1/g;-><init>(Ljava/lang/Object;Lg1/c$j;)V

    iget-object v1, v0, Lg1/c$e;->d:Lg1/c;

    iget-object v2, v1, Lg1/c;->b:Lg1/c$c;

    invoke-virtual {v1, p1, p2}, Lg1/c;->d(Ljava/lang/String;Lg1/c$i;)V

    iget-object p1, v0, Lg1/c$e;->d:Lg1/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
