.class public final Lio/meduza/meduza/MainActivity;
.super Lio/flutter/embedding/android/FlutterActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/meduza/meduza/MainActivity$a;
    }
.end annotation


# static fields
.field public static final synthetic r:I


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lio/flutter/plugin/common/MethodChannel;

.field public c:Lb1/v;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lob/b;

.field public f:Landroid/net/ConnectivityManager;

.field public o:Lio/meduza/meduza/MainActivity$b;

.field public p:Landroid/net/NetworkCapabilities;

.field public final q:Lio/meduza/meduza/MainActivity$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/android/FlutterActivity;-><init>()V

    const-string v0, "meduza.meduza.io/mobile_proxy"

    iput-object v0, p0, Lio/meduza/meduza/MainActivity;->a:Ljava/lang/String;

    new-instance v0, Lio/meduza/meduza/MainActivity$b;

    invoke-direct {v0, p0}, Lio/meduza/meduza/MainActivity$b;-><init>(Lio/meduza/meduza/MainActivity;)V

    iput-object v0, p0, Lio/meduza/meduza/MainActivity;->q:Lio/meduza/meduza/MainActivity$b;

    return-void
.end method

.method public static final a(Lio/meduza/meduza/MainActivity;Landroid/net/NetworkCapabilities;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getTransportInfo"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    instance-of v0, p1, Landroid/net/wifi/WifiInfo;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/net/wifi/WifiInfo;

    goto :goto_1

    :cond_1
    move-object p1, p0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v1, "config"

    .line 5
    .line 6
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    instance-of v2, v1, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v1, v0

    .line 20
    :goto_1
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const-string v2, "domains"

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object p1, v0

    .line 30
    :goto_2
    instance-of v2, p1, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_3
    move-object p1, v0

    .line 38
    :goto_3
    new-instance v2, Lec/s;

    .line 39
    .line 40
    invoke-direct {v2}, Lec/s;-><init>()V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    :try_start_0
    iget-object v4, p0, Lio/meduza/meduza/MainActivity;->e:Lob/b;

    .line 45
    .line 46
    if-nez v4, :cond_4

    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    goto :goto_4

    .line 50
    :cond_4
    sget-object v5, Lio/meduza/meduza/MainActivity$a;->a:[I

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    aget v4, v5, v4

    .line 57
    .line 58
    :goto_4
    const/4 v5, 0x1

    .line 59
    if-eq v4, v5, :cond_6

    .line 60
    .line 61
    if-ne v4, v3, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lio/meduza/meduza/MainActivity;->c:Lb1/v;

    .line 64
    .line 65
    if-eqz p1, :cond_7

    .line 66
    .line 67
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lmobileproxy/StreamDialer;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Lmobileproxy/StreamDialer;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v1, "localhost:0"

    .line 76
    .line 77
    invoke-static {v1, v0}, Lmobileproxy/Mobileproxy;->runProxy(Ljava/lang/String;Lmobileproxy/StreamDialer;)Lmobileproxy/Proxy;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p1, Lb1/v;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lmobileproxy/Proxy;->address()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string p1, "address(...)"

    .line 91
    .line 92
    invoke-static {v0, p1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    iget-object v0, p0, Lio/meduza/meduza/MainActivity;->e:Lob/b;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v4, "Invalid mode: "

    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_6
    iget-object v4, p0, Lio/meduza/meduza/MainActivity;->c:Lb1/v;

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v1, p1}, Lb1/v;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_7
    :goto_5
    iput-object v0, v2, Lec/s;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :catch_0
    move-exception p1

    .line 139
    invoke-static {}, Lf8/c;->a()Lf8/c;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v1, p0, Lio/meduza/meduza/MainActivity;->e:Lob/b;

    .line 144
    .line 145
    new-instance v4, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v5, "mobile-proxy-["

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v1, "]: failed to start"

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v0, v0, Lf8/c;->a:Lj8/s;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    iget-wide v6, v0, Lj8/s;->d:J

    .line 177
    .line 178
    sub-long/2addr v4, v6

    .line 179
    iget-object v6, v0, Lj8/s;->p:Lk8/i;

    .line 180
    .line 181
    iget-object v6, v6, Lk8/i;->a:Lk8/b;

    .line 182
    .line 183
    new-instance v7, Lj8/q;

    .line 184
    .line 185
    invoke-direct {v7, v0, v4, v5, v1}, Lj8/q;-><init>(Lj8/s;JLjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v7}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Lf8/c;->a()Lf8/c;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0, p1}, Lf8/c;->b(Ljava/lang/Exception;)V

    .line 196
    .line 197
    .line 198
    :goto_6
    new-instance p1, Lio/flutter/plugins/firebase/firestore/streamhandler/b;

    .line 199
    .line 200
    invoke-direct {p1, v3, p0, v2}, Lio/flutter/plugins/firebase/firestore/streamhandler/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 204
    .line 205
    .line 206
    return-void
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

.method public final configureFlutterEngine(Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 2

    const-string v0, "flutterEngine"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/flutter/embedding/android/FlutterActivity;->configureFlutterEngine(Lio/flutter/embedding/engine/FlutterEngine;)V

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    iget-object v1, p0, Lio/meduza/meduza/MainActivity;->a:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lio/meduza/meduza/MainActivity;->b:Lio/flutter/plugin/common/MethodChannel;

    new-instance p1, Lb1/v;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, Lb1/v;-><init>(I)V

    iput-object p1, p0, Lio/meduza/meduza/MainActivity;->c:Lb1/v;

    iget-object p1, p0, Lio/meduza/meduza/MainActivity;->b:Lio/flutter/plugin/common/MethodChannel;

    if-eqz p1, :cond_0

    new-instance v0, Lob/a;

    invoke-direct {v0, p0}, Lob/a;-><init>(Lio/meduza/meduza/MainActivity;)V

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lio/flutter/embedding/android/FlutterActivity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "connectivity"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lio/meduza/meduza/MainActivity;->f:Landroid/net/ConnectivityManager;

    return-void
.end method

.method public final provideFlutterEngine(Landroid/content/Context;)Lio/flutter/embedding/engine/FlutterEngine;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->i(Landroid/content/Context;)Lio/flutter/embedding/engine/FlutterEngine;

    move-result-object p1

    return-object p1
.end method
