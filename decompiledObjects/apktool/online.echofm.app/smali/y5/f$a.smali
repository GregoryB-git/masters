.class public Ly5/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly5/f;->q(Landroid/content/Context;Ly5/f$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ly5/f;


# direct methods
.method public constructor <init>(Ly5/f;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly5/f$a;->p:Ly5/f;

    .line 2
    .line 3
    iput-object p2, p0, Ly5/f$a;->o:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Ly5/f$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly5/f$a;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()Ly5/f$b;
    .locals 8

    .line 1
    const-string v0, "FlutterLoader initTask"

    .line 2
    .line 3
    invoke-static {v0}, LT5/f;->i(Ljava/lang/String;)LT5/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    iget-object v1, p0, Ly5/f$a;->p:Ly5/f;

    .line 8
    .line 9
    iget-object v2, p0, Ly5/f$a;->o:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ly5/f;->c(Ly5/f;Landroid/content/Context;)Ly5/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :try_start_1
    iget-object v1, p0, Ly5/f$a;->p:Ly5/f;

    .line 15
    .line 16
    invoke-static {v1}, Ly5/f;->d(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary()V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    iget-object v1, p0, Ly5/f$a;->p:Ly5/f;

    .line 24
    .line 25
    invoke-static {v1}, Ly5/f;->d(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->updateRefreshRate()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ly5/f$a;->p:Ly5/f;

    .line 33
    .line 34
    invoke-static {v1}, Ly5/f;->f(Ly5/f;)Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ly5/e;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Ly5/e;-><init>(Ly5/f$a;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ly5/f$b;

    .line 47
    .line 48
    iget-object v2, p0, Ly5/f$a;->o:Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {v2}, LT5/c;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v3, p0, Ly5/f$a;->o:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {v3}, LT5/c;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, p0, Ly5/f$a;->o:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {v4}, LT5/c;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-direct {v1, v2, v3, v4, v5}, Ly5/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly5/f$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, LT5/f;->close()V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-object v1

    .line 76
    :catchall_0
    move-exception v1

    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move-exception v1

    .line 79
    :try_start_3
    const-string v2, "couldn\'t find \"libflutter.so\""

    .line 80
    .line 81
    const-string v3, "dlopen failed: library \"libflutter.so\" not found"

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    throw v1

    .line 105
    :cond_2
    :goto_0
    const-string v2, "os.arch"

    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v3, Ljava/io/File;

    .line 112
    .line 113
    iget-object v4, p0, Ly5/f$a;->p:Ly5/f;

    .line 114
    .line 115
    invoke-static {v4}, Ly5/f;->e(Ly5/f;)Ly5/b;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iget-object v4, v4, Ly5/b;->f:Ljava/lang/String;

    .line 120
    .line 121
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    .line 129
    .line 130
    new-instance v6, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v7, "Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: "

    .line 136
    .line 137
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v2, ", and the native libraries directory (with path "

    .line 144
    .line 145
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v2, ") contains the following files: "

    .line 156
    .line 157
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-direct {v5, v2, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 175
    :goto_1
    if-eqz v0, :cond_3

    .line 176
    .line 177
    :try_start_4
    invoke-virtual {v0}, LT5/f;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    :cond_3
    :goto_2
    throw v1
.end method

.method public final synthetic c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly5/f$a;->p:Ly5/f;

    .line 2
    .line 3
    invoke-static {v0}, Ly5/f;->d(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly5/f$a;->b()Ly5/f$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
