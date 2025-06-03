.class public final Lg1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg1/c$l;

.field public final synthetic b:Lg1/c$k;


# direct methods
.method public constructor <init>(Lg1/c$k;Lg1/c$m;)V
    .locals 0

    iput-object p1, p0, Lg1/q;->b:Lg1/c$k;

    iput-object p2, p0, Lg1/q;->a:Lg1/c$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg1/q;->a:Lg1/c$l;

    check-cast v0, Lg1/c$m;

    invoke-virtual {v0}, Lg1/c$m;->a()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lg1/q;->b:Lg1/c$k;

    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    iget-object v1, v1, Lg1/c;->d:Lr/b;

    invoke-virtual {v1, v0}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c$c;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    :cond_0
    return-void
.end method
