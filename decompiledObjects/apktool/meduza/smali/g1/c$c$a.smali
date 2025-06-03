.class public final Lg1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/c$c;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg1/c$c;


# direct methods
.method public constructor <init>(Lg1/c$c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$c$a;->a:Lg1/c$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg1/c$c$a;->a:Lg1/c$c;

    iget-object v1, v0, Lg1/c$c;->g:Lg1/c;

    iget-object v1, v1, Lg1/c;->d:Lr/b;

    iget-object v0, v0, Lg1/c$c;->d:Lg1/c$l;

    check-cast v0, Lg1/c$m;

    invoke-virtual {v0}, Lg1/c$m;->a()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v1, v0}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
