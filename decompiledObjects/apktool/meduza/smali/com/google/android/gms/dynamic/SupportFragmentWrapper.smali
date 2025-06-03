.class public final Lcom/google/android/gms/dynamic/SupportFragmentWrapper;
.super Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;
.source "SourceFile"


# instance fields
.field public final a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    return-void
.end method

.method public static wrap(Lx0/i;)Lcom/google/android/gms/dynamic/SupportFragmentWrapper;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;

    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;-><init>(Lx0/i;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final B(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->setHasOptionsMenu(Z)V

    return-void
.end method

.method public final G0(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final I2(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->setUserVisibleHint(Z)V

    return-void
.end method

.method public final P1(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->registerForContextMenu(Landroid/view/View;)V

    return-void
.end method

.method public final U(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->setMenuVisibility(Z)V

    return-void
.end method

.method public final Y2()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isVisible()Z

    move-result v0

    return v0
.end method

.method public final Z1(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->unregisterForContextMenu(Landroid/view/View;)V

    return-void
.end method

.method public final q2(ILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p2, p1}, Lx0/i;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final w0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->setRetainInstance(Z)V

    return-void
.end method

.method public final zzb()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getId()I

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getTargetRequestCode()I

    move-result v0

    return v0
.end method

.method public final zzd()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getParentFragment()Lx0/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->wrap(Lx0/i;)Lcom/google/android/gms/dynamic/SupportFragmentWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getTargetFragment()Lx0/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->wrap(Lx0/i;)Lcom/google/android/gms/dynamic/SupportFragmentWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getActivity()Lx0/m;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzs()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getRetainInstance()Z

    move-result v0

    return v0
.end method

.method public final zzt()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getUserVisibleHint()Z

    move-result v0

    return v0
.end method

.method public final zzu()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isAdded()Z

    move-result v0

    return v0
.end method

.method public final zzv()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isDetached()Z

    move-result v0

    return v0
.end method

.method public final zzw()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isHidden()Z

    move-result v0

    return v0
.end method

.method public final zzx()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isInLayout()Z

    move-result v0

    return v0
.end method

.method public final zzy()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isRemoving()Z

    move-result v0

    return v0
.end method

.method public final zzz()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->isResumed()Z

    move-result v0

    return v0
.end method
