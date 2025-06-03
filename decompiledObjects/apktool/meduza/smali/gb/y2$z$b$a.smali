.class public final Lgb/y2$z$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2$z$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/y2$z$b;


# direct methods
.method public constructor <init>(Lgb/y2$z$b;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$z$b$a;->a:Lgb/y2$z$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgb/y2$z$b$a;->a:Lgb/y2$z$b;

    iget-object v1, v0, Lgb/y2$z$b;->b:Lgb/y2$z;

    iget-object v1, v1, Lgb/y2$z;->b:Lgb/y2;

    iget-object v0, v0, Lgb/y2$z$b;->a:Lgb/y2$a0;

    sget-object v2, Lgb/y2;->A:Leb/s0$b;

    invoke-virtual {v1, v0}, Lgb/y2;->t(Lgb/y2$a0;)V

    return-void
.end method
