.class public final Lgb/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/m2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgb/m2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lgb/h3$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgb/h3$c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgb/h3$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgb/h3$c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/j3;->a:Lgb/h3$c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lgb/j3;->a:Lgb/h3$c;

    invoke-static {v0, p1}, Lgb/h3;->b(Lgb/h3$c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lgb/j3;->a:Lgb/h3$c;

    invoke-static {v0}, Lgb/h3;->a(Lgb/h3$c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
