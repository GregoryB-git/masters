.class public final Lg/g$m$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg/g$m;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg/g$m;


# direct methods
.method public constructor <init>(Lg/g$m;)V
    .locals 0

    iput-object p1, p0, Lg/g$m$a;->a:Lg/g$m;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lg/g$m$a;->a:Lg/g$m;

    invoke-virtual {p1}, Lg/g$m;->d()V

    return-void
.end method
