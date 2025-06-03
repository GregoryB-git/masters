.class public final Lgb/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/StringBuilder;

.field public final synthetic b:Lgb/d0;


# direct methods
.method public constructor <init>(Lgb/d0;Ljava/lang/StringBuilder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgb/c0;->b:Lgb/d0;

    iput-object p2, p0, Lgb/c0;->a:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgb/c0;->b:Lgb/d0;

    sget-object v1, Leb/e1;->h:Leb/e1;

    iget-object v2, p0, Lgb/c0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lgb/d0;->g(Leb/e1;Z)V

    return-void
.end method
