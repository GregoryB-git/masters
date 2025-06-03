.class public final Lgb/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/u$a;


# direct methods
.method public constructor <init>(Lgb/u$a;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lgb/a1;->a:Lgb/u$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgb/a1;->a:Lgb/u$a;

    invoke-interface {v0}, Lgb/u$a;->i()V

    return-void
.end method
