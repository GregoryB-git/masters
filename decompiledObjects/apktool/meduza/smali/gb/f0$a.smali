.class public final Lgb/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/f0;->g(Lgb/h2$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/h2$a;


# direct methods
.method public constructor <init>(Lgb/r1$g;)V
    .locals 0

    iput-object p1, p0, Lgb/f0$a;->a:Lgb/h2$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lgb/f0$a;->a:Lgb/h2$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lgb/h2$a;->e(Z)V

    return-void
.end method
