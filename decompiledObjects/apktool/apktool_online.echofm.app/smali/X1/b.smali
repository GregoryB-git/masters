.class public final synthetic LX1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/net/URL;

.field public final synthetic p:Lkotlin/jvm/internal/u;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic s:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public synthetic constructor <init>(Ljava/net/URL;Lkotlin/jvm/internal/u;Ljava/lang/String;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX1/b;->o:Ljava/net/URL;

    .line 5
    .line 6
    iput-object p2, p0, LX1/b;->p:Lkotlin/jvm/internal/u;

    .line 7
    .line 8
    iput-object p3, p0, LX1/b;->q:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LX1/b;->r:Ljava/util/concurrent/locks/ReentrantLock;

    .line 11
    .line 12
    iput-object p5, p0, LX1/b;->s:Ljava/util/concurrent/locks/Condition;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LX1/b;->o:Ljava/net/URL;

    .line 2
    .line 3
    iget-object v1, p0, LX1/b;->p:Lkotlin/jvm/internal/u;

    .line 4
    .line 5
    iget-object v2, p0, LX1/b;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, LX1/b;->r:Ljava/util/concurrent/locks/ReentrantLock;

    .line 8
    .line 9
    iget-object v4, p0, LX1/b;->s:Ljava/util/concurrent/locks/Condition;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LX1/c;->a(Ljava/net/URL;Lkotlin/jvm/internal/u;Ljava/lang/String;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
