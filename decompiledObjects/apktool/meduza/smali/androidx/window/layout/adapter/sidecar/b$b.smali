.class public final Landroidx/window/layout/adapter/sidecar/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/adapter/sidecar/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ld0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/a<",
            "Li2/k;",
            ">;"
        }
    .end annotation
.end field

.field public d:Li2/k;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lm1/b;Lx0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/adapter/sidecar/b$b;->a:Landroid/app/Activity;

    iput-object p2, p0, Landroidx/window/layout/adapter/sidecar/b$b;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/window/layout/adapter/sidecar/b$b;->c:Ld0/a;

    return-void
.end method
