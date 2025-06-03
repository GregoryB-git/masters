.class public final Lt5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/a$b;
    }
.end annotation


# static fields
.field public static d:Lt5/a;

.field public static e:Z


# instance fields
.field public a:Ly5/f;

.field public b:Lio/flutter/embedding/engine/FlutterJNI$c;

.field public c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ly5/f;Lx5/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/a;->a:Ly5/f;

    iput-object p3, p0, Lt5/a;->b:Lio/flutter/embedding/engine/FlutterJNI$c;

    iput-object p4, p0, Lt5/a;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public synthetic constructor <init>(Ly5/f;Lx5/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;Lt5/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lt5/a;-><init>(Ly5/f;Lx5/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static e()Lt5/a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lt5/a;->e:Z

    .line 3
    .line 4
    sget-object v0, Lt5/a;->d:Lt5/a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lt5/a$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lt5/a$b;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lt5/a$b;->a()Lt5/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lt5/a;->d:Lt5/a;

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lt5/a;->d:Lt5/a;

    .line 20
    .line 21
    return-object v0
.end method


# virtual methods
.method public a()Lx5/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/a;->c:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ly5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/a;->a:Ly5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lio/flutter/embedding/engine/FlutterJNI$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/a;->b:Lio/flutter/embedding/engine/FlutterJNI$c;

    .line 2
    .line 3
    return-object v0
.end method
