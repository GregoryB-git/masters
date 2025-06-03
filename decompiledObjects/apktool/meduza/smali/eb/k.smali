.class public final Leb/k;
.super Leb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/k$a;,
        Leb/k$b;
    }
.end annotation


# instance fields
.field public final a:Leb/b;

.field public final b:Leb/b;


# direct methods
.method public constructor <init>(Leb/b;Leb/b;)V
    .locals 1

    invoke-direct {p0}, Leb/b;-><init>()V

    const-string v0, "creds1"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Leb/k;->a:Leb/b;

    iput-object p2, p0, Leb/k;->b:Leb/b;

    return-void
.end method


# virtual methods
.method public final a(Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;)V
    .locals 8

    iget-object v0, p0, Leb/k;->a:Leb/b;

    new-instance v7, Leb/k$b;

    invoke-static {}, Leb/p;->b()Leb/p;

    move-result-object v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Leb/k$b;-><init>(Leb/k;Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;Leb/p;)V

    invoke-virtual {v0, p1, p2, v7}, Leb/b;->a(Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;)V

    return-void
.end method
