.class public final Lp3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/d;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lq3/n;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ll3/e;

.field public final d:Lr3/d;

.field public final e:Ls3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lk3/w;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lp3/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ll3/e;Lq3/n;Lr3/d;Ls3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lp3/c;->c:Ll3/e;

    iput-object p3, p0, Lp3/c;->a:Lq3/n;

    iput-object p4, p0, Lp3/c;->d:Lr3/d;

    iput-object p5, p0, Lp3/c;->e:Ls3/b;

    return-void
.end method


# virtual methods
.method public final a(Lh3/j;Lk3/h;Lk3/j;)V
    .locals 8

    iget-object v0, p0, Lp3/c;->b:Ljava/util/concurrent/Executor;

    new-instance v7, Lp3/a;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lp3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
