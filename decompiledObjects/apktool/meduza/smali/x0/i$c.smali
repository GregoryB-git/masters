.class public final Lx0/i$c;
.super Lx0/i$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;)V
    .locals 0

    iput-object p1, p0, Lx0/i$c;->a:Lx0/i;

    invoke-direct {p0}, Lx0/i$m;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lx0/i$c;->a:Lx0/i;

    iget-object v0, v0, Lx0/i;->mSavedStateRegistryController:Ls1/d;

    invoke-virtual {v0}, Ls1/d;->a()V

    iget-object v0, p0, Lx0/i$c;->a:Lx0/i;

    invoke-static {v0}, Lb1/h0;->b(Ls1/e;)V

    iget-object v0, p0, Lx0/i$c;->a:Lx0/i;

    iget-object v0, v0, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "registryState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lx0/i$c;->a:Lx0/i;

    iget-object v1, v1, Lx0/i;->mSavedStateRegistryController:Ls1/d;

    invoke-virtual {v1, v0}, Ls1/d;->b(Landroid/os/Bundle;)V

    return-void
.end method
