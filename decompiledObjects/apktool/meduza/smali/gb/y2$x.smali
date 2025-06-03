.class public final Lgb/y2$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/y2$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "x"
.end annotation


# instance fields
.field public final synthetic a:Lgb/y2;


# direct methods
.method public constructor <init>(Lgb/y2;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$x;->a:Lgb/y2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/y2$a0;)V
    .locals 3

    iget-object v0, p1, Lgb/y2$a0;->a:Lgb/s;

    new-instance v1, Lgb/y2$z;

    iget-object v2, p0, Lgb/y2$x;->a:Lgb/y2;

    invoke-direct {v1, v2, p1}, Lgb/y2$z;-><init>(Lgb/y2;Lgb/y2$a0;)V

    invoke-interface {v0, v1}, Lgb/s;->l(Lgb/t;)V

    return-void
.end method
