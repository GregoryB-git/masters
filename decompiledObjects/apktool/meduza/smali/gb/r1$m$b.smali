.class public final Lgb/r1$m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/r1$m;->v(Leb/t0;Leb/c;)Leb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/r1$m;


# direct methods
.method public constructor <init>(Lgb/r1$m;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$m$b;->a:Lgb/r1$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgb/r1$m$b;->a:Lgb/r1$m;

    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    invoke-virtual {v0}, Lgb/r1;->M()V

    return-void
.end method
