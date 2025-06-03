.class public final Lgb/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    iput-object p1, p0, Lgb/s1;->a:Lgb/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lgb/s1;->a:Lgb/r1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgb/r1;->L(Z)V

    return-void
.end method
