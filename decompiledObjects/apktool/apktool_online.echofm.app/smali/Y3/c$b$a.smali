.class public LY3/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY3/c$b;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LY3/c$b;


# direct methods
.method public constructor <init>(LY3/c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY3/c$b$a;->a:LY3/c$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, LY3/c$b$a;->a:LY3/c$b;

    .line 2
    .line 3
    iget-object p1, p1, LY3/c$b;->a:LY3/c;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, LY3/c;->g(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
