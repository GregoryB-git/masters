.class public final Lgb/r1$m$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/r1$m$e;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lgb/r1$m$e;


# direct methods
.method public constructor <init>(Lgb/r1$m$e;Lgb/b0;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$m$e$a;->b:Lgb/r1$m$e;

    iput-object p2, p0, Lgb/r1$m$e$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgb/r1$m$e$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lgb/r1$m$e$a;->b:Lgb/r1$m$e;

    iget-object v1, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    iget-object v1, v1, Lgb/r1$m;->e:Lgb/r1;

    iget-object v1, v1, Lgb/r1;->n:Leb/h1;

    new-instance v2, Lgb/r1$m$e$b;

    invoke-direct {v2, v0}, Lgb/r1$m$e$b;-><init>(Lgb/r1$m$e;)V

    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
