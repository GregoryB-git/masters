.class public final Lgb/y2$z$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2$z;->d(Leb/e1;Lgb/t$a;Leb/s0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/y2$a0;

.field public final synthetic b:Lgb/y2$z;


# direct methods
.method public constructor <init>(Lgb/y2$z;Lgb/y2$a0;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$z$d;->b:Lgb/y2$z;

    iput-object p2, p0, Lgb/y2$z$d;->a:Lgb/y2$a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgb/y2$z$d;->b:Lgb/y2$z;

    iget-object v0, v0, Lgb/y2$z;->b:Lgb/y2;

    iget-object v1, p0, Lgb/y2$z$d;->a:Lgb/y2$a0;

    sget-object v2, Lgb/y2;->A:Leb/s0$b;

    invoke-virtual {v0, v1}, Lgb/y2;->t(Lgb/y2$a0;)V

    return-void
.end method
