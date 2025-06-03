.class public final Lx0/m$a;
.super Lx0/t;
.source "SourceFile"

# interfaces
.implements Lv/c;
.implements Lv/d;
.implements Lu/v;
.implements Lu/w;
.implements Lb1/t0;
.implements Lb/y;
.implements Ld/h;
.implements Ls1/e;
.implements Lx0/c0;
.implements Le0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx0/t<",
        "Lx0/m;",
        ">;",
        "Lv/c;",
        "Lv/d;",
        "Lu/v;",
        "Lu/w;",
        "Lb1/t0;",
        "Lb/y;",
        "Ld/h;",
        "Ls1/e;",
        "Lx0/c0;",
        "Le0/j;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lx0/m;


# direct methods
.method public constructor <init>(Lx0/m;)V
    .locals 0

    iput-object p1, p0, Lx0/m$a;->e:Lx0/m;

    invoke-direct {p0, p1}, Lx0/t;-><init>(Lx0/m;)V

    return-void
.end method


# virtual methods
.method public final a(Lx0/i;)V
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lx0/m;->onAttachFragment(Lx0/i;)V

    return-void
.end method

.method public final addMenuProvider(Le0/o;)V
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->addMenuProvider(Le0/o;)V

    return-void
.end method

.method public final addOnConfigurationChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->addOnConfigurationChangedListener(Ld0/a;)V

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Lu/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->addOnMultiWindowModeChangedListener(Ld0/a;)V

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Lu/y;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->addOnPictureInPictureModeChangedListener(Ld0/a;)V

    return-void
.end method

.method public final addOnTrimMemoryListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->addOnTrimMemoryListener(Ld0/a;)V

    return-void
.end method

.method public final b(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d(Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    const-string v1, "  "

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, p2}, Lx0/m;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final e()Lx0/m;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    return-object v0
.end method

.method public final f()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-static {v0, p1}, Lu/b;->b(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final getActivityResultRegistry()Ld/g;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Lb/j;->getActivityResultRegistry()Ld/g;

    move-result-object v0

    return-object v0
.end method

.method public final getLifecycle()Lb1/k;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    iget-object v0, v0, Lx0/m;->mFragmentLifecycleRegistry:Lb1/p;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Lb/w;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Lb/j;->getOnBackPressedDispatcher()Lb/w;

    move-result-object v0

    return-object v0
.end method

.method public final getSavedStateRegistry()Ls1/c;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Lb/j;->getSavedStateRegistry()Ls1/c;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Lb1/s0;
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Lb/j;->getViewModelStore()Lb1/s0;

    move-result-object v0

    return-object v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0}, Lb/j;->invalidateMenu()V

    return-void
.end method

.method public final removeMenuProvider(Le0/o;)V
    .locals 1

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->removeMenuProvider(Le0/o;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->removeOnConfigurationChangedListener(Ld0/a;)V

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Lu/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->removeOnMultiWindowModeChangedListener(Ld0/a;)V

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Lu/y;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->removeOnPictureInPictureModeChangedListener(Ld0/a;)V

    return-void
.end method

.method public final removeOnTrimMemoryListener(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$a;->e:Lx0/m;

    invoke-virtual {v0, p1}, Lb/j;->removeOnTrimMemoryListener(Ld0/a;)V

    return-void
.end method
