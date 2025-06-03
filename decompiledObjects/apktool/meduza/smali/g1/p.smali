.class public final Lg1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg1/c$l;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lg1/c$k;


# direct methods
.method public constructor <init>(IILandroid/os/Bundle;Lg1/c$k;Lg1/c$m;Ljava/lang/String;)V
    .locals 0

    iput-object p4, p0, Lg1/p;->e:Lg1/c$k;

    iput-object p5, p0, Lg1/p;->a:Lg1/c$l;

    iput p1, p0, Lg1/p;->b:I

    iput-object p6, p0, Lg1/p;->c:Ljava/lang/String;

    iput p2, p0, Lg1/p;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget-object v0, p0, Lg1/p;->a:Lg1/c$l;

    check-cast v0, Lg1/c$m;

    invoke-virtual {v0}, Lg1/c$m;->a()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lg1/p;->e:Lg1/c$k;

    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    iget-object v1, v1, Lg1/c;->d:Lr/b;

    invoke-virtual {v1, v0}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lg1/p;->e:Lg1/c$k;

    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    iget-object v1, v1, Lg1/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c$c;

    iget v4, v2, Lg1/c$c;->c:I

    iget v5, p0, Lg1/p;->b:I

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lg1/p;->c:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    iget v4, p0, Lg1/p;->d:I

    if-gtz v4, :cond_2

    :cond_1
    new-instance v3, Lg1/c$c;

    iget-object v4, p0, Lg1/p;->e:Lg1/c$k;

    iget-object v6, v4, Lg1/c$k;->a:Lg1/c;

    iget-object v7, v2, Lg1/c$c;->a:Ljava/lang/String;

    iget v8, v2, Lg1/c$c;->b:I

    iget v9, v2, Lg1/c$c;->c:I

    iget-object v10, p0, Lg1/p;->a:Lg1/c$l;

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lg1/c$c;-><init>(Lg1/c;Ljava/lang/String;IILg1/c$l;)V

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    :cond_3
    if-nez v3, :cond_4

    new-instance v3, Lg1/c$c;

    iget-object v1, p0, Lg1/p;->e:Lg1/c$k;

    iget-object v5, v1, Lg1/c$k;->a:Lg1/c;

    iget-object v6, p0, Lg1/p;->c:Ljava/lang/String;

    iget v7, p0, Lg1/p;->d:I

    iget v8, p0, Lg1/p;->b:I

    iget-object v9, p0, Lg1/p;->a:Lg1/c$l;

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Lg1/c$c;-><init>(Lg1/c;Ljava/lang/String;IILg1/c$l;)V

    :cond_4
    iget-object v1, p0, Lg1/p;->e:Lg1/c$k;

    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    iget-object v1, v1, Lg1/c;->d:Lr/b;

    invoke-virtual {v1, v0, v3}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "MBServiceCompat"

    const-string v1, "IBinder is already dead."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
