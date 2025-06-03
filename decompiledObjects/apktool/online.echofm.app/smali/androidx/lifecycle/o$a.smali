.class public Landroidx/lifecycle/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/o$a;->o:Landroidx/lifecycle/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/o$a;->o:Landroidx/lifecycle/o;

    invoke-virtual {v0}, Landroidx/lifecycle/o;->f()V

    iget-object v0, p0, Landroidx/lifecycle/o$a;->o:Landroidx/lifecycle/o;

    invoke-virtual {v0}, Landroidx/lifecycle/o;->h()V

    return-void
.end method
